package br.com.plm.mdm.pages.PLM;

public class CriarColorSizesPage {

    //Specification
    public String abaSpecification = "//*[@class='material-icons csi-toolbar-btn-icon-DataSetup']";

    //Color Specification
    public String abaColorSpecification = "/html/body/div[4]/table/tbody/tr[4]/td[2]/a";

    // Action
   public String botaoAction="//*[@class='dijitReset dijitInline dijitIcon material-icons csi-toolbar-btn-icon-ToolbarNewActions']";


    //New Color Specification
    public String botaoActionColorSpecification = "//*[@class='dijitReset dijitMenuItemLabel' and text()='New Color Specification...']";


    //Color Specification: 00-0001 EXC:Lime Gin
     public String inputColorSpecification = "//*[@name='Node Name']";

    //DIFF Desc: Lime Gin
    public String inputDIFFDesc = "//*[@name='RNR_ColorSpec_DIFFDesc_String']";

    public String inputDIFFDescEdit = "//*[@name='RNR_ColorSpec_DIFFDesc_String']";

    //DIFF ID	: 00-0001EXC
    public String inputDIFFId = "//*[@name='RNR_ColorSpec_DIFFID_String']";

    //Family: Verde Claro
     public String inputFamily = "//*[@id='uniqName_69_0']";

    //Diff Type: COR
     public String inputDIFFType= "//*[@id='uniqName_69_1']";

    // New Color Specification Save
    public String newColorSpecificationSave = "//*[@id='dijit_form_Button_10_label']";

    // Xpath clic tabela
    public String clicColorSpecification ="/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[5]/div/div/div[2]/div[3]/div[3]/div/div/div[2]/div[3]/div[1]/div/div/div[5]/div/div[1]/table/tbody[2]/tr[20]/td[3]";

    // DIFF ID
    public String diffIDInputText ="//*[@class='csi-table-header-content' and text()='DIFF ID']";
    public String diffIDAll = "//*[@data-csi-automation='filter-ApparelViews-ColorSpecifications-RNR_ColorSpec_DIFFID_String']";
    public String diffIDInput = "(//input[@role='textbox'])[6]";

    // Instegration Status Submit
    public String integrationStatusText = "//*[@class='csi-table-header-content' and text()='Status Integração']";
    public String clicIntegrationStatus = "//*[@data-csi-act='RNR_ColorSpec_IntegrationStatus_Enum::0']";
    public String integrationStatusInput = "(//div[@id='dijit_TooltipDialog_1']//input[@class='dijitReset dijitInputInner'])";

    // Refresh Color Specification
    public String refresh="//*[@data-csi-automation='plugin-ApparelViews-ColorSpecifications-refresh']";

    //Clicar EDIT
    public String newColorSpecificationEdit ="//span[@title='Edit']";

    // Edit New Color Specification Save
    public String colorSpecificationEditSave = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    //Clicar DELETE XPath
    public String newColorSpecificationDelete ="(//span[@title='Delete'])[1]";
    //Clic DELETE
    public String colorSpecificationDelete ="//*[@class='dijitReset dijitInline dijitButtonText' and text()='Delete']";

    /////////////////////// Sizes ///////////////////////////////////
    public String abaSizes = "//*[@class='MuiTypography-root MuiTypography-body1' and text()='Sizes']";

    //Actions Sizes
    public String botaoActionsSizes="//*[@data-csi-automation='actions-ApparelViews-Sizes-root']";

