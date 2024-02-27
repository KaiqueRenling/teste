package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.AprovarItemPage;
import br.com.plm.mdm.steps.Common;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import br.com.renner.robots.key.RnKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoClicvel;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoWeb;
import static helpers.Utils.addLog;

public class AprovarItemInteractions extends AprovarItemPage {
    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void aprovarItem() throws Exception {

        addLog(Common.scenario, "Etapa: Aprovar item");

        esperarElementoWeb(abaPropriedades);
        esperarElementoClicvel(abaPropriedades);
        driverWEB.click(abaPropriedades);

        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(2000);
        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(4000);

        esperarElementoWeb(botaoAprovarItem);
        esperarElementoClicvel(botaoAprovarItem);
        driverWEB.click(botaoAprovarItem);

        esperarElementoWeb(inputCampoSubmeter);
        esperarElementoClicvel(inputCampoSubmeter);
        //driverWEB.clearField(inputCampoSubmeter);

        //driverWEB.setText(inputCampoSubmeter, "Submit");
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoSubmeter).sendKeys("Submit");
        driverWEB.sendKeys(inputCampoSubmeter, RnKeys.ENTER);
        Thread.sleep(2000);

    }

    public void aprovarItemExistente() throws Exception {

        addLog(Common.scenario, "Etapa: Aprovar item");
        Thread.sleep(4000);
        esperarElementoWeb(abaPropriedadesExistente);
        esperarElementoClicvel(abaPropriedadesExistente);
        driverWEB.click(abaPropriedadesExistente);
        Thread.sleep(2000);

        esperarElementoWeb(campoSubmeter);
        esperarElementoClicvel(campoSubmeter);
        driverWEB.click(campoSubmeter);

        esperarElementoWeb(inputCampoSubmeter);
        esperarElementoClicvel(inputCampoSubmeter);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoSubmeter).sendKeys("Submit");
        driverWEB.sendKeys(inputCampoSubmeter, RnKeys.ENTER);
        Thread.sleep(2000);
        driverWEB.click(botaoRefreshItemExistente);
        Thread.sleep(10000);
        driverWEB.click(botaoRefreshItemExistente);
        Thread.sleep(10000);
        driverWEB.click(botaoRefreshItemExistente);
        Thread.sleep(8000);
        //driverWEB.click(botaoRefreshItemExistente);
        //Thread.sleep(8000);
        //driverWEB.click(botaoRefreshItemExistente);
        //Thread.sleep(2000);
        //driverWEB.click(botaoRefreshItemExistente);
        //Thread.sleep(8000);
        //driverWEB.click(botaoRefreshItemExistente);
        //Thread.sleep(8000);
        getInfo();

    }

    public void aprovarItemExistenteIssue() throws Exception {

        addLog(Common.scenario, "Etapa: Aprovar item");
        Thread.sleep(4000);
        driverWEB.click(abaPropriedadesExistente);
        Thread.sleep(3000);
        driverWEB.click(campoSubmeter);
        driverWEB.clearField(inputCampoSubmeter);
        //driverWEB.setText(inputCampoSubmeter, "Submit");
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoSubmeter).sendKeys("Submit");
        Thread.sleep(2000);
        driverWEB.sendKeys(inputCampoSubmeter, RnKeys.ENTER);
        Thread.sleep(2000);
        driverWEB.click(botaoRefreshItemExistente);
        Thread.sleep(15000);
        driverWEB.click(botaoRefreshItemExistente);
        Thread.sleep(15000);
        driverWEB.click(botaoRefreshItemExistente);
        Thread.sleep(15000);
        driverWEB.click(botaoRefreshItemExistente);
        Thread.sleep(15000);
        driverWEB.click(botaoRefreshItemExistente);
        Thread.sleep(15000);
        driverWEB.click(botaoRefreshItemExistente);
        //Thread.sleep(10000);
        //driverWEB.click(botaoRefreshItemExistente);
        //Thread.sleep(10000);
        //driverWEB.click(botaoRefreshItemExistente);
        //Thread.sleep(10000);
        //driverWEB.click(botaoRefreshItemExistente);

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        // Pega valor do campo RMS PO Code
        Thread.sleep(7000);
        driverWEB.click(botaoRefreshItemExistente);
        // RMS Integrantion Status
        String expectIntegrationStatus = driver.findElement(By.xpath("//*[@data-csi-heading='RNR_Integration_Status_string:Child:Attributes:0']")).getText();

        // Date
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

        //  Integration Status Error
        if (expectIntegrationStatus.equals("Error")) {
            //clicar nas aba Issues
            Thread.sleep(3000);
            driverWEB.waitObject(abaIssues, 10);
            Thread.sleep(1000);
            driverWEB.click(abaIssues);
            Thread.sleep(1000);
            driverWEB.click("//*[@data-csi-automation='plugin-IssueLog-Issues-refresh']");
            Thread.sleep(6000);
            // Copiar texto do erro
            String expectError = driver.findElement(By.xpath("//*[@data-csi-heading='Description::0']")).getText();
            if (expectError.length() != 0) {
                addLog(Common.scenario, "Compo Issue diferente de zero! Teste passou!");
            } else {
                addLog(Common.scenario, "O campo Issue retornou em branco! Teste não passou!");
            }
            addLog(Common.scenario, "Error:" + expectError);
            addLog(Common.scenario, "Integration Status:" + expectIntegrationStatus);
            addLog(Common.scenario, "Data:" + data);
            addLog(Common.scenario, "Hora:" + hora);
            Thread.sleep(8000);
        }
        getInfo();

    }

    public void getInfo() throws Exception {
        addLog(Common.scenario, "\n" + "Informações do item" + "\n");
        //addLog(scenario,"Status do item: " + driverWEB.getText(infoStatusIntegration));
        //addLog(scenario,"Status de envio: " + driverWEB.getText(infoSubmitStatusTime));
        //addLog(scenario,"Status de integração: " + driverWEB.getText(infoStatusIntegrationTime));
        //addLog(scenario,"Item Pai: " + driverWEB.getText(infoRmsId));
        addLog(Common.scenario, "ID PLM: " + driverWEB.getText(infoPlmId));
        //addLog(scenario,"ID MDM: " + driverWEB.getText(infoMdmId) + "\n");


    }
}

