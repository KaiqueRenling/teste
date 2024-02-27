package br.com.plm.mdm.interactions.PLM;

import br.com.renner.robots.IRNRobotsTool;
import helpers.FilesOperation;
import helpers.Utils;
import br.com.plm.mdm.pages.PLM.TravelSamplesPage;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;

public class CriarTravelSamplesInteractions extends TravelSamplesPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    Utils utils;

    public void criarTravelSamples_() throws Exception {


        //Style
        driverWEB.click(" //*[@data-csi-tab-name='Style']");
        Thread.sleep(2000);

        //Travel Sample
        driverWEB.click("//*[@data-csi-tab-name='Travel Samples']");
        Thread.sleep(2000);

        //New Competitive Style
        driverWEB.click("//div[@aria-labelledby='uniqName_29_1_label']//div[@class='dijitReset dijitInline dijitButtonText']");
        Thread.sleep(2000);

        //Acervo
        driverWEB.setText("(//input[contains(@role,'textbox')])[19]", "Acervo 04");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-csi-form-field='RNR_CompetitiveStyle_Acervo_enum']//th");

        //Categoria Acerso
        driverWEB.setText("(//input[contains(@role,'textbox')])[20]", "ACESSORIOS");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-csi-form-field='RNR_CompetitiveStyle_CategoriaAcervo_enum']//th");

        //Division
        driverWEB.setText("(//input[contains(@role,'textbox')])[21]", "BELEZA");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-csi-form-field='RNR_CompetitiveStyle_Division_enum']//th");

        //LifeStyle
        driverWEB.setText("//div[@data-csi-automation='field-CompetitiveStyle-Form-RNR_CompetitiveStyle_LyfeStyle_enum']//input[@role='textbox']", "ACCESSORIES");
        Thread.sleep(2000);
        driverWEB.click("//*[@data-csi-form-field='RNR_CompetitiveStyle_LyfeStyle_enum']//th");

        // Seal
        driverWEB.setText("//input[contains(@name,'RNR_CompetitiveStyle_Lacra_string')]", "Seal");
        Thread.sleep(2000);

        //Save
        driverWEB.click("//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']");
        Thread.sleep(2000);

        // Entra no Sample
        driverWEB.click("/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div[3]/div/div[5]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/a");
        Thread.sleep(2000);

        //Bought by :
        driverWEB.click("//*[@data-csi-act='RNR_CompetitiveStyle_Comprador_string::0']");
        driverWEB.setText("//textarea[@data-csi-automation='edit-CompetitiveStyle-Properties-RNR_CompetitiveStyle_Comprador_string:']", "Bought by");
        Thread.sleep(2000);

        //Descrição :
        driverWEB.click("//*[@data-csi-act='Description::0']");
        driverWEB.setText("//textarea[@data-csi-automation='edit-CompetitiveStyle-Properties-Description:']", "Descrição");
        Thread.sleep(2000);

        //Store :
        driverWEB.click("//*[@data-csi-act='RNR_CompetitiveStyle_Loja_string::0']");
        driverWEB.setText("//textarea[@data-csi-automation='edit-CompetitiveStyle-Properties-RNR_CompetitiveStyle_Loja_string:']", "Store");
        Thread.sleep(2000);

        //City of Origin :
        driverWEB.click("//*[@data-csi-act='RNR_CompetitiveStyle_CidadedeOrigem_string::0']");
        driverWEB.setText("//textarea[@data-csi-automation='edit-CompetitiveStyle-Properties-RNR_CompetitiveStyle_CidadedeOrigem_string:']", "City of Origin");
        Thread.sleep(2000);

        //NF/Invoice :
        driverWEB.click("//*[@data-csi-act='RNR_NotaFiscal_string::0']");
        driverWEB.setText("//textarea[@data-csi-automation='edit-CompetitiveStyle-Properties-RNR_NotaFiscal_string:']", "NF/Invoice");
        Thread.sleep(5000);

        String nomeSampleTravelSample = driverWEB.getText("//*[@data-csi-heading='Node Name::0']");
        FilesOperation filesOperation = new FilesOperation();
        filesOperation.setProperties("sample", "ID",nomeSampleTravelSample);

        driverWEB.click("//*[@data-csi-heading='Node Name::0']");
        Thread.sleep(12000);

    }

    public void adicionarSampleATravelSamples() throws Exception {

        Thread.sleep(2000);
        FilesOperation filesOperation = new FilesOperation();
        String codSamplePLM=  filesOperation.getProperties("sample").getProperty("ID");

        Utils.addLog(scenario,"Etapa: Código Sample");

        // Clicar em um item no campo CODE
        driverWEB.click("//tr[contains(@class,'csiHighlight')]//td[contains(@class,'attrString')]//a[contains(@class,'browse')]"); Thread.sleep(2000);
        // clicar na Aba Travel Sample
        driverWEB.click("//*[@data-csi-tab-name='Travel Samples']"); Thread.sleep(2000);

        // Selecionar New Competitive Sample
        driverWEB.click("/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div[1]/div/table[1]/tbody/tr/td[2]"); Thread.sleep(1000);
        // Buscar o Sample que foi criado anteriomente
        driverWEB.click("//tr[@aria-label='Select Competitive Styles ']//td[2]"); Thread.sleep(2000);

        // Pesquisar
        driverWEB.click("//span[@data-csi-automation='filter-ApparelViews-CompetitiveStyles-Node Name']");Thread.sleep(2000);
        driverWEB.click("//th[@class='csi-table-sort csi-table-frozen-end']//div[@class='csi-table-header-container']");Thread.sleep(2000);
        driverWEB.click("//span[@data-csi-automation='filter-ApparelViews-CompetitiveStyles-Node Name']");Thread.sleep(4000);
        driverWEB.setText("//div[@data-csi-automation='values-ApparelViews-CompetitiveStyles-Node Name']//div//input[@data-csi-automation='values-ApparelViews-CompetitiveStyles-Node Name']",codSamplePLM);Thread.sleep(2000);
        driverWEB.click("//input[@role='__addNewButton']"); Thread.sleep(2000);

        // Selecionar
        driverWEB.click("(//input[@role='checkbox'])[2]"); Thread.sleep(2000);

        // Salvar
        driverWEB.click("//span[contains(text(),'Save')]"); Thread.sleep(2000);

    }


}



        // Travel Samples
        //driverWEB.waitObject(selectTravelSamples,12);
        //driverWEB.click(selectTravelSamples);

        // New Competity Style
        //driverWEB.waitObject(newCompetityStyle,12);
        //driverWEB.click(newCompetityStyle);
        //hread.sleep(4000);

        //addLog(scenario,"Etapa: Insert dados");

        //Acervo (Acervo Masculino)
        //driverWEB.waitObject(acervoInput,12);
        //driverWEB.setText(acervoInput,"Acervo Masculino");
        //((SeleniumRobotsTool)driverWEB).getElement(acervoInput).sendKeys("ACESSORIOS");
        //Thread.sleep(4000);

        //Categoria Acervo
        //driverWEB.waitObject(categoriaAcervoInput,12);
        //Thread.sleep(2000);
        //driverWEB.setText(categoriaAcervoInput,"ALPARGATAS");
        //((SeleniumRobotsTool)driverWEB).getElement(categoriaAcervoInput).sendKeys("ALPARGATAS");

        //Division
        //driverWEB.waitObject(divisionInput,12);
        //Thread.sleep(2000);
        //driverWEB.setText(divisionInput,"MASCULINO JOVEM");
        //((SeleniumRobotsTool)driverWEB).getElement(divisionInput).sendKeys("BELEZA");

        //LifeStyle
        //driverWEB.waitObject(lifeStyleInput,12);
        //Thread.sleep(2000);
        //driverWEB.setText(lifeStyleInput,"GET OVER");
        //((SeleniumRobotsTool)driverWEB).getElement(lifeStyleInput).sendKeys("MARFINNO");

        //Seal
        //driverWEB.waitObject(sealInput,12);
        //Thread.sleep(2000);
        //driverWEB.setText(sealInput,"seal");
        //((SeleniumRobotsTool)driverWEB).getElement(sealInput).sendKeys("seal");
        //Thread.sleep(4000);

        // Save
        //driverWEB.waitObject(save,12);
        //Thread.sleep(2000);
        //driverWEB.click(save);
        //addLog(scenario,"Etapa: Final Travel Samples");
        //Thread.sleep(40000);


