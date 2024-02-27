package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.CriarSupplierRequestInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import br.com.plm.mdm.interactions.PLM.PlmLoginPageInteractions;
import io.cucumber.java.pt.E;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class CriarSupplierRequest extends CriarSupplierRequestInteractions {

    private final RennerTest test;
    PlmLoginPageInteractions login = new PlmLoginPageInteractions();
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public CriarSupplierRequest(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }


    @E("Crio Supplier Request Ficha Analise de Modelagem")
    public void criarSupplierRequestFichaAnaliseModelagen() throws IOException {
        try {
            criarSupplierRequest_FichaAnaliseDeModelagem();
            test.createTestStep("criarSupplierRequestFichaAnaliseModelagen", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoSupplierRequestFichaAnaliseModelagen.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-Criar-SupplierRequestFichaAnaliseModelagen.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @E("Crio Supplier Request Ficha Tecnica Amostra")
    public void criarSupplierRequestFichaTecnicaAmostra() throws IOException {
        try {
            criarSupplierRequest_FichaTecnicaAmostra();
            test.createTestStep("criarSupplierRequestFichaTecnicaAmostra", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoSupplierRequestFichaTecnicaAmostra.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-Criar-SupplierRequestFichaTecnicaAmostra.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @E("Crio Supplier Request Techinical Pack and Sample")
    public void criarSupplierRequestTechinicalPackandSample() throws IOException {
        try {
            criarSupplierRequest_TechinicalPackandSample();
            test.createTestStep("criarSupplierRequestTechinicalPackandSample", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoSupplierRequestTechinicalPackandSample.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-Criar-SupplierRequestTechinicalPackandSample.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

}
