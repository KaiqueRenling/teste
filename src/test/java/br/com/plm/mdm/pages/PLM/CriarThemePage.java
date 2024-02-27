package br.com.plm.mdm.pages.PLM;

public class CriarThemePage {

    public String clicShapeAndTheme = "//*[@data-csi-tab-name='Shape and Theme']";
    public String clicTheme = "//*[@data-csi-tab-name='Themes']";
    public String addNewTheme = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='New Theme']";

    public String inputSubType = "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/div[1]/div/div[3]/input[1]";
    public String inputThemeMaster = "//input[@name='ThemeMaster/Node Name']";
    public String inputTheme = "//input[@name='Node Name']";
    public String inputOriginalSeason = "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[4]/td[2]/div[1]/div/div[3]/input[1]";
    public String inputTipo = "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[5]/td[2]/div[1]/div/div[3]/input[1]";
    public String inputSeasons = "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[6]/td[2]/div[1]/div/div[3]/input[1]";
    public String inputSeasonsFW22="/html/body/div[21]/div/div[3]/div/input";
    public String inputSeasonsFW23="/html/body/div[13]/div/div[3]/div/input";

    // Season Copy
    public String inputSeasonsCopy = "(//input[@role='textbox'])[9]";
    public String inputSeasonsCopyFW22="/html/body/div[13]/div/div[3]/div/input";
    public String inputSeasonsCopyFw23="/html/body/div[14]/div/div[3]/div/input";
    public String inputSeasonsCopyBasics="/html/body/div[13]/div/div[3]/div/input";


    public String inputDivision = "//div/div[2]/form/div[1]/div[1]/div[2]/div/table/tbody/tr[7]/td[2]/div[1]/div/div[3]/input[1]";

    // Salvar
    public String clicSave = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    // Salvar
    public String clicSaveCopy = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";


    // Selected theme
    public String selectTheme="/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div[3]/div/div[5]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/a";

    // Selecionar Theme
    public String selecionarTheme  = "//tbody/tr[1]/td[2]/div[1]/a[1]";

    // Aba General
    public String  abaGeneral = "//*[@data-csi-tab-name='General']";

    //New from Color Specification
    public String addNewfromColorSpecification="/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div[1]/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/table[1]/tbody/tr/td[1]/div/div[2]";

    public String  textTextura = "//*[@class='csiHeadingCellLabel' and text()='Textura']";
    public String campoActions  = "//th[@data-csi-table-sid='8']//div//span[@class='csi-table-header-content' and text()='Actions']";
    public String campoDelete  = "(//span[contains(@title,'Delete')])[1]";
    public String confirmaDelete  = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Delete']";


    public String  campoTextura = "//*[@data-csi-act='RNR_MaterialPlan_Textura_richtext::0']";
    public String  inputCampoTextura = "//*[@data-csi-automation='edit-Theme-Properties-RNR_MaterialPlan_Textura_richtext:']";
    // Select Lime Gin
    public String limeGin="//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr[2]/td[1]/div/input";
    // Select Lolli POP
    public String lolliPop="//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr[3]/td[1]/div/input";
    // select Marinho Intenso
    public String marinhoIntenso="//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr[4]/td[1]/div/input";
    // Blue Oil
    public String blueOil="//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr[5]/td[1]/div/input";
    // Fluchsia
    public String fluchsia="//div/div[2]/div/div[4]/div/div/div[2]/table/tbody/tr[6]/td[1]/div/input";

    // Save Cor
    public String saveCor = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    // Theme Colorway Gallery
    public String themeColorwayGallery="//*[@data-csi-tab-name='Theme Colorway Color Gallery']";

    //Home
    public String clicHome= "//*[@class='dijitInline material-icons csi-material-icon-home' and text()='home']";

    // Edit
    public String editTheme="(//span[@title='Edit'][normalize-space()='mode_edit'])[1]";

    // Copy
    public String clicCopy="(//span[@title='Copy'][normalize-space()='content_copy'])[1]";

    // Del
    public String clicDel="/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div/div/div[5]/div/div[1]/div[2]/table/tbody/tr[1]/td[15]/div/span[3]";

    // Del Copy
    public String clicDelCopy=" /html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div/div/div[5]/div/div[1]/div[2]/table/tbody/tr[2]/td[15]/div/span[3]";

    // Save Delete
    public String saveDelete="//*[@class='dijitReset dijitInline dijitButtonText' and text()='Delete']";

}
