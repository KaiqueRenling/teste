package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.CriarPedidoPage;
import br.com.plm.mdm.steps.Common;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import br.com.renner.robots.key.RnKeys;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoClicvel;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoWeb;
import static helpers.Utils.addLog;

public class CriarPedidoCompraInteractions extends CriarPedidoPage {

    private CriarPedidoPage criarPedidoPage = new CriarPedidoPage();

    IRNRobotsTool driverWEB = seleniumRobotsTool;


    private void selecionarViewerRenner(String viewerRenner) throws Exception {
        Thread.sleep(3000);
        driverWEB.click(viewerRennerNew);
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys(viewerRenner);
        Thread.sleep(1000);
        driverWEB.click("//*[@item='1']");
        Thread.sleep(3000);
    }

    private void informarPais(String pais) throws Exception {
        driverWEB.click(orderOrigin);
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(orderOriginInput).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(orderOriginInput).sendKeys(pais);
        Thread.sleep(1000);
        driverWEB.click(orderOriginText);
        Thread.sleep(2000);
    }

    private void informarPaisLatamNew(String pais) throws Exception {
        driverWEB.click(orderOrigin);
        Thread.sleep(2000);
        driverWEB.clearField(orderOriginLatamInput);
        //((SeleniumRobotsTool)driverWEB).getElement(orderOriginLatamInput).sendKeys("");
        driverWEB.setText(orderOriginLatamInput, pais);
        Thread.sleep(1000);
        driverWEB.click(orderOriginText);
        Thread.sleep(2000);
    }

    private void informarPaisLatamPack(String pais) throws Exception {
        driverWEB.click(orderOrigin);
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(YearPackLatamInput).sendKeys("");
        driverWEB.setText(YearPackLatamInput, pais);
        Thread.sleep(1000);
        driverWEB.click(orderOriginText);
        Thread.sleep(2000);
    }

    private void informarFornecedor(String fornecedor) throws Exception {

        Thread.sleep(2000);
        //driverWEB.setText(inputSupplierPO,fornecedor);
        ((SeleniumRobotsTool) driverWEB).getElement(inputSupplierPO).sendKeys("");
        driverWEB.setText(inputSupplierPO, fornecedor);

        // Save
        driverWEB.waitObject(botaoSave, 5);
        Thread.sleep(5000);
        driverWEB.click(botaoSave);

        //botao Save & Go
        //driverWEB.waitObject(botaoSaveGo,5);
        //driverWEB.click(botaoSaveGo);
        Thread.sleep(2000);
    }

