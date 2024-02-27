package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.CriarPedidoComAmostraPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static helpers.Utils.addLog;

public class CriarPedidoComAmostraInteractions extends CriarPedidoComAmostraPage {


    IRNRobotsTool driverWEB = seleniumRobotsTool;

    //Viewer Renner PO Nacional
    private void selecionarViewerRennerNacional(String viewerrennernacional) throws Exception {
        Thread.sleep(2000);
        driverWEB.click(viewRenner);
        Thread.sleep(2000);
        //driverWEB.setTextWithoutClear(selectViewRenner, viewerrennernacional);
        //driverWEB.setText(selectViewRenner, viewerrennernacional);
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewRenner).sendKeys(viewerrennernacional);
        driverWEB.click("//*[@item='1']");
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
        //driverWEB.setTextWithoutClear(YearInput, yearnow);
        ((SeleniumRobotsTool) driverWEB).getElement(YearInput).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(YearInput).sendKeys(yearnow);
        Thread.sleep(1000);
        driverWEB.click(yearText);
        Thread.sleep(2000);
    }

    //Commercial Week:
    private void informarCommercialWeek(String commercialWeekValue) throws Exception {
        Thread.sleep(1000);
        driverWEB.click(commercialWeek);
        //driverWEB.setTextWithoutClear(commercialWeekInput, commercialWeekValue);
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInput).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(commercialWeekInput).sendKeys(commercialWeekValue);
        Thread.sleep(1000);
        driverWEB.click(commercialWeekText);
        Thread.sleep(2000);
    }

    //Supplier PO Warehouse/Store
    private void informarWarehouseStore(String warehousestore) throws Exception {
        driverWEB.click(warehouseStore);
        //driverWEB.setTextWithoutClear(inputValorWarehouseStore, warehousestore);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStore).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorWarehouseStore).sendKeys(warehousestore);
        Thread.sleep(1000);
        driverWEB.click(warehouseStoreText);
        Thread.sleep(2000);
    }

    //PO Model
    private void informarPOModel(String pomodel) throws Exception {
        driverWEB.click(poModel);
        //driverWEB.setTextWithoutClear(inputValorPoModel, "RMS BR");
        //driverWEB.setTextWithoutClear(inputValorPoModel, pomodel);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModel).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPoModel).sendKeys(pomodel);
        Thread.sleep(1000);
        driverWEB.click(poModelText);
        Thread.sleep(2000);
    }

    //Orders -> Supplier PO Order Qty order
    private void informarPOQty(String POQty) throws Exception {

        driverWEB.ScrollToObject(orderQtyText);
        driverWEB.waitObject(orderQtyText, 8);
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
        Thread.sleep(2000);

        // Clic Order Qty Text pg
        driverWEB.click(orderQtyText);
        Thread.sleep(2000);
        actions.click().build().perform();

        // Clic campo input
        Thread.sleep(2000);
        //driverWEB.click(selectQty);

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

    //Orders -> Supplier PO Order Pack Qty order
    private void informarPOPackQty(String PackQty) throws Exception {

        driverWEB.ScrollToObject(orderPackQtyText);
        driverWEB.waitObject(orderPackQtyText, 8);
        //driverWEB.click(orderPackQty);
        //driverWEB.click(packQty);
        Thread.sleep(4000);

        // Clic mouse OrderQty text/input
        WebDriver driverOrderQty = ((WebDriver) (driverWEB.getDriver()));
        // Locating the main menu (Parent element)
        //WebElement clicPackQty = driverOrderQty.findElement(By.xpath("//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'Quantity::0')]"));
        WebElement clicPackQty = driverOrderQty.findElement(By.xpath("//*[@data-csi-heading='UnitPerPack::0']"));

        // Instantiating Actions Class
        Actions actions = new Actions(driverOrderQty);
        // Hovering on clicOrderQty
        actions.moveToElement(clicPackQty);
        // build() - used to complie all the actions
        actions.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Qty Text pg
        driverWEB.click(orderPackQtyText);
        Thread.sleep(2000);

        actions.click().build().perform();
        Thread.sleep(1000);

        // Clic Order Qty Text pg
        driverWEB.click(orderPackQtyText);
        Thread.sleep(2000);
        actions.click().build().perform();

        // Clic campo input
        //driverWEB.click(packQtyy);

        // XPath no exist
        driverWEB.waitObject(inputValorPackOrderQty, 10);

        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputValorOrderQty, "2");
        //driverWEB.setTextWithoutClear(inputValorPackOrderQty, PackQty);
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorPackOrderQty).sendKeys(PackQty);
        Thread.sleep(2000);

        // Clic Order Qty Text pg
        driverWEB.click(orderPackQtyText);
        Thread.sleep(2000);
    }

    private void informarFornecedor(String fornecedor) throws Exception {

        Thread.sleep(4000);
        //driverWEB.setText(inputSupplierPO,"EDVAN MALHAS LTDA - 0001-58");
        //driverWEB.setText(inputSupplierPO,fornecedor);
        ((SeleniumRobotsTool) driverWEB).getElement(inputSupplierPO).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputSupplierPO).sendKeys(fornecedor);
        Thread.sleep(2000);

    }

    //Criar PO Br Sku Com Amostra
    public void CriarPOBrSkuComAmostra(String itemPaiCode) throws Exception {


        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.ScrollToObject(codeText);
        // Botao Refresh
        driverWEB.click(botaoRefreshSupplierPO);
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
        Thread.sleep(3000);

        // Clicar em POs
        driverWEB.waitObject(abaPOs, 6);
        driverWEB.click(abaPOs);
        Thread.sleep(3000);

        // Clicar Supplier POs
        driverWEB.waitObject(abaSupplierPOs, 6);
        driverWEB.click(abaSupplierPOs);
        Thread.sleep(3000);

        // New Supplier POs
        driverWEB.waitObject(newSupplierPO, 6);
        driverWEB.click(newSupplierPO);
        Thread.sleep(3000);

        // New Supplier POs clic me Next
        driverWEB.click(clicNext);
        Thread.sleep(3000);

        Thread.sleep(4000);
        // Color Specification, Add sku para PO
        driverWEB.ScrollToObject(selectSkuP);
        driverWEB.waitObject(selectSkuP, 5);
        driverWEB.click(selectSkuP);
        Thread.sleep(4000);

        // Finish
        driverWEB.waitObject(finish, 5);
        driverWEB.click(finish);
        Thread.sleep(5000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRennerNacional("Renner PO Nacional");
        Thread.sleep(5000);

        // Year
        Thread.sleep(2000);
        year();
        Thread.sleep(2000);

        //Commercial Week:
        Thread.sleep(1000);
        informarCommercialWeek("52");
        Thread.sleep(2000);

        //PO Model Supplier
        Thread.sleep(3000);
        informarPOModel("RMS BR");
        Thread.sleep(5000);

        //WarehouseStore
        Thread.sleep(1000);
        informarWarehouseStore("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        Thread.sleep(6000);

        // PO Type
        //driverWEB.click(poType);
        //driverWEB.setTextWithoutClear(poTypeInput, "Normal");
        //Thread.sleep(1000);
        //driverWEB.click(poTypeText);
        //Thread.sleep(2000);

        // Não validar OTB
        Thread.sleep(1000);
        driverWEB.click(naoValidarOtb);
        Thread.sleep(4000);

        //Factory
        //driverWEB.click(poFactory);
        //driverWEB.setTextWithoutClear(inputBrValorFactory, "BRENDISOL TRADING S.A. - 101281");
        //Thread.sleep(1000);
        //driverWEB.click(poFactoryText);
        //Thread.sleep(4000);

        // Refresh
        driverWEB.click("(//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh'])[1]");
        Thread.sleep(7000);

        // Scroll Right
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
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
        Thread.sleep(4000);

        // Order Case
        driverWEB.click(orderCaseSkuRmsBr);
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
        driverWEB.waitObject(inputOrderCaseSkuRmsBr, 10);
        // Insert valor no campo OrderQty
        //driverWEB.setTextWithoutClear(inputOrderCase, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCaseSkuRmsBr).sendKeys("2");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

        //Orders -> Supplier PO Order Qty order
        // Qty
        informarPOQty("2");
        Thread.sleep(2000);
        // Refresh
        driverWEB.click("(//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh'])[1]");
        Thread.sleep(7000);

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
        // Scroll Right
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
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(2000);

        //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
        driverWEB.click(selecionarLinhaPo);
        Thread.sleep(6000);

//        //clic clusterGuideShop
//        driverWEB.waitObject(clusterGuideShop, 30);
//        driverWEB.click(clusterGuideShop);
//        Thread.sleep(7000);
//
//        //clic clusterAER
//        //((SeleniumRobotsTool) driverWEB).waitElementClickable(clusterAER,20);
//        driverWEB.click(clusterGuideShopText);
//        Thread.sleep(2000);
//        driverWEB.waitObject(clusterAER, 30);
//        driverWEB.click(clusterAER);
//
//        Thread.sleep(4000);
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");

//        //clic clusterSPO
//        Thread.sleep(2000);
//        driverWEB.waitObject(clusterSPO, 50);
//        driverWEB.click(clusterSPO);
//        ((SeleniumRobotsTool) driverWEB).setText(clusterSPOInput, "P");
//        driverWEB.click(clusterSPOText);
//        Thread.sleep(5000);
//
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(3000);
//        //clic clusterW
//        driverWEB.click(clusterW);
//        Thread.sleep(2000);
//
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        Thread.sleep(2000);
//
//        //locationList = 239097
//        driverWEB.waitObject(locationList, 50);
//        driverWEB.click(locationList);
//        ((SeleniumRobotsTool) driverWEB).setText(locationListInput, "239097");
//        driverWEB.click(locationListText);
//        Thread.sleep(5000);
//
//        //distributionRoles = #Buffer e #PC
//        driverWEB.waitObject(distributionRoles, 50);
//        driverWEB.click(distributionRoles);
//        Thread.sleep(4000);
//        ((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput, "#Buffer");
//        Thread.sleep(3000);
//        ((SeleniumRobotsTool) driverWEB).click("//input[@value='RNR_DistributionRules:#Buffer']");
//        driverWEB.click(distributionRolesText);
//        Thread.sleep(2000);
//
//        //distributionRoles = #Buffer e #PC
//        driverWEB.waitObject(distributionRoles, 50);
//        driverWEB.click(distributionRoles);
//        Thread.sleep(4000);
//        ((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput, "#PC");
//        Thread.sleep(3000);
//        ((SeleniumRobotsTool) driverWEB).click("//input[@value='RNR_DistributionRules:#PC']");
//        driverWEB.click(distributionRolesText);
//        Thread.sleep(2000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(1000);

        // Scroll Right
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
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
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
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
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(4000);

        // Clic Crea Sample BR PACK
        Thread.sleep(2000);
        driverWEB.waitObject(creaSampleText, 8);
        driverWEB.click(clicCreaSampleSku);

        // Yes Clic Crea Sample
        Thread.sleep(4000);
        driverWEB.click(clicCreaSampleYes);
        Thread.sleep(4000);

        // Refresh
        driverWEB.click("(//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh'])[1]");
        Thread.sleep(8000);

        // Refresh
        driverWEB.click("(//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh'])[1]");
        Thread.sleep(8000);


        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(8000);

        // Submitted
        driverWEB.waitObject(statePo, 10);
        driverWEB.click(statePo);
        driverWEB.waitObject(statePo, 10);
        driverWEB.clearField(inputStatePo);
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("");
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputStatePo).sendKeys("Submitted");
        Thread.sleep(3000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("(//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh'])[1]");
        Thread.sleep(7000);

        // Validar PO e Aprovar PO com Amostra
        validarAprovacaoDoPedido();
        Thread.sleep(2000);

    }

    //Criacao PO Br PACK Com Amostra
    public void CriarPOBrPackComAmostra(String itemPaiCode) throws Exception {


        // Code ItemPaiCode
        addLog(scenario, "Etapa: Selecionar Code");
        driverWEB.ScrollToObject(codeText);
        // Botao Refresh
        driverWEB.click(botaoRefreshSupplierPO);
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

        // Color Specification, Add Colorway para PO
        driverWEB.waitObject(selectColorway, 5);
        driverWEB.click(selectColorway);
        Thread.sleep(4000);

        // Finish
        driverWEB.waitObject(finish, 5);
        driverWEB.click(finish);
        Thread.sleep(5000);

        // Select Viewer Renner PO Nacional
        selecionarViewerRennerNacional("Renner PO Nacional");
        Thread.sleep(7000);

        // Refresh
        Thread.sleep(2000);
        driverWEB.click("(//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh'])[1]");
        Thread.sleep(7000);

        // Year
        Thread.sleep(1000);
        year();
        Thread.sleep(2000);

        //Commercial Week:
        Thread.sleep(1000);
        informarCommercialWeek("52");
        Thread.sleep(2000);

        //WarehouseStore
        Thread.sleep(1000);
        informarWarehouseStore("CDD CENTRO DE DISTRIBUICAO SAO JOSE 324");
        Thread.sleep(6000);

        //PO Model Supplier
        Thread.sleep(4000);
        informarPOModel("RMS BR");
        Thread.sleep(1000);

        // PO Type
        //driverWEB.click(poType);
        //driverWEB.setTextWithoutClear(poTypeInput, "Normal");
        //((SeleniumRobotsTool)driverWEB).getElement(poTypeInput).sendKeys("Normal");
        //Thread.sleep(1000);
        //driverWEB.click(poTypeText);
        //Thread.sleep(2000);

        // Não validar OTB
        Thread.sleep(1000);
        driverWEB.click(naoValidarOtb);
        Thread.sleep(1000);

        //Factory
        //driverWEB.click(poFactory);
        //driverWEB.setTextWithoutClear(inputBrValorFactory, "BRENDISOL TRADING S.A. - 101281");
        //((SeleniumRobotsTool)driverWEB).getElement(inputBrValorFactory).sendKeys("BRENDISOL TRADING S.A. - 101281");
        //Thread.sleep(1000);
        //driverWEB.click(poFactoryText);
        //Thread.sleep(4000);

        // Refresh
        driverWEB.click("(//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh'])[1]");
        Thread.sleep(5000);

        //Scroll down
        driverWEB.click(orderCaseText);
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
        Thread.sleep(2000);

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
        ((SeleniumRobotsTool) driverWEB).getElement(inputOrderCase).sendKeys("10");
        Thread.sleep(2000);

        // Clic Order Case Text pg
        driverWEB.click(orderCaseText);
        Thread.sleep(2000);

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
        Thread.sleep(2000);
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
        //driverWEB.waitObject(selectCampoPP,20);

        Thread.sleep(2000);
        driverWEB.waitObject(inputValorppcolorway, 20);
        // Insert valor no campo PP
        //driverWEB.setTextWithoutClear(inputValorppcolorway, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorppcolorway).sendKeys("2");
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
        //driverWEB.waitObject(selectCampoP,20);
        Thread.sleep(2000);
        // XPath
        driverWEB.waitObject(inputValorpcolorway, 20);
        // Insert valor no campo P
        //driverWEB.setTextWithoutClear(inputValorpcolorway, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorpcolorway).sendKeys("2");
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
        //driverWEB.waitObject(selectCampoM,20);
        Thread.sleep(2000);
        // XPath
        driverWEB.waitObject(inputValormcolorway, 20);
        // Insert valor no campo M
        //driverWEB.setTextWithoutClear(inputValormcolorway, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValormcolorway).sendKeys("2");
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
        //driverWEB.waitObject(selectCampoG,20);

        Thread.sleep(2000);
        // XPath
        driverWEB.waitObject(inputValorgcolorway, 20);
        // Insert valor no campo G
        //driverWEB.setTextWithoutClear(inputValorgcolorway, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputValorgcolorway).sendKeys("4");
        Thread.sleep(2000);
        // Clic G Text pg
        driverWEB.click(gText);
        Thread.sleep(2000);

        //Orders -> Supplier PO Order Qty order
        // Pack Qty
        informarPOPackQty("1000");
        Thread.sleep(2000);

        // Selecionar Linha
        addLog(scenario, "Etapa: Selecionar Linha PO");
        //((SeleniumRobotsTool) driverWEB).waitElementClickable(selecionarLinhaPo,40);
        driverWEB.click(selecionarLinhaPo);
        Thread.sleep(3000);

//        //clic clusterGuideShop
//        driverWEB.waitObject(clusterGuideShop, 30);
//        driverWEB.click(clusterSelecionarLinhaText);
//        driverWEB.click(clusterGuideShop);
//        Thread.sleep(7000);

//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);

//        //clic clusterAER
//        driverWEB.click(clusterGuideShopText);
//        Thread.sleep(2000);
//        driverWEB.waitObject(clusterAER, 30);
//        driverWEB.click(clusterSelecionarLinhaText);
//        driverWEB.click(clusterAER);
//        Thread.sleep(4000);
//
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);
//
//        //clic clusterSPO
//        driverWEB.waitObject(clusterSPO, 5);
//        driverWEB.click(clusterSPO);
//        ((SeleniumRobotsTool) driverWEB).setText(clusterSPOInput, "P");
//        driverWEB.click(clusterSPOText);
//        Thread.sleep(2000);

//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']"); Thread.sleep(1000);
//        //clic clusterW
//        driverWEB.click(clusterW);
//        Thread.sleep(2000);
//
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
//        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");Thread.sleep(1000);
//
//        //locationList = 239097
//        driverWEB.waitObject(locationList, 50);
//        driverWEB.click(locationList);
//        ((SeleniumRobotsTool) driverWEB).setText(locationListInput, "239097");
//        driverWEB.click(locationListText);
//        Thread.sleep(2000);
//
//        //distributionRoles = #Buffer e #PC
//        driverWEB.waitObject(distributionRoles, 50);
//        driverWEB.click(distributionRoles);
//        Thread.sleep(4000);
//        ((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput, "#Buffer");
//        Thread.sleep(3000);
//        ((SeleniumRobotsTool) driverWEB).click("//input[@value='RNR_DistributionRules:#Buffer']");
//        driverWEB.click(distributionRolesText);
//        Thread.sleep(4000);
//
//        //distributionRoles = #Buffer e #PC
//        driverWEB.waitObject(distributionRoles, 50);
//        driverWEB.click(distributionRoles);
//        Thread.sleep(4000);
//        ((SeleniumRobotsTool) driverWEB).setText(distributionRolesInput, "#PC");
//        Thread.sleep(3000);
//        ((SeleniumRobotsTool) driverWEB).click("//input[@value='RNR_DistributionRules:#PC']");
//        driverWEB.click(distributionRolesText);
//        Thread.sleep(5000);

        // Scroll Right
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
        Thread.sleep(1000);
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
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
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
        Thread.sleep(1000);

        // Clic Crea Sample BR PACK
        Thread.sleep(2000);
        driverWEB.waitObject(creaSampleText, 8);
        driverWEB.click(clicCreaSampleBRPachNew);

        // Yes Clic Crea Sample
        Thread.sleep(4000);
        driverWEB.click(clicCreaSampleYes);
        Thread.sleep(12000);

        // Refresh
        driverWEB.click("(//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh'])[1]");
        Thread.sleep(5000);

        // Refresh
        driverWEB.click("(//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh'])[1]");
        Thread.sleep(5000);

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
        Thread.sleep(4000);
        driverWEB.click("//div[contains(text(),'Integration Status')]");
        Thread.sleep(6000);

        // Refresh
        driverWEB.click("(//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh'])[1]");
        Thread.sleep(5000);

        // Validar PO e Aprovar PO com Amostra
        validarAprovacaoDoPedido();
        Thread.sleep(4000);

    }

    // Approved PO
    public void aprovarPedido() throws Exception {

        // Assert (RMS PO Code) true ??
        Thread.sleep(3000);
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

        //Sample integrada com sucesso

        // Clic Sample Order
        Thread.sleep(2000);
        //driverWEB.click(clicSampleOrder);
        Thread.sleep(3000);

        // Properties RMS Code
        String expectPropertiesRMSCode = driver.findElement(By.xpath(propertiesCodeText)).getText();
        // Properties Integration Status
        String expectPropertiesSample = driver.findElement(By.xpath(propertiesSampleText)).getText();
        // Properties Status RMS
        String expectPropertiesItemPai = driver.findElement(By.xpath(propertiesItemPaiText)).getText();
        // Properties RMS SKU ID
        String expectPropertiesRmsSkuID = driver.findElement(By.xpath(propertiesRmsSkuIDText)).getText();

        if (driver.findElement(By.xpath(propertiesCodeText)).getText().isEmpty() == false) {

            if (expectPropertiesRMSCode.length() != 0) {
                // Write Log Report
                addLog(scenario, "RMS PO Code:" + expectRMSPOCode);
                addLog(scenario, "Data:" + data);
                addLog(scenario, "Hora:" + hora);
                // Write Log ReportProperties
                addLog(scenario, "Properties RMS Code:" + expectPropertiesRMSCode);
                addLog(scenario, "Properties Sample:" + expectPropertiesSample);
                addLog(scenario, "Properties Item Pai:" + expectPropertiesItemPai);
                addLog(scenario, "Properties RMS SKU ID:" + expectPropertiesRmsSkuID);
                Thread.sleep(4000);
                // F5 page
                ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
                //((SeleniumRobotsTool)driverWEB).refreshPage();
                Thread.sleep(4000);

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

    // PO
    private void validarAprovacaoDoPedido() throws Exception {

        // Botao Refresh
        Thread.sleep(16000);
        driverWEB.click(clicRefreshSupplierPO);
        Thread.sleep(16000);
        driverWEB.click(clicRefreshSupplierPO);
        Thread.sleep(16000);
        driverWEB.click(clicRefreshSupplierPO);
        Thread.sleep(16000);
        driverWEB.click(clicRefreshSupplierPO);
        Thread.sleep(16000);
        driverWEB.click(clicRefreshSupplierPO);
        // Assert (Integration Status) Sucessful
        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        // Pega valor do campo RMS PO Code
        String expectSupplierPO = driver.findElement(By.xpath(supplierPO)).getText();

        Thread.sleep(5000);
        driverWEB.click(clicRefreshSupplierPO);
        Thread.sleep(7000);

        // RMS Integrantion Status
        String expectIntegrationStatus = driver.findElement(By.xpath(integrationStatusValorText)).getText();

        // Date
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

        //  Integration Status igual Error
        if (expectIntegrationStatus.equals("Error")) {
            //clicar nas aba Issues
            Thread.sleep(3000);
            //driverWEB.waitObject(abaIssues, 10);
            //driverWEB.click(abaIssues);
            Thread.sleep(1000);
            // Copiar texto do erro
            String expectError = driver.findElement(By.xpath(commentIssuesError)).getText();
            addLog(scenario, "Integration Status:" + expectIntegrationStatus);
            addLog(scenario, "Supplier PO:" + expectSupplierPO);
            addLog(scenario, "Data:" + data);
            addLog(scenario, "Hora:" + hora);
            Thread.sleep(16000);
        }
        if (expectIntegrationStatus.equals("Submit")) {
            //clicar nas aba Issues
            //driverWEB.waitObject(abaIssues, 10);
            //driverWEB.click(abaIssues);
            //Thread.sleep(1000);
            // Copiar texto do erro
            addLog(scenario, "Integration Status:" + expectIntegrationStatus);
            addLog(scenario, "Supplier PO:" + expectSupplierPO);
            addLog(scenario, "Data:" + data);
            addLog(scenario, "Hora:" + hora);
            Thread.sleep(8000);
        }
        if (expectIntegrationStatus.equals("Successful")) {

            Thread.sleep(3000);
            // RMS PO Code
            String expectRMSPOCode = driver.findElement(By.xpath(rmsPoCodeValor)).getText();

            // Clic Sample Order
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
            driverWEB.click("//*[@data-dojo-attach-point='incrementButton']");
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
            driverWEB.click(clicSampleOrder);
            Thread.sleep(3000);

            // Properties RMS Code
            String expectPropertiesCode = driver.findElement(By.xpath(propertiesCodeText)).getText();
            // Properties Integration Status
            String expectPropertiesSample = driver.findElement(By.xpath(propertiesSampleText)).getText();
            // Properties Status RMS
            String expectPropertiesItemPai = driver.findElement(By.xpath(propertiesItemPaiText)).getText();
            // Properties RMS SKU ID
            String expectPropertiesRmsSkuID = driver.findElement(By.xpath(propertiesRmsSkuIDText)).getText();

            if (driver.findElement(By.xpath(propertiesCodeText)).getText().isEmpty() == false) {
                // Test RMS PO Code
                //if (expectPropertiesRMSCode.length() != 0)            {

                // Write Log Report
                addLog(scenario, "Sample:" + expectPropertiesSample);
                addLog(scenario, "Supplier PO:" + expectSupplierPO);
                addLog(scenario, "RMS PO Code:" + expectRMSPOCode);
                addLog(scenario, "Data:" + data);
                addLog(scenario, "Hora:" + hora);
                // Write Log ReportProperties
                addLog(scenario, "Properties RMS Code:" + expectPropertiesCode);
                addLog(scenario, "Properties Sample:" + expectPropertiesSample);
                addLog(scenario, "Properties Item Pai:" + expectPropertiesItemPai);
                addLog(scenario, "Properties RMS SKU ID:" + expectPropertiesRmsSkuID);

                Thread.sleep(4000);
                // F5 page
                ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
                //((SeleniumRobotsTool)driverWEB).refreshPage();


            }

        }
    }
}