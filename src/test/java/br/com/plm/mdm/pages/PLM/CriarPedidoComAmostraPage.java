package br.com.plm.mdm.pages.PLM;

public class CriarPedidoComAmostraPage {

    public String sessao ="//*[@class='browse' and contains(text(), 'sessao')]";
    public String divisao ="//*[@class='browse' and text()='divisao']";
    public String grupo ="//*[@class='browse' and text()='grupo']";
    public String subclasse ="//*[@class='browse' and text()='subclasse']";
    public String finish ="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Finish']";

    public String integrationStatusInput = "(//input[@role='textbox'])[8]";
    public String codeText = "//*[@class='csi-table-header-content' and text()='Code']";
    public String campoCode = "//span[@data-csi-automation='filter-Collection-Styles-Node Name']//span[@role='button']";
    public String inputCode = "//div[@role='presentation']//div//div//div//div//input[@data-csi-automation='values-Collection-Styles-Node Name']";
    public String selectColorway = "//tbody/tr[1]/td[1]/div[1]/input[1]";

    public String selectSkuP = "//tbody/tr[2]/td[1]/div[1]/input[1]";
    public String clicCampoCode="(//a[contains(text(), \"BSM_FW23_CCO\") and contains(@class, \"browse\")])[1]";

    // Select Sourcing
    public String abaSourcing="//*[@class='MuiTab-wrapper' and text()='Sourcing']";

    public String inputSupplierPO="//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div[1]/div/div[3]/input[1]";

    // Select POs
    public String abaPOs="//*[@class='MuiTab-wrapper' and text()='POs']";
    public String newSupplierPO = "//div[@class='dijitReset dijitInline dijitButtonText' and text()='New Supplier PO']";
    public String clicNext="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Next']";

    // Select Supplier POs
    public String abaSupplierPOs="//*[@class='MuiTab-wrapper' and contains(text(), 'Supplier POs')]";

    //Btn New Supplier PO
    public String btnNewSupplierPO="//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'New Supplier PO')]";

    public String code = "//span[@data-csi-automation='filter-BasePurchaseOrder-OrderSelectSKUs-Node Name:Child:Style']";
    public String codeColorway= "//span[@data-csi-automation='filter-BasePurchaseOrder-OrderSelectColorways-Node Name:Child:Style']";
    public String codeItemInput="//div[@item='1']";
    public String valueCodePack = "//input[@data-csi-automation='values-BasePurchaseOrder-OrderSelectColorways-Node Name:Child:Style']";
    public String valueCodeSku = "//input[@data-csi-automation='values-BasePurchaseOrder-OrderSelectSKUs-Node Name:Child:Style']";

    // Botao New Supplier PO
    public String textDescription = "//*[@class='csi-table-header-content' and text()='Description']";
    public String clicIntegrationStatus = "//span[@data-csi-automation='filter-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";


    // Select Viewer Renner PO Nacional, Importada e Split
    public String viewRenner = "//div[1]/div[3]/div[1]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div[3]/input[1]";
    public String selectViewRenner = "//*[@aria-autocomplete='both']";

    // Year Supplier PO
    public String yearText = "//*[@class='csiHeadingCellLabel' and text()='Year']";
    public String year = "//*[@data-csi-act='RNR_PurchasedOrder_Year_enum::0']";
    public String YearInput = "(//input[@role='textbox'])[8]";

    // Commercial Week PO
    public String commercialWeekText = "//*[@class='csiHeadingCellLabel' and text()='Commercial Week']";
    public String commercialWeek = "//*[@data-csi-act='RNR_PurchasedOrder_SemanaComercial_enum::0']";
    public String commercialWeekInput = "(//input[@role='textbox'])[8]";

    // Werehouse/Store Supplier PO
    public String warehouseStoreText = "//*[@class='csiHeadingCellLabel' and text()='Warehouse/Store']";
    public String warehouseStore = "//*[@data-csi-act='RNR_PurchasedOrder_Location_enum::0']";
    public String inputValorWarehouseStore = "(//input[@role='textbox'])[8]";

