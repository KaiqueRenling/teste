package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.CriarPedidoApartirDeUmExistentePage;
import br.com.plm.mdm.steps.Common;
import br.com.renner.robots.SeleniumRobotsTool;
import helpers.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
import java.util.Date;
import java.util.Properties;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;


public class CriarPedidoCompraApartirDeUmExistenteInteractions extends CriarPedidoApartirDeUmExistentePage {

    private void informarWarehouseStoreImportado(String warehousestore) throws Exception {
        // Supplier PO Warehouse/Store
        seleniumRobotsTool.click(warehouseStoreImportado);
        seleniumRobotsTool.getElement(inputValorWarehouseStoreImportadoSku).sendKeys("");
        seleniumRobotsTool.getElement(inputValorWarehouseStoreImportadoSku).sendKeys(warehousestore);
        Thread.sleep(2000);
        seleniumRobotsTool.click(warehouseStoreText);
        Thread.sleep(2000);
    }

    private void informarPOModelSKU(String pomodel) throws Exception {

        // Supplier PO PO/Model
        seleniumRobotsTool.click(poModel);
        seleniumRobotsTool.getElement(inputValorPoModel).sendKeys("");
        seleniumRobotsTool.getElement(inputValorPoModel).sendKeys(pomodel);
        Thread.sleep(3000);
        seleniumRobotsTool.click(poModelText);
        Thread.sleep(2000);
    }

    private void viewerRennerPoBrPack(String vRenner) throws Exception {
        Thread.sleep(3000);
        seleniumRobotsTool.click(viwerRennerPoBrPack);
        Thread.sleep(3000);
        seleniumRobotsTool.getElement(inputSelectViewerPoBrPack).sendKeys("");
        seleniumRobotsTool.getElement(inputSelectViewerPoBrPack).sendKeys(vRenner);
        Thread.sleep(1000);
        seleniumRobotsTool.click("//*[@item='1']");
        Thread.sleep(3000);
    }

    private void informarPOModelLatam(String pomodel) throws Exception {
        // Supplier PO PO/Model
        seleniumRobotsTool.click(poModel);
        //seleniumRobotsTool.setTextWithoutClear(inputValorPoModelLatam, pomodel);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputValorPoModelLatam).sendKeys("");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputValorPoModelLatam).sendKeys(pomodel);
        Thread.sleep(1000);
        seleniumRobotsTool.click(poModelText);
        Thread.sleep(2000);
    }

    private void informarPOModelCopy(String pomodel) throws Exception {
        seleniumRobotsTool.click(poModel);
        //seleniumRobotsTool.setTextWithoutClear(inputValorPoModel, "RMS BR");
        //seleniumRobotsTool.setTextWithoutClear(inputValorPoModelCopy, pomodel);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputValorPoModelCopy).sendKeys("");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputValorPoModelCopy).sendKeys(pomodel);
        Thread.sleep(1000);
        seleniumRobotsTool.click(poModelText);
        Thread.sleep(2000);
    }

    //Viewer Renner PO Nacional,Importada e Split
    private void selecionarViewerRenner(String viewerRenner) throws Exception {
        Thread.sleep(3000);
        seleniumRobotsTool.click(viewerRennerNew);
        Thread.sleep(3000);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(selectViewRenner).sendKeys("");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(selectViewRenner).sendKeys(viewerRenner);
        Thread.sleep(1000);
        seleniumRobotsTool.click("//*[@item='1']");
        Thread.sleep(3000);
    }

    private void viewerRenner(String vRenner) throws Exception {
        Thread.sleep(3000);
        seleniumRobotsTool.click(viewersRenner);
        Thread.sleep(3000);
        //seleniumRobotsTool.setTextWithoutClear(selectViewsRenner, "");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(selectViewsRenner).sendKeys("");
        //seleniumRobotsTool.setTextWithoutClear(selectViewsRenner, vRenner);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(selectViewsRenner).sendKeys(vRenner);
        Thread.sleep(1000);
        seleniumRobotsTool.click("//*[@item='1']");
        Thread.sleep(3000);
    }

