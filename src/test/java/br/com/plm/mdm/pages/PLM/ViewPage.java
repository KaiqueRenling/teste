package br.com.plm.mdm.pages.PLM;

public class ViewPage {

    public String abaStyle = "//*[@data-csi-tab-name='Style']";
    public String abaPropriedades = "//*[@data-csi-tab-name='Properties']";
    public String btnRefresh = "//*[@data-csi-automation='plugin-Style-Properties-refresh']";
    public String botaoRefresh = "//*[@data-csi-automation='plugin-Collection-Styles-refresh']";
    public String botaoView = "//span[@data-csi-automation='plugin-Style-Properties-CustomViewActions']/span/span/span[@class='dijitReset dijitInline dijitButtonText' and text()='Views']";
    public String inputView = "//div[@data-csi-automation='plugin-Style-Properties-CustomViewSelect']/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@type='text']";

    public String btnHabilitarFiltroSubclass = "(//span[@class='pluginComposite csiToolbarFilter csi-batch-filter csi-toolbar-btn-filter']//span[@class='dijitReset dijitStretch dijitButtonContents'])[2]";

    public String botaoAddFiltroColunaColor = "//div[@class='csi-batch-filter-container-buttons']//span[@class='dijitReset dijitInline dijitIcon material-icons']";

    public String filterSelecionarOptionIntegrationStatus = "//div[@item='0']//span[contains(text(), 'Integration Status')]";

    public String filterSelecionarOptionSubmitStatus = "//div[@item='0']//span[contains(text(), 'Submi')]";

    public String filterSelecionarOptionSizeRange = "//div[@item='0']//span[contains(text(), 'Size Ran')]";

    public String inputFilterSizeRange = "//div[@class='dijit dijitReset dijitInline dijitLeft csi-filter-in-dropdown-textbox dijitTextBox dijitTextBoxFocused dijitFocused']//input[@class='dijitReset dijitInputInner']";

    public String filterSelecionarASizeRange = "//div[@class='dijitReset dijitMenuItem']//input[@class='dijitReset dijitCheckBoxInput']";

    public String inputFilterSubclasse = "//div[@class='csi-filter-in-dropdown-container csi-dropdown-up']//input[@class='dijitReset dijitInputInner']";

    public String inputFilterSubclasse2 = "//div[@class='dijit dijitReset dijitInline dijitLeft csi-filter-in-dropdown-textbox dijitTextBox dijitTextBoxFocused dijitFocused']//input[@class='dijitReset dijitInputInner']";

    public String textIntegrationStatus = "//*[@class='csi-table-header-content' and text()='Integration Status']";
    public String clicIntegrationStatus = "//span[@data-csi-automation='filter-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";

    public String integrationStatusSuccesfull = "//div[@class='dijitReset dijitMenuItem' and @item='4']//div[@class='dijit dijitReset dijitInline dijitCheckBox']";

    public String integrationStatusSuccesfull2 = "//div[@class='dijitReset dijitMenuItem']//div[@class='dijit dijitReset dijitInline dijitCheckBox']//input[@value='RNR_StatusInteg:4']";

    public String integrationStatusSucessfull3 = "//div[@class='dijitReset dijitMenu dijitComboBoxMenu multiSelectMenu']//input[@value='RNR_StatusInteg:4']";

    public String clicCode = "//span[@class='csi-table-header-content' and text()='Code']";

    //public String integrationStatusInput="//div[@data-csi-automation='values-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']//input[@aria-autocomplete='both']";
    public String integrationStatusInput = "//div[@class='dijit dijitReset dijitInline dijitLeft csi-filter-in-dropdown-textbox dijitTextBox dijitTextBoxFocused dijitFocused']//input[@class='dijitReset dijitInputInner']";

    public String btnShowResultsIntegrationStatus = "//span[@class='dijit dijitReset dijitInline csi-secondary-btn csi-show-results-btn dijitButton']//span[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'Show Results')]";

    public String checkboxStatusIntegration = "//div[@class='dijitReset dijitMenuItem']//input[@class='dijitReset dijitCheckBoxInput']";


    // Viewer PO Importada
    public String viewRennerNacional = "//div[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect']/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@aria-autocomplete='both']";
    //public String selectViewRenner = "//div[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect']//div[@class='dijitReset dijitInputField dijitInputContainer']//input[@aria-autocomplete='both']";


