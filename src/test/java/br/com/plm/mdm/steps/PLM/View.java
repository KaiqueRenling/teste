package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.ViewInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class View extends ViewInteractions {

    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    private final RennerTest test;

    public View(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("seleciono a view Composição")
    public void selecionarViewComposition() throws Exception {
        alterarView("Composition");
    }

    @E("seleciono a view cadastro de item")
    public void selecionarViewCadastroDeItem() throws Exception {
        alterarView("Cadastro de Item");
        Thread.sleep(2000);
    }

    @E("seleciono a view cadastro de item feminino")
    public void selecionarViewCadastroDeItemFeminino() throws Exception {
        alterarViewFeminino("Cadastro de Item Feminino");
        Thread.sleep(2000);
    }

    @E("seleciono a view cadastro de item beleza")
    public void selecionarViewCadastroDeItemBeleza() throws Exception {
        alterarViewBeleza("Cadastro de Item (Beleza)");
        Thread.sleep(4000);
    }

    @E("Seleciono view e filtro item para copiar {string} e {string}, {string} {string}")
    public void selecionoViewViewPlmEDataIncialDataFinal(String ViewPlm, String DataIncial, String DataFinal, String Brand) throws Exception {
        try {
            filtraSucessoData(ViewPlm, DataIncial, DataFinal, Brand);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("Seleciono view e filtro item acessorio para copiar {string} e {string}, {string} {string}")
    public void selecionoViewViewPlmEDataIncialDataFinalAcessorio(String ViewPlm, String DataIncial, String DataFinal, String Brand) throws Exception {
        try {
            filtraSucessoDataItemAcessorio(ViewPlm, DataIncial, DataFinal, Brand);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("Seleciono view e filtro item feminino para copiar {string} e {string}, {string} {string}")
    public void selecionoviewPLMEDataInicialDataFinalFeminino(String ViewPlm, String DataInicial, String DataFinal, String Brand) throws Exception {
        try {
            filtraSucessoDataItemFeminino(ViewPlm, DataInicial, DataFinal, Brand);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha, test");
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @E("Seleciono viewPlm, filtro o item e crio o pedido {string} e {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void selecionoViewEFiltroItemParaCriarPedidoViewPlmEDataIncialDataFinal(String ViewPlm, String pack, String viwerRennerPO, String anocor1, String semanaComercialcor1, String anocor2, String semanaComercialcor2, String anocor3, String semanaComercialcor3, String wareHouseStor, String poModel, String quantidadesPorTamanhoPP, String quantidadesPorTamanhoP, String quantidadesPorTamanhoM, String quantidadesPorTamanhoG, String quantidadesPorTamanhoGG, String OrderCase, String packQuantity, String itemPaiCode, String naoValidarOtb) throws Exception {
        try {
            filtraSucessoDataVariavel(ViewPlm, pack, viwerRennerPO, anocor1, semanaComercialcor1, anocor2, semanaComercialcor2, anocor3, semanaComercialcor3, wareHouseStor, poModel, quantidadesPorTamanhoPP, quantidadesPorTamanhoP, quantidadesPorTamanhoM, quantidadesPorTamanhoG, quantidadesPorTamanhoGG, OrderCase, packQuantity, itemPaiCode, naoValidarOtb);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, "Link PLM: " + driver.getCurrentUrl());
            test.createTestStep("Selecionar Viewer", "Selecionar Viewer de item criado a partir do existente");
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("Selecionar_viewer", test);

        } catch (Exception ex) {
            Utils.tirarPrint(Common.scenario);
            utils.TakeScreenShot("Falha", test);
            test.fail("FALHA: " + ex);
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            driver.getCurrentUrl();
            Utils.addLog(Common.scenario, driver.getCurrentUrl());
            Assert.fail(ex.getMessage());
        }
    }

    @E("selecionar a view cadastro de item")
    public void selecionarAViewCadastroDeItem() throws Exception {
        alterarVieww("Cadastro de Item");
    }

    @E("Seleciono view e filtro item infantil para copiar {string} e {string}, {string} {string}")
    public void selecionoviewPLMEDataInicialDataFinalInfantil(String ViewPlm, String DataInicial, String DataFinal, String Brand) throws Exception {
        try {
            filtraSucessoDataIteminfantil(ViewPlm, DataInicial, DataFinal, Brand);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha, test");
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("seleciono a view cadastro de item infantil")
    public void selecionarViewCadastroDeItemInfantil() throws Exception {
        alterarViewInfantil("Cadastro de Item - Infantil");
        Thread.sleep(2000);
    }

    @E("Seleciono view e filtro item Beleza para copiar {string} e {string}, {string} {string}")
    public void selecionoViewCadastroDeItemBelezaViewPlmEDataIncialDataFinal(String ViewPlm, String DataIncial, String DataFinal, String Brand) throws Exception {
        try {
            filtraSucessoDataBeleza(ViewPlm, DataIncial, DataFinal, Brand);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }


}

