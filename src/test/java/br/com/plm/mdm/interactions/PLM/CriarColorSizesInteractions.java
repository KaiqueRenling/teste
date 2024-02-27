package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.CriarColorSizesPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import br.com.renner.robots.key.RnKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static helpers.Utils.addLog;


public class CriarColorSizesInteractions extends CriarColorSizesPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void comecarCriacaoColorSpecification(String diffId, String diffDesc, String family) throws Exception {

        // wait fluent
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waittt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(240L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waittt.until(ExpectedConditions.elementToBeClickable(By.xpath(abaSpecification)));

        //Specification
        driverWEB.waitObject(abaSpecification, 10);
        driverWEB.click(abaSpecification);
        //Color Specification
        driverWEB.waitObject(abaColorSpecification, 3);
        driverWEB.click(abaColorSpecification);
        Thread.sleep(4000);

        //Action
        driverWEB.waitObject(botaoAction, 5);
        driverWEB.ScrollToObject(botaoAction);
        Thread.sleep(2000);
        driverWEB.click(botaoAction);
        //driverWEB.click(botaoActionColorSpecification);
        Thread.sleep(4000);

        //Color Specification: Teste Cor Azul Automacao
        ((SeleniumRobotsTool) driverWEB).getElement(inputColorSpecification).sendKeys(diffDesc);
        Thread.sleep(1000);

        //DIFF Desc:
        ((SeleniumRobotsTool) driverWEB).getElement(inputDIFFDesc).sendKeys(diffDesc);
        Thread.sleep(1000);

        //DIFF ID	:
        ((SeleniumRobotsTool) driverWEB).getElement(inputDIFFId).sendKeys(diffId);
        Thread.sleep(1000);

        //Family:
        ((SeleniumRobotsTool) driverWEB).getElement(inputFamily).clear();
        Thread.sleep(1000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputFamily).sendKeys(family);
        Thread.sleep(1000);
        driverWEB.click("//*[@item='0']");
        Thread.sleep(1000);
        driverWEB.click("//th[contains(text(),'Family')]");
        Thread.sleep(1000);

        //Diff Type: COR
        //driverWEB.setText(inputDIFFType,"COR");
        ((SeleniumRobotsTool) driverWEB).getElement(inputDIFFType).sendKeys("COR");
        Thread.sleep(2000);

        // New Color Specification Save
        driverWEB.click(newColorSpecificationSave);
        Thread.sleep(8000);

        // Viewer Admin
        //driverWEB.click("//div//input[@title='Renner']");
        //Thread.sleep(2000);
        //driverWEB.click("//th//div//span[@class='csi-table-header-content' and text()='Color Specification']");
        //Thread.sleep(2000);

        // DIFF ID
        driverWEB.doubleClick(diffIDAll);
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(diffIDInput).sendKeys(diffId);
        Thread.sleep(2000);
        driverWEB.sendKeys(diffIDInput, RnKeys.ENTER);
        Thread.sleep(4000);
        driverWEB.click(diffIDInputText);
        Thread.sleep(8000);

        // Status Integration
        driverWEB.click(clicIntegrationStatus);
        Thread.sleep(1000);
        ((SeleniumRobotsTool) driverWEB).getElement(integrationStatusInput).sendKeys("");
        //driverWEB.setText(integrationStatusInput,"Submit");
        ((SeleniumRobotsTool) driverWEB).getElement(integrationStatusInput).sendKeys("Submit");
        Thread.sleep(2000);
        //driverWEB.sendKeys(integrationStatusInput, RnKeys.ENTER);
        driverWEB.click(integrationStatusText);
        Thread.sleep(8000);

        driverWEB.click(refresh);
        Thread.sleep(8000);

        driverWEB.click(refresh);
        Thread.sleep(8000);

        /////////////////////////////// Begin New Color Specification Edit ///////////////////////////////////////////////
        driverWEB.click(newColorSpecificationEdit);
        Thread.sleep(1000);

        //Family: Preto
        driverWEB.click(inputDIFFDescEdit);
        driverWEB.waitObject(inputDIFFDescEdit, 2);
        ((SeleniumRobotsTool) driverWEB).getElement(inputDIFFDescEdit).sendKeys("Test");
        Thread.sleep(2000);

        // New Color Specification Save
        driverWEB.click(colorSpecificationEditSave);
        Thread.sleep(8000);
        /////////////////////////////// End New Color Specification Edit ///////////////////////////////////////////////

        driverWEB.click(refresh);
        Thread.sleep(4000);

        // New Color Specification Delete
        driverWEB.click(newColorSpecificationDelete);
        Thread.sleep(2000);
        // Delete
        driverWEB.click(colorSpecificationDelete);
        Thread.sleep(8000);

    }