    // Select Viewer Cadastro Item
    public String viewRenner = "//div[@data-csi-automation='plugin-Collection-Styles-CustomViewSelect']/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@aria-autocomplete='both']";
    public String selectViewRenner = "//div[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect']//div[@class='dijitReset dijitInputField dijitInputContainer']//input[@aria-autocomplete='both']";
    public String selectViewRennerVar = "//div[@data-csi-context-parent-attr='Hierarchy']//div//div//div[@data-csi-context-parent-attr='Hierarchy']//div//input[@class='dijitReset dijitInputInner']";

    public String infoRmsId = "//td[@data-csi-heading='RNR_INT_Styleatt_Idprodutorms_string:Child:Attributes:0']";
    public String infoMdmId = "//td[@data-csi-heading='RNR_INT_Styleatt_Idprodutomdm_string:Child:Attributes:0']";
    public String infoPlmId = "//td[@data-csi-heading='RNR_StyleAttributes_URLStyle_string:Child:Attributes:0']";

    public String orderOriginText = "//*[@class='csiHeadingCellLabel' and text()='Order Origin']";
    public String orderOrigin = "//*[@data-csi-act='RNR_PurchasedOrder_Origin_ref::0']";
    //SKU
    public String orderOriginInput = "(//input[@role='textbox'])[8]";
    //LATAM
    public String orderOriginLatamInput = "(//input[@role='textbox'])[9]";


    // Supplier PO Warehouse/Store
    public String inputValorWarehouseStore = "(//input[@role='textbox'])[8]";
    public String warehouseStoreText = "//*[@class='csiHeadingCellLabel' and text()='Warehouse/Store']";
    public String warehouseStore="//*[@data-csi-act='RNR_PurchasedOrder_Location_enum::0']";

    // Supplier PO Warehouse/Store
    public String warehouseStoreImportado ="//*[@data-csi-act='RNR_PurchasedOrder_Location_enum::0']";
    public String inputValorWarehouseStoreImportado = "(//input[@role='textbox'])[9]";

    public String poModelText = "//*[@class='csiHeadingCellLabel' and text()='PO Model']";
    public String poModel = "//*[@data-csi-act='RNR_PurchasedOrder_TipoPO_enum::0']";
    public String poModelPack = "//*[@data-csi-act='RNR_PurchasedOrder_TipoPO_enum::0']";
    public String inputValorPoModel = "(//input[@role='textbox'])[8]";
    public String inputValorPoModelImportado = "(//input[@role='textbox'])[9]";

    //Orders Insert Order Qty > 0
    public String orderQtyText = "//*[@class='csi-table-header-content' and text()='Order Qty']";
    public String orderQty = "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'Quantity::0')]";
    public String inputValorOrderQty = "//div/div[1]/div/div/div/div[2]/div[1]/input";

    // FFDD Date PO Importada
    public String ffddDateText = "//*[@class='csiHeadingCellLabel' and text()='FFDD Date']";
    public String ffddDate = "//*[@data-csi-act='RNR_PurchasedOrder_FFDD_date::0']";
    public String inputValorFFDDDate = "(//input[@role='textbox'])[9]";

    // Não validar OTB
    public String naoValidarOTB="//div[@data-csi-act='RNR_PurchasedOrder_OTBException_boolean::0']";

    public String poTypeNacionalText = "//*[@class='csiHeadingCellLabel' and text()='PO Type']";
    public String poTypeNacional = "//*[contains(@class, 'attrEnum attrEnumRNR_StatusInteg iconEditable') and contains(@data-csi-act, 'RNR_PurchasedOrder_Rmspotype_enum::0')]";

    // type nacional segundo
    public String poTypeNacionalSegundo = "//*[contains(@class, 'attrEnum attrEnumRNR_PurchasedOrderState iconEditable') and contains(@data-csi-act, 'RNR_PurchasedOrder_Rmspotype_enum::0')]";
    public String inputValorPOTypeNacional = "(//input[@role='textbox'])[8]";

    // Factory
    public String poFactoryText = "//*[@class='csiHeadingCellLabel' and text()='Factory']";
    public String poFactory = "//*[@data-csi-act='POFactory::0']";
    public String inputValorFactory = "(//input[@role='textbox'])[9]";
    public String inputBrValorFactory= "(//input[@role='textbox'])[8]";

