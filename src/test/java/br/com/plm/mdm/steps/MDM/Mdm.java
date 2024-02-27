package br.com.plm.mdm.steps.MDM;

import br.com.plm.mdm.interactions.MDM.AprovarRejeitarStyleMdmInteractions;
import br.com.plm.mdm.interactions.MDM.MdmLoginInteractions;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.FilesOperation;
import helpers.Utils;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import br.com.plm.mdm.steps.Common;

import java.io.IOException;

import static helpers.Utils.tirarPrint;
import static br.com.plm.mdm.steps.Common.*;

public class Mdm extends AprovarRejeitarStyleMdmInteractions {

    private final RennerTest test;
    MdmLoginInteractions loginmdm = new MdmLoginInteractions();
    IRNRobotsTool driverWEB = seleniumRobotsTool;
    Utils utils;

    public Mdm(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, directoryName);
    }

    @Dado("que logo no MDM e")
    public void
    queLogoNoMDME() throws IOException {
        try {
            loginmdm.siteRennerMdm();
            loginmdm.loginMdm();
            test.createTestStep("Logar MDM", "");
            utils.TakeScreenShot("Sucesso-LogarMDM.jpg", test);
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-login.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Aprovo Style no MDM")
    public void aprovoStyleNoMDM() throws IOException {
        try {
            test.createTestStep("Aprovar Style MDM", "");
            utils.TakeScreenShot("Sucesso-AprovarStyleMDM.jpg", test);
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AprovarStyleMDM.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("Começo a rejeitar Style MDM")
    public void rejeitoStyleMDM() throws IOException {
        try {
            rejeitarStyleMdm();
            test.createTestStep("Rejeitar Style MDM", "");
            utils.TakeScreenShot("Sucesso-Rejeitar-Style-MDM.jpg", test);
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-Rejeitar-Style-MDM.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Rejeito Style no MDM")
    public void rejeitoStyleNoMDM() throws IOException {
        try {
            test.createTestStep("Rejeitar Style MDM", "");
            utils.TakeScreenShot("Sucesso-RejeitarStyleMDM.jpg", test);
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-RejeitarStyleMDM.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("que logo no MDM e espero dois minutos")
    public void
    queLogoNoMDMeEspero() throws IOException {
        try {
            Thread.sleep(120000);
            loginmdm.siteRennerMdm();
            loginmdm.loginMdm();
            test.createTestStep("Logar MDM", "");
            utils.TakeScreenShot("Sucesso-LogarMDM", test);
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-login", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("Aprovar Style MDM")
    public void aprovarStyleMDM() throws IOException {
        try {
            aprovarStyleMdm();
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(scenario, "Link MDM: " + driver.getCurrentUrl());
            FilesOperation filesOperation = new FilesOperation();
            String codItemPLM = filesOperation.getProperties("itensParaAprovacao").getProperty("ID");
            Utils.addLog(scenario, "ID Produto PLM: " + codItemPLM);
            test.createTestStep("Aprovar Style MDM", "");
            utils.TakeScreenShot("Sucesso-AprovarStyleMDM", test);
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AprovarStyleMDM", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());
        }
    }

}