    //New Sizes
    public String botaoActionsNewSizes = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='New Size']";

    //Size: RN
    public String inputSize ="//*[@name='Node Name']";

    //Dimension 1 Type: Size     Sizes
    public String dimensionTypeSizes ="//*[@data-csi-automation='field-ProductSize-Form-DimensionType' and @data-dojo-attach-point='_popupStateNode']";
    public String inputDimensionSizes = "(//input[@role='textbox'])[7]";

    //Sort Order: 580
    public String campoSortOrder ="//*[@data-csi-automation='field-ProductSize-Form-SizeCode']";
    public String inputSortOrder ="(//input[@value='0'])[2]";

    // Refresh Sizes-refresh
    public String refreshSizes="//*[@data-csi-automation='plugin-ApparelViews-Sizes-refresh']";

    // Sort Order
    public String sortOrderText ="//*[@class='csi-table-header-content' and text()='Sort Order']";
    public String sortOrderAll = "//*[@data-csi-automation='filter-ApparelViews-Sizes-SizeCode']";
    public String sortOrderInput = "(//input[@role='textbox'])[7]";

    // Sizes Instegration Status Submit
    public String integrationStatusSizesText = "//*[@class='csi-table-header-content' and text()='Status Integracion']";
    public String clicIntegrationStatusSizes = "//*[@data-csi-act='RNR_ProductSize_StatusIntegracion_enum::0']";
    public String integrationStatusSizesInput = "(//input[@value='Draft'])[1]";

    // New Size Save
    public String newSizesSave ="//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    //Clicar EDIT
    public String newSizeEdit ="/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div/div[3]/div/div/div/div[5]/div/div[1]/div[2]/table/tbody/tr/td[15]/div/span[1]";

    // Edit New Color Specification Save
    public String sizeEditSave = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    //Clicar DELETE
    public String newSizeDelete ="/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div/div[3]/div/div/div/div[5]/div/div[1]/div[2]/table/tbody/tr/td[15]/div/span[2]";

    //Clic Delete
    public String sizeDelete ="//*[@class='dijitReset dijitInline dijitButtonText' and text()='Delete']";

    /////////////////////// Sizes ///////////////////////////////////


    ///////////////////// Sizes Range ///////////////////////////////
    public String abaSizeRange = "//*[@data-csi-tab='ApparelViews-SizeRanges']";

    public String abaSizesRange = "//*[@class='MuiTypography-root MuiTypography-body1' and text()='Size Ranges']";
    public String botaoActionsNewSizeRange = "//*[@data-csi-automation='plugin-ApparelViews-SizeRanges-ToolbarNewActions']";

    //New Size Range
    public String botaoNewSizeRange = "//*[@class='dijitReset dijitMenuItemLabel' and text()='New Size Range...']";

    //Size Range: Único e kit (Nome tem que ser diferente se já existe nome criado)
    public String inputSizeRange = "//*[@id='uniqName_15_16']";

    //Description: Único e kit
    public String inputDescription = "//*[@name='Description']";

    //Dimension 1 Type: Size
    public String dimensionType = "//*[@data-csi-automation='field-SizeRange-Form-Dimension1Type']";
    public String inputDimension = "(//input[@role='textbox'])[6]";

    //Management: FEMENINO
    public String inputManagement = "//*[@id='uniqName_69_1']";

    // New Size Range Save
    public String newSizeRangeSave = "//*[@id='dijit_form_Button_11_label']";

    //Clicar EDIT
    public String newSizeRangeEdit ="(//span[@title='Edit'][normalize-space()='mode_edit'])[1]";

    // Edit New Color Specification Save
    public String sizeRangeEditSave = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    //Clicar DELETE
    public String newSizeRangeDelete ="(//span[@title='Delete'][normalize-space()='close'])[1]";

    //Clic Delete
    public String sizeRangeDelete ="//*[@class='dijitReset dijitInline dijitButtonText' and text()='Delete']";

    public String clicCode = "//span[@class='csi-table-header-content' and text()='Code']";
    public String botaoRefreshh = "//*[@data-csi-automation='plugin-Collection-Styles-refresh']";

    public String botaoCopy ="(//*[contains(@data-csi-act,'Copy')])[1]";

    public String inputTemplates = "//div[@data-csi-automation='field-Style-CopyForm-CopyTemplates']//div//input[@role='textbox']";
    public String clicCampoColorways= "//div[@class='csiFormViewValueInput']/div[@data-csi-automation='field-Style-CopyForm-ProductColors']";
    public String selectNone="//div[@data-csi-automation='field-Style-CopyForm-ProductColors']/div[@class='dijitReset dijitMenuItem csiExclusiveCheckbox' and @item='0']";

    public  String campomarca =  "//tbody[@data-dojo-attach-point='bodyNode']/tr[@data-csi-form-field='RNR_Style_MarcaPropia_enum']/td/div/div/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@role='textbox']";
    public String botaoSave = "//span[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";
    public String campoMarcaText="//*[@data-csi-automation='field-Style-CopyForm-RNR_Style_MarcaPropia_enum' and @data-dojo-attach-point='_popupStateNode']";
    public String selecionarItemCopiado = "//tr[contains(@class,'csiSelected')]//td[contains(@class,'attrString')]//a[contains(@class,'browse')]";

    public String botaoRefresh = "//*[@data-csi-automation='plugin-Collection-Styles-refresh']";
    // Code
    public String codeText = "//*[@class='csi-table-header-content' and text()='Code']";
    public String campoCode = "//span[@data-csi-automation='filter-Collection-Styles-Node Name']//span[@role='button']";
    public String inputCode = "(//input[contains(@role,'textbox')])[8]";
    public String textDescription = "//*[@class='csi-table-header-content' and text()='Description']";
    public String clicCampoCode="(//a[contains(@class,'browse')])[7]";

    public String abaStyle = "//*[@data-csi-tab-name='Style']";
    public String abaSku = "//span[@data-csi-tab-name='SKUs']";
    public String botaoAcaoSku = "(//div[@role='presentation'][normalize-space()='New Style SKU'])[1]";
    public String botaoSalvarSku = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    public String abaColorways = "//*[@data-csi-tab-name='Colorways']";
    public String botaoAcaoColorways = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'New from Color Specification')]";
    public String clicCampoColorSpecification = "//th[@class='csi-table-frozen-end']";
    public String inputCampoColorSpecification = "//div[@role='presentation']//div//div//div//input[@data-csi-automation='values-ApparelViews-ProductColorSpecs-Node Name']";

    public String clusterArg = "//*[@data-csi-act='RNR_ColorwayAttributes_ClusterARG_enum:Child:Attributes:0']";
    public String selectTextBox= "//div[@data-csi-automation='values-ApparelViews-ProductColorSpecs-Node Name']//div[@item='0']";

    public String selectFirstColumn= "//th[@class='csi-table-selection-column noexport firstColumn']/div";
    public String selectSecondColumn= "//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr/td[1]/div[@role='presentation']/input[@type='checkbox']";
    public String selectThirdColumn= "//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr/td[1]/div[@role='presentation']/input[@type='checkbox']";
    public String selectCode="//*[@class='csi-table-header-content' and text()='Code']";
    public String botaoSalvarCores = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'Save')]";
    public String botaoSalvarCor = "//span[@data-csi-act='Save']";
    public String clusterSulComboVar = "//div/div[@role='presentation']/div/div/div/div[3]/input[@aria-autocomplete='both']";


}