    //Year
    private void yearPack() throws Exception {

        // Regra de Negocio, pega o ano atual
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateyearnow = new Date();
        String yearnow = dateFormat.format(dateyearnow);

        seleniumRobotsTool.click(year);
        Thread.sleep(1000);
        //seleniumRobotsTool.setTextWithoutClear(YearInputPack, yearnow);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(YearInputPack).sendKeys("");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(YearInputPack).sendKeys(yearnow);
        Thread.sleep(1000);
        seleniumRobotsTool.click(yearText);
        Thread.sleep(2000);
    }

    private void yearSKU() throws Exception {

        // Regra de Negocio, pega o ano atual
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateyearnow = new Date();
        String yearnow = dateFormat.format(dateyearnow);

        seleniumRobotsTool.click(year);
        Thread.sleep(1000);
        //seleniumRobotsTool.setText(YearInput, yearnow);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(YearInputSku).sendKeys("");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(YearInputSku).sendKeys(yearnow);
        Thread.sleep(1000);
        seleniumRobotsTool.click(yearText);
        Thread.sleep(2000);
    }

    //Year New
    private void yearNew() throws Exception {

        // Regra de Negocio, pega o ano atual
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateyearnow = new Date();
        String yearnow = dateFormat.format(dateyearnow);

        seleniumRobotsTool.click(yearNew);
        Thread.sleep(2000);
        seleniumRobotsTool.waitObject(YearInputNew, 5);
        //seleniumRobotsTool.setTextWithoutClear(YearInputNew, yearnow);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(YearInputNew).sendKeys("");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(YearInputNew).sendKeys(yearnow);
        Thread.sleep(2000);
        seleniumRobotsTool.click(yearText);
        Thread.sleep(2000);
    }

    //Year New SKU Copy
    private void yearNewCopy() throws Exception {

        // Regra de Negocio, pega o ano atual
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateyearnow = new Date();
        String yearnow = dateFormat.format(dateyearnow);

        seleniumRobotsTool.click(yearNew);
        Thread.sleep(1000);
        seleniumRobotsTool.waitObject(YearInputNewCopy, 5);
        //seleniumRobotsTool.setTextWithoutClear(YearInputNewCopy, yearnow);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(YearInputNewCopy).sendKeys("");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(YearInputNewCopy).sendKeys(yearnow);
        Thread.sleep(1000);
        seleniumRobotsTool.click(yearText);
        Thread.sleep(2000);
    }

    // Supplier PO Warehouse/Store
    private void informarWarehouseStore(String warehousestore) throws Exception {
        seleniumRobotsTool.click(warehouseStore);
        //seleniumRobotsTool.setTextWithoutClear(inputValorWarehouseStore, warehousestore);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputValorWarehouseStore).sendKeys(warehousestore);
        Thread.sleep(1000);
        seleniumRobotsTool.click(warehouseStoreText);
        Thread.sleep(2000);
    }

    // Supplier PO SKU Warehouse/Store Copy
    private void informarWarehouseStoreCopy(String warehousestore) throws Exception {
        seleniumRobotsTool.click(warehouseStore);
        //seleniumRobotsTool.setTextWithoutClear(inputValorWarehouseStoreCopy, warehousestore);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputValorWarehouseStoreCopy).sendKeys("");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputValorWarehouseStoreCopy).sendKeys(warehousestore);
        Thread.sleep(1000);
        seleniumRobotsTool.click(warehouseStoreText);
        Thread.sleep(2000);
    }

    //Commercial Week:
    private void informarCommercialWeek(String commercialWeekValue) throws Exception {
        seleniumRobotsTool.click(commercialWeek);
        //seleniumRobotsTool.setTextWithoutClear(commercialWeekInput, "05");
        //seleniumRobotsTool.setTextWithoutClear(commercialWeekInput, commercialWeekValue);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(commercialWeekInput).sendKeys(commercialWeekValue);
        Thread.sleep(1000);
        seleniumRobotsTool.click(commercialWeekText);
        Thread.sleep(2000);
    }

