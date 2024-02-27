package br.com.plm.mdm.pages.PLM;

public class RecuperarItemPage {

    public String welcome= "//*[@class='MuiTab-wrapper' and text()='My Home']";
    public String abaEstilo = "//*[@class='MuiTab-wrapper' and text()='Style']";
    public String sessao ="//*[@class='browse' and contains(text(), 'sessao')]";

    public String divisao ="//*[@class='browse' and text()='divisao']";

    public String grupo ="//*[@class='browse' and text()='grupo']";

    public String subclasse ="//*[@class='browse' and text()='subclasse']";

    public String getSessao(String sel_sessao) {
        return sessao.replace("sessao", sel_sessao);
    }
    public String getDivisao(String sel_divisao){
        return divisao.replace("divisao", sel_divisao);
    }
    public String getGrupo(String sel_grupo){
        return grupo.replace("grupo", sel_grupo);
    }
    public String getSubclasse(String sel_subclasse){
        return subclasse.replace("subclasse", sel_subclasse);
    }

    //Actions
    public String btnActions = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'Actions...')]";

    // New Style
    public String btnNewStyle = "//*[@class='dijitReset dijitInline dijitIcon material-icons csi-toolbar-btn-icon-ToolbarNewActions' and contains(text(), 'add')]";

    // Style Type
    public String valueStyleType = "//div[@data-csi-automation='field-Style-Form-ProductType']//input[@role='textbox']";

    // Theme
    public String valueTheme = "//div[@data-csi-automation='field-Style-Form-Theme']//input[@role='textbox']";

    // Brand
    public String valueBrand = "//div[@data-csi-automation='field-Style-Form-RNR_Style_MarcaPropia_enum']//input[@role='textbox']";

    // Select Viewer Cadastro Item
    public String viewCadastroItem = "//*[contains(@class, 'dijitReset dijitInputInner') and contains(@id, 'uniqName_4_275')]";
    public String selectCadastroItem = "//*[@aria-autocomplete='both']";

    //Save
    public String btnSave = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'Save')]";

    // Item a Recuperar
    public String itemRecuperar= "//*[@class='csiHeadingCellLabel' and contains(text(), 'Item Recuperar')]";
    public String itemRecuperarInput= "//div[14]/div/div[1]/div/div/div/div[2]/div[1]/input";

    // Size Range:
    public String sizeRangeText = "//*[@class='csiHeadingCellLabel' and text()='Size Range']";
    public String sizeRangeInput = "//div/div[1]/div/div/div/div[3]/input[1]";

    //Integration Status
    public String infoStatusIntegration = "//*[@class='csiHeadingCellLabel' and text()='Integration Status']";
    public String campoRecuperarInput = "//input[@value='Draft']";

    // Refresh
    public String refresh = "//*[@data-csi-act='ViewRefresh']";
}