    public void comecarCriacaoSizes(String nameSize, String sortOrder) throws Exception {

        Thread.sleep(4000);
        //Specification
        driverWEB.waitObject(abaSpecification, 10);
        driverWEB.click(abaSpecification);

        //Color Specification
        driverWEB.waitObject(abaColorSpecification, 3);
        driverWEB.click(abaColorSpecification);
        //Sizes
        driverWEB.waitObject(abaSizes, 3);
        driverWEB.ScrollToObject(abaSizes);
        driverWEB.click(abaSizes);
        Thread.sleep(4000);

        //Action
        driverWEB.waitObject(botaoActionsNewSizes, 5);
        driverWEB.ScrollToObject(botaoActionsNewSizes);
        Thread.sleep(2000);
        //driverWEB.click(botaoActionsSizes);
        driverWEB.click(botaoActionsNewSizes);
        Thread.sleep(4000);

        //Size: NOVO-SIZE
        //driverWEB.setText(inputSize,"NEW-SIZES");
        ((SeleniumRobotsTool) driverWEB).getElement(inputSize).sendKeys(nameSize);
        Thread.sleep(2000);

        //Dimension Type: Size
        driverWEB.click(dimensionTypeSizes);
        Thread.sleep(1000);
        //driverWEB.setText(inputDimensionSizes,"Size2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputDimensionSizes).sendKeys("Size 2");
        Thread.sleep(1000);

        //Sort Order:
        driverWEB.click(campoSortOrder);
        Thread.sleep(1000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputSortOrder).sendKeys(sortOrder);
        Thread.sleep(1000);

        // New Size Save
        driverWEB.click(newSizesSave);
        Thread.sleep(8000);

        driverWEB.click(refreshSizes);
        Thread.sleep(8000);

        // Find Sort Order
        driverWEB.click(sortOrderAll);
        Thread.sleep(2000);
        //driverWEB.setText(sortOrderInput,"580");
        ((SeleniumRobotsTool) driverWEB).getElement(sortOrderInput).sendKeys(sortOrder);
        Thread.sleep(2000);
        //Select Item
        WebDriver driverCheck = ((WebDriver) (driverWEB.getDriver()));
        driverCheck.findElement(By.cssSelector("div[item='1']")).click();
        Thread.sleep(3000);
        driverWEB.click(sortOrderText);
        Thread.sleep(2000);

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

        // Status Integration Submit
        driverWEB.click(clicIntegrationStatusSizes);
        Thread.sleep(4000);
        //driverWEB.setText(integrationStatusSizesInput,"Submit");
        ((SeleniumRobotsTool) driverWEB).getElement(integrationStatusSizesInput).sendKeys("Submit");
        driverWEB.click(integrationStatusSizesText);
        Thread.sleep(8000);

        Thread.sleep(8000);
        driverWEB.click(refreshSizes);
        Thread.sleep(8000);

        driverWEB.click(refreshSizes);
        Thread.sleep(8000);

        /////////////////////////////// Begin New Sizes Edit ///////////////////////////////////////////////
        driverWEB.click(newSizeEdit);
        Thread.sleep(1000);

        //Size: RN
        ((SeleniumRobotsTool) driverWEB).getElement(inputSize).sendKeys(nameSize);
        Thread.sleep(2000);

        // New Sizes Edir Save
        driverWEB.click(sizeEditSave);
        Thread.sleep(4000);

        Thread.sleep(8000);
        driverWEB.click(refreshSizes);

        Thread.sleep(8000);
        driverWEB.click(refreshSizes);

        /////////////////////////////// End New Sizes Edit ///////////////////////////////////////////////

        // New Sizes Delete
        //Thread.sleep(2000);
        //driverWEB.click(newSizeDelete);
        //Thread.sleep(1000);
        //// Delete
        //driverWEB.click(sizeDelete);
        //Thread.sleep(8000);


        /////////////////////////////// End New Sizes Edit ///////////////////////////////////////////////

        // New Sizes Delete
        Thread.sleep(2000);
        driverWEB.click(newSizeDelete);
        Thread.sleep(1000);
        // Delete
        driverWEB.click(sizeDelete);
        Thread.sleep(8000);

    }

