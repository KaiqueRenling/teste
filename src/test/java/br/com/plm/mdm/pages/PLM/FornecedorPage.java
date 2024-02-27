package br.com.plm.mdm.pages.PLM;

public class FornecedorPage {

    public String abaSourcing = "//*[@data-csi-tab-name='Sourcing']";
    public String designatedSupplier ="//*[@data-csi-act='DesignatedProductSource::0']";
    public String designatedSupplierVariavel ="//*[contains(text(),'Designated Supplier')]";
    public String inputSupplier2 = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]";

    public String inputSupplier = "//div[@class='MuiFormControl-root MuiFormControl-fullWidth MuiTextField-root InlineTextFieldtextFieldClass css-1dsd6ko']//input[@id='csi-automation-inline-singleselect']";

    public String inputSupplierOption0 = "//div[@class='MuiTypography-root MuiTypography-body1 MuiTypography-noWrap css-cussxj']//li[@id='csi-automation-inline-singleselect-option-0']";

    public String btnRefreshSupplier = "//span[@data-csi-automation='plugin-StyleSourcing-QuoteProperties-refresh']//span[contains(text(), 'refresh')]";
    public String inputSupplierVariavel = "//div/div[@role='presentation']/div/div/div/div/input[@aria-autocomplete='both']";

    public String clicAgent = "//*[@class='csi-table-header-content' and text()='Agent']";

    public String sumario = "//*[@class='csi-view-title csi-view-title-StyleSourcing-SupplierItems' and text()='Supplier Quotes']";

    public String inputSupplierVazio = "//div[@class='MuiTypography-root MuiTypography-body1 MuiTypography-noWrap css-cussxj']//li[@id='csi-automation-inline-singleselect-option-0']";
    public String fornecedor0 = "//div[@item='0']";
    public String botaoAcaoSupplier = "//*[@data-csi-automation='plugin-StyleSourcing-SupplierItems-ToolbarNewActions']";
    public String botaoNewSupplier = "//*[@class='dijitReset dijitInline dijitIcon material-icons csi-toolbar-btn-icon-ToolbarNewActions' and text()='add']";

    public String campodatainicial = "//tr[6]/td[2]/div[1]/div/div[3]/input[1]";
    public String campodatafinal = "//tr[7]/td[2]/div[1]/div/div[3]/input[1]";
    public String campoReserva = "//div[2]/input[1][@class='dijitReset dijitInputInner']";
    public String campoPreco = "//tr[9]/td[2]/div[1]/div/div[2]/input[1]";

    public String botaoSalvarSupplier = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";
    public String aprovarSupplier = "//td[@data-csi-act='State:Child:CurrentRevision:0']";
    public String aprovarSupplierCombo = "//div[@role='alertdialog']/div[1]/div/div/div/div[3]/input[1][@aria-autocomplete='both']";

    public String inputStatusSupplier = "//div[@aria-owns='csi-automation-inline-singleselect-listbox']//input[@id='csi-automation-inline-singleselect']";

    public String StatusSupplierOption0 = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAutocomplete-paper css-19wjvku']//li[@id='csi-automation-inline-singleselect-option-0']";

    public String aprovarSupplierVar = "//td[@data-csi-act='State:Child:CurrentRevision:0']";
    public String aprovarSupplierComboVar = "//div[@role='alertdialog']/div[1]/div/div/div/div[3]/input[1][@aria-autocomplete='both']";

}