    // State PO
    public String statePo="//*[@data-csi-heading='RNR_PurchasedOrder_State_enum::0']";
    public String inputStatePo ="//div//div/div[@role='presentation']/div/div/div/div[3]/input[@aria-autocomplete='both']";
    //public String inputStatePo ="//input[@title='Worksheet']";

    // Clic Base Product
    public String clicBaseProduct = "//td[@data-csi-heading='Node Name:Child:RealizedProduct/Child:__Parent__:0']//a[@class='browse']";

    // Code
    public String codeText = "//*[@class='csi-table-header-content' and text()='Code']";
    public String campoCode = "//span[@data-csi-automation='filter-Collection-Styles-Node Name']//span[@role='button']";
    public String inputCode = "//input[@data-csi-automation='values-Collection-Styles-Node Name']";

    // size Range
    public String sizeRangeText = "//span[@class='csi-table-header-content' and text()='Size Range']";
    public String camposizeRange = "//span[@data-csi-automation='filter-Collection-Styles-Node Name:Child:Attributes/Child:ActualSizeRange']//span[@role='button']";
    public String inputSizeRange = "//input[@data-csi-automation='values-Collection-Styles-Node Name:Child:Attributes/Child:ActualSizeRange']";
    // campo marca PLM new
    public String campoMarcaText="//*[@data-csi-automation='field-Style-CopyForm-RNR_Style_MarcaPropia_enum' and @data-dojo-attach-point='_popupStateNode']";

    // selecionar item copiado
    public String selecionarItemCopiado = "(//td[@class='attrString']//a[contains(text(), 'FW24_CMC')])[2]";

    public String selecionarItemCopiadoAcessorios = "(//td[@class='attrString']//a[contains(text(), 'FW24_BOL')])[2]";

    public String selecionarItemCopiadoFeminino = "(//td[@class='attrString']//a[contains(text(), 'FW24_MAC')])[2]";

    public String selecionarItemCopiadoInfantil = "(//td[@class='attrString']//a[contains(text(), 'FW24_CML')])[2]";

    public String selecionarItemCopiadoBeleza = "//tr[2]//a[contains(text(), 'FW22_STMP')]";

    public String clicCampoCode="(//a[contains(@class,'browse')])[7]";

    // Aba Sourcing
    public String abaSourcing="//*[@data-csi-tab-name='Sourcing']";

    // Aba POs
    public String abaPOs="//*[@data-csi-tab-name='POs']";

    // Aba SUpplier POs
    public String abaSupplierPOs="//*[@data-csi-tab-name='Supplier POs']";

    // Clic New Supplier PO
    public String newSupplierPO = "//div[@class='dijitReset dijitInline dijitButtonText' and text()='New Supplier PO']";

    // Clic Pack
    public String selectPack="//*[@data-csi-automation='field-PurchasedOrder-Form-OrdersByColor']";

    // Clic Next
    public String clicNext="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Next']";

    // Finish
    public String finish ="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Finish']";

    //public String selectColorway = "//td[@data-csi-heading='RNR_StyleAttributes_ActivaDesc_boolean:Child:Attributes:0']/div[@role='presentation']/input[@class='dijitReset dijitCheckBoxInput']";

    // PACK Primeiro
    public String selectColorway = "//tbody/tr[1]/td[1]/div[1]/input[1]";

    // PACK Segundo
    public String selectColorwaySegundo = "//tbody/tr[2]/td[1]/div[1]/input[1]";

    // PACK Segundo
    public String selectColorwayTerceiro = "//tbody/tr[3]/td[1]/div[1]/input[1]";


    // SKU Primeiro
    public String selectColorwaySku ="//div/div[2]/div/div[1]/div[2]/div[2]/div[3]/div[3]/div/div/div[4]/div/div/div[2]/table/tbody/tr[1]/td[1]/div/input";

    // SKU Segundo
    public String selectColorwaySkuSegundo ="//div/div[2]/div/div[1]/div[2]/div[2]/div[3]/div[3]/div/div/div[4]/div/div/div[2]/table/tbody/tr[2]/td[1]/div/input";

    // SKU Terceiro
    public String selectColorwaySkuTerceiro ="//div/div[2]/div/div[1]/div[2]/div[2]/div[3]/div[3]/div/div/div[4]/div/div/div[2]/table/tbody/tr[3]/td[1]/div/input";