    public void comecarCriacaoSizeRange(String nomeSizeRange, String description, String management) throws Exception {

        Thread.sleep(4000);

        //Specification
        driverWEB.waitObject(abaSpecification, 10);
        driverWEB.click(abaSpecification);

        //Color Specification
        driverWEB.waitObject(abaColorSpecification, 3);
        driverWEB.click(abaColorSpecification);
        //Sizes
        driverWEB.waitObject(abaSizesRange, 3);
        driverWEB.ScrollToObject(abaSizesRange);
        driverWEB.click(abaSizesRange);
        Thread.sleep(4000);

        //Action
        driverWEB.waitObject(botaoActionsNewSizeRange, 5);
        driverWEB.ScrollToObject(botaoActionsNewSizeRange);
        Thread.sleep(2000);
        driverWEB.click(botaoActionsNewSizeRange);
        Thread.sleep(4000);


        //Size Range: Único e kit (Nome tem que ser diferente se já existe nome criado)
        //driverWEB.setText(inputSizeRange,"Únicoo");
        ((SeleniumRobotsTool) driverWEB).getElement(inputSizeRange).sendKeys(nomeSizeRange);
        Thread.sleep(2000);

        //Description: Único e kit
        //driverWEB.setText(inputDescription,"Único");
        ((SeleniumRobotsTool) driverWEB).getElement(inputDescription).sendKeys(description);
        Thread.sleep(2000);

        //Dimension 1 Type: Size
        driverWEB.click(dimensionType);
        Thread.sleep(1000);
        //driverWEB.setText(inputDimension,"Size");
        ((SeleniumRobotsTool) driverWEB).getElement(inputDimension).sendKeys("Size");
        Thread.sleep(1000);

        //Management: FEMENINO
        //driverWEB.setText(inputManagement,"FEMENINO");
        ((SeleniumRobotsTool) driverWEB).getElement(inputManagement).sendKeys(management);
        Thread.sleep(2000);

        // New Size Range Save
        driverWEB.click(newSizeRangeSave);
        Thread.sleep(4000);

        // SUBMIT

        /////////////////////////////// New Size Range Edit ///////////////////////////////////////////////
        driverWEB.click(newSizeRangeEdit);
        Thread.sleep(1000);

        //Size Range: Único e kit
        //driverWEB.setText(inputDescription,"Único");
        ((SeleniumRobotsTool) driverWEB).getElement(inputDescription).sendKeys(nomeSizeRange);
        Thread.sleep(2000);

        // New Size Range Save
        driverWEB.click(sizeRangeEditSave);
        Thread.sleep(4000);
        /////////////////////////////// New Size Range Edit ///////////////////////////////////////////////

        // New Size Range Delete
        driverWEB.click(newSizeRangeDelete);
        Thread.sleep(3000);
        // Delete
        driverWEB.click(sizeRangeDelete);
        Thread.sleep(8000);

    }

