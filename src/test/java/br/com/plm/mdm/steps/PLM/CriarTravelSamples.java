package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.CriarTravelSamplesInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class CriarTravelSamples extends CriarTravelSamplesInteractions {

    private final RennerTest test;
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public CriarTravelSamples(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("crio travel samples")
    public void criarTravelSamples() throws IOException {
        try {
            criarTravelSamples_();
            test.createTestStep("CriarTravelSamples", "");
            utils.TakeScreenShot("Sucesso-CriarTravelSamples.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-Criar-TravelSamples.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());

        }
    }

    @E("Adicionar Sample a Travel Samples")
    public void adicionarSampleTravelSamples() throws IOException {
        try {
            adicionarSampleATravelSamples();
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("AdicionarSampleATravelSamples", "");
            utils.TakeScreenShot("Sucesso-AdicionarSampleTravelSamples.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AdicionarSample-TravelSamples.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());

        }
    }
}