    // Supplier PO PO/Model
    public String poModelText = "//*[@class='csiHeadingCellLabel' and text()='PO Model']";
    public String poModel = "//*[@data-csi-act='RNR_PurchasedOrder_TipoPO_enum::0']";
    public String inputValorPoModel = "(//input[@role='textbox'])[8]";

    // PO Type
    public String poTypeText = "//*[@class='csiHeadingCellLabel' and text()='PO Type']";
    public String poType = "//*[contains(@class, 'attrEnum attrEnumPurchasedOrderState iconEditable') and contains(@data-csi-act, 'RNR_PurchasedOrder_Rmspotype_enum::0')]";
    public String poTypeInput = "(//input[@role='textbox'])[8]";

    // Factory
    public String poFactoryText = "//*[@class='csiHeadingCellLabel' and text()='Factory']";
    public String poFactory = "//*[@data-csi-act='POFactory::0']";
    public String inputBrValorFactory = "(//input[@role='textbox'])[8]";


    //Orders Insert Order Qty > 0
    public String orderQtyText = "//*[@class='csi-table-header-content' and text()='Order Qty']";
    public String orderQty = "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'Quantity::0')]";
    public String inputValorOrderQty = "//div/div[1]/div/div/div/div[2]/div[1]/input";

    //U
    public String u = "//*[contains(@class, 'attrNumber POProductUnitPerSize iconEditable csi-table-matrix-column-first csi-table-matrix-column-last columns') and contains(@data-csi-act, 'QuantityPerSize::0')]";

    //Pack Qty
    public String packQty = "//*[contains(@class, 'dijit dijitReset dijitInline dijitLeft csi-validation-textbox dijitTextBox dijitValidationTextBox') and contains(@data-csi-automation, 'edit-PurchasedOrder-Orders-UnitPerPack:')]";

    // Pack Qty
    public String orderPackQtyText = "//*[@class='csi-table-header-content' and text()='Pack Qty']";
    public String orderPackQty = "//*[contains(@class, 'dijit dijitReset dijitInline dijitLeft csi-validation-textbox dijitTextBox dijitValidationTextBox dijitTextBoxHover dijitValidationTextBoxHover dijitHover') and contains(@data-csi-automation, 'edit-PurchasedOrder-Orders-UnitPerPack:')]";
    public String inputValorPackOrderQty = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-UnitPerPack:']//div//div//input";

    // Não validar OTB
    public String naoValidarOtb="//div[@data-csi-act='RNR_PurchasedOrder_OTBException_boolean::0']";
    public String selectPack = "//div[@data-csi-automation='field-PurchasedOrder-Form-OrdersByColor']/input[@type='checkbox']";

    // Pack Qty Nacional
    public String packQtyTxt = "//*[@class='sort' and text()='Pack Qty']";
    public String packQTy = "//*[contains(@class, 'dijitReset dijitInputInner') and contains(@value, '2')]";
    public String inputValueOrderQty = "html/body/div[10]/div/div[1]/div/div/div/div[2]/input[@class='dijitReset dijitInputInner']";

    // Pack Qty
    public String packQtyText="//*[@class='csi-table-header-content' and text()='Pack Qty']";
    public String packQtyy= "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'UnitPerPack::0')]";
    public String inputValorPackQty ="/html/body/div[12]/div/div[1]/div/div/div/div[2]/input[@class='dijitReset dijitInputInner']";

    // Qty
    public String selectQty = "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'Quantity::0')]";


    //U
    public String uText="//*[@class='csi-table-header-content' and text()='U']";
    public String inputValorU ="/html/body/div[19]/div/div[1]/div/div/div/div[2]/div[1]/input[@class='dijitReset dijitInputInner']";

