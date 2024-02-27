package br.com.plm.mdm.pages.PLM;

public class AprovarItemPage {

    public String abaStyle = "//*[@data-csi-tab-name='Style']";
    public String abaPropriedades = "//*[@data-csi-tab-name='Properties']";
    public String botaoRefresh = "//*[@data-csi-automation='plugin-Style-Properties-refresh']";
    public String botaoView = "//span[@data-csi-automation='plugin-Style-Properties-CustomViewActions']/span/span/span[@class='dijitReset dijitInline dijitButtonText' and text()='Views']";
    public String inputView = "//div[@data-csi-automation='plugin-Style-Properties-CustomViewSelect']/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@type='text']";
    public String botaoAprovarItem = "//*[@data-csi-act='RNR_Integration_Status_string:Child:Attributes:0']";
    public String abaPropriedadesExistente = "//button[contains (text(), 'Properties')]";
    public String campoSubmeter = "//*[@data-csi-act='RNR_Integration_Status_string:Child:Attributes:0']";
    public String inputCampoSubmeter = "//div[@class='MuiAutocomplete-root Mui-focused MuiAutocomplete-hasPopupIcon SingleSelectendAdornmentInline   css-1ioq4ac']//input[@id='csi-automation-inline-singleselect']";
    public String botaoRefreshItemExistente = "//*[@data-csi-automation='plugin-Style-Properties-refresh']";
    // Issues
    public String abaIssues = "//*[@data-csi-tab-name='Issues']";
    public String commentIssuesError = "//*[@data-csi-heading='Comment::0']";
    public String integrationStatusValorText = "//*[@data-csi-heading='RNR_PurchasedOrder_Statusintegracion_enum::0']";

    //Xpath para Log
    public String infoStatusIntegration = "//td[@data-csi-heading='RNR_Integration_Status_string:Child:Attributes:0']";
    public String infoStatusIntegrationTime = "//td[@data-csi-heading='RNR_Styleatt_Integrstatusbr_time:Child:Attributes:0']";
    public String infoSubmitStatusTime = "//td[@data-csi-heading='RNR_Integration_Status_time:Child:Attributes:0']";

    // Item PAI
    public String infoRmsId = "//td[@data-csi-heading='RNR_INT_Styleatt_Idprodutorms_string:Child:Attributes:0']";
    public String infoMdmId = "//td[@data-csi-heading='RNR_INT_Styleatt_Idprodutomdm_string:Child:Attributes:0']";
    public String infoPlmId = "//td[@data-csi-heading='RNR_StyleAttributes_URLStyle_string:Child:Attributes:0']";

}