    private void informarFornecedorNew(String fornecedor) throws Exception {
        driverWEB.waitObject(inputSupplierPONew, 5);
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputSupplierPONew).sendKeys("");
        driverWEB.setText(inputSupplierPONew, fornecedor);
        Thread.sleep(2000);
        //botao Save & Go
        driverWEB.click(botaoSaveGoNew);
        Thread.sleep(2000);
    }

    // Code
    public void informarItemPack(String itemPack) throws Exception {

        // Clic no campo Code
        driverWEB.waitObject(codePack, 20);
        Thread.sleep(4000);
        driverWEB.click(codePack);
        Thread.sleep(1000);
        driverWEB.doubleClick(codePack);
        Thread.sleep(2000);
        driverWEB.waitObject(inputValueCode, 40);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValueCode).sendKeys(itemPack);
        Thread.sleep(8000);
        //Select Item
        //driverWEB.sendKeys(inputValueCode, RnKeys.ENTER);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        Thread.sleep(3000);

        // Clic campo Code
        driverWEB.waitObject(codePackText, 6);
        Thread.sleep(2000);
        driverWEB.click(codePackText);
        Thread.sleep(7000);

        driverWEB.waitObject(selectNewItemPack, 6);
        driverWEB.click(selectNewItemPack);
        Thread.sleep(2000);
        driverWEB.click("//span[contains(text(),'Save')]");
        Thread.sleep(3000);

    }

    public void informarItemSku(String itemSku) throws Exception {

        // Clic no campo Code
        driverWEB.waitObject(codeSku, 20);
        Thread.sleep(4000);
        driverWEB.click(codeSku);
        Thread.sleep(1000);
        driverWEB.doubleClick(codeSku);
        Thread.sleep(2000);
        driverWEB.waitObject(inputValueCodeSku, 40);
        driverWEB.setText(inputValueCodeSku, itemSku);
        Thread.sleep(8000);
        //Select Item
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        Thread.sleep(3000);

        // Clic campo Code
        driverWEB.waitObject(codeSkuText, 6);
        Thread.sleep(2000);
        driverWEB.click(codeSkuText);
        Thread.sleep(7000);

        driverWEB.waitObject(selectNewItemSku, 6);
        driverWEB.click(selectNewItemSku);
        Thread.sleep(2000);
        driverWEB.click("//span[contains(text(),'Save')]");
        Thread.sleep(3000);

    }

    public void informarCodeVariavel(String estiloSKU) throws Exception {

        driverWEB.waitObject(code, 40);
        Thread.sleep(4000);
        driverWEB.click(code);
        Thread.sleep(2000);
        driverWEB.doubleClick(code);
        driverWEB.waitObject(valueCode, 50);
        ((SeleniumRobotsTool) driverWEB).getElement(valueCode).sendKeys(estiloSKU);
        Thread.sleep(20000);
        driverWEB.sendKeys(valueCode, RnKeys.ENTER);

        // Clic campo Code
        driverWEB.waitObject(codeText, 6);
        Thread.sleep(2000);
        driverWEB.click(codeText);
        Thread.sleep(10000);

        driverWEB.waitObject(selectItemSku, 16);
        driverWEB.click(selectItemSku);

    }

    private void viewerRenner(String vRenner) throws Exception {
        Thread.sleep(3000);
        driverWEB.doubleClick(viewersRenner);
        Thread.sleep(3000);
        driverWEB.click("//span[contains(text(),'Subclass')]");
        driverWEB.clearField(selectViewsRenner);
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewsRenner).sendKeys("");
        driverWEB.setText(selectViewsRenner, vRenner);
        Thread.sleep(1000);
        driverWEB.click("//*[@item='1']");
        Thread.sleep(3000);
    }

    private void viewerRennerPoBrPack(String vRenner) throws Exception {
        Thread.sleep(3000);
        esperarElementoWeb(viewrRennerPoBrPack);
        esperarElementoClicvel(viewrRennerPoBrPack);
        driverWEB.click(viewrRennerPoBrPack);
        esperarElementoWeb(inputSelectViewerPoBrPack);
        esperarElementoClicvel(inputSelectViewerPoBrPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputSelectViewerPoBrPack).sendKeys("");
        driverWEB.setText(inputSelectViewerPoBrPack, vRenner);
        Thread.sleep(1000);
        driverWEB.click("//*[@item='1']");
        Thread.sleep(3000);
    }

    private void viewerRennerPoBrSku(String vRenner) throws Exception {
        Thread.sleep(3000);
        driverWEB.click(viewrRennerPoBrPack);
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputSelectViewerPoBrPack).sendKeys("");
        driverWEB.setText(inputSelectViewerPoBrPack, vRenner);
        Thread.sleep(1000);
        driverWEB.click("//*[@item='1']");
        Thread.sleep(3000);
    }

    public void informarEstiloSKUImportado(String estiloSKU) throws Exception {

        // New Style SKUs Order selecionar Style SKU sucesso
        Thread.sleep(4000);
        driverWEB.waitObject(code, 50);
        Thread.sleep(4000);
        driverWEB.doubleClick(code);
        Thread.sleep(2000);
        driverWEB.doubleClick(code);
        Thread.sleep(2000);
        driverWEB.waitObject(valueCodeImportado, 40);
        //driverWEB.setTextWithoutClear(valueCodeImportado, estiloSKU);
        driverWEB.setText(valueCodeImportado, estiloSKU);
        Thread.sleep(30000);
        //Select Item
        driverWEB.sendKeys(valueCodeImportado, RnKeys.ENTER);
        Thread.sleep(10000);

        // Clic campo Code
        driverWEB.waitObject(codeText, 6);
        Thread.sleep(2000);
        driverWEB.click(codeText);
        Thread.sleep(12000);

        // Clic campo Code
        driverWEB.waitObject(codeText, 6);
        Thread.sleep(4000);
        driverWEB.click(codeText);
        Thread.sleep(12000);

        // Clic campo Code
        driverWEB.waitObject(codeText, 6);
        Thread.sleep(4000);
        driverWEB.click(codeText);
        Thread.sleep(12000);

        driverWEB.waitObject(selectItemSku, 16);
        driverWEB.click(selectItemSku);
        Thread.sleep(8000);

        // Salva New Style SKU Order
        driverWEB.waitObject(botaoSalvarNewStyleSKUorder, 8);
        driverWEB.click(botaoSalvarNewStyleSKUorder);
        Thread.sleep(4000);
    }

    //Viewer Renner PO Nacional
    private void selecionarViewerRennerNacional(String viewerrennernacional) throws Exception {
        esperarElementoWeb(viewRenner);
        esperarElementoClicvel(viewRenner);
        driverWEB.click(viewRenner);
        esperarElementoWeb(selectViewRenner);
        esperarElementoClicvel(selectViewRenner);
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys("");
        esperarElementoWeb(selectViewRenner);
        esperarElementoClicvel(selectViewRenner);
        driverWEB.setText(selectViewRenner, viewerrennernacional);
        driverWEB.click("//*[@item='1']");

    }

    //Viewer Renner PO Nacional New
    private void selecionarViewerRennerNacionalNew(String viewerrennernacional) throws Exception {
        Thread.sleep(3000);
        driverWEB.click(viewerRennerNew);
        Thread.sleep(3000);
        driverWEB.setText(selectViewRenner, viewerrennernacional);
        driverWEB.click("//div[@item='1']");
        Thread.sleep(2000);
    }

    //Viewer Renner PO Importada New
    private void selecionarViewerRennerImportadaNew(String viewerrennerimportada) throws Exception {
        Thread.sleep(3000);
        esperarElementoWeb(viewerRennerNew);
        esperarElementoClicvel(viewerRennerNew);
        driverWEB.click(viewerRennerNew);
        Thread.sleep(3000);
        esperarElementoWeb(selectViewRenner);
        esperarElementoClicvel(selectViewRenner);
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys("");
        driverWEB.setText(selectViewRenner, viewerrennerimportada);
        driverWEB.click("//div[@item='1']");
        Thread.sleep(2000);
    }

    //Year
    private void year() throws Exception {

        // Regra de Negocio, pega o ano atual
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateyearnow = new Date();
        String yearnow = dateFormat.format(dateyearnow);

        Thread.sleep(1000);
        driverWEB.click(year);
        Thread.sleep(1000);
        driverWEB.setText(YearInput, yearnow);
        Thread.sleep(1000);
        driverWEB.click(yearText);
        Thread.sleep(2000);
    }

    private void yearPack() throws Exception {

        // Year
        // Regra de Negocio, pega o ano atual
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateyearnow = new Date();
        String yearnow = dateFormat.format(dateyearnow);

        Thread.sleep(1000);
        driverWEB.click(yearPack);
        Thread.sleep(1000);
        ((SeleniumRobotsTool) driverWEB).getElement(YearPackInput).sendKeys("");
        driverWEB.setText(YearPackInput, yearnow);
        Thread.sleep(1000);
        driverWEB.click(yearText);
        Thread.sleep(2000);
    }

    //Year New
    private void yearNew() throws Exception {

        // Regra de Negocio, pega o ano atual
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateyearnow = new Date();
        String yearnow = dateFormat.format(dateyearnow);

        driverWEB.click(yearNew);
        Thread.sleep(1000);
        driverWEB.waitObject(YearInputNew, 5);
        ((SeleniumRobotsTool) driverWEB).getElement(YearInputNew).sendKeys("");
        driverWEB.setText(YearInputNew, yearnow);
        Thread.sleep(1000);
        driverWEB.click(yearText);
        Thread.sleep(2000);
    }

    //Year New
    private void yearVariavel(String ano) throws Exception {

        // Regra de Negocio, pega o ano atual
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateyearnow = new Date();
        String year = dateFormat.format(dateyearnow);

        driverWEB.click(yearNew);
        Thread.sleep(1000);
        driverWEB.waitObject(YearInputNew, 5);
        ((SeleniumRobotsTool) driverWEB).getElement(YearInputNew).sendKeys(ano);
        Thread.sleep(1000);
        driverWEB.click(yearText);
        Thread.sleep(2000);
    }

    private void yearNewImportado() throws Exception {

        // Regra de Negocio, pega o ano atual
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateyearnow = new Date();
        String yearnow = dateFormat.format(dateyearnow);

        Thread.sleep(6000);
        esperarElementoWeb(yearImportada);
        esperarElementoClicvel(yearImportada);
        driverWEB.click(yearImportada);
        Thread.sleep(1000);
        esperarElementoWeb(inputValorYearImportada);
        esperarElementoClicvel(inputValorYearImportada);
        driverWEB.waitObject(inputValorYearImportada, 5);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorYearImportada).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorYearImportada).sendKeys(yearnow);
        Thread.sleep(1000);
        esperarElementoWeb(yearText);
        esperarElementoClicvel(yearText);
        driverWEB.click(yearText);
        Thread.sleep(2000);
    }

    private void yearLatamPackImportado() throws Exception {

        // Regra de Negocio, pega o ano atual
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateyearnow = new Date();
        String yearnow = dateFormat.format(dateyearnow);

        esperarElementoWeb(yearImportada);
        esperarElementoClicvel(yearImportada);
        driverWEB.click(yearImportada);
        Thread.sleep(1000);
        driverWEB.waitObject(inputValorYearImportada, 5);
        ((SeleniumRobotsTool) driverWEB).getElement(inputYearLatamPackImportada).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputYearLatamPackImportada).sendKeys(yearnow);
        Thread.sleep(1000);
        driverWEB.click(yearText);
        Thread.sleep(2000);
    }

    //Commercial Week:
    private void informarCommercialWeek(String commercialWeekValue) throws Exception {
        //Commercial Week:
        driverWEB.click(commercialWeek);
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInput).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInput).sendKeys(commercialWeekValue);
        Thread.sleep(1000);
        driverWEB.click(commercialWeekText);
        Thread.sleep(2000);
    }

    //Commercial Week:
    private void informarCommercialWeekImportado(String commercialWeekValue) throws Exception {
        //Commercial Week:

        esperarElementoWeb(commercialWeek);
        esperarElementoClicvel(commercialWeek);
        driverWEB.click(commercialWeek);
        Thread.sleep(1000);

        esperarElementoWeb(commercialWeekInputImportado);
        esperarElementoClicvel(commercialWeekInputImportado);
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInputImportado).sendKeys("");
        Thread.sleep(1000);
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInputImportado).sendKeys(commercialWeekValue);
        Thread.sleep(1000);

        esperarElementoWeb(commercialWeekText);
        esperarElementoClicvel(commercialWeekText);
        driverWEB.click(commercialWeekText);
        Thread.sleep(2000);
    }

    private void informarCommercialWeekImportadoSku(String commercialWeekValue) throws Exception {
        //Commercial Week:
        driverWEB.click(commercialWeek);
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInputImportadoSku).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInputImportadoSku).sendKeys(commercialWeekValue);
        Thread.sleep(1000);
        driverWEB.click(commercialWeekText);
        Thread.sleep(2000);
    }

    private void informarCommercialWeekPack(String commercialWeekValue) throws Exception {
        //Commercial Week:
        esperarElementoWeb(commercialWeekPack);
        driverWEB.click(commercialWeekPack);
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInput).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInput).sendKeys(commercialWeekValue);
        esperarElementoWeb(commercialWeekText);
        driverWEB.click(commercialWeekText);

    }

    // Supplier PO Warehouse/Store
    private void informarWarehouseStore(String warehousestore) throws Exception {
        // Supplier PO Warehouse/Store
        Thread.sleep(2000);
        driverWEB.click(warehouseStore);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStore).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStore).sendKeys(warehousestore);
        Thread.sleep(2000);
        driverWEB.click(warehouseStoreText);
        Thread.sleep(2000);
    }

    // Supplier PO Warehouse/Store
    private void informarWarehouseStoreVariavel(String warehousestore) throws Exception {

        driverWEB.click(warehouseStore);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStore).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStore).sendKeys(warehousestore);
        Thread.sleep(1000);
        driverWEB.click(warehouseStoreText);
        Thread.sleep(2000);
    }

    // Supplier PO Warehouse/Store
    private void informarWarehouseStoreImportadoPack(String warehousestore) throws Exception {
        // Supplier PO Warehouse/Store
        driverWEB.click(warehouseStoreImportado);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportadoPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportadoPack).sendKeys("LJ Santa Fe");
        Thread.sleep(2000);
        driverWEB.click(warehouseStoreText);
        Thread.sleep(2000);
    }

    // Supplier PO Warehouse/Store
    private void informarWarehouseStoreImportado(String warehousestore) throws Exception {
        // Supplier PO Warehouse/Store
        esperarElementoWeb(warehouseStoreImportado);
        esperarElementoClicvel(warehouseStoreImportado);
        driverWEB.click(warehouseStoreImportado);

        esperarElementoWeb(inputValorWarehouseStoreImportadoSku);
        esperarElementoClicvel(inputValorWarehouseStoreImportadoSku);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportadoSku).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportadoSku).sendKeys(warehousestore);
        Thread.sleep(2000);

        esperarElementoWeb(warehouseStoreText);
        esperarElementoClicvel(warehouseStoreText);
        driverWEB.click(warehouseStoreText);
        Thread.sleep(2000);
    }

    // Supplier PO Warehouse/Store
    private void informarWarehouseStorePack(String warehousestore) throws Exception {

        // Supplier PO Warehouse/Store
        esperarElementoWeb(warehouseStorePack);
        driverWEB.click(warehouseStorePack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStore).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStore).sendKeys(warehousestore);
        esperarElementoWeb(warehouseStoreText);
        driverWEB.click(warehouseStoreText);

    }

    private void informarPOModel(String pomodel) throws Exception {
        // Supplier PO PO/Model
        driverWEB.click(poModel);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModel).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModel).sendKeys(pomodel);
        Thread.sleep(1000);
        driverWEB.click(poModelText);
        Thread.sleep(2000);
    }

    // Supplier PO PO/Model
    private void informarPOModelVariavel(String pomodel) throws Exception {

        driverWEB.click(poModel);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModel).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModel).sendKeys(pomodel);
        Thread.sleep(1000);
        driverWEB.click(poModelText);
        Thread.sleep(2000);
    }

    private void informarPOModelImportado(String pomodel) throws Exception {
        // Supplier PO PO/Model
        esperarElementoWeb(poModel);
        esperarElementoClicvel(poModel);
        driverWEB.click(poModel);

        esperarElementoWeb(inputValorPoModelImportado);
        esperarElementoClicvel(inputValorPoModelImportado);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelImportado).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelImportado).sendKeys(pomodel);
        Thread.sleep(2000);

        esperarElementoWeb(poModelText);
        esperarElementoClicvel(poModelText);
        driverWEB.click(poModelText);
        Thread.sleep(2000);
    }

    private void informarPOModelPack(String pomodel) throws Exception {
        // Supplier PO PO/Model
        esperarElementoWeb(poModelPack);
        driverWEB.click(poModelPack);
        esperarElementoWeb(inputValorPoModel);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModel).sendKeys("");
        esperarElementoWeb(inputValorPoModel);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModel).sendKeys(pomodel);
        esperarElementoWeb(poModelText);
        driverWEB.click(poModelText);
    }

    //Orders -> Supplier PO Order Qty order
    private void informarPOQty(String POQty) throws Exception {

        esperarElementoWeb(orderQty);
        esperarElementoClicvel(orderQty);
        driverWEB.click(orderQty);

        esperarElementoWeb(inputValorOrderQty);
        esperarElementoClicvel(inputValorOrderQty);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorOrderQty).sendKeys(POQty);

        esperarElementoWeb(orderQtyText);
        esperarElementoClicvel(orderQtyText);
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);

    }

    private void informarPOQtyVariavel(String POQty) throws Exception {

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
        //driverWEB.setTextWithoutClear(inputValorOrderQty, POQty);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorOrderQty).sendKeys(POQty);
        Thread.sleep(2000);

        // Clic Order Qty Text pg
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);
    }

    public void criarPedido(String itemPai, String pack, String grupoCores, String grupoCor, String ano, String semanaComercial, String wareHouseStor, String poModel, String quantidadesPorTamanhoPP, String quantidadesPorTamanhoP, String quantidadesPorTamanhoM, String quantidadesPorTamanhoG, String OrderCase, String packQuantity) throws Exception {

        addLog(scenario, itemPai);

        // abaSourcing e select item
        driverWEB.waitObject(abaSourcingNew, 12);
        Thread.sleep(4000);
        driverWEB.click(abaSourcingNew);
        driverWEB.waitObject(botaoNewSupplierPONew, 4);

        //Sourcing --> Supplier PO --> Action --> New Supplier PO
        Thread.sleep(3000);
        driverWEB.ScrollToObject(botaoNewSupplierPONew);
        driverWEB.waitObject(botaoNewSupplierPONew, 6);
        driverWEB.click(botaoNewSupplierPONew);

        // Supplier PO
        driverWEB.waitObject(botaoNewSupplierPONew, 6);
        informarFornecedorNew("DDX TEXTIL INDUSTRIA E COMERCIO DE MALHAS LTDA - 0001-39");
        //informarFornecedorNew(sourcing);

        Thread.sleep(3000);
        // New Style SKU order

        driverWEB.click(botaoActionNewStyleSKUsOrderNew);
        Thread.sleep(18000);

        //New Style SKU Order
        //informarEstiloSKU("BS_FW22_CMT_0269");
        informarCodeVariavel(itemPai);

        // Salva New Style SKU Order
        driverWEB.click(botaoSalvarNewStyleSKUorder);
        Thread.sleep(2000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRennerNacionalNew("Renner PO Nacional");

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(3000);

        //Order Origin
        //informarPais("BRASIL");

        //Year
        yearVariavel(ano);

        //Commercial Week:
        informarCommercialWeek(semanaComercial);

        //WarehouseStore
        informarWarehouseStoreVariavel(wareHouseStor);

        // Supplier PO PO/Model
        informarPOModelVariavel(poModel);

        // OTB
        driverWEB.click(naoValidarOtb);

        //Factory
        //driverWEB.click(poFactory);
        //driverWEB.setTextWithoutClear(inputBrValorFactory, "BRENDISOL TRADING S.A. - 101281");
        //Thread.sleep(1000);
        //driverWEB.click(poFactoryText);
        //Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(4000);

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
        // Insert valor no campo OrderCase
        //driverWEB.setTextWithoutClear(inputOrderCase, OrderCase);
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys(OrderCase);
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        //informarPOQty("2");
        informarPOQtyVariavel(packQuantity);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(4000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        //driverWEB.setText(inputStatePo, "Submitted");
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(4000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();


    }

    public void criarPedidoNacionalSKU_New(String itemPaiCode) throws Exception {


        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(campoCode)));

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRenner("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);
        //driverWEB.click(textCode);Thread.sleep(2000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(4000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(5000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(4000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(5000);

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

        // New Supplier POs clic me Next
        driverWEB.click(clicNext);
        Thread.sleep(4000);

        // Primeira Cor
        driverWEB.ScrollToObject(selectSku1);
        driverWEB.waitObject(selectSku1, 5);
        driverWEB.click(selectSku1);
        Thread.sleep(2000);

        // Finish
        driverWEB.waitObject(finish, 5);
        driverWEB.click(finish);
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(viewerRennerNew)));

        // Select Viewer Renner PO Nacional
        selecionarViewerRennerNacionalNew("Renner PO Nacional");
        Thread.sleep(7000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        //Order Origin old
        //informarPais("Brasil");

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(7000);

        //Order Origin New
        informarPais("BRASIL");
        Thread.sleep(3000);

        //Year New
        yearNew();
        Thread.sleep(3000);

        //Commercial Week:
        informarCommercialWeek("45");
        //informarCommercialWeek(semana);
        Thread.sleep(3000);

        // Supplier PO PO/Model
        informarPOModel("RMS BR");
        Thread.sleep(3000);

        //WarehouseStore
        addLog(scenario, "Etapa: WarehouseStore");
        informarWarehouseStore("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        Thread.sleep(7000);

        // OTB
        driverWEB.click(naoValidarOtb);
        Thread.sleep(5000);

        //Factory
        //driverWEB.click(poFactory);
        //driverWEB.setTextWithoutClear(inputBrValorFactory, "BRENDISOL TRADING S.A. - 101281");
        //Thread.sleep(1000);
        //driverWEB.click(poFactoryText);
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
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
        Thread.sleep(2000);

        // Order Case 1
        driverWEB.click(orderCaseSkuBrSku);
        Thread.sleep(4000);
        // Clic mouse OrderQty text/input
        WebDriver driverOrderCase = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicOrderCase = driverOrderCase.findElement(By.xpath("//*[contains(@class, 'attrNumber PastelYellow iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]"));
        // Instantiating Actions Class
        Actions actionss = new Actions(driverOrderCase);
        // Hovering on clicOrderQtytext
        actionss.moveToElement(clicOrderCase);
        // build() - used to complie all the actions
        actionss.click().build().perform();
        Thread.sleep(3000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);
        actionss.click().build().perform();
        Thread.sleep(3000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(3000);
        actionss.click().build().perform();

        // XPath
        driverWEB.waitObject(inputOrderCaseBrSku, 10);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputOrderCase, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCaseBrSku).sendKeys("20");
        Thread.sleep(6000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        informarPOQty("400");
        Thread.sleep(3000);

        // Clic Order Qty Text pg
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
        // Scroll Right
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
        driverWEB.click(selecionarLinhaPo);
        Thread.sleep(4000);

        //clic clusterGuideShop
        driverWEB.waitObject(clusterGuideShop, 30);
        driverWEB.click(clusterGuideShop);
        Thread.sleep(4000);

        //clic clusterAER
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(clusterAER,20);
        driverWEB.click(clusterGuideShopText);
        driverWEB.waitObject(clusterAER, 30);
        driverWEB.click(clusterAER);
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

        // Cluster ARG
        driverWEB.click(clusterGuideShopText);
        driverWEB.waitObject(clusterARG, 50);
        driverWEB.click(clusterARG);
        driverWEB.setText(clusterARGInput, "PP");
        driverWEB.click(clusterARGText);
        Thread.sleep(2000);

        // Cluster URU
        driverWEB.waitObject(clusterURU, 50);
        driverWEB.click(clusterURU);
        driverWEB.setText(clusterURUInput, "PP");
        driverWEB.click(clusterURUText);
        Thread.sleep(2000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        // Cluster SUL
        driverWEB.waitObject(clusterSUL, 50);
        driverWEB.click(clusterSUL);
        driverWEB.setText(clusterSULInput, "PP");
        driverWEB.click(clusterSULText);
        Thread.sleep(2000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        //clic clusterSPO
        driverWEB.waitObject(clusterSPO, 50);
        driverWEB.click(clusterSPO);
        driverWEB.setText(clusterSPOInput, "P");
        driverWEB.click(clusterSPOText);
        Thread.sleep(2000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        // Cluster RIO
        driverWEB.waitObject(clusterRIO, 50);
        driverWEB.click(clusterRIO);
        driverWEB.setText(clusterRIOInput, "P");
        driverWEB.click(clusterRIOText);

        // Cluster NOR
        driverWEB.waitObject(clusterNOR, 50);
        driverWEB.click(clusterNOR);
        driverWEB.setText(clusterNORInput, "P");
        driverWEB.click(clusterNORText);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        //clic clusterW
        driverWEB.click(clusterW);
        Thread.sleep(2000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);

        //locationList = 239097
        driverWEB.waitObject(locationList, 50);
        driverWEB.click(locationList);
        driverWEB.setText(locationListInput, "239097");
        driverWEB.click(locationListText);
        Thread.sleep(2000);

        //distributionRoles = #Buffer e #PC
        driverWEB.waitObject(distributionRoles, 50);
        driverWEB.click(distributionRoles);
        Thread.sleep(4000);
        driverWEB.setText(distributionRolesInput, "#Buffer");
        Thread.sleep(3000);
        driverWEB.click("//input[@value='RNR_DistributionRules:#Buffer']");
        driverWEB.click(distributionRolesText);
        Thread.sleep(2000);

        //distributionRoles = #Buffer e #PC
        driverWEB.waitObject(distributionRoles, 50);
        driverWEB.click(distributionRoles);
        Thread.sleep(4000);
        driverWEB.setText(distributionRolesInput, "#PC");
        Thread.sleep(3000);
        driverWEB.click("//input[@value='RNR_DistributionRules:#PC']");
        driverWEB.click(distributionRolesText);
        Thread.sleep(2000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(6000);

        // Clic to --> Play Arrow send Validation
        //driverWEB.click(playArrowWorkSheet);
        //Thread.sleep(3000);

        // Clic to --> Play Arrow send Validation
        //driverWEB.click(playArrowValidation);
        //Thread.sleep(3000);

        // Clic to --> Play Submitted
        //driverWEB.click(playArrowSubmitted);
        //Thread.sleep(8000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        //driverWEB.setText(inputStatePo, "Submitted");
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();
        //Thread.sleep(4000);

    }

    public void criarIssuePedidoBrSKU(String itemPaiCode) throws Exception {

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(campoCode)));

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(1000);
        viewerRenner("Cadastro de Itens");
        Thread.sleep(2000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(3000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(3000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(4000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(4000);

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

        // New Supplier POs clic me Next
        driverWEB.click(clicNext);

        Thread.sleep(2000);
        // Add sku para PO
        driverWEB.ScrollToObject(selectSku1);
        driverWEB.waitObject(selectSku1, 5);
        driverWEB.click(selectSku1);
        Thread.sleep(2000);

        // Finish
        driverWEB.waitObject(finish, 5);
        driverWEB.click(finish);
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(viewerRennerNew)));

        // Select Viewer Renner PO Nacional
        selecionarViewerRennerNacionalNew("Renner PO Nacional");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(5000);

        //Order Origin old
        //informarPais("Brasil");

        //Order Origin New
        informarPais("BRASIL");
        Thread.sleep(2000);

        //Year New
        yearNew();
        Thread.sleep(2000);

        //Commercial Week:
        informarCommercialWeek("45");
        //informarCommercialWeek(semana);
        Thread.sleep(2000);

        // Supplier PO PO/Model
        informarPOModel("RMS BR");
        Thread.sleep(2000);

        // OTB
        driverWEB.click(naoValidarOtb);
        Thread.sleep(2000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(2000);

        //WarehouseStore
        addLog(scenario, "Etapa: WarehouseStore");
        informarWarehouseStore("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        Thread.sleep(54000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(5000);

        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);


        // Order Case 1
        Thread.sleep(1000);
        driverWEB.click(orderCaseIssueFluxoBrSku);
        Thread.sleep(2000);
        // Clic mouse OrderQty text/input
        WebDriver driverOrderCase = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicOrderCase = driverOrderCase.findElement(By.xpath("//*[contains(@class, 'attrNumber PastelYellow iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]"));
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
        //driverWEB.setTextWithoutClear(inputOrderCase, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("3");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        informarPOQty("4");
        Thread.sleep(2000);

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
        // Scroll Right
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,10);
        driverWEB.click(selecionarLinhaPo);
        Thread.sleep(6000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(6000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        //driverWEB.setText(inputStatePo, "Submitted");
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();
        //Thread.sleep(4000);

    }

    public void criarPedidoNacionalSKUResto(String itemPaiCode) throws Exception {

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(campoCode)));

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRenner("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(9000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(7000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(3000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // New Supplier POs clic me Next
        driverWEB.click(clicNext);

        Thread.sleep(4000);
        // Add sku para PO
        driverWEB.ScrollToObject(selectSku1);
        driverWEB.waitObject(selectSku1, 5);
        driverWEB.click(selectSku1);
        Thread.sleep(2000);

        // Finish
        driverWEB.waitObject(finish, 5);
        driverWEB.click(finish);
        Thread.sleep(4000);
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(viewerRennerNew)));

        // Select Viewer Renner PO Nacional
        selecionarViewerRennerNacionalNew("Renner PO Nacional");
        Thread.sleep(7000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(7000);

        //Order Origin old
        //informarPais("Brasil");

        // Refresh
        //driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        //Thread.sleep(7000);

        //Order Origin New
        informarPais("BRASIL");
        Thread.sleep(3000);

        //Year New
        yearNew();
        Thread.sleep(3000);

        //Commercial Week:
        informarCommercialWeek("45");
        //informarCommercialWeek(semana);
        Thread.sleep(3000);

        // Supplier PO PO/Model
        informarPOModel("RMS BR");
        Thread.sleep(3000);

        //WarehouseStore
        informarWarehouseStore("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        //informarWarehouseStoreImportado("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        Thread.sleep(3000);

        // OTB
        driverWEB.click(naoValidarOtb);
        Thread.sleep(3000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(5000);

        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        //driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        //driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        //driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        //driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        //driverWEB.click("//*[@data-dojo-attach-point='incrementButton']"); Thread.sleep(2000);

        // Order Case 1
        driverWEB.click(orderCaseSkuBrSku);
        Thread.sleep(4000);
        // Clic mouse OrderQty text/input
        WebDriver driverOrderCase = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicOrderCase = driverOrderCase.findElement(By.xpath("//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_Case_integer:']//div//div//input[@type='text']"));
        // Instantiating Actions Class
        Actions actionss = new Actions(driverOrderCase);
        // Hovering on clicOrderQtytext
        actionss.moveToElement(clicOrderCase);
        // build() - used to complie all the actions
        actionss.click().build().perform();
        Thread.sleep(3000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);
        actionss.click().build().perform();
        Thread.sleep(3000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(4000);
        actionss.click().build().perform();

        // XPath
        driverWEB.waitObject(inputOrderCase, 15);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputOrderCase, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("20");
        Thread.sleep(4000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        informarPOQty("400");
        Thread.sleep(5000);

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
        // Scroll Right
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
        driverWEB.click(selecionarLinhaPo);
        Thread.sleep(5000);

        // Clic Flexa
        //driverWEB.ScrollToObject(clicFlexaItem);  Thread.sleep(2000);
        //driverWEB.click(clicFlexaItem);  Thread.sleep(5000);

        // Selecionar fleg resto
        driverWEB.click("//*[@data-csi-act='RNR_PurchasedOrder_POLeftovers_boolean::0']//input[@role='checkbox']");
        Thread.sleep(7000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(7000);

        //Descer a pagina novamente para visualizar os campos de Orders
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(3000);


        //Validação da PO resto - Comparar valor de order qty com order case

        addLog(scenario, "Etapa: Validação dos valores dos campos Order Case e Order Qty");
        WebElement orderCaseElement = driver.findElement(By.xpath(valueOrderCase));
        String orderCaseValue = orderCaseElement.getText().trim();
        addLog(scenario, "Valor do Order Case: " + orderCaseValue);
        Thread.sleep(2000);


        WebElement orderQtyElement = driver.findElement(By.xpath(valueOrderQty));
        String orderQtyValue = orderQtyElement.getText().trim();
        addLog(scenario, "Valor do Order Qty: " + orderQtyValue);
        Thread.sleep(2000);

        boolean areEqual = orderCaseValue.equalsIgnoreCase(orderQtyValue);

        if (areEqual) {
            addLog(scenario, "O valor de Order Qty é igual ao valor de Order Case: " + orderCaseValue);
        } else {
            addLog(scenario, "O valor de Order Qty é diferente do valor de Order Case: " + orderCaseValue + " != " + orderQtyValue);
        }
        Thread.sleep(4000);


        //Validar que os dados do campo Packing Descriptions sejam zerados

        addLog(scenario, "Etapa: Validação do campo Packing Description");
        WebElement packingDescriptionElement = driver.findElement(By.xpath(valuePackingDescription));
        String packingDescriptionValue = packingDescriptionElement.getText().trim();
        Thread.sleep(2000);


        if (packingDescriptionValue.isEmpty()) {
            addLog(scenario, "Os dados do campo Packing Description foram zerados.");
        } else {
            addLog(scenario, "O campo Packing Description está preenchido: " + packingDescriptionValue);
        }
        Thread.sleep(4000);


        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        //driverWEB.setText(inputStatePo, "Submitted");
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();

    }

    public void criarPedidoImportadoRmsLatamSku_New(String itemPaiCode) throws Exception {


        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");


        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        esperarElementoWeb(campoCode);
        esperarElementoClicvel(campoCode);
        driverWEB.click(campoCode);


        esperarElementoWeb(inputCode);
        esperarElementoClicvel(inputCode);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);

        esperarElementoWeb(codeSelecao);
        esperarElementoClicvel(codeSelecao);
        driverWEB.click(codeSelecao);


        // Clic Text Description
        esperarElementoWeb(textDescription);
        esperarElementoClicvel(textDescription);
        driverWEB.click(textDescription);

        addLog(scenario, "Etapa: Selecionar Code");
        esperarElementoWeb(clicCampoCode);
        esperarElementoClicvel(clicCampoCode);
        driverWEB.click(clicCampoCode);
        //Thread.sleep(8000);

        //abas do Style
        Thread.sleep(2000);
        esperarElementoWeb(abaSourcing);
        esperarElementoClicvel(abaSourcing);
        driverWEB.click(abaSourcing);


        // Clicar em POs
        esperarElementoClicvel(abaPOs);
        driverWEB.click(abaPOs);
        driverWEB.click(abaPOs);
        //Thread.sleep(3000);

        // Clicar Supplier POs
        esperarElementoWeb(abaSupplierPOs);
        esperarElementoClicvel(abaSupplierPOs);
        driverWEB.click(abaSupplierPOs);

        // New Supplier POs
        esperarElementoWeb(newSupplierPO);
        esperarElementoClicvel(newSupplierPO);
        driverWEB.click(newSupplierPO);

        // New Supplier POs clic me Next
        esperarElementoClicvel(clicNext);
        driverWEB.click(clicNext);
        driverWEB.click(clicNext);


        esperarElementoWeb(selectSku1);
        esperarElementoClicvel(selectSku1);
        driverWEB.click(selectSku1);


        // Finish
        esperarElementoWeb(finish);
        esperarElementoClicvel(finish);
        driverWEB.click(finish);
        Thread.sleep(10000);


        // Select Viewer Renner PO Importada
        selecionarViewerRennerImportadaNew("Renner PO Importada");
        Thread.sleep(4000);

        // Refresh
        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(6000);

        //Year:
        yearNewImportado();
        Thread.sleep(4000);

        //Commercial Week:
        informarCommercialWeekImportado("52");
        Thread.sleep(3000);

        // Supplier PO PO/Model
        informarPOModelImportado("RMS LATAM");
        Thread.sleep(3000);

        //PO TYPE
        esperarElementoWeb(POTypePack);
        esperarElementoClicvel(POTypePack);
        driverWEB.click(POTypePack);
        esperarElementoWeb(inputValorPOTypeLatamPack);
        esperarElementoClicvel(inputValorPOTypeLatamPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeLatamPack).sendKeys("Importado");

        //Clica no text para fechar o input
        esperarElementoWeb(locationTypeText);
        esperarElementoClicvel(locationTypeText);
        driverWEB.doubleClick(locationTypeText);


        //Location Type STORE OR WAREHOUSE
        esperarElementoWeb(locationType);
        esperarElementoClicvel(locationType);
        driverWEB.click(locationType);
        esperarElementoWeb(inputLocationType);
        esperarElementoClicvel(inputLocationType);
        ((SeleniumRobotsTool) driverWEB).getElement(inputLocationType).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputLocationType).sendKeys("Store");


        //Clica no text para fechar o input
        esperarElementoWeb(locationTypeText);
        esperarElementoClicvel(locationTypeText);
        driverWEB.doubleClick(locationTypeText);


        //WarehouseStore
        Thread.sleep(2000);
        esperarElementoWeb(warehouseStorePack);
        esperarElementoClicvel(warehouseStorePack);
        driverWEB.click(warehouseStorePack);
        esperarElementoWeb(inputValorWarehouseStoreImportadoPack);
        esperarElementoClicvel(inputValorWarehouseStoreImportadoPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportadoPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportadoPack).sendKeys("LJ Santa Fe");


        //Clica no text para fechar o input
        esperarElementoWeb(warehouseStoreText);
        esperarElementoClicvel(warehouseStoreText);
        driverWEB.doubleClick(warehouseStoreText);

        // Modal: Air, PO Importada
        esperarElementoWeb(poModelAir);
        esperarElementoClicvel(poModelAir);
        driverWEB.click(poModelAir);

        esperarElementoWeb(inputValorPoModelAir);
        esperarElementoClicvel(inputValorPoModelAir);
        driverWEB.clearField(inputValorPoModelAir);
        driverWEB.setText(inputValorPoModelAir, "Air");
        //Thread.sleep(1000);

        esperarElementoWeb(poModelAirText);
        esperarElementoClicvel(poModelAirText);
        driverWEB.click(poModelAirText);
        //Thread.sleep(3000);


        // External Local: SHANGAI-CHINA, PO Importada
        esperarElementoWeb(poExternalLocal);
        esperarElementoClicvel(poExternalLocal);
        driverWEB.click(poExternalLocal);

        esperarElementoWeb(inputValorPoExternalLocal);
        esperarElementoClicvel(inputValorPoExternalLocal);
        driverWEB.clearField(inputValorPoExternalLocal);
        driverWEB.setText(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        //Thread.sleep(1000);

        esperarElementoWeb(poExternalLocalText);
        esperarElementoClicvel(poExternalLocalText);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(2000);


        // TRade: Outros, PO Importada
        esperarElementoWeb(poTrade);
        esperarElementoClicvel(poTrade);
        driverWEB.click(poTrade);

        esperarElementoWeb(inputValorPoTrade);
        esperarElementoClicvel(inputValorPoTrade);
        driverWEB.clearField(inputValorPoTrade);
        driverWEB.setText(inputValorPoTrade, "Outros");

        esperarElementoWeb(poTradeText);
        esperarElementoClicvel(poTradeText);
        driverWEB.click(poTradeText);
        //Thread.sleep(3000);


        //Factory
        esperarElementoWeb(poFactory);
        esperarElementoClicvel(poFactory);
        driverWEB.click(poFactory);

        esperarElementoWeb(inputValorFactory);
        esperarElementoClicvel(inputValorFactory);
        driverWEB.clearField(inputValorFactory);
        driverWEB.setText(inputValorFactory, "475-200-0386 - ASR Sweaters Ltd");
        //Thread.sleep(1000);

        esperarElementoWeb(poFactoryText);
        esperarElementoClicvel(poFactoryText);
        driverWEB.click(poFactoryText);
        Thread.sleep(3000);

        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(8000);

        // Não validar OTB
        esperarElementoWeb(naoValidarOtb);
        esperarElementoClicvel(naoValidarOtb);
        driverWEB.click(naoValidarOtb);
        Thread.sleep(1000);


        // Botao Refresh
        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(7000);


        // Scroll Right
        for (int i = 0; i < 10; i++) {
            esperarElementoWeb(botaoScrollRight);
            esperarElementoClicvel(botaoScrollRight);
            driverWEB.click(botaoScrollRight);
        }


        // //Campos bloco Orders

        //case
        Thread.sleep(6000);
        esperarElementoWeb(orderCaseSku);
        esperarElementoClicvel(orderCaseSku);
        driverWEB.click(orderCaseSku);

        esperarElementoWeb(inputOrderCase);
        esperarElementoClicvel(inputOrderCase);
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("20");

        esperarElementoWeb(orderCaseText);
        esperarElementoClicvel(orderCaseText);
        driverWEB.click(orderCaseText);


        //order qty
        informarPOQty("400");

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");

        // Scroll Right
        for (int i = 0; i < 4; i++) {
            esperarElementoWeb(botaoScrollRight);
            esperarElementoClicvel(botaoScrollRight);
            driverWEB.click(botaoScrollRight);
        }

        esperarElementoWeb(selecionarLinhaPo);
        esperarElementoClicvel(selecionarLinhaPo);
        driverWEB.click(selecionarLinhaPo);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        Thread.sleep(5000);


        // Submitted
        esperarElementoWeb(statePo);
        esperarElementoClicvel(statePo);
        driverWEB.click(statePo);


        esperarElementoWeb(inputStatePo);
        esperarElementoClicvel(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");


        esperarElementoWeb(statePOtext);
        esperarElementoClicvel(statePOtext);
        driverWEB.click(statePOtext);
        Thread.sleep(4000);

        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(8000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();
        Thread.sleep(2000);

    }

    public void criarPedidoImportadoSkuResto(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(6000);

        // Botao Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(9000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

        driverWEB.waitObject(abaSourcing, 6);
        driverWEB.click(abaSourcing);
        Thread.sleep(3000);

        // Clicar em POs
        driverWEB.waitObject(abaPOs, 6);
        driverWEB.click(abaPOs);
        Thread.sleep(3000);

        // Clicar Supplier POs
        driverWEB.waitObject(abaSupplierPOs, 6);
        driverWEB.click(abaSupplierPOs);

        // New Supplier POs
        driverWEB.waitObject(newSupplierPO, 6);
        driverWEB.click(newSupplierPO);
        Thread.sleep(4000);

        // New Supplier POs clic me Next
        driverWEB.click(clicNext);

        Thread.sleep(4000);
        // Add sku para PO
        driverWEB.ScrollToObject(selectSku1);
        driverWEB.waitObject(selectSku1, 5);
        driverWEB.click(selectSku1);
        Thread.sleep(2000);
        //driverWEB.ScrollToObject(selectSku2);
        //driverWEB.waitObject(selectSku2, 5);
        //driverWEB.click(selectSku2);
        //Thread.sleep(2000);
        //driverWEB.ScrollToObject(selectSku3);
        //driverWEB.waitObject(selectSku3, 5);
        //driverWEB.click(selectSku3);
        //Thread.sleep(4000);

        // Finish
        driverWEB.waitObject(finish, 5);
        driverWEB.click(finish);

        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(viewerRennerNew)));

        // Select Viewer Renner PO Importada
        selecionarViewerRennerImportadaNew("Renner PO Importada");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(5000);

        //Year:
        yearNewImportado();
        Thread.sleep(4000);

        //Commercial Week:
        informarCommercialWeekImportado("45");
        Thread.sleep(3000);

        // Supplier PO PO/Model
        informarPOModelImportado("RMS LATAM");
        Thread.sleep(3000);

        //WarehouseStore
        informarWarehouseStoreImportado("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        Thread.sleep(3000);

        // Modal: Air, PO Importada
        driverWEB.click(poModelAir);
        //driverWEB.setTextWithoutClear(inputValorPoModelAir, "Air");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAir).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAir).sendKeys("Air");
        Thread.sleep(1000);
        driverWEB.click(poModelAirText);
        Thread.sleep(3000);

        // External Local: SHANGAI-CHINA, PO Importada
        driverWEB.click(poExternalLocal);
        //driverWEB.setTextWithoutClear(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocal).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocal).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(1000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(2000);

        // TRade: Outros, PO Importada
        driverWEB.click(poTrade);
        //driverWEB.setTextWithoutClear(inputValorPoTrade, "Outros");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTrade).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTrade).sendKeys("Outros");
        Thread.sleep(1000);
        driverWEB.click(poTradeText);
        Thread.sleep(3000);

        // Não validar OTB
        Thread.sleep(2000);
        driverWEB.click(naoValidarOtb);
        Thread.sleep(3000);

        //Factory
        driverWEB.click(poFactory);
        //driverWEB.setTextWithoutClear(inputValorFactory, "17121003540 - Anzir Apparels Ltd.");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactory).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactory).sendKeys("BRENDISOL TRADING S.A. - 101281");
        Thread.sleep(1000);
        driverWEB.click(poFactoryText);
        Thread.sleep(7000);

        // Clic Flexa
        //driverWEB.ScrollToObject(clicFlexaItem);  Thread.sleep(2000);
        //driverWEB.click(clicFlexaItem);  Thread.sleep(3000);

        // Scroll Right
        Thread.sleep(3000);
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
        Thread.sleep(2000);

        // Order Case 1
        driverWEB.click(orderCaseImportadoSkuRest);
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
        driverWEB.waitObject(inputOrderCaseImportadoSkuRest, 10);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputOrderCase, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCaseImportadoSkuRest).sendKeys("20");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        informarPOQty("10");
        Thread.sleep(3000);

        // Clic Flexa
        //driverWEB.ScrollToObject(clicFlexaItem);  Thread.sleep(2000);
        //driverWEB.click(clicFlexaItem);  Thread.sleep(3000);

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
        // Scroll Right
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
        driverWEB.click(selecionarLinhaPo);
        Thread.sleep(8000);

        // Selecionar fleg resto
        driverWEB.click("//*[@data-csi-act='RNR_PurchasedOrder_POLeftovers_boolean::0']//input[@role='checkbox']");
        Thread.sleep(7000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(12000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        //driverWEB.setText(inputStatePo, "Submitted");
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);


        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(7000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();
        Thread.sleep(2000);

    }

    public void criarPedidoImportadoRmsBrSku_New(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrSku("Cadastro de Itens");


        addLog(scenario, "Etapa: Selecionar Code");
        esperarElementoWeb(campoCode);
        esperarElementoClicvel(campoCode);
        driverWEB.click(campoCode);

        esperarElementoWeb(inputCode);
        esperarElementoClicvel(inputCode);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);

        esperarElementoWeb(codeSelecao);
        esperarElementoClicvel(codeSelecao);
        driverWEB.click(codeSelecao);


        // Clic Text Description
        esperarElementoWeb(textDescription);
        esperarElementoClicvel(textDescription);
        driverWEB.click(textDescription);
        //Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Code");
        esperarElementoWeb(clicCampoCode);
        esperarElementoClicvel(clicCampoCode);
        driverWEB.click(clicCampoCode);


        //Abas do Style
        Thread.sleep(2000);
        esperarElementoWeb(abaSourcing);
        esperarElementoClicvel(abaSourcing);
        driverWEB.click(abaSourcing);



        esperarElementoWeb(abaPOs);
        esperarElementoClicvel(abaPOs);
        driverWEB.click(abaPOs);
        //Thread.sleep(2000);


        esperarElementoWeb(abaSupplierPOs);
        esperarElementoClicvel(abaSupplierPOs);
        driverWEB.click(abaSupplierPOs);


        esperarElementoWeb(newSupplierPO);
        esperarElementoClicvel(newSupplierPO);
        driverWEB.click(newSupplierPO);

        // Next
        esperarElementoWeb(clicNext);
        esperarElementoClicvel(clicNext);
        driverWEB.click(clicNext);

        esperarElementoWeb(selectSku1);
        esperarElementoClicvel(selectSku1);
        driverWEB.click(selectSku1);


        // Finish
        esperarElementoWeb(finish);
        esperarElementoClicvel(finish);
        driverWEB.click(finish);
        Thread.sleep(10000);


        // Select Viewer Renner PO Importada
        selecionarViewerRennerImportadaNew("Renner PO Importada");
        Thread.sleep(4000);

        // Refresh
        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(6000);

        //Year:
        yearNewImportado();
        Thread.sleep(4000);

        //Commercial Week:
        informarCommercialWeekImportado("52");
        Thread.sleep(3000);

        // Supplier PO PO/Model
        informarPOModelImportado("RMS BR");
        Thread.sleep(3000);

        //PO TYPE
        esperarElementoWeb(POTypePack);
        esperarElementoClicvel(POTypePack);
        driverWEB.click(POTypePack);
        esperarElementoWeb(inputValorPOTypeLatamPack);
        esperarElementoClicvel(inputValorPOTypeLatamPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeLatamPack).sendKeys("Importado");

        //Clica no text para fechar o input
        esperarElementoWeb(locationTypeText);
        esperarElementoClicvel(locationTypeText);
        driverWEB.doubleClick(locationTypeText);


        //Location Type STORE OR WAREHOUSE
        esperarElementoWeb(locationType);
        esperarElementoClicvel(locationType);
        driverWEB.click(locationType);
        esperarElementoWeb(inputLocationType);
        esperarElementoClicvel(inputLocationType);
        ((SeleniumRobotsTool) driverWEB).getElement(inputLocationType).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputLocationType).sendKeys("Warehouse");


        //Clica no text para fechar o input
        esperarElementoWeb(locationTypeText);
        esperarElementoClicvel(locationTypeText);
        driverWEB.click(locationTypeText);

        //Warehouse
        Thread.sleep(4000);
        realizarValidacoesParaWarehouse();


        // Modal: Air, PO Importada
        Thread.sleep(2000);
        esperarElementoWeb(poModelAir);
        esperarElementoClicvel(poModelAir);
        driverWEB.click(poModelAir);

        esperarElementoWeb(inputValorPoModelAirSku);
        esperarElementoClicvel(inputValorPoModelAirSku);
        //Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirSku).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirSku).sendKeys("Air");
        //Thread.sleep(1000);

        esperarElementoWeb(poModelAirText);
        esperarElementoClicvel(poModelAirText);
        driverWEB.click(poModelAirText);
        //Thread.sleep(3000);


        // External Local: SHANGAI-CHINA, PO Importada
        esperarElementoWeb(poExternalLocal);
        esperarElementoClicvel(poExternalLocal);
        driverWEB.click(poExternalLocal);

        esperarElementoWeb(inputValorPoExternalLocal);
        esperarElementoClicvel(inputValorPoExternalLocal);
        driverWEB.clearField(inputValorPoExternalLocal);
        driverWEB.setText(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        //Thread.sleep(1000);

        esperarElementoWeb(poExternalLocalText);
        esperarElementoClicvel(poExternalLocalText);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(2000);

        // TRade: Outros, PO Importada
        esperarElementoWeb(poTrade);
        esperarElementoClicvel(poTrade);
        driverWEB.click(poTrade);

        esperarElementoWeb(inputValorPoTrade);
        esperarElementoClicvel(inputValorPoTrade);
        driverWEB.clearField(inputValorPoTrade);
        driverWEB.setText(inputValorPoTrade, "Outros");

        esperarElementoWeb(poTradeText);
        esperarElementoClicvel(poTradeText);
        driverWEB.click(poTradeText);
        //Thread.sleep(3000);


        //Factory
        esperarElementoWeb(poFactory);
        esperarElementoClicvel(poFactory);
        driverWEB.click(poFactory);

        esperarElementoWeb(inputValorFactory);
        esperarElementoClicvel(inputValorFactory);
        driverWEB.clearField(inputValorFactory);
        driverWEB.setText(inputValorFactory, "475-200-0386 - ASR Sweaters Ltd");
        //Thread.sleep(1000);

        esperarElementoWeb(poFactoryText);
        esperarElementoClicvel(poFactoryText);
        driverWEB.click(poFactoryText);
        Thread.sleep(3000);

        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(8000);

        // Não validar OTB
        esperarElementoWeb(naoValidarOtb);
        esperarElementoClicvel(naoValidarOtb);
        driverWEB.click(naoValidarOtb);
        Thread.sleep(1000);


        // Botao Refresh
        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(7000);


        // Scroll Right
        for (int i = 0; i < 10; i++) {
            esperarElementoWeb(botaoScrollRight);
            esperarElementoClicvel(botaoScrollRight);
            driverWEB.click(botaoScrollRight);
        }


        // //Campos bloco Orders

        //case
        Thread.sleep(6000);
        esperarElementoWeb(orderCaseSku);
        esperarElementoClicvel(orderCaseSku);
        driverWEB.click(orderCaseSku);

        esperarElementoWeb(inputOrderCase);
        esperarElementoClicvel(inputOrderCase);
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("20");

        esperarElementoWeb(orderCaseText);
        esperarElementoClicvel(orderCaseText);
        driverWEB.click(orderCaseText);


        //order qty
        informarPOQty("400");

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");

        // Scroll Right
        for (int i = 0; i < 4; i++) {
            esperarElementoWeb(botaoScrollRight);
            esperarElementoClicvel(botaoScrollRight);
            driverWEB.click(botaoScrollRight);
        }

        esperarElementoWeb(selecionarLinhaPo);
        esperarElementoClicvel(selecionarLinhaPo);
        driverWEB.click(selecionarLinhaPo);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        Thread.sleep(5000);


        // Submitted
        esperarElementoWeb(statePo);
        esperarElementoClicvel(statePo);

        driverWEB.click(statePo);


        esperarElementoWeb(inputStatePo);
        esperarElementoClicvel(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");


        esperarElementoWeb(statePOtext);
        esperarElementoClicvel(statePOtext);
        driverWEB.click(statePOtext);
        Thread.sleep(4000);

        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(8000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();
        Thread.sleep(2000);

    }



    public void realizarValidacoesParaWarehouse() {
        addLog(scenario, "Etapa: Validação das regras para o campo Warehouse/Store");

        String expectedWarehouseStoreValue = "CDD CENTRO DE DISTRIBUICAO SAO JOSE 324";
        String actualWarehouseStoreValue = ((SeleniumRobotsTool) driverWEB).getElement(warehouseStorePackImportadoRMSBR).getText();

        if (actualWarehouseStoreValue.equals(expectedWarehouseStoreValue) &&
                poModelValido("RMS BR") &&
                POTypeValido("Importado") &&
                locationTypeValido("Warehouse")) {
            addLog(scenario, "Todas as validações passaram. O valor do campo Warehouse/Store é correto.");
        } else {
            addLog(scenario, "A validação para o campo Warehouse/Store falhou. O valor não é igual a CDD CENTRO DE DISTRIBUICAO SAO JOSE 324 ou alguma das validações para PO Model, PO Type ou Location Type falhou.");
            Assert.assertEquals(expectedWarehouseStoreValue, actualWarehouseStoreValue);
        }
    }




    // Método para validar PO Model
    private boolean poModelValido (String expectedPOModel){
        String actualPOModel = ((SeleniumRobotsTool) driverWEB).getElement(poModel).getText();
        return actualPOModel.equals(expectedPOModel);
    }

    // Método para validar PO Type
    private boolean POTypeValido (String expectedPOType){
        String actualPOType = ((SeleniumRobotsTool) driverWEB).getElement(POTypePack).getText();
        return actualPOType.equals(expectedPOType);
    }

    // Método para validar Location Type
    private boolean locationTypeValido (String expectedLocationType){
        String actualLocationType = ((SeleniumRobotsTool) driverWEB).getElement(locationType).getText();
        return actualLocationType.equals(expectedLocationType);
    }









    public void criarPedidoSplitSKU_New(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);

        // Botao Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(8000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(8000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

        driverWEB.waitObject(abaSourcing, 6);
        driverWEB.click(abaSourcing);
        Thread.sleep(3000);

        // Clicar em POs
        driverWEB.waitObject(abaPOs, 6);
        driverWEB.click(abaPOs);
        Thread.sleep(3000);

        // Clicar Supplier POs
        driverWEB.waitObject(abaSupplierPOs, 6);
        driverWEB.click(abaSupplierPOs);

        // New Supplier POs
        driverWEB.waitObject(newSupplierPO, 6);
        driverWEB.click(newSupplierPO);
        Thread.sleep(4000);

        // New Supplier POs clic em Next
        driverWEB.click(clicNext);

        Thread.sleep(4000);
        // Add sku para PO
        driverWEB.ScrollToObject(selectSku1);
        driverWEB.waitObject(selectSku1, 5);
        driverWEB.click(selectSku1);
        Thread.sleep(2000);
        //driverWEB.ScrollToObject(selectSku2);
        //driverWEB.waitObject(selectSku2, 5);
        //driverWEB.click(selectSku2);
        //Thread.sleep(2000);
        //driverWEB.ScrollToObject(selectSku3);
        //driverWEB.waitObject(selectSku3, 5);
        //driverWEB.click(selectSku3);
        //Thread.sleep(4000);

        // Finish
        driverWEB.waitObject(finish, 5);
        driverWEB.click(finish);

        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(viewerRennerNew)));

        // Select Viewer Renner PO Importada
        addLog(scenario, "Etapa: Select Viewer Renner PO Importada");
        selecionarViewerRennerImportadaNew("Renner PO Importada");
        Thread.sleep(7000);

        // Refresh
        addLog(scenario, "Etapa: Select Refresh");
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(7000);

        //Year:
        addLog(scenario, "Etapa: Year");
        yearNewImportado();
        Thread.sleep(4000);

        //Commercial Week:
        addLog(scenario, "Etapa: Commercial Week");
        informarCommercialWeekImportadoSku("45");
        Thread.sleep(3000);

        // PO Type
        addLog(scenario, "Etapa: PO Type");
        driverWEB.click(poTypeImportada);
        //driverWEB.setTextWithoutClear(inputValorPOTypeImportada, "Importado");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeImportadaSku).sendKeys("Importado");
        Thread.sleep(1000);
        driverWEB.click(poTypeImportadaText);
        Thread.sleep(2000);

        // Supplier PO PO/Model
        addLog(scenario, "Etapa: Supplier PO PO/Model");
        informarPOModelImportado("Split (RMS BR and LATAM)");
        Thread.sleep(3000);

        //WarehouseStore
        addLog(scenario, "Etapa: WarehouseStore");
        informarWarehouseStoreImportado("CENTRO DE DISTRIBUIÇÃO URUGUAI");
        Thread.sleep(3000);

        // Modal: Air, PO Importada
        addLog(scenario, "Etapa: Modal: Air");
        driverWEB.click(poModelAir);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirSku).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirSku).sendKeys("Air");
        Thread.sleep(2000);
        driverWEB.click(poModelAirText);
        Thread.sleep(3000);

        // External Local: SHANGAI-CHINA, PO Importada
        addLog(scenario, "Etapa: External Local: SHANGAI-CHINA, PO Importada");
        driverWEB.click(poExternalLocal);
        //driverWEB.setTextWithoutClear(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalSku).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalSku).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(2000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(3000);

        // TRade: Outros, PO Importada
        addLog(scenario, "Etapa: TRade: Outros");
        driverWEB.click(poTrade);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeSku).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeSku).sendKeys("Outros");
        Thread.sleep(2000);
        driverWEB.click(poTradeText);
        Thread.sleep(3000);

        // Parceiro (FFDD) : 394777319395 - 5F Apparels Ltd, PO Importada
        //driverWEB.click(poParceiro);
        //driverWEB.setTextWithoutClear(inputValorParceiro, "12/08/2022");
        //Thread.sleep(1000);
        //driverWEB.click(poParceiroText);
        //Thread.sleep(4000);

        //Factory
        addLog(scenario, "Etapa: Factory");
        driverWEB.click(poFactory);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactorySku).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactorySku).sendKeys("17121003540 - Anzir Apparels Ltd.");
        Thread.sleep(1000);
        driverWEB.click(poFactoryText);
        Thread.sleep(2000);

        // Não validar OTB
        addLog(scenario, "Etapa: Não validar OTB");
        driverWEB.click(naoValidarOtb);
        Thread.sleep(2000);

        // Botao Refresh
        addLog(scenario, "Etapa: Refresh");
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(7000);

        // Clic Flexa
        //driverWEB.ScrollToObject(clicFlexaItem);  Thread.sleep(2000);
        //driverWEB.click(clicFlexaItem);  Thread.sleep(3000);

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

        // Order Case 1
        driverWEB.click(orderCaseSku);
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
        //driverWEB.setTextWithoutClear(inputOrderCase, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("20");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        //Orders -> Supplier PO Order Qty order
        driverWEB.click(orderQty);
        Thread.sleep(2000);

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

        // XPath
        driverWEB.waitObject(inputValorOrderQty, 10);

        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorOrderQty).sendKeys("400");
        Thread.sleep(2000);

        // Clic Order Qty Text pg
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);

        //Orders -> Supplier PO Order Qty order
        driverWEB.click(orderQty);
        Thread.sleep(2000);

        // Clic mouse OrderQty text/input
        WebDriver driverOrderQty2 = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicOrderQtyte2 = driverOrderQty2.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'Quantity::0')]"));
        // Instantiating Actions Class
        Actions actions2 = new Actions(driverOrderQty2);
        // Hovering on clicOrderQtytext
        actions2.moveToElement(clicOrderQtyte2);
        // build() - used to complie all the actions
        actions2.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Qty Text pg
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);

        actions2.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Qty Text pg
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);
        actions2.click().build().perform();

        // XPath
        driverWEB.waitObject(inputValorOrderQty, 10);

        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorOrderQty).sendKeys("400");
        Thread.sleep(2000);

        // Clic Order Qty Text pg
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        driverWEB.ScrollToObject(selecionarLinhaPo);
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
        driverWEB.click(selecionarLinhaPo);
        Thread.sleep(7000);

        // Clic Flexa
        //driverWEB.ScrollToObject(clicFlexaItem);  Thread.sleep(2000);
        //driverWEB.click(clicFlexaItem);  Thread.sleep(3000);

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
        Thread.sleep(2000);

        // Split 1
        driverWEB.click(orderTipoSplitText);
        Thread.sleep(2000);

        //Order -> Tipo Split Text/Input
        driverWEB.click(orderTipoSplit);
        Thread.sleep(2000);

        // Insert valor no campo Tipo Split
        //driverWEB.setTextWithoutClear(inputValorOrderTipoSplit, "Percentual");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorOrderTipoSplit).sendKeys("Percentual");
        Thread.sleep(3000);

        // Clic Order Tipo Split Text pg
        driverWEB.click(orderTipoSplitText);
        Thread.sleep(4000);

        //Order PO Order Valor Split Tipo Split Text/Input
        driverWEB.click(orderValorSplit);
        Thread.sleep(3000);

        // Clic mouse Order Valor Split text/input
        WebDriver driverOrderValorSplit = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicOrderValorSplite = driverOrderValorSplit.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_ValorSplit_integer::0')]"));
        // Instantiating Actions Class
        Actions actionsValorSplit = new Actions(driverOrderValorSplit);
        // Hovering on clic Order Valor Split text
        actionsValorSplit.moveToElement(clicOrderValorSplite);
        // build() - used to complie all the actions
        actionsValorSplit.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Valor SPlit Text pg
        driverWEB.click(orderValorSplitText);
        Thread.sleep(2000);

        actionsValorSplit.click().build().perform();
        Thread.sleep(2000);

        // Clic Order Valor Split Text pg
        driverWEB.click(orderValorSplitText);
        Thread.sleep(2000);
        actionsValorSplit.click().build().perform();

        // XPath Valor Split
        driverWEB.waitObject(inputValorSplit, 10);

        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorSplit, "50");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorSplit).sendKeys("50");
        Thread.sleep(3000);

        // Clic Order Valor Split Text pg
        driverWEB.click(orderValorSplitText);
        Thread.sleep(7000);

        //Split 2

        //driverWEB.click(orderTipoSplitText);
        //Thread.sleep(2000);

        //Order -> Tipo Split Text/Input
        //driverWEB.click(orderTipoSplit);
        //Thread.sleep(2000);

        // Insert valor no campo Tipo Split
        //driverWEB.setTextWithoutClear(inputValorOrderTipoSplit, "Percentual");
        //((SeleniumRobotsTool)driverWEB).getElement(inputValorOrderTipoSplit).sendKeys("Percentual");
        //Thread.sleep(3000);

        // Clic Order Tipo Split Text pg
        //driverWEB.click(orderTipoSplitText);
        //Thread.sleep(4000);

        //Order PO Order Valor Split Tipo Split Text/Input
        //driverWEB.click(orderValorSplit);
        //Thread.sleep(3000);

        // Clic mouse Order Valor Split text/input
        //WebDriver driverOrderValorSplit2 = ((WebDriver)(driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        //WebElement clicOrderValorSplite2 = driverOrderValorSplit.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_ValorSplit_integer::0')]"));
        // Instantiating Actions Class
        //Actions actionsValorSplit2 = new Actions(driverOrderValorSplit2);
        // Hovering on clic Order Valor Split text
        //actionsValorSplit2.moveToElement(clicOrderValorSplite2);
        // build() - used to complie all the actions
        //actionsValorSplit2.click().build().perform();
        //Thread.sleep(1000);

        // Clic Order Valor SPlit Text pg
        ///driverWEB.click(orderValorSplitText);
        //Thread.sleep(2000);

        //actionsValorSplit2.click().build().perform();
        //Thread.sleep(2000);

        // Clic Order Valor Split Text pg
        //driverWEB.click(orderValorSplitText);
        //Thread.sleep(2000);
        //actionsValorSplit2.click().build().perform();

        // XPath Valor Split
        //driverWEB.waitObject(inputValorSplit, 10);

        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorSplit, "50");
        //((SeleniumRobotsTool)driverWEB).getElement(inputValorSplit).sendKeys("50");
        //Thread.sleep(3000);

        // Clic Order Valor Split Text pg
        //driverWEB.click(orderValorSplitText);
        //Thread.sleep(7000);

        //Split 3
        //driverWEB.click(orderTipoSplitText);
        //Thread.sleep(2000);

        //Order -> Tipo Split Text/Input
        //driverWEB.click(orderTipoSplit);
        //Thread.sleep(2000);

        // Insert valor no campo Tipo Split
        //driverWEB.setTextWithoutClear(inputValorOrderTipoSplit, "Percentual");
        //((SeleniumRobotsTool)driverWEB).getElement(inputValorOrderTipoSplit).sendKeys("Percentual");
        //Thread.sleep(3000);

        // Clic Order Tipo Split Text pg
        //driverWEB.click(orderTipoSplitText);
        //Thread.sleep(4000);

        //Order PO Order Valor Split Tipo Split Text/Input
        //driverWEB.click(orderValorSplit);
        //Thread.sleep(3000);

        // Clic mouse Order Valor Split text/input
        ///WebDriver driverOrderValorSplit3 = ((WebDriver)(driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        //WebElement clicOrderValorSplite3 = driverOrderValorSplit3.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_ValorSplit_integer::0')]"));
        // Instantiating Actions Class
        //Actions actionsValorSplit3 = new Actions(driverOrderValorSplit3);
        // Hovering on clic Order Valor Split text
        //actionsValorSplit3.moveToElement(clicOrderValorSplite3);
        // build() - used to complie all the actions
        //actionsValorSplit3.click().build().perform();
        //Thread.sleep(1000);

        // Clic Order Valor SPlit Text pg
        //driverWEB.click(orderValorSplitText);
        //Thread.sleep(2000);

        //actionsValorSplit3.click().build().perform();
        //Thread.sleep(2000);

        // Clic Order Valor Split Text pg
        //driverWEB.click(orderValorSplitText);
        //Thread.sleep(2000);
        //actionsValorSplit3.click().build().perform();

        // XPath Valor Split
        //driverWEB.waitObject(inputValorSplit, 10);

        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorSplit, "50");
        //((SeleniumRobotsTool)driverWEB).getElement(inputValorSplit).sendKeys("50");
        //Thread.sleep(3000);

        // Clic Order Valor Split Text pg
        //driverWEB.click(orderValorSplitText);
        //Thread.sleep(7000);

        // F5 page

        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(9000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);

    }

    public void alterarPedidoBrPack(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);
        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        driverWEB.click(copyCampoSupplierPOAll);
        driverWEB.waitObject(copySupplierPOInput, 6);
        Thread.sleep(2000);

        // Po Br Pack !!!!!!!!!!!!!!!
        driverWEB.setText(copySupplierPOInput, "5238112");
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        driverWEB.click(copyStattePO);
        Thread.sleep(3000);

        // clicar na PO
        driverWEB.waitObject(clicPoBrPack, 10);
        driverWEB.click(clicPoBrPack);
        Thread.sleep(2000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Nacional");
        Thread.sleep(4000);

        // State PO para valiation
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Validation");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_State_enum:']//div[@item='0']");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(12000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(12000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(12000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(10000);


        // Refresh
        //driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        //Thread.sleep(6000);

        //Commercial Week:
        informarCommercialWeek("54");
        Thread.sleep(5000);

        // OTB
        driverWEB.click(naoValidarOtbNacional);
        Thread.sleep(9000);

        // Scroll Right
        Thread.sleep(3000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(7000);

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
        Thread.sleep(2000);
        actionspp.click().build().perform();
        // XPath
        //driverWEB.click(selectCampoPP);
        Thread.sleep(2000);
        driverWEB.waitObject(inputValorpp, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys("2");
        Thread.sleep(2000);
        // Clic G Text pg
        driverWEB.click(gText);
        Thread.sleep(4000);

        //Clic GG text
        Thread.sleep(2000);
        // Clic mouse GG text/input
        WebDriver driverGG = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicGG = driverGG.findElement(By.xpath("//*[@data-csi-heading-vi='4']"));
        // Instantiating Actions Class
        Actions actionsGG = new Actions(driverGG);
        // Hovering on clicGtext
        actionsGG.moveToElement(clicGG);
        // build() - used to complie all the actions
        actionsGG.click().build().perform();
        Thread.sleep(1000);

        // Clic Gg Text pg
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
        // Insert valor no campo GG
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorgg).sendKeys("2");
        Thread.sleep(2000);
        // Clic GG Text pg
        driverWEB.click(ggText);
        Thread.sleep(4000);


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
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);
        actionss.click().build().perform();

        // XPath
        driverWEB.waitObject(inputOrderCase, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("1");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys("2");
        Thread.sleep(4000);

        // Clic Pack Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(4000);

        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(4000);

        //clic clusterW
        driverWEB.waitObject(clusterW, 20);
        driverWEB.click(clusterW);
        Thread.sleep(4000);

        // Approval Reason = ALTERAÇÃO DE COMMENTS
        driverWEB.waitObject(approvalReason, 50);
        driverWEB.click(approvalReason);
        Thread.sleep(3000);
        //((SeleniumRobotsTool) driverWEB).setText(approvalReasonInput,"ALTERAÇÃO DE COMMENTS");
        ((SeleniumRobotsTool) driverWEB).getElement(approvalReasonInput).sendKeys("ALTERAÇÃO DE COMMENTS");
        Thread.sleep(2000);
        driverWEB.click("//*[@item='0']//span");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);

    }

    public void alterarPedidooSkuBr(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        driverWEB.click(copyCampoSupplierPOAll);
        driverWEB.waitObject(copySupplierPOInput, 6);
        Thread.sleep(2000);

        // Po Br Sku !!!!!
        driverWEB.setText(copySupplierPOInput, "5217698");
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        driverWEB.click(copyStattePO);
        Thread.sleep(3000);

        // clicar na PO
        driverWEB.waitObject(clicPoBrPack, 10);
        driverWEB.click(clicPoBrPack);
        Thread.sleep(2000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Nacional");
        Thread.sleep(4000);

        // State PO para valiation
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Validation");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_State_enum:']//div[@item='0']");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        //Commercial Week:
        informarCommercialWeek("40");
        Thread.sleep(6000);

        // OTB
        driverWEB.click(naoValidarOtbNacional);
        Thread.sleep(9000);

        // Scroll Right
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(3000);

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
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);
        actionss.click().build().perform();

        // XPath
        driverWEB.waitObject(inputOrderCase, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("2");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(23000);

        informarPOQty("4");
        Thread.sleep(4000);

        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);

        //clic clusterW
        driverWEB.waitObject(clusterW, 30);
        driverWEB.click(clusterW);
        Thread.sleep(4000);

        // Approval Reason = ALTERAÇÃO DE COMMENTS
        driverWEB.waitObject(approvalReason, 50);
        driverWEB.click(approvalReason);
        Thread.sleep(3000);
        //((SeleniumRobotsTool) driverWEB).setText(approvalReasonInput,"ALTERAÇÃO DE COMMENTS");
        ((SeleniumRobotsTool) driverWEB).getElement(approvalReasonInput).sendKeys("ALTERAÇÃO DE COMMENTS");
        Thread.sleep(2000);
        driverWEB.click("//*[@item='0']//span");
        Thread.sleep(2000);
        driverWEB.click(approvalReasonText);
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(7000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(5000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);

    }

    public void conversaoPedidoPackSku(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);
        //driverWEB.click(textCode);Thread.sleep(2000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(4000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(5000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(4000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(5000);

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

        // Colorway 1
        driverWEB.waitObject(selectColorway1, 5);
        driverWEB.click(selectColorway1);
        Thread.sleep(2000);

        // Finish
        driverWEB.waitObject(finish, 5);
        driverWEB.click(finish);
        Thread.sleep(10000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRennerNacional("Renner PO Nacional");
        Thread.sleep(2000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        //Order Origin:
        //informarPais("BRASIL");
        //Thread.sleep(2000);

        yearPack();
        Thread.sleep(2000);

        //Commercial Week:
        informarCommercialWeekPack("45");
        Thread.sleep(2000);

        //PO Model Supplier
        informarPOModelPack("RMS BR");
        Thread.sleep(3000);

        //WarehouseStore
        informarWarehouseStorePack("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        Thread.sleep(4000);

        // Não validar OTB
        driverWEB.click(naoValidarOtb);
        Thread.sleep(3000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        // Remover o item pedido
        driverWEB.ScrollToObject("//*[contains(text(),'Actions')]");
        driverWEB.click(deleteClic);
        Thread.sleep(2000);
        // Confirmar Delete item
        driverWEB.click(deleteText);
        Thread.sleep(2000);

        // clicar no campo para convertes pedido
        driverWEB.ScrollToObject(campoOrderConverter);
        driverWEB.click(campoOrderConverter);
        Thread.sleep(2000);
        driverWEB.setText(inputCampoOrderConverter, "From Pack to SKU");
        Thread.sleep(2000);
        driverWEB.click(naoValidarOtbText);
        Thread.sleep(2000);

        // adicionar item apos a conversao
        driverWEB.click("//*[contains(text(),'New Style SKUs Order')]");

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(280L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//th//div//span[contains(text(),'Style SKU')]")));

        informarItemSku("BSM_FW23_CCO_0004");

        // Order Case 1
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
        //driverWEB.setTextWithoutClear(inputOrderCase, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("2");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        informarPOQty("4");
        Thread.sleep(3000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
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
        Thread.sleep(2000);
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
        driverWEB.click(selecionarLinhaPo);
        Thread.sleep(5000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(5000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();
        Thread.sleep(2000);

    }


    public void conversaoPedidoSkuPack(String itemPaiCode) throws Exception {

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(campoCode)));

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRenner("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(7000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // New Supplier POs clic me Next
        driverWEB.click(clicNext);

        Thread.sleep(4000);
        // Add sku para PO
        driverWEB.ScrollToObject(selectSku1);
        driverWEB.waitObject(selectSku1, 5);
        driverWEB.click(selectSku1);
        Thread.sleep(4000);

        // Finish
        driverWEB.waitObject(finish, 5);
        driverWEB.click(finish);
        WebDriver driverr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waitt = new FluentWait<WebDriver>(driverr).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath(viewerRennerNew)));

        // Select Viewer Renner PO Nacional
        selecionarViewerRennerNacionalNew("Renner PO Nacional");
        Thread.sleep(7000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        //Order Origin New
        informarPais("BRASIL");
        Thread.sleep(3000);

        //Year New
        yearNew();
        Thread.sleep(3000);

        //Commercial Week:
        informarCommercialWeek("45");
        //informarCommercialWeek(semana);
        Thread.sleep(3000);

        // Supplier PO PO/Model
        informarPOModel("RMS BR");
        Thread.sleep(3000);

        //WarehouseStore
        addLog(scenario, "Etapa: WarehouseStore");
        informarWarehouseStore("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        Thread.sleep(7000);

        // OTB
        driverWEB.click(naoValidarOtb);
        Thread.sleep(3000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(9000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        // Remover o item pedido
        driverWEB.ScrollToObject("//*[contains(text(),'Actions')]");
        driverWEB.click(deleteClic);
        Thread.sleep(2000);
        // Confirmar Delete item
        driverWEB.click(deleteText);
        Thread.sleep(2000);

        // clicar no campo para convertes pedido
        driverWEB.ScrollToObject(campoOrderConverter);
        driverWEB.click(campoOrderConverter);
        Thread.sleep(2000);
        driverWEB.setText(inputCampoOrderConverter, "From SKU to PACK");
        Thread.sleep(2000);
        driverWEB.click(naoValidarOtbText);
        Thread.sleep(2000);

        // adicionar item apos a conversao
        driverWEB.click("//*[contains(text(),'New Colorways Order')]");
        Thread.sleep(2000);
        WebDriver driverrr = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> waittt = new FluentWait<WebDriver>(driverrr).withTimeout(Duration.ofSeconds(280L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        waittt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//div//span[contains(text(),'New Colorways Order')]")));

        informarItemPack("BSM_FW23_CCO_0004");
        Thread.sleep(3000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        // Scroll Right
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
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(6000);

        // Clic PP Text pg
        Thread.sleep(5000);
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
        Thread.sleep(2000);
        actionspp.click().build().perform();
        // XPath
        //driverWEB.click(selectCampoPP);
        Thread.sleep(2000);
        driverWEB.waitObject(inputValorpp, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys("4");
        Thread.sleep(2000);
        // Clic G Text pg
        driverWEB.click(gText);
        Thread.sleep(5000);

        // Clic GG Text pg
        //Thread.sleep(2000);
        // Clic mouse GG text/input
        //WebDriver driverGG = ((WebDriver)(driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        //vWebElement clicGG = driverGG.findElement(By.xpath("//*[@data-csi-heading-vi='4']"));
        // Instantiating Actions Class
        //Actions actionsGG = new Actions(driverGG);
        // Hovering on clicGGtext
        //actionsGG.moveToElement(clicGG);
        // build() - used to complie all the actions
        //actionsGG.click().build().perform();
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(2000);
        //actionsGG.click().build().perform();
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(2000);
        //actionsGG.click().build().perform();
        //driverWEB.click(selectCampoGG);
        //Thread.sleep(2000);
        // XPath
        //driverWEB.waitObject(inputValorgg, 10);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorgg, "2");
        //((SeleniumRobotsTool)driverWEB).getElement(inputValorgg).sendKeys("2");
        //Thread.sleep(2000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(2000);

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
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("10");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys("1000");
        Thread.sleep(2000);

        // Clic Pack Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(2000);

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
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
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,20);
        driverWEB.click(selecionarLinhaPo);
        Thread.sleep(3000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();
        Thread.sleep(2000);

    }


    public void criarPedidoNacionalPack_New(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(6000);
        viewerRennerPoBrPack("Renner");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);
        //driverWEB.click(textCode);Thread.sleep(2000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        esperarElementoWeb(campoCode);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        esperarElementoWeb(inputCode);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(4000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(5000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        esperarElementoWeb(clicCampoCode);
        driverWEB.click(clicCampoCode);
        esperarElementoWeb(abaSourcing);
        driverWEB.click(abaSourcing);

        // Clicar em POs
        esperarElementoWeb(abaPOs);
        driverWEB.click(abaPOs);

        // Clicar Supplier POs
        esperarElementoWeb(abaSupplierPOs);
        driverWEB.click(abaSupplierPOs);

        // New Supplier POs
        esperarElementoWeb(newSupplierPO);
        driverWEB.click(newSupplierPO);

        // Select Pack
        esperarElementoWeb(selectPack);
        driverWEB.click(selectPack);

        // New Supplier POs clic me Next
        esperarElementoWeb(clicNext);
        driverWEB.click(clicNext);

        // Color Specification, Add Colorway para PO
        // Colorway 1
        esperarElementoWeb(selectColorway1);
        driverWEB.click(selectColorway1);

        // Colorway 2
        //driverWEB.waitObject(selectColorway2, 5);
        //driverWEB.click(selectColorway2);
        //Thread.sleep(3000);

        // Finish
        esperarElementoWeb(finish);
        driverWEB.click(finish);

        // Select Viewer Renner PO Nacional
        selecionarViewerRennerNacional("Renner PO Nacional");
        Thread.sleep(2000);

        // Refresh
        esperarElementoWeb(btnRefreshPo);
        driverWEB.click(btnRefreshPo);

        //Order Origin:
        //informarPais("BRASIL");
        //Thread.sleep(2000);
        esperarElementoWeb(yearPack);
        yearPack();

        //Commercial Week:
        informarCommercialWeekPack("52");

        //PO Model Supplier
        informarPOModelPack("RMS BR");
        Thread.sleep(2000);

        //WarehouseStore
        informarWarehouseStorePack("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        Thread.sleep(2000);


        // PO Type
        //driverWEB.click(poTypeNacional);
        //driverWEB.setTextWithoutClear(inputValorPOTypeNacional, "Normal");
        //Thread.sleep(1000);
        //driverWEB.click(poTypeNacionalText);
        //Thread.sleep(2000);

        // Não validar OTB
        esperarElementoWeb(naoValidarOtb);
        driverWEB.click(naoValidarOtb);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(5000);

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
        Thread.sleep(5000);

        // Clic PP Text pg Primeiro
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
        Thread.sleep(2000);
        actionspp.click().build().perform();
        // XPath
        //driverWEB.click(selectCampoPP);
        Thread.sleep(2000);
        driverWEB.waitObject(inputValorpp, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys("4");
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
        driverWEB.click(selectCampoGG);
        Thread.sleep(2000);
        // XPath
        driverWEB.waitObject(inputValorgg, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorgg).sendKeys("2");
        Thread.sleep(3000);
        // Clic GG Text pg
        driverWEB.click(ggText);
        Thread.sleep(2000);

//        driverWEB.click(orderCase);
//        Thread.sleep(4000);
//        // Clic mouse OrderQty text/input
//        WebDriver driverOrderCase = ((WebDriver)(driverWEB.getDriver()));
//        // Locating the main menu (Parent element)
//        WebElement clicOrderCase = driverOrderCase.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]"));
//        // Instantiating Actions Class
//        Actions actionss = new Actions(driverOrderCase);
//        // Hovering on clicOrderQtytext
//        actionss.moveToElement(clicOrderCase);
//        // build() - used to complie all the actions
//        actionss.click().build().perform();
//        Thread.sleep(1000);

//        // Clic Order Case Text pg
//        esperarElementoWeb(orderCaseText);
//        driverWEB.click(orderCaseText);
//        actionss.click().build().perform();
//
//        // Clic Order Case Text pg
//        esperarElementoWeb(orderCaseText);
//        driverWEB.click(orderCaseText);
//        actionss.click().build().perform();
//
//        // XPath
//        driverWEB.waitObject(inputOrderCase, 10);
//        // Insert valor no campo OrderQty
//        ((SeleniumRobotsTool)driverWEB).getElement(inputOrderCase).sendKeys("10");
//
//
//        // Clic Order Case Text pg
//        esperarElementoWeb(orderCaseText);
//        driverWEB.click(orderCaseText);
//
//        // Clic Order Case Text pg
//        esperarElementoWeb(orderCaseText);
//        driverWEB.click(orderCaseText);
//
//        // Pack Qty
//        esperarElementoWeb(packQTy);
//        driverWEB.click(packQty);
//        Thread.sleep(4000);
//        // Clic mouse OrderQty text/input
//        WebDriver driverPackQty = ((WebDriver)(driverWEB.getDriver()));
//        // Locating the main menu (Parent element)
//        WebElement clicPackQtyte = driverPackQty.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'UnitPerPack::0')]"));
//        // Instantiating Actions Class
//        Actions actions = new Actions(driverPackQty);
//        // Hovering on clicOrderQtytext
//        actions.moveToElement(clicPackQtyte);
//        // build() - used to complie all the actions
//        actions.click().build().perform();
//
//        // Clic Order Qty Text pg
//        esperarElementoWeb(packQtyText);
//        driverWEB.click(packQtyText);
//        Thread.sleep(2000);
//        actions.click().build().perform();
//
//        // Clic Order Qty Text pg
//        esperarElementoWeb(packQtyText);
//        driverWEB.click(packQtyText);
//        Thread.sleep(2000);
//        actions.click().build().perform();
//
//        // XPath
//        esperarElementoWeb(inputValorPackQty);
//        // Insert valor no campo OrderQty
//        ((SeleniumRobotsTool)driverWEB).getElement(inputValorPackQty).sendKeys("1000");
//        Thread.sleep(2000);
//
//        // Clic Pack Qty Text pg
//        esperarElementoWeb(packQtyText);
//        driverWEB.click(packQtyText);
//
//        // Clic Order Case Text pg
//        esperarElementoWeb(orderCaseText);
//        driverWEB.click(orderCaseText);

        // Scroll Right
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
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

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
        esperarElementoWeb(selecionarLinhaPo);
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,20);
        driverWEB.click(selecionarLinhaPo);

        // Clic Flexa
        //driverWEB.ScrollToObject(clicFlexaItem);
        //driverWEB.click(clicFlexaItem);

//        //clic clusterGuideShop
//        driverWEB.waitObject(clusterGuideShop, 30);
//        driverWEB.click(clusterGuideShop);
//        Thread.sleep(7000);

//        //clic clusterAER
//        //((SeleniumRobotsTool) driverWEB).waitElementClickable(clusterAER,20);
//        driverWEB.click(clusterGuideShopText);
//        driverWEB.waitObject(clusterAER, 30);
//        driverWEB.click(clusterAER);
//        Thread.sleep(2000);

//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        // Cluster RIO
        //driverWEB.waitObject(clusterRIO, 50);
        //driverWEB.click(clusterRIO);
        //((SeleniumRobotsTool) driverWEB).setText(clusterRIOInput,"P");
        //driverWEB.click(clusterRIOText);

        // Cluster NOR
        //driverWEB.waitObject(clusterNOR, 50);
        //driverWEB.click(clusterNOR);
        //((SeleniumRobotsTool) driverWEB).setText(clusterNORInput,"P");
        //driverWEB.click(clusterNORText);

//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        //clic clusterW
//        driverWEB.click(clusterW);
//        Thread.sleep(2000);
//
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//
//        //locationList = 239097
//        driverWEB.waitObject(locationList, 50);
//        driverWEB.click(locationList);
//        ((SeleniumRobotsTool) driverWEB).setText(locationListInput,"239097");
//        driverWEB.click(locationListText);
//        Thread.sleep(2000);
//
//        //distributionRoles = #Buffer e #PC
//        driverWEB.waitObject(distributionRoles, 50);
//        driverWEB.click(distributionRoles);
//        Thread.sleep(4000);
//        ((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput,"#Buffer");
//        Thread.sleep(3000);
//        ((SeleniumRobotsTool) driverWEB).click("//input[@value='RNR_DistributionRules:#Buffer']");
//        driverWEB.click(distributionRolesText);
//        Thread.sleep(2000);
//
//        //distributionRoles = #Buffer e #PC
//        driverWEB.waitObject(distributionRoles, 50);
//        driverWEB.click(distributionRoles);
//        Thread.sleep(4000);
//        ((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput,"#PC");
//        Thread.sleep(3000);
//        ((SeleniumRobotsTool) driverWEB).click("//input[@value='RNR_DistributionRules:#PC']");
//        driverWEB.click(distributionRolesText);
//        Thread.sleep(2000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(8000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();
        Thread.sleep(2000);


    }

    public void alterarPedidoLatamPackRmsLatam(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        driverWEB.click(copyCampoSupplierPOAll);
        driverWEB.waitObject(copySupplierPOInput, 6);
        Thread.sleep(2000);

        // Po Br Pack
        driverWEB.setText(copySupplierPOInput, "3111566");
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        driverWEB.click(copyStattePO);
        Thread.sleep(3000);

        // clicar na PO
        driverWEB.waitObject(clicPoBrPack, 10);
        driverWEB.click(clicPoBrPack);
        Thread.sleep(2000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Importada");
        Thread.sleep(4000);

        // State PO para valiation
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Validation");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_State_enum:']//div[@item='0']");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        //Commercial Week:
        informarCommercialWeekImportado("45");
        Thread.sleep(4000);

        //WarehouseStore
        //Thread.sleep(1000);
        //informarWarehouseStoreImportado("CENTRO DE DISTRIBUIÇÃO URUGUAI");
        //Thread.sleep(10000);

        // Modal: Air, PO Importada Pack
        driverWEB.waitObject(poModelAirPack, 20);
        driverWEB.click(poModelAirPack);
        //driverWEB.setTextWithoutClear(inputValorPoModelAir, "Air");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("Air");
        Thread.sleep(1000);
        driverWEB.click(poModelAirText);
        Thread.sleep(3000);

        // External Local: SHANGAI-CHINA, PO Importada Pack
        driverWEB.click(poExternalLocalPack);
        Thread.sleep(2000);
        //driverWEB.setTextWithoutClear(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(3000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(5000);

        // TRade: Outros, PO Importada Pack
        driverWEB.click(poTradePack);
        //driverWEB.setTextWithoutClear(inputValorPoTrade, "Outros");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeLatamPack).sendKeys("Outros");
        Thread.sleep(3000);
        driverWEB.click(poTradeText);
        Thread.sleep(5000);

        // OTB
        driverWEB.click(naoValidarOtbNacional);
        Thread.sleep(3000);

        // Scroll Right
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(4000);

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
        Thread.sleep(2000);
        actionspp.click().build().perform();
        // XPath
        //driverWEB.click(selectCampoPP);
        Thread.sleep(2000);
        driverWEB.waitObject(inputValorpp, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys("2");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys("2");
        Thread.sleep(2000);
        // Clic G Text pg
        driverWEB.click(gText);
        Thread.sleep(4000);


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
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("1");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys("10");
        Thread.sleep(4000);

        // Clic Pack Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(4000);

        //clic clusterW
        driverWEB.waitObject(clusterW, 20);
        driverWEB.click(clusterW);
        Thread.sleep(4000);

        // Approval Reason = ALTERAÇÃO DE COMMENTS
        driverWEB.waitObject(approvalReason, 50);
        driverWEB.click(approvalReason);
        Thread.sleep(3000);
        //((SeleniumRobotsTool) driverWEB).setText(approvalReasonInput,"ALTERAÇÃO DE COMMENTS");
        ((SeleniumRobotsTool) driverWEB).getElement(approvalReasonInput).sendKeys("ALTERAÇÃO DE COMMENTS");
        Thread.sleep(2000);
        driverWEB.click("//*[@item='0']//span");
        Thread.sleep(2000);
        driverWEB.click(approvalReasonText);
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(7000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);

    }

    public void alterarPedidoLatamSkuRmsLatam(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);
        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        driverWEB.click(copyCampoSupplierPOAll);
        driverWEB.waitObject(copySupplierPOInput, 6);
        Thread.sleep(2000);

        // Po Br Sku !!!!!!!!!!!!!!!
        driverWEB.setText(copySupplierPOInput, "3112111");
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        driverWEB.click(copyStattePO);
        Thread.sleep(3000);

        // clicar na PO
        driverWEB.waitObject(clicPoBrPack, 10);
        driverWEB.click(clicPoBrPack);
        Thread.sleep(2000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Importada");
        Thread.sleep(4000);

        // State PO para valiation
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Validation");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_State_enum:']//div[@item='0']");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        //Commercial Week:
        informarCommercialWeekImportado("45");
        Thread.sleep(4000);

        //WarehouseStore
        //Thread.sleep(1000);
        //informarWarehouseStoreImportado("CENTRO DE DISTRIBUIÇÃO URUGUAI");
        //Thread.sleep(8000);

        // Modal: Air, PO Importada Sku
        driverWEB.waitObject(poModelAirPack, 20);
        driverWEB.click(poModelAirPack);
        //driverWEB.setTextWithoutClear(inputValorPoModelAir, "Air");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("Air");
        Thread.sleep(1000);
        driverWEB.click(poModelAirText);
        Thread.sleep(3000);

        // External Local: SHANGAI-CHINA, PO Importada
        driverWEB.click(poExternalLocalPack);
        Thread.sleep(2000);
        //driverWEB.setTextWithoutClear(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(3000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(5000);

        // TRade: Outros, PO Importada Pack
        driverWEB.click(poTradePack);
        //driverWEB.setTextWithoutClear(inputValorPoTrade, "Outros");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeLatamPack).sendKeys("Outros");
        Thread.sleep(3000);
        driverWEB.click(poTradeText);
        Thread.sleep(5000);

        // OTB
        driverWEB.click(naoValidarOtbNacional);
        Thread.sleep(5000);

        // Scroll Right
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(4000);

        driverWEB.click(orderCaseSku);
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("20");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        // Order Qty
        informarPOQty("400");
        Thread.sleep(3000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        //clic clusterW
        driverWEB.click(clusterW);
        Thread.sleep(6000);

        // Approval Reason = ALTERAÇÃO DE COMMENTS
        driverWEB.waitObject(approvalReason, 50);
        driverWEB.click(approvalReason);
        Thread.sleep(3000);
        //((SeleniumRobotsTool) driverWEB).setText(approvalReasonInput,"ALTERAÇÃO DE COMMENTS");
        ((SeleniumRobotsTool) driverWEB).getElement(approvalReasonInput).sendKeys("ALTERAÇÃO DE COMMENTS");
        Thread.sleep(2000);
        driverWEB.click("//*[@item='0']//span");
        Thread.sleep(2000);
        driverWEB.click(approvalReasonText);
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(7000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);

    }

    public void alterarPedidoSplitSku(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Renner");
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
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        driverWEB.click(copyCampoSupplierPOAll);
        driverWEB.waitObject(copySupplierPOInput, 6);
        Thread.sleep(2000);

        // Po Br Pack !!!!!!!!!!!!!!!
        driverWEB.setText(copySupplierPOInput, "PPO_00307391");
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        driverWEB.click(copyStattePO);
        Thread.sleep(3000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Importada");
        Thread.sleep(4000);

        // State PO para valiation
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Validation");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_State_enum:']//div[@item='0']");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        //*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        //Commercial Week:
        informarCommercialWeekImportado("45");
        Thread.sleep(4000);

        //WarehouseStore
        Thread.sleep(1000);
        informarWarehouseStoreImportado("CENTRO DE DISTRIBUIÇÃO URUGUAI");
        Thread.sleep(10000);

        // Modal: Air, PO Importada Pack
        driverWEB.waitObject(poModelAirPack, 20);
        driverWEB.click(poModelAirPack);
        //driverWEB.setTextWithoutClear(inputValorPoModelAir, "Air");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("Air");
        Thread.sleep(1000);
        driverWEB.click(poModelAirText);
        Thread.sleep(3000);

        // External Local: SHANGAI-CHINA, PO Importada Pack
        driverWEB.click(poExternalLocalPack);
        Thread.sleep(2000);
        //driverWEB.setTextWithoutClear(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(3000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(5000);

        // TRade: Outros, PO Importada Pack
        driverWEB.click(poTradePack);
        //driverWEB.setTextWithoutClear(inputValorPoTrade, "Outros");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeLatamPack).sendKeys("Outros");
        Thread.sleep(3000);
        driverWEB.click(poTradeText);
        Thread.sleep(5000);

        // OTB
        driverWEB.click(naoValidarOtbNacional);
        Thread.sleep(3000);

        // Clic Flecha
        //driverWEB.ScrollToObject(clicFlexaItem);
        //driverWEB.click(clicFlexaItem);

        // Scroll Right
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(4000);

        // Clic Flexa
        //driverWEB.ScrollToObject(clicFlexaItem);  Thread.sleep(2000);
        //driverWEB.click(clicFlexaItem);  Thread.sleep(3000);

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
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("1");
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys("10");
        Thread.sleep(2000);

        // Clic Pack Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(2000);

        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);

        // Cluster ARG
        driverWEB.waitObject(clusterARG, 50);
        driverWEB.click(clusterARG);
        driverWEB.setText(clusterARGInput, "G");
        driverWEB.click(clusterARGText);
        Thread.sleep(2000);

        // Cluster URU
        driverWEB.waitObject(clusterURU, 50);
        driverWEB.click(clusterURU);
        driverWEB.setText(clusterURUInput, "G");
        driverWEB.click(clusterURUText);
        Thread.sleep(2000);

        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        //clic clusterSPO
        driverWEB.waitObject(clusterSPO, 50);
        driverWEB.click(clusterSPO);
        driverWEB.setText(clusterSPOInput, "P");
        driverWEB.click(clusterSPOText);
        Thread.sleep(2000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        //clic clusterW
        driverWEB.click(clusterW);
        Thread.sleep(2000);

        // Unit Cost
        driverWEB.waitObject(unitCust, 20);
        driverWEB.click(unitCust);
        //((SeleniumRobotsTool) driverWEB).setText(unitCustInput,"1");
        driverWEB.click(unitCustText);
        Thread.sleep(5000);

        // Approval Reason = ALTERAÇÃO DE COMMENTS
        driverWEB.waitObject(approvalReason, 20);
        driverWEB.click(approvalReason);
        driverWEB.setText(approvalReasonInput, "ALTERAÇÃO DE COMMENTS");
        driverWEB.click(approvalReasonText);
        Thread.sleep(5000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(7000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);

    }


    public void alterarPedidoLatamSkuRmsBr(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        //driverWEB.ScrollToObject(codeText);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        driverWEB.click(copyCampoSupplierPOAll);
        driverWEB.waitObject(copySupplierPOInput, 6);
        Thread.sleep(2000);

        // Po Br SKU !!!!!!!!!!!!!!!
        driverWEB.setText(copySupplierPOInput, "5217705");
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        driverWEB.click(copyStattePO);
        Thread.sleep(3000);

        // clicar na PO
        driverWEB.waitObject(clicPoBrPack, 10);
        driverWEB.click(clicPoBrPack);
        Thread.sleep(2000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Importada");
        Thread.sleep(6000);

        // State PO para valiation
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Validation");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_State_enum:']//div[@item='0']");
        Thread.sleep(2000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        //Commercial Week:
        informarCommercialWeekImportado("40");
        Thread.sleep(4000);

        // Modal: Air, PO Importada Pack
        driverWEB.waitObject(poModelAirPack, 20);
        driverWEB.click(poModelAirPack);
        //driverWEB.setTextWithoutClear(inputValorPoModelAir, "Air");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("Air");
        Thread.sleep(1000);
        driverWEB.click(poModelAirText);
        Thread.sleep(3000);

        // External Local: SHANGAI-CHINA, PO Importada Pack
        driverWEB.click(poExternalLocalPack);
        Thread.sleep(2000);
        //driverWEB.setTextWithoutClear(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(3000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(5000);

        // TRade: Outros, PO Importada Pack
        driverWEB.click(poTradePack);
        //driverWEB.setTextWithoutClear(inputValorPoTrade, "Outros");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeLatamPack).sendKeys("Outros");
        Thread.sleep(3000);
        driverWEB.click(poTradeText);
        Thread.sleep(5000);

        // OTB
        driverWEB.click(naoValidarOtbNacional);
        Thread.sleep(3000);

        // Scroll Right
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(4000);

        driverWEB.click(orderCaseSku);
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
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("20");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        // Order Qty
        informarPOQty("400");
        Thread.sleep(3000);

        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(4000);

        //clic clusterW
        driverWEB.waitObject(clusterW, 20);
        driverWEB.click(clusterW);
        Thread.sleep(4000);

        // Approval Reason = ALTERAÇÃO DE COMMENTS
        driverWEB.waitObject(approvalReason, 50);
        driverWEB.click(approvalReason);
        Thread.sleep(3000);
        //((SeleniumRobotsTool) driverWEB).setText(approvalReasonInput,"ALTERAÇÃO DE COMMENTS");
        ((SeleniumRobotsTool) driverWEB).getElement(approvalReasonInput).sendKeys("ALTERAÇÃO DE COMMENTS");
        Thread.sleep(2000);
        driverWEB.click("//*[@item='0']//span");
        Thread.sleep(2000);
        driverWEB.click(approvalReasonText);
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(7000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);

    }

    public void criarPedidoImportadoPack_RmsBr(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        Thread.sleep(2000);
        viewerRennerPoBrPack("Renner");


        addLog(scenario, "Etapa: Selecionar Code");
        esperarElementoWeb(campoCode);
        esperarElementoClicvel(campoCode);
        driverWEB.click(campoCode);

        esperarElementoWeb(inputCode);
        esperarElementoClicvel(inputCode);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);

        esperarElementoWeb(codeSelecao);
        esperarElementoClicvel(codeSelecao);
        driverWEB.click(codeSelecao);

        esperarElementoWeb(textDescription);
        esperarElementoClicvel(textDescription);
        driverWEB.click(textDescription);


        addLog(scenario, "Etapa: Selecionar Code");
        esperarElementoWeb(clicCampoCode);
        esperarElementoClicvel(clicCampoCode);
        driverWEB.click(clicCampoCode);

        //Abas do style
        Thread.sleep(2000);
        esperarElementoWeb(abaSourcing);
        esperarElementoClicvel(abaSourcing);
        driverWEB.click(abaSourcing);


        esperarElementoWeb(abaPOs);
        esperarElementoClicvel(abaPOs);
        driverWEB.click(abaPOs);

        esperarElementoWeb(abaSupplierPOs);
        esperarElementoClicvel(abaSupplierPOs);
        driverWEB.click(abaSupplierPOs);

        esperarElementoWeb(newSupplierPO);
        esperarElementoClicvel(newSupplierPO);
        driverWEB.click(newSupplierPO);

        // Select Pack
        esperarElementoWeb(selectPack);
        esperarElementoClicvel(selectPack);
        driverWEB.click(selectPack);

        esperarElementoWeb(clicNext);
        esperarElementoClicvel(clicNext);
        driverWEB.click(clicNext);

        // Colorway 1
        esperarElementoWeb(selectColorway1);
        esperarElementoClicvel(selectColorway1);
        driverWEB.click(selectColorway1);

        esperarElementoWeb(finish);
        esperarElementoClicvel(finish);
        driverWEB.click(finish);
        Thread.sleep(10000);


        // Campos properties da PO
        selecionarViewerRennerNacional("Renner PO Importada");

        // Refresh
        Thread.sleep(3000);
        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(6000);

        yearLatamPackImportado();
        Thread.sleep(2000);

        //Commercial Week:
        informarCommercialWeekImportado("54");
        Thread.sleep(3000);

        // Supplier PO PO/Model
        informarPOModelImportado("RMS BR");
        Thread.sleep(3000);

        //PO TYPE
        esperarElementoWeb(POTypePack);
        esperarElementoClicvel(POTypePack);
        driverWEB.click(POTypePack);
        esperarElementoWeb(inputValorPOTypeLatamPack);
        esperarElementoClicvel(inputValorPOTypeLatamPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeLatamPack).sendKeys("Importado");

        //Clica no text para fechar o input
        esperarElementoWeb(locationTypeText);
        esperarElementoClicvel(locationTypeText);
        driverWEB.doubleClick(locationTypeText);


        //Location Type STORE OR WAREHOUSE
        esperarElementoWeb(locationType);
        esperarElementoClicvel(locationType);
        driverWEB.click(locationType);
        esperarElementoWeb(inputLocationType);
        esperarElementoClicvel(inputLocationType);
        ((SeleniumRobotsTool) driverWEB).getElement(inputLocationType).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputLocationType).sendKeys("Warehouse");

        //Clica no text para fechar o input
        esperarElementoWeb(locationTypeText);
        esperarElementoClicvel(locationTypeText);
        driverWEB.click(locationTypeText);

        //Warehouse
        Thread.sleep(4000);
        realizarValidacoesParaWarehouse();

        // Modal: Air, PO Importada
        Thread.sleep(2000);
        esperarElementoWeb(poModelAir);
        esperarElementoClicvel(poModelAir);
        driverWEB.click(poModelAir);
        esperarElementoWeb(inputValorPoModelAirSku);
        esperarElementoClicvel(inputValorPoModelAirSku);
        //Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirSku).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirSku).sendKeys("Air");
        //Thread.sleep(1000);

        esperarElementoWeb(poModelAirText);
        esperarElementoClicvel(poModelAirText);
        driverWEB.click(poModelAirText);
        //Thread.sleep(3000);


        // External Local: SHANGAI-CHINA, PO Importada
        esperarElementoWeb(poExternalLocal);
        esperarElementoClicvel(poExternalLocal);
        driverWEB.click(poExternalLocal);
        esperarElementoWeb(inputValorPoExternalLocal);
        esperarElementoClicvel(inputValorPoExternalLocal);
        driverWEB.clearField(inputValorPoExternalLocal);
        driverWEB.setText(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        //Thread.sleep(1000);

        esperarElementoWeb(poExternalLocalText);
        esperarElementoClicvel(poExternalLocalText);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(2000);

        // TRade: Outros, PO Importada
        esperarElementoWeb(poTrade);
        esperarElementoClicvel(poTrade);
        driverWEB.click(poTrade);
        esperarElementoWeb(inputValorPoTrade);
        esperarElementoClicvel(inputValorPoTrade);
        driverWEB.clearField(inputValorPoTrade);
        driverWEB.setText(inputValorPoTrade, "Outros");

        esperarElementoWeb(poTradeText);
        esperarElementoClicvel(poTradeText);
        driverWEB.click(poTradeText);
        //Thread.sleep(3000);


        //Factory
        esperarElementoWeb(poFactory);
        esperarElementoClicvel(poFactory);
        driverWEB.click(poFactory);
        esperarElementoWeb(inputValorFactory);
        esperarElementoClicvel(inputValorFactory);
        driverWEB.clearField(inputValorFactory);
        driverWEB.setText(inputValorFactory, "475-200-0386 - ASR Sweaters Ltd");
        //Thread.sleep(1000);

        esperarElementoWeb(poFactoryText);
        esperarElementoClicvel(poFactoryText);
        driverWEB.click(poFactoryText);
        Thread.sleep(3000);

        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(8000);

        // Não validar OTB
        esperarElementoWeb(naoValidarOtb);
        esperarElementoClicvel(naoValidarOtb);
        driverWEB.click(naoValidarOtb);
        Thread.sleep(1000);


        // Botao Refresh
        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(7000);


        // Scroll Right
        for (int i = 0; i < 10; i++) {
            esperarElementoWeb(botaoScrollRight);
            esperarElementoClicvel(botaoScrollRight);
            driverWEB.click(botaoScrollRight);
        }


        //Campos bloco Orders

        //Campo PP
        Thread.sleep(6000);
        esperarElementoWeb(clicPP);
        esperarElementoClicvel(clicPP);
        driverWEB.click(clicPP);

        esperarElementoWeb(inputValorpp);
        esperarElementoClicvel(inputValorpp);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys("400");

        esperarElementoWeb(ppText);
        esperarElementoClicvel(ppText);
        driverWEB.click(ppText);
        //Thread.sleep(1000);



        //Campo P

        Thread.sleep(2000);
        esperarElementoWeb(clicP);
        esperarElementoClicvel(clicP);
        driverWEB.click(clicP);

        esperarElementoWeb(inputValorp);
        esperarElementoClicvel(inputValorp);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys("400");

        esperarElementoWeb(pText);
        esperarElementoClicvel(pText);
        driverWEB.click(pText);
        //Thread.sleep(1000);


        //Campo M
        Thread.sleep(2000);
        esperarElementoWeb(clicM);
        esperarElementoClicvel(clicM);
        driverWEB.click(clicM);

        esperarElementoWeb(inputValorm);
        esperarElementoClicvel(inputValorm);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys("400");

        esperarElementoWeb(mText);
        esperarElementoClicvel(mText);
        driverWEB.click(mText);
        //Thread.sleep(1000);


        //Campo G
        Thread.sleep(2000);
        esperarElementoWeb(clicG);
        esperarElementoClicvel(clicG);
        driverWEB.click(clicG);

        esperarElementoWeb(inputValorg);
        esperarElementoClicvel(inputValorg);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys("400");

        esperarElementoWeb(gText);
        esperarElementoClicvel(gText);
        driverWEB.click(gText);



        //Campo GG
        Thread.sleep(2000);
        esperarElementoWeb(clicGG);
        esperarElementoClicvel(clicGG);
        driverWEB.click(clicGG);

        esperarElementoWeb(inputValorgg);
        esperarElementoClicvel(inputValorgg);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorgg).sendKeys("400");

        esperarElementoWeb(ggText);
        esperarElementoClicvel(ggText);
        driverWEB.click(ggText);



        // Order Case
        Thread.sleep(2000);
        esperarElementoWeb(orderCase);
        esperarElementoClicvel(orderCase);
        driverWEB.click(orderCase);

        esperarElementoWeb(inputOrderCase);
        esperarElementoClicvel(inputOrderCase);
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("2");

        esperarElementoWeb(orderCaseText);
        esperarElementoClicvel(orderCaseText);
        driverWEB.click(orderCaseText);



        //Pack QTY
        Thread.sleep(2000);
        esperarElementoWeb(packQty);
        esperarElementoClicvel(packQty);
        driverWEB.click(packQty);

        esperarElementoWeb(inputValorPackQty);
        esperarElementoClicvel(inputValorPackQty);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys("4");

        esperarElementoWeb(packQtyText);
        esperarElementoClicvel(packQtyText);
        driverWEB.click(packQtyText);





        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");

        // Scroll Right
        for (int i = 0; i < 11; i++) {
            esperarElementoWeb(botaoScrollRight);
            esperarElementoClicvel(botaoScrollRight);
            driverWEB.click(botaoScrollRight);
        }

        esperarElementoWeb(selecionarLinhaPo);
        esperarElementoClicvel(selecionarLinhaPo);
        driverWEB.click(selecionarLinhaPo);


        Thread.sleep(2000);
        esperarElementoWeb(clusterGuideShopText);
        esperarElementoClicvel(clusterGuideShopText);
        driverWEB.click(clusterGuideShopText);

        esperarElementoWeb(clusterGuideShop);
        esperarElementoClicvel(clusterGuideShop);
        driverWEB.click(clusterGuideShop);
        Thread.sleep(4000);

        for (int i = 0; i < 30; i++) {
            esperarElementoWeb(botaoScrollRight);
            esperarElementoClicvel(botaoScrollRight);
            driverWEB.click(botaoScrollRight);
        }

        esperarElementoWeb(clusterW);
        esperarElementoClicvel(clusterW);
        driverWEB.click(clusterW);
        Thread.sleep(4000);

        esperarElementoWeb(locationList);
        esperarElementoClicvel(locationList);
        driverWEB.click(locationList);

        esperarElementoWeb(locationListInput);
        esperarElementoClicvel(locationListInput);
        ((SeleniumRobotsTool) driverWEB).setText(locationListInput, "239097");

        esperarElementoWeb(locationListText);
        esperarElementoClicvel(locationListText);
        driverWEB.click(locationListText);
        Thread.sleep(2000);


        //distributionRoles = #Buffer
        esperarElementoWeb(distributionRoles);
        esperarElementoClicvel(distributionRoles);
        driverWEB.click(distributionRoles);

        esperarElementoWeb(distributionRolesInput);
        esperarElementoClicvel(distributionRolesInput);
        ((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput, "#Buffer"); //input

        esperarElementoWeb(distribuitionRolesSelecaoBuffer);
        esperarElementoClicvel(distribuitionRolesSelecaoBuffer);
        driverWEB.click(distribuitionRolesSelecaoBuffer);


        esperarElementoWeb(distributionRolesText);
        esperarElementoClicvel(distributionRolesText);
        driverWEB.click(distributionRolesText);



        //distributionRoles = #PC
        esperarElementoWeb(distributionRoles);
        esperarElementoClicvel(distributionRoles);
        driverWEB.click(distributionRoles);

        esperarElementoWeb(distributionRolesInput);
        esperarElementoClicvel(distributionRolesInput);
        ((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput, "#PC");

        esperarElementoWeb(distribuitionRolesSelecaoPC);
        esperarElementoClicvel(distribuitionRolesSelecaoPC);
        driverWEB.click(distribuitionRolesSelecaoPC);

        esperarElementoWeb(distributionRolesText);
        esperarElementoClicvel(distributionRolesText);
        driverWEB.click(distributionRolesText);
        Thread.sleep(2000);





        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        Thread.sleep(5000);

        // Submitted
        esperarElementoWeb(statePo);
        esperarElementoClicvel(statePo);
        driverWEB.click(statePo);


        esperarElementoWeb(inputStatePo);
        esperarElementoClicvel(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");


        esperarElementoWeb(statePOtext);
        esperarElementoClicvel(statePOtext);
        driverWEB.click(statePOtext);
        Thread.sleep(4000);

        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(8000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();
        Thread.sleep(2000);









    }

    public void criarPedidoImportadoPack_RmsLatam(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        Thread.sleep(2000);
        viewerRennerPoBrPack("Renner");
        //Thread.sleep(4000);


        addLog(scenario, "Etapa: Selecionar Code");
        esperarElementoWeb(campoCode);
        esperarElementoClicvel(campoCode);
        driverWEB.click(campoCode);

        esperarElementoWeb(inputCode);
        esperarElementoClicvel(inputCode);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);

        esperarElementoWeb(codeSelecao);
        esperarElementoClicvel(codeSelecao);
        driverWEB.click(codeSelecao);


        // Clic Text Description
        esperarElementoWeb(textDescription);
        esperarElementoClicvel(textDescription);
        driverWEB.click(textDescription);
        //Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Code");
        esperarElementoWeb(clicCampoCode);
        esperarElementoClicvel(clicCampoCode);
        driverWEB.click(clicCampoCode);



        //Abas do Style
        Thread.sleep(2000);
        esperarElementoWeb(abaSourcing);
        esperarElementoClicvel(abaSourcing);
        driverWEB.click(abaSourcing);
        //Thread.sleep(2000);


        esperarElementoWeb(abaPOs);
        esperarElementoClicvel(abaPOs);
        driverWEB.click(abaPOs);
        //Thread.sleep(2000);


        esperarElementoWeb(abaSupplierPOs);
        esperarElementoClicvel(abaSupplierPOs);
        driverWEB.click(abaSupplierPOs);


        esperarElementoWeb(newSupplierPO);
        esperarElementoClicvel(newSupplierPO);
        driverWEB.click(newSupplierPO);

        // Seleciona a PO como PACK
        esperarElementoWeb(selectPack);
        esperarElementoClicvel(selectPack);
        //driverWEB.waitObject(selectPack, 5);
        driverWEB.click(selectPack);
        //Thread.sleep(2000);


        esperarElementoWeb(clicNext);
        esperarElementoClicvel(clicNext);
        driverWEB.click(clicNext);
        //Thread.sleep(3000);

        // Colorway 1
        esperarElementoWeb(selectColorway1);
        esperarElementoClicvel(selectColorway1);
        driverWEB.click(selectColorway1);



        esperarElementoWeb(finish);
        esperarElementoClicvel(finish);
        driverWEB.click(finish);
        Thread.sleep(10000);


        // Campos properties da PO
        selecionarViewerRennerNacional("Renner PO Importada");


        Thread.sleep(3000);
        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(6000);


        //Year
        yearLatamPackImportado();
        Thread.sleep(2000);

        //Commercial Week:
        informarCommercialWeekImportado("52");
        Thread.sleep(2000);

        // Supplier PO PO/Model
        informarPOModelImportado("RMS LATAM");


        //PO TYPE
        esperarElementoWeb(POTypePack);
        esperarElementoClicvel(POTypePack);
        driverWEB.click(POTypePack);
        esperarElementoWeb(inputValorPOTypeLatamPack);
        esperarElementoClicvel(inputValorPOTypeLatamPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPOTypeLatamPack).sendKeys("Importado");


        //Clica no text para fechar o input
        esperarElementoWeb(locationTypeText);
        esperarElementoClicvel(locationTypeText);
        driverWEB.doubleClick(locationTypeText);


        //Location Type STORE OR WAREHOUSE
        esperarElementoWeb(locationType);
        esperarElementoClicvel(locationType);
        driverWEB.click(locationType);
        esperarElementoWeb(inputLocationType);
        esperarElementoClicvel(inputLocationType);
        ((SeleniumRobotsTool) driverWEB).getElement(inputLocationType).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputLocationType).sendKeys("Store");


        //Clica no text para fechar o input
        esperarElementoWeb(locationTypeText);
        esperarElementoClicvel(locationTypeText);
        driverWEB.doubleClick(locationTypeText);


        //WarehouseStore
        Thread.sleep(2000);
        esperarElementoWeb(warehouseStorePack);
        esperarElementoClicvel(warehouseStorePack);
        driverWEB.click(warehouseStorePack);
        esperarElementoWeb(inputValorWarehouseStoreImportadoPack);
        esperarElementoClicvel(inputValorWarehouseStoreImportadoPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportadoPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStoreImportadoPack).sendKeys("LJ Santa Fe");


        //Clica no text para fechar o input
        esperarElementoWeb(warehouseStoreText);
        esperarElementoClicvel(warehouseStoreText);
        driverWEB.doubleClick(warehouseStoreText);


        // Modal
        Thread.sleep(2000);
        esperarElementoWeb(poModelAirPack);
        esperarElementoClicvel(poModelAirPack);
        driverWEB.click(poModelAirPack);
        esperarElementoWeb(inputValorPoModelAirLatamPack);
        esperarElementoClicvel(inputValorPoModelAirLatamPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("Air");


        //Clica no text para fechar o input
        esperarElementoWeb(poModelAirText);
        esperarElementoClicvel(poModelAirText);
        driverWEB.click(poModelAirText);



        // External Local
        Thread.sleep(2000);
        esperarElementoWeb(poExternalLocalPack);
        esperarElementoClicvel(poExternalLocalPack);
        driverWEB.click(poExternalLocalPack);
        esperarElementoWeb(inputValorPoExternalLocalLatamPack);
        esperarElementoClicvel(inputValorPoExternalLocalLatamPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("SHANGHAI - CHINA");


        //Clica no text para fechar o input
        esperarElementoWeb(poExternalLocalText);
        esperarElementoClicvel(poExternalLocalText);
        driverWEB.click(poExternalLocalText);


        // TRade
        esperarElementoWeb(poTradePack);
        esperarElementoClicvel(poTradePack);
        driverWEB.click(poTradePack);
        esperarElementoWeb(inputValorPoTradeLatamPack);
        esperarElementoClicvel(inputValorPoTradeLatamPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradeLatamPack).sendKeys("Outros");


        //Clica no text para fechar o input
        esperarElementoWeb(poTradeText);
        esperarElementoClicvel(poTradeText);
        driverWEB.click(poTradeText);


        //Factory
        Thread.sleep(2000);
        esperarElementoWeb(poFactory);
        esperarElementoClicvel(poFactory);
        driverWEB.click(poFactory);
        esperarElementoWeb(inputValorFactoryLatamPack);
        esperarElementoClicvel(inputValorFactoryLatamPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactoryLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactoryLatamPack).sendKeys("475-200-0386 - ASR Sweaters Ltd");


        //Clica no text para fechar o input
        esperarElementoWeb(poFactoryText);
        esperarElementoClicvel(poFactoryText);
        driverWEB.click(poFactoryText);
        //Thread.sleep(3000);


        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(8000);


        // Não validar OTB
        esperarElementoWeb(naoValidarOtb);
        esperarElementoClicvel(naoValidarOtb);
        driverWEB.click(naoValidarOtb);
        //Thread.sleep(1000);


        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(7000);


        // Scroll Right
        for (int i = 0; i < 10; i++) {
            esperarElementoWeb(botaoScrollRight);
            esperarElementoClicvel(botaoScrollRight);
            driverWEB.click(botaoScrollRight);
        }

        //Campos bloco Orders


        //Campo PP
        Thread.sleep(6000);
        esperarElementoWeb(clicPP);
        esperarElementoClicvel(clicPP);
        driverWEB.click(clicPP);

        esperarElementoWeb(inputValorpp);
        esperarElementoClicvel(inputValorpp);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys("400");

        esperarElementoWeb(ppText);
        esperarElementoClicvel(ppText);
        driverWEB.click(ppText);
        //Thread.sleep(1000);



        //Campo P

        Thread.sleep(2000);
        esperarElementoWeb(clicP);
        esperarElementoClicvel(clicP);
        driverWEB.click(clicP);

        esperarElementoWeb(inputValorp);
        esperarElementoClicvel(inputValorp);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys("400");

        esperarElementoWeb(pText);
        esperarElementoClicvel(pText);
        driverWEB.click(pText);
        //Thread.sleep(1000);


        //Campo M
        Thread.sleep(2000);
        esperarElementoWeb(clicM);
        esperarElementoClicvel(clicM);
        driverWEB.click(clicM);

        esperarElementoWeb(inputValorm);
        esperarElementoClicvel(inputValorm);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys("400");

        esperarElementoWeb(mText);
        esperarElementoClicvel(mText);
        driverWEB.click(mText);
        //Thread.sleep(1000);


        //Campo G
        Thread.sleep(2000);
        esperarElementoWeb(clicG);
        esperarElementoClicvel(clicG);
        driverWEB.click(clicG);

        esperarElementoWeb(inputValorg);
        esperarElementoClicvel(inputValorg);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys("400");

        esperarElementoWeb(gText);
        esperarElementoClicvel(gText);
        driverWEB.click(gText);



        //Campo GG
        Thread.sleep(2000);
        esperarElementoWeb(clicGG);
        esperarElementoClicvel(clicGG);
        driverWEB.click(clicGG);

        esperarElementoWeb(inputValorgg);
        esperarElementoClicvel(inputValorgg);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorgg).sendKeys("400");

        esperarElementoWeb(ggText);
        esperarElementoClicvel(ggText);
        driverWEB.click(ggText);



        // Order Case
        Thread.sleep(2000);
        esperarElementoWeb(orderCase);
        esperarElementoClicvel(orderCase);
        driverWEB.click(orderCase);

        esperarElementoWeb(inputOrderCase);
        esperarElementoClicvel(inputOrderCase);
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("2");

        esperarElementoWeb(orderCaseText);
        esperarElementoClicvel(orderCaseText);
        driverWEB.click(orderCaseText);



        //Pack QTY
        Thread.sleep(2000);
        esperarElementoWeb(packQty);
        esperarElementoClicvel(packQty);
        driverWEB.click(packQty);

        esperarElementoWeb(inputValorPackQty);
        esperarElementoClicvel(inputValorPackQty);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys("4");

        esperarElementoWeb(packQtyText);
        esperarElementoClicvel(packQtyText);
        driverWEB.click(packQtyText);





        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");

        // Scroll Right
        for (int i = 0; i < 11; i++) {
            esperarElementoWeb(botaoScrollRight);
            esperarElementoClicvel(botaoScrollRight);
            driverWEB.click(botaoScrollRight);
        }

        esperarElementoWeb(selecionarLinhaPo);
        esperarElementoClicvel(selecionarLinhaPo);
        driverWEB.click(selecionarLinhaPo);


        Thread.sleep(2000);
        esperarElementoWeb(clusterGuideShopText);
        esperarElementoClicvel(clusterGuideShopText);
        driverWEB.click(clusterGuideShopText);

        esperarElementoWeb(clusterGuideShop);
        esperarElementoClicvel(clusterGuideShop);
        driverWEB.click(clusterGuideShop);
        Thread.sleep(4000);

        for (int i = 0; i < 30; i++) {
            esperarElementoWeb(botaoScrollRight);
            esperarElementoClicvel(botaoScrollRight);
            driverWEB.click(botaoScrollRight);
        }

        esperarElementoWeb(clusterW);
        esperarElementoClicvel(clusterW);
        driverWEB.click(clusterW);
        Thread.sleep(4000);

        esperarElementoWeb(locationList);
        esperarElementoClicvel(locationList);
        driverWEB.click(locationList);

        esperarElementoWeb(locationListInput);
        esperarElementoClicvel(locationListInput);
        ((SeleniumRobotsTool) driverWEB).setText(locationListInput, "239097");

        esperarElementoWeb(locationListText);
        esperarElementoClicvel(locationListText);
        driverWEB.click(locationListText);
        Thread.sleep(2000);


        //distributionRoles = #Buffer
        esperarElementoWeb(distributionRoles);
        esperarElementoClicvel(distributionRoles);
        driverWEB.click(distributionRoles);

        esperarElementoWeb(distributionRolesInput);
        esperarElementoClicvel(distributionRolesInput);
        ((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput, "#Buffer"); //input

        esperarElementoWeb(distribuitionRolesSelecaoBuffer);
        esperarElementoClicvel(distribuitionRolesSelecaoBuffer);
        driverWEB.click(distribuitionRolesSelecaoBuffer);


        esperarElementoWeb(distributionRolesText);
        esperarElementoClicvel(distributionRolesText);
        driverWEB.click(distributionRolesText);



        //distributionRoles = #PC
        esperarElementoWeb(distributionRoles);
        esperarElementoClicvel(distributionRoles);
        driverWEB.click(distributionRoles);

        esperarElementoWeb(distributionRolesInput);
        esperarElementoClicvel(distributionRolesInput);
        ((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput, "#PC");

        esperarElementoWeb(distribuitionRolesSelecaoPC);
        esperarElementoClicvel(distribuitionRolesSelecaoPC);
        driverWEB.click(distribuitionRolesSelecaoPC);

        esperarElementoWeb(distributionRolesText);
        esperarElementoClicvel(distributionRolesText);
        driverWEB.click(distributionRolesText);
        Thread.sleep(2000);





        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        Thread.sleep(5000);

        // Submitted
        esperarElementoWeb(statePo);
        esperarElementoClicvel(statePo);
        driverWEB.click(statePo);


        esperarElementoWeb(inputStatePo);
        esperarElementoClicvel(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");


        esperarElementoWeb(statePOtext);
        esperarElementoClicvel(statePOtext);
        driverWEB.click(statePOtext);
        Thread.sleep(4000);

        esperarElementoWeb(botaoRefreshviewPO);
        esperarElementoClicvel(botaoRefreshviewPO);
        driverWEB.click(botaoRefreshviewPO);
        Thread.sleep(8000);

        // Validar PO e Aprovar PO
        validarAprovacaoDoPedido();
        Thread.sleep(2000);
    }


    public void alterarrPedidooSplitPack(String itemPaiCode) throws Exception {

        // PO RMS BR
        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
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
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(4000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        driverWEB.click(copyCampoSupplierPOAll);
        driverWEB.waitObject(copySupplierPOInput, 6);
        Thread.sleep(4000);

        // Po Br Pack !!!!!!!!!!!!!!!
        driverWEB.setText(copySupplierPOInput, "PPO_00307483");
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        driverWEB.click(copyStattePO);
        Thread.sleep(3000);

        // clicar na PO
        driverWEB.waitObject(clicPoBrPack, 10);
        driverWEB.click(clicPoBrPack);
        Thread.sleep(2000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Importada");
        Thread.sleep(4000);

        // State PO para valiation
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Validation");
        Thread.sleep(3000);
        driverWEB.click("//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_State_enum:']//div[@item='0']");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        //Commercial Week:
        Thread.sleep(1000);
        informarCommercialWeekImportado("45");
        Thread.sleep(2000);

        // Modal: Air, PO Importada Pack
        driverWEB.waitObject(poModelAirPack, 20);
        driverWEB.click(poModelAirPack);
        //driverWEB.setTextWithoutClear(inputValorPoModelAir, "Air");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("Air");
        Thread.sleep(1000);
        driverWEB.click(poModelAirText);
        Thread.sleep(3000);

        // External Local: SHANGAI-CHINA, PO Importada Pack
        driverWEB.click(poExternalLocalPack);
        Thread.sleep(1000);
        //driverWEB.setTextWithoutClear(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(1000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(2000);

        // Parceiro (FFDD) : 394777319395 - 5F Apparels Ltd, PO Importada
        //driverWEB.click(poParceiroPack);
        //((SeleniumRobotsTool) driverWEB).setText(inputValorParceiro, "");
        //Thread.sleep(1000);
        //driverWEB.click(poParceiroText);
        //Thread.sleep(4000);

        // FFDD Date
        // Regra de Negocio, pega o dia atual
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date datenow = new Date();
        String daynow = dateFormat.format(datenow);

        driverWEB.click(ffddDate);
        driverWEB.setText(inputValorFFDDDate, daynow);
        Thread.sleep(2000);
        driverWEB.click(ffddDateText);
        Thread.sleep(4000);

        // Botao Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Não validar OTB
        Thread.sleep(2000);
        driverWEB.click(naoValidarOtb);
        Thread.sleep(300);

        // Refresh
        Thread.sleep(1000);
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Clic Flecha
        //driverWEB.ScrollToObject(clicFlexaItem);
        //driverWEB.click(clicFlexaItem);
        //Thread.sleep(3000);

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
        //driverWEB.setTextWithoutClear(inputValorpp, "400");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys("4");
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
        //driverWEB.setTextWithoutClear(inputValorp, "400");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys("4");
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
        //driverWEB.setTextWithoutClear(inputValorm, "400");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys("4");
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
        //driverWEB.setTextWithoutClear(inputValorg, "400");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys("4");
        Thread.sleep(1000);
        // Clic G Text pg
        driverWEB.click(gText);
        Thread.sleep(1000);

        // Clic GG Text pg
        //Thread.sleep(1000);
        // Clic mouse GG text/input
        //WebDriver driverGG = ((WebDriver)(driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        //WebElement clicGG = driverGG.findElement(By.xpath("//*[@data-csi-heading-vi='4']"));
        // Instantiating Actions Class
        //Actions actionsGG = new Actions(driverGG);
        // Hovering on clicGGtext
        //actionsGG.moveToElement(clicGG);
        // build() - used to complie all the actions
        //actionsGG.click().build().perform();
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(1000);
        //actionsGG.click().build().perform();
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(1000);
        //actionsGG.click().build().perform();
        //driverWEB.click(selectCampoGG);
        //Thread.sleep(1000);
        // XPath
        //driverWEB.waitObject(inputValorgg, 10);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorgg, "400");
        //((SeleniumRobotsTool)driverWEB).getElement(inputValorgg).sendKeys("400");
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(1000);

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
        //driverWEB.setTextWithoutClear(inputOrderCase, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("2");
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
        //driverWEB.setTextWithoutClear(inputValorPackQty, "4");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys("4");
        Thread.sleep(3000);

        // Clic Pack Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(5000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        //clic clusterGuideShop
        driverWEB.click(clusterGuideShopText);
        Thread.sleep(2000);
        driverWEB.waitObject(clusterGuideShop, 30);
        driverWEB.click(clusterSelecionarLinhaText);
        driverWEB.click(clusterGuideShop);
        Thread.sleep(7000);

        // Clic Flecha
        //driverWEB.ScrollToObject(clicFlexaItem);
        //driverWEB.click(clicFlexaItem);
        //Thread.sleep(2000);

        //clic clusterAER
        driverWEB.click(clusterGuideShopText);
        Thread.sleep(2000);
        driverWEB.waitObject(clusterAER, 30);
        driverWEB.click(clusterSelecionarLinhaText);
        driverWEB.click(clusterAER);
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

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        //clic clusterW
        driverWEB.click(clusterW);
        Thread.sleep(2000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        //distributionRoles = #Buffer
        driverWEB.waitObject(distributionRoles, 50);
        driverWEB.click(distributionRoles);
        Thread.sleep(4000);
        driverWEB.setText(distributionRolesInput, "#Buffer");
        Thread.sleep(3000);
        driverWEB.click("//input[@value='RNR_DistributionRules:#Buffer']");
        driverWEB.click(distributionRolesText);
        Thread.sleep(2000);

        // Approval Reason = ALTERAÇÃO DE COMMENTS
        driverWEB.waitObject(approvalReason, 50);
        driverWEB.click(approvalReason);
        driverWEB.setText(approvalReasonInput, "ALTERAÇÃO DE COMMENTS");
        driverWEB.click(approvalReasonText);
        Thread.sleep(2000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(5000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // PO RMS LATAM
        // Clicar no Link da outra PO e Alterar
        driverWEB.click(poVinculada);
        Thread.sleep(2000);

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        driverWEB.switchTab();
        String pageAtual = driver.getCurrentUrl();

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Importada");
        Thread.sleep(4000);

        // State PO para valiation
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Validation");
        Thread.sleep(3000);
        driverWEB.click("//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_State_enum:']//div[@item='0']");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        //Commercial Week:
        Thread.sleep(1000);
        informarCommercialWeekImportado("40");
        Thread.sleep(2000);

        // Modal: Air, PO Importada Pack
        driverWEB.waitObject(poModelAirPack, 20);
        driverWEB.click(poModelAirPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("Air");
        Thread.sleep(1000);
        driverWEB.click(poModelAirText);
        Thread.sleep(3000);

        // External Local: SHANGAI-CHINA, PO Importada Pack
        driverWEB.click(poExternalLocalPack);
        Thread.sleep(1000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(1000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(2000);

        // Parceiro (FFDD) : 394777319395 - 5F Apparels Ltd, PO Importada
        //driverWEB.click(poParceiroPack);
        //((SeleniumRobotsTool) driverWEB).setText(inputValorParceiro, "475-200-0386 - ASR Sweaters Ltd");
        //Thread.sleep(1000);
        //driverWEB.click(poParceiroText);
        //Thread.sleep(4000);

        // FFDD Date
        DateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
        Date datenoww = new Date();
        String daynoww = dateFormatt.format(datenoww);

        driverWEB.click(ffddDate);
        driverWEB.setText(inputValorFFDDDate, daynoww);
        Thread.sleep(2000);
        driverWEB.click(ffddDateText);
        Thread.sleep(4000);


        // Botao Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Não validar OTB
        Thread.sleep(1000);
        driverWEB.click(naoValidarOtb);
        Thread.sleep(1000);

        // Refresh
        Thread.sleep(1000);
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Clic Flecha
        //driverWEB.ScrollToObject(clicFlexaItem);
        //driverWEB.click(clicFlexaItem);
        //Thread.sleep(2000);

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

        // Clic PP Text pg
        Thread.sleep(2000);
        // Clic mouse PP text/input
        WebDriver driverPPP = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicPPP = driverPPP.findElement(By.xpath("//*[@data-csi-heading-vi='0']"));
        // Instantiating ActionsPP Class
        Actions actionsppp = new Actions(driverPP);
        // Hovering on clicPPtext
        actionsppp.moveToElement(clicPPP);
        // build() - used to complie all the actions
        actionsppp.click().build().perform();
        Thread.sleep(1000);
        // Clic PP Text pg
        driverWEB.click(ppText);
        Thread.sleep(2000);
        actionsppp.click().build().perform();
        Thread.sleep(1000);
        // Clic PP Text pg
        driverWEB.click(ppText);
        Thread.sleep(1000);
        actionsppp.click().build().perform();
        // XPath
        //driverWEB.click(selectCampoPP);
        Thread.sleep(1000);
        driverWEB.waitObject(inputValorpp, 10);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorpp, "400");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys("4");
        Thread.sleep(1000);
        // Clic PP Text pg
        driverWEB.click(ppText);
        Thread.sleep(1000);

        // Clic P Text pg
        Thread.sleep(1000);
        // Clic mouse P text/input
        WebDriver driverpp = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicPP_ = driverpp.findElement(By.xpath("//*[@data-csi-heading-vi='1']"));
        // Instantiating ActionsP Class
        Actions actionspp_ = new Actions(driverpp);
        // Hovering on clic P
        actionspp_.moveToElement(clicPP_);
        // build() - used to complie all the actions
        actionspp_.click().build().perform();
        Thread.sleep(1000);
        // Clic P Text pg
        driverWEB.click(pText);
        Thread.sleep(1000);
        actionspp_.click().build().perform();
        Thread.sleep(1000);
        // Clic P Text pg
        driverWEB.click(pText);
        Thread.sleep(1000);
        actionspp_.click().build().perform();
        //driverWEB.click(selectCampoP);
        Thread.sleep(1000);
        // XPath
        driverWEB.waitObject(inputValorp, 10);
        // Insert valor no campo P
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys("4");
        Thread.sleep(2000);
        // Clic P Text pg
        driverWEB.click(pText);
        Thread.sleep(1000);

        // Clic M Text pg
        Thread.sleep(1000);
        // Clic mouse M text/input
        WebDriver driverMM = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicMM = driverMM.findElement(By.xpath("//*[@data-csi-heading-vi='2']"));
        // Instantiating ActionsM Class
        Actions actionsMM = new Actions(driverMM);
        // Hovering on clic M text
        actionsMM.moveToElement(clicMM);
        // build() - used to complie all the actions
        actionsMM.click().build().perform();
        Thread.sleep(1000);
        // Clic M Text pg
        driverWEB.click(mText);
        Thread.sleep(1000);
        actionsMM.click().build().perform();
        Thread.sleep(1000);
        // Clic M Text pg
        driverWEB.click(mText);
        Thread.sleep(2000);
        actionsMM.click().build().perform();
        // Clic M
        //driverWEB.click(selectCampoM);
        Thread.sleep(1000);
        // XPath
        driverWEB.waitObject(inputValorm, 10);
        // Insert valor no campo M
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys("4");
        Thread.sleep(2000);
        // Clic M Text pg
        driverWEB.click(mText);
        Thread.sleep(1000);

        // Clic G Text pg
        Thread.sleep(1000);
        // Clic mouse G text/input
        WebDriver driverGG = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicGG = driverG.findElement(By.xpath("//*[@data-csi-heading-vi='3']"));
        // Instantiating Actions Class
        Actions actionsGG = new Actions(driverGG);
        // Hovering on clicGtext
        actionsGG.moveToElement(clicGG);
        // build() - used to complie all the actions
        actionsGG.click().build().perform();
        Thread.sleep(1000);

        // Clic G Text pg
        driverWEB.click(gText);
        Thread.sleep(1000);
        actionsGG.click().build().perform();
        Thread.sleep(1000);
        // Clic G Text pg
        driverWEB.click(gText);
        Thread.sleep(1000);
        actionsGG.click().build().perform();
        //driverWEB.click(selectCampoG);
        Thread.sleep(1000);
        // XPath
        driverWEB.waitObject(inputValorg, 10);
        // Insert valor no campo G
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys("4");
        Thread.sleep(1000);
        // Clic G Text pg
        driverWEB.click(gText);
        Thread.sleep(1000);

        // Clic GG Text pg
        //Thread.sleep(1000);
        // Clic mouse GG text/input
        //WebDriver driverGG = ((WebDriver)(driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        //WebElement clicGG = driverGG.findElement(By.xpath("//*[@data-csi-heading-vi='4']"));
        // Instantiating Actions Class
        //Actions actionsGG = new Actions(driverGG);
        // Hovering on clicGGtext
        //actionsGG.moveToElement(clicGG);
        // build() - used to complie all the actions
        //actionsGG.click().build().perform();
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(1000);
        //actionsGG.click().build().perform();
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(1000);
        //actionsGG.click().build().perform();
        //driverWEB.click(selectCampoGG);
        //Thread.sleep(1000);
        // XPath
        //driverWEB.waitObject(inputValorgg, 10);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorgg, "400");
        //((SeleniumRobotsTool)driverWEB).getElement(inputValorgg).sendKeys("400");
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(1000);

        // Order Case

        driverWEB.click(orderCase);
        Thread.sleep(3000);
        // Clic mouse OrderQty text/input
        WebDriver driverOrderCasee = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicOrderCasee = driverOrderCasee.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]"));
        // Instantiating Actions Class
        Actions actionsscc = new Actions(driverOrderCasee);
        // Hovering on clicOrderQtytext
        actionsscc.moveToElement(clicOrderCasee);
        // build() - used to complie all the actions
        actionsscc.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);
        actionsscc.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);
        actionsscc.click().build().perform();

        // XPath
        driverWEB.waitObject(inputOrderCase, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("2");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        // Pack Qty
        driverWEB.click(packQty);
        Thread.sleep(3000);
        // Clic mouse OrderQty text/input
        WebDriver driverPackQtyy = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicPackQtytee = driverPackQtyy.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'UnitPerPack::0')]"));
        // Instantiating Actions Class
        Actions actionse = new Actions(driverPackQtyy);
        // Hovering on clicOrderQtytext
        actionse.moveToElement(clicPackQtytee);
        // build() - used to complie all the actions
        actionse.click().build().perform();
        Thread.sleep(1000);
        // Clic Order Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(2000);
        actionse.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(2000);
        actionse.click().build().perform();

        // XPath
        driverWEB.waitObject(inputValorPackQty, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys("4");
        Thread.sleep(3000);

        // Clic Pack Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(5000);

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
        Thread.sleep(2000);

        //clic clusterGuideShop
        driverWEB.click(clusterGuideShopText);
        Thread.sleep(2000);
        driverWEB.waitObject(clusterGuideShop, 30);
        driverWEB.click(clusterSelecionarLinhaText);
        driverWEB.click(clusterGuideShop);
        Thread.sleep(3000);

        // Clic Flecha
        //driverWEB.ScrollToObject(clicFlexaItem);
        //driverWEB.click(clicFlexaItem);

        //clic clusterAER
        driverWEB.click(clusterGuideShopText);
        Thread.sleep(2000);
        driverWEB.waitObject(clusterAER, 30);
        driverWEB.click(clusterSelecionarLinhaText);
        driverWEB.click(clusterAER);
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

        //clic clusterSPO
        //driverWEB.waitObject(clusterSPO, 50);
        //driverWEB.click(clusterSPO);
        //((SeleniumRobotsTool) driverWEB).setText(clusterSPOInput,"P");
        //driverWEB.click(clusterSPOText);
        //Thread.sleep(2000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        //clic clusterW
        driverWEB.click(clusterW);
        Thread.sleep(2000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        //distributionRoles = #Buffer
        driverWEB.waitObject(distributionRoles, 50);
        driverWEB.click(distributionRoles);
        Thread.sleep(4000);
        driverWEB.setText(distributionRolesInput, "#Buffer");
        Thread.sleep(3000);
        driverWEB.click("//input[@value='RNR_DistributionRules:#Buffer']");
        driverWEB.click(distributionRolesText);
        Thread.sleep(2000);

        // Approval Reason = ALTERAÇÃO DE COMMENTS
        driverWEB.waitObject(approvalReason, 50);
        driverWEB.click(approvalReason);
        driverWEB.setText(approvalReasonInput, "ALTERAÇÃO DE COMMENTS");
        driverWEB.click(approvalReasonText);
        Thread.sleep(2000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(5000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Refresh
        driverWEB.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);
    }

    public void alterarPedidooSplitSku(String itemPaiCode) throws Exception {

        // PO RMS BR
        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
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
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(4000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        driverWEB.click(copyCampoSupplierPOAll);
        driverWEB.waitObject(copySupplierPOInput, 6);
        Thread.sleep(4000);

        // Po Br Sku !!!!!!!!!!!!!!!
        driverWEB.setText(copySupplierPOInput, "5217901");
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        driverWEB.click(copyStattePO);
        Thread.sleep(3000);

        // clicar na PO
        driverWEB.waitObject(clicPoBrPack, 10);
        driverWEB.click(clicPoBrPack);
        Thread.sleep(2000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Importada");
        Thread.sleep(4000);

        // State PO para valiation
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Validation");
        Thread.sleep(3000);
        driverWEB.click("//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_State_enum:']//div[@item='0']");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        //Commercial Week:
        Thread.sleep(1000);
        informarCommercialWeekImportado("45");
        Thread.sleep(2000);

        // Modal: Air, PO Importada Pack
        driverWEB.waitObject(poModelAirPack, 20);
        driverWEB.click(poModelAirPack);
        //driverWEB.setTextWithoutClear(inputValorPoModelAir, "Air");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("Air");
        Thread.sleep(1000);
        driverWEB.click(poModelAirText);
        Thread.sleep(3000);

        // External Local: SHANGAI-CHINA, PO Importada Pack
        driverWEB.click(poExternalLocalPack);
        Thread.sleep(1000);
        //driverWEB.setTextWithoutClear(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(1000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(2000);

        // FFDD Date
        // Regra de Negocio, pega o dia atual
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date datenow = new Date();
        String daynow = dateFormat.format(datenow);

        driverWEB.click(ffddDate);
        driverWEB.setText(inputValorFFDDDate, daynow);
        Thread.sleep(2000);
        driverWEB.click(ffddDateText);
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Não validar OTB
        Thread.sleep(2000);
        driverWEB.click(naoValidarOtb);
        Thread.sleep(300);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(8000);

        // Clic Flecha
        //driverWEB.ScrollToObject(clicFlexaItem);
        //driverWEB.click(clicFlexaItem);
        //Thread.sleep(3000);

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
        Thread.sleep(3000);

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
        //driverWEB.setTextWithoutClear(inputOrderCase, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("2");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        informarPOQty("2");
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

        //clic clusterGuideShop
        //driverWEB.click(clusterGuideShopText);
        //Thread.sleep(2000);
        //driverWEB.waitObject(clusterGuideShop, 30);
        //driverWEB.click(clusterSelecionarLinhaText);
        //driverWEB.click(clusterGuideShop);
        //Thread.sleep(7000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(8000);

        // Clic Flecha
        //driverWEB.ScrollToObject(clicFlexaItem);
        //driverWEB.click(clicFlexaItem);
        //Thread.sleep(7000);

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
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);

        //clic clusterAER
        //driverWEB.click(clusterGuideShopText);
        //Thread.sleep(2000);
        //driverWEB.waitObject(clusterAER, 30);
        //driverWEB.click(clusterSelecionarLinhaText);
        //driverWEB.click(clusterAER);
        //Thread.sleep(7000);

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
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        //clic clusterW
        driverWEB.click(clusterW);
        Thread.sleep(7000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        //distributionRoles = #Buffer
        //driverWEB.waitObject(distributionRoles, 50);
        //driverWEB.click(distributionRoles);
        //Thread.sleep(4000);
        //((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput,"#Buffer");
        //Thread.sleep(3000);
        //((SeleniumRobotsTool) driverWEB).click("//input[@value='RNR_DistributionRules:#Buffer']");
        //driverWEB.click(distributionRolesText);
        //Thread.sleep(6000);

        // Approval Reason = ALTERAÇÃO DE COMMENTS
        driverWEB.waitObject(approvalReason, 50);
        driverWEB.click(approvalReason);
        driverWEB.setText(approvalReasonInput, "ALTERAÇÃO DE COMMENTS");
        driverWEB.click(approvalReasonText);
        Thread.sleep(6000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(8000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // PO RMS LATAM
        // Clicar no Link da outra PO e Alterar
        driverWEB.click(poVinculada);
        Thread.sleep(2000);

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        driverWEB.switchTab();
        String pageAtual = driver.getCurrentUrl();

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Importada");
        Thread.sleep(4000);

        // State PO para valiation
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Validation");
        Thread.sleep(3000);
        driverWEB.click("//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_State_enum:']//div[@item='0']");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        //Commercial Week:
        Thread.sleep(1000);
        informarCommercialWeekImportado("40");
        Thread.sleep(3000);

        // Modal: Air, PO Importada Pack
        driverWEB.waitObject(poModelAirPack, 20);
        driverWEB.click(poModelAirPack);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirLatamPack).sendKeys("Air");
        Thread.sleep(1000);
        driverWEB.click(poModelAirText);
        Thread.sleep(5000);

        // External Local: SHANGAI-CHINA, PO Importada Pack
        driverWEB.click(poExternalLocalPack);
        Thread.sleep(1000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalLatamPack).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(1000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(6000);

        // FFDD Date
        DateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
        Date datenoww = new Date();
        String daynoww = dateFormatt.format(datenoww);

        driverWEB.click(ffddDate);
        driverWEB.setText(inputValorFFDDDate, daynoww);
        Thread.sleep(2000);
        driverWEB.click(ffddDateText);
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Não validar OTB
        //Thread.sleep(1000);
        //driverWEB.click(naoValidarOtb);
        //Thread.sleep(3000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Clic Flecha
        //driverWEB.ScrollToObject(clicFlexaItem);
        //driverWEB.click(clicFlexaItem);
        //Thread.sleep(3000);

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

        // Order Case
        driverWEB.click(orderCase);
        Thread.sleep(3000);
        // Clic mouse OrderQty text/input
        WebDriver driverOrderCasee = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicOrderCasee = driverOrderCasee.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]"));
        // Instantiating Actions Class
        Actions actionsscc = new Actions(driverOrderCasee);
        // Hovering on clicOrderQtytext
        actionsscc.moveToElement(clicOrderCasee);
        // build() - used to complie all the actions
        actionsscc.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);
        actionsscc.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);
        actionsscc.click().build().perform();

        // XPath
        driverWEB.waitObject(inputOrderCase, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("2");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        informarPOQty("2");
        Thread.sleep(3000);

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
        Thread.sleep(2000);

        //clic clusterGuideShop
        //driverWEB.click(clusterGuideShopText);
        //Thread.sleep(2000);
        //driverWEB.waitObject(clusterGuideShop, 30);
        //driverWEB.click(clusterSelecionarLinhaText);
        //((SeleniumRobotsTool) driverWEB).click(clusterGuideShop);
        //Thread.sleep(5000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(8000);

        // Clic Flecha
        //driverWEB.ScrollToObject(clicFlexaItem);
        //driverWEB.click(clicFlexaItem);
        //Thread.sleep(7000);

        //clic clusterAER
        //driverWEB.click(clusterGuideShopText);
        //Thread.sleep(2000);
        //driverWEB.waitObject(clusterAER, 30);
        //driverWEB.click(clusterSelecionarLinhaText);
        //((SeleniumRobotsTool) driverWEB).click(clusterAER);
        //Thread.sleep(6000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        //clic clusterSPO
        //driverWEB.waitObject(clusterSPO, 50);
        //driverWEB.click(clusterSPO);
        //((SeleniumRobotsTool) driverWEB).setText(clusterSPOInput,"P");
        //driverWEB.click(clusterSPOText);
        //Thread.sleep(2000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        //clic clusterW
        driverWEB.click(clusterW);
        Thread.sleep(5000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        //distributionRoles = #Buffer
        //driverWEB.waitObject(distributionRoles, 50);
        //driverWEB.click(distributionRoles);
        //Thread.sleep(4000);
        //((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput,"#Buffer");
        //Thread.sleep(3000);
        //((SeleniumRobotsTool) driverWEB).click("//input[@value='RNR_DistributionRules:#Buffer']");
        //driverWEB.click(distributionRolesText);
        //Thread.sleep(5000);

        // Approval Reason = ALTERAÇÃO DE COMMENTS
        driverWEB.waitObject(approvalReason, 50);
        driverWEB.click(approvalReason);
        driverWEB.setText(approvalReasonInput, "ALTERAÇÃO DE COMMENTS");
        driverWEB.click(approvalReasonText);
        Thread.sleep(6000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(8000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

    }

    public void criarPedidoSplitPack_New(String itemPaiCode) throws Exception {

        addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);

        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        // Refresh
        driverWEB.click(refreshPedidoPackSplit);
        Thread.sleep(2000);
        Thread.sleep(4000);
        driverWEB.click(campoCode);
        driverWEB.waitObject(inputCode, 6);
        Thread.sleep(4000);
        driverWEB.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        driverWEB.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        driverWEB.click(textDescription);
        Thread.sleep(2000);

        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        driverWEB.click(clicCampoCode);
        Thread.sleep(8000);

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

        // Colorway 1
        driverWEB.waitObject(selectColorway1, 5);
        driverWEB.click(selectColorway1);
        Thread.sleep(2000);

        // Colorway 2
        //driverWEB.waitObject(selectColorway2, 5);
        //driverWEB.click(selectColorway2);
        //Thread.sleep(4000);

        // Finish
        driverWEB.waitObject(finish, 5);
        driverWEB.click(finish);
        Thread.sleep(4000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRennerNacional("Renner PO Importada");
        Thread.sleep(5000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        //Order Origin:
        informarPaisLatamPack("China");
        Thread.sleep(5000);

        Thread.sleep(1000);
        yearLatamPackImportado();
        Thread.sleep(5000);

        //Commercial Week:
        Thread.sleep(1000);
        informarCommercialWeekImportado("45");
        Thread.sleep(6000);

        // Supplier PO PO/Model
        informarPOModelImportado("Split (RMS BR and LATAM)");
        Thread.sleep(2000);

        //Location Type Importada
        //driverWEB.click(locationType);
        //driverWEB.setTextWithoutClear(inputValorLocationType, "Importado");
        //Thread.sleep(1000);
        //driverWEB.click(locationTypeText);
        //Thread.sleep(2000);

        //WarehouseStore

        informarWarehouseStoreImportadoPack("CENTRO DE DISTRIBUIÇÃO URUGUAI");
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(poModelAir,40);
        Thread.sleep(6000);

        // Modal: Air, PO Importada
        driverWEB.click(poModelAir);
        //driverWEB.setTextWithoutClear(inputValorPoModelAir, "Air");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirPack).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModelAirPack).sendKeys("Air");
        Thread.sleep(1000);
        driverWEB.click(poModelAirText);
        Thread.sleep(8000);

        // External Local: SHANGAI-CHINA, PO Importada
        driverWEB.click(poExternalLocal);
        //driverWEB.setTextWithoutClear(inputValorPoExternalLocal, "SHANGHAI - CHINA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoExternalLocalPack).sendKeys("SHANGHAI - CHINA");
        Thread.sleep(4000);
        driverWEB.click(poExternalLocalText);
        Thread.sleep(7000);

        // TRade: Outros, PO Importada
        driverWEB.click(poTrade);
        //driverWEB.setTextWithoutClear(inputValorPoTrade, "Outros");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradePack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoTradePack).sendKeys("Outros");
        Thread.sleep(2000);
        driverWEB.click(poTradeText);
        Thread.sleep(4000);

        // Parceiro (FFDD) : 394777319395 - 5F Apparels Ltd, PO Importada
        //driverWEB.click(poParceiro);
        //driverWEB.setTextWithoutClear(inputValorParceiro, "17121003540 - Anzir Apparels Ltd.");
        //Thread.sleep(1000);
        //driverWEB.click(poParceiroText);
        //Thread.sleep(4000);

        //Factory
        driverWEB.click(poFactory);
        //driverWEB.setTextWithoutClear(inputValorFactory, "17121003540 - Anzir Apparels Ltd.");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactoryPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorFactoryPack).sendKeys("Fábrica DDX");
        Thread.sleep(3000);
        driverWEB.click(poFactoryText);
        Thread.sleep(7000);

        // Não validar OTB
        Thread.sleep(1000);
        driverWEB.click(naoValidarOtbPack);
        Thread.sleep(2000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(6000);

        // Select Viewer Renner PO Importada
        Thread.sleep(3000);
        driverWEB.click(viewRenner);
        Thread.sleep(3000);
        //driverWEB.setTextWithoutClear(selectViewRenner, "Renner PO Importada");
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys("Renner PO Importada");
        Thread.sleep(3000);
        driverWEB.click("//*[@item='1']");
        Thread.sleep(5000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(7000);

        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
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
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

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
        Thread.sleep(2000);
        actionspp.click().build().perform();
        // XPath
        //driverWEB.click(selectCampoPP);
        Thread.sleep(2000);
        driverWEB.waitObject(inputValorpp, 10);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorpp, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorpp).sendKeys("4");
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
        //driverWEB.setTextWithoutClear(inputValorp, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorp).sendKeys("2");
        Thread.sleep(2000);
        // Clic P Text pg
        driverWEB.click(pText);
        Thread.sleep(1000);

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
        Thread.sleep(1000);
        actionsM.click().build().perform();
        Thread.sleep(1000);
        // Clic M Text pg
        driverWEB.click(mText);
        Thread.sleep(1000);
        actionsM.click().build().perform();
        // Clic M
        //driverWEB.click(selectCampoM);
        Thread.sleep(1000);
        // XPath
        driverWEB.waitObject(inputValorm, 10);
        // Insert valor no campo M
        //driverWEB.setTextWithoutClear(inputValorm, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorm).sendKeys("2");
        Thread.sleep(2000);
        // Clic M Text pg
        driverWEB.click(mText);
        Thread.sleep(2000);

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
        //driverWEB.setTextWithoutClear(inputValorg, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorg).sendKeys("2");
        Thread.sleep(1000);
        // Clic G Text pg
        driverWEB.click(gText);
        Thread.sleep(4000);

        // Clic GG Text pg
        //Thread.sleep(1000);
        // Clic mouse GG text/input
        //WebDriver driverGG = ((WebDriver)(driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        //WebElement clicGG = driverGG.findElement(By.xpath("//*[@data-csi-heading-vi='4']"));
        // Instantiating Actions Class
        //Actions actionsGG = new Actions(driverGG);
        // Hovering on clicGGtext
        //actionsGG.moveToElement(clicGG);
        // build() - used to complie all the actions
        //actionsGG.click().build().perform();
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(1000);
        //actionsGG.click().build().perform();
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(1000);
        //actionsGG.click().build().perform();
        //driverWEB.click(selectCampoGG);
        //Thread.sleep(1000);
        // XPath
        //driverWEB.waitObject(inputValorgg, 10);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorgg, "2");
        //((SeleniumRobotsTool)driverWEB).getElement(inputValorgg).sendKeys("2");
        //Thread.sleep(1000);
        // Clic GG Text pg
        //driverWEB.click(ggText);
        //Thread.sleep(1000);
        //Pack Qty
        //driverWEB.click(packQty);
        //Thread.sleep(1000);
        // Clic mouse OrderQty text/input
        //WebDriver driverPackQty = ((WebDriver)(driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        //WebElement clicPackQtyte = driverPackQty.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'UnitPerPack::0')]"));
        // Instantiating Actions Class
        //Actions actions = new Actions(driverPackQty);
        // Hovering on clicOrderQtytext
        //actions.moveToElement(clicPackQtyte);
        // build() - used to complie all the actions
        //actions.click().build().perform();
        //Thread.sleep(1000);

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
        //driverWEB.setTextWithoutClear(inputOrderCase, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("1");
        Thread.sleep(1000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(4000);

        // Pack Qty
        driverWEB.click(packQty);
        Thread.sleep(2000);
        // Clic mouse OrderQty text/input
        WebDriver driverPackQtyy = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicPackQtyt = driverPackQtyy.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'UnitPerPack::0')]"));
        // Instantiating Actions Class
        Actions actionns = new Actions(driverPackQtyy);
        // Hovering on clicOrderQtytext
        actionns.moveToElement(clicPackQtyt);
        // build() - used to complie all the actions
        actionns.click().build().perform();
        Thread.sleep(1000);
        // Clic Order Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(2000);
        actionns.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(2000);
        actionns.click().build().perform();

        // XPath
        driverWEB.waitObject(inputValorPackQty, 10);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorPackQty, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackQty).sendKeys("10");
        Thread.sleep(3000);

        // Clic Pack Qty Text pg
        driverWEB.click(packQtyText);
        Thread.sleep(4000);

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click(selecionarLinhaPo);
        Thread.sleep(3000);

        //clic clusterGuideShop
        driverWEB.click(clusterGuideShopText);
        Thread.sleep(2000);
        driverWEB.waitObject(clusterGuideShop, 30);
        driverWEB.click(clusterGuideShop);
        Thread.sleep(7000);

        //clic clusterAER
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(clusterAER,20);
        //driverWEB.click(clusterGuideShopText);
        //Thread.sleep(2000);
        //driverWEB.waitObject(clusterAER, 30);
        //driverWEB.click(clusterAER);
        //Thread.sleep(2000);

        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);

        // Cluster URU, obriagtorio na PO Split.
        driverWEB.waitObject(clusterURU, 50);
        driverWEB.click(clusterURU);
        driverWEB.setText(clusterURUInput, "M");
        driverWEB.click(clusterURUText);
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

        //clic clusterSPO
        driverWEB.waitObject(clusterSPO, 50);
        driverWEB.click(clusterSPO);
        driverWEB.setText(clusterSPOInput, "P");
        driverWEB.click(clusterSPOText);
        Thread.sleep(3000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(4000);
        //clic clusterW
        driverWEB.click(clusterW);
        Thread.sleep(4000);

        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

        //locationList = 239097
        driverWEB.waitObject(locationList, 50);
        driverWEB.click(locationList);
        driverWEB.setText(locationListInput, "239097");
        driverWEB.click(locationListText);
        Thread.sleep(2000);

        //distributionRoles = #Buffer e #PC
        driverWEB.waitObject(distributionRoles, 50);
        driverWEB.click(distributionRoles);
        Thread.sleep(4000);
        driverWEB.setText(distributionRolesInput, "#Buffer");
        Thread.sleep(3000);
        driverWEB.click("//input[@value='RNR_DistributionRules:#Buffer']");
        driverWEB.click(distributionRolesText);
        Thread.sleep(2000);

        //distributionRoles = #Buffer e #PC
        driverWEB.waitObject(distributionRoles, 50);
        driverWEB.click(distributionRoles);
        Thread.sleep(4000);
        driverWEB.setText(distributionRolesInput, "#PC");
        Thread.sleep(3000);
        driverWEB.click("//input[@value='RNR_DistributionRules:#PC']");
        driverWEB.click(distributionRolesText);
        Thread.sleep(2000);

        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(3000);

        // Split
        driverWEB.click(orderTipoSplitText);
        Thread.sleep(2000);

        //Order -> Tipo Split Text/Input
        driverWEB.click(orderTipoSplit);
        Thread.sleep(5000);

        // Insert valor no campo Tipo Split
        //driverWEB.setTextWithoutClear(inputValorOrderTipoSplit, "Percentual");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorOrderTipoSplitPack).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorOrderTipoSplitPack).sendKeys("Unidade");
        Thread.sleep(3000);

        // Clic Order Tipo Split Text pg
        driverWEB.click(orderTipoSplitText);
        Thread.sleep(3000);

        //Order PO Order Valor Split Tipo Split Text/Input
        driverWEB.click(orderValorSplit);
        Thread.sleep(3000);

        // Clic mouse Order Valor Split text/input

        WebDriver driverOrderValorSplit = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicOrderValorSplite = driverOrderValorSplit.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_ValorSplit_integer::0')]"));
        // Instantiating Actions Class
        Actions actionsValorSplit = new Actions(driverOrderValorSplit);
        // Hovering on clic Order Valor Split text
        actionsValorSplit.moveToElement(clicOrderValorSplite);
        // build() - used to complie all the actions
        actionsValorSplit.click().build().perform();
        Thread.sleep(3000);

        // Clic Order Valor SPlit Text pg
        driverWEB.click(orderValorSplitText);
        Thread.sleep(3000);

        actionsValorSplit.click().build().perform();
        Thread.sleep(3000);

        // Clic Order Valor Split Text pg
        driverWEB.click(orderValorSplitText);
        Thread.sleep(3000);
        actionsValorSplit.click().build().perform();

        // XPath Valor Split
        driverWEB.waitObject(inputValorSplit, 10);

        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorSplit, "50");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorSplit).sendKeys("10");
        Thread.sleep(3000);

        // Clic Order Valor Split Text pg
        driverWEB.click(orderValorSplitText);
        Thread.sleep(3000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(8000);

        // Clic to --> Play Arrow send Validation
        //driverWEB.click(playArrowValidation);
        //Thread.sleep(3000);

        // Clic to --> Play Submitted
        //driverWEB.click(playArrowSubmitted);
        //Thread.sleep(3000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(1000);
    }

    public void sendMail(String recepient) throws Exception {

        Properties props = new Properties();
        System.out.println("Preparing to send email");
        String username = "francis.automatizado";
        String password = "ReportAuto22@";

        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Recipient's email ID needs to be mentioned.
        String to = "francis.automatizado@gmail.com";
        // Sender's email ID needs to be mentioned
        String from = "Andrey.automatizado@gmail.com";

        // Assuming you are sending email through mtp.gmail.com
        String host = "smtp.gmail.com";
        props.put("mail.smtp.host", host);

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            // Create a default MimeMessage object.
            //MimeMessage message = new MimeMessage(session);
            Message message = new MimeMessage(session);
            //Message message = new MimeMessage((MimeMessage) session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            // Set Subject: header field
            message.setSubject("Testing Automação On Going Renner Subject");
            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();
            // Now set the actual message
            messageBodyPart.setText("Teste automatizado enviando e-mail Report");
            // Create a multipar message
            Multipart multipart = new MimeMultipart();
            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Get Directory Name Test-Output
            String directoryName = Common.directoryName;
            //System.out.println(directoryName);

            // Part two is attachment
            messageBodyPart = new MimeBodyPart();
            String filename = "C:\\Projetos\\rennerongoing\\" + directoryName + "\\ExecutionLogs.txt";

            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            // Send the complete message parts
            message.setContent(multipart);
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void validarAprovacaoDoPedido() throws Exception {

        // Btn Refresh
        Thread.sleep(8000);
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(12000);
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(10000);
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(10000);
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);
        driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
        Thread.sleep(8000);
        // Assert (Integration Status) igual Sucessful
        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        // Pega valor do campo RMS PO Code
        Thread.sleep(8000);
        // RMS Integrantion Status
        String expectIntegrationStatus = driver.findElement(By.xpath(integrationStatusValorText)).getText();
        // SupplierPO
        String expectSupplierPO = driver.findElement(By.xpath(supplierPO)).getText();
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
            // Copiar texto do erro
            String expectError = driver.findElement(By.xpath(commentIssuesError)).getText();
            String mensagemError = "PO de Revenda: java.lang.Exception: Quantidade não é multiplo do tamanho do pack ou do inner. 607380716 NB_RMSSUB_XORDER.VALIDATE_DETAIL";
            //Assert.assertEquals(expectError,mensagemError);
            if (expectError.length() != 0) {
                addLog(scenario, "Compo Issue diferente de zero! ");

            } else {
                addLog(scenario, "O campo Issue retornou em branco! ");
            }
            addLog(scenario, "Error:" + expectError);
            addLog(scenario, "Supplier PO:" + expectSupplierPO);
            addLog(scenario, "Integration Status:" + expectIntegrationStatus);
            addLog(scenario, "Data:" + data);
            addLog(scenario, "Hora:" + hora);
            addLog(scenario, "Link PLM: " + driver.getCurrentUrl());
            Thread.sleep(8000);
        }
        //Successful
        if (expectIntegrationStatus.equals("Successful")) {
            Thread.sleep(2000);
            aprovarPedido();
            Thread.sleep(2000);
        } else {
            driverWEB.waitObject(expectIntegrationStatus, 20);
            Thread.sleep(8000);

            // Refresh
            driverWEB.click("//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']");
            Thread.sleep(16000);

            expectIntegrationStatus = driver.findElement(By.xpath(integrationStatusValorText)).getText();

            if (expectIntegrationStatus.equals("Successful")) {
                aprovarPedido();
                Thread.sleep(2000);
            }
            if (expectIntegrationStatus.equals("Error")) {
                aprovarPedido();
                Thread.sleep(2000);
            }
        }
    }

    public void aprovarPedido() throws Exception {

        // Assert (RMS PO Code)
        Thread.sleep(8000);
        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        // RMS Integrantion Status
        String expectIntegrationStatus = driver.findElement(By.xpath(integrationStatusValorText)).getText();
        // RMS PO Code
        String expectRMSPOCode = driver.findElement(By.xpath(rmsPoCodeValor)).getText();
        // Supplier PO
        String expectSupplierPO = driver.findElement(By.xpath(supplierPO)).getText();
        Thread.sleep(3000);
        // Date
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

        if (!driver.findElement(By.xpath(rmsPoCodeValor)).getText().isEmpty()) {
            // Test RMS PO Code
            if (expectRMSPOCode.length() != 0) {
                addLog(scenario, "Integration Status:" + expectIntegrationStatus);
                addLog(scenario, "Supplier PO:" + expectSupplierPO);
                addLog(scenario, "RMS PO Code:" + expectRMSPOCode);
                addLog(scenario, "Data:" + data);
                addLog(scenario, "Hora:" + hora);
                Thread.sleep(4000);
                // F5 page
                ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
                //((SeleniumRobotsTool)driverWEB).refreshPage();
                Thread.sleep(4000);
                // Clic Flexa
                //driverWEB.ScrollToObject(clicFlexaItem);
                //driverWEB.click(clicFlexaItem);

            } else {
                Thread.sleep(3000);
                addLog(scenario, "Integration Status:" + expectIntegrationStatus);
                addLog(scenario, "Data:" + data);
                addLog(scenario, "Hora:" + hora);

            }
        } else {
            addLog(scenario, "Integration Status:" + expectIntegrationStatus);
            addLog(scenario, "Data:" + data);
            addLog(scenario, "Hora:" + hora);
        }
    }

}




