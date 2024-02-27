package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.ViewPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static br.com.plm.mdm.toolbox.GlobalTools.*;
import static helpers.Utils.addLog;

public class ViewInteractions extends ViewPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    private void selecionarViewerRennerImportadaNew(String viewerrennerimportada) throws Exception {
        Thread.sleep(3000);
        driverWEB.click(viewerRennerNew);
        Thread.sleep(3000);
        //driverWEB.setText(selectViewRenner, "");
        //driverWEB.setText(selectViewRenner, viewerrennerimportada);
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys(viewerrennerimportada);
        driverWEB.click("//div[@item='1']");
        Thread.sleep(2000);
    }

    private void informarWarehouseStoreImportado(String warehousestore) throws Exception {
        // Supplier PO Warehouse/Store
        driverWEB.click(warehouseStoreImportado);
        Thread.sleep(1000);
        //driverWEB.setText(inputValorWarehouseStoreImportado, warehousestore);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportado).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportado).sendKeys(warehousestore);
        Thread.sleep(2000);
        driverWEB.click(warehouseStoreText);
        Thread.sleep(2000);
    }

    private void informarPOModelImportado(String pomodel) throws Exception {
        // Supplier PO PO/Model
        driverWEB.click(poModel);
        //driverWEB.setText(inputValorPoModelImportado, pomodel);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelImportado).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelImportado).sendKeys(pomodel);
        Thread.sleep(2000);
        driverWEB.click(poModelText);
        Thread.sleep(2000);
    }

    private void informarCommercialWeekImportado(String commercialWeekValue) throws Exception {
        //Commercial Week:
        driverWEB.click(commercialWeek);
        driverWEB.setText(commercialWeekInputImportado, commercialWeekValue);
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInputImportado).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInputImportado).sendKeys(commercialWeekValue);
        Thread.sleep(1000);
        driverWEB.click(commercialWeekText);
        Thread.sleep(2000);
    }

    private void yearNewImportado(String ano) throws Exception {

        driverWEB.click(yearImportada);
        Thread.sleep(1000);
        driverWEB.waitObject(inputValorYearImportada, 5);
        //driverWEB.setText(inputValorYearImportada, ano);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorYearImportada).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorYearImportada).sendKeys(ano);
        Thread.sleep(1000);
        driverWEB.click(yearText);
        Thread.sleep(2000);
    }

    private void selecionarViewerRennerNacional(String viewRennerPO) throws Exception {
        Thread.sleep(3000);
        driverWEB.click(viewRennerNacional);
        Thread.sleep(3000);
        //driverWEB.setText(selectViewRenner, "");
        //driverWEB.setText(selectViewRenner, viewRennerPO);
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys(viewRennerPO);
        driverWEB.click("//*[@item='1']");
        Thread.sleep(2000);
    }

    private void informarPOQty(String POQty) throws Exception {

        driverWEB.click(orderQty);
        Thread.sleep(4000);

        // Clic mouse OrderQty text/input
        WebDriver driverOrderQty = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicOrderQtyte = driverOrderQty.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'Quantity::0')]"));
        // Instantiating Actions Class
        Actions actions = new Actions(driverOrderQty);
        // Hovering on clicOrderQtytext
        actions.moveToElement(clicOrderQtyte);
        // build() - used to complie all the actions
        actions.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Qty Text pg
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);

        actions.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Qty Text pg
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);
        actions.click().build().perform();

        // XPath no exist
        driverWEB.waitObject(inputValorOrderQty, 10);

        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorOrderQty, "2");
        driverWEB.setText(inputValorOrderQty, POQty);
        Thread.sleep(2000);

        // Clic Order Qty Text pg
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);
    }

    private void informarPOModel(String pomodel) throws Exception {
        // Supplier PO PO/Model
        driverWEB.click(poModel);
        //driverWEB.setText(inputValorPoModel, pomodel);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModel).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModel).sendKeys(pomodel);
        Thread.sleep(1000);
        driverWEB.click(poModelText);
        Thread.sleep(2000);
    }

    private void informarWarehouseStore(String warehousestore) throws Exception {
        // Supplier PO Warehouse/Store
        driverWEB.click(warehouseStore);
        //driverWEB.setText(inputValorWarehouseStore, warehousestore);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStore).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStore).sendKeys(warehousestore);
        Thread.sleep(1000);
        driverWEB.click(warehouseStoreText);
        Thread.sleep(2000);
    }

    //Viewer Renner PO Nacional
    private void selecionarViewer(String view) throws Exception {
        Thread.sleep(2000);
        driverWEB.click(viewRenner);
        Thread.sleep(2000);
        //driverWEB.setText(selectViewRennerVar, view);
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRennerVar).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRennerVar).sendKeys(view);
        driverWEB.click("//*[@item='1']");
        Thread.sleep(2000);
    }

    //Viewer Renner PO
    private void selecionarViewerVariavel(String ViewPlm) throws Exception {

        Thread.sleep(2000);
        driverWEB.click(viewRenner);
        Thread.sleep(2000);
        //driverWEB.setText(selectViewRennerVar, ViewPlm);
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRennerVar).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRennerVar).sendKeys(ViewPlm);
        driverWEB.click("//*[@item='1']");
        Thread.sleep(2000);
    }

    public void alterarView(String view) throws Exception {
        Thread.sleep(2000);
        esperarElementoWeb(abaStyle);
        esperarElementoClicvel(abaStyle);
        driverWEB.click(abaStyle);
        //Thread.sleep(2000);
        esperarElementoWeb(abaPropriedades);
        esperarElementoClicvel(abaPropriedades);
        driverWEB.click(abaPropriedades);

        esperarElementoWeb(btnRefresh);
        esperarElementoClicvel(btnRefresh);
        driverWEB.click(btnRefresh);

        esperarElementoWeb(botaoView);
        esperarElementoClicvel(botaoView);
        //driverWEB.waitObject(botaoView, 15);
        driverWEB.click(botaoView);

        esperarElementoWeb(inputView);
        esperarElementoClicvel(inputView);
        //driverWEB.waitObject(inputView, 10);
        driverWEB.clearField(inputView);
        //driverWEB.setText(inputView, view);
        ((SeleniumRobotsTool) driverWEB).getElement(inputView).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputView).sendKeys(view);
        driverWEB.click("//*[@item='1']");
        //driverWEB.sendKeys(inputView, RnKeys.ENTER);
        esperarElementoWeb(btnRefresh);
        esperarElementoClicvel(btnRefresh);
        driverWEB.click(btnRefresh);
        //Thread.sleep(3000);
    }

    public void alterarViewFeminino(String view) throws Exception {
        Thread.sleep(2000);
        driverWEB.click(abaStyle);
        Thread.sleep(2000);
        driverWEB.click(abaPropriedades);
        driverWEB.click(btnRefresh);
        driverWEB.waitObject(botaoView, 10);
        driverWEB.click(botaoView);
        driverWEB.waitObject(inputView, 10);
        driverWEB.clearField(inputView);
        //driverWEB.setText(inputView, view);
        ((SeleniumRobotsTool) driverWEB).getElement(inputView).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputView).sendKeys(view);
        driverWEB.click("//*[@item='1']");
        //driverWEB.sendKeys(inputView, RnKeys.ENTER);
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);
    }

    public void alterarVieww(String view) throws Exception {
        Thread.sleep(2000);
        driverWEB.click(abaStyle);
        Thread.sleep(2000);
        driverWEB.click(abaPropriedades);
        driverWEB.click(btnRefresh);
        driverWEB.waitObject(botaoView, 10);
        driverWEB.click(botaoView);
        driverWEB.waitObject(inputView, 10);
        driverWEB.clearField(inputView);
        //driverWEB.setText(inputView, view);
        ((SeleniumRobotsTool) driverWEB).getElement(inputView).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputView).sendKeys(view);
        driverWEB.click("//*[@item='1']");
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);
    }

    public void alterarViewBeleza(String view) throws Exception {

        esperarElementoWeb(abaStyle);
        esperarElementoClicvel(abaStyle);
        driverWEB.click(abaStyle);
        Thread.sleep(1000);
        esperarElementoWeb(abaPropriedades);
        esperarElementoClicvel(abaPropriedades);
        driverWEB.click(abaPropriedades);

        esperarElementoWeb(btnRefresh);
        esperarElementoClicvel(btnRefresh);
        driverWEB.click(btnRefresh);
        //Thread.sleep(2000);

        esperarElementoWeb(botaoView);
        esperarElementoClicvel(botaoView);
        driverWEB.click(botaoView);


        esperarElementoWeb(inputView);
        esperarElementoClicvel(inputView);
        driverWEB.clearField(inputView);
        ((SeleniumRobotsTool) driverWEB).getElement(inputView).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputView).sendKeys(view);
        driverWEB.click("//*[@item='1']");

        esperarElementoWeb(btnRefresh);
        esperarElementoClicvel(btnRefresh);
        driverWEB.click(btnRefresh);
        Thread.sleep(6000);
    }

    private void yearNacional(String ano) throws Exception {

        driverWEB.click(yearNew);
        Thread.sleep(1000);
        driverWEB.waitObject(YearInputNew, 5);
        //driverWEB.setText(YearInputNew, ano);
        ((SeleniumRobotsTool) driverWEB).getElement(YearInputNew).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(YearInputNew).sendKeys(ano);
        Thread.sleep(1000);
        driverWEB.click(yearText);
        Thread.sleep(2000);
    }

    private void informarCommercialWeekNacional(String commercialWeekValue) throws Exception {
        //Commercial Week:
        driverWEB.click(commercialWeek);
        //driverWEB.setText(commercialWeekInputNacional, commercialWeekValue);
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInputNacional).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInputNacional).sendKeys(commercialWeekValue);
        Thread.sleep(1000);
        driverWEB.click(commercialWeekText);
        Thread.sleep(2000);
    }

    public void filtraSucessoData(String view, String dataInicial, String dataFinal, String Brand) throws Exception {

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(botaoRefreshh)));

        addLog(scenario, "Etapa: Selecionar viewer cadastro de Itens");
        selecionarViewer(view);
        Thread.sleep(1000);
        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(2000);

        addLog(scenario, "Integration Status = Successful");


        esperarElementoWeb(btnHabilitarFiltroSubclass);
        esperarElementoClicvel(btnHabilitarFiltroSubclass);
        driverWEB.click(btnHabilitarFiltroSubclass);

        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse);
        esperarElementoClicvel(inputFilterSubclasse);
        //esperarElementoWeb(filterSelecionarOptionIntegrationStatus);
        //esperarElementoClicvel(filterSelecionarOptionIntegrationStatus);
        //driverWEB.click(inputFilterSubclasse);
        driverWEB.setText(inputFilterSubclasse, "Integration Status");



        esperarElementoWeb(filterSelecionarOptionIntegrationStatus);
        esperarElementoClicvel(filterSelecionarOptionIntegrationStatus);
        driverWEB.click(filterSelecionarOptionIntegrationStatus);



        esperarElementoWeb(integrationStatusSuccesfull);
        esperarElementoClicvel(integrationStatusSuccesfull);
        driverWEB.click(integrationStatusSuccesfull);

        esperarElementoWeb(integrationStatusInput);
        esperarElementoClicvel(integrationStatusInput);
        ((SeleniumRobotsTool) driverWEB).getElement(integrationStatusInput).sendKeys(Keys.TAB);


        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(3000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);




        addLog(scenario, "Etapa: Selecionar Data Inicial e Data Final, Style Sucesso");
        driverWEB.ScrollToObject(botaoAddFiltroColunaColor);
        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse2);
        esperarElementoClicvel(inputFilterSubclasse2);
        driverWEB.setText(inputFilterSubclasse2, "Submit Status Time");

        esperarElementoWeb(filterSelecionarOptionSubmitStatus);
        esperarElementoClicvel(filterSelecionarOptionSubmitStatus);
        driverWEB.click(filterSelecionarOptionSubmitStatus);

        esperarElementoWeb(custom2);
        esperarElementoClicvel(custom2);
        driverWEB.click(custom2);

        esperarElementoWeb(inputDataIncial2);
        esperarElementoClicvel(inputDataIncial2);
        driverWEB.setText(inputDataIncial2, dataInicial);

        esperarElementoWeb(inputDataFinal2);
        esperarElementoClicvel(inputDataFinal2);
        driverWEB.setText(inputDataFinal2, dataFinal);

        esperarElementoWeb(description);
        esperarElementoClicvel(description);
        driverWEB.click(description);
        Thread.sleep(4000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);


        //size

        driverWEB.ScrollToObject(botaoAddFiltroColunaColor);
        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse2);
        esperarElementoClicvel(inputFilterSubclasse2);
        driverWEB.setText(inputFilterSubclasse2, "Size Range");

        esperarElementoWeb(filterSelecionarOptionSizeRange);
        esperarElementoClicvel(filterSelecionarOptionSizeRange);
        driverWEB.click(filterSelecionarOptionSizeRange);

        esperarElementoWeb(inputFilterSizeRange);
        esperarElementoClicvel(inputFilterSizeRange);
        //driverWEB.click(inputFilterSizeRange);
        driverWEB.setText(inputFilterSizeRange, "PP-GG  (Desenv: M | (PreProd: M)");

        esperarElementoWeb(filterSelecionarASizeRange);
        esperarElementoClicvel(filterSelecionarASizeRange);
        driverWEB.click(filterSelecionarASizeRange);

        esperarElementoWeb(inputFilterSizeRange);
        esperarElementoClicvel(inputFilterSizeRange);
        ((SeleniumRobotsTool) driverWEB).getElement(inputFilterSizeRange).sendKeys(Keys.TAB);

        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(3000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);


        addLog(scenario, "Etapa: Selecionar Copy");
        // Refresh
        driverWEB.click(botaoRefreshh);
        Thread.sleep(3000);

        // Copy item Style Preencher brand e clic em save
        driverWEB.ScrollToObject(botaoCopy);
        esperarElementoWeb(botaoCopy);
        esperarElementoClicvel(botaoCopy);
        driverWEB.getElement(botaoCopy);
        Thread.sleep(3000);

        driverWEB.click(botaoCopy);
        Thread.sleep(4000);





        esperarElementoWeb(inputTemplates);
        esperarElementoClicvel(inputTemplates);
        ((SeleniumRobotsTool) driverWEB).getElement(inputTemplates).sendKeys("Copy_Style");
        //Thread.sleep(2000);

        esperarElementoWeb(templateCopyStyleOption);
        esperarElementoClicvel(templateCopyStyleOption);
        driverWEB.click(templateCopyStyleOption);


        // Colorways select none
        esperarElementoWeb(clicSetaCampoColorways);
        esperarElementoClicvel(clicSetaCampoColorways);
        driverWEB.click(clicSetaCampoColorways);

        esperarElementoWeb(clicCampoColorways);
        esperarElementoClicvel(clicCampoColorways);
        driverWEB.click(clicCampoColorways);
        Thread.sleep(2000);

        esperarElementoWeb(selectNone);
        esperarElementoClicvel(selectNone);
        driverWEB.click(selectNone); // selectNone
        Thread.sleep(2000);

        //MARCA
        esperarElementoWeb(campoMarcaTemplateCopy);
        esperarElementoClicvel(campoMarcaTemplateCopy);
        driverWEB.click(campoMarcaTemplateCopy);

        esperarElementoWeb(inputMarcaTemplateCopy);
        esperarElementoClicvel(inputMarcaTemplateCopy);
        ((SeleniumRobotsTool) driverWEB).getElement(inputMarcaTemplateCopy).sendKeys("BLUE STEEL");


        esperarElementoWeb(botaoSave);
        esperarElementoClicvel(botaoSave);
        driverWEB.click(botaoSave);
        Thread.sleep(6000);

        // Select item
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waittt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waittt.until(ExpectedConditions.elementToBeClickable(By.xpath(selecionarItemCopiado)));

        //driverWEB.waitObject(selecionarItemCopiado, 8);




        esperarElementoInvisivel(By.xpath("//div[@data-dojo-attach-point='outerContainerNode']"));



        esperarElementoWeb(selecionarItemCopiado);
        driverWEB.ScrollToObject(selecionarItemCopiado);

        esperarElementoClicvel(selecionarItemCopiado);

        driverWEB.click(selecionarItemCopiado);
        Thread.sleep(8000);
    }

    public void filtraSucessoDataItemAcessorio(String view, String dataInicial, String dataFinal, String Brand) throws Exception {

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(botaoRefreshh)));

        addLog(scenario, "Etapa: Selecionar viewer cadastro de Itens");
        selecionarViewer(view);
        Thread.sleep(1000);
        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(2000);

        addLog(scenario, "Integration Status = Successful");


        esperarElementoWeb(btnHabilitarFiltroSubclass);
        esperarElementoClicvel(btnHabilitarFiltroSubclass);
        driverWEB.click(btnHabilitarFiltroSubclass);

        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse);
        esperarElementoClicvel(inputFilterSubclasse);
        //esperarElementoWeb(filterSelecionarOptionIntegrationStatus);
        //esperarElementoClicvel(filterSelecionarOptionIntegrationStatus);
        //driverWEB.click(inputFilterSubclasse);
        driverWEB.setText(inputFilterSubclasse, "Integration Status");



        esperarElementoWeb(filterSelecionarOptionIntegrationStatus);
        esperarElementoClicvel(filterSelecionarOptionIntegrationStatus);
        driverWEB.click(filterSelecionarOptionIntegrationStatus);



        esperarElementoWeb(integrationStatusSuccesfull2);
        esperarElementoClicvel(integrationStatusSuccesfull2);
        driverWEB.click(integrationStatusSuccesfull2);

        //PARA FECHAR A LISTA
        esperarElementoWeb(integrationStatusInput);
        esperarElementoClicvel(integrationStatusInput);
        ((SeleniumRobotsTool) driverWEB).getElement(integrationStatusInput).sendKeys(Keys.TAB);


        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(3000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);




        addLog(scenario, "Etapa: Selecionar Data Inicial e Data Final, Style Sucesso");
        driverWEB.ScrollToObject(botaoAddFiltroColunaColor);
        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse2);
        esperarElementoClicvel(inputFilterSubclasse2);
        driverWEB.setText(inputFilterSubclasse2, "Submit Status Time");

        esperarElementoWeb(filterSelecionarOptionSubmitStatus);
        esperarElementoClicvel(filterSelecionarOptionSubmitStatus);
        driverWEB.click(filterSelecionarOptionSubmitStatus);

        esperarElementoWeb(custom2);
        esperarElementoClicvel(custom2);
        driverWEB.click(custom2);

        esperarElementoWeb(inputDataIncial2);
        esperarElementoClicvel(inputDataIncial2);
        driverWEB.setText(inputDataIncial2, dataInicial);

        esperarElementoWeb(inputDataFinal2);
        esperarElementoClicvel(inputDataFinal2);
        driverWEB.setText(inputDataFinal2, dataFinal);

        esperarElementoWeb(description);
        esperarElementoClicvel(description);
        driverWEB.click(description);
        Thread.sleep(4000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);


        //size

        driverWEB.ScrollToObject(botaoAddFiltroColunaColor);
        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse2);
        esperarElementoClicvel(inputFilterSubclasse2);
        driverWEB.setText(inputFilterSubclasse2, "Size Range");

        esperarElementoWeb(filterSelecionarOptionSizeRange);
        esperarElementoClicvel(filterSelecionarOptionSizeRange);
        driverWEB.click(filterSelecionarOptionSizeRange);

        esperarElementoWeb(inputFilterSizeRange);
        esperarElementoClicvel(inputFilterSizeRange);
        //driverWEB.click(inputFilterSizeRange);
        driverWEB.setText(inputFilterSizeRange, "UNICO");

        esperarElementoWeb(filterSelecionarASizeRange);
        esperarElementoClicvel(filterSelecionarASizeRange);
        driverWEB.click(filterSelecionarASizeRange);

        esperarElementoWeb(inputFilterSizeRange);
        esperarElementoClicvel(inputFilterSizeRange);
        ((SeleniumRobotsTool) driverWEB).getElement(inputFilterSizeRange).sendKeys(Keys.TAB);

        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(3000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);


        addLog(scenario, "Etapa: Selecionar Copy");
        // Refresh
        driverWEB.click(botaoRefreshh);
        Thread.sleep(3000);

        // Copy item Style Preencher brand e clic em save
        driverWEB.ScrollToObject(botaoCopy);
        esperarElementoWeb(botaoCopy);
        esperarElementoClicvel(botaoCopy);
        driverWEB.getElement(botaoCopy);
        Thread.sleep(3000);

        driverWEB.click(botaoCopy);
        Thread.sleep(4000);

        esperarElementoWeb(inputTemplates);
        esperarElementoClicvel(inputTemplates);
        ((SeleniumRobotsTool) driverWEB).getElement(inputTemplates).sendKeys("Copy_Style");
        //Thread.sleep(2000);

        esperarElementoWeb(templateCopyStyleOption);
        esperarElementoClicvel(templateCopyStyleOption);
        driverWEB.click(templateCopyStyleOption);


        // Colorways select none
        esperarElementoWeb(clicSetaCampoColorways);
        esperarElementoClicvel(clicSetaCampoColorways);
        driverWEB.click(clicSetaCampoColorways);

        esperarElementoWeb(clicCampoColorways);
        esperarElementoClicvel(clicCampoColorways);
        driverWEB.click(clicCampoColorways);
        Thread.sleep(2000);

        esperarElementoWeb(selectNone);
        esperarElementoClicvel(selectNone);
        driverWEB.click(selectNone); // selectNone
        Thread.sleep(2000);

        //MARCA
        esperarElementoWeb(campoMarcaTemplateCopy);
        esperarElementoClicvel(campoMarcaTemplateCopy);
        driverWEB.click(campoMarcaTemplateCopy);

        esperarElementoWeb(inputMarcaTemplateCopy);
        esperarElementoClicvel(inputMarcaTemplateCopy);
        ((SeleniumRobotsTool) driverWEB).getElement(inputMarcaTemplateCopy).sendKeys("ACCESSORIES");


        esperarElementoWeb(botaoSave);
        esperarElementoClicvel(botaoSave);
        driverWEB.click(botaoSave);
        Thread.sleep(6000);

        // Select item
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waittt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waittt.until(ExpectedConditions.elementToBeClickable(By.xpath(selecionarItemCopiadoAcessorios)));




        esperarElementoInvisivel(By.xpath("//div[@data-dojo-attach-point='outerContainerNode']"));



        esperarElementoWeb(selecionarItemCopiadoAcessorios);
        driverWEB.ScrollToObject(selecionarItemCopiadoAcessorios);

        esperarElementoClicvel(selecionarItemCopiadoAcessorios);

        driverWEB.click(selecionarItemCopiadoAcessorios);
        Thread.sleep(8000);

    }


    public void filtraSucessoDataItemFeminino(String view, String dataInicial, String dataFinal, String Brand) throws Exception {

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(botaoRefreshh)));

        addLog(scenario, "Etapa: Selecionar viewer cadastro de Itens");
        selecionarViewer(view);
        Thread.sleep(1000);
        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(2000);

        addLog(scenario, "Integration Status = Successful");


        esperarElementoWeb(btnHabilitarFiltroSubclass);
        esperarElementoClicvel(btnHabilitarFiltroSubclass);
        driverWEB.click(btnHabilitarFiltroSubclass);

        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse);
        esperarElementoClicvel(inputFilterSubclasse);
        //esperarElementoWeb(filterSelecionarOptionIntegrationStatus);
        //esperarElementoClicvel(filterSelecionarOptionIntegrationStatus);
        //driverWEB.click(inputFilterSubclasse);
        driverWEB.setText(inputFilterSubclasse, "Integration Status");



        esperarElementoWeb(filterSelecionarOptionIntegrationStatus);
        esperarElementoClicvel(filterSelecionarOptionIntegrationStatus);
        driverWEB.click(filterSelecionarOptionIntegrationStatus);


        driverWEB.ScrollToObject(integrationStatusSucessfull3);
        esperarElementoWeb(integrationStatusSucessfull3);
        esperarElementoClicvel(integrationStatusSucessfull3);
        driverWEB.click(integrationStatusSucessfull3);

        esperarElementoWeb(integrationStatusInput);
        esperarElementoClicvel(integrationStatusInput);
        ((SeleniumRobotsTool) driverWEB).getElement(integrationStatusInput).sendKeys(Keys.TAB);


        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(3000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);




        addLog(scenario, "Etapa: Selecionar Data Inicial e Data Final, Style Sucesso");
        driverWEB.ScrollToObject(botaoAddFiltroColunaColor);
        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse2);
        esperarElementoClicvel(inputFilterSubclasse2);
        driverWEB.setText(inputFilterSubclasse2, "Submit Status Time");

        esperarElementoWeb(filterSelecionarOptionSubmitStatus);
        esperarElementoClicvel(filterSelecionarOptionSubmitStatus);
        driverWEB.click(filterSelecionarOptionSubmitStatus);

        esperarElementoWeb(custom2);
        esperarElementoClicvel(custom2);
        driverWEB.click(custom2);

        esperarElementoWeb(inputDataIncial2);
        esperarElementoClicvel(inputDataIncial2);
        driverWEB.setText(inputDataIncial2, dataInicial);

        esperarElementoWeb(inputDataFinal2);
        esperarElementoClicvel(inputDataFinal2);
        driverWEB.setText(inputDataFinal2, dataFinal);

        esperarElementoWeb(description);
        esperarElementoClicvel(description);
        driverWEB.click(description);
        Thread.sleep(4000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);


        //size

        driverWEB.ScrollToObject(botaoAddFiltroColunaColor);
        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse2);
        esperarElementoClicvel(inputFilterSubclasse2);
        driverWEB.setText(inputFilterSubclasse2, "Size Range");

        esperarElementoWeb(filterSelecionarOptionSizeRange);
        esperarElementoClicvel(filterSelecionarOptionSizeRange);
        driverWEB.click(filterSelecionarOptionSizeRange);

        esperarElementoWeb(inputFilterSizeRange);
        esperarElementoClicvel(inputFilterSizeRange);
        //driverWEB.click(inputFilterSizeRange);
        driverWEB.setText(inputFilterSizeRange, "PP-GG  (Desenv: M) | (PreProd: P)");

        esperarElementoWeb(filterSelecionarASizeRange);
        esperarElementoClicvel(filterSelecionarASizeRange);
        driverWEB.click(filterSelecionarASizeRange);

        esperarElementoWeb(inputFilterSizeRange);
        esperarElementoClicvel(inputFilterSizeRange);
        ((SeleniumRobotsTool) driverWEB).getElement(inputFilterSizeRange).sendKeys(Keys.TAB);

        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(3000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);


        addLog(scenario, "Etapa: Selecionar Copy");
        // Refresh
        driverWEB.click(botaoRefreshh);
        Thread.sleep(3000);

        // Copy item Style Preencher brand e clic em save
        driverWEB.ScrollToObject(botaoCopy);
        esperarElementoWeb(botaoCopy);
        esperarElementoClicvel(botaoCopy);
        driverWEB.getElement(botaoCopy);
        Thread.sleep(3000);

        driverWEB.click(botaoCopy);
        Thread.sleep(4000);





        esperarElementoWeb(inputTemplates);
        esperarElementoClicvel(inputTemplates);
        ((SeleniumRobotsTool) driverWEB).getElement(inputTemplates).sendKeys("Copy_Style");
        //Thread.sleep(2000);

        esperarElementoWeb(templateCopyStyleOption);
        esperarElementoClicvel(templateCopyStyleOption);
        driverWEB.click(templateCopyStyleOption);


        // Colorways select none
        esperarElementoWeb(clicSetaCampoColorways);
        esperarElementoClicvel(clicSetaCampoColorways);
        driverWEB.click(clicSetaCampoColorways);

        esperarElementoWeb(clicCampoColorways);
        esperarElementoClicvel(clicCampoColorways);
        driverWEB.click(clicCampoColorways);
        Thread.sleep(2000);

        esperarElementoWeb(selectNone);
        esperarElementoClicvel(selectNone);
        driverWEB.click(selectNone); // selectNone
        Thread.sleep(2000);

        //MARCA
        esperarElementoWeb(campoMarcaTemplateCopy);
        esperarElementoClicvel(campoMarcaTemplateCopy);
        driverWEB.click(campoMarcaTemplateCopy);

        esperarElementoWeb(inputMarcaTemplateCopy);
        esperarElementoClicvel(inputMarcaTemplateCopy);
        ((SeleniumRobotsTool) driverWEB).getElement(inputMarcaTemplateCopy).sendKeys("BLUE STEEL MODAL");


        esperarElementoWeb(botaoSave);
        esperarElementoClicvel(botaoSave);
        driverWEB.click(botaoSave);
        Thread.sleep(6000);

        // Select item
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waittt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waittt.until(ExpectedConditions.elementToBeClickable(By.xpath(selecionarItemCopiadoFeminino)));

        //driverWEB.waitObject(selecionarItemCopiado, 8);




        esperarElementoInvisivel(By.xpath("//div[@data-dojo-attach-point='outerContainerNode']"));



        esperarElementoWeb(selecionarItemCopiadoFeminino);
        driverWEB.ScrollToObject(selecionarItemCopiadoFeminino);

        esperarElementoClicvel(selecionarItemCopiadoFeminino);

        driverWEB.click(selecionarItemCopiadoFeminino);
        Thread.sleep(8000);


    }


    // Seleciona Style Sucesso, DataTime e Size Range. Cria 3 POs cada uma por cor.
    public void filtraSucessoDataVariavel(String ViewPlm, String pack, String viwerRennerPO, String anocor1, String semanaComercialcor1, String anocor2, String semanaComercialcor2, String anocor3, String semanaComercialcor3, String wareHouseStor, String poModel, String quantidadesPorTamanhoPP, String quantidadesPorTamanhoP, String quantidadesPorTamanhoM, String quantidadesPorTamanhoG, String quantidadesPorTamanhoGG, String OrderCase, String packQuantity, String itemPaiCode, String naoValidarOtb) throws Exception {

        String viwerRennerPOO = viwerRennerPO;
        String naoValidarOtbb = naoValidarOtb;

        addLog(scenario, "Etapa: Selecionar viewer cadastro de Itens");
        selecionarViewerVariavel(ViewPlm);

        addLog(scenario, "Etapa: Selecionar Style Sucesso");
        // selecionar sucesso no campo Integration status
        driverWEB.waitObject(clicIntegrationStatus, 12);
        Thread.sleep(1000);
        driverWEB.doubleClick(clicIntegrationStatus);
        Thread.sleep(1000);
        //driverWEB.loadElement((WebElement) driverWEB.getElement(integrationStatusInput));
        driverWEB.waitObject(integrationStatusInput, 12);
        Thread.sleep(1000);
        driverWEB.doubleClick(clicIntegrationStatus);
        Thread.sleep(1000);
        //driverWEB.loadElement((WebElement) driverWEB.getElement(integrationStatusInput));
        driverWEB.setText(integrationStatusInput, "Successful");
        Thread.sleep(3000);
        driverWEB.click("//input[@value='RNR_StatusInteg:4']");
        // Clic Text integration Status
        driverWEB.click(textIntegrationStatus);
        Thread.sleep(4000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text integration Status
        driverWEB.click(textIntegrationStatus);
        Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Copy");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

        // Verificar se é PO Pack ou SKU
        if (pack.equals("sim")) {
            // True for Pack
            int y = 3;
            for (int x = 0; x < y; x++) {

                // Clicar em Sourcing
                driverWEB.waitObject(abaSourcing, 6);
                driverWEB.click(abaSourcing);
                Thread.sleep(2000);

                // Clicar em POs
                driverWEB.waitObject(abaPOs, 6);
                driverWEB.click(abaPOs);
                Thread.sleep(2000);

                // Clicar Supplier POs
                driverWEB.waitObject(abaSupplierPOs, 6);
                driverWEB.click(abaSupplierPOs);

                // New Supplier POs
                driverWEB.waitObject(newSupplierPO, 6);
                driverWEB.click(newSupplierPO);

                // Select Pack
                driverWEB.waitObject(selectPack, 5);
                driverWEB.click(selectPack);
                Thread.sleep(2000);

                // New Supplier POs clic me Next
                driverWEB.click(clicNext);

                // Add Colorway para PO, primeira vez!
                if (x == 0) {
                    driverWEB.waitObject(selectColorway, 5);
                    driverWEB.click(selectColorway);
                }
                // Add Colorway para PO, segunda vez!
                if (x == 1) {
                    driverWEB.waitObject(selectColorwaySegundo, 5);
                    driverWEB.click(selectColorwaySegundo);
                }

                // Add Colorway para PO, segunda vez!
                if (x == 2) {
                    driverWEB.waitObject(selectColorwayTerceiro, 5);
                    driverWEB.click(selectColorwayTerceiro);
                }

                // Finish
                driverWEB.waitObject(finish, 5);
                driverWEB.click(finish);
                Thread.sleep(4000);
                // PACK IF para mudar viewer Renner Importada
                if (viwerRennerPOO.equals("Renner PO Importada")) {

                    // Select Viewer Renner PO Importada
                    selecionarViewerRennerNacional(viwerRennerPOO);
                    Thread.sleep(2000);

                    // Refresh
                    Thread.sleep(1000);
                    driverWEB.click(botaoRefreshSupplierPOLatam);
                    Thread.sleep(2000);

                    //Order Origin:
                    //informarPaisLatamNew("China");

                    // Add ano e semana para cor 1
                    if (x == 0) {

                        Thread.sleep(1000);
                        yearNewImportado(anocor1);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekImportado(semanaComercialcor1);
                        Thread.sleep(2000);

                    }
                    // Add ano e semana para cor 2
                    if (x == 1) {

                        Thread.sleep(1000);
                        yearNewImportado(anocor2);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekImportado(semanaComercialcor2);
                        Thread.sleep(2000);
                    }
                    // Add ano e semana 3
                    if (x == 2) {

                        Thread.sleep(1000);
                        yearNewImportado(anocor3);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekImportado(semanaComercialcor3);
                        Thread.sleep(2000);

                    }

                    // Supplier PO PO/Model
                    Thread.sleep(1000);
                    informarPOModelImportado(poModel);
                    Thread.sleep(2000);

                    //Location Type Pack
                    driverWEB.click(locationTypePack);
                    //driverWEB.setText(inputValorLocationType, "Store");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorLocationType).sendKeys("");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorLocationType).sendKeys("Store");
                    Thread.sleep(2000);
                    driverWEB.doubleClick(locationTypeText);
                    Thread.sleep(3000);

                    // Se RMS LATAM então habilitar  WarehouseStore
                    if (poModel.equals("RMS LATAM")) {
                        //WarehouseStore
                        Thread.sleep(1000);
                        informarWarehouseStoreImportado(wareHouseStor);
                        Thread.sleep(6000);
                    }
                    // Modal: Air, PO Importada Pack
                    driverWEB.click(poModelAirPack);
                    //driverWEB.setText(inputValorPoModelAir, "Air");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAir).sendKeys("");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAir).sendKeys("Air");
                    Thread.sleep(1000);
                    driverWEB.click(poModelAirText);
                    Thread.sleep(3000);

                    // External Local: SHANGAI-CHINA, PO Importada Pack
                    driverWEB.click(poExternalLocalPack);
                    Thread.sleep(1000);
                    //driverWEB.setText(inputValorPoExternalLocal, "SHANGHAI - CHINA");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocal).sendKeys("");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocal).sendKeys("SHANGHAI - CHINA");
                    Thread.sleep(1000);
                    driverWEB.click(poExternalLocalText);
                    Thread.sleep(2000);

                    // TRade: Outros, PO Importada Pack
                    driverWEB.click(poTradePack);
                    //driverWEB.setText(inputValorPoTrade, "Outros");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTrade).sendKeys("");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTrade).sendKeys("Outros");
                    Thread.sleep(1000);
                    driverWEB.click(poTradeText);
                    Thread.sleep(2000);

                    //Factory
                    driverWEB.click(poFactory);
                    //driverWEB.setText(inputValorFactory, "LI & FUNG TRADING LTD - 237388");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactory).sendKeys("");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactory).sendKeys("LI & FUNG TRADING LTD - 237388");
                    Thread.sleep(1000);
                    driverWEB.click(poFactoryText);
                    Thread.sleep(3000);

                    // OTB
                    if (naoValidarOtbb.equals("sim")) {
                        Thread.sleep(1000);
                        driverWEB.click(naoValidarOTB);
                        Thread.sleep(1000);
                    }

                    // Refresh
                    Thread.sleep(1000);
                    driverWEB.click(botaoRefreshSupplierPOLatam);
                    Thread.sleep(4000);

                    // Scroll Right
                    Thread.sleep(3000);
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
                    Thread.sleep(2000);

                    // Clic PP Text pg
                    Thread.sleep(2000);
                    // Clic mouse PP text/input
                    WebDriver driverPP = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicPP = driverPP.findElement(By.xpath("//*[@data-csi-heading-vi='0']"));
                    // Instantiating ActionsPP Class
                    Actions actionspp = new Actions(driverPP);
                    // Hovering on clicPPtext
                    actionspp.moveToElement(clicPP);
                    // build() - used to complie all the actions
                    actionspp.click().build().perform();
                    Thread.sleep(1000);
                    // Clic PP Text pg
                    driverWEB.click(ppText);
                    Thread.sleep(2000);
                    actionspp.click().build().perform();
                    Thread.sleep(1000);
                    // Clic PP Text pg
                    driverWEB.click(ppText);
                    Thread.sleep(1000);
                    actionspp.click().build().perform();
                    // XPath
                    //driverWEB.click(selectCampoPP);
                    Thread.sleep(1000);
                    driverWEB.waitObject(inputValorpp, 10);
                    // Insert valor no campo OrderQty
                    //driverWEB.setText(inputValorpp, quantidadesPorTamanhoPP);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys(quantidadesPorTamanhoPP);
                    Thread.sleep(1000);
                    // Clic PP Text pg
                    driverWEB.click(ppText);
                    Thread.sleep(1000);

                    // Clic P Text pg
                    Thread.sleep(1000);
                    // Clic mouse P text/input
                    WebDriver driverp = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicP = driverp.findElement(By.xpath("//*[@data-csi-heading-vi='1']"));
                    // Instantiating ActionsP Class
                    Actions actionsp = new Actions(driverp);
                    // Hovering on clic P
                    actionsp.moveToElement(clicP);
                    // build() - used to complie all the actions
                    actionsp.click().build().perform();
                    Thread.sleep(1000);
                    // Clic P Text pg
                    driverWEB.click(pText);
                    Thread.sleep(1000);
                    actionsp.click().build().perform();
                    Thread.sleep(1000);
                    // Clic P Text pg
                    driverWEB.click(pText);
                    Thread.sleep(1000);
                    actionsp.click().build().perform();
                    //driverWEB.click(selectCampoP);
                    Thread.sleep(1000);
                    // XPath
                    driverWEB.waitObject(inputValorp, 10);
                    // Insert valor no campo P
                    //driverWEB.setText(inputValorp, quantidadesPorTamanhoP);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys(quantidadesPorTamanhoP);
                    Thread.sleep(2000);
                    // Clic P Text pg
                    driverWEB.click(pText);
                    Thread.sleep(1000);

                    // Clic M Text pg
                    Thread.sleep(1000);
                    // Clic mouse M text/input
                    WebDriver driverM = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicM = driverM.findElement(By.xpath("//*[@data-csi-heading-vi='2']"));
                    // Instantiating ActionsM Class
                    Actions actionsM = new Actions(driverM);
                    // Hovering on clic M text
                    actionsM.moveToElement(clicM);
                    // build() - used to complie all the actions
                    actionsM.click().build().perform();
                    Thread.sleep(1000);
                    // Clic M Text pg
                    driverWEB.click(mText);
                    Thread.sleep(1000);
                    actionsM.click().build().perform();
                    Thread.sleep(1000);
                    // Clic M Text pg
                    driverWEB.click(mText);
                    Thread.sleep(2000);
                    actionsM.click().build().perform();
                    // Clic M
                    //driverWEB.click(selectCampoM);
                    Thread.sleep(1000);
                    // XPath
                    driverWEB.waitObject(inputValorm, 10);
                    // Insert valor no campo M
                    //driverWEB.setText(inputValorm, quantidadesPorTamanhoM);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys(quantidadesPorTamanhoM);
                    Thread.sleep(2000);
                    // Clic M Text pg
                    driverWEB.click(mText);
                    Thread.sleep(1000);

                    // Clic G Text pg
                    Thread.sleep(1000);
                    // Clic mouse G text/input
                    WebDriver driverG = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicG = driverG.findElement(By.xpath("//*[@data-csi-heading-vi='3']"));
                    // Instantiating Actions Class
                    Actions actionsG = new Actions(driverG);
                    // Hovering on clicGtext
                    actionsG.moveToElement(clicG);
                    // build() - used to complie all the actions
                    actionsG.click().build().perform();
                    Thread.sleep(1000);

                    // Clic G Text pg
                    driverWEB.click(gText);
                    Thread.sleep(1000);
                    actionsG.click().build().perform();
                    Thread.sleep(1000);
                    // Clic G Text pg
                    driverWEB.click(gText);
                    Thread.sleep(1000);
                    actionsG.click().build().perform();
                    //driverWEB.click(selectCampoG);
                    Thread.sleep(1000);
                    // XPath
                    driverWEB.waitObject(inputValorg, 10);
                    // Insert valor no campo G
                    //driverWEB.setText(inputValorg, quantidadesPorTamanhoG);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys(quantidadesPorTamanhoG);
                    Thread.sleep(1000);
                    // Clic G Text pg
                    driverWEB.click(gText);
                    Thread.sleep(1000);

                    // Clic GG Text pg
                    Thread.sleep(1000);
                    // Clic mouse GG text/input
                    WebDriver driverGG = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicGG = driverGG.findElement(By.xpath("//*[@data-csi-heading-vi='4']"));
                    // Instantiating Actions Class
                    Actions actionsGG = new Actions(driverGG);
                    // Hovering on clicGGtext
                    actionsGG.moveToElement(clicGG);
                    // build() - used to complie all the actions
                    actionsGG.click().build().perform();
                    Thread.sleep(1000);
                    // Clic GG Text pg
                    driverWEB.click(ggText);
                    Thread.sleep(1000);
                    actionsGG.click().build().perform();
                    Thread.sleep(1000);
                    // Clic GG Text pg
                    driverWEB.click(ggText);
                    Thread.sleep(1000);
                    actionsGG.click().build().perform();
                    //driverWEB.click(selectCampoGG);
                    Thread.sleep(1000);
                    // XPath
                    driverWEB.waitObject(inputValorgg, 10);
                    // Insert valor no campo OrderQty
                    //driverWEB.setText(inputValorgg, quantidadesPorTamanhoGG);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorgg).sendKeys(quantidadesPorTamanhoGG);
                    Thread.sleep(1000);
                    // Clic GG Text pg
                    driverWEB.click(ggText);
                    Thread.sleep(1000);

                    // Order Case
                    driverWEB.click(orderCase);
                    Thread.sleep(3000);
                    // Clic mouse OrderQty text/input
                    WebDriver driverOrderCase = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicOrderCase = driverOrderCase.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]"));
                    // Instantiating Actions Class
                    Actions actionss = new Actions(driverOrderCase);
                    // Hovering on clicOrderQtytext
                    actionss.moveToElement(clicOrderCase);
                    // build() - used to complie all the actions
                    actionss.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);
                    actionss.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);
                    actionss.click().build().perform();

                    // XPath
                    driverWEB.waitObject(inputOrderCase, 10);
                    // Insert valor no campo OrderQty
                    //driverWEB.setText(inputOrderCase, OrderCase);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys(OrderCase);
                    Thread.sleep(2000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);

                    // Pack Qty
                    driverWEB.click(packQty);
                    Thread.sleep(3000);
                    // Clic mouse OrderQty text/input
                    WebDriver driverPackQty = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicPackQtyte = driverPackQty.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'UnitPerPack::0')]"));
                    // Instantiating Actions Class
                    Actions actions = new Actions(driverPackQty);
                    // Hovering on clicOrderQtytext
                    actions.moveToElement(clicPackQtyte);
                    // build() - used to complie all the actions
                    actions.click().build().perform();
                    Thread.sleep(1000);
                    // Clic Order Qty Text pg
                    driverWEB.click(packQtyText);
                    Thread.sleep(2000);
                    actions.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Qty Text pg
                    driverWEB.click(packQtyText);
                    Thread.sleep(2000);
                    actions.click().build().perform();

                    // XPath
                    driverWEB.waitObject(inputValorPackQty, 10);
                    // Insert valor no campo OrderQty
                    //driverWEB.setText(inputValorPackQty, packQuantity);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys(packQuantity);
                    Thread.sleep(2000);

                    // Clic Pack Qty Text pg
                    driverWEB.click(packQtyText);
                    Thread.sleep(1000);

                    // Selecionar Linha
                    addLog(scenario, "Etapa: Selecionar Linha PO");
                    // Scroll Right
                    Thread.sleep(3000);
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
                    Thread.sleep(2000);
                    driverWEB.ScrollToObject(selecionarLinhaPo);
                    //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
                    driverWEB.click(selecionarLinhaPo);
                    Thread.sleep(3000);

                    // F5 page
                    ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
                    //((SeleniumRobotsTool)driverWEB).refreshPage();
                    Thread.sleep(4000);

                    // Save link PO
                    addLog(scenario, "Etapa: Link do PLM Pedido Criado: ");
                    WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
                    driver.getCurrentUrl();
                    addLog(scenario, driver.getCurrentUrl());

                    // Submitted
                    driverWEB.waitObject(statePo, 10);
                    driverWEB.click(statePo);
                    driverWEB.waitObject(statePo, 10);
                    driverWEB.clearField(inputStatePo);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
                    Thread.sleep(2000);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
                    Thread.sleep(2000);
                    driverWEB.click("//div[contains(text(),'Integration Status')]");
                    Thread.sleep(4000);

                    // Refresh
                    driverWEB.click(botaoRefreshSupplierPOLatam);
                    Thread.sleep(2000);

                    // Clicar no campo Base Product, retorna adicionar PO
                    driverWEB.click(clicBaseProduct);
                    Thread.sleep(2000);

                }

                // PACK IF para mudar viewer Renner Nacional
                else if (viwerRennerPOO.equals("Renner PO Nacional")) {

                    // Select Viewer Renner PO Nacional
                    selecionarViewerRennerNacional(viwerRennerPOO);
                    Thread.sleep(2000);

                    // Add ano e semana para cor 1
                    if (x == 0) {

                        Thread.sleep(1000);
                        yearNacional(anocor1);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekNacional(semanaComercialcor1);
                        Thread.sleep(2000);

                    }
                    // Add ano semana para a  cor 2
                    if (x == 1) {

                        Thread.sleep(1000);
                        yearNacional(anocor2);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekNacional(semanaComercialcor2);
                        Thread.sleep(2000);
                    }
                    // Add ano e semana para cor 3
                    if (x == 2) {

                        Thread.sleep(1000);
                        yearNacional(anocor3);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekNacional(semanaComercialcor3);
                        Thread.sleep(2000);

                    }

                    //WarehouseStore
                    informarWarehouseStore(wareHouseStor);

                    // Supplier PO PO/Model
                    informarPOModel(poModel);
                    Thread.sleep(1000);

                    // PO Type
                    if (x == 0) {
                        driverWEB.click(poTypeNacional);
                        //driverWEB.setText(inputValorPOTypeNacional, "Normal");
                        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeNacional).sendKeys("");
                        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeNacional).sendKeys("Normal");
                        Thread.sleep(1000);
                        driverWEB.click(poTypeNacionalText);
                        Thread.sleep(3000);
                    }
                    if (x == 1) {
                        driverWEB.click(poTypeNacionalSegundo);
                        //driverWEB.setText(inputValorPOTypeNacional, "Normal");
                        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeNacional).sendKeys("");
                        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeNacional).sendKeys("Normal");
                        Thread.sleep(1000);
                        driverWEB.click(poTypeNacionalText);
                        Thread.sleep(3000);
                    }
                    if (x == 2) {
                        driverWEB.click(poTypeNacionalSegundo);
                        //driverWEB.setText(inputValorPOTypeNacional, "Normal");
                        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeNacional).sendKeys("");
                        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeNacional).sendKeys("Normal");
                        Thread.sleep(1000);
                        driverWEB.click(poTypeNacionalText);
                        Thread.sleep(3000);
                    }

                    // OTB
                    if (naoValidarOtbb.equals("sim")) {
                        driverWEB.click(naoValidarOTB);
                    }

                    // Refresh
                    driverWEB.click(botaoRefreshSupplierPO);
                    Thread.sleep(2000);

                    // Scroll Right
                    Thread.sleep(2000);
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
                    Thread.sleep(2000);

                    // Clic PP Text pg
                    Thread.sleep(4000);
                    // Clic mouse PP text/input
                    WebDriver driverPP = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicPP = driverPP.findElement(By.xpath("//*[@data-csi-heading-vi='0']"));
                    // Instantiating ActionsPP Class
                    Actions actionspp = new Actions(driverPP);
                    // Hovering on clicPPtext
                    actionspp.moveToElement(clicPP);
                    //build() - used to complie all the actions
                    actionspp.click().build().perform();
                    Thread.sleep(1000);
                    // Clic PP Text pg
                    driverWEB.click(ppText);
                    Thread.sleep(2000);
                    actionspp.click().build().perform();
                    Thread.sleep(1000);
                    // Clic PP Text pg
                    driverWEB.click(ppText);
                    Thread.sleep(2000);
                    actionspp.click().build().perform();
                    // XPath
                    //driverWEB.click(selectCampoPP);
                    Thread.sleep(2000);
                    driverWEB.waitObject(inputValorpp, 10);
                    // Insert valor no campo OrderQty
                    //driverWEB.setText(inputValorpp, quantidadesPorTamanhoPP);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys(quantidadesPorTamanhoPP);
                    Thread.sleep(2000);
                    // Clic PP Text pg
                    driverWEB.click(ppText);
                    Thread.sleep(2000);

                    // Clic P Text pg
                    Thread.sleep(2000);
                    // Clic mouse P text/input
                    WebDriver driverp = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicP = driverp.findElement(By.xpath("//*[@data-csi-heading-vi='1']"));
                    // Instantiating ActionsP Class
                    Actions actionsp = new Actions(driverp);
                    // Hovering on clic P
                    actionsp.moveToElement(clicP);
                    // build() - used to complie all the actions
                    actionsp.click().build().perform();
                    Thread.sleep(1000);
                    // Clic P Text pg
                    driverWEB.click(pText);
                    Thread.sleep(2000);
                    actionsp.click().build().perform();
                    Thread.sleep(1000);
                    // Clic P Text pg
                    driverWEB.click(pText);
                    Thread.sleep(2000);
                    actionsp.click().build().perform();
                    //driverWEB.click(selectCampoP);
                    Thread.sleep(2000);
                    // XPath
                    driverWEB.waitObject(inputValorp, 10);
                    // Insert valor no campo P
                    //driverWEB.setText(inputValorp, quantidadesPorTamanhoP);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys(quantidadesPorTamanhoP);
                    Thread.sleep(2000);
                    // Clic P Text pg
                    driverWEB.click(pText);
                    Thread.sleep(2000);

                    // Clic M Text pg
                    Thread.sleep(2000);
                    // Clic mouse M text/input
                    WebDriver driverM = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicM = driverM.findElement(By.xpath("//*[@data-csi-heading-vi='2']"));
                    // Instantiating ActionsM Class
                    Actions actionsM = new Actions(driverM);
                    // Hovering on clic M text
                    actionsM.moveToElement(clicM);
                    // build() - used to complie all the actions
                    actionsM.click().build().perform();
                    Thread.sleep(1000);
                    // Clic M Text pg
                    driverWEB.click(mText);
                    Thread.sleep(2000);
                    actionsM.click().build().perform();
                    Thread.sleep(1000);
                    // Clic M Text pg
                    driverWEB.click(mText);
                    Thread.sleep(2000);
                    actionsM.click().build().perform();
                    // Clic M
                    //driverWEB.click(selectCampoM);
                    Thread.sleep(2000);
                    // XPath
                    driverWEB.waitObject(inputValorm, 10);
                    // Insert valor no campo M
                    //driverWEB.setText(inputValorm, quantidadesPorTamanhoM);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys(quantidadesPorTamanhoM);
                    Thread.sleep(2000);
                    // Clic M Text pg
                    driverWEB.click(mText);
                    Thread.sleep(2000);

                    // Clic G Text pg
                    Thread.sleep(2000);
                    // Clic mouse G text/input
                    WebDriver driverG = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicG = driverG.findElement(By.xpath("//*[@data-csi-heading-vi='3']"));
                    // Instantiating Actions Class
                    Actions actionsG = new Actions(driverG);
                    // Hovering on clicGtext
                    actionsG.moveToElement(clicG);
                    // build() - used to complie all the actions
                    actionsG.click().build().perform();
                    Thread.sleep(1000);

                    // Clic G Text pg
                    driverWEB.click(gText);
                    Thread.sleep(2000);
                    actionsG.click().build().perform();
                    Thread.sleep(1000);
                    // Clic G Text pg
                    driverWEB.click(gText);
                    Thread.sleep(2000);
                    actionsG.click().build().perform();
                    //driverWEB.click(selectCampoG);
                    Thread.sleep(2000);
                    // XPath
                    driverWEB.waitObject(inputValorg, 10);
                    // Insert valor no campo G
                    //driverWEB.setText(inputValorg, quantidadesPorTamanhoG);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys(quantidadesPorTamanhoG);
                    Thread.sleep(2000);
                    // Clic G Text pg
                    driverWEB.click(gText);
                    Thread.sleep(2000);

                    // Clic GG Text pg
                    Thread.sleep(2000);
                    // Clic mouse GG text/input
                    WebDriver driverGG = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicGG = driverGG.findElement(By.xpath("//*[@data-csi-heading-vi='4']"));
                    // Instantiating Actions Class
                    Actions actionsGG = new Actions(driverGG);
                    // Hovering on clicGGtext
                    actionsGG.moveToElement(clicGG);
                    // build() - used to complie all the actions
                    actionsGG.click().build().perform();
                    Thread.sleep(1000);
                    // Clic GG Text pg
                    driverWEB.click(ggText);
                    Thread.sleep(2000);
                    actionsGG.click().build().perform();
                    Thread.sleep(1000);
                    // Clic GG Text pg
                    driverWEB.click(ggText);
                    Thread.sleep(2000);
                    actionsGG.click().build().perform();
                    //driverWEB.click(selectCampoGG);
                    Thread.sleep(2000);
                    // XPath
                    driverWEB.waitObject(inputValorgg, 10);
                    // Insert valor no campo OrderQty
                    //driverWEB.setText(inputValorgg, quantidadesPorTamanhoGG);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorgg).sendKeys(quantidadesPorTamanhoGG);
                    Thread.sleep(2000);
                    // Clic GG Text pg
                    driverWEB.click(ggText);
                    Thread.sleep(2000);

                    // Order Case
                    driverWEB.click(orderCase);
                    Thread.sleep(4000);
                    // Clic mouse OrderQty text/input
                    WebDriver driverOrderCase = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicOrderCase = driverOrderCase.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]"));
                    // Instantiating Actions Class
                    Actions actionss = new Actions(driverOrderCase);
                    // Hovering on clicOrderQtytext
                    actionss.moveToElement(clicOrderCase);
                    // build() - used to complie all the actions
                    actionss.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);
                    actionss.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);
                    actionss.click().build().perform();

                    // XPath
                    driverWEB.waitObject(inputOrderCase, 10);
                    // Insert valor no campo OrderQty
                    //driverWEB.setText(inputOrderCase, OrderCase);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys(OrderCase);
                    Thread.sleep(2000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);

                    // Pack Qty
                    driverWEB.click(packQty);
                    Thread.sleep(4000);
                    // Clic mouse OrderQty text/input
                    WebDriver driverPackQty = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicPackQtyte = driverPackQty.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'UnitPerPack::0')]"));
                    // Instantiating Actions Class
                    Actions actions = new Actions(driverPackQty);
                    // Hovering on clicOrderQtytext
                    actions.moveToElement(clicPackQtyte);
                    // build() - used to complie all the actions
                    actions.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Qty Text pg
                    driverWEB.click(packQtyText);
                    Thread.sleep(2000);
                    actions.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Qty Text pg
                    driverWEB.click(packQtyText);
                    Thread.sleep(2000);
                    actions.click().build().perform();

                    // XPath
                    driverWEB.waitObject(inputValorPackQty, 10);
                    // Insert valor no campo OrderQty
                    //driverWEB.setText(inputValorPackQty, packQuantity);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys(packQuantity);
                    Thread.sleep(2000);

                    // Clic Pack Qty Text pg
                    driverWEB.click(packQtyText);
                    Thread.sleep(2000);

                    // Selecionar Linha
                    addLog(scenario, "Etapa: Selecionar Linha PO");

                    // Scroll Right
                    Thread.sleep(3000);
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
                    Thread.sleep(2000);
                    driverWEB.ScrollToObject(selecionarLinhaPo);
                    //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
                    driverWEB.click(selecionarLinhaPo);
                    Thread.sleep(3000);

                    // F5 page
                    ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
                    //((SeleniumRobotsTool)driverWEB).refreshPage();
                    Thread.sleep(4000);

                    // Save link PO
                    addLog(scenario, "Etapa: Link do PLM Pedido Criado: ");
                    WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
                    driver.getCurrentUrl();
                    addLog(scenario, driver.getCurrentUrl());

                    // Submitted
                    driverWEB.waitObject(statePo, 10);
                    driverWEB.click(statePo);
                    driverWEB.waitObject(statePo, 10);
                    driverWEB.clearField(inputStatePo);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
                    Thread.sleep(2000);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
                    Thread.sleep(2000);
                    driverWEB.click("//div[contains(text(),'Integration Status')]");
                    Thread.sleep(4000);

                    // Refresh
                    driverWEB.click(botaoRefreshSupplierPO);
                    Thread.sleep(2000);

                    // Clicar no campo Base Product, retorna adicionar PO
                    driverWEB.click(clicBaseProduct);
                    Thread.sleep(2000);

                }

            } //End For

        } else {

            // True for SKU
            Thread.sleep(4000);
            int y = 3;
            for (int x = 0; x < y; x++) {

                // Clicar em Sourcing
                driverWEB.waitObject(abaSourcing, 6);
                driverWEB.click(abaSourcing);

                // Clicar em POs
                driverWEB.waitObject(abaPOs, 6);
                driverWEB.click(abaPOs);

                // Clicar Supplier POs
                driverWEB.waitObject(abaSupplierPOs, 6);
                driverWEB.click(abaSupplierPOs);

                // New Supplier POs
                driverWEB.waitObject(newSupplierPO, 6);
                driverWEB.click(newSupplierPO);
                Thread.sleep(2000);

                // New Supplier POs clic me Next
                driverWEB.click(clicNext);
                Thread.sleep(2000);

                // Add Colorway para PO, primeiro
                if (x == 0) {
                    driverWEB.waitObject(selectColorwaySku, 5);
                    driverWEB.click(selectColorwaySku);
                }

                // Add Colorway para PO, segunda vez!
                if (x == 1) {
                    driverWEB.waitObject(selectColorwaySkuSegundo, 5);
                    driverWEB.click(selectColorwaySkuSegundo);
                }

                // Add Colorway para PO, terceira vez!
                if (x == 2) {
                    driverWEB.waitObject(selectColorwaySkuTerceiro, 5);
                    driverWEB.click(selectColorwaySkuTerceiro);
                }

                // Select uma cor e Finish
                driverWEB.click(finish);
                Thread.sleep(4000);

                // SKU IF para mudar viewer Renner Importada
                if (viwerRennerPO.equals("Renner PO Importada")) {

                    // Select Viewer Renner PO Importada
                    selecionarViewerRennerImportadaNew("Renner PO Importada");
                    Thread.sleep(2000);

                    // Refresh
                    driverWEB.click(botaoRefreshSupplierPO);
                    Thread.sleep(1000);

                    // Add ano e semana para cor 1
                    if (x == 0) {

                        Thread.sleep(1000);
                        yearNewImportado(anocor1);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekImportado(semanaComercialcor1);
                        Thread.sleep(2000);

                    }
                    // Add semana e ano cor 2!
                    if (x == 1) {

                        Thread.sleep(1000);
                        yearNewImportado(anocor2);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekImportado(semanaComercialcor2);
                        Thread.sleep(2000);
                    }
                    // Add ano semana para cor 3!
                    if (x == 2) {

                        Thread.sleep(1000);
                        yearNewImportado(anocor3);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekImportado(semanaComercialcor3);
                        Thread.sleep(2000);

                    }
                    // Supplier PO PO/Model
                    informarPOModelImportado(poModel);
                    Thread.sleep(1000);

                    // Se RMS LATAM então habilitar  WarehouseStore
                    if (poModel.equals("RMS LATAM")) {
                        //WarehouseStore
                        driverWEB.click(warehouseStoreText);
                        Thread.sleep(2000);
                        //informarWarehouseStoreImportado(wareHouseStor);
                        driverWEB.click(warehouseStoreImportado);
                        //driverWEB.setText(inputValorWarehouseStoreImportado, wareHouseStor);
                        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportado).sendKeys(wareHouseStor);
                        Thread.sleep(2000);
                        driverWEB.click(warehouseStoreText);
                        Thread.sleep(2000);
                    }

                    // Modal: Air, PO Importada
                    driverWEB.click(poModelAir);
                    //driverWEB.setText(inputValorPoModelAir, "Air");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAir).sendKeys("Air");
                    Thread.sleep(1000);
                    driverWEB.click(poModelAirText);
                    Thread.sleep(2000);

                    // External Local: SHANGAI-CHINA, PO Importada
                    driverWEB.click(poExternalLocal);
                    //driverWEB.setText(inputValorPoExternalLocal, "SHANGHAI - CHINA");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocal).sendKeys("SHANGHAI - CHINA");
                    Thread.sleep(1000);
                    driverWEB.click(poExternalLocalText);
                    Thread.sleep(5000);

                    // TRade: Outros, PO Importada
                    driverWEB.click(poTrade);
                    //driverWEB.setText(inputValorPoTrade, "Outros");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTrade).sendKeys("Outros");
                    Thread.sleep(1000);
                    driverWEB.click(poTradeText);
                    Thread.sleep(2000);

                    // OTB
                    if (naoValidarOtbb.equals("sim")) {
                        Thread.sleep(2000);
                        driverWEB.click(naoValidarOTB);
                        Thread.sleep(1000);
                    }

                    //Factory
                    driverWEB.click(poFactory);
                    //driverWEB.setText(inputValorFactory, "LI & FUNG TRADING LTD - 237388");
                    ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactory).sendKeys("LI & FUNG TRADING LTD - 237388");
                    Thread.sleep(1000);
                    driverWEB.click(poFactoryText);
                    Thread.sleep(2000);

                    // Botao Refresh
                    driverWEB.click(botaoRefreshSupplierPO);
                    Thread.sleep(3000);

                    // Scroll Right
                    Thread.sleep(3000);
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    Thread.sleep(2000);
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    Thread.sleep(2000);
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    Thread.sleep(2000);
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
                    Thread.sleep(2000);

                    // Order Case
                    driverWEB.click(orderCase);
                    Thread.sleep(2000);
                    // Clic mouse OrderQty text/input
                    WebDriver driverOrderCase = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicOrderCase = driverOrderCase.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]"));
                    // Instantiating Actions Class
                    Actions actionss = new Actions(driverOrderCase);
                    // Hovering on clicOrderQtytext
                    actionss.moveToElement(clicOrderCase);
                    // build() - used to complie all the actions
                    actionss.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);
                    actionss.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);
                    actionss.click().build().perform();

                    // XPath
                    driverWEB.waitObject(inputOrderCase, 10);
                    // Insert valor no campo OrderQty
                    //driverWEB.setText(inputOrderCase, OrderCase);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys(OrderCase);
                    Thread.sleep(2000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);

                    //Orders -> Supplier PO Order Qty order
                    informarPOQty(packQuantity);

                    // Selecionar Linha
                    addLog(scenario, "Etapa: Selecionar Linha PO");
                    // Scroll Right
                    Thread.sleep(3000);
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
                    Thread.sleep(2000);
                    driverWEB.ScrollToObject(selecionarLinhaPo);
                    // ((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
                    driverWEB.click(selecionarLinhaPo);
                    Thread.sleep(3000);

                    // F5 page
                    ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
                    //((SeleniumRobotsTool)driverWEB).refreshPage();
                    Thread.sleep(4000);

                    // Save link PO
                    addLog(scenario, "Etapa: Link do PLM Pedido Criado: ");
                    WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
                    driver.getCurrentUrl();
                    addLog(scenario, driver.getCurrentUrl());

                    // Submitted
                    driverWEB.waitObject(statePo, 10);
                    driverWEB.click(statePo);
                    driverWEB.waitObject(statePo, 10);
                    driverWEB.clearField(inputStatePo);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
                    Thread.sleep(2000);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
                    Thread.sleep(2000);
                    driverWEB.click("//div[contains(text(),'Integration Status')]");
                    Thread.sleep(4000);

                    // Refresh
                    driverWEB.click(botaoRefreshSupplierPO);
                    Thread.sleep(2000);

                    // Clicar no campo Base Product, retorna adicionar PO
                    driverWEB.click(clicBaseProduct);
                    Thread.sleep(2000);

                } else if (viwerRennerPO.equals("Renner PO Nacional")) {
                    // Add ano e semana para cor 1
                    if (x == 0) {

                        Thread.sleep(1000);
                        yearNacional(anocor1);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekNacional(semanaComercialcor1);
                        Thread.sleep(2000);

                    }
                    // Add ano semana para cor 2!
                    if (x == 1) {

                        Thread.sleep(1000);
                        yearNacional(anocor2);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekNacional(semanaComercialcor2);
                        Thread.sleep(2000);
                    }
                    // Add ano semana para cor 3!
                    if (x == 2) {

                        Thread.sleep(1000);
                        yearNacional(anocor3);
                        Thread.sleep(2000);

                        //Commercial Week:
                        Thread.sleep(1000);
                        informarCommercialWeekNacional(semanaComercialcor3);
                        Thread.sleep(2000);

                    }
                    //WarehouseStore
                    informarWarehouseStore(wareHouseStor);

                    // Supplier PO PO/Model
                    informarPOModel(poModel);

                    // OTB
                    if (naoValidarOtbb.equals("sim")) {
                        driverWEB.click(naoValidarOTB);
                    }

                    // Scroll Right
                    Thread.sleep(2000);
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
                    Thread.sleep(2000);

                    // Order Case
                    driverWEB.click(orderCase);
                    Thread.sleep(4000);
                    // Clic mouse OrderQty text/input
                    WebDriver driverOrderCase = ((WebDriver) (driverWEB.getDriver()));
                    // Locating the main menu (Parent element)
                    WebElement clicOrderCase = driverOrderCase.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]"));
                    // Instantiating Actions Class
                    Actions actionss = new Actions(driverOrderCase);
                    // Hovering on clicOrderQtytext
                    actionss.moveToElement(clicOrderCase);
                    // build() - used to complie all the actions
                    actionss.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);
                    actionss.click().build().perform();
                    Thread.sleep(1000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);
                    actionss.click().build().perform();

                    // XPath
                    driverWEB.waitObject(inputOrderCase, 10);
                    // Insert valor no campo OrderQty
                    //driverWEB.setText(inputOrderCase, OrderCase);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys(OrderCase);
                    Thread.sleep(2000);

                    // Clic Order Case Text pg
                    driverWEB.click(orderCaseText);
                    Thread.sleep(2000);

                    informarPOQty(packQuantity);
                    //Thread.sleep(3000);

                    // Selecionar Linha
                    addLog(scenario, "Etapa: Selecionar Linha PO");
                    // Scroll Right
                    Thread.sleep(3000);
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
                    Thread.sleep(2000);
                    //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
                    driverWEB.click(selecionarLinhaPo);
                    Thread.sleep(3000);

                    // F5 page
                    ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
                    //((SeleniumRobotsTool)driverWEB).refreshPage();
                    Thread.sleep(4000);

                    // Submitted
                    driverWEB.waitObject(statePo, 10);
                    driverWEB.click(statePo);
                    driverWEB.waitObject(statePo, 10);
                    driverWEB.clearField(inputStatePo);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
                    Thread.sleep(2000);
                    ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
                    Thread.sleep(2000);
                    driverWEB.click("//div[contains(text(),'Integration Status')]");
                    Thread.sleep(4000);

                    // Refresh
                    driverWEB.click(botaoRefreshSupplierPO);
                    Thread.sleep(2000);

                    // Copiar Link PO
                    addLog(scenario, "Etapa: Link do PLM Pedido Criado: ");
                    WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
                    driver.getCurrentUrl();
                    addLog(scenario, driver.getCurrentUrl());

                    // Clicar no campo Base Product, retorna adicionar PO
                    driverWEB.click(clicBaseProduct);
                    Thread.sleep(2000);

                }

            }
        }

    }

    public void filtraSucessoDataIteminfantil(String view, String dataInicial, String dataFinal, String Brand) throws Exception {
        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(botaoRefreshh)));

        addLog(scenario, "Etapa: Selecionar viewer cadastro de Itens");
        selecionarViewer(view);
        Thread.sleep(1000);
        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(2000);

        addLog(scenario, "Integration Status = Successful");


        esperarElementoWeb(btnHabilitarFiltroSubclass);
        esperarElementoClicvel(btnHabilitarFiltroSubclass);
        driverWEB.click(btnHabilitarFiltroSubclass);

        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse);
        esperarElementoClicvel(inputFilterSubclasse);
        //esperarElementoWeb(filterSelecionarOptionIntegrationStatus);
        //esperarElementoClicvel(filterSelecionarOptionIntegrationStatus);
        //driverWEB.click(inputFilterSubclasse);
        driverWEB.setText(inputFilterSubclasse, "Integration Status");



        esperarElementoWeb(filterSelecionarOptionIntegrationStatus);
        esperarElementoClicvel(filterSelecionarOptionIntegrationStatus);
        driverWEB.click(filterSelecionarOptionIntegrationStatus);

        driverWEB.ScrollToObject(integrationStatusSucessfull3);
        esperarElementoWeb(integrationStatusSucessfull3);
        esperarElementoClicvel(integrationStatusSucessfull3);
        driverWEB.click(integrationStatusSucessfull3);

        esperarElementoWeb(integrationStatusInput);
        esperarElementoClicvel(integrationStatusInput);
        ((SeleniumRobotsTool) driverWEB).getElement(integrationStatusInput).sendKeys(Keys.TAB);


        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(3000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);




        addLog(scenario, "Etapa: Selecionar Data Inicial e Data Final, Style Sucesso");
        driverWEB.ScrollToObject(botaoAddFiltroColunaColor);
        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse2);
        esperarElementoClicvel(inputFilterSubclasse2);
        driverWEB.setText(inputFilterSubclasse2, "Submit Status Time");

        esperarElementoWeb(filterSelecionarOptionSubmitStatus);
        esperarElementoClicvel(filterSelecionarOptionSubmitStatus);
        driverWEB.click(filterSelecionarOptionSubmitStatus);

        esperarElementoWeb(custom2);
        esperarElementoClicvel(custom2);
        driverWEB.click(custom2);

        esperarElementoWeb(inputDataIncial2);
        esperarElementoClicvel(inputDataIncial2);
        driverWEB.setText(inputDataIncial2, dataInicial);

        esperarElementoWeb(inputDataFinal2);
        esperarElementoClicvel(inputDataFinal2);
        driverWEB.setText(inputDataFinal2, dataFinal);

        esperarElementoWeb(description);
        esperarElementoClicvel(description);
        driverWEB.click(description);
        Thread.sleep(4000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);


        //size

        driverWEB.ScrollToObject(botaoAddFiltroColunaColor);
        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(inputFilterSubclasse2);
        esperarElementoClicvel(inputFilterSubclasse2);
        driverWEB.setText(inputFilterSubclasse2, "Size Range");

        esperarElementoWeb(filterSelecionarOptionSizeRange);
        esperarElementoClicvel(filterSelecionarOptionSizeRange);
        driverWEB.click(filterSelecionarOptionSizeRange);

        esperarElementoWeb(inputFilterSizeRange);
        esperarElementoClicvel(inputFilterSizeRange);
        //driverWEB.click(inputFilterSizeRange);
        driverWEB.setText(inputFilterSizeRange, "5 - 13/14 (BASE 11-12)");

        esperarElementoWeb(filterSelecionarASizeRange);
        esperarElementoClicvel(filterSelecionarASizeRange);
        driverWEB.click(filterSelecionarASizeRange);

        esperarElementoWeb(inputFilterSizeRange);
        esperarElementoClicvel(inputFilterSizeRange);
        ((SeleniumRobotsTool) driverWEB).getElement(inputFilterSizeRange).sendKeys(Keys.TAB);

        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);
        Thread.sleep(3000);

        esperarElementoWeb(btnShowResultsIntegrationStatus);
        esperarElementoClicvel(btnShowResultsIntegrationStatus);
        driverWEB.click(btnShowResultsIntegrationStatus);
        Thread.sleep(3000);


        addLog(scenario, "Etapa: Selecionar Copy");
        // Refresh
        driverWEB.click(botaoRefreshh);
        Thread.sleep(3000);

        // Copy item Style Preencher brand e clic em save
        driverWEB.ScrollToObject(botaoCopy);
        esperarElementoWeb(botaoCopy);
        esperarElementoClicvel(botaoCopy);
        driverWEB.getElement(botaoCopy);
        Thread.sleep(3000);

        driverWEB.click(botaoCopy);
        Thread.sleep(4000);





        esperarElementoWeb(inputTemplates);
        esperarElementoClicvel(inputTemplates);
        ((SeleniumRobotsTool) driverWEB).getElement(inputTemplates).sendKeys("Copy_Style");
        //Thread.sleep(2000);

        esperarElementoWeb(templateCopyStyleOption);
        esperarElementoClicvel(templateCopyStyleOption);
        driverWEB.click(templateCopyStyleOption);


        // Colorways select none
        esperarElementoWeb(clicSetaCampoColorways);
        esperarElementoClicvel(clicSetaCampoColorways);
        driverWEB.click(clicSetaCampoColorways);

        esperarElementoWeb(clicCampoColorways);
        esperarElementoClicvel(clicCampoColorways);
        driverWEB.click(clicCampoColorways);
        Thread.sleep(2000);

        esperarElementoWeb(selectNone);
        esperarElementoClicvel(selectNone);
        driverWEB.click(selectNone); // selectNone
        Thread.sleep(2000);

        //MARCA
        esperarElementoWeb(campoMarcaTemplateCopy);
        esperarElementoClicvel(campoMarcaTemplateCopy);
        driverWEB.click(campoMarcaTemplateCopy);

        esperarElementoWeb(inputMarcaTemplateCopy);
        esperarElementoClicvel(inputMarcaTemplateCopy);
        ((SeleniumRobotsTool) driverWEB).getElement(inputMarcaTemplateCopy).sendKeys("LICENCIADOS");


        esperarElementoWeb(botaoSave);
        esperarElementoClicvel(botaoSave);
        driverWEB.click(botaoSave);
        Thread.sleep(6000);

        // Select item
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waittt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waittt.until(ExpectedConditions.elementToBeClickable(By.xpath(selecionarItemCopiadoInfantil)));

        //driverWEB.waitObject(selecionarItemCopiado, 8);




        esperarElementoInvisivel(By.xpath("//div[@data-dojo-attach-point='outerContainerNode']"));



        esperarElementoWeb(selecionarItemCopiadoInfantil);
        driverWEB.ScrollToObject(selecionarItemCopiadoInfantil);

        esperarElementoClicvel(selecionarItemCopiadoInfantil);

        driverWEB.click(selecionarItemCopiadoInfantil);
        Thread.sleep(8000);

    }

    public void alterarViewInfantil(String view) throws Exception {
        Thread.sleep(2000);
        driverWEB.click(abaStyle);
        Thread.sleep(2000);
        driverWEB.click(abaPropriedades);
        driverWEB.click(btnRefresh);
        driverWEB.waitObject(botaoView, 10);
        driverWEB.click(botaoView);
        driverWEB.waitObject(inputView, 10);
        driverWEB.clearField(inputView);
        //driverWEB.setText(inputView, view);
        ((SeleniumRobotsTool) driverWEB).getElement(inputView).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputView).sendKeys(view);
        driverWEB.click("//*[@item='1']");
        //driverWEB.sendKeys(inputView, RnKeys.ENTER);
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);
    }

    public void filtraSucessoDataBeleza(String view, String dataInicial, String dataFinal, String Brand) throws Exception {

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(botaoRefreshh)));

        addLog(scenario, "Etapa: Selecionar viewer cadastro de Itens");
        selecionarViewer(view);
        Thread.sleep(1000);
        driverWEB.click(botaoRefresh);
        Thread.sleep(4000);

        addLog(scenario, "Integration Status = Successful");
        //addLog(scenario, "Etapa: Selecionar Style Sucesso");
        driverWEB.click(clicIntegrationStatus);
        Thread.sleep(2000);
        driverWEB.setText(integrationStatusInput, "Successful");
        //((SeleniumRobotsTool)driverWEB).getElement(integrationStatusInput).sendKeys("Successful");
        Thread.sleep(1000);
        driverWEB.click("//input[@value='RNR_StatusInteg:4']");
        Thread.sleep(3000);
        driverWEB.click(clicCode);
        Thread.sleep(3000);

        addLog(scenario, "Etapa: Selecionar Data Inicial e Data Final, Style Sucesso");
        // Submit Status Time dataIncial e dataFinal
        driverWEB.ScrollToObject(submitStatusTime);
        Thread.sleep(2000);
        driverWEB.doubleClick(submitStatusTime);
        Thread.sleep(2000);
        driverWEB.waitObject(submitStatusTime, 40);
        Thread.sleep(3000);
        driverWEB.click(custom);
        Thread.sleep(2000);
        driverWEB.setText(inputDataIncial, dataInicial);
        //((SeleniumRobotsTool)driverWEB).getElement(inputDataIncial).sendKeys(dataInicial);
        driverWEB.setText(inputDataFinal, dataFinal);
        //((SeleniumRobotsTool)driverWEB).getElement(inputDataFinal).sendKeys(dataFinal);
        driverWEB.click(description);
        Thread.sleep(4000);

        // Scroll Right
        Thread.sleep(2000);
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
        Thread.sleep(3000);

        addLog(scenario, "Etapa: Selecionar Size Range");
        // variavel local, sempre mesma sizeRange= PP-GG  (Desenv: M | (PreProd: M)
        driverWEB.ScrollToObject(sizeRangeText);
        driverWEB.click(sizeRangeText);
        Thread.sleep(3000);
        driverWEB.doubleClick(camposizeRange);
        Thread.sleep(1000);
        driverWEB.doubleClick(camposizeRange);
        Thread.sleep(2000);
        driverWEB.waitObject(inputSizeRange, 6);
        Thread.sleep(3000);
        driverWEB.setText(inputSizeRange, "UNICO");
        Thread.sleep(2000);
        // Primeira opção
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        Thread.sleep(3000);
        driverWEB.click(sizeRangeText);
        Thread.sleep(12000);

        addLog(scenario, "Etapa: Selecionar Copy");
        // Refresh
        driverWEB.click(botaoRefreshh);
        Thread.sleep(3000);

        // Copy item Style Preencher brand e clic em save
        driverWEB.ScrollToObject(botaoCopy);
        driverWEB.getElement(botaoCopy);
        Thread.sleep(3000);
        driverWEB.click(botaoCopy);
        Thread.sleep(4000);

        // Add Template Copy
        //driverWEB.click(templates);
        Thread.sleep(2000);
        driverWEB.waitObject(inputTemplates, 6);
        //driverWEB.setText(inputTemplates, "Copy");
        ((SeleniumRobotsTool) driverWEB).getElement(inputTemplates).sendKeys("Copy");
        Thread.sleep(2000);
        //driverWEB.click(botaoSave);

        // Colorways select none
        driverWEB.waitObject(clicCampoColorways, 40);
        Thread.sleep(4000);
        driverWEB.click(clicCampoColorways);
        Thread.sleep(3000);
        driverWEB.click(selectNone); // selectNone
        Thread.sleep(2000);

        driverWEB.waitObject(campomarca, 8);
        driverWEB.ScrollToObject(campoMarcaText);
        driverWEB.click(campomarca);
        driverWEB.setText(campomarca, Brand);
        Thread.sleep(1500);
        driverWEB.click(botaoSave);
        Thread.sleep(6000);

        // Select item
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waittt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(40L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waittt.until(ExpectedConditions.elementToBeClickable(By.xpath(selecionarItemCopiadoBeleza)));

        driverWEB.waitObject(selecionarItemCopiadoBeleza, 8);
        driverWEB.ScrollToObject(selecionarItemCopiadoBeleza);
        driverWEB.click(selecionarItemCopiadoBeleza);
        Thread.sleep(8000);
    }
}

