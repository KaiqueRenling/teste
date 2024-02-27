package br.com.plm.mdm.pages.PLM;

public class ArtWorkPage {

    public String grupo ="//*[@class='browse' and text()='grupo']";
    public String textSubmitStatusTime = "//*[@class='csi-table-header-content' and text()='Submit Status Time']";
    public String textIntegrationStatus = "//*[@class='csi-table-header-content' and text()='Integration Status']";
    public String clicIntegrationStatus = "//span[@data-csi-automation='filter-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";
    public String integrationStatusInput = "//input[@data-csi-automation='values-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";
    // Style Sucesso
    public String selectStyleSucesso= "//tbody/tr[1]/td[1]/a[1]";

    //Selecionar Specification
    public String selectSpecification= "//*[@data-csi-tab-name='Specification']";

    //Supplier Request
    public String selectArtWork= "//*[@data-csi-tab-name='Artwork']";

    // Btn New ArtWork
    public String btnArtWork = "(//div[@role='presentation'][normalize-space()='New Artwork'])[1]";

    // Input Name ArtWork
    public String inputNameArtWork ="//textarea[@value='Artwork']";

    // Novo ArtWork
    public String inputNovoArtWork ="(//input[@role='textbox'])[1]";

    // Clic ArtWork Text
    public String clicArtWork ="//span[@class='csi-table-header-content'  and text()='Artwork Name']";

    // btn Actions
    public String actionsApprove = "//span[normalize-space()='Actions']";
    public String actionsClicNewArtWork = "//div[normalize-space()='Novo Artwork']";

    // Clic Approve
    public String clicApproved = "//*[@class='dijitReset dijitMenuItemLabel' and text()='Approve']";

    // Selected Novo ArtWork
    public String selectedNovoArtWork = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div/div/div[5]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/a";

    // Campo Technical Detail
    public String technicalDetailText = "//*[@class='csiHeadingCellLabel' and text()='Technical Detail']";

    public String campoTechnicalDetail = "//*[@data-csi-act='RNR_Artwork_TecnicaDetalle_string:Child:__Parent__:0']";
    public String inputTechnicalDetail = "//textarea[@data-csi-automation='edit-ArtworkRevision-Properties-RNR_Artwork_TecnicaDetalle_string:Child:__Parent__']";

    // Clic Approve
    public String selectApprove = "//td[normalize-space()='Approve']";
    //public String clicApprove = "//tr[@data-csi-automation='plugin-Artwork-Breadcrumb-EndPhase']//td[@class='dijitReset dijitMenuItemLabel' and text()='Approve']";

    // Clic Approve
    //public String clicApprove = "//div[@class='dijitPopup dijitMenuPopup csi-left-menu']//table//tbody//tr[5]//td[2]";
    public String clicApprove = "//tr[@data-csi-act='EndPhase']//td[2]";

    // Clic Delete
    public String deleteArtWork = "//td//div//span[@data-csi-act='Delete']";

    public String delete="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Delete']";

    public String viewRenner = "//div[@data-csi-automation='plugin-Collection-Styles-CustomViewSelect']/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@aria-autocomplete='both']";
    public String selectViewRenner = "//div[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect']//div[@class='dijitReset dijitInputField dijitInputContainer']//input[@aria-autocomplete='both']";
    public String selectViewRennerVar = "//div[@data-csi-context-parent-attr='Hierarchy']//div//div//div[@data-csi-context-parent-attr='Hierarchy']//div//input[@class='dijitReset dijitInputInner']";


}
