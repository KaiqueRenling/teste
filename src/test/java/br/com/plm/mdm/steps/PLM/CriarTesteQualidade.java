package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.CriarTesteQualidadeInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.an.E;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class CriarTesteQualidade extends CriarTesteQualidadeInteractions {

    private final RennerTest test;
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public CriarTesteQualidade(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("Crio teste de qualidade")
    public void criarTesteQualidade() throws IOException {
        try {
            CriarTesteQualidade_();
            test.createTestStep("TesteQualidade", "");
            utils.TakeScreenShot("Sucesso-TesteQualidade.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-Criar-TesteQualidade.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());

        }
    }
}
