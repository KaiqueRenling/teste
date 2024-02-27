package br.com.plm.mdm.steps.PLM;

import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import br.com.plm.mdm.interactions.PLM.CriarPedidoComAmostraInteractions;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import br.com.plm.mdm.steps.Common;

import java.io.IOException;

import static helpers.Utils.tirarPrint;
import static br.com.plm.mdm.steps.Common.*;

public class CriarPedidoComAmostra extends CriarPedidoComAmostraInteractions {

    private final RennerTest test;
    IRNRobotsTool driverWEB = seleniumRobotsTool;
    Utils utils;

    public CriarPedidoComAmostra(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, directoryName);
    }

    @E("criar pedido BR Pack com Amostra {string}")
    public void criarPedidoBRPackComAmostra(String itemPaiCode) throws Exception {
        try {
            CriarPOBrPackComAmostra(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(scenario, "Link PLM: " + driver.getCurrentUrl());
            utils.TakeScreenShot("Sucesso-ACriaçãoDoPedidoBRPackComAmostra", test);
            test.createTestStep("criarPedidoBRPackComAmostra", "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-ACriaçãoDoPedidoBRPackComAmostra", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());
        }
    }

    @E("crio pedido BR SKU com Amostra {string}")
    public void criarPedidoBRSKUComAmostra(String itemPaiCode) throws Exception {
        try {
            CriarPOBrSkuComAmostra(itemPaiCode);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(scenario, "Link PLM: " + driver.getCurrentUrl());
            utils.TakeScreenShot("Sucesso-DoPedidoBRSKUComAmostra", test);
            test.createTestStep("criarPedidoBRSKUComAmostra", "");

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-DoPedidoBRSKUComAmostra", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());
        }
    }

    @Então("Criei pedido BR SKU")
    public void crieiPedidoBRSKU() throws IOException {
        try {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            utils.TakeScreenShot("Sucesso-DoPedidoBRSKUComAmostra", test);
            test.createTestStep("criarPedidoBRSKUComAmostra", "");
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-DoPedidoBRSKUComAmostra", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("criei pedido BR Pack com Amostra")
    public void crieiPedidoBRPackComAmostra() throws IOException {
        try {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            utils.TakeScreenShot("Sucesso-DoPedidoBRPackComAmostra", test);
            test.createTestStep("criarPedidoBRPackComAmostra", "");
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-DoPedidoBRPackComAmostra", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }


    @Entao("criar pedido BR Pack com Amostra")
    public void crioPedidoBRPackComAmostra() throws IOException {
        try {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            utils.TakeScreenShot("Sucesso-DoPedidoBRSKUComAmostra", test);
            test.createTestStep("criarPedidoBRSKUComAmostra", "");
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-DoPedidoBRSKUComAmostra", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("criei um pedido br pack com amostra")
    public void crieiUmPedidoBrPackComAmostra() throws IOException {
        try {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            utils.TakeScreenShot("Sucesso-DoPedidoBRPackComAmostra", test);
            test.createTestStep("criarPedidoBRPackComAmostra", "");
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, driver.getCurrentUrl());
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-DoPedidoBRPackComAmostra", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("criei um pedido br sku com amostra")
    public void crieiUmPedidoBrSkuComAmostra() throws IOException {
        try {
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            utils.TakeScreenShot("Sucesso-DoPedidoBRSKUComAmostra", test);
            test.createTestStep("criarPedidoBRSKUComAmostra", "");
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, driver.getCurrentUrl());
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-DoPedidoBRSKUComAmostra", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }
}
