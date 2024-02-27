package br.com.plm.mdm.steps.PLM;

import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import br.com.plm.mdm.interactions.PLM.CriarThemeInteractions;
import br.com.plm.mdm.interactions.PLM.PlmLoginPageInteractions;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import br.com.plm.mdm.steps.Common;

import java.io.IOException;

import static helpers.Utils.tirarPrint;
import static br.com.plm.mdm.steps.Common.*;

public class CriarTheme extends CriarThemeInteractions {
    private final RennerTest test;
    PlmLoginPageInteractions login = new PlmLoginPageInteractions();
    IRNRobotsTool driverWEB = seleniumRobotsTool;
    Utils utils;

    public CriarTheme(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, directoryName);
    }

    @E("crio theme")
    public void criarTheme() throws IOException {
        try {
            CriarTheme_();
            test.createTestStep("criarTheme", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoTheme.jpg", test);
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-criar-theme.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());

        }
    }

    @Entao("criei theme")
    public void crioTheme() throws IOException {
        try {
            test.createTestStep("criarTheme", "");
            utils.TakeScreenShot("Sucesso-ACriaçãoDoTheme.jpg", test);
            Utils.tirarPrint(scenario);
            Utils.addLog(scenario, "");
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha-criar-theme.jpg", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());

        }
    }
}
