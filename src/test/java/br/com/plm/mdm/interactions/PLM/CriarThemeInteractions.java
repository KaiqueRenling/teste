package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.CriarThemePage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import org.openqa.selenium.Keys;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static helpers.Utils.addLog;

public class CriarThemeInteractions extends CriarThemePage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void CriarTheme_() throws Exception {


        addLog(scenario, "Etapa: Criar Theme");
        // Shape and Theme
        driverWEB.waitObject(clicShapeAndTheme, 8);
        driverWEB.click(clicShapeAndTheme);

        // Theme
        driverWEB.waitObject(clicTheme, 8);
        driverWEB.click(clicTheme);
        Thread.sleep(12000);

        // Add
        driverWEB.waitObject(addNewTheme, 8);
        driverWEB.click(addNewTheme);

        //Subtype: Multiple Seasons
        driverWEB.waitObject(inputSubType, 8);
        //driverWEB.setText(inputSubType, "Multiple Seasons");
        ((SeleniumRobotsTool) driverWEB).getElement(inputSubType).sendKeys("Multiple Seasons");

        //Theme Master: automatizado
        driverWEB.waitObject(inputThemeMaster, 8);
        //driverWEB.setText(inputThemeMaster, "automatizado");
        ((SeleniumRobotsTool) driverWEB).getElement(inputThemeMaster).sendKeys("automatizado");

        //Theme: automatizado
        driverWEB.waitObject(inputTheme, 8);
        //driverWEB.setText(inputTheme, "automatizado");
        ((SeleniumRobotsTool) driverWEB).getElement(inputTheme).sendKeys("automatizado");

        //Original Season: FW22
        driverWEB.waitObject(inputOriginalSeason, 8);
        //driverWEB.setText(inputOriginalSeason, "FW22");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOriginalSeason).sendKeys("FW23");
        Thread.sleep(2000);

        //Tipo: Mood Board
        driverWEB.waitObject(inputTipo, 8);
        //driverWEB.setText(inputTipo, "Mood Board");
        ((SeleniumRobotsTool) driverWEB).getElement(inputTipo).sendKeys("Mood Board");

        //Seasons: FW22
        driverWEB.waitObject(inputSeasons, 8);
        //driverWEB.setText(inputSeasons, "FW22");
        ((SeleniumRobotsTool) driverWEB).getElement(inputSeasons).sendKeys("FW23");
        driverWEB.click(inputSeasonsFW22);
        Thread.sleep(2000);

        //Division: Masculino Adulto
        driverWEB.waitObject(inputDivision, 8);
        //driverWEB.setText(inputDivision, "Masculino Adulto");
        ((SeleniumRobotsTool) driverWEB).getElement(inputDivision).sendKeys("Masculino Adulto");
        //driverWEB.setTextWithoutClear(inputDivision, "Masculino Jovem");
        Thread.sleep(3000);

        // Save
        driverWEB.waitObject(clicSave, 4);
        driverWEB.click(clicSave);
        Thread.sleep(6000);

        // Clic Theme
        driverWEB.waitObject(selectTheme, 8);
        driverWEB.click(selectTheme);
        Thread.sleep(6000);

        //New from Color Specification
        driverWEB.waitObject(addNewfromColorSpecification, 4);
        driverWEB.click(addNewfromColorSpecification);

        // Select Cor
        driverWEB.waitObject(limeGin, 4);
        driverWEB.click(limeGin);

        driverWEB.waitObject(lolliPop, 4);
        driverWEB.click(lolliPop);

        driverWEB.waitObject(marinhoIntenso, 4);
        driverWEB.click(marinhoIntenso);

        driverWEB.waitObject(blueOil, 4);
        driverWEB.click(blueOil);

        //ver
        driverWEB.waitObject(fluchsia, 4);
        driverWEB.click(fluchsia);

        // Save
        driverWEB.waitObject(saveCor, 4);
        driverWEB.click(saveCor);
        Thread.sleep(4000);

        // Theme Colorway Gallery
        driverWEB.waitObject(themeColorwayGallery, 4);
        driverWEB.click(themeColorwayGallery);
        Thread.sleep(4000);

        // clic Home
        driverWEB.waitObject(clicHome, 4);
        driverWEB.click(clicHome);
        Thread.sleep(9000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(10000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(5000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-ApparelViews-Themes-refresh']");

        Thread.sleep(5000);

        // Edit Theme

        addLog(scenario, "Etapa: Editar Theme");
        driverWEB.waitObject(editTheme, 4);
        driverWEB.click(editTheme);
        Thread.sleep(4000);

        // Save
        driverWEB.waitObject(clicSave, 4);
        driverWEB.click(clicSave);
        Thread.sleep(6000);

        // Copy
        System.out.println("Etapa: Copy Theme");
        driverWEB.waitObject(clicCopy, 4);
        driverWEB.click(clicCopy);

        // Edit Theme: automatizado 2
        driverWEB.waitObject(inputTheme, 8);
        //driverWEB.setText(inputTheme, "");
        ((SeleniumRobotsTool) driverWEB).getElement(inputTheme).sendKeys("");
        //driverWEB.setText(inputTheme, "automatizado copy");
        ((SeleniumRobotsTool) driverWEB).getElement(inputTheme).sendKeys("automatizado copy2");

        //Seasons: Basics/Básicos
        driverWEB.waitObject(inputSeasonsCopy, 8);
        driverWEB.setText(inputSeasonsCopy, "");
        ((SeleniumRobotsTool) driverWEB).getElement(inputSeasonsCopy).sendKeys("");
        driverWEB.setText(inputSeasonsCopy, "Basics/Básicos");
        //((SeleniumRobotsTool)driverWEB).getElement(inputSeasonsCopy).sendKeys("Basics/Básicos");
        //driverWEB.click(inputSeasonsCopyBasics);
        driverWEB.click("//div[@class='dijit dijitReset dijitInline dijitCheckBox']");
        Thread.sleep(2000);

        //Division: Masculino Adulto
        //driverWEB.waitObject(inputDivision, 8);
        //driverWEB.setTextWithoutClear(inputDivision, "Masculino Jovem");
        //Thread.sleep(3000);

        // Save
        driverWEB.waitObject(clicSaveCopy, 4);
        driverWEB.click(clicSaveCopy);
        Thread.sleep(6000);

        // *********** Alterar Theme **************

        // Clicar coluna Theme, primeira opção Automaizado
        driverWEB.ScrollToObject(selecionarTheme);
        driverWEB.click(selecionarTheme);

        // Clic Aba General
        driverWEB.click(abaGeneral);
        Thread.sleep(3000);
        // Theme general Conteúdo
        // Clicar  no campo Textura escrever Edit Textura Automatizada
        driverWEB.click(campoTextura);
        driverWEB.setText(inputCampoTextura, "Test Textura Edit Campo, Edit Teste Automatizado!");
        Thread.sleep(3000);
        driverWEB.click(textTextura);

        // Remover Theme Colorway Colors Actions clicar no X
        //driverWEB.ScrollToObject(campoActions);
        //.click(campoDelete);Thread.sleep(3000);
        // Confirmar Delete
        //driverWEB.click(confirmaDelete); Thread.sleep(7000);

        // Deletar
        //addLog(scenario,"Etapa: Deletar Theme Copiado");
        //driverWEB.waitObject(clicDelCopy, 4);
        //driverWEB.click(clicDelCopy);

        // Save Delete
        //driverWEB.waitObject(saveDelete, 4);
        //driverWEB.click(saveDelete);
        //Thread.sleep(8000);
    }

}