    public void criarValidacaoDiffColorSpecification(String itemPaiCode, String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String udamarca, String origempais, String udaorigem, String brand) throws Exception {

        Thread.sleep(2000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        Thread.sleep(1000);
        driverWEB.click(botaoRefresh);
        Thread.sleep(1000);
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(3000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(2000);

        Thread.sleep(1000);
        driverWEB.click(botaoRefresh);
        Thread.sleep(1000);

        // Copy item Style Preencher brand e clic em save
        driverWEB.ScrollToObject(botaoCopy);
        driverWEB.getElement(botaoCopy);
        Thread.sleep(3000);
        driverWEB.click(botaoCopy);
        Thread.sleep(8000);

        // Add Template Copy
        Thread.sleep(2000);
        driverWEB.waitObject(inputTemplates, 6);
        //driverWEB.setText(inputTemplates, "Copy");
        ((SeleniumRobotsTool) driverWEB).getElement(inputTemplates).sendKeys("Copy");
        Thread.sleep(2000);

        // Colorways select none
        driverWEB.waitObject(clicCampoColorways, 40);
        Thread.sleep(6000);
        driverWEB.click(clicCampoColorways);
        Thread.sleep(6000);
        driverWEB.click(selectNone); // selectNone
        Thread.sleep(4000);

        driverWEB.waitObject(campomarca, 8);
        driverWEB.ScrollToObject(campoMarcaText);
        driverWEB.click(campomarca);
        driverWEB.setText(campomarca, brand);
        Thread.sleep(1500);
        driverWEB.click(botaoSave);
        Thread.sleep(8000);

        // wait fluent
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waittt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waittt.until(ExpectedConditions.elementToBeClickable(By.xpath(selecionarItemCopiado)));
        Thread.sleep(5000);
        driverWEB.waitObject(selecionarItemCopiado, 8);
        driverWEB.ScrollToObject(selecionarItemCopiado);
        driverWEB.click(selecionarItemCopiado);
        Thread.sleep(8000);

    }

    public void adicionarACorCriadaDiffColorSpecidfication(String cor) throws Exception {

        Thread.sleep(2000);
        addLog(scenario, "Etapa: Selecionar Cor e Clusters");
        driverWEB.waitObject(abaColorways, 10);
        driverWEB.click(abaColorways);
        Thread.sleep(2000);

        // New from Color Especification
        driverWEB.waitObject(botaoAcaoColorways, 5);
        driverWEB.click(botaoAcaoColorways);

        // Primeira Cor
        Thread.sleep(4000);
        // Clic Color Specification
        driverWEB.waitObject(clicCampoColorSpecification, 5);
        driverWEB.click(clicCampoColorSpecification);
        Thread.sleep(2000);
        // Escrever a Cor
        driverWEB.waitObject(inputCampoColorSpecification, 30);
        driverWEB.setText(inputCampoColorSpecification, cor);
        // clic textbox
        Thread.sleep(3000);
        driverWEB.click(selectTextBox);
        // clic Image
        driverWEB.click(selectCode);
        Thread.sleep(2000);

        //Selected firt column
        driverWEB.waitObject(selectFirstColumn, 20);
        driverWEB.click(selectFirstColumn);
        Thread.sleep(4000);
        // clic Code
        //driverWEB.click(clicColorSpecification);
        // Save Cores
        driverWEB.click(botaoSalvarCores);
        // Save
        Thread.sleep(7000);
        driverWEB.waitObject(botaoSalvarCores, 20);
        driverWEB.click(botaoSalvarCor);

        // Add Cluster Argentina Tamanho
        driverWEB.waitObject(clusterArg, 20);
        Thread.sleep(3000);
        driverWEB.click(clusterArg);
        Thread.sleep(3000);
        driverWEB.setText(clusterSulComboVar, "PP");
        Thread.sleep(5000);

    }
}
