package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import br.com.plm.mdm.interactions.PLM.CriarColorSizesInteractions;
import br.com.plm.mdm.interactions.PLM.PlmLoginPageInteractions;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class CriarColorSizes extends CriarColorSizesInteractions {

    PlmLoginPageInteractions login = new PlmLoginPageInteractions();
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    private final RennerTest test;

    public CriarColorSizes(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("começo a criação do Color Specification {string}, {string}, {string}")
    public void começoACriaçãoDoColorSpecification(String diffId, String diffdesc, String family) throws IOException {
        try {
            comecarCriacaoColorSpecification(diffId, diffdesc, family);
            test.createTestStep("ACriaçãoDoColorSpecification", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoColorSpecification.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-ACriaçãoDoColorSpecification.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("começo a criação do Sizes {string}, {string}")
    public void começoACriaçãoDoSizes(String nameSize, String sortOrder) throws IOException {
        try {
            comecarCriacaoSizes(nameSize, sortOrder);
            test.createTestStep("ACriaçãoDoSizes", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoSizes.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-ACriaçãoDoSizes.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @E("começo a criação do Size Range {string}, {string}, {string}")
    public void começoACriaçãoDoSizeRange(String nomeSizeRange, String description, String management) throws IOException {
        try {
            comecarCriacaoSizeRange(nomeSizeRange, description, management);
            test.createTestStep("ACriaçãoDoSizes", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoSizes.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-ACriaçãoDoSizes.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("crio Color Specification")
    public void crioColorSpecification() throws IOException {
        try {
            test.createTestStep("ColorSpecification", "");
            utils.TakeScreenShot("Sucesso-AColorSpecification.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-AColorSpecification.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("crio Size Range")
    public void crioSizeRange() throws IOException {
        try {
            test.createTestStep("ACriaçãoDoSizeRange", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoSizeRange.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-ACriaçãoDoSizeRange.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("crio o Size")
    public void crioOSize() throws IOException {
        try {
            test.createTestStep("ACriaçãoDoSizes", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoSizes.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-ACriaçãoDoSizes.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Quando("Crio validacao diff color specification {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void crioValidacaoDiffColorSpecification(String itemPai, String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String udamarca, String origempais, String udaorigem, String brand) throws IOException {
        try {
            criarValidacaoDiffColorSpecification(itemPai, estampado, bordado, tecidotinjido, tecidolavavel, fiodiferente, udamarca, origempais, udaorigem, brand);
            test.createTestStep("ACriaçãoDoDiffColorSpecification", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoDiffColorSpecification.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-ACriaçãoDoDiffColorSpecification.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("adiciono a cor criada diff color specidfication {string}")
    public void adicionoACorCriadaDiffColorSpecidfication(String cor) throws IOException {
        try {
            adicionarACorCriadaDiffColorSpecidfication(cor);
            test.createTestStep("ACriaçãoDoDiffColorSpecification", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoDiffColorSpecification.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-ACriaçãoDoDiffColorSpecification.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }
}
