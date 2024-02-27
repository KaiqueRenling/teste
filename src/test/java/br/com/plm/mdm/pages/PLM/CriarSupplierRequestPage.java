package br.com.plm.mdm.pages.PLM;

public class CriarSupplierRequestPage {

    public String viewRenner = "//div[@data-csi-automation='plugin-Collection-Styles-CustomViewSelect']/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@aria-autocomplete='both']";
    public String selectViewRenner = "//div[@data-csi-automation='plugin-PurchasedOrder-Print-CustomViewSelect']//div[@class='dijitReset dijitInputField dijitInputContainer']//input[@aria-autocomplete='both']";
    public String selectViewRennerVar = "//div[@data-csi-context-parent-attr='Hierarchy']//div//div//div[@data-csi-context-parent-attr='Hierarchy']//div//input[@class='dijitReset dijitInputInner']";

    public String textIntegrationStatus = "//*[@class='csi-table-header-content' and text()='Integration Status']";
    public String clicIntegrationStatus = "//span[@data-csi-automation='filter-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";
    public String integrationStatusInput = "(//input[@role='textbox'])[8]";

    public String clicCode = "//span[@class='csi-table-header-content' and text()='Code']";
    // Style Sucesso

    //public String selectStyleSucesso= "//tr[@class='csi-table-row csiHighlight']//td[@class='attrString firstColumn']//a[@class='browse']";
    public String selectStyleSucesso = "(//a[@class='browse'])[56]";

    //Selecionar Sourcing
    public String selectSourcing= "//*[@data-csi-tab-name='Sourcing']";
    //Supplier Request
    public String selectSupplierRequest= "//*[@data-csi-tab-name='Supplier Requests']";
    // Add new Supplier Request
    public String newSupplierRequest= "//*[@class='dijitReset dijitInline dijitButtonText' and text()='New Supplier Request']";

    //public String templateNewRequestSupplierInput= "(//input[@role='textbox'])[9]";
    public String templateNewRequestSupplierInput= "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[3]/td[2]/div[1]/div/div[3]/input[1]";

    //public String supplierNewSupplierRequestInput= "(//input[@role='textbox'])[10]";
    public String supplierNewSupplierRequestInput= "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[4]/td[2]/div[1]/div/div[3]/input[1]";

    //public String dateNewSupplierRequestInput= "(//input[@role='textbox'])[14]";
    public String dateNewSupplierRequestInput= "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[8]/td[2]/div[1]/div/div[3]/input[1]";
    // Save
    public String saveNewSupplierRequest ="//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    // Select Supplier Request Criado
    public String selectSupplierRequestCriado="/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div[3]/div/div[5]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/a";

    // Scrool Right
    public String scroolRight = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[5]/div/div[1]/div[2]/table/tfoot/tr/td/div[1]/table/tbody/tr[2]/td[5]/div";

    // Select Aba Style
    public String selectStyle= "//span[@data-csi-tab-name='Style']";

    //Draft -> Issued
    public String draft= "//*[@title='Issue']";

    // Issued -> Close
    public String issued= "//*[@title='Close']";

    // PDF
    public String pdf="//*[@class='svg-inline--fa fa-file-pdf fa-w-12 dijitInline csiActionIcon']";

    // Add Suppliers
    public String addSuppliers="//*[@class='dijitReset dijitInline dijitButtonText' and text()='Add Suppliers']";

    // Search Supplier
    public String selectStatustext = "//span[@class='csi-table-header-content' and text()='Status']";

    // Save Supplier
    public String saveSupplier="//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

   }
