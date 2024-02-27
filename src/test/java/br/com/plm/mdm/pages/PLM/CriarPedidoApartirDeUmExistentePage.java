package br.com.plm.mdm.pages.PLM;

public class CriarPedidoApartirDeUmExistentePage {

    public String orderQtyText = "//*[@class='csi-table-header-content' and text()='Order Qty']";
    public String orderPackQtyText = "//*[@class='csi-table-header-content' and text()='Pack Qty']";
    public String orderPackQty = "//*[contains(@class, 'dijit dijitReset dijitInline dijitLeft csi-validation-textbox dijitTextBox dijitValidationTextBox dijitTextBoxHover dijitValidationTextBoxHover dijitHover') and contains(@data-csi-automation, 'edit-PurchasedOrder-Orders-UnitPerPack:')]";
    public String inputValorPackOrderQty = "(//input[@value='1'])[1]";

    public String clicCampoOrderQty = "//*[@data-csi-act='Quantity::0']";
    //public String inputCopyValuePackOrderQty = "//div[@class='csi-flex-row']//div//input[@type='text']";
    public String inputCopyValuePackOrderQty = "//input[@value='2']";

    public String clicCopySupplierPO = "//span[contains(@class, 'csiAction') and @title='Copy']\n";
    public String clicCopySupplierPOPack = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[4]/div/div/div[5]/div/div[1]/div[2]/table/tbody/tr/td[32]/div/span[3]";

    public String copyStattePO = "//*[contains(text(),'State PO')]";
    public String textIntegrationStatus = "//*[@class='csi-table-header-content' and text()='Integration Status']";
    public String clicIntegrationStatus = "//span[@data-csi-automation='filter-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";
    public String clicCode = "//span[@class='csi-table-header-content' and text()='Code']";
    // Code
    public String codeText = "//*[@class='csi-table-header-content' and text()='Code']";
    public String campoCode = "//span[@data-csi-automation='filter-Collection-Styles-Node Name']//span[@role='button']";
    public String inputCode = "//div/div/div[3]/input[@data-csi-automation='values-Collection-Styles-Node Name']";
    public String textDescription = "//*[@class='csi-table-header-content' and text()='Description']";

    public String clicCampoCode="(//a[contains(@class, 'browse') and starts-with(text(), 'BSM_FW')])[1]\n";

    public String clicCampoSupplierPO = "//th//div//div//span[contains(text(),'Supplier PO')]";
    public String copyCampoSupplierPOText = "//th//div//div//span[contains(text(),'Supplier PO')]";
    //public String integrationStatusInput="//div[@data-csi-automation='values-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']//div//input[@data-csi-automation='values-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";
    public String integrationStatusInput = "(//input[@role='textbox'])[8]";

    // Viewer PO Importada
    public String viewRennerNacional = "//div[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect']/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@aria-autocomplete='both']";

    public String abaSourcing = "//*[@data-csi-tab-name='Sourcing']";

    public String abaPOs="//*[@data-csi-tab-name='POs']";

    // Aba SUpplier POs
    public String abaSupplierPOs="//*[@data-csi-tab-name='Supplier POs']";

    // Clic New Supplier PO
    public String newSupplierPO = "//div[@class='dijitReset dijitInline dijitButtonText' and text()='New Supplier PO']";

    // Clic Pack
    public String selectPack="//*[@data-csi-automation='field-PurchasedOrder-Form-OrdersByColor']";

    // Clic Next
    public String clicNext="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Next']";
    public String selectColorway = "//tbody/tr[1]/td[1]/div[1]/input[1]";
    // Finish
    public String finish ="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Finish']";