    //Commercial Week SKU Copy
    private void informarCommercialWeekCopy(String commercialWeekValue) throws Exception {

        seleniumRobotsTool.click(commercialWeek);
        //seleniumRobotsTool.setTextWithoutClear(commercialWeekInputCopy, commercialWeekValue);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(commercialWeekInputCopy).sendKeys("");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(commercialWeekInputCopy).sendKeys(commercialWeekValue);
        Thread.sleep(1000);
        seleniumRobotsTool.click(commercialWeekText);
        Thread.sleep(2000);
    }

    private void informarPoPackOrderQty(String OrderQty) throws Exception {

        // Order Qty
        seleniumRobotsTool.click(orderQtyy);
        Thread.sleep(4000);
        // Clic mouse OrderQty text/input
        WebDriver driverOrderQty = ((WebDriver) (seleniumRobotsTool.getDriver()));
        // Locating the main menu (Parent element)
        WebElement clicOrderCase = driverOrderQty.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'Quantity::0')]"));
        // Instantiating Actions Class
        Actions actionss = new Actions(driverOrderQty);
        // Hovering on clicOrderQtytext
        actionss.moveToElement(clicOrderCase);
        // build() - used to complie all the actions
        actionss.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Case Text pg
        seleniumRobotsTool.click(copyOrderQtyText);
        Thread.sleep(2000);
        actionss.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Case Text pg
        seleniumRobotsTool.click(copyOrderQtyText);
        Thread.sleep(2000);
        actionss.click().build().perform();

        // XPath
        seleniumRobotsTool.waitObject(inputCopyValuePackOrderQty, 10);
        // Insert valor no campo OrderQty
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputCopyValuePackOrderQty).sendKeys("1000");
        Thread.sleep(2000);

        // Clic Order Qty Text pg
        seleniumRobotsTool.click(copyOrderQtyText);
        Thread.sleep(2000);


    }

    public void criarPedidoApartirDoExistenteBrSKUNew(String itemPaiCode) throws Exception {

        // Viewer Renner
        Thread.sleep(2000);
        viewerRenner("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        seleniumRobotsTool.click(btnRefresh);
        Thread.sleep(5000);

        // Code ItemPaiCode
        Utils.addLog(scenario, "Etapa: Selecionar Code");
        //seleniumRobotsTool.ScrollToObject(codeText);
        Thread.sleep(4000);
        seleniumRobotsTool.click(campoCode);
        seleniumRobotsTool.waitObject(inputCode, 6);
        Thread.sleep(4000);
        seleniumRobotsTool.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        seleniumRobotsTool.click(textDescription);
        Thread.sleep(2000);

        Utils.addLog(scenario, "Etapa: Selecionar Code");
        seleniumRobotsTool.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        seleniumRobotsTool.click(clicCampoCode);
        Thread.sleep(8000);

        seleniumRobotsTool.waitObject(abaSourcing, 6);
        seleniumRobotsTool.click(abaSourcing);
        Thread.sleep(3000);

        // Clicar em POs
        seleniumRobotsTool.waitObject(abaPOs, 6);
        seleniumRobotsTool.click(abaPOs);
        Thread.sleep(3000);

        // Clicar Supplier POs
        seleniumRobotsTool.waitObject(abaSupplierPOs, 6);
        seleniumRobotsTool.click(abaSupplierPOs);
        Thread.sleep(3000);

        // Code ItemPaiCode
        Utils.addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        seleniumRobotsTool.click(copyCampoSupplierPOAll);
        seleniumRobotsTool.waitObject(copySupplierPOInput, 6);
        Thread.sleep(5000);

        // Po Br Pack !!!!!!!!!!!!!!!
        seleniumRobotsTool.setText(copySupplierPOInput, "5234511");
        Thread.sleep(3000);
        seleniumRobotsTool.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        seleniumRobotsTool.click(copyStattePO);
        Thread.sleep(3000);

        Utils.addLog(scenario, "Etapa: Selecionar Copy Campo Supplier PO");
        //seleniumRobotsTool.click(btnCopyPO);
        seleniumRobotsTool.click(clicCopySupplierPO);
        Thread.sleep(4000);
        seleniumRobotsTool.click(btnSavePO);
        Thread.sleep(8000);

        // Copy PO, send pg campos obrigatórios PO
        Thread.sleep(1000);
        seleniumRobotsTool.waitObject(linkCopyPoCopiada, 5);
        seleniumRobotsTool.click(linkCopyPoCopiada);
        Thread.sleep(5000);
        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Nacional");
        Thread.sleep(4000);

        // Refresh
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        //Year:
        yearNewCopy();
        Thread.sleep(4000);

        //Commercial Week Copy
        informarCommercialWeekCopy("52");
        Thread.sleep(4000);

        // Supplier PO PO/Model
        informarPOModelCopy("RMS BR");
        Thread.sleep(4000);

        //WarehouseStore
        informarWarehouseStoreCopy("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        Thread.sleep(4000);

        // OTB
        seleniumRobotsTool.click(naoValidarOtbNacional);
        Thread.sleep(2000);

        // Scroll Right
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);


        // F5 page
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)seleniumRobotsTool).refreshPage();
        Thread.sleep(4000);

        // Submitted
        seleniumRobotsTool.waitObject(statePo, 10);
        seleniumRobotsTool.click(statePo);
        seleniumRobotsTool.waitObject(statePo, 10);
        seleniumRobotsTool.clearField(inputStatePo);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(3000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);

    }

    public void criarPedidoApartirDoExistenteImportadoSKUNew(String itemPaiCode) throws Exception {

        Utils.addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        seleniumRobotsTool.click(btnRefresh);
        Thread.sleep(5000);

        // Code ItemPaiCode
        Utils.addLog(scenario, "Etapa: Selecionar Code");
        //seleniumRobotsTool.ScrollToObject(codeText);
        Thread.sleep(4000);
        seleniumRobotsTool.click(campoCode);
        seleniumRobotsTool.waitObject(inputCode, 6);
        Thread.sleep(4000);
        seleniumRobotsTool.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        seleniumRobotsTool.click(textDescription);
        Thread.sleep(2000);

        Utils.addLog(scenario, "Etapa: Selecionar Code");
        seleniumRobotsTool.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        seleniumRobotsTool.click(clicCampoCode);
        Thread.sleep(8000);

        seleniumRobotsTool.waitObject(abaSourcing, 6);
        seleniumRobotsTool.click(abaSourcing);
        Thread.sleep(2000);

        // Clicar em POs
        seleniumRobotsTool.waitObject(abaPOs, 6);
        seleniumRobotsTool.click(abaPOs);
        Thread.sleep(2000);

        // Clicar Supplier POs
        seleniumRobotsTool.waitObject(abaSupplierPOs, 6);
        seleniumRobotsTool.click(abaSupplierPOs);

        // Code ItemPaiCode
        Utils.addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        seleniumRobotsTool.click(copyCampoSupplierPOAll);
        seleniumRobotsTool.waitObject(copySupplierPOInput, 6);
        Thread.sleep(2000);

        // Po Br Pack !!!!!!!!!!!!!!!
        seleniumRobotsTool.setText(copySupplierPOInput, "5217705");
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        seleniumRobotsTool.click(copyStattePO);
        Thread.sleep(2000);

        Utils.addLog(scenario, "Etapa: Selecionar Copy Campo Supplier PO");
        //seleniumRobotsTool.click(btnCopyPO);
        seleniumRobotsTool.click(clicCopySupplierPO);
        Thread.sleep(4000);
        seleniumRobotsTool.click(btnSavePO);
        Thread.sleep(8000);

        // Copy PO, send pg campos obrigatórios PO
        Thread.sleep(1000);
        seleniumRobotsTool.waitObject(linkCopyPoCopiada, 5);
        seleniumRobotsTool.click(linkCopyPoCopiada);
        Thread.sleep(5000);

        selecionarViewerRenner("Renner PO Importada");
        Thread.sleep(4000);

        // Refresh
        Thread.sleep(2000);
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(7000);

        //Year: Latam
        yearNew();
        Thread.sleep(4000);

        // Supplier PO PO/Model
        informarPOModelLatam("RMS LATAM");
        Thread.sleep(4000);


        // OTB
        seleniumRobotsTool.click(naoValidarOtbNacional);
        Thread.sleep(2000);

        // Scroll Right
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(4000);

        // F5 page
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)seleniumRobotsTool).refreshPage();
        Thread.sleep(4000);

        // Submitted
        seleniumRobotsTool.waitObject(statePo, 10);
        seleniumRobotsTool.click(statePo);
        seleniumRobotsTool.waitObject(statePo, 10);
        seleniumRobotsTool.clearField(inputStatePo);
        //seleniumRobotsTool.setText(inputStatePo, "Submitted");
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);
    }

    public void criarPedidoApartirDoExistenteNacionalPack(String itemPaiCode) throws Exception {

        Utils.addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        seleniumRobotsTool.click(btnRefresh);
        Thread.sleep(5000);

        // Code ItemPaiCode
        Utils.addLog(scenario, "Etapa: Selecionar Code");
        //seleniumRobotsTool.ScrollToObject(codeText);
        Thread.sleep(4000);
        seleniumRobotsTool.click(campoCode);
        seleniumRobotsTool.waitObject(inputCode, 6);
        Thread.sleep(4000);
        seleniumRobotsTool.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        seleniumRobotsTool.click(textDescription);
        Thread.sleep(2000);

        Utils.addLog(scenario, "Etapa: Selecionar Code");
        seleniumRobotsTool.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        seleniumRobotsTool.click(clicCampoCode);
        Thread.sleep(8000);

        seleniumRobotsTool.waitObject(abaSourcing, 6);
        seleniumRobotsTool.click(abaSourcing);
        Thread.sleep(2000);

        // Clicar em POs
        seleniumRobotsTool.waitObject(abaPOs, 6);
        seleniumRobotsTool.click(abaPOs);
        Thread.sleep(2000);

        // Clicar Supplier POs
        seleniumRobotsTool.waitObject(abaSupplierPOs, 6);
        seleniumRobotsTool.click(abaSupplierPOs);

        // Code ItemPaiCode
        Utils.addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        seleniumRobotsTool.click(copyCampoSupplierPOAll);
        seleniumRobotsTool.waitObject(copySupplierPOInput, 6);
        Thread.sleep(2000);

        // Po Br Pack !!!!!!!!!!!!!!!
        seleniumRobotsTool.setText(copySupplierPOInput, "5234412");
        Thread.sleep(3000);
        seleniumRobotsTool.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        seleniumRobotsTool.click(copyStattePO);
        Thread.sleep(4000);

        // Refresh
        seleniumRobotsTool.click("//*[@data-csi-automation='plugin-Product-PurchasedOrders-refresh']");

        Utils.addLog(scenario, "Etapa: Selecionar Copy Campo Supplier PO");
        //seleniumRobotsTool.click(btnCopyPO);
        seleniumRobotsTool.click(clicCopySupplierPOPack);
        Thread.sleep(4000);
        seleniumRobotsTool.click(btnSavePO);
        Thread.sleep(6000);

        // Copy PO, send pg campos obrigatórios PO
        Thread.sleep(1000);
        seleniumRobotsTool.waitObject(linkCopyPoCopiada, 5);
        seleniumRobotsTool.click(linkCopyPoCopiada);
        Thread.sleep(5000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRenner("Renner PO Nacional");
        Thread.sleep(4000);

        // Supplier PO PO/Model
        informarPOModelSKU("RMS BR");
        Thread.sleep(4000);

        // OTB
        seleniumRobotsTool.click(naoValidarOtbNacional);
        Thread.sleep(4000);

        // Scroll Right
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(6000);

        // F5 page
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)seleniumRobotsTool).refreshPage();
        Thread.sleep(7000);

        // Submitted
        seleniumRobotsTool.waitObject(statePo, 10);
        seleniumRobotsTool.click(statePo);
        seleniumRobotsTool.waitObject(statePo, 10);
        seleniumRobotsTool.clearField(inputStatePo);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(6000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);


    }

    public void criarPedidoApartirDoExistenteImportadoPack(String itemPaiCode) throws Exception {

        Utils.addLog(scenario, "Etapa: Selecionar Viewer Renner");
        // Viewer Renner
        Thread.sleep(2000);
        viewerRennerPoBrPack("Cadastro de Itens");
        Thread.sleep(4000);

        // Refresh
        seleniumRobotsTool.click(btnRefresh);
        Thread.sleep(5000);

        // Code ItemPaiCode
        Utils.addLog(scenario, "Etapa: Selecionar Code");
        //seleniumRobotsTool.ScrollToObject(codeText);
        Thread.sleep(4000);
        seleniumRobotsTool.click(campoCode);
        seleniumRobotsTool.waitObject(inputCode, 6);
        Thread.sleep(4000);
        seleniumRobotsTool.setText(inputCode, itemPaiCode);
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text Description
        seleniumRobotsTool.click(textDescription);
        Thread.sleep(2000);

        Utils.addLog(scenario, "Etapa: Selecionar Code");
        seleniumRobotsTool.waitObject(clicCampoCode, 6);
        Thread.sleep(2000);
        seleniumRobotsTool.click(clicCampoCode);
        Thread.sleep(8000);

        seleniumRobotsTool.waitObject(abaSourcing, 6);
        seleniumRobotsTool.click(abaSourcing);
        Thread.sleep(2000);

        // Clicar em POs
        seleniumRobotsTool.waitObject(abaPOs, 6);
        seleniumRobotsTool.click(abaPOs);
        Thread.sleep(2000);

        // Clicar Supplier POs
        seleniumRobotsTool.waitObject(abaSupplierPOs, 6);
        seleniumRobotsTool.click(abaSupplierPOs);

        // Code ItemPaiCode
        Utils.addLog(scenario, "Etapa: Selecionar Supplier PO");
        Thread.sleep(2000);
        seleniumRobotsTool.click(copyCampoSupplierPOAll);
        seleniumRobotsTool.waitObject(copySupplierPOInput, 6);
        Thread.sleep(2000);

        // Po Br Pack !!!!!!!!!!!!!!!
        seleniumRobotsTool.setText(copySupplierPOInput, "5216183");
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[@title='Click to add this item to the list']//div[@role='presentation']");
        // Clic Text State PO
        seleniumRobotsTool.click(copyStattePO);
        Thread.sleep(2000);

        Utils.addLog(scenario, "Etapa: Selecionar Copy Campo Supplier PO");
        //seleniumRobotsTool.click(btnCopyPO);
        seleniumRobotsTool.click(clicCopySupplierPO);
        Thread.sleep(4000);
        seleniumRobotsTool.click(btnSavePO);
        Thread.sleep(8000);

        // Copy PO, send pg campos obrigatórios PO
        Thread.sleep(1000);
        seleniumRobotsTool.waitObject(linkCopyPoCopiada, 5);
        seleniumRobotsTool.click(linkCopyPoCopiada);
        Thread.sleep(5000);

        selecionarViewerRenner("Renner PO Importada");
        Thread.sleep(4000);

        // Refresh
        Thread.sleep(2000);
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(4000);

        //Year: Latam
        yearNew();
        Thread.sleep(4000);

        // Supplier PO PO/Model
        informarPOModelLatam("RMS LATAM");
        Thread.sleep(4000);

        // OTB
        seleniumRobotsTool.click(naoValidarOtbNacional);
        Thread.sleep(2000);

        // Scroll Right
        Thread.sleep(2000);
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        seleniumRobotsTool.click("//div[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        Thread.sleep(5000);

        // F5 page
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)seleniumRobotsTool).refreshPage();
        Thread.sleep(4000);

        // Submitted
        seleniumRobotsTool.waitObject(statePo, 10);
        seleniumRobotsTool.click(statePo);
        seleniumRobotsTool.waitObject(statePo, 10);
        seleniumRobotsTool.clearField(inputStatePo);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputStatePo).sendKeys("");
        Thread.sleep(2000);
        ((SeleniumRobotsTool) seleniumRobotsTool).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(1000);
        seleniumRobotsTool.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(4000);

        // Refresh
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(5000);

        // Validar PO e Aprovar
        validarAprovacaoDoPedido();
        Thread.sleep(4000);

    }

    public void validarAprovacaoDoPedido() throws Exception {

        // Botao Refresh
        Thread.sleep(9000);
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(9000);
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(9000);
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(9000);
        seleniumRobotsTool.click(botaoRefreshSupplierPO);

        // Assert (Integration Status) igual Sucessful
        WebDriver driver = ((WebDriver) (seleniumRobotsTool.getDriver()));
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
            seleniumRobotsTool.waitObject(abaIssues, 10);
            Thread.sleep(1000);
            seleniumRobotsTool.click(abaIssues);
            Thread.sleep(1000);
            // Copiar texto do erro
            String expectError = driver.findElement(By.xpath(commentIssuesError)).getText();
            Utils.addLog(scenario, "Error:" + expectError);
            Utils.addLog(scenario, "Integration Status:" + expectIntegrationStatus);
            Utils.addLog(scenario, "Data:" + data);
            Utils.addLog(scenario, "Hora:" + hora);
            // Send to test.java.report email
            //sendMail("francis.automatizado@gmail.com");
            Thread.sleep(8000);
        }

        if (expectIntegrationStatus.equals("Submit")) {
            //clicar nas aba Issues
            //seleniumRobotsTool.waitObject(abaIssues,10);
            //seleniumRobotsTool.click(abaIssues);

            // Copiar texto do erro
            Utils.addLog(scenario, "Integration Status:" + expectIntegrationStatus);
            Utils.addLog(scenario, "Supplier PO:" + expectSupplierPO);
            Utils.addLog(scenario, "Data:" + data);
            Utils.addLog(scenario, "Hora:" + hora);

        }
        //Successful
        if (expectIntegrationStatus.equals("Successful")) {
            Thread.sleep(2000);
            aprovarPedido();
            Thread.sleep(2000);
        } else {
            seleniumRobotsTool.waitObject(expectIntegrationStatus, 20);
            Thread.sleep(1000);
            // Refresh
            seleniumRobotsTool.click(botaoRefreshSupplierPO);
            Thread.sleep(8000);
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

        Thread.sleep(9000);
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(9000);
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(9000);
        seleniumRobotsTool.click(botaoRefreshSupplierPO);
        Thread.sleep(3000);

        // Assert (RMS PO Code) true ??
        Thread.sleep(8000);
        WebDriver driver = ((WebDriver) (seleniumRobotsTool.getDriver()));
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

        if (driver.findElement(By.xpath(rmsPoCodeValor)).getText().isEmpty() == false) {
            // Test RMS PO Code
            if (expectRMSPOCode.length() != 0) {
                Utils.addLog(scenario, "Integration Status:" + expectIntegrationStatus);
                Utils.addLog(scenario, "Supplier PO:" + expectSupplierPO);
                Utils.addLog(scenario, "RMS PO Code:" + expectRMSPOCode);
                Utils.addLog(scenario, "Data:" + data);
                Utils.addLog(scenario, "Hora:" + hora);
                Thread.sleep(4000);
                // F5 page
                ((SeleniumRobotsTool) seleniumRobotsTool).getElement("//body").sendKeys(Keys.F5);
                //((SeleniumRobotsTool)seleniumRobotsTool).refreshPage();
                Thread.sleep(4000);

            } else {
                System.out.println("PO Not Approved\n");
                Thread.sleep(3000);
                Utils.addLog(scenario, "Integration Status:" + expectIntegrationStatus);
                Utils.addLog(scenario, "Data:" + data);
                Utils.addLog(scenario, "Hora:" + hora);
                // Send to test.java.report email
                //sendMail("francis.automatizado@gmail.com");
            }
        } else {
            Utils.addLog(scenario, "Integration Status:" + expectIntegrationStatus);
            Utils.addLog(scenario, "Data:" + data);
            Utils.addLog(scenario, "Hora:" + hora);
        }
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
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
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

            DataSource source = (DataSource) new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler((javax.activation.DataSource) source));
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

}
