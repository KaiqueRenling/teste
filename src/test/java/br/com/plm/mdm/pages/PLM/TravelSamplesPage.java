package br.com.plm.mdm.pages.PLM;

public class TravelSamplesPage {
    public String textIntegrationStatus = "//*[@class='csi-table-header-content' and text()='Integration Status']";
    public String clicIntegrationStatus = "//span[@data-csi-automation='filter-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";
    public String integrationStatusInput = "(//input[@role='textbox'])[8]";
    public String viewRenner = "//div[@data-csi-automation='plugin-Collection-Styles-CustomViewSelect']/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@aria-autocomplete='both']";
    public String selectViewRenner = "//div[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect']//div[@class='dijitReset dijitInputField dijitInputContainer']//input[@aria-autocomplete='both']";
    public String selectViewRennerVar = "//div[@data-csi-context-parent-attr='Hierarchy']//div//div//div[@data-csi-context-parent-attr='Hierarchy']//div//input[@class='dijitReset dijitInputInner']";

    // Style Sucesso
    public String selectStyleSucesso= "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[2]/div[2]/div[5]/div/div[1]/div[2]/table/tbody/tr[1]/td[4]/a";

    // Travel Samples
    public String selectTravelSamples ="//*[@data-csi-tab-name='Travel Samples']";

    // New Competity Style
    public String newCompetityStyle = "//*[@class='dijitReset dijitInline dijitIcon material-icons csi-toolbar-btn-icon-ToolbarNewActions' and text()='add']";

    //Acervo
    public String acervoInput="(//input[@role='textbox'])[8]";

    //Categoria Acervo
    public String categoriaAcervoInput="(//input[@role='textbox'])[9]";

    //Division
    public String divisionInput="(//input[@role='textbox'])[10]";

    //LifeStyle
    public String lifeStyleInput="(//input[@role='textbox'])[11]";

    //Seal
    public String sealInput="//input[@name='RNR_CompetitiveStyle_Lacra_string']";

    // Save
    public String save = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";


}
