package helpers;

import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    static WebDriver driver;
    IRNRobotsTool rnTool;
    String outputFolderPath;

    public Utils(IRNRobotsTool rnTool, String outputFolderPath) throws IOException {
        this.rnTool = rnTool;
        this.outputFolderPath = outputFolderPath;
        driver = (WebDriver) rnTool.getDriver();
    }

    public static void tirarPrint(Scenario scenario) {
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        final byte[] screen = scrShot.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screen, "image/png", scenario.getName());
    }

    public static void addLog(Scenario scenario, String mensagem) {
        System.out.println(mensagem);
        scenario.log(mensagem);
    }

    public static void tirarPrint(Scenario scenario, String msg) {
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        final byte[] screen = scrShot.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screen, "image/png", msg);
    }

    public void TakeScreenShot(String fileName) throws IOException {
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File SourceFile = scrShot.getScreenshotAs(OutputType.FILE);
        File TargetFile = new File(outputFolderPath + File.separator + fileName);
        FileUtils.copyFile(SourceFile, TargetFile);
    }

    public void TakeScreenShot(String fileName, RennerTest test) throws IOException {
        System.out.println("Capturando screenshot '" + fileName + "'");
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
        Date dateyearnow = new Date();
        String timesTamp = dateFormat.format(dateyearnow);
        fileName = fileName + timesTamp + ".jpg";

        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File SourceFile = scrShot.getScreenshotAs(OutputType.FILE);
        File TargetFile = new File(outputFolderPath + File.separator + fileName);
        FileUtils.copyFile(SourceFile, TargetFile);
        //String teste = System.getProperty("user.dir") + File.separator + outputFolderPath + File.separator + fileName;
        test.addScreenCaptureFromPath(System.getProperty("user.dir") + File.separator + outputFolderPath + File.separator + fileName);
    }

    public String WaitAndGetText(String locator, String expectedText, int attempts) throws Exception {
        int attempt = 0;
        String currentText = null;
        while (attempt < attempts) {
            currentText = rnTool.getText(locator);
            if (currentText.equals(expectedText)) {
                return currentText;
            } else {
                attempt++;
                System.out.println("Waiting for text '" + expectedText + "' attempt '" + attempt + "' of '" + attempts + "'");
                Thread.sleep(3000);
            }
        }
        return null;
    }
}