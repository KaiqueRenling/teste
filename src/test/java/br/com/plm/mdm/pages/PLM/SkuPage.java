package br.com.plm.mdm.pages.PLM;

public class SkuPage {
    public String itemPai = "//*[contains(text(),'Item Pai')]";

    public String  mdmIdText = "//*[contains(text(),'MDM ID')]";
    //public String campoMdmIdValue = "";
    //public String campoItemPai = "";
    public String campoItemPaiText = "//*[contains(text(),'Item Pai')]";

    public String campoItemPai = "//*[@data-csi-heading='RNR_INT_Styleatt_Idprodutorms_string:Child:Attributes:0']";

    public String campoMdmId = "//*[@data-csi-heading='RNR_INT_Styleatt_Idprodutomdm_string:Child:Attributes:0']";

    public String mdmId = "//*[contains(text(),'MDM ID')]";
    public String abaStyle = "//*[@data-csi-tab-name='Style']";

    public String btnF5 = "//body";
    public String abaSku = "//button[normalize-space()='SKUs']";
    public String botaoAcaoSku = "(//div[@role='presentation'][normalize-space()='New Style SKU'])[1]";

    public String btnRefreshSKUStyle = "//span[@data-csi-automation='plugin-Style-ProductSKU-refresh']//span[contains(text(), 'refresh')]";
    public String botaoSalvarSku = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";
    public String supplier = "//*[@data-csi-tab-name='Sourcing']";
    public String botaoAddSupplier = "//div[@class='dijitReset dijitInline dijitButtonText']";

    public String addSupplierInput = "//tr[1]/td[2]/div[1]/div/div[3]/input[1]";
    public String supplierItem = "//div[@item='1']";

    public String initialDate = "//tr[6]/td[2]/div[1]/div/div[3]/input[1]";
    public String finalDate = "//tr[7]/td[2]/div[1]/div/div[3]/input[1]";
    public String totalQuantity ="//input[@value='0.00']";
    public String priceInput = "//tbody/tr[9]/td[2]/div[1]/div[1]/div[2]/input[1]";
    public String botaoSalvarSupplier = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";
    public String aprovarSupplier = "//*[@class='attrEnum attrEnumRevision.State csi-state csi-state-draft stateDraft iconEditable csi-table-frozen-left']";
    public String aprovarSupplierCombo = "/html/body/div[19]/div/div[1]/div/div/div/div[3]/input[1]";
    public String statusText = "//*[@class='csi-table-header-content' and text()='Status']";

