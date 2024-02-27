package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.ArtWorkPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static helpers.Utils.addLog;

public class ArtWorkIntercations extends ArtWorkPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void criarArtWork() throws Exception {

        // Viewer Cadastro de Itens
        Thread.sleep(2000);
        driverWEB.click(viewRenner);
        Thread.sleep(2000);
        driverWEB.setText(selectViewRennerVar, "Cadastro de Itens");
        driverWEB.click("//*[@item='1']");
        Thread.sleep(2000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-Collection-Styles-refresh']");
        Thread.sleep(2000);

        // selecionar sucesso no campo Integration status
        addLog(scenario, "Etapa: Selecionar Style Sucesso");
        driverWEB.getElement(clicIntegrationStatus);
        driverWEB.doubleClick(clicIntegrationStatus);
        Thread.sleep(2000);
        driverWEB.getElement(integrationStatusInput);
        driverWEB.doubleClick(clicIntegrationStatus);
        addLog(scenario, "Integration Status = Successful");
        driverWEB.setText(integrationStatusInput, "Successful");
        //((SeleniumRobotsTool)driverWEB).getElement(integrationStatusInput).sendKeys("Successful");
        Thread.sleep(1000);
        driverWEB.click("//input[@value='RNR_StatusInteg:4']");
        Thread.sleep(1500);

        driverWEB.click("//*[@class='csi-table-header-content' and text()='Code']");
        Thread.sleep(2000);
        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-Collection-Styles-refresh']");
        Thread.sleep(6000);

        // Select Style com sucesso
        driverWEB.waitObject(selectStyleSucesso, 16);
        driverWEB.click(selectStyleSucesso);
        Thread.sleep(12000);

        // Selecionar Specification
        driverWEB.waitObject(selectSpecification, 12);
        driverWEB.click(selectSpecification);

        // Selecionar ArtWork
        driverWEB.waitObject(selectArtWork, 12);
        driverWEB.click(selectArtWork);
        addLog(scenario, "Etapa: Selecionar ArtWork");

        // Clic New ArtWork
        driverWEB.waitObject(btnArtWork, 8);
        driverWEB.click(btnArtWork);

        // ArtWork name= Novo ArtWork
        driverWEB.waitObject(inputNameArtWork, 4);
        ((SeleniumRobotsTool) driverWEB).getElement(inputNameArtWork).sendKeys("Novo ArtWork");

        // Clic
        Thread.sleep(3000);
        driverWEB.click(clicArtWork);
        Thread.sleep(3000);

        // Select Novo ArtWork
        Thread.sleep(5000);
        addLog(scenario, "Etapa: Selecionar Novo ArtWork");
        // Select Novo ArtWork
        driverWEB.click(selectedNovoArtWork);
        Thread.sleep(5000);

        // Adicionar campo Technical Detail
        driverWEB.click(campoTechnicalDetail);
        Thread.sleep(2000);
        driverWEB.setText(inputTechnicalDetail, "Technical Detail, Automatizado!");
        Thread.sleep(2000);
        driverWEB.click(technicalDetailText);
        Thread.sleep(2000);

        addLog(scenario, "Etapa: Aprovar ArtWork");
        // Actions
        //driverWEB.ScrollToObject(actionsApprove);
        //driverWEB.waitObject(actionsApprove,40);
        //driverWEB.click(actionsApprove);Thread.sleep(2000);
        // Approved
        //driverWEB.click(selectApprove);Thread.sleep(7000);

        // Deletar ArtWork
        //Thread.sleep(4000);
        //driverWEB.click(deleteArtWork);
        //Thread.sleep(2000);
        //driverWEB.click(delete);
        //Thread.sleep(20000);
    }
}
