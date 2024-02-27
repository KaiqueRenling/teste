package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.TesteQualidadePage;
import br.com.renner.robots.IRNRobotsTool;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static helpers.Utils.addLog;

public class CriarTesteQualidadeInteractions extends TesteQualidadePage {
    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void CriarTesteQualidade_() throws Exception {

        Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(4000);

        // Clic na Aba Quality
        driverWEB.click(abaQuality);
        Thread.sleep(2000);

        // New Test Runn
        driverWEB.click(newTestRunn);
        Thread.sleep(2000);

        // Save
        driverWEB.click(save);
        Thread.sleep(2000);

        // Clica na linha  criada e abre o Test Qualidade
        driverWEB.click(selecionaLinhaTest);
        Thread.sleep(2000);

        // Clic na Aba Tests
        driverWEB.click(abaTests);
        Thread.sleep(2000);

        // Clic New From Test Specs
        driverWEB.click(newFromTestSpecs);
        Thread.sleep(2000);

        // Slecionar testes que desejar
        driverWEB.tickCheckBox(selecionarTipotest, true);
        Thread.sleep(2000);
        driverWEB.tickCheckBox(selecionarTipotest2, true);

        // Clicar em Save
        driverWEB.click(salvarTipoTest);

        // Comments
        driverWEB.click(comments);
        Thread.sleep(2000);
        driverWEB.setText(commentsTextArea, "Teste de Qualidade");
        Thread.sleep(2000);

        // Clicar na aba TDS
        driverWEB.click(clicAbaTds);
        Thread.sleep(4000);

        // Actions selecionar Approved
        driverWEB.click(actions);
        Thread.sleep(1000);
        driverWEB.click("//div[@class='dijitPopup dijitMenuPopup csi-left-menu']/table/tbody/tr[5]/td[2]");
        Thread.sleep(5000);
        driverWEB.click(actions);
        Thread.sleep(4000);

    }

}