    public String abaColorways = "//*[@data-csi-tab-name='Colorways']";
    public String botaoAcaoColorways = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'New from Color Specification')]";

    public String btnHabilitarFIltroColorway = "(//span[@class='dijitReset dijitInline dijitButtonNode']//span[@class='dijitReset dijitInline dijitIcon material-icons' and contains(text(), 'filter_list')])[2]";


    public String botaoAddFiltroColunaColor = "(//div[@class='csi-batch-filter-container-buttons']//span[@class='dijitReset dijitInline dijitIcon material-icons'])[2]";

    public String filterselecionarColorSpecification = "//div[contains(text(), 'Color Specification') and @item='0']";

    public String inputSelecaoDoColorway = "//div[@class='dijit dijitReset dijitInline dijitLeft csi-filter-in-dropdown-textbox dijitTextBox dijitTextBoxFocused dijitFocused']//input[@class='dijitReset dijitInputInner']";

    public String checkboxColorwayOption0 = "//div[@class='dijit dijitReset dijitInline dijitCheckBox']//input[@role='__addNewButton']";

    public String btnShowResultsColorway = "//span[@class='dijit dijitReset dijitInline csi-secondary-btn csi-show-results-btn dijitButton']//span[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'Show Results')]";
    public String tituloAncora = "//*[@class='csiHeadingCellLabel' and contains(text(), 'Integration Status')]";
    public String corEspecifica = "//*[@class='attrString firstColumn' ]";
    public String selectCorInput = "//tbody/tr[2]/td[1]/div[1]/input[1]";

    public String checkboxConfirmarColorway = "//div[@class='dijit dijitReset dijitInline dijitCheckBox' and @data-csi-act='ViewSelect']//input[@class='dijitReset dijitCheckBoxInput']";

    public String btnFiltroColorSpecification = "//span[@data-csi-automation='filter-ApparelViews-ProductColorSpecs-Node Name']//span[@class='dijitReset dijitStretch dijitButtonContents dijitDownArrowButton']";

    public String btnRefreshColorSpecification = "//span[@data-csi-automation='plugin-ApparelViews-ProductColorSpecs-refresh']//span[@class='dijitReset dijitStretch dijitButtonContents']";

    public String inputFiltroColorSpecification = "//div[@class='dijitTooltipContents dijitTooltipFocusNode']//input[@data-csi-automation='values-ApparelViews-ProductColorSpecs-Node Name']";

    public String selectColorOption0Filter = "//div[@class='dijitReset dijitMenuItem dijitMenuItemSelected' and @item='0']//input[@role='__addNewButton']";

    public String clicCampoColorSpecification = "//th[@class='csi-table-sort csi-table-frozen-end']//div[@class='csi-table-header-container']";

    public String clicCampoDescription = "//th[@class='csi-table-sort']//span[contains(text(), 'Description')]";
    //public String inputCampoColorSpecification = "//input[@data-csi-automation='values-ApparelViews-ProductColorSpecs-Node Name']";
    public String inputCampoColorSpecification = "//div[@role='presentation']//div//div//div//input[@data-csi-automation='values-ApparelViews-ProductColorSpecs-Node Name']";

    // begin Old
    public String selectCorInputVar = "(//input[@role='checkbox'])[4]";
    public String selectCorInputVar1 = "(//input[@role='checkbox'])[5]";
    public String selectCorInputVar2 = "(//input[@role='checkbox'])[6]";
    // end Old

    // Campo Code
    public String selectCode="//*[@class='csi-table-header-content' and text()='Code']";

    //public String selectTextBox= "//div[@item='0']";
    public String selectTextBox= "//div[@data-csi-automation='values-ApparelViews-ProductColorSpecs-Node Name']//div[@item='0']";

    public String selectFirstColumn= "//th[@class='csi-table-selection-column noexport firstColumn']/div";
    public String selectSecondColumn= "//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr/td[1]/div[@role='presentation']/input[@type='checkbox']";
    public String selectThirdColumn= "//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr/td[1]/div[@role='presentation']/input[@type='checkbox']";

    //public String selectFirstColumn= "//div[@class='dijit dijitReset dijitInline dijitCheckBox dijitCheckBoxHover dijitHover dijitCheckBoxFocused dijitCheckBoxHoverFocused dijitHoverFocused dijitFocused']//input[@role='checkbox']";
    //public String selectSecondColumn= "//div[@class='dijit dijitReset dijitInline dijitCheckBox dijitCheckBoxHover dijitHover dijitCheckBoxFocused dijitCheckBoxHoverFocused dijitHoverFocused dijitFocused']//input[@role='checkbox']";
    //public String selectThirdColumn= "//div[@class='dijit dijitReset dijitInline dijitCheckBox dijitCheckBoxHover dijitHover dijitCheckBoxFocused dijitCheckBoxHoverFocused dijitHoverFocused dijitFocused']//input[@role='checkbox']";

    public String clicColorSpecification="//span[@class='csi-table-header-content' and text()='Color Specification']";
    public String getCorEspecifica(String sel_cor){       return corEspecifica.replace("Color Specification:", sel_cor);
    }

    public String botaoSalvarCor = "//span[@data-csi-act='Save']";
    //public String botaoSalvarCor = "//span[@class='dijitReset dijitInline dijitButtonText' and contains(text(),'Save')]";
    public String botaoSalvarCores = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'Save')]";

    public String botaoSalvarCores1 = "//button[contains(text(), 'Save')]";

    public String btnSaveNewFromColor = "//span[contains(text(), 'Save')]";


    public String clusterSul = "//*[@data-csi-act='RNR_ColorwayAttributes_ClusterSUL_enum:Child:Attributes:0']";
    public String clusterSulCombo = "//div[@data-csi-automation='edit-Style-ProductColors-RNR_ColorwayAttributes_ClusterSUL_enum:Child:Attributes']//div//input[@role='textbox']";

    public String inputClusterSul = "//div[@class='MuiAutocomplete-root Mui-focused MuiAutocomplete-hasPopupIcon SingleSelectendAdornmentInline   css-1ioq4ac']//input[@id='csi-automation-inline-singleselect']";

    public String clusterOption0 = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAutocomplete-paper css-19wjvku']//li[@id='csi-automation-inline-singleselect-option-0']";
    public String infoPlmId = "//td[@data-csi-heading='RNR_StyleAttributes_URLStyle_string:Child:Attributes:0']";

    // variavel para automação com 3 coloways

    public String clusterSulComboVar = "//div/div[@role='presentation']/div/div/div/div[3]/input[@aria-autocomplete='both']";
    public String clusterSulComboVar1= "//div/div[@role='presentation']/div/div/div/div[3]/input[@aria-autocomplete='both']";
    public String clusterSulComboVar2 = "//div/div[@role='presentation']/div/div/div/div[3]/input[@aria-autocomplete='both']";

    // Cluster Arg
    public String clusterArg = "//*[@data-csi-act='RNR_ColorwayAttributes_ClusterARG_enum:Child:Attributes:0']";
    public String clusterArg1 = "//*[@data-csi-act='RNR_ColorwayAttributes_ClusterARG_enum:Child:Attributes:0']";
    public String clusterArg2 = "//*[@data-csi-act='RNR_ColorwayAttributes_ClusterARG_enum:Child:Attributes:0']";


}
