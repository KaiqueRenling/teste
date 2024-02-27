package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.RecuperarItemPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import helpers.Utils;

import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;

public class RecupearItemInteractions extends RecuperarItemPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    Utils utils;

    public void recuperarItem() throws Exception {

        driverWEB.waitObject(welcome, 12);
        driverWEB.click(abaEstilo);

        //Hierarquia SS20
        driverWEB.click(getSessao("Basics/Básicos"));
        driverWEB.click(getDivisao("Feminino Adulto"));
        //driverWEB.click(getDivisao("FEMININO ADULTO"));
        driverWEB.click(getGrupo("CASUAL"));
        Thread.sleep(3000);
        driverWEB.click(getSubclasse("Plano MC B"));
        Thread.sleep(3000);
        // Actions
        //driverWEB.waitObject(btnActions, 8);
        //driverWEB.ScrollToObject(btnActions);
        //driverWEB.click(btnActions);

        // New Style
        driverWEB.waitObject(btnNewStyle, 8);
        driverWEB.click(btnNewStyle);

        // Style Type: Style
        driverWEB.setText(valueStyleType, "Style");
        ((SeleniumRobotsTool) driverWEB).getElement(valueStyleType).sendKeys("Style");

        // Theme
        //driverWEB.setText(valueTheme, "");
        ((SeleniumRobotsTool) driverWEB).getElement(valueTheme).sendKeys("");

        // Brand: CORTELLE
        //driverWEB.setText(valueBrand,"CORTELLE");
        ((SeleniumRobotsTool) driverWEB).getElement(valueBrand).sendKeys("CORTELLE");

        //Clic Save
        driverWEB.click(btnSave);

        // Viewer Cadastro de Item
        Thread.sleep(3000);
        driverWEB.click(viewCadastroItem);
        Thread.sleep(3000);
        //driverWEB.setTextWithoutClear(selectViewRenner, "Renner PO Nacional");
        //driverWEB.setText(selectCadastroItem, "Cadastro de Item");
        ((SeleniumRobotsTool) driverWEB).getElement(selectCadastroItem).sendKeys("Cadastro de Item");
        Thread.sleep(3000);

        // Item a recuperar: 548176992
        driverWEB.click(itemRecuperar);
        //driverWEB.click(itemRecuperarText);
        driverWEB.click(itemRecuperarInput);
        driverWEB.waitObject(itemRecuperarInput, 4);
        //driverWEB.setText(itemRecuperarInput,"548176992");
        ((SeleniumRobotsTool) driverWEB).getElement(itemRecuperarInput).sendKeys("548176992");
        Thread.sleep(4000);
        driverWEB.click(itemRecuperar);
        Thread.sleep(1000);

        // Size Range text
        driverWEB.click(sizeRangeText);

        // Size Range: PP-GG (BASE M)
        driverWEB.click(sizeRangeInput);
        driverWEB.waitObject(sizeRangeInput, 4);
        //driverWEB.setText(sizeRangeInput,"PP-GG  (Desenv: M) | (PreProd: P)");
        ((SeleniumRobotsTool) driverWEB).getElement(sizeRangeInput).sendKeys("P-GG  (Desenv: M) | (PreProd: P)");
        Thread.sleep(1000);
        driverWEB.click(sizeRangeText);
        Thread.sleep(1000);

        // Integration Status
        driverWEB.click(infoStatusIntegration);
        driverWEB.click(campoRecuperarInput);
        driverWEB.waitObject(campoRecuperarInput, 4);
        //driverWEB.setText(campoRecuperarInput,"Recover");
        ((SeleniumRobotsTool) driverWEB).getElement(campoRecuperarInput).sendKeys("Recover");
        Thread.sleep(4000);
        driverWEB.click(infoStatusIntegration);
        Thread.sleep(4000);

        Thread.sleep(16000);

        driverWEB.click(refresh);
        Thread.sleep(8000);

        driverWEB.click(refresh);
        Thread.sleep(8000);

        driverWEB.click(refresh);
        Thread.sleep(8000);

    }
}
