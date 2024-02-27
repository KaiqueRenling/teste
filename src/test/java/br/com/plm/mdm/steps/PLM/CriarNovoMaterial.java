package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.CriarNovoMaterialInteractions;
import br.com.plm.mdm.interactions.PLM.PlmLoginPageInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class CriarNovoMaterial extends CriarNovoMaterialInteractions {

    private final RennerTest test;
    PlmLoginPageInteractions login = new PlmLoginPageInteractions();
    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;
    Utils utils;

    public CriarNovoMaterial(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("começo a criação de um novo material")
    public void começoACriaçãoDeUmNovoMaterialNew() throws IOException {
        try {
            criarNovoMaterial();
            test.createTestStep("CriarNovoMaterial", "");
            utils.TakeScreenShot("Sucesso-CriarNovoMaterial.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarNovoMaterial.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("começo a criação de uma nova reserva old")
    public void começoACriaçãoDeUmaNovaReserva() throws IOException {
        try {
            criarNovaReserva();
            test.createTestStep("CriarNovaReserva", "");
            utils.TakeScreenShot("Sucesso-CriarNovaReserva.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarNovaReserva.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("começo a criação de uma nova reserva")
    public void começoACriaçãoDeUmaNovaReservaNew() throws IOException {
        try {
            criarNovaReservaNew();
            test.createTestStep("CriarNovaReserva", "");
            utils.TakeScreenShot("Sucesso-CriarNovaReserva.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarNovaReserva.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("começo a criação de um novo material ")
    public void começoACriaçãoDeUmNovoMaterial() throws IOException {
        try {
            criarNovoMaterialNew();
            test.createTestStep("CriarNovaReserva", "");
            utils.TakeScreenShot("Sucesso-CriarNovaReserva.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarNovaReserva.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("crio um novo material")
    public void crioUmNovoMaterial() throws IOException {
        try {
            test.createTestStep("CriarNovaReserva", "");
            utils.TakeScreenShot("Sucesso-CriarNovaReserva.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarNovaReserva.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("crio uma nova reserva")
    public void crioUmaNovaReserva() throws IOException {
        try {
            test.createTestStep("CriarNovaReserva", "");
            utils.TakeScreenShot("Sucesso-CriarNovaReserva.jpg", test);
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarNovaReserva.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @Entao("fecho navegador")
    public void fechoNavegador() throws IOException {
        try {
            driverWEB.closeApp();
            utils.TakeScreenShot("Sucesso-CriarPOBrPack", test);
            test.createTestStep("CriarPOBrPack", "");
            Utils.tirarPrint(Common.scenario);
            Utils.addLog(Common.scenario, " " + " ");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-CriarPOBrPack", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }
}