    //PP
    public String ppText="//*[@class='csi-table-header-content' and text()='PP']";
    public String inputValorpp ="/html/body/div[19]/div/div[1]/div/div/div/div[2]/div[1]/input[@class='dijitReset dijitInputInner']";
    public String inputValorppcolorway ="(//input[@value='0'])[1]";
    public String selectCampoPP = "//*[contains(@class, 'attrNumber POProductUnitPerSize iconEditable csi-table-matrix-column-first columns') and contains(@data-csi-act, 'QuantityPerSize::0')]";

    //P
    public String pText="//*[@class='csi-table-header-content' and text()='P']";
    public String inputValorp ="/html/body/div[19]/div/div[1]/div/div/div/div[2]/div[1]/input[@class='dijitReset dijitInputInner']";
    public String inputValorpcolorway ="(//input[@value='0'])[1]";
    public String selectCampoP = "//*[contains(@class, 'attrNumber POProductUnitPerSize iconEditable csi-table-matrix-column columns') and contains(@data-csi-act, 'QuantityPerSize::0')]";

    //M
    public String mText="//*[@class='csi-table-header-content' and text()='M']";
    public String inputValorm ="/html/body/div[19]/div/div[1]/div/div/div/div[2]/div[1]/input[@class='dijitReset dijitInputInner']";
    public String inputValormcolorway ="(//input[@value='0'])[1]";
    public String selectCampoM = "//*[@data-csi-automation='edit-PurchasedOrder-Orders-QuantityPerSize:']";

    //G
    public String gText="//*[@class='csi-table-header-content' and text()='G']";
    public String inputValorg ="/html/body/div[19]/div/div[1]/div/div/div/div[2]/div[1]/input[@class='dijitReset dijitInputInner']";
    public String inputValorgcolorway ="(//input[@value='0'])[1]";
    public String selectCampoG = "//*[@data-csi-automation= 'edit-PurchasedOrder-Orders-QuantityPerSize:']";

    //GG
    public String ggText="//*[@class='csi-table-header-content' and text()='GG']";
    public String inputValorgg ="/html/body/div[19]/div/div[1]/div/div/div/div[2]/div[1]/input[@class='dijitReset dijitInputInner']";
    public String inputValorggcolorway ="(//input[@value='0'])[1]";
    public String selectCampoGG = "//*[contains(@class, 'attrNumber POProductUnitPerSize iconEditable csi-table-matrix-column-last columns') and contains(@data-csi-act, 'QuantityPerSize::0')]";

    // Order Case
    public String orderCaseText="//*[@class='csi-table-header-content' and text()='Order Case']";
    public String orderCase= "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]";
    public String inputOrderCase ="//div[@role='presentation']//div//div//div//div//div//input[@type='text']";
    public String selecionarLinhaPo ="//div[@data-csi-act='RNR_Order_SelectLine_boolean::0']//input[@type='checkbox']";

    public String orderCaseSkuRmsBr= "//*[contains(@class, 'attrNumber PastelYellow iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]";
    public String inputOrderCaseSkuRmsBr="//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_Case_integer:']//div//div//input[@type='text']";



    public String clicFlexaItem ="//tr[@data-csi-table-state='+']//td[@data-csi-heading='Node Name:']//span//span//span[@class='csiAction csiActionIcon']";
    // Refresh PO
    public String clicRefreshSupplierPO = "//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']";

    // Clic Crea Sample
    public String creaSampleText = "//*[@class='csi-table-header-content' and text()='Create Sample']";

    public String clusterSelecionarLinhaText = "//*[contains(text(),'Selecionar linha')]";

    //clic clusterGuideShop
    public String clusterGuideShop = "//div[@data-csi-act='RNR_Order_ClusterGuide_boolean::0']//input[@role='checkbox']";
    public String clusterGuideShopText = "//*[contains(text(),'Cluster Guide Shop')]";

    //clic clusterAER
    public String clusterAER = "//div[@data-csi-act='RNR_Order_ClusterAer_boolean::0']//input[@type='checkbox']";

