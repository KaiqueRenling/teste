package br.com.plm.mdm.pages.PLM;

public class CriarNovoMaterialPage {

    // Material
    public String abaMaterial = "//*[@data-csi-tab-name='Material']";

    // Material New PLM
    public String abaMaterialNew = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div/div[2]/div/button[3]/span";

    // Action
    public String botaoAction="//*[@data-csi-automation='actions-ApparelViews-AllMaterials-root']";

    // Action New Material
    public String botaoActionNewMaterial = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='New Material']";

    // Material Type
    public String inputMaterialTypeFabric ="//*[@id='uniqName_69_0']";

    // Material
    public String inputMaterial ="//*[@id='uniqName_15_12']";

    // Save
    public String clicMaterialSave ="//*[@data-csi-act='Save']";
    public String materialText = "//*[@class='csi-table-header-content' and text()='Material']";
    public String material = "//span[@data-csi-automation='filter-ApparelViews-AllMaterials-Node Name']";
    public String valueMaterial = "//div/div[1]/div/div/div/div[3]/input[1][@class='dijitReset dijitInputInner']";
    public String clicItem="//*[@item='1']";

    // Copy Material
    public String clicCopyMaterial = "//*[@class='csiAction csiActionIcon material-icons' and text()='content_copy']";

    // Save Copy Material
    public String clicSaveCopy = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    // Edit Material Copiado
    public String clicEditMaterial = "//*[@class='csiAction csiActionIcon material-icons' and text()='mode_edit']";

    // Material Edit Value
    public String inputMaterialEdit ="//*[@name='Node Name']";

    // Save Material Editado
    public String clicSaveMaterialEdiatado = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    // Excluir Material Editado
    public String clicDeleteMaterialEditado = "//*[@data-csi-act='Delete']";
    public String clicDeleteMaterial = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Delete']";

    // Criar Nova Reserva
    public String linkNovoProduto ="//*[@data-csi-act='Node Name::0']";
    public String clicLinkNovoProduto = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div[2]/div/div[5]/div/div[1]/div[2]/table/tbody/tr/td[1]/a";

    // Sourcing
    public String tabSourcing = "//*[@data-csi-tab-name='Sourcing']";

    // Viewer Reserva
    public String viewReserva = "//*[contains(@class, 'dijitReset dijitInputInner') and contains(@id, 'uniqName_4_175')]";
    public String selectViewReserva = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[1]/div[3]/input[1][@class='dijitReset dijitInputInner']";
    public String clicItemNovaReserva="//*[@item='1']";

    // Refresh
    public String btnRefresh = "//*[@data-csi-automation='plugin-MaterialSourcing-SupplierItems-refresh']";

    // Action
    public String btnAction="//*[@title='New Supplier Quote']";

    // Action New Supplier Quote...
    public String btnActionNewMaterial = "//*[@class='dijitReset dijitMenuItemLabel' and text()='New Supplier Quote...']";
    public String campoFornecedorFoco = "//*[@class='dijitDialogTitle' and text()='New Supplier Quote']";

    // Supplier
    public String supplier = "//*[@data-csi-automation='field-SupplierItem-Form-Supplier']";
    // Input Supplier
    public String inputSupplier = "//tr[1]/td[2]/div[1]/div/div[3]/input[1][@class='dijitReset dijitInputInner']";

    public String selectItemSupplier= "//input[@value='C340989']";
    // Colors / Sizes
    public String inputColorsSizes = "//tr[3]/td[2]/div[1]/div/div[3]/input[1][@class='dijitReset dijitInputInner']";

    // Input Inicial Date
    public String inputDateInicial = "//tr[6]/td[2]/div[1]/div/div[3]/input[1]";

    // Input Final Date
    public String inputDateFinal = "//tr[7]/td[2]/div[1]/div/div[3]/input[1]";

    // Input Total Quanty Reserva
    public String inputTotalQty = "//div[2]/input[1][@class='dijitReset dijitInputInner']";

    // Input Price
    public String inputPrice = "//tr[9]/td[2]/div[1]/div/div[2]/input[1][@class='dijitReset dijitInputInner']";

    //Save
    public String btnSaveSupplier = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    // Aprovar Supplier
    public String aprovarSupplier = "//*[@class='attrEnum attrEnumRevision.State csi-state csi-state-draft stateDraft iconEditable csi-table-frozen-left']";

    //Status
    public String clicStatusText = "//*[@class='csi-table-header-content' and text()='Status']";

    // Editar
    public String editarSupplier = "//*[@data-csi-act='State:Child:CurrentRevision:0']";
    public String editarSupplierCombo = "//div/div[1]/div/div/div/div[3]/input[1]";

    // Editar Data Final
    public String dataFinalEdit="//*[@data-csi-heading='RNR_SI_Finaldate_time::0']";
    public String inputDateFinalEdit="/html/body/div[15]/div/div[1]/div/div/div/div[3]/input[1]";
    public String clicFinalDateText="//*[@class='csi-table-header-content' and text()='Final Date']";

    // Copy Supplier Aprovado
    public String copySupplierAprovado = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div[2]/div/div[1]/div[2]/div[2]/div[5]/div/div[1]/div[2]/table/tbody/tr/td[28]/div/span[2]";

    // Save
    public String btnSaveSupplierAprovado = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    // Deletar Supplier Draft
    public String deletarSupplier = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div[2]/div/div[1]/div[2]/div[2]/div[5]/div/div[1]/div[2]/table/tbody/tr[2]/td[28]/div/span[5]";

    // Save
    public String btnDeletarSupplier = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Delete']";

    public String clicStatus = "//*[@class='csi-table-header-content' and text()='Status']";
}
