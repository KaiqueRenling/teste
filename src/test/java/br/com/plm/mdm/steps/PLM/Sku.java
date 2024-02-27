package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.SkuInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class Sku extends SkuInteractions {

    private final RennerTest test;
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public Sku(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("adiciono os SKUs")
    public void adicionarSkus() throws Exception {
        try {
            test.createTestStep("SKUs", "Adicionar SKUs no item novo");
            adicionarSku();
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Skus", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("adiciono as cores e clusters")
    public void adicionarCorClusters() throws Exception {
        try {
            test.createTestStep("Cor e Clusters", "Adicionar Cor e Clusters");
            adicionarCorEClusters();
            utils.TakeScreenShot("Sucesso_cor_clusters", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_cor_clusters", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("adiciono os SKUs para um item criado a partir do existente")
    public void adicionarSkusExistente() throws Exception {
        try {
            test.createTestStep("Adicionar SKUs", "Adicionar SKUs");
            adicionarSkuExistente();
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Adicionar-SKUs", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("adicionar supplier a um item criado a partir do existente")
    public void adicionarSupplierAUmItemCriadoAPartirDoExistente() throws IOException {
        try {
            test.createTestStep("Supplier", "Adicionar Supplier");
            adicionarSupplier();
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_add_supplier", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("adiciono as cores e clusters variavel {string} {string} {string}")
    public void adicionoAsCoresEClustersVariavel(String cor1, String cor2, String cor3) throws IOException {
        try {
            test.createTestStep("Cor e Clusters", "Adicionar Cor e Clusters");
            adicionarCorEClustersVariavel(cor1, cor2, cor3);
            utils.TakeScreenShot("Sucesso_cor_clusters", test);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_cor_clusters", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("adiciono as cores e clusters variavel acessorios {string} {string} {string}")
    public void adicionoAsCoresEClustersVariavelAcessorios(String cor1, String cor2, String cor3) throws IOException {
        try {
            test.createTestStep("Cor e Clusters", "Adicionar Cor e Clusters");
            adicionarCorEClustersVariavelAcessorios(cor1, cor2, cor3);
            utils.TakeScreenShot("Sucesso_cor_clusters", test);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_cor_clusters", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }


    @Entao("validar skus criados no plm mdm e rms")
    public void validoSkusCriadosNoPlmMdmERms() throws IOException {
        try {
            Thread.sleep(120000);
            validarSkusCriadosPlmMdmRms();
            test.createTestStep("Cor e Clusters", "Validar Skus PLM MDM RMS");
            utils.TakeScreenShot("Sucesso_Validar_Skus_PLM_MDM_RMS", test);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Validar_Skus_PLM_MDM_RMS", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }
}
