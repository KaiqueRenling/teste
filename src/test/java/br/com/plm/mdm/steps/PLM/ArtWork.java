package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.ArtWorkIntercations;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class ArtWork extends ArtWorkIntercations {

    private final RennerTest test;
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public ArtWork(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("crio ArtWork")
    public void crioArtWork() throws Exception {

        try {
            criarArtWork();
            test.createTestStep("ArtWork", "Aprovar ArtWork");
            utils.TakeScreenShot("Sucesso-ACriaçãoArtWork.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_aprovacao.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

}
