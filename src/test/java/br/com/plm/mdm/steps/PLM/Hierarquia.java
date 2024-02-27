package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.CriarItemApartirDoExistenteInteractions;
import br.com.plm.mdm.interactions.PLM.HierarquiaPageInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;
import java.time.Duration;

import static helpers.Utils.tirarPrint;

public class Hierarquia extends HierarquiaPageInteractions {

    private final RennerTest test;
    CriarItemApartirDoExistenteInteractions itemExistente = new CriarItemApartirDoExistenteInteractions();
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public Hierarquia(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("seleciono a hierarquia, utilizando {string}, {string}, {string}, {string}, {string} e {string}")
    public void selecionarHierarquia(String sessao, String divisao, String grupo, String subClasse, String tipoReferencia, String marca) throws Exception {

        try {
            test.createTestStep("Hierarquia", "Selecionar Hierarquia");
            selecionarSessao(sessao);
            selecionarDivisao(divisao);
            selecionarGrupo(grupo);
            selecionarSubClasse(subClasse);
            Thread.sleep(5000);
            clicarBotaoAcao();
            //clicarOpcaoNovoEstilo();
            informarTipoReferencia(tipoReferencia);
            informarMarca(marca);
            Thread.sleep(4000);
            clicarBotaoSalvar();
            Thread.sleep(3000);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "ID PLM: " + driverWEB.getText(infoPlmId));
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Hierarquia", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("seleciono a hierarquia para criar um artwork, utilizando {string}, {string}, {string} e {string}")
    public void selecionarHierarquia(String sessao, String divisao, String grupo, String subClasse) throws Exception {
        try {
            test.createTestStep("Hierarquia", "Selecionar Hierarquia");
            selecionarSessao(sessao);
            selecionarDivisao(divisao);
            selecionarGrupo(grupo);
            selecionarSubClasse(subClasse);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Hierarquia", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("que crio um item a partir do existente {string}")
    public void SelecionarItemApartirDoExistente(String marca) throws Exception {
        try {
            test.createTestStep("Copiar Item", "Realizar cópia de item criado a partir do existente");
            itemExistente.criarCopiaItem(marca);
            Utils.tirarPrint(Common.scenario);
            driverWEB.waitObject(infoPlmId, 5);
            Utils.addLog(Common.scenario, "ID PLM: " + driverWEB.getText(infoPlmId));
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_copia", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("selecionar a hierarquia do produto, utilizando {string}, {string}, {string}, {string}")
    public void selecionarAHierarquiaProdutoUtilizandoSessaoDivisaoGrupoSubclasse(String sessao, String divisao, String grupo, String subClasse) throws IOException {
        try {
            test.createTestStep("Hierarquia", "Selecionar Hierarquia");
            WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(350L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("dijit_form_ToggleButton_1")));

            selecionarSessao(sessao);
            selecionarDivisao(divisao);
            selecionarGrupo(grupo);
            selecionarSubClasse(subClasse);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Hierarquia", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @Quando("seleciono a hierarquia do produto, utilizando {string}, {string}, {string}, {string}")
    public void selecionoAHierarquiaDoProdutoUtilizandoSessaoDivisaoGrupoSubclasse(String sessao, String divisao, String grupo, String subClasse) throws IOException {
        try {
            test.createTestStep("Hierarquia", "Selecionar Hierarquia");
            driverWEB.click("//*[@data-csi-tab-name='Style']");
            Thread.sleep(2000);
            selecionarSessao(sessao);
            selecionarDivisao(divisao);
            selecionarGrupo(grupo);
            selecionarSubClasse(subClasse);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Hierarquia", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }


    @Quando("seleciono a hierarquia para criar um item a partir do existente, utilizando {string}, {string}, {string} e {string}")
    public void selecionoAHierarquiaParaCriarUmItemAPartirDoExistenteUtilizandoSessaoDivisaoGrupoESubclasse(String sessao, String divisao, String grupo, String subClasse) throws IOException {
        try {
            test.createTestStep("Hierarquia", "Selecionar Hierarquia");
            selecionarSessao(sessao);
            selecionarDivisao(divisao);
            selecionarGrupo(grupo);
            selecionarSubClasse(subClasse);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_Hierarquia", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }


}
