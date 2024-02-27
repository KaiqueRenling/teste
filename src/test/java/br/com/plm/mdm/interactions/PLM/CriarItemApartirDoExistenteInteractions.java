package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.ItemPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static helpers.Utils.addLog;

public class CriarItemApartirDoExistenteInteractions extends ItemPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void criarCopiaItem(String marca) throws Exception {

        addLog(scenario, "Etapa: Criar item a partir do Existente");
        driverWEB.doubleClick(clicIntegrationStatus);
        Thread.sleep(2000);
        driverWEB.doubleClick(clicIntegrationStatus);
        addLog(scenario, "Integration Status = Successful");
        //driverWEB.setText(integrationStatusInput,"Successful");
        ((SeleniumRobotsTool) driverWEB).getElement(integrationStatusInput).sendKeys("Successful");
        Thread.sleep(1000);
        driverWEB.click("//input[@value='RNR_StatusInteg:4']");
        Thread.sleep(2000);
        driverWEB.click(clicCode);
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshh);
        Thread.sleep(2000);

        // Copy
        driverWEB.waitObject(botaoCopy, 12);
        Thread.sleep(1000);
        driverWEB.click(botaoCopy);
        Thread.sleep(3000);

        // Add Template Copy
        driverWEB.click(templates);
        //driverWEB.setText(templates, "copy2");
        ((SeleniumRobotsTool) driverWEB).getElement(templates).sendKeys("copy2");
        Thread.sleep(1000);
        driverWEB.click(botaoSave);

        Thread.sleep(4000);
        driverWEB.waitObject(campomarca, 8);
        driverWEB.ScrollToObject(campoMarcaText);
        driverWEB.click(campomarca);
        //driverWEB.setText(campomarca, marca);
        ((SeleniumRobotsTool) driverWEB).getElement(campomarca).sendKeys(marca);
        Thread.sleep(1500);
        driverWEB.click(botaoSave);

        // Select item
        Thread.sleep(25000);
        driverWEB.ScrollToObject(selecionarItemCopiado);
        driverWEB.waitObject(selecionarItemCopiado, 12);
        Thread.sleep(1500);
        driverWEB.click(selecionarItemCopiado);
        Thread.sleep(1500);
    }
}