    public String botaoActionNewSupplierPO = "//*[@data-csi-automation='plugin-LibSourcing-PurchasedOrders-ToolbarNewActions']";
    public String botaoNewSupplierPO = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'New Supplier PO')]";

    public String inputSupplierPO = "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div[1]/div/div[3]/input[1]";
    public String botaoSaveGo = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save & Go']";
    public String botaoSave = "//*[@data-csi-act='Save']";

    // Begin Criar PO Nacional SKU New
    public String abaSourcingNew = "//*[@data-csi-tab-name='Sourcing']";
    public String botaoNewSupplierPONew = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'New Supplier PO')]";

    //Viewer New
    public String viewerRennerNew = "//*[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect' and @data-csi-act='CustomViewSelect']";
    public String selectViewRenner = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[1]/div/div[1]/div[3]/input[1]";

    // Viewer Renner
    public String viewersRenner = "//*[@data-csi-automation='plugin-Collection-Styles-CustomViewSelect' and @data-csi-act='CustomViewSelect']";
    public String selectViewsRenner = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[3]/input[1]";


    // page worksheet PO (Nacional e Importada)
    public String botaoAction = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Actions...']";
    public String botaoActionNewStyleSKUsOrder = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='New Style SKUs Order...']";

    public String code = "//*[@data-csi-automation='filter-BasePurchaseOrder-OrderSelectSKUs-Node Name:Child:Style']";
    // XPath input[data-csi-automation='values-BasePurchaseOrder-OrderSelectSKUs-Node Name:Child:Style']
    public String valueCode = "//input[@data-csi-automation='values-BasePurchaseOrder-OrderSelectSKUs-Node Name:Child:Style']";

    // Supplier PO Type (Importada)
    public String poTypeImportadaText = "//*[@class='csiHeadingCellLabel' and text()='PO Type']";
    public String poTypeImportada = "//*[@data-csi-act='RNR_PurchasedOrder_Rmspotype_enum::0']";
    public String inputValorPOTypeImportada = "(//input[@role='textbox'])[9]";
    public String selecionarLinhaPo = "//div[@data-csi-act='RNR_Order_SelectLine_boolean::0']//input[@type='checkbox']";

    public String clusterARG = "//td[@data-csi-heading='RNR_Order_ClusterARG_enum::0']";

    public String clusterURU = "//td[@data-csi-heading='RNR_Order_ClusterURU_enum::0']";

    public String clusterSPO = "//td[@data-csi-heading='RNR_Order_ClusterSPO_enum::0']";

    public String clusterSPOText = "//*[contains(text(),'Cluster SPO')]";

    public String clusterARGText = "//*[contains(text(),'Cluster ARG')]";
    public String clusterURUText = "//*[contains(text(),'Cluster URU')]";

    public String clusterSPOInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ClusterSPO_enum:']//div//input[@role='textbox']";
    public String clusterARGInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ClusterARG_enum:']//div//input[@role='textbox']";
    public String clusterURUInput = "//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_ClusterURU_enum:']//div//input[@role='textbox']";


    // Order Case
    public String orderCaseText="//*[@class='csi-table-header-content' and text()='Order Case']";
    public String orderCase= "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]";
    public String orderQty= "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'Quantity::0')]";

    public String inputOrderCase ="//div[@data-csi-automation='edit-PurchasedOrder-Orders-RNR_Order_Case_integer:']//div//div//input";

    // Salvar New StyleSKU order (Nacional,Importada e Split)
    public String botaoSalvarNewStyleSKUorder = "//*[@data-csi-act='Save']";
    //Refresh (Nacional,Importada e Split)
    public String botaoRefreshSupplierPO = "//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']";

    public String btnRefresh = "//*[@data-csi-automation='plugin-Collection-Styles-refresh']";
    public String poFactoryText = "//*[@class='csiHeadingCellLabel' and text()='Factory']";
    public String poFactory = "//*[@data-csi-act='POFactory::0']";
    public String inputValorFactory = "(//input[@role='textbox'])[9]";


    // Supplier PO Year (Nacional)
    public String yearText = "//*[@class='csiHeadingCellLabel' and text()='Year']";
    public String year = "//*[@data-csi-act='RNR_PurchasedOrder_Year_enum::0']";
    public String YearInputSku = "//input[@title='undefined']";

    public String YearInputPack = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Year_enum:']//div//input[@aria-autocomplete='both']";

    // Supplier Po Commercial Week (Nacional)
    public String commercialWeekText = "//*[@class='csiHeadingCellLabel' and text()='Commercial Week']";
    public String commercialWeek = "//*[@data-csi-act='RNR_PurchasedOrder_SemanaComercial_enum::0']";
    public String commercialWeekInput = "(//input[@role='textbox'])[9]";
    public String commercialWeekInputCopy = "(//input[@role='textbox'])[8]";

    //Modal: Air PO Importada
    public String poModelAirText = "//*[@class='csiHeadingCellLabel' and text()='Modal']";
    public String poModelAir = "//*[@data-csi-act='RNR_PurchasedOrder_Modal_enum::0']";
    public String poModelAirPack = "//*[@data-csi-act='RNR_PurchasedOrder_Modal_enum::0']";
    public String inputValorPoModelAir = "(//input[@role='textbox'])[9]";

    //External Local: SHANGAI-CHINA PO Importada
    public String poExternalLocalText = "//*[@class='csiHeadingCellLabel' and text()='External Local']";
    public String poExternalLocal = "//*[@data-csi-act='RNR_PurchasedOrder_LocalExterno_enum::0']";
    public String poExternalLocalPack = "//*[contains(@data-csi-act, 'RNR_PurchasedOrder_LocalExterno_enum::0')]";
    public String inputValorPoExternalLocal = "(//input[@role='textbox'])[9]";

    //TRade: Outros PO Importada
    public String poTradeText = "//*[@class='csiHeadingCellLabel' and text()='Trade']";
    public String poTrade = "//*[@data-csi-act='RNR_PurchasedOrder_Trade_enum::0']";
    public String poTradePack = "//*[@data-csi-act='RNR_PurchasedOrder_Trade_enum::0']";
    public String inputValorPoTrade = "(//input[@role='textbox'])[9]";
    public String poParceiroText = "//*[@class='csiHeadingCellLabel' and text()='Parceiro']";
    public String poParceiroPack = "//*[@data-csi-act='RNR_PurchasedOrder_Parceiro_enum::0']";
    public String inputValorParceiro = "(//input[@role='textbox'])[9]";

    // FFDD Date PO Importada
    public String ffddDateText = "//*[@class='csiHeadingCellLabel' and text()='FFDD Date']";
    public String ffddDate = "//*[@data-csi-act='RNR_PurchasedOrder_FFDD_date::0']";
    public String inputValorFFDDDate = "(//input[@role='textbox'])[9]";

    // Supplier PO Warehouse/Store
    public String warehouseStoreImportado ="//*[@data-csi-act='RNR_PurchasedOrder_Location_enum::0']";
    public String inputValorWarehouseStoreImportadoSku = "//div[@data-csi-automation='edit-PurchasedOrder-Properties-RNR_PurchasedOrder_Location_enum:']//div//input[@aria-autocomplete='both']";
    public String warehouseStoreText = "//*[@class='csiHeadingCellLabel' and text()='Warehouse/Store']";
    public String warehouseStore = "//*[@data-csi-act='RNR_PurchasedOrder_Location_enum::0']";
    public String inputValorWarehouseStore = "(//input[@role='textbox'])[9]";
    public String inputValorWarehouseStoreCopy = "(//input[@role='textbox'])[8]";
    public String viwerRennerPoBrPack = "//*[@data-csi-automation='plugin-Collection-Styles-CustomViewSelect' and @data-csi-act='CustomViewSelect']";
    public String inputSelectViewerPoBrPack = "//div[@data-csi-automation='plugin-Collection-Styles-CustomViewSelect']//div//input[@role='textbox']";


    // Supplier PO PO/Model
    public String poModelText = "//*[@class='csiHeadingCellLabel' and text()='PO Model']";
    public String poModel = "//*[@data-csi-act='RNR_PurchasedOrder_TipoPO_enum::0']";
    public String inputValorPoModel = "(//input[@role='textbox'])[8]";
    public String inputValorPoModelLatam = "(//input[@role='textbox'])[9]";
    public String inputValorPoModelCopy = "(//input[@role='textbox'])[8]";

    public String clicFlexaItem ="//tr[@data-csi-table-state='+']//td[@data-csi-heading='Node Name:']//span//span//span[@class='csiAction csiActionIcon']";

    // Não validar OTB Nacional
    public String naoValidarOtbNacional = "//div[@data-csi-act='RNR_PurchasedOrder_OTBException_boolean::0']";

    // Não validar OTB
    public String naoValidarOtb="//div[@data-csi-act='RNR_PurchasedOrder_OTBException_boolean::0']";

    //Select New Style SKU order
    public String newStyleSkuOrder = "/html/body/div[12]/div[2]/div/div[4]/div/div/table/tbody[2]/tr[4]/td[1]/div";

    // Select Viewer Renner PO Nacional, Importada e Split
    public String viewRenner = "//*[contains(@class, 'dijitReset dijitInputInner') and contains(@id, 'uniqName_19_5')]";

    // Year new
    public String yearNew = "//*[@data-csi-act='RNR_PurchasedOrder_Year_enum::0']";
    public String YearInputNew = "(//input[@role='textbox'])[9]";
    public String YearInputNewCopy = "(//input[@role='textbox'])[8]";

    //Orders Insert Order Qty > 0
    public String copyOrderQtyText = "//*[contains(text(),'Order Qty')]";
    public String orderQtyy = "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'Quantity::0')]";
    public String inputValorOrderQty = "/html/body/div[12]/div/div[1]/div/div/div/div[2]/input[@class='dijitReset dijitInputInner']";

    // PO Split Orders Insert Order Tipo Split
    public String orderTipoSplitText = "//*[@class='csi-table-header-content' and text()='Tipo Split']";
    public String orderTipoSplit = "//td[@class='attrEnum attrEnumPurchasedOrderState iconEditable' and @data-csi-act='RNR_Order_TipoSplit_enum::0']";
    public String inputValorOrderTipoSplit = "(//input[@role='textbox'])[9]";

    //PO Split Orders Insert Order Valor Split
    public String orderValorSplitText = "//*[@class='csi-table-header-content' and text()='Valor Split']";
    public String orderValorSplit = "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_ValorSplit_integer::0')]";
    public String inputValorSplit = "//input[@value='0']";

    // RMS PO Code
    public String orderrmsPoCodeText = "//*[@class='csiHeadingCellLabel' and text()='RMS PO Code']";
    public String rmsPoCodeValor = "//*[@data-csi-heading='RNR_PurchasedOrder_RMSCode_string::0']";

    //Supplier PO
    public String supplierPO="//*[@data-csi-heading='Node Name::0']";

    // Clic na --> play_arrow send Validation
    public String playArrowWorkSheet ="/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div/div[2]/span[1]/span";

    // Clic na --> play_arrow send Validation
    public String playArrowValidation = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div/div[4]/span[1]/span";

    // Clic na --> play_arrow send Submitted
    public String playArrowSubmitted = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[1]/div[6]/span/span";
    public String statePo="//*[@data-csi-heading='RNR_PurchasedOrder_State_enum::0']";
    public String inputStatePo ="//input[@title='Worksheet']";

    // Integration Status
    public String abaIntegrationStatusText = "//*[@class='sort' and text()='Integration Status'";
    public String integrationStatusValue = "/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr/td/div[1]/table[1]/tbody/tr/td[1]/div/table/tbody/tr[1]/td[1]";

    // Issues
    public String abaIssues = "//*[@data-csi-tab-name='Issues']";

    // Verificar XPath
    public String commentIssuesError = "//*[@data-csi-heading='Comment::0']";
    public String integrationStatusValorText = "//*[@data-csi-heading='RNR_PurchasedOrder_Statusintegracion_enum::0']";

    // Clic na --> PlayArrowClosed send Close
    public String playArrowClosed = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div[1]/div/div[1]/div[8]/span/span";


    ///////////////////////////// Criar pedido a partir de um PO existente ////////////////////////////////////
    public String stateApprovedText = "//*[@class='sort' and text()='State']";
    public String campoStateAll = "//*[@data-csi-automation='filter-LibSourcing-PurchasedOrders-State']";

    //public String stateApprovedInput = "//input[@data-csi-automation='values-LibSourcing-PurchasedOrders-State']";
    public String stateApprovedInput = "//*[@data-csi-automation='values-LibSourcing-PurchasedOrders-State']";
    //Approved
    public String selectLabelApproved = "//*[@id='uniqName_24_2_popup1']";
    //Worksheet
    public String selectLabelWorksheet = "//*[@id='uniqName_24_2_popup2']";

    // data-csi-act="Copy"
    public String btnCopyPO = "//*[@data-csi-act='Copy']";
    // span[data-csi-act='Save']
    public String btnSavePO = "//*[@data-csi-act='Save']";

    // Supplier PO copiar id da PO copiada
    public String SaveCodeSupplierPOCopy = "/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[6]/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[1]/div/div/div[5]/div/div[1]/table/tbody[2]/tr[1]/td[4]";

    // Selecionar PO copiada

    // Viewer Renner Global
    public String campoSupplierPoAll = "//*[@id='dijit_form_DropDownButton_21']";

    public String copyCampoSupplierPOAll = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[4]/div/div/div[5]/div/div[1]/div[1]/table/thead/tr[2]/th[5]/span/span/span";
    public String copySupplierPOInput = "//input[@data-csi-automation='values-Product-PurchasedOrders-Node Name']";

    // Viewer Renner
    public String supplierPOText = "//*[@class='csi-table-header-content' and text()='Supplier PO']";
    public String supplierPOInput = "(//input[@role='textbox'])[14]";
    public String supplierPOInputNew = "//div/div[1]/div/div/div/div[3]/input[1]";

    // Selecionar PO criada
    // Viewer Renner Global
    public String linkPoCopiada = "(//a[contains(@class,'browse')])[07]";
    //public String linkCopyPoCopiada = "(//a[contains(@class,'browse')])[11]";

    public String linkCopyPoCopiada = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[4]/div/div/div[5]/div/div[1]/div[2]/table/tbody/tr[2]/td[5]/a";

   }
