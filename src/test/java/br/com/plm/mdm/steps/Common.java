package br.com.plm.mdm.steps;

import br.com.renner.report.RennerReport;
import br.com.renner.report.RennerReportBuilder;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.SeleniumRobotsTool;
import br.com.renner.robots.builder.SeleniumRobotsBuilder;
import com.perfecto.reportium.client.ReportiumClient;
import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.model.Job;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResultFactory;
import helpers.FilesOperation;
import helpers.Utils;
import io.cucumber.core.backend.TestCaseState;
import io.cucumber.java.*;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.Result;
import io.cucumber.plugin.event.TestCase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.joda.time.DateTime;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.*;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Common {
    public static String directoryName;
    public static SeleniumRobotsTool seleniumRobotsTool;
    public static String build = "";
    public static String scenarioName;
    public static Scenario scenario;
    public static RennerReport report;
    public static RennerTest test;
    public static WebDriver driverWEB;
    static PrintStream out;
    private final String executeOn = System.getProperty("local", FilesOperation.getSetupProperties().getProperty("EXECUTE_ON")).toLowerCase();
    ReportiumClient reportiumClient;
    private int indexStep = 0;

    public Common() throws IOException {
    }

    @BeforeAll
    public static void setupBeforeAll() throws FileNotFoundException {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        LocalDateTime now = LocalDateTime.now();
        directoryName = "test-output" + File.separator + "Evidences_" + dateFormat.format(now);
        File directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdir();
        }
        //Salvando system outputs para folder de evidências
        out = new PrintStream(new FileOutputStream(directory + File.separator + "ExecutionLogs.txt"));
        System.setOut(out);

        report = new RennerReportBuilder().newReport(directoryName + File.separator + "RNtestReport.html").build();
//        test = test.java.report.createTestCase(cenario, "");
    }

    @AfterAll
    public static void generateReport() {
        report.generate();
    }

    @Before()
    public void initiate(Scenario scenario) throws IOException {
        System.out.printf("TESTE %s is started%n", scenario.getName());
        Common.scenario = scenario;
        Common.scenarioName = scenario.getName().replaceAll("-", " ");
        test = report.createTestCase(scenarioName, "");
        System.out.println("--- Iniciando cenário [ " + scenarioName + " ]");
        if (build.isEmpty()) {
            build = "PLM-MDM-" + DateTime.now();
        }
        switch (executeOn) {
            default:
            case "chrome": {
                System.out.println("Chrome");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--window-size=1920,1080");

                WebDriverManager.chromedriver().setup();
                WebDriverManager.chromedriver().cachePath("src/test/resources/drivers");
                WebDriverManager.chromedriver().forceDownload();

                seleniumRobotsTool = new SeleniumRobotsBuilder().pollingSeconds(60).timeoutSeconds(30).pollingSeconds(5).setChromeOptions(chromeOptions).build();
                break;
            }
            case "edge": {
                SeleniumRobotsBuilder seleniumRobotsBuild = new SeleniumRobotsBuilder().pollingSeconds(60).timeoutSeconds(30).pollingSeconds(5).edge();
                WebDriverManager.edgedriver().setup();
                seleniumRobotsTool = seleniumRobotsBuild.build();
                break;
            }
            case "opera": {
                SeleniumRobotsBuilder seleniumRobotsBuild = new SeleniumRobotsBuilder().pollingSeconds(60).timeoutSeconds(30).pollingSeconds(5);
                WebDriverManager.operadriver().setup();
                seleniumRobotsTool = seleniumRobotsBuild.build();
                break;
            }
            case "firefox": {
                SeleniumRobotsBuilder seleniumRobotsBuild = new SeleniumRobotsBuilder().pollingSeconds(60).timeoutSeconds(30).pollingSeconds(5).firefox();

                WebDriverManager.firefoxdriver().setup();
                seleniumRobotsTool = seleniumRobotsBuild.build();
                break;
            }
            case "remote": {
                SeleniumRobotsBuilder seleniumRobotsBuild = new SeleniumRobotsBuilder().pollingSeconds(60).timeoutSeconds(30).pollingSeconds(5).remoteExec("http://localhost:4444/wd/hub").chrome();
                WebDriverManager.chromedriver().setup();
                HashMap<String, Object> chromePrefs = new HashMap<>();
                chromePrefs.put("profile.default_content_settings.popups", 0);
                chromePrefs.put("download.prompt_for_download", "false");
                chromePrefs.put("plugins.plugins_disabled", new String[]{"Adobe Flash Player", "Chrome PDF Viewer"});
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs", chromePrefs);
                options.addArguments("--lang=pt");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--aggressive-cache-discard");
                options.addArguments("--disable-cache");
                options.addArguments("--disable-application-cache");
                options.addArguments("--disable-offline-load-stale-cache");
                options.addArguments("--disk-cache-size=0");
                options.addArguments("--disable-gpu");
                options.addArguments("--dns-prefetch-disable");
                options.addArguments("--no-proxy-server");
                options.addArguments("--log-level=3");
                options.addArguments("--silent");
                options.addArguments("--disable-browser-side-navigation");
                options.setPageLoadStrategy(PageLoadStrategy.EAGER);
                options.setAcceptInsecureCerts(true);
                options.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
                options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                options.setProxy(null);
                System.setProperty("webdriver.chrome.silentOutput", "true");
                seleniumRobotsTool = seleniumRobotsBuild.setChromeOptions(options).build();
                break;
            }
            case "perfecto": {
                SeleniumRobotsBuilder seleniumRobotsBuild = new SeleniumRobotsBuilder().pollingSeconds(60).timeoutSeconds(30).pollingSeconds(5).remoteExec(System.getProperty("urlPerfecto", FilesOperation.getSetupProperties().getProperty("URL_PERFECTO"))).chrome();
                WebDriverManager.chromedriver().setup();


                HashMap<String, Object> chromePrefs = new HashMap<>();
                chromePrefs.put("profile.default_content_settings.popups", 0);
                chromePrefs.put("download.prompt_for_download", "false");
                chromePrefs.put("plugins.plugins_disabled", new String[]{"Adobe Flash Player", "Chrome PDF Viewer"});
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs", chromePrefs);
                options.addArguments("--lang=pt");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--aggressive-cache-discard");
                options.addArguments("--disable-cache");
                options.addArguments("--disable-application-cache");
                options.addArguments("--disable-offline-load-stale-cache");
                options.addArguments("--disk-cache-size=0");
                options.addArguments("--disable-gpu");
                options.addArguments("--dns-prefetch-disable");
                options.addArguments("--no-proxy-server");
                options.addArguments("--log-level=3");
                options.addArguments("--silent");
                options.addArguments("--disable-browser-side-navigation");
                options.setPageLoadStrategy(PageLoadStrategy.EAGER);
                options.setAcceptInsecureCerts(true);
                options.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
                options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                options.setCapability("platformName", "Windows");
                options.setCapability("platformVersion", "11");
                options.setCapability("browserName", "Chrome");
                options.setCapability("browserVersion", "latest");
                options.setCapability("location", "US East");
                options.setCapability("resolution", "1920x1080");
                // The below capability is mandatory. Please do not replace it.
                options.setCapability("securityToken", System.getProperty("urlToken", FilesOperation.getSetupProperties().getProperty("TOKEN_PERFECTO")));

                options.setProxy(null);
                System.setProperty("webdriver.chrome.silentOutput", "true");
                seleniumRobotsTool = seleniumRobotsBuild.setChromeOptions(options).build();

                String tags = String.join(", ", scenario.getSourceTagNames());
                indexStep = 0;
                if (reportiumClient == null) {
                    PerfectoExecutionContext perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder().withProject(new Project("PLM-MDM", "1.0.0")).withJob(new Job(build, Integer.parseInt(System.getProperty("buildNumber", "1")))).withWebDriver(seleniumRobotsTool.getDriver()).build();
                    reportiumClient = new ReportiumClientFactory().createPerfectoReportiumClient(perfectoExecutionContext);
                }

                reportiumClient.testStart(Common.scenarioName, new TestContext.Builder().withTestExecutionTags(tags).build());

                break;
            }
        }

        driverWEB = seleniumRobotsTool.getDriver();
        driverWEB.manage().window().maximize();
        driverWEB.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        int auxiliaryCounter = 0;
        ArrayList<String> scenarioTagList = (ArrayList<String>) scenario.getSourceTagNames();

        while (auxiliaryCounter <= (scenarioTagList.size() - 1)) {
            if (scenarioTagList.get(auxiliaryCounter).contains("Web_LojasRenner")) {

                BufferedWriter buffWrite = new BufferedWriter(new FileWriter("src/test/resources/configs/tagRegister.txt"));

                buffWrite.append(String.valueOf(scenarioTagList.get(auxiliaryCounter)));
                buffWrite.close();
                break;
            } else {
                auxiliaryCounter++;
            }
        }
    }

    @BeforeStep()
    public void beforeStep(Scenario scenario) {
        if (executeOn.equalsIgnoreCase("perfecto")) {

            reportiumClient.stepStart(getCurrentStep(scenario));
        }
    }

    public String getCurrentStep(Scenario scenario) {

        try {
            // Get the delegate from the scenario
            Field delegate = scenario.getClass().getDeclaredField("delegate");
            delegate.setAccessible(true);
            TestCaseState testCaseState = (TestCaseState) delegate.get(scenario);

            // Get the test case from the delegate
            Field testCaseField = testCaseState.getClass().getDeclaredField("testCase");
            testCaseField.setAccessible(true);
            TestCase testCase = (TestCase) testCaseField.get(testCaseState);

            List<PickleStepTestStep> testStepTitles = testCase.getTestSteps().stream().filter(step -> step instanceof PickleStepTestStep).map(step -> (PickleStepTestStep) step).collect(Collectors.toList());

            PickleStepTestStep stepTestStep = testStepTitles.get(indexStep);
            indexStep = indexStep + 1;
            return stepTestStep != null ? stepTestStep.getStep().getText() : "";
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return "";
    }

    @AfterStep()
    public void afterStep() {
        if (executeOn.equalsIgnoreCase("perfecto")) {
            reportiumClient.stepEnd();
        }
    }

    @After()
    public void tearDown(Scenario scenario) throws IOException {
        System.out.printf("TESTE %s is %s%n", scenario.getName(), scenario.getStatus().name());
        Utils.tirarPrint(scenario);
        if (executeOn.equalsIgnoreCase("perfecto")) {
            reportiumClient.testStop(scenario.isFailed() ? TestResultFactory.createFailure(getFailureMessage(scenario)) : TestResultFactory.createSuccess());

            String reportURL = reportiumClient.getReportUrl();
            System.out.println("Report URL - " + reportURL);
        }
        if (driverWEB != null) {
            driverWEB.quit();
            driverWEB = null;
        }
    }

    public String getFailureMessage(Scenario scenario) {
        Result failResult = null;

        try {
            // Get the delegate from the scenario
            Field delegate = scenario.getClass().getDeclaredField("delegate");
            delegate.setAccessible(true);
            TestCaseState testCaseState = (TestCaseState) delegate.get(scenario);

            // Get the test case results from the delegate
            Field stepResults = testCaseState.getClass().getDeclaredField("stepResults");
            stepResults.setAccessible(true);
            List<Result> results = (List<Result>) stepResults.get(testCaseState);

            for (Result result : results) {
                if (result.getStatus().name().equalsIgnoreCase("FAILED")) {
                    failResult = result;
                }
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return (failResult != null) ? failResult.getError().getMessage() : "";
    }

}
