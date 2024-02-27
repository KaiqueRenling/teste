package br.com.plm.mdm.pages.PLM;

public class TesteQualidadePage {

    public String abaQuality = "//*[@data-csi-tab-name='Quality']";

    public String newTestRunn = "(//div[@role='presentation'][normalize-space()='New Test Run'])[1]";

    public String save = "//span[normalize-space()='Save']";

    public String selecionaLinhaTest = "//tbody/tr[contains(@class,'csiSelected')]/td[3]/a[1]";
    public String clicCampoCode="(//a[contains(@class,'browse')])[7]";
    public String textIntegrationStatus = "//*[@class='csi-table-header-content' and text()='Integration Status']";
    public String clicIntegrationStatus = "//span[@data-csi-automation='filter-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";
    public String clicCode = "//span[@class='csi-table-header-content' and text()='Code']";
    public String integrationStatusInput = "(//input[@role='textbox'])[8]";

    public String abaTests = "//*[@data-csi-tab-name='Tests']";
    public String newFromTestSpecs = "//div[@id='uniqName_29_12_button']//div[@role='presentation' and text()='add']";

    public String selecionarTipotest = "//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr[3]/td[1]/div/input";
    public String selecionarTipotest2 = "//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr[2]/td[1]/div/input";
    public String salvarTipoTest = "//span[@class='dijit dijitReset dijitInline csiAction csi-primary-btn csiEnableOnChange dijitButton']//span[@class='dijitReset dijitInline dijitButtonText']";

    // TestStatus
    //public String campoTestStatus = "//table//tbody//tr[@class='csi-table-row csiSelected csiHighlight']//td[@data-csi-heading='Status::0']";
    public String campoTestStatus = "//div[3]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[5]/div/div[1]/div[2]/table/tbody/tr[1]/td[3]";
    public String inputCampoTestStatus = "//div//div//div[@data-csi-automation='edit-TestRunRevision-TestsBySection-Status:']//input[@role='textbox']";
    public String clicAbaTds = "//*[@data-csi-tab-name='TDS']";

    // Actions
    public String actions = "//*[@title='Actions']";

    public String comments = "(//td[@class='attrString attrStringTextarea iconEditable'])[1]";
    public String commentsTextArea = "//*[@data-csi-automation='edit-TestRunRevision-TestsBySection-Comment:']";
}
