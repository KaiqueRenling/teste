package br.com.plm.mdm.pages.PLM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static br.com.plm.mdm.steps.Common.driverWEB;

public class CriarPedidoPage {

    // Begin Criar PO Nacional SKU New
    public String abaSourcingNew = "//*[@data-csi-tab-name='Sourcing']";
    public String botaoNewSupplierPONew = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'New Supplier PO')]";
    public String inputSupplierPONew = "//input[@id='uniqName_69_0']";
    public String botaoSaveGoNew = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save & Go']";
    public String botaoActionNewStyleSKUsOrderNew = "//*[@data-csi-automation='placeholder-PurchasedOrder-Orders-ActionsNew']";

    public String selectItemSKUNew = "(//input[@role='checkbox'])[7]";
    public String textIntegrationStatus = "//*[@class='csi-table-header-content' and text()='Integration Status']";
    public String textDescription = "//*[@class='csi-table-header-content' and text()='Description']";
    public String clicIntegrationStatus = "//span[@data-csi-automation='filter-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";
    public String clicCode = "//span[@class='csi-table-header-content' and text()='Code']";
    // Code
    public String codeText = "//*[@class='csi-table-header-content' and text()='Code']";
    public String campoCode = "//span[@data-csi-automation='filter-Collection-Styles-Node Name']//span[@role='button']";
    public String inputCode = "//div/div/div[3]/input[@data-csi-automation='values-Collection-Styles-Node Name']";

    public String codeSelecao = "//div[@title='Click to add this item to the list']//div[@role='presentation']";
    public String copyStattePO = "//*[contains(text(),'State PO')]";

    public String clicPoBrPack = "//td[@class='attrString']//a[@class='browse']";

    public String clicCampoCode="//td[@data-csi-heading='Node Name::0']//a[@class='browse']";

    public String integrationStatusInput = "(//input[@role='textbox'])[8]";

    // Refresh
    public String refreshPedidoPackSplit = "//span[@data-csi-automation='plugin-Collection-Styles-refresh']//span[@title='Refresh View']";

    // Refresh
    public String refreshPedidoPackRmsbr = "//span[@data-csi-automation='plugin-Collection-Styles-refresh']//span[@title='Refresh View']";

    // Viewer PO Importada
    public String viewRennerNacional = "//div[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect']/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@aria-autocomplete='both']";

    public String abaSourcing = "//*[@data-csi-tab-name='Sourcing']";

    public String abaPOs="//*[@data-csi-tab-name='POs']";

    public String copyCampoSupplierPOAll = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[4]/div/div/div[5]/div/div[1]/div[1]/table/thead/tr[2]/th[5]/span/span/span";
    public String copySupplierPOInput = "//input[@data-csi-automation='values-Product-PurchasedOrders-Node Name']";

    public String naoValidarOtbNacional = "//div[@data-csi-act='RNR_PurchasedOrder_OTBException_boolean::0']";

    // Aba SUpplier POs
    public String abaSupplierPOs="//*[@data-csi-tab-name='Supplier POs']";

    // Clic New Supplier PO
    public String newSupplierPO = "//div[@class='dijitReset dijitInline dijitButtonText' and text()='New Supplier PO']";

    // Clic Pack
    public String selectPack="//*[@data-csi-automation='field-PurchasedOrder-Form-OrdersByColor']";

    public String selectSku = "//tbody/tr[2]/td[1]/div[1]/input[1]";
    public String selectSku1 = "//tbody/tr[1]/td[1]/div[1]/input[1]";
    public String selectSku2 = "//tbody/tr[7]/td[1]/div[1]/input[1]";
    public String selectSku3 = "//tbody/tr[12]/td[1]/div[1]/input[1]";
    // Clic Next
    public String clicNext="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Next']";
    //public String selectColorway1 = "//tbody/tr[1]/td[1]/div[1]/input[1]";
    public String selectColorway1 = "//td[contains(@class,'csi-table-selection-column noexport firstColumn')]//input[contains(@role,'checkbox')]";
    public String selectColorway2 = "//tbody/tr[2]/td[1]/div[1]/input[1]";
    // Finish
    public String finish ="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Finish']";

    public String btnRefreshPo = "//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']";
    public String botaoActionNewSupplierPO = "//*[@data-csi-automation='plugin-LibSourcing-PurchasedOrders-ToolbarNewActions']";
    public String botaoNewSupplierPO = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'New Supplier PO')]";

    public String inputSupplierPO = "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div[1]/div/div[3]/input[1]";
    public String botaoSaveGo = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save & Go']";
    public String botaoSave = "//*[@data-csi-act='Save']";

    // page worksheet PO
    public String selectPo = "(//a[contains(@class,'browse')])[2]";

    public String botaoAction = "//*[@class='dijitReset dijitInline dijitIcon material-icons' and text()='add']";
    public String botaoActionNewStyleSKUsOrder = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='New Style SKUs Order...']";

    // Select PO SKU
    public String selectPOSKU="(//a[contains(@class,'browse')])[2]";
    // Viewer Renner
    public String viewrRennerPoBrPack = "//*[@data-csi-automation='plugin-Collection-Styles-CustomViewSelect' and @data-csi-act='CustomViewSelect']";
    public String viewersRenner = "//*[@data-csi-automation='plugin-Collection-Styles-CustomViewSelect' and @data-csi-act='CustomViewSelect']";
    public String selectViewsRenner = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[3]/input[1]";

    public String inputSelectViewerPoBrPack = "//div[@data-csi-automation='plugin-Collection-Styles-CustomViewSelect']//div//input[@role='textbox']";
    public String code = "//span[@data-csi-automation='filter-BasePurchaseOrder-OrderSelectSKUs-Node Name:Child:Style']";
    public String codeAll = "//span[@data-csi-automation='filter-BasePurchaseOrder-OrderSelectColorways-Node Name:Child:Style']";

    public String codePack = "//*[@data-csi-automation='filter-BasePurchaseOrder-OrderSelectColorways-Node Name:Child:Style']";
    public String inputValueCode = "//div//input[@data-csi-automation='values-BasePurchaseOrder-OrderSelectColorways-Node Name:Child:Style']";
    public String codePackText = "//th[@class='csi-table-sort']//div//span[contains(text(),'Code')]";
    public String selectNewItemPack = "//div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/input[1]";

    public String codeSku = "//*[@data-csi-automation='filter-BasePurchaseOrder-OrderSelectSKUs-Node Name:Child:Style']";
    public String inputValueCodeSku= "//div//input[@data-csi-automation='values-BasePurchaseOrder-OrderSelectSKUs-Node Name:Child:Style']";
    public String codeSkuText = "//th[@class='csi-table-sort']//div//span[contains(text(),'Code')]";
    public String selectNewItemSku = "//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr[1]/td[1]/div/input";
    public String valueCodeImportado = "//input[@data-csi-automation='values-BasePurchaseOrder-OrderSelectSKUs-Node Name:Child:Style']";
    public String valueCode = "//input[@data-csi-automation='values-BasePurchaseOrder-OrderSelectSKUs-Node Name:Child:Style']";
    // Select item SKU
    public String selectItemSku ="//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr[3]/td[1]/div/input";


    // Pack
    public String codeColorway = "//span[@data-csi-automation='filter-BasePurchaseOrder-OrderSelectColorways-Node Name:Child:Style']";
    public String valueCodeNewColorwaysOrder = "//input[@data-csi-automation='values-BasePurchaseOrder-OrderSelectColorways-Node Name:Child:Style']";

    // Salvar New StyleSKU order (Nacional,Importada e Split)
    public String botaoSalvarNewStyleSKUorder = "//*[@data-csi-act='Save']";
    public String textCode = "//*[@class='csi-table-header-content' and text()='Code']";
    public String botaoRefreshSupplierPO = "//*[@data-csi-automation='plugin-Collection-Styles-refresh']";

    public String botaoRefreshviewPO = "//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']";

    public String botaoScrollRight ="//*[@data-dojo-attach-point='incrementButton']";
    public String poVinculada = "//td[@class='attrString attrStringURL']//a[@target='_blank']";


    //Select New Style SKU order
    public String newStyleSkuOrder = "/html/body/div[12]/div[2]/div/div[4]/div/div/table/tbody[2]/tr[4]/td[1]/div";
    public String viewRenner = "//*[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect' and @data-csi-act='CustomViewSelect']";
    //Viewer New
    public String viewerRennerNew = "//*[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect' and @data-csi-act='CustomViewSelect']";
    public String selectViewRenner = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div[3]/input[1]";

    // Supplier PO Order Origin Nacional
    public String orderOriginText = "//*[@class='csiHeadingCellLabel' and text()='Order Origin']";
    public String orderOrigin = "//*[@data-csi-act='RNR_PurchasedOrder_Origin_ref::0']";
    //SKU
    public String orderOriginInput = "(//input[@role='textbox'])[8]";
    //LATAM
    public String orderOriginLatamInput = "(//input[@role='textbox'])[9]";


    // Supplier PO Year (Nacional)
    public String yearText = "//*[@class='csiHeadingCellLabel' and text()='Year']";
    public String year = "//*[contains(@class, 'attrEnum attrEnumSeasonStatus iconEditable') and contains(@data-csi-act, 'RNR_PurchasedOrder_Year_enum::0')]";
    public String yearPack = "//*[@data-csi-act='RNR_PurchasedOrder_Year_enum::0']";
    public String YearInput = "//div/div[1]/div/div/div/div[3]/input[@class='dijitReset dijitInputInner']";
    public String YearPackInput = "(//input[@role='textbox'])[8]";
    public String YearPackLatamInput = "(//input[@role='textbox'])[9]";

    // Year
    public String yearNew = "//*[@data-csi-act='RNR_PurchasedOrder_Year_enum::0']";
    public String YearInputNew = "(//input[@role='textbox'])[8]";

    // Supplier PO Year (Importada)
    public String yearImportada = "//*[@data-csi-act='RNR_PurchasedOrder_Year_enum::0']";
    public String inputValorYearImportada = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Year_enum:']//div//input[@aria-autocomplete='both']";

    public String inputYearLatamPackImportada = "(//input[@role='textbox'])[9]";

    // Supplier Po Commercial Week (Nacional)
    public String commercialWeekText = "//*[@class='csiHeadingCellLabel' and text()='Commercial Week']";
    public String commercialWeek="//*[@data-csi-act='RNR_PurchasedOrder_SemanaComercial_enum::0']";

    public String commercialWeekPack="//*[@data-csi-act='RNR_PurchasedOrder_SemanaComercial_enum::0']";
    public String commercialWeekInput = "(//input[@role='textbox'])[8]";

    public String commercialWeekInputImportado = "(//input[@role='textbox'])[9]";
    public String commercialWeekInputImportadoSku = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_SemanaComercial_enum:']//div//input[@aria-autocomplete='both']";

    // Supplier Po Commercial Week (Importada)
    public String commercialWeekImportadaText = "//*[@class='csiHeadingCellLabel' and text()='Commercial Week']";
    public String commercialWeekImportada = "//*[@data-csi-act='RNR_PurchasedOrder_SemanaComercial_enum::0']";
    public String inputValorCommercialWeekImportada = "//div[@role='presentation']//div//div//div//input[@aria-autocomplete='both']";

    // Location Type PO Importada e Split
    public String locationTypeText = "//*[@class='csiHeadingCellLabel' and text()='Location Type']";
    public String locationType = "//*[@data-csi-act='RNR_Purchaseorder_Locationtype_enum::0']";
    public String inputLocationType = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_Purchaseorder_Locationtype_enum:']//input[@role='textbox']";

    public String WarehouseStoreText = "//div[contains(text(), 'Warehouse/Store')]";
    public String POTypePack = "//*[@data-csi-act='RNR_PurchasedOrder_Rmspotype_enum::0']";
    //public String inputValorLocationType = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Year_enum:']//div//input[@aria-autocomplete='both']";

    public String inputValorPOTypeLatamPack = "(//input[@role='textbox'])[9]";

    // Supplier PO Warehouse/Store
    public String warehouseStoreText = "//*[@class='csiHeadingCellLabel' and text()='Warehouse/Store']";
    public String warehouseStore="//td[@data-csi-act='RNR_PurchasedOrder_Location_enum::0']";
    public String warehouseStoreImportado ="//*[@data-csi-act='RNR_PurchasedOrder_Location_enum::0']";

    public String warehouseStorePack="//*[@data-csi-act='RNR_PurchasedOrder_Location_enum::0']";
    public String warehouseStorePackImportadoRMSBR = "//*[@data-csi-heading='RNR_PurchasedOrder_Location_enum::0']";
    public String inputValorWarehouseStore = "(//input[@role='textbox'])[8]";
    public String inputValorWarehouseStoreImportado = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Year_enum:']//div//input[@aria-autocomplete='both']";
    public String inputValorWarehouseStoreImportadoSku = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Location_enum:']//div//input[@aria-autocomplete='both']";

    public String inputValorWarehouseStoreImportadoPack = "//div[@role='presentation']//div//div//div//input[@aria-autocomplete='both']";

    // Supplier PO Type (Importada)
    public String poTypeImportadaText = "//*[@class='csiHeadingCellLabel' and text()='PO Type']";
    public String poTypeImportada = "//*[@data-csi-act='RNR_PurchasedOrder_Rmspotype_enum::0']";
    public String inputValorPOTypeImportada = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Year_enum:']//div//input[@aria-autocomplete='both']";

    public String inputValorPOTypeImportadaSku = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Rmspotype_enum:']//div//input[@aria-autocomplete='both']";

    // Supplier PO Type (Nacional)
    public String poTypeNacionalText = "//*[@class='csiHeadingCellLabel' and text()='PO Type']";
    public String poTypeNacional = "//*[contains(@class, 'attrEnum attrEnumWbsElement.ScheduleStatus iconEditable') and contains(@data-csi-act, 'RNR_PurchasedOrder_Rmspotype_enum::0')]";
    public String inputValorPOTypeNacional = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Year_enum:']//div//input[@aria-autocomplete='both']";


    // Supplier PO Warehouse/Store (Importada)
    public String warehouseStoreImportadaText = "//*[@class='csiHeadingCellLabel' and text()='Warehouse/Store']";
    public String warehouseStoreImportada = "//*[contains(@class, 'attrEnum attrEnumWbsElement.ScheduleStatus iconEditable') and contains(@data-csi-act, 'RNR_PurchasedOrder_Location_enum::0')]";
    public String inputValorWarehouseStoreImportada = "(//input[@role='textbox'])[9]";

    // Supplier PO PO/Model (Nacional)
    public String poModelText = "//*[contains(text(),'PO Model')]";
    public String poModel = "//*[@data-csi-act='RNR_PurchasedOrder_TipoPO_enum::0']";
    public String poModelPack = "//*[@data-csi-act='RNR_PurchasedOrder_TipoPO_enum::0']";
    public String inputValorPoModel = "(//input[@role='textbox'])[8]";
    public String inputValorPoModelImportado = "(//input[@role='textbox'])[9]";
    // Não validar OTB
    public String naoValidarOtb="//div[@data-csi-act='RNR_PurchasedOrder_OTBException_boolean::0']";

    public String naoValidarOtbPack = "(//input[@role='checkbox'])[2]";

    // Factory
    public String poFactoryText = "//*[@class='csiHeadingCellLabel' and text()='Factory']";
    public String poFactory = "//*[@data-csi-act='POFactory::0']";
    public String inputValorFactory = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-POFactory:']//div//input[@aria-autocomplete='both']";
    public String inputValorFactoryLatamPack = "(//input[@role='textbox'])[9]";


    public String inputValorFactorySku = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-POFactory:']//div//input[@aria-autocomplete='both']";

    public String inputValorFactoryPack= "//div[@role='presentation']//div//div//div//input[@aria-autocomplete='both']";

    // Supplier PO PO/Model (Importada)
    public String poModelImportadaText = "//*[@class='csiHeadingCellLabel' and text()='PO Model']";
    public String poModelImportada = "//*[contains(@class, 'attrEnum attrEnumWbsElement.ScheduleStatus iconEditable') and contains(@data-csi-act, 'RNR_PurchasedOrder_TipoPO_enum::0')]";
    public String inputValorPoModelImportada = "//div/div[1]/div/div/div/div[3]/input[@class='dijitReset dijitInputInner']";
    //public String inputValorPoModelImportada = "/html/body/div[12]/div/div[1]/div/div/div/div[3]/input[@class='dijitReset dijitInputInner']";

    //Modal: Air PO Importada
    public String poModelAirText = "//*[@class='csiHeadingCellLabel' and text()='Modal']";
    public String poModelAir = "//*[@data-csi-act='RNR_PurchasedOrder_Modal_enum::0']";

    public String poModelAirPack = "//*[@data-csi-act='RNR_PurchasedOrder_Modal_enum::0']";
    public String inputValorPoModelAir = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Modal_enum:']//div//input[@aria-autocomplete='both']";
    public String inputValorPoModelAirLatamPack = "(//input[@role='textbox'])[9]";

    public String inputValorPoModelAirSku = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Modal_enum:']//div//input[@aria-autocomplete='both']";

    public String inputPOModalTest = "//div[@data-csi-automation=\"edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Modal_enum:\"]//input[@data-dojo-attach-point=\"textbox,focusNode\"]";

    public String inputValorPoModelAirPack = "//div[@role='presentation']//div//div//div//input[@aria-autocomplete='both']";

    //External Local: SHANGAI-CHINA PO Importada
    public String poExternalLocalText = "//*[@class='csiHeadingCellLabel' and text()='External Local']";
    //public String poExternalLocal = "//*[contains(@class, 'attrEnum attrEnumRNR_Year iconEditable') and contains(@data-csi-act, 'RNR_PurchasedOrder_LocalExterno_enum::0')]";
    public String poExternalLocal = "//*[@data-csi-act='RNR_PurchasedOrder_LocalExterno_enum::0']";

    public String poExternalLocalPack = "//*[contains(@data-csi-act, 'RNR_PurchasedOrder_LocalExterno_enum::0')]";
    public String inputValorPoExternalLocal = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_LocalExterno_enum:']//div//input[@aria-autocomplete='both']";

    public String inputValorPoExternalLocalLatamPack = "(//input[@role='textbox'])[9]";

    public String inputValorPoExternalLocalSku = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_LocalExterno_enum:']//div//input[@aria-autocomplete='both']";

    public String inputValorPoExternalLocalPack = "//div[@role='presentation']//div//div//div//input[@aria-autocomplete='both']";

    //TRade: Outros PO Importada
    public String poTradeText = "//*[@class='csiHeadingCellLabel' and text()='Trade']";
    public String poTrade = "//*[@data-csi-act='RNR_PurchasedOrder_Trade_enum::0']";

    public String poTradePack = "//*[@data-csi-act='RNR_PurchasedOrder_Trade_enum::0']";
    public String inputValorPoTrade = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Trade_enum:']//div//input[@aria-autocomplete='both']";
    public String inputValorPoTradeLatamPack = "(//input[@role='textbox'])[9]";


    public String inputValorPoTradeSku = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Trade_enum:']//div//input[@aria-autocomplete='both']";

    public String inputValorPoTradePack = "//div[@role='presentation']//div//div//div//input[@aria-autocomplete='both']";

    //Parceiro (FFDD) PO Importada
    public String poParceiroText = "//*[@class='csiHeadingCellLabel' and text()='Parceiro']";
    //public String poParceiro = "//*[contains(@class, 'attrEnum attrEnumRNR_Year iconEditable') and contains(@data-csi-act, 'RNR_PurchasedOrder_Parceiro_enum::0')]";
    public String poParceiro = "//*[@data-csi-act='RNR_PurchasedOrder_Parceiro_enum::0']";

    public String poParceiroPack = "//*[@data-csi-act='RNR_PurchasedOrder_Parceiro_enum::0']";
    public String poFactoryPack="//*[@data-csi-act='POFactory::0']";
    public String inputValorParceiro = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Year_enum:']//div//input[@aria-autocomplete='both']";

    // FFDD Date PO Importada
    public String ffddDateText = "//*[@class='csiHeadingCellLabel' and text()='FFDD Date']";
    public String ffddDate = "//*[@data-csi-act='RNR_PurchasedOrder_FFDD_date::0']";

    //public String ffddDate = "//*[contains(@class, 'attrNumber attrTime iconEditable') and contains(@data-csi-act, 'RNR_PurchasedOrder_FFDD_date::0')]";
    public String inputValorFFDDDate = "(//input[@role='textbox'])[9]";

    //Orders Insert Order Qty > 0
    public String orderQtyText = "//*[@class='csi-table-header-content' and text()='Order Qty']";
    public String orderQty = "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'Quantity::0')]";
    public String inputValorOrderQty = "//div/div[1]/div/div/div/div[2]/div[1]/input";

    // Pack Qty Nacional
    public String packQtyTxt = "//*[@class='sort' and text()='Pack Qty']";
    public String packQTy = "//*[contains(@class, 'dijitReset dijitInputInner') and contains(@value, '2')]";
    public String inputValueOrderQty = "html/body/div[10]/div/div[1]/div/div/div/div[2]/input[@class='dijitReset dijitInputInner']";

    public String selecionarLinhaPo = "//div[@data-csi-act='RNR_Order_SelectLine_boolean::0']//input[@type='checkbox']";
    // Cluster Selecionar Linha
    public String clusterSelecionarLinhaText = "//*[contains(text(),'Selecionar linha')]";

    //clic clusterGuideShop
    public String clusterGuideShop = "//div[@data-csi-act='RNR_Order_ClusterGuide_boolean::0']//input[@role='checkbox']";

    //clic clusterAER
    public String clusterGuideShopText = "//*[contains(text(),'Cluster Guide Shop')]";
    public String clusterAER = "//div[@data-csi-act='RNR_Order_ClusterAer_boolean::0']//input[@type='checkbox']";

    //clic clusterARG
    public String clusterARG = "//td[@data-csi-heading='RNR_Order_ClusterARG_enum::0']";

    public String clusterARGText = "//*[contains(text(),'Cluster ARG')]";

    public String clusterARGInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ClusterARG_enum:']//div//input[@role='textbox']";

    //clic clusterURU
    public String clusterURU = "//td[@data-csi-heading='RNR_Order_ClusterURU_enum::0']";

    public String clusterURUText = "//*[contains(text(),'Cluster URU')]";

    public String clusterURUInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ClusterURU_enum:']//div//input[@role='textbox']";

    // Unit Cust
    public String unitCust = "//*[@data-csi-act='LandedCost::0']";
    public String unitCustInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-LandedCost:']//div//div/input";

    public String unitCustText = "//*[contains(text(),'Unit Cost')]";

    //clic clusterSPO
    public String clusterSPO = "//td[@data-csi-heading='RNR_Order_ClusterSPO_enum::0']";

    public String clusterSPOText = "//*[contains(text(),'Cluster SPO')]";

    public String clusterSPOInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ClusterSPO_enum:']//div//input[@role='textbox']";

    // cluster RIO
    public String clusterRIO = "//td[@data-csi-heading='RNR_Order_ClusterRIO_enum::0']";
    public String clusterRIOInput  = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ClusterRIO_enum:']//div//input[@role='textbox']";
    public String clusterRIOText  = "//*[contains(text(),'Cluster RIO')]";

    // cluster NOR
    public String clusterNOR = "//td[@data-csi-heading='RNR_Order_ClusterNOR_enum::0']";
    public String clusterNORInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ClusterNOR_enum:']//div//input[@role='textbox']";
    public String clusterNORText = "//*[contains(text(),'Cluster NOR')]";

    // Cluster SUL
    public String clusterSUL = "//td[@data-csi-heading='RNR_Order_ClusterSUL_enum::0']";
    public String clusterSULInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ClusterSUL_enum:']//div//input[@role='textbox']";
    public String clusterSULText = "//*[contains(text(),'Cluster SUL')]";

    //clic clusterW
    public String clusterW = "//div[@data-csi-act='RNR_Order_ClusterW_boolean::0']";

    //locationList = 239097
    public String locationList = "//td[@data-csi-heading='RNR_Order_Locationlist_integer::0']";
    public String locationListText ="//*[contains(text(),'Location List')]";
    public String locationListInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_Locationlist_integer:']//div//input[@role='textbox']";

    //distributionRoles = #Buffer e #PC
    public String distributionRoles = "//tr[@data-csi-act='ViewSelect']//td[@data-csi-heading='RNR_Order_DistributionRules_enum::0']";
    public String distributionRolesInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_DistributionRules_enum:']//div//input[@role='textbox']";
    public String distribuitionRolesSelecaoBuffer = "//div[@class='dijitReset dijitMenuItem']//input[@value='RNR_DistributionRules:#Buffer']";
    public String distribuitionRolesSelecaoPC = "//div[@class='dijitReset dijitMenuItem']//input[@value='RNR_DistributionRules:#PC']";

    public String distributionRolesText ="//th//div//div//*[contains(text(),'Distribution Rules')]";

    // Pack Qty
    public String packQtyText="//*[contains(text(),'Pack Qty')]";
    public String packQty= "//*[@data-csi-heading='UnitPerPack::0']";
    public String inputValorPackQty ="//div[@data-csi-automation='edit-PurchasedOrder-Orders-UnitPerPack:']//div//div//input";

    // Order Case
    public String orderCaseText="//*[@class='csi-table-header-content' and text()='Order Case']";
    public String orderCaseIssueFluxoBrSku= "//*[contains(@class, 'attrNumber PastelYellow iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]";
    public String orderCase = "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]";
    public String inputOrderCase="//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_Case_integer:']//div//div//input[@type='text']";
    public String orderCaseSku= "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]";
    public String orderCaseSkuBrSku= "//td[@class='attrNumber iconEditable' and @data-csi-heading='RNR_Order_Case_integer::0']";
    //"//*[contains(@class, 'attrNumber PastelYellow iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]";
    public String inputOrderCaseBrSku="//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_Case_integer:']//div//div//input[@type='text']";


    public String orderCaseSkuRmsBr= "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]";
    public String inputOrderCaseSkuRmsBr="//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_Case_integer:']//div//div//input[@type='text']";

    public String orderCaseImportadoSkuRest = "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]";
    public String inputOrderCaseImportadoSkuRest = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_Case_integer:']//div//div//input[@type='text']";
    public String inputSplitValorPackQty ="/html/body/div[17]/div/div[1]/div/div/div/div[2]/div[1]/input";

    public String valueOrderCase = "//td[@class='attrNumber' and @data-csi-heading='RNR_Order_Case_integer::0']";

    //Valor do Order Qty
    public String valueOrderQty = "(//td[@class='attrNumber' and @data-csi-heading='Quantity::0'])[2]";

    //Valor do Packing Description
    public String valuePackingDescription = "//td[@class='attrString' and @data-csi-heading='RNR_Order_DesEmb_string::0']";


    // Approve Reason
    public String approvalReason = "//*[@data-csi-act='RNR_PurchasedOrder_appreason_enum::0']";
    public String approvalReasonInput = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_appreason_enum:']//div//input[@aria-autocomplete='both']";
    public String approvalReasonText = "//tr[@class='csiHeadingCell csiHeadingCellEditable']//th//div[contains(text(),'Approval Reason')]";

    //EGG
    public String eggText="//*[@class='csi-table-header-content' and text()='EGG']";
    public String inputValoregg ="/html/body/div[17]/div/div[1]/div/div/div/div[2]/div[1]/input[@class='dijitReset dijitInputInner']";

    //U
    public String uText="//*[@class='csi-table-header-content' and text()='U']";
    public String inputValorU ="/html/body/div[18]/div/div[1]/div/div/div/div[2]/div[1]/input";
    public String inputValorPackU ="/html/body/div[19]/div/div[1]/div/div/div/div[2]/div[1]/input";

    //PP
    public String ppText="//*[@class='csi-table-header-content' and text()='PP']";

    public WebElement getClicPPElement() {
        return driverWEB.findElement(By.xpath(clicPP));
    }


    public String clicPP = "//*[@data-csi-heading-vi='0']";
    public String clicP = "//*[@data-csi-heading-vi='1']";
    public String clicM = "//*[@data-csi-heading-vi='2']";
    public String clicG = "//*[@data-csi-heading-vi='3']";



    //public String inputValorpp ="//input[@value='0']";
    public String inputValorpp="//div[@data-csi-automation='edit-PurchasedOrder-Orders-QuantityPerSize:']//div//div//input";
    public String selectCampoPP = "//*[contains(@class, 'attrNumber POProductUnitPerSize iconEditable csi-table-matrix-column-first columns') and contains(@data-csi-act, 'QuantityPerSize::0')]";

    //P
    public String pText="//*[@class='csi-table-header-content' and text()='P']";
    //public String inputValorp ="//input[@value='0']";
    public String inputValorp="//div[@data-csi-automation='edit-PurchasedOrder-Orders-QuantityPerSize:']//div//div//input";

    public String selectCampoP = "//*[contains(@class, 'attrNumber POProductUnitPerSize iconEditable csi-table-matrix-column columns') and contains(@data-csi-act, 'QuantityPerSize::0')]";


    //M
    public String mText="//*[@class='csi-table-header-content' and text()='M']";
    //public String inputValorm ="//input[@value='0']";
    public String inputValorm="//div[@data-csi-automation='edit-PurchasedOrder-Orders-QuantityPerSize:']//div//div//input";

    public String selectCampoM = "//*[@data-csi-automation='edit-PurchasedOrder-Orders-QuantityPerSize:']";

    //G
    public String gText="//*[@class='csi-table-header-content' and text()='G']";
    //public String inputValorg ="//input[@value='0']";
    public String inputValorg="//div[@data-csi-automation='edit-PurchasedOrder-Orders-QuantityPerSize:']//div//div//input";

    public String selectCampoG = "//*[@data-csi-automation= 'edit-PurchasedOrder-Orders-QuantityPerSize:']";

    //GG
    public String clicGG = "//*[@data-csi-heading-vi='4']";

    public String ggText="//*[@class='csi-table-header-content' and text()='GG']";

    public String inputValorgg="//div[@data-csi-automation='edit-PurchasedOrder-Orders-QuantityPerSize:']//div//div//input";

    public String selectCampoGG = "//*[@data-csi-automation= 'edit-PurchasedOrder-Orders-QuantityPerSize:']";
    // PO Split Orders Insert Order Tipo Split
    public String orderTipoSplitText = "//span[contains(text(),'Tipo Split')]";

    public String orderTipoSplit = "(//td[@data-csi-act='RNR_Order_TipoSplit_enum::0'])";
    //td[@class='attrEnum attrEnumRNR_PurchasedOrderState iconEditable actionEdit']
    public String inputValorOrderTipoSplit = "//div[@role='presentation']//div//div//div//input[@aria-autocomplete='both']";
    public String inputValorOrderTipoSplitPack = "//div[@role='presentation']//div//div//div//input[@aria-autocomplete='both']";

    //PO Split Orders Insert Order Valor Split
    public String orderValorSplitText = "//*[@class='csi-table-header-content' and text()='Valor Split']";
    public String orderValorSplit = "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_ValorSplit_integer::0')]";

    //public String inputValorSplit = "/html/body/div[12]/div/div[1]/div/div/div/div[2]/input[@class='dijitReset dijitInputInner']";
    public String inputValorSplit = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ValorSplit_integer:']//div//div//input[@type='text']";

    // State PO
    public String statePOtext = "//div[contains(text(),'Integration Status')]";
    public String statePo="//*[@data-csi-heading='RNR_PurchasedOrder_State_enum::0']";
    public String inputStatePo ="//div//div/div[@role='presentation']/div/div/div/div[3]/input[@aria-autocomplete='both']";

    // Insert Order value to Sales Price
    public String salesPriceText = "//*[@class='sort' and text()='Sales Price']";
    public String inputValorSalesPrice = "/html/body/div[12]/div/div[1]/div/div/div/div[2]/input[@class='dijitReset dijitInputInner'";

    // Clic na --> play_arrow send Validation
    public String playArrowWorkSheet ="/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div/div[2]/span[1]/span";

    // Clic na --> play_arrow send Validation
    public String playArrowValidation = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div/div[4]/span[1]/span";

    // Clic na --> play_arrow send Submitted
    public String playArrowSubmitted = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[1]/div[6]/span/span";

    // RMS PO Code
    public String orderrmsPoCodeText = "//*[@class='csiHeadingCellLabel' and text()='RMS PO Code']";
    public String rmsPoCodeValor = "//*[@data-csi-heading='RNR_PurchasedOrder_RMSCode_string::0']";
    //Supplier PO
    public String supplierPO = "//*[@data-csi-heading='Node Name::0']";

    // Issues
    public String abaIssues = "//*[@data-csi-tab-name='Issues']";

    // XPath
    public String commentIssuesError = "//*[@data-csi-heading='Comment::0']";
    public String integrationStatusValorText = "//*[@data-csi-heading='RNR_PurchasedOrder_Statusintegracion_enum::0']";

    // CLic no Campo Valor Split
    public String orderrmsPoCode = "//*[contains(@class, 'attrString') and contains(@data-csi-heading, 'RNR_PurchasedOrder_RMSCode_string::0')]";

    //Clic na --> PlayArrowClosed send Close
    public String playArrowClosed = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div[1]/div/div[1]/div[8]/span/span";

    ///////////////////////////// Criar pedido a partir de um PO existente ////////////////////////////////////

    public String stateApprovedText = "//*[@class='sort' and text()='State']";
    public String campoStateAll = "//*[@data-csi-automation='filter-LibSourcing-PurchasedOrders-State']";

    public String stateApprovedInput = "//*[@data-csi-automation='values-LibSourcing-PurchasedOrders-State']";
    //Approved
    public String selectLabelApproved = "//*[@id='uniqName_24_2_popup1']";
    //Worksheet
    public String selectLabelWorksheet = "//*[@id='uniqName_24_2_popup2']";

    // data-csi-act="Copy"
    public String btnCopyPO = "//*[@data-csi-act='Copy']";
    public String btnSavePO = "//*[@data-csi-act='Save']";

    // Supplier PO copiar id da PO copiada
    public String SaveCodeSupplierPOCopy = "/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[6]/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[1]/div/div/div[5]/div/div[1]/table/tbody[2]/tr[1]/td[4]";

    // Selecionar PO copiada
    public String campoSupplierPoAll = "//*[@data-csi-automation='filter-LibSourcing-PurchasedOrders-Node Name']";
    public String supplierPOText = "//*[@class='sort tableBorderLeft' and text()='Supplier PO']";
    public String supplierPOInput = "//*[@data-csi-automation='values-LibSourcing-PurchasedOrders-Node Name']";

    // Selecionar PO criada
    public String linkPoCopiada = "/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[6]/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[1]/div/div/div[5]/div/div[1]/table/tbody[2]/tr[2]/td[4]/a";

    public String clicFlexaItem ="//tr[@data-csi-table-state='+']//td[@data-csi-heading='Node Name:']//span//span//span[@class='csiAction csiActionIcon']";

    // Convert PO Pack em SKU
    public String inputCampoOrderConverter = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PO_PackSKU_enum:']//input[@role='textbox']";
    public String campoOrderConverter = "//*[@data-csi-act='RNR_PO_PackSKU_enum::0']";

    public String naoValidarOtbText = "//*[contains(text(),'Não validar OTB?')]";
    public String deleteText = "//span//span[contains(text(),'Delete')]";
    public String deleteClic = "//*[@data-csi-act='Delete']";

    // colorway
    public String corEspecifica = "//*[@class='attrString firstColumn' ]";
    public String selectCorInput = "//tbody/tr[2]/td[1]/div[1]/input[1]";

    public String clicCampoColorway = "//span[@data-csi-automation='filter-Style-ProductSKU-Node Name:Child:RealizedColor']";
    public String inputCampoColorway = "//div[@role='presentation']//div//div//div//input[@data-csi-automation='values-Style-ProductSKU-Node Name:Child:RealizedColor']";
    public String botaoAcaoColorways = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'New from Color Specification')]";

    // begin Old
    public String selectCorInputVar = "(//input[@role='checkbox'])[4]";
    public String selectCorInputVar1 = "(//input[@role='checkbox'])[5]";
    public String selectCorInputVar2 = "(//input[@role='checkbox'])[6]";
    // end Old

    // Campo Code
    public String selectImage="//*[@class='csi-table-header-content' and text()='Image']";
    public String selectTextBox= "//div[@widgetid='dijit_form_CheckBox_30']//input[@tabindex='0']";
    public String selectFirstColumn= "//th[@class='csi-table-selection-column noexport firstColumn']/div";
    public String selectSecondColumn= "//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr/td[1]/div[@role='presentation']/input[@type='checkbox']";
    public String selectThirdColumn= "//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr/td[1]/div[@role='presentation']/input[@type='checkbox']";

    public String clicColorSpecification="//span[@class='csi-table-header-content' and text()='Color Specification']";
    public String getCorEspecifica(String sel_cor){       return corEspecifica.replace("Color Specification:", sel_cor);
    }

    public String botaoSalvarCor = "//span[@data-csi-act='Save']";
    //public String botaoSalvarCor = "//span[@class='dijitReset dijitInline dijitButtonText' and contains(text(),'Save')]";
    public String botaoSalvarCores = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'Save')]";
    public String clusterSul = "//*[@data-csi-act='RNR_ColorwayAttributes_ClusterSUL_enum:Child:Attributes:0']";
    public String clusterSulCombo = "(//input[@role='textbox'])[8]";
    public String infoPlmId = "//td[@data-csi-heading='RNR_StyleAttributes_URLStyle_string:Child:Attributes:0']";

    // variavel para automação com 3 coloways

    public String clusterSulComboVar = "//div/div[@role='presentation']/div/div/div/div[3]/input[@aria-autocomplete='both']";
    public String clusterSulComboVar1= "//div/div[@role='presentation']/div/div/div/div[3]/input[@aria-autocomplete='both']";
    public String clusterSulComboVar2 = "//div/div[@role='presentation']/div/div/div/div[3]/input[@aria-autocomplete='both']";

    // Cluster Arg
    public String clusterArg = "//*[@data-csi-act='RNR_ColorwayAttributes_ClusterARG_enum:Child:Attributes:0']";
    public String clusterArg1 = "//*[@data-csi-act='RNR_ColorwayAttributes_ClusterARG_enum:Child:Attributes:0']";
    public String clusterArg2 = "//*[@data-csi-act='RNR_ColorwayAttributes_ClusterARG_enum:Child:Attributes:0']";
    public String abaColorways = "//*[@data-csi-tab-name='Colorways']";

}

