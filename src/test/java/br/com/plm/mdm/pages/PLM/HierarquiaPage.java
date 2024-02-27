package br.com.plm.mdm.pages.PLM;

import helpers.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HierarquiaPage {
    private WebDriver driver;
    private Waits waits;

    public String welcome = "//*[@class='csi-homepage-welcome csi-flex-grow']";
    public String abaEstilo = "//*[@id='dijit_layout_TabContainer_0_tablist_dijit_layout_ContentPane_2']";
    public String abaEstiloNew = "//*[@data-csi-tab-name='Style']";
    public String sessao ="//*[@class='browse' and contains(text(), 'sessao')]";
    public String divisao ="//*[@class='browse' and text()='divisao']";
    public String grupo ="//*[@class='browse' and text()='grupo']";
    public String subclasse ="//*[@class='browse' and text()='subclasse']";
    public String botaoNovoEstilo = "//div[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'New Style')]";
    public  String botaoAcao = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'New Style')]";
    public  String botaoAcao2 = "//div[normalize-space()='New Style']";

    public String campoReferencia = "//div[@data-csi-automation='field-Style-Form-ProductType']//div[@class='dijitReset dijitInputField dijitInputContainer']";
    public  String campoReferencia1 = "//div[@class='dijit dijitReset dijitInline dijitLeft dijitTextBox dijitComboBox dijitValidationTextBox dijitTextBoxError dijitComboBoxError dijitValidationTextBoxError dijitError']//div[@class='dijitReset dijitInputField dijitInputContainer']";
    public String inputCampoReferencia ="//div[@data-csi-automation='field-Style-Form-ProductType']//input[@class='dijitReset dijitInputInner']";

    public String syleTypeStyle = "//div[@class='dijitReset dijitMenuItem csi-result-selection']//span[contains(text(), Style)]";

    public  String campoMarca0 =  "(//input[@role='textbox'])[12]";
    public String campoMarca = "//div[@data-csi-automation='field-Style-Form-RNR_Style_MarcaPropia_enum']//input[@class='dijitReset dijitInputInner']";
    public  String botaoSalvar = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save & Go']";

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

    public String infoPlmId = "//td[@data-csi-heading='RNR_StyleAttributes_URLStyle_string:Child:Attributes:0']";

    public String btnRefresh = "//*[@data-csi-automation='plugin-Style-Properties-refresh']";
    public String botaoRefresh = "//*[@data-csi-automation='plugin-Collection-Styles-refresh']";
}
