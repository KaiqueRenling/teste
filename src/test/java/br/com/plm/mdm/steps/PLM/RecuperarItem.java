package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import br.com.plm.mdm.interactions.PLM.PlmLoginPageInteractions;
import br.com.plm.mdm.interactions.PLM.RecupearItemInteractions;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class RecuperarItem extends RecupearItemInteractions {

    PlmLoginPageInteractions login = new PlmLoginPageInteractions();
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;


    Utils utils;    private final RennerTest test;

    public RecuperarItem(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("começo a recupear item")
    public void recurarItem() throws IOException {
        try {
            recuperarItem();
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            utils.TakeScreenShot("Sucesso-RecuperarItem", test);
            test.createTestStep("RecuperarItem", "");
            Utils.tirarPrint(Common.scenario);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-RecuperarItem", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());
        }
    }


    @Entao("recupero item")
    public void recuperoItem() throws IOException {
        try {
            utils.TakeScreenShot("Sucesso-RecuperarItem", test);
            test.createTestStep("RecuperarItem", "");
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-RecuperarItem", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

}
