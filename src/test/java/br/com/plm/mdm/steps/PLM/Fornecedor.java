package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.FornecedorInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class Fornecedor extends FornecedorInteractions {

    private final RennerTest test;
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public Fornecedor(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("seleciono um fornecedor {string} {string} {string}")
    public void selecionoFornecedorApartirDoInformado(String fornecedor, String reservafornecdor, String precofornecedor) throws Exception {
        try {
            adicionarFornecedorVariavel(fornecedor, reservafornecdor, precofornecedor);
            test.createTestStep("Fornecedor", "Selecionar fornecedor");
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_fornecedor", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("seleciono o fornecedor, informando {string} {string} {string}")
    public void selecionarFornecedor(String fornecedor, String reservafornecedor, String precofornecedor) throws Exception {
        try {
            adicionarFornecedor(fornecedor, reservafornecedor, precofornecedor);
            test.createTestStep("Fornecedor", "Selecionar fornecedor");
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_fornecedor", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }
}