    // btn Copy
    public String botaoCopy ="(//*[contains(@data-csi-act,'Copy')])[1]";
    //public String botaoCopy = "//td[@class='actionsColumn noexport']//div[@class='csiActions ']//span[@title='Copy']";

    // Templates
    public String templates = "//tbody[@data-dojo-attach-point='bodyNode']/tr[@data-csi-form-field='CopyTemplates']/td/div/div/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@role='textbox']";
    public String inputTemplates = "//div[@data-csi-automation='field-Style-CopyForm-CopyTemplates']//div//input[@role='textbox']";

    public String templateCopyStyleOption = "//div[@data-csi-automation='field-Style-CopyForm-CopyTemplates']//div[@class='dijitReset dijitMenuItem csi-result-selection']";

    public String campoMarcaTemplateCopy = "//div[@data-csi-automation='field-Style-CopyForm-RNR_Style_MarcaPropia_enum']";

    public String inputMarcaTemplateCopy = "//div[@data-csi-automation='field-Style-CopyForm-RNR_Style_MarcaPropia_enum']//input[@class='dijitReset dijitInputInner']";

    // Brand
    public String brand = "(//input[@role='textbox'])[14]";

    public  String campomarca =  "//tbody[@data-dojo-attach-point='bodyNode']/tr[@data-csi-form-field='RNR_Style_MarcaPropia_enum']/td/div/div/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@role='textbox']";
    public String botaoSave = "//span[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    public String inputDataIncial="//div[@class='csi-date-range-popup-custom-dates']/div/div[1]/div/input[@class='dijitReset dijitInputInner']";

    public String inputDataIncial2= "(//div[@class='dijit dijitReset dijitInline dijitLeft dijitTextBox dijitComboBox dijitDateTextBox dijitValidationTextBox']//input[@class='dijitReset dijitInputInner'])[1]";
    public String inputDataFinal="//div[@class='csi-date-range-popup-custom-dates']/div[2]/div/div//input[@class='dijitReset dijitInputInner']";

    public String inputDataFinal2="(//div[contains(@class, 'dijitTextBox') and contains(@class, 'dijitComboBox') and contains(@class, 'dijitDateTextBox') and contains(@class, 'dijitValidationTextBox')]//input[contains(@class, 'dijitReset') and contains(@class, 'dijitInputInner')])[2]";

    public String submitStatusTime = "//tr[@class='csi-table-row csi-table-filters noexport']/th[2]/span/span";
    public String custom = "//div[@class='csi-date-range-popup-top']/div/table/tbody/tr[10]/td[@class='dijitReset dijitMenuItemLabel']";

    public String custom2 = "//tr[@class='dijitReset dijitMenuItem']//td[@class='dijitReset dijitMenuItemLabel' and contains(text(), 'Custom')]";

    public String description="//*[contains(text(),'Description')]";
    public String styleStatus="//*[contains(text(),'Style Status')]";

    //public String clicCampoColorways="(//input[@role='textbox'])[17]";
    public String clicCampoColorways= "//div[@class='csiFormViewValueInput']/div[@data-csi-automation='field-Style-CopyForm-ProductColors']";

    public String clicSetaCampoColorways = "//div[@data-csi-automation='field-Style-CopyForm-ProductColors']//input[@class='dijitReset dijitInputField dijitArrowButtonInner']";
    public String selectNone="//div[@data-csi-automation='field-Style-CopyForm-ProductColors']/div[@class='dijitReset dijitMenuItem csiExclusiveCheckbox' and @item='0']";
    public String viewerRennerNew = "//*[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect' and @data-csi-act='CustomViewSelect']";

    // Year
    public String yearNew = "//*[@data-csi-act='RNR_PurchasedOrder_Year_enum::0']";
    public String YearInputNew = "(//input[@role='textbox'])[8]";
    //public String yearText = "//*[@class='csiHeadingCellLabel' and text()='Year']";
    public String yearText = "//div[normalize-space()='Year']";

    public String yearImportadaText = "//*[@class='csiHeadingCellLabel' and text()='Year']";
    public String yearImportada = "//*[@data-csi-act='RNR_PurchasedOrder_Year_enum::0']";
    public String inputValorYearImportada = "(//input[@role='textbox'])[9]";


    // Commercial Week
    public String commercialWeekText = "//*[@class='csiHeadingCellLabel' and text()='Commercial Week']";
    public String commercialWeek="//*[@data-csi-act='RNR_PurchasedOrder_SemanaComercial_enum::0']";
    public String commercialWeekInput = "(//input[@role='textbox'])[8]";
    public String commercialWeekInputImportado = "(//input[@role='textbox'])[9]";

