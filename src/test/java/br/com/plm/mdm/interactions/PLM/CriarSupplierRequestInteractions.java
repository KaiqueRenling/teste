package br.com.plm.mdm.interactions.PLM;

import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import helpers.Utils;
import org.openqa.selenium.Keys;
import br.com.plm.mdm.pages.PLM.CriarSupplierRequestPage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;


public class CriarSupplierRequestInteractions extends CriarSupplierRequestPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;
    Utils utils;
    public void criarSupplierRequest_FichaAnaliseDeModelagem() throws Exception {

        // Viewer Cadastro de Itens
        Thread.sleep(2000);
        driverWEB.click(viewRenner);
        Thread.sleep(2000);
        driverWEB.setText(selectViewRennerVar, "Cadastro de Itens");
        driverWEB.click("//*[@item='1']");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-Collection-Styles-refresh']");
        Thread.sleep(2000);
        // Selecionar sucesso no campo Integration status
        Utils.addLog(scenario, "Etapa: Selecionar Style Sucesso");
        driverWEB.doubleClick(clicIntegrationStatus);
        Thread.sleep(2000);
        driverWEB.doubleClick(clicIntegrationStatus);
        Utils.addLog(scenario, "Integration Status = Successful"); Thread.sleep(1000);
        //driverWEB.setText(integrationStatusInput,"Successful");
        ((SeleniumRobotsTool)driverWEB).getElement(integrationStatusInput).sendKeys("Successful");
        Thread.sleep(1000);
        driverWEB.click("//input[@value='RNR_StatusInteg:4']");
        Thread.sleep(8000);

        // Clic Code
        driverWEB.click(clicCode);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-Collection-Styles-refresh']");

        // selecionar item sucesso
        driverWEB.waitObject(selectStyleSucesso,8);
        driverWEB.click(selectStyleSucesso);
        Thread.sleep(6000);

        // Selecionar Sourcing
        driverWEB.waitObject(selectSourcing,12);
        driverWEB.click(selectSourcing);

        // Selecionar Supplier Request
        driverWEB.waitObject(selectSupplierRequest,12);
        driverWEB.click(selectSupplierRequest);

        // Clic new Supplier Request
        driverWEB.waitObject(newSupplierRequest,12);
        driverWEB.click(newSupplierRequest);
        Thread.sleep(5000);

        // Request Supplier Template
        driverWEB.waitObject(templateNewRequestSupplierInput,6);
        ((SeleniumRobotsTool)driverWEB).getElement(templateNewRequestSupplierInput).sendKeys("Ficha de Análise de Modelagem");
        Thread.sleep(2000);

        // Supplier
        driverWEB.waitObject(supplierNewSupplierRequestInput,6);
        //driverWEB.setText(supplierNewSupplierRequestInput,"BRENDISOL TRADING S.A. - 101281");
        ((SeleniumRobotsTool)driverWEB).getElement(supplierNewSupplierRequestInput).sendKeys("BRENDISOL TRADING S.A. - 101281");


        // Clic Template Request Supplier
        driverWEB.click(templateNewRequestSupplierInput);

        // Date, Regra de Negocio, pega dia atual
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date datenow = new Date();
        String date = dateFormat.format(datenow);

        driverWEB.waitObject(dateNewSupplierRequestInput,12);
        //driverWEB.setText(dateNewSupplierRequestInput,date);
        ((SeleniumRobotsTool)driverWEB).getElement(dateNewSupplierRequestInput).sendKeys(date);

        // Save
        driverWEB.waitObject(saveNewSupplierRequest,12);
        driverWEB.click(saveNewSupplierRequest);
        Thread.sleep(4000);

        // Select Supplier Request
        driverWEB.waitObject(selectSupplierRequestCriado,12);
        driverWEB.click(selectSupplierRequestCriado);
        Thread.sleep(4000);

        // Select Style
        driverWEB.waitObject(selectStyle,12);
        driverWEB.click(selectStyle);
        Thread.sleep(8000);

        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(12000);

        // Clic  Draft -> Issued
        driverWEB.waitObject(draft,12);
        driverWEB.click(draft);
        Thread.sleep(8000);

        //driverWEB.waitObject(issued,12);
        //driverWEB.click(issued);
        //Thread.sleep(4000);

        // F5 page
        ((SeleniumRobotsTool)driverWEB).getElement("//body").sendKeys(Keys.F5);
       // ((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(10000);

        // F5 page
        ((SeleniumRobotsTool)driverWEB).getElement("//body").sendKeys(Keys.F5);
       // ((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(10000);

        // F5 page
        ((SeleniumRobotsTool)driverWEB).getElement("//body").sendKeys(Keys.F5);
       // ((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(10000);


        // Clic PDF gerado
        //addLog(scenario,"Etapa: Abrir PDF gerado");
        //driverWEB.waitObject(pdf,12);
        //driverWEB.click(pdf);
        //Thread.sleep(20000);
        Utils.addLog(scenario,"Etapa: Final Supplier Request");

    }

    public void criarSupplierRequest_FichaTecnicaAmostra() throws Exception {
        // Viewer Cadastro de Itens
        Thread.sleep(2000);
        driverWEB.click(viewRenner);
        Thread.sleep(2000);
        driverWEB.setText(selectViewRennerVar, "Cadastro de Itens");
        driverWEB.click("//*[@item='1']");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-Collection-Styles-refresh']");
        Thread.sleep(2000);
        // Selecionar sucesso no campo Integration status
        Utils.addLog(scenario, "Etapa: Selecionar Style Sucesso");
        driverWEB.doubleClick(clicIntegrationStatus);
        Thread.sleep(2000);
        driverWEB.doubleClick(clicIntegrationStatus);
        Utils.addLog(scenario, "Integration Status = Successful"); Thread.sleep(1000);
        //driverWEB.setText(integrationStatusInput,"Successful");
        ((SeleniumRobotsTool)driverWEB).getElement(integrationStatusInput).sendKeys("Successful");
        Thread.sleep(1000);
        driverWEB.click("//input[@value='RNR_StatusInteg:4']");
        Thread.sleep(8000);

        // Clic Code
        driverWEB.click(clicCode);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-Collection-Styles-refresh']");

        // selecionar item sucesso
        driverWEB.waitObject(selectStyleSucesso,12);
        driverWEB.click(selectStyleSucesso);
        Thread.sleep(12000);

        // Selecionar Sourcing
        driverWEB.waitObject(selectSourcing,12);
        driverWEB.click(selectSourcing);

        // Selecionar Supplier Request
        driverWEB.waitObject(selectSupplierRequest,12);
        driverWEB.click(selectSupplierRequest);

        // Clic new Supplier Request
        driverWEB.waitObject(newSupplierRequest,12);
        driverWEB.click(newSupplierRequest);
        Thread.sleep(5000);

        // Request Supplier Template
        driverWEB.waitObject(templateNewRequestSupplierInput,6);

        ((SeleniumRobotsTool)driverWEB).getElement(templateNewRequestSupplierInput).sendKeys("Ficha Técnica e Amostra");
        Thread.sleep(2000);

        // Supplier
        driverWEB.waitObject(supplierNewSupplierRequestInput,6);
        //driverWEB.setText(supplierNewSupplierRequestInput,"BRENDISOL TRADING S.A. - 101281");
        ((SeleniumRobotsTool)driverWEB).getElement(supplierNewSupplierRequestInput).sendKeys("BRENDISOL TRADING S.A. - 101281");

        // Clic Template Request Supplier
        driverWEB.click(templateNewRequestSupplierInput);

        // Date, Regra de Negocio, pega dia atual
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date datenow = new Date();
        String date = dateFormat.format(datenow);

        driverWEB.waitObject(dateNewSupplierRequestInput,12);
        //driverWEB.setText(dateNewSupplierRequestInput,date);
        ((SeleniumRobotsTool)driverWEB).getElement(dateNewSupplierRequestInput).sendKeys(date);

        // Save
        driverWEB.waitObject(saveNewSupplierRequest,12);
        driverWEB.click(saveNewSupplierRequest);
        Thread.sleep(4000);

        // Select Supplier Request
        driverWEB.waitObject(selectSupplierRequestCriado,12);
        driverWEB.click(selectSupplierRequestCriado);
        Thread.sleep(4000);

        // Select Style
        driverWEB.waitObject(selectStyle,12);
        driverWEB.click(selectStyle);
        Thread.sleep(8000);

        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(12000);

        // Clic  Draft -> Issued
        driverWEB.waitObject(draft,12);
        driverWEB.click(draft);
        Thread.sleep(8000);

        //driverWEB.waitObject(issued,12);
        //driverWEB.click(issued);
        //Thread.sleep(4000);

        // F5 page
        ((SeleniumRobotsTool)driverWEB).getElement("//body").sendKeys(Keys.F5);
       // ((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(12000);

        // F5 page
        ((SeleniumRobotsTool)driverWEB).getElement("//body").sendKeys(Keys.F5);
       // ((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(12000);

        // F5 page
        ((SeleniumRobotsTool)driverWEB).getElement("//body").sendKeys(Keys.F5);
       // ((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(12000);

        // Scroll Right


        // Clic PDF gerado
        //addLog(scenario,"Etapa: Abrir PDF gerado");
        //driverWEB.waitObject(pdf,12);
        //driverWEB.click(pdf);
        //Thread.sleep(20000);
        Utils.addLog(scenario,"Etapa: Final Supplier Request");

    }

    public void criarSupplierRequest_TechinicalPackandSample() throws Exception {

        // Viewer Cadastro de Itens
        Thread.sleep(2000);
        driverWEB.click(viewRenner);
        Thread.sleep(2000);
        driverWEB.setText(selectViewRennerVar, "Cadastro de Itens");
        driverWEB.click("//*[@item='1']");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-Collection-Styles-refresh']");
        Thread.sleep(2000);
        // Selecionar sucesso no campo Integration status
        Utils.addLog(scenario, "Etapa: Selecionar Style Sucesso");
        driverWEB.doubleClick(clicIntegrationStatus);
        Thread.sleep(2000);
        driverWEB.doubleClick(clicIntegrationStatus);
        Utils.addLog(scenario, "Integration Status = Successful"); Thread.sleep(1000);
        //driverWEB.setText(integrationStatusInput,"Successful");
        ((SeleniumRobotsTool)driverWEB).getElement(integrationStatusInput).sendKeys("Successful");
        Thread.sleep(1000);
        driverWEB.click("//input[@value='RNR_StatusInteg:4']");
        Thread.sleep(8000);

        // Clic Code
        driverWEB.click(clicCode);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-Collection-Styles-refresh']");

        // selecionar item sucesso
        driverWEB.waitObject(selectStyleSucesso,12);
        driverWEB.click(selectStyleSucesso);
        Thread.sleep(12000);

        // Selecionar Sourcing
        driverWEB.waitObject(selectSourcing,12);
        driverWEB.click(selectSourcing);

        // Selecionar Supplier Request
        driverWEB.waitObject(selectSupplierRequest,12);
        driverWEB.click(selectSupplierRequest);

        // Clic new Supplier Request
        driverWEB.waitObject(newSupplierRequest,12);
        driverWEB.click(newSupplierRequest);
        Thread.sleep(5000);

        // Request Supplier Template
        driverWEB.waitObject(templateNewRequestSupplierInput,6);
        ((SeleniumRobotsTool)driverWEB).getElement(templateNewRequestSupplierInput).sendKeys("Techinical Pack and Sample");
        Thread.sleep(2000);

        // Supplier
        driverWEB.waitObject(supplierNewSupplierRequestInput,6);
        ((SeleniumRobotsTool)driverWEB).getElement(supplierNewSupplierRequestInput).sendKeys("BRENDISOL TRADING S.A. - 101281");

        // Clic Template Request Supplier
        driverWEB.click(templateNewRequestSupplierInput);

        // Date, Regra de Negocio, pega dia atual
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date datenow = new Date();
        String date = dateFormat.format(datenow);

        driverWEB.waitObject(dateNewSupplierRequestInput,12);
        ((SeleniumRobotsTool)driverWEB).getElement(dateNewSupplierRequestInput).sendKeys(date);

        // Save
        driverWEB.waitObject(saveNewSupplierRequest,12);
        driverWEB.click(saveNewSupplierRequest);
        Thread.sleep(4000);

        // Select Supplier Request
        driverWEB.waitObject(selectSupplierRequestCriado,12);
        driverWEB.click(selectSupplierRequestCriado);
        Thread.sleep(4000);

        // Select Style
        driverWEB.waitObject(selectStyle,12);
        driverWEB.click(selectStyle);
        Thread.sleep(8000);

        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(12000);

        // Clic  Draft -> Issued
        driverWEB.waitObject(draft,12);
        driverWEB.click(draft);
        Thread.sleep(8000);

        //driverWEB.waitObject(issued,12);
        //driverWEB.click(issued);
        //Thread.sleep(4000);

        // F5 page
        ((SeleniumRobotsTool)driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(12000);

        // F5 page
        ((SeleniumRobotsTool)driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(12000);

        // F5 page
        ((SeleniumRobotsTool)driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(12000);

        // Validar na Aba Sample se o campo Sample esta diferente de vazio
        ((SeleniumRobotsTool) driverWEB).ScrollToObject("//*[@data-csi-tab-name='Samples']");
        driverWEB.click("//*[@data-csi-tab-name='Samples']"); Thread.sleep(2000);

        ((SeleniumRobotsTool) driverWEB).ScrollToObject("//th//div//span[@class='csi-table-header-content'  and text()='Sample']");
        String campoSample = ((SeleniumRobotsTool) driverWEB).getText("(//td[contains(@class,'attrString')])[6]");

        if (campoSample == ""){
            // Teste não criou Sample!
            Utils.addLog(scenario, "Teste não criou Sample!");
        }else{
            // Teste criou Sample!
            Utils.addLog(scenario, "**************** Teste criou Sample! Código Sample: " + campoSample);
        }

        // Select Style
        driverWEB.waitObject(selectStyle,12);
        driverWEB.click(selectStyle);
        Thread.sleep(8000);

        // Scroll Right

        // Clic PDF gerado
        //addLog(scenario,"Etapa: Abrir PDF gerado");
        //driverWEB.waitObject(pdf,12);
        //driverWEB.click(pdf);
        //Thread.sleep(20000);
        //addLog(scenario,"Etapa: Final Supplier Request Techinical Pack and Sample");

    }

}
