package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.FilesOperation;
import helpers.Utils;
import br.com.plm.mdm.interactions.PLM.AprovarItemInteractions;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class AprovarItem extends AprovarItemInteractions {

    private final RennerTest test;
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public AprovarItem(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("aprovo o item")
    public void selecionaraprovacao() throws Exception {
        try {
            test.createTestStep("Aprovar", "Selecionar aprovação de item novo");
            aprovarItem();
            driverWEB.waitObject(infoPlmId, 20);
            Utils.addLog(Common.scenario, "ID PLM: " + driverWEB.getText(infoPlmId));
            FilesOperation filesOperation = new FilesOperation();
            filesOperation.setProperties("itensParaAprovacao", "ID", driverWEB.getText(infoPlmId));
            utils.TakeScreenShot("Sucesso_aprovacao", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "ID PLM: " + driverWEB.getText(infoPlmId));
            Utils.addLog(Common.scenario, "URL Item: https://lr-staging1.centricsoftware.com/WebAccess/home.html#URL=" + driverWEB.getText(infoPlmId) + "&NR=1&RPURL=&RURL=&RightPane=&Tab=Properties");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_aprovacao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("aprovo o item criado a partir do existente")
    public void selecionaraprovacaoItemApartirDoExistente() throws Exception {
        try {
            test.createTestStep("Aprovar", "Selecionar aprovação de item criado a partir do existente");
            aprovarItemExistente();
            //getInfo();
            driverWEB.waitObject(infoPlmId, 10);
            Utils.addLog(Common.scenario, "ID PLM: " + driverWEB.getText(infoPlmId));
            FilesOperation filesOperation = new FilesOperation();
            filesOperation.setProperties("itensParaAprovacao", "ID", driverWEB.getText(infoPlmId));
            Utils.addLog(Common.scenario, "URL Item: https://lr-staging1.centricsoftware.com/WebAccess/home.html#URL=" + driverWEB.getText(infoPlmId) + "&NR=1&RPURL=&RURL=&RightPane=&Tab=Properties");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("Sucesso_aprovacao", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_aprovacao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("aprovo o item criado a partir do existente issue")
    public void selecionaraprovacaoItemApartirDoExistenteIssue() throws Exception {
        try {
            test.createTestStep("Aprovar", "Selecionar aprovação de item criado a partir do existente");
            aprovarItemExistenteIssue();
            //getInfo();
            driverWEB.waitObject(infoPlmId, 12);
            Utils.addLog(Common.scenario, "ID PLM: " + driverWEB.getText(infoPlmId));
            FilesOperation filesOperation = new FilesOperation();
            filesOperation.setProperties("itensParaAprovacao", "ID", driverWEB.getText(infoPlmId));
            Utils.addLog(Common.scenario, "URL Item: https://lr-staging1.centricsoftware.com/WebAccess/home.html#URL=" + driverWEB.getText(infoPlmId) + "&NR=1&RPURL=&RURL=&RightPane=&Tab=Properties");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("Sucesso_aprovacao", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_aprovacao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("aprovo o item na view feminino criado a partir do existente")
    public void aprovoOItemNaViewFemininoCriadoAPartirDoExistente() throws Exception {
        try {
            test.createTestStep("Aprovar", "Selecionar aprovação de item criado a partir do existente");
            aprovarItemExistente();
            //getInfo();
            driverWEB.waitObject(infoPlmId, 12);
            Utils.addLog(Common.scenario, "ID PLM: " + driverWEB.getText(infoPlmId));
            FilesOperation filesOperation = new FilesOperation();
            filesOperation.setProperties("itensParaAprovacao", "ID", driverWEB.getText(infoPlmId));
            Utils.addLog(Common.scenario, "URL Item: https://lr-staging1.centricsoftware.com/WebAccess/home.html#URL=" + driverWEB.getText(infoPlmId) + "&NR=1&RPURL=&RURL=&RightPane=&Tab=Properties");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("Sucesso_aprovacao", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_aprovacao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }


}
