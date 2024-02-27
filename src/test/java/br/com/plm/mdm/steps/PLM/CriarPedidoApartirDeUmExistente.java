package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.CriarPedidoCompraApartirDeUmExistenteInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class CriarPedidoApartirDeUmExistente extends CriarPedidoCompraApartirDeUmExistenteInteractions {

    private final RennerTest test;
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public CriarPedidoApartirDeUmExistente(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("Crio pedido importado pack a partir de um pedido um existente {string}")
    public void criarPedidoImportadoPackAPartirDeUmPedidoUmExistente(String itemPaiCode) throws Exception {
        try {
            criarPedidoApartirDoExistenteImportadoPack(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar criar Copia Pedido Importado Pack", "");
            utils.TakeScreenShot("CriarCopiaPedidoImportadoPack.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            utils.TakeScreenShot("Falha-CriarCopiaPedidoImportadoPack.jpg", test);
            test.fail("FALHA: " + ex);
            aprovarPedido();
            Assert.fail(ex.getMessage());
        }
    }

    @E("Criar pedido nacional sku a partir de um pedido um existente new")
    public void criarPedidoNacionalSkuAPartirDeUmPedidoUmExistenteNew(String itemPaiCode) throws Exception {
        try {
            criarPedidoApartirDoExistenteBrSKUNew(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar criar Copia Pedido Nacional SKU", "");
            utils.TakeScreenShot("CriarCopiaPedidoNacionalSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            utils.TakeScreenShot("Falha-CriarCopiaPedidoNacionalSku.jpg", test);
            test.fail("FALHA: " + ex);
            aprovarPedido();
            Assert.fail(ex.getMessage());

        }
    }

    @E("Crio pedido importado sku a partir de um pedido um existente new {string}")
    public void criarPedidoImportadoSkuAPartirDeUmPedidoUmExistenteNew(String itemPaiCode) throws Exception {
        try {
            criarPedidoApartirDoExistenteImportadoSKUNew(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar criar Copia Pedido Importado SKU", "");
            utils.TakeScreenShot("CriarCopiaPedidoImportadoSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            utils.TakeScreenShot("Falha-CriarCopiaPedidoImportadoSku.jpg", test);
            test.fail("FALHA: " + ex);
            aprovarPedido();
            Assert.fail(ex.getMessage());
        }
    }


    @E("Crio pedido nacional sku a partir de um pedido um existente {string}")
    public void criarPedidoNacionalSkuAPartirDeUmPedidoUmExistente(String itemPaiCode) throws Exception {
        try {
            criarPedidoApartirDoExistenteBrSKUNew(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar criar Copia Pedido Importado SKU", "");
            utils.TakeScreenShot("CriarCopiaPedidoImportadoSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            utils.TakeScreenShot("Falha-CriarCopiaPedidoImportadoSku.jpg", test);
            test.fail("FALHA: " + ex);
            aprovarPedido();
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("crio pedido nacional sku")
    public void crioPedidoNacionalSku() throws IOException {
        try {
            test.createTestStep("Comecar criar Pedido Br SKU", "");
            utils.TakeScreenShot("CriarPedidobrSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoBrSku.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("crio pedido nacional pack")
    public void crioPedidoNacionalPack() throws IOException {
        try {
            test.createTestStep("Comecar criar Pedido Nacional Pack", "");
            utils.TakeScreenShot("CriarPedidoNacionalPack.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoNacionalPack.jpg", test);
            test.fail("FALHA: " + ex);
            Utils.addLog(Common.scenario, "");
        }

    }

    @Entao("criei pedido importado sku")
    public void crioPedidoImportadoSku() throws IOException {
        try {
            test.createTestStep("Comecar criar Pedido Importado SKU", "");
            utils.TakeScreenShot("CriarPedidoImportadoSku.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoImportadoSku.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("criei pedido importado pack")
    public void crioPedidoImportadoPack() throws IOException {
        try {
            test.createTestStep("Comecar criar Pedido Importado Pack", "");
            utils.TakeScreenShot("CriarPedidoImportadoPack.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPedidoImportadoPack.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("Criar pedido nacional pack a partir de um pedido um existente {string}")
    public void criarPedidoNacionalPackAPartirDeUmPedidoUmExistente(String itemPaiCode) throws Exception {
        try {
            criarPedidoApartirDoExistenteNacionalPack(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Comecar criar Pedido Nacional Pack", "");
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


}