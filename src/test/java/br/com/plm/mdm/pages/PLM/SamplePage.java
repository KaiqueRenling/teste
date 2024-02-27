package br.com.plm.mdm.pages.PLM;

public class SamplePage {

    // viewer
    public String viwerRenner = "//*[@data-csi-automation='plugin-Style-ProductSamples-CustomViewSelect' and @data-csi-act='CustomViewSelect']";
    public String inputSelectViewer = "//div[@data-csi-automation='plugin-Style-ProductSamples-CustomViewSelect']//div//input[@role='textbox']";

    // Clic Samples
    public String clicCampoSamples = "//*[@data-csi-tab-name='Samples' and contains(text(),'Samples')]";
    // Clic New Sample
    public String clicNewSample = "//table[@data-csi-automation='plugin-Style-ProductSamples-ToolbarNewActions']//tbody//tr//td//div//div[contains(text(),'New Sample')]";

    // Supplier
    public String campoSupplier = "//*[@data-csi-automation='field-Sample-Form-Supplier']";

    public String primeiroItem = "//div[@data-csi-automation='field-Sample-Form-Supplier']//div[@item='1']";
    public String inputCampoSupplier = "//div[@data-csi-automation='field-Sample-Form-Supplier']//div//input[@role='textbox']";

    // Semple Type
    public String clicSampleType = "//div[@data-csi-automation='field-Sample-Form-RNR_Sample_TipoAmostra_enum']";
    public String inputSampleType = "(//input[@role='textbox'])[9]";
    public String inputSampleTypeEdit = "(//input[@role='textbox'])[7]";
    // Sample Rewies
    public String clicSampleRewies = "";
    public String inputSampleRewies = "";

    // Save
    public String save = "//span[@data-csi-act='Save']";

    // Delete
    public String delete = "//td//div//span[@data-csi-act='Delete']";
    public String confirmaDelete = "//span//span[contains(text(),'Delete')]";

    // Data
    public String clicDate = "//*[@data-csi-automation='field-Sample-Form-RNR_Sample_Duedate_time']";
    public String inputDate = "(//input[@role='textbox'])[15]";


    // Edit Sample
    public String editSample = "//span[contains(@title,'Edit')][normalize-space()='mode_edit']";

    // Alternate Size Range
    public String clicAlternateSizeRange = "//td//div//div[@data-csi-automation='field-Sample-Form-RequestSampleSizeRange']";
    public String inputAlternateSizeRange = "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[6]/td[2]/div[1]/div/div[3]/input[1]";

}