    public String commercialWeekInputNacional = "(//input[@role='textbox'])[8]";


    //PP
    public String ppText="//*[@class='csi-table-header-content' and text()='PP']";
    public String inputValorpp ="//div[@class='dijitReset dijitInputField dijitInputContainer']//input[@value='0']";
    public String selectCampoPP = "//td[contains(@class, 'attrNumber POProductUnitPerSize iconEditable csi-table-matrix-column-first columns') and contains(@data-csi-act, 'QuantityPerSize::0')]";

    //P
    public String pText="//*[@class='csi-table-header-content' and text()='P']";
    public String inputValorp ="//div[@class='dijitReset dijitInputField dijitInputContainer']//input[@value='0']";
    public String selectCampoP = "//td[contains(@class, 'attrNumber POProductUnitPerSize iconEditable csi-table-matrix-column columns') and contains(@data-csi-act, 'QuantityPerSize::0')]";


    //M
    public String mText="//*[@class='csi-table-header-content' and text()='M']";
    public String inputValorm ="//div[@class='dijitReset dijitInputField dijitInputContainer']//input[@value='0']";
    public String selectCampoM = "//*[@data-csi-automation='edit-PurchasedOrder-Orders-QuantityPerSize:']";

    //G
    public String gText="//*[@class='csi-table-header-content' and text()='G']";
    public String inputValorg ="//div[@class='dijitReset dijitInputField dijitInputContainer']//input[@value='0']";
    public String selectCampoG = "//*[@data-csi-automation= 'edit-PurchasedOrder-Orders-QuantityPerSize:']";

    //GG
    public String ggText="//*[@class='csi-table-header-content' and text()='GG']";
    public String inputValorgg ="//div[@class='dijitReset dijitInputField dijitInputContainer']//input[@value='0']";
    public String selectCampoGG = "//*[contains(@class, 'attrNumber POProductUnitPerSize iconEditable csi-table-matrix-column-last columns') and contains(@data-csi-act, 'QuantityPerSize::0')]";

    public String botaoRefreshSupplierPO = "//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']";

    public String botaoRefreshSupplierPOLatam = "//*[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']";

    public String botaoRefreshh = "//*[@data-csi-automation='plugin-Collection-Styles-refresh']";

    public String locationTypeText = "//*[@class='csiHeadingCellLabel' and text()='Location Type']";
    public String locationType = "//*[@data-csi-act='RNR_Purchaseorder_Locationtype_enum::0']";

    public String locationTypePack = "//*[@data-csi-act='RNR_PurchasedOrder_Rmspotype_enum::0']";
    public String inputValorLocationType = "(//input[@role='textbox'])[9]";

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

    public String botaoRefreshSupplierPOVar = "//span[@data-csi-automation='plugin-PurchasedOrder-Print-refresh']";
    public String integrationStatusValorText = "//*[@data-csi-heading='RNR_PurchasedOrder_Statusintegracion_enum::0']";
    // Issues
    public String abaIssues = "//*[@data-csi-tab-name='Issues']";

    // Verificar XPath
    public String commentIssuesError = "//*[@data-csi-heading='Comment::0']";

    // RMS PO Code
    public String orderrmsPoCodeText = "//*[@class='csiHeadingCellLabel' and text()='RMS PO Code']";
    public String rmsPoCodeValor = "//*[@data-csi-heading='RNR_PurchasedOrder_RMSCode_string::0']";
    //Supplier PO
    public String supplierPO = "//*[@data-csi-heading='Node Name::0']";


    // Order Case
    public String orderCaseText="//*[@class='csi-table-header-content' and text()='Order Case']";
    public String orderCase= "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'RNR_Order_Case_integer::0')]";
    public String inputOrderCase= "//input[@value='0']";

    public String selecionarLinhaPo = "//td[@data-csi-heading='RNR_Order_SelectLine_boolean::0']//div//div//input[@type='checkbox']";
    public String packQtyText="//*[@class='csi-table-header-content' and text()='Pack Qty']";
    public String packQty= "//*[contains(@class, 'attrNumber iconEditable') and contains(@data-csi-act, 'UnitPerPack::0')]";
    public String inputValorPackQty ="//input[@value='1']";


}
