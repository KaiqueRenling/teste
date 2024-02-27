package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import br.com.plm.mdm.interactions.PLM.PlmLoginPageInteractions;
import io.cucumber.java.pt.E;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class Login {

    private final RennerTest test;
    PlmLoginPageInteractions login = new PlmLoginPageInteractions();
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public Login(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("que logo no PLM")
    public void logarPlm() throws Exception {
        try {
            test.createTestStep("Login", "Realizar Login");
            login.siteRennerPlm();
            login.login();
            Utils.tirarPrint(Common.scenario, "Logou com sucesso");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Login.jpg", test);
            test.fail("FALHA: " + ex);
            ex.printStackTrace();
            Assert.fail(ex.getMessage());
        }
    }


}