    //clic clusterSPO
    public String clusterSPO = "//td[@data-csi-heading='RNR_Order_ClusterSPO_enum::0']";

    public String clusterSPOText = "//*[contains(text(),'Cluster SPO')]";

    public String clusterSPOInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ClusterSPO_enum:']//div//input[@role='textbox']";

    //clic clusterW
    public String clusterW = "//div[@data-csi-act='RNR_Order_ClusterW_boolean::0']";

    //locationList = 239097
    public String locationList = "//td[@data-csi-heading='RNR_Order_Locationlist_integer::0']";
    public String locationListText ="//*[contains(text(),'Location List')]";
    public String locationListInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_Locationlist_integer:']//div//input[@role='textbox']";

    //distributionRoles = #Buffer e #PC
    public String distributionRoles = "//tr[@data-csi-act='ViewSelect']//td[@data-csi-heading='RNR_Order_DistributionRules_enum::0']";
    public String distributionRolesInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_DistributionRules_enum:']//div//input[@role='textbox']";

    public String distributionRolesText ="//th//div//div//*[contains(text(),'Distribution Rules')]";

    public String clicCreaSample = "";
    public String clicCreaSampleSku = "//td[@data-csi-heading='RNR_Order_CreaSample_boolean::0']//div//div[@role='presentation']//input[@role='checkbox' and @type='checkbox']";

    // Clic Crea Sample
    public String clicCreaSampleBRPachNew = "//td[@data-csi-heading='RNR_Order_CreaSample_boolean::0']//div//div[@role='presentation']//input[@role='checkbox' and @type='checkbox']";

    // Clic Crea Sample Yes
    public String clicCreaSampleYes = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Yes']";

    // Clic na --> play_arrow send WorkSheet
    public String playArrowWorkSheet = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div/div[2]/span[1]/span";

    // Clic na --> play_arrow send Validation
    public String playArrowValidation = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div/div[4]/span[1]/span";

    // Clic na --> play_arrow send Submitted
    public String playArrowSubmitted = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[1]/div[6]/span/span";

    // Submitted
    public String statePo="//*[@data-csi-heading='RNR_PurchasedOrder_State_enum::0']";
    public String inputStatePo ="//div//div/div[@role='presentation']/div/div/div/div[3]/input[@aria-autocomplete='both']";

    // Issues
    public String abaIssues = "//*[@data-csi-tab-name='Issues']";
    public String commentIssuesError = "//*[@data-csi-heading='Comment::0']";
    public String integrationStatusValorText = "//*[@data-csi-heading='RNR_PurchasedOrder_Statusintegracion_enum::0']";

    // RMS PO Code
    public String rmsPoCodeValor = "//*[@data-csi-heading='RNR_PurchasedOrder_RMSCode_string::0']";

    //Supplier PO
    public String supplierPO="//*[@data-csi-heading='Node Name::0']";

    // Integration Status
    public String abaIntegrationStatusText = "//*[@class='sort' and text()='Integration Status'";
    public String integrationStatusValue = "/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr/td/div[1]/table[1]/tbody/tr/td[1]/div/table/tbody/tr[1]/td[1]";
    public String clicSampleOrder="(//a[@class='browse'])[5]";

    // Properties RMS Code
    public String propertiesCodeText="//*[@data-csi-heading='Node Name:Child:__Parent__/Child:__Parent__/Child:__Parent__:0']";

    // Properties Integration Status
    public String propertiesSampleText="//*[@data-csi-heading='Node Name::0']";
    public String propertiesItemPaiText="//*[@data-csi-heading='RNR_INT_Styleatt_Idprodutorms_string:Child:__Parent__/Child:__Parent__/Child:__Parent__/Child:Attributes:0']";

    // Properties RMS SKU ID
    public String propertiesRmsSkuIDText="//*[@data-csi-heading='RNR_Sample_Stylecode_string::0']";

    public String botaoRefreshSupplierPO = "//*[@data-csi-automation='plugin-Collection-Styles-refresh']";

}
