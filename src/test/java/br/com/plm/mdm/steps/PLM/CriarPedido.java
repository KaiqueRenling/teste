package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.CriarPedidoCompraInteractions;
import br.com.plm.mdm.interactions.PLM.PlmLoginPageInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class CriarPedido extends CriarPedidoCompraInteractions {

    private final RennerTest test;
    PlmLoginPageInteractions login = new PlmLoginPageInteractions();
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public CriarPedido(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("Criar Pedido split SKU {string}")
    public void criarPedidoSplitSKUNew(String itemPaiCode) throws Exception {
        try {
            criarPedidoSplitSKU_New(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar criar Pedido Split SKU", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarPedidoSplitSKU", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoSplitSKU", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @Entao("Criei Pedido split SKU")
    public void criarPedidoSplitSKU() throws Exception {
        try {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            utils.TakeScreenShot("CrieiPedidoSplitSKU", test);
            test.createTestStep("Criei Pedido Split SKU", "");
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoSplitSKU", test);
            test.fail("FALHA: " + ex);
            aprovarPedido();
            Assert.fail(ex.getMessage());

        }
    }

    @E("Criar pedido nacional SKU New {string}")
    public void criarPedidoNacionalSKUNew(String itemPaiCode) throws Exception {
        try {
            criarPedidoNacionalSKU_New(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Criar Pedido Nacional SKU", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarPedidoNacionalSKU", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoNacionalSKU", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());
        }
    }

    @E("Criar Issue pedido Br SKU {string}")
    public void criarIssuePedidoBrSKUNew(String itemPaiCode) throws Exception {
        try {
            criarIssuePedidoBrSKU(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Criar Issue Pedido Br SKU", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarIssuePedidoBrSKU", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarIssuePedidoBrSKU", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());
        }
    }

    @E("Criar pedido nacional SKU Resto {string}")
    public void criarPedidoNacionalSKURestoo(String itemPaiCode) throws Exception {
        try {
            criarPedidoNacionalSKUResto(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Criar Pedido Nacional SKU Resto", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarPedidoNacionalSKUResto", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoNacionalSKUResto", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());
        }
    }

    @E("Criar pedido importado Rms Latam Sku New {string}")
    public void criarPedidoImportadoRmsLatamSkuNew(String itemPaiCode) throws Exception {
        try {
            criarPedidoImportadoRmsLatamSku_New(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Criar Pedido Importado SKU", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarPedidoImportadoSKU", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoImportadoSKU", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Criar pedido importado Sku Resto {string}")
    public void criarPedidoImportadoSkuRestoo(String itemPaiCode) throws Exception {
        try {
            criarPedidoImportadoSkuResto(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Criar Pedido Importado SKU Resto", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarPedidoImportadoSKUresto", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoImportadoSKUResto", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Criar pedido importado Rms Br Sku New {string}")
    public void criarPedidoImportadoRmsBrSkuNew(String itemPaiCode) throws Exception {
        try {
            criarPedidoImportadoRmsBrSku_New(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Criar Pedido Importado SKU", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarPedidoImportadoSKU", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoImportadoSKU", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Criar pedido nacional Pack new {string}")
    public void criarPedidoNacionalPackNew(String itemPaiCode) throws Exception {
        try {
            criarPedidoNacionalPack_New(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Criar Pedido Nacional PACK", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarPedidoNacionalPack", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoNacionalPack", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Conversao pedido Br Pack em Sku {string}")
    public void conversaoPedidoBrPackparaSku(String itemPaiCode) throws Exception {
        try {
            conversaoPedidoPackSku(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Conservao Pedido Br PACK em SKU", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("ConservaoPedidoBrPACKemSKU", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-ConservaoPedidoBrPACKemSKU", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Conversao pedido Br Sku em Pack {string}")
    public void conversaoPedidoBrSkuparaPack(String itemPaiCode) throws Exception {
        try {
            conversaoPedidoSkuPack(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Conservao Pedido Br PACK em SKU", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("ConservaoPedidoBrPACKemSKU", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-ConservaoPedidoBrPACKemSKU", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Alterar pedido nacional Pack {string}")
    public void alterarPedidoNacionalPack(String itemPaiCode) throws Exception {
        try {
            alterarPedidoBrPack(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Alterar Pedido Nacional PACK", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("AlterarPedidoNacionalPack", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoNacionalPack", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Alterar Pedido split Pack {string}")
    public void alterarPedidoSplitPack_(String itemPaiCode) throws Exception {
        try {
            alterarrPedidooSplitPack(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Alterar Pedido Split Pack", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("AlterarPedidoSplitPack", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoSplitPack", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());
        }
    }

    @E("Crio Pedido split Pack {string}")
    public void criarPedidoSplitPackNew(String itemPaiCode) throws Exception {
        try {
            criarPedidoSplitPack_New(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar criar Pedido Split Pack", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarPedidoSplitPack", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoSplitPack", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Criei Pedido split PACK")
    public void criarPedidoSplitPack() throws Exception {
        try {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            utils.TakeScreenShot("CrieiPedidoSplitPACK", test);
            test.createTestStep("Criei Pedido Split PACK", "");
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoSplitPACK", test);
            test.fail("FALHA: " + ex);
            aprovarPedido();
            Assert.fail(ex.getMessage());

        }
    }

    @E("Criar pedido importado Pack Rms Br {string}")
    public void criarPedidoImportadoPackRmsBr(String itemPaiCode) throws Exception {
        try {
            criarPedidoImportadoPack_RmsBr(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Criar Pedido Importado Pack", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarPedidoImportadoPack", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoImportadoPack", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Alterar pedido importado Pack Rms Latam {string}")
    public void alterarPedidoImportadoPackRmsLatam(String itemPaiCode) throws Exception {
        try {
            alterarPedidoLatamPackRmsLatam(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Alterar Pedido Importado Pack", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("AlterarPedidoImportadoPack", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoImportadoPack", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Alterar pedido importado Sku Rms Latam {string}")
    public void alterarPedidoImportadoSkuRmsLatam(String itemPaiCode) throws Exception {
        try {
            alterarPedidoLatamSkuRmsLatam(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Alterar Pedido Importado Sku", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("AlterarPedidoImportadoSku", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoImportadoSku", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Alterar pedido Split Sku {string}")
    public void alterarPedidoSplitSku(String itemPaiCode) throws Exception {
        try {
            alterarPedidooSplitSku(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Alterar Pedido Importado Pack", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("AlterarPedidoImportadoPack", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoImportadoPack", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Alterar pedido importado Sku Rms Br {string}")
    public void alterarPedidoImportadoSkuRmsBr(String itemPaiCode) throws Exception {
        try {
            alterarPedidoLatamSkuRmsBr(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Alterar Pedido Importado Sku", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("AlterarPedidoImportadoSku", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoImportadoSku", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Alterar pedido Sku Br {string}")
    public void alterarPedidoSkuBr(String itemPaiCode) throws Exception {
        try {
            alterarPedidooSkuBr(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Alterar Pedido Br Sku", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("AlterarPedidoBrSku", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoBrSku", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @E("Criar pedido importado Pack Rms Latam {string}")
    public void criarPedidoImportadoPackRmsLatam(String itemPaiCode) throws Exception {
        try {
            criarPedidoImportadoPack_RmsLatam(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar Criar Pedido Importado Pack", "");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("CriarPedidoImportadoPack", test);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoImportadoPack", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());

        }
    }

    @Quando("crio pedido com variaveis {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void crioPedidoSkuComVariaveis(String itemPai, String pack, String grupoCores, String grupoCor, String ano, String semanaComercial, String wareHouseStor, String poModel, String quantidadesPorTamanhoPP, String quantidadesPorTamanhoP, String quantidadesPorTamanhoM, String quantidadesPorTamanhoG, String OrderCase, String packQuantity) throws IOException {
        try {
            criarPedido(itemPai, pack, grupoCores, grupoCor, ano, semanaComercial, wareHouseStor, poModel, quantidadesPorTamanhoPP, quantidadesPorTamanhoP, quantidadesPorTamanhoM, quantidadesPorTamanhoG, OrderCase, packQuantity);
            test.createTestStep("SKUs", "Adicionar SKUs no item novo");
            utils.TakeScreenShot("Sucesso_CriarPedido", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_CriarPedido", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Criei um pedido")
    public void crieiUmPedido() throws IOException {
        try {
            test.createTestStep("Pedido", "Criei pedido com Sucesso");
            utils.TakeScreenShot("Sucesso_CriarPedido", test);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_CriarPedido", test);
            test.fail("FALHA: " + ex);
            Utils.tirarPrint(Common.scenario);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("pedido importado Pack")
    public void pedidoImportadoPack() throws IOException {
        try {
            test.createTestStep("Pedido", "Criei pedido com Sucesso");
            utils.TakeScreenShot("Sucesso_CriarPedidoImportadoPack", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_CriarPedidoImportadoPack", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("criei pedido importado SKU")
    public void crieiPedidoImportadoSKU() throws IOException {
        try {
            test.createTestStep("Pedido", "Criei pedido com Sucesso");
            utils.TakeScreenShot("Sucesso_CriarPedidoImportadoSku", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_CriarPedidoImportadoSku", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Criei peido nacional pack")
    public void crieiPeidoNacionalPack() throws IOException {
        try {
            test.createTestStep("Pedido", "Criei pedido com Sucesso");
            utils.TakeScreenShot("Sucesso_CriarPedidoNacionalPack", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_CriarPedidoNacionalPack", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Criei um pedido nacional pack")
    public void crieiUmPedidoNacionalPack() throws IOException {
        try {
            test.createTestStep("Comecar Criar Pedido Nacional Pack", "");
            utils.TakeScreenShot("CriarPedidoNacionalPack.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoNacionalPack.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }


    @Entao("Converti um pedido br pack em sku")
    public void convertiUmPedidoBrPackEmSku() throws IOException {
        try {
            test.createTestStep("Conservao Pedido Br Pack em SKU", "");
            utils.TakeScreenShot("ConservaoPedidoBrPackemSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            //utils.TakeScreenShot("Falha-.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Converti um pedido br sku em pack")
    public void convertiUmPedidoBrSkuEmPack() throws IOException {
        try {
            test.createTestStep("Conservao Pedido Br SKU em PACK", "");
            utils.TakeScreenShot("ConservaoPedidoBrSKUemPACK.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            //utils.TakeScreenShot("Falha-ConservaoPedidoBrSKUemPACK.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Criei um pedido nacional sku")
    public void crieiUmPedidoNacionalSku() throws IOException {
        try {
            test.createTestStep("Comecar Criar Pedido Nacional SKU", "");
            utils.TakeScreenShot("CriarPedidoNacionalSKU.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoNacionalSKU.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Criei uma issue de um pedido br sku")
    public void crieiUmaIssuePedidoBrSku() throws IOException {
        try {
            test.createTestStep("Comecar Criar Issue de um Pedido Br SKU", "");
            utils.TakeScreenShot("CrieiUmaIssuePedidoBrSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarUmaIssuePedidoBrSku.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Criei um pedido split pack")
    public void crieiUmPedidoSplitPack() throws IOException {
        try {
            test.createTestStep("Comecar criar Pedido Split Pack", "");
            utils.TakeScreenShot("CriarPedidoSplitPack.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoSplitPack.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @Entao("Criei um pedido split sku")
    public void crieiUmPedidoSplitSku() throws IOException {
        try {
            test.createTestStep("Comecar criar Pedido Split Sku", "");
            utils.TakeScreenShot("CriarPedidoSplitSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoSplitSku.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("Criei um pedido importado pack")
    public void crieiUmPedidoImportadoPack() throws IOException {
        try {
            test.createTestStep("Comecar Criar Pedido Importado Pack", "");
            utils.TakeScreenShot("CriarPedidoImportadoPack.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoImportadoPack.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @Entao("Alterei um pedido br pack")
    public void altereiUmPedidoBrPack() throws IOException {
        try {
            test.createTestStep("Comecar Criar Pedido Br Pack", "");
            utils.TakeScreenShot("AltereiPedidoBrPack.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoBrPack.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @Entao("Alterei um pedido br sku")
    public void altereiUmPedidoBrSku() throws IOException {
        try {
            test.createTestStep("Comecar Criar Pedido Br Sku", "");
            utils.TakeScreenShot("AltereiPedidoBrSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoBrSku.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }


    @Entao("Alterei um pedido importado rms br pack")
    public void altereiUmPedidoImportadoPack() throws IOException {
        try {
            test.createTestStep("Comecar Alterar Pedido Importado Pack", "");
            utils.TakeScreenShot("AltereiPedidoImportadoPack.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoImportadoPack.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @Entao("Alterei um pedido importado rms br sku")
    public void altereiUmPedidoImportadoSku() throws IOException {
        try {
            test.createTestStep("Comecar Alterar Pedido Importado Sku", "");
            utils.TakeScreenShot("AltereiPedidoImportadosku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoImportadoSku.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @Entao("Alterei um pedido importado rms latam sku")
    public void altereiUmPedidoImportadoSkuLatam() throws IOException {
        try {
            test.createTestStep("Comecar Alterar Pedido Importado Latam Sku", "");
            utils.TakeScreenShot("AltereiPedidoImportadoLatamsku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoImportadoLatamSku.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @Entao("Alterei um pedido Split Sku")
    public void altereiUmPedidoSpltSku() throws IOException {
        try {
            test.createTestStep("Comecar Alterar Pedido Split Sku", "");
            utils.TakeScreenShot("AltereiPedidoSplitSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoSplitSku.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @Entao("Alterei um pedido split pack")
    public void altereiUmPedidoSplitPack() throws IOException {
        try {
            test.createTestStep("Comecar Alterar Pedido Split Pack", "");
            utils.TakeScreenShot("AltereiPedidoSplitPack.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AlterarPedidoSplitPack.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @Entao("Criei um pedido importado sku")
    public void crieiUmPedidoImportadoSku() throws IOException {
        try {
            test.createTestStep("Comecar Criar Pedido Importado Sku", "");
            utils.TakeScreenShot("CriarPedidoImportadoSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoImportadoSku.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }
}

