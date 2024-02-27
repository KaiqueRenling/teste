package br.com.plm.mdm.steps.PLM;


import br.com.plm.mdm.interactions.PLM.CriarSampleItemInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;


public class CriarSampledoItem extends CriarSampleItemInteractions {

    private final RennerTest test;
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public CriarSampledoItem(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("Crio Sample do item")
    public void crioSampleDoItem_() throws Exception {

        try {
            criarSampledoItem_();
            test.createTestStep("Criar", "Sample do item");
            utils.TakeScreenShot("Sucesso-SampledoItem.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_aprovacao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

}
