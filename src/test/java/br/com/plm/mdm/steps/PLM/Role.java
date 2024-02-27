package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.PlmRoleInteractions;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import org.junit.Assert;
import br.com.plm.mdm.steps.Common;

import java.io.IOException;

import static helpers.Utils.tirarPrint;
import static br.com.plm.mdm.steps.Common.*;

public class Role extends PlmRoleInteractions {

    private final RennerTest test;
    IRNRobotsTool driverWEB = seleniumRobotsTool;
    Utils utils;

    public Role(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, directoryName);
    }

    @E("que altero role opp no PLM")
    public void roleOppPlm() throws Exception {
        try {
            test.createTestStep("Role", "Alterar Role");
            Thread.sleep(7000);
            roleOpp();
            Utils.tirarPrint(scenario, "Role com sucesso");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Role.jpg", test);
            test.fail("FALHA: " + ex);
            ex.printStackTrace();
            Assert.fail(ex.getMessage());
        }
    }

    @E("que altero role produto beleza no PLM")
    public void roleProdutoBelezaPlm() throws Exception {
        try {
            test.createTestStep("Role", "Alterar Role");
            Thread.sleep(7000);
            roleProdutoBeleza();
            Utils.tirarPrint(scenario, "Role com sucesso");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Role.jpg", test);
            test.fail("FALHA: " + ex);
            ex.printStackTrace();
            Assert.fail(ex.getMessage());

        }
    }
}
