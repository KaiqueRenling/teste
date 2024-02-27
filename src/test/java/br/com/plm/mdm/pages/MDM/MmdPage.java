package br.com.plm.mdm.pages.MDM;

public class MmdPage {

    public String caixaEntrada="//*[@class='_ebx-link-tree_item-is-selected']";

    public String inboxPerspectivaRenner="//span[normalize-space()='Caixa de Entrada']";

    public String inboxFluxoTrabalhoConcluidos="//span[normalize-space()='Fluxos de trabalho concluídos']";

    public String inboxFluxoTrabalhoAtivos="//span[normalize-space()='Fluxos de trabalho ativos']";

    public String roleRenner="//button[@title='Select perspective']//*[name()='svg']";

    public String perspectivaRenner="//span[normalize-space()='Perspectiva Renner']";

    public String views="//button[@type='button' and text()='View']";

    public String viewsTodosWorkflows = "//li[@id='yui-gen27']";

    public String viewsTodosWorkflowsAtivos = "//li[@id='yui-gen29']";

    public String viewsTodosWorkflowsCompletados = "//li[@id='yui-gen23']";

    public String filtroPesquisa="//button[@id='ebx_filtersButton']//span[@class='ebx_Icon']";

    public String idProdutoPlm = "//input[@name='___40_xtTypedFilterCriterion_5f_ebx_5f_generatedId_5f_564__typedObjectValue__stringValue']";

    public String clicApply ="//button[@id='FILTER_0_applyButton']";

    public String actionsTakeandStart = "//button[@id='ebx_generatedId_638']";
     public String aprovarStyle = "//div//div//div//button[@id='ebx_MDMComponent_AcceptButton']";

    // Informações de Rejeicao
    public String informacoesRejeicao ="//span[normalize-space()='Informações de Rejeição']";
    public String rejeitarStyle = "//button[normalize-space()='Rejeitar']";

    public String abaInformacoesdeRejeicao = "//button[@id='ebx_generatedId_1087']//span[@class='ebx_Icon']";

    public String templateInformacoesdeRejeicao = "//button[@id='ebx_generatedId_1087']//span[@class='ebx_Icon']";

    public String clicSelecionarTemplate = "//select[@id='___40_cfvAO__templateSelection']";
    public String selecionarTemplate = "//select[@id='___40_cfvAO__templateSelection']";
    public String aprovarStyleOk = "//button[@id='ebx_generatedId_2']";

    public String save = "//button[@id='ebx_generatedId_18']";
    public String saveClose = "//button[@id='ebx_generatedId_19']";

    public String rejeitarStyleOk = "//button[@id='ebx_generatedId_2']";

    // Select div
    public String selectTest= "//*[@class='ebx_tvFocusFlag']";

    // Input
    public String input="(//i[@class='fa fa-eye'])[1]";

    // Informções de Rejeição
    public String infoRejeicoes = "//*[@id='ebx_generatedId_603']";

    public String selectNivelItemPaiText = "//*[contains(text(),'PAI')]";
    //public String selectCheckBoxItemPai = "//tbody/tr[1]/td[1]/label[1]/input[1]";
    public String selectCheckBoxItemPai = "//table//tbody//tr[1]//td[1]//label//input";

    public String selectView = "//button[@id='ebx_generatedId_113']//i[@class='fa fa-eye']";
    // Select Template 4
    public String selectTemplate4 = "//select[@name='___40_cfvAO__templateSelection']";

    // Save Template
    public String saveTemplate = "(//button[normalize-space()='Save'])[1]";

    // Save and Close
    public String saveAndClose = "//button[@title='Save and go back to the table']";

    // Informções do Produto Fiscal
    public String tipoProdutoComercial="//input[@id='___40_cfvAO__import__productTypeFiscal']";
    public String salvarTipoProdutoFiscal = "(//button[normalize-space()='Save'])[1]";

    public String selecionarItem = "//*[@id='ebx_ISS_Item_0']";

}
