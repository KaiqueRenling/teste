package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.SkuPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import helpers.FilesOperation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoClicvel;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoWeb;
import static helpers.Utils.addLog;


public class SkuInteractions extends SkuPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void validaritemPaiIdrms() throws Exception {

        addLog(scenario, "Etapa: Validar item pai e id rms");

        if ((((SeleniumRobotsTool) driverWEB).getElement(By.xpath("//*[@data-csi-heading='RNR_INT_Styleatt_Idprodutorms_string:Child:Attributes:0']")).getText().length() != 0)) {
            String excpectItemPai0Text = (((SeleniumRobotsTool) driverWEB).getElement(campoItemPai).getText());
            if (excpectItemPai0Text != "0") {
                System.out.println(excpectItemPai0Text);
            }

        }

        if ((((SeleniumRobotsTool) driverWEB).getElement(By.xpath("//*[@data-csi-heading='RNR_INT_Styleatt_Idprodutomdm_string:Child:Attributes:0']")).getText().length() != 0)) {
            String excpectMdmIdText = (((SeleniumRobotsTool) driverWEB).getElement(campoMdmId).getText());
            if (excpectMdmIdText != "0") {
                System.out.println(excpectMdmIdText);
            }

        }

        driverWEB.click(itemPai);
        driverWEB.click(mdmId);
    }

    public void adicionarSku() throws Exception {

        addLog(scenario, "Etapa: Selecionar SKU");

        ((SeleniumRobotsTool) driverWEB).getElement(btnF5).sendKeys(Keys.F5);

        Thread.sleep(5000);

        driverWEB.ScrollToObject(abaSku);

        esperarElementoWeb(abaSku);
        esperarElementoClicvel(abaSku);
        driverWEB.click(abaSku);

        esperarElementoWeb(botaoAcaoSku);
        esperarElementoClicvel(botaoAcaoSku);
        driverWEB.click(botaoAcaoSku);
        Thread.sleep(2000);

        esperarElementoWeb(botaoSalvarSku);
        esperarElementoClicvel(botaoSalvarSku);
        driverWEB.click(botaoSalvarSku);
        Thread.sleep(4000);
    }

    public void adicionarCorEClusters() throws Exception {
        addLog(scenario, "Etapa: Selecionar cor e Clusters");
        Thread.sleep(5000);

        esperarElementoWeb(abaColorways);
        esperarElementoClicvel(abaColorways);
        driverWEB.click(abaColorways);

        esperarElementoWeb(botaoAcaoColorways);
        esperarElementoClicvel(botaoAcaoColorways);
        driverWEB.click(botaoAcaoColorways);


        esperarElementoWeb(btnHabilitarFIltroColorway);
        esperarElementoClicvel(btnHabilitarFIltroColorway);
        driverWEB.click(btnHabilitarFIltroColorway);


        esperarElementoWeb(botaoAddFiltroColunaColor);
        esperarElementoClicvel(botaoAddFiltroColunaColor);
        driverWEB.click(botaoAddFiltroColunaColor);

        esperarElementoWeb(filterselecionarColorSpecification);
        esperarElementoClicvel(filterselecionarColorSpecification);
        driverWEB.click(filterselecionarColorSpecification);
        Thread.sleep(2000);

        esperarElementoWeb(inputSelecaoDoColorway);
        esperarElementoClicvel(inputSelecaoDoColorway);

        ((SeleniumRobotsTool) driverWEB).getElement(inputSelecaoDoColorway).sendKeys("13-0643");


        esperarElementoWeb(checkboxColorwayOption0);
        esperarElementoClicvel(checkboxColorwayOption0);
        driverWEB.click(checkboxColorwayOption0);
        ((SeleniumRobotsTool) driverWEB).getElement(inputSelecaoDoColorway).sendKeys(Keys.TAB);




        esperarElementoWeb(btnRefreshColorSpecification);
        esperarElementoClicvel(btnRefreshColorSpecification);
        driverWEB.click(btnRefreshColorSpecification);
        Thread.sleep(3000);



        esperarElementoWeb(btnShowResultsColorway);
        esperarElementoClicvel(btnShowResultsColorway);
        driverWEB.click(btnShowResultsColorway);


        esperarElementoWeb(checkboxConfirmarColorway);
        esperarElementoClicvel(checkboxConfirmarColorway);
        driverWEB.click(checkboxConfirmarColorway);


        esperarElementoWeb(botaoSalvarCores1);
        esperarElementoClicvel(botaoSalvarCores1);
        driverWEB.click(botaoSalvarCores1);

        esperarElementoWeb(btnSaveNewFromColor);
        esperarElementoClicvel(btnSaveNewFromColor);
        driverWEB.click(btnSaveNewFromColor);

        esperarElementoWeb(clusterSul);
        esperarElementoClicvel(clusterSul);
        driverWEB.click(clusterSul);

        esperarElementoWeb(inputClusterSul);
        esperarElementoClicvel(inputClusterSul);
        driverWEB.setText(inputClusterSul, "PP");


        esperarElementoWeb(clusterOption0);
        esperarElementoClicvel(clusterOption0);
        driverWEB.click(clusterOption0);
        Thread.sleep(2000);


    }

    public void adicionarCorEClustersVariavel(String cor1, String cor2, String cor3) throws Exception {

        Thread.sleep(5000);
        addLog(scenario, "Etapa: Selecionar Cor e Clusters");
        driverWEB.waitObject(abaColorways, 15);
        driverWEB.click(abaColorways);
        Thread.sleep(2000);

        // New from Color Especification
        driverWEB.waitObject(botaoAcaoColorways, 10);
        driverWEB.click(botaoAcaoColorways);

        // Primeira Cor
        Thread.sleep(3000);
        // Clic Color Specification
        driverWEB.waitObject(clicCampoColorSpecification, 15);
        driverWEB.click(clicCampoColorSpecification);
        Thread.sleep(3000);
        // Escrever a Cor
        driverWEB.waitObject(inputCampoColorSpecification, 50);
        driverWEB.setText(inputCampoColorSpecification, cor1);
        // clic textbox
        Thread.sleep(3000);
        driverWEB.click(selectTextBox);
        // clic Image
        driverWEB.click(selectCode);
        Thread.sleep(2000);

        //Selected firt column
        driverWEB.waitObject(selectFirstColumn, 20);
        driverWEB.click(selectFirstColumn);
        Thread.sleep(4000);
        // clic Code
        //driverWEB.click(clicColorSpecification);
        // Save Cores
        driverWEB.click(botaoSalvarCores);
        // Save
        Thread.sleep(3000);
        driverWEB.waitObject(botaoSalvarCores, 20);
        driverWEB.click(botaoSalvarCor);

        // Add Cluster Argentina Tamanho
        driverWEB.waitObject(clusterArg, 20);
        Thread.sleep(2000);
        driverWEB.click(clusterArg);
        Thread.sleep(2000);
        driverWEB.setText(clusterSulComboVar, "PP");
        Thread.sleep(3000);

        // Segunda Cor
        // New from Color Especification
        driverWEB.waitObject(botaoAcaoColorways, 5);
        driverWEB.click(botaoAcaoColorways);
        Thread.sleep(3000);
        // Clic Color Specification
        driverWEB.waitObject(clicCampoColorSpecification, 5);
        driverWEB.click(clicCampoColorSpecification);
        driverWEB.click("//div[@class='dijitReset dijitMenuItem csiExclusiveCheckbox']");
        Thread.sleep(2000);

        driverWEB.click("//span[contains(text(),'Code')]");
        Thread.sleep(2000);
        Thread.sleep(3000);
        driverWEB.waitObject(clicCampoColorSpecification, 5);
        driverWEB.click(clicCampoColorSpecification);
        Thread.sleep(2000);
        // Escrever a Cor
        driverWEB.waitObject(inputCampoColorSpecification, 50);
        driverWEB.setText(inputCampoColorSpecification, cor2);
        // clic textbox
        Thread.sleep(2000);
        driverWEB.click(selectTextBox);
        // clic Image
        driverWEB.click(selectCode);
        Thread.sleep(2000);

        //Selected second column
        driverWEB.waitObject(selectSecondColumn, 20);
        Thread.sleep(3000);
        driverWEB.click(selectSecondColumn);
        Thread.sleep(2000);
        // clic Code
        //driverWEB.click(clicColorSpecification);
        // Save Cores
        driverWEB.click(botaoSalvarCores);
        Thread.sleep(3000);
        // Save
        driverWEB.click(botaoSalvarCor);
        Thread.sleep(3000);

        // Add Cluster Argentina Tamanho
        driverWEB.waitObject(clusterArg1, 20);
        driverWEB.click(clusterArg1);
        Thread.sleep(1000);
        driverWEB.setText(clusterSulComboVar1, "P");
        Thread.sleep(3000);

        // Terceira Cor
        // New from Color Especification
        driverWEB.waitObject(botaoAcaoColorways, 10);
        Thread.sleep(2000);
        driverWEB.click(botaoAcaoColorways);
        Thread.sleep(4000);
        // Clic Color Specification
        driverWEB.waitObject(clicCampoColorSpecification, 5);
        driverWEB.click(clicCampoColorSpecification);
        Thread.sleep(2000);
        // Escrever a Cor
        driverWEB.waitObject(inputCampoColorSpecification, 50);
        driverWEB.setText(inputCampoColorSpecification, cor3);
        // clic textbox
        Thread.sleep(2000);
        driverWEB.click(selectTextBox);
        // clic Image
        driverWEB.click(selectCode);
        Thread.sleep(2000);
        //Selected Third column
        driverWEB.waitObject(selectThirdColumn, 20);
        Thread.sleep(3000);
        driverWEB.click(selectThirdColumn);
        Thread.sleep(4000);
        // clic Color Specification
        //driverWEB.click(clicColorSpecification);
        // Save Cores
        driverWEB.click(botaoSalvarCores);
        Thread.sleep(2000);
        // Save
        driverWEB.click(botaoSalvarCor);
        Thread.sleep(3000);

        // Add Cluster Argentina Tamanho
        driverWEB.waitObject(clusterArg2, 20);
        driverWEB.click(clusterArg2);
        Thread.sleep(1000);
        driverWEB.setText(clusterSulComboVar2, "PP");
        driverWEB.click(abaColorways);
        Thread.sleep(4000);

    }

    public void adicionarCorEClustersVariavelAcessorios(String cor1, String cor2, String cor3) throws Exception {

        Thread.sleep(5000);
        addLog(scenario, "Etapa: Selecionar Cor e Clusters");
        driverWEB.waitObject(abaColorways, 10);
        driverWEB.click(abaColorways);
        Thread.sleep(2000);

        // New from Color Especification
        driverWEB.waitObject(botaoAcaoColorways, 5);
        driverWEB.click(botaoAcaoColorways);

        // Primeira Cor
        Thread.sleep(3000);
        // Clic Color Specification
        driverWEB.waitObject(clicCampoColorSpecification, 5);
        driverWEB.click(clicCampoColorSpecification);
        Thread.sleep(2000);
        // Escrever a Cor
        driverWEB.waitObject(inputCampoColorSpecification, 30);
        driverWEB.setText(inputCampoColorSpecification, cor1);
        // clic textbox
        Thread.sleep(3000);
        driverWEB.click(selectTextBox);
        // clic Image
        driverWEB.click(selectCode);
        Thread.sleep(2000);

        //Selected firt column
        driverWEB.waitObject(selectFirstColumn, 20);
        driverWEB.click(selectFirstColumn);
        Thread.sleep(4000);
        // clic Code
        //driverWEB.click(clicColorSpecification);
        // Save Cores
        driverWEB.click(botaoSalvarCores);
        // Save
        Thread.sleep(3000);
        driverWEB.waitObject(botaoSalvarCores, 20);
        driverWEB.click(botaoSalvarCor);

        // Add Cluster Argentina Tamanho
        driverWEB.waitObject(clusterArg, 20);
        Thread.sleep(2000);
        driverWEB.click(clusterArg);
        Thread.sleep(2000);
        driverWEB.setText(clusterSulComboVar, "PP");
        Thread.sleep(3000);

        // Segunda Cor
        // New from Color Especification
        driverWEB.waitObject(botaoAcaoColorways, 5);
        driverWEB.click(botaoAcaoColorways);
        Thread.sleep(3000);
        // Clic Color Specification
        driverWEB.waitObject(clicCampoColorSpecification, 5);
        driverWEB.click(clicCampoColorSpecification);
        driverWEB.click("//div[@class='dijitReset dijitMenuItem csiExclusiveCheckbox']");
        Thread.sleep(2000);

        driverWEB.click("//span[contains(text(),'Code')]");
        Thread.sleep(2000);
        Thread.sleep(3000);
        driverWEB.waitObject(clicCampoColorSpecification, 5);
        driverWEB.click(clicCampoColorSpecification);
        Thread.sleep(2000);
        // Escrever a Cor
        driverWEB.waitObject(inputCampoColorSpecification, 30);
        driverWEB.setText(inputCampoColorSpecification, cor2);
        // clic textbox
        Thread.sleep(2000);
        driverWEB.click(selectTextBox);
        // clic Image
        driverWEB.click(selectCode);
        Thread.sleep(2000);

        //Selected second column
        driverWEB.waitObject(selectSecondColumn, 20);
        Thread.sleep(3000);
        driverWEB.click(selectSecondColumn);
        Thread.sleep(1000);
        // clic Code
        //driverWEB.click(clicColorSpecification);
        // Save Cores
        driverWEB.click(botaoSalvarCores);
        Thread.sleep(3000);
        // Save
        driverWEB.click(botaoSalvarCor);
        Thread.sleep(3000);

        // Add Cluster Argentina Tamanho
        driverWEB.waitObject(clusterArg1, 20);
        driverWEB.click(clusterArg1);
        Thread.sleep(1000);
        driverWEB.setText(clusterSulComboVar1, "P");
        Thread.sleep(3000);

        // Terceira Cor
        // New from Color Especification
        driverWEB.waitObject(botaoAcaoColorways, 10);
        Thread.sleep(2000);
        driverWEB.click(botaoAcaoColorways);
        Thread.sleep(4000);
        // Clic Color Specification
        driverWEB.waitObject(clicCampoColorSpecification, 5);
        driverWEB.click(clicCampoColorSpecification);
        Thread.sleep(2000);
        // Escrever a Cor
        driverWEB.waitObject(inputCampoColorSpecification, 30);
        driverWEB.setText(inputCampoColorSpecification, cor3);
        // clic textbox
        Thread.sleep(2000);
        driverWEB.click(selectTextBox);
        // clic Image
        driverWEB.click(selectCode);
        Thread.sleep(2000);
        //Selected Third column
        driverWEB.waitObject(selectThirdColumn, 20);
        Thread.sleep(3000);
        driverWEB.click(selectThirdColumn);
        Thread.sleep(4000);
        // clic Color Specification
        //driverWEB.click(clicColorSpecification);
        // Save Cores
        driverWEB.click(botaoSalvarCores);
        Thread.sleep(2000);
        // Save
        driverWEB.click(botaoSalvarCor);
        Thread.sleep(3000);

        // Add Cluster Argentina Tamanho
        driverWEB.waitObject(clusterArg2, 20);
        driverWEB.click(clusterArg2);
        Thread.sleep(1000);
        driverWEB.setText(clusterSulComboVar2, "PP");
        driverWEB.click(abaColorways);
        Thread.sleep(4000);

    }

    public void adicionarSkuExistente() throws Exception {

        addLog(scenario, "Etapa: Selecionar SKU");
        esperarElementoWeb(abaStyle);
        esperarElementoClicvel(abaStyle);
        driverWEB.click(abaStyle);
        //Thread.sleep(2000);
        esperarElementoWeb(abaSku);
        esperarElementoClicvel(abaSku);
        driverWEB.click(abaSku);
        Thread.sleep(3000);

        esperarElementoWeb(botaoAcaoSku);
        esperarElementoClicvel(botaoAcaoSku);
        driverWEB.click(botaoAcaoSku);
        Thread.sleep(3000);

        esperarElementoWeb(botaoSalvarSku);
        esperarElementoClicvel(botaoSalvarSku);
        driverWEB.click(botaoSalvarSku);
        Thread.sleep(3000);

    }

    public void adicionarSupplier() throws Exception {

        addLog(scenario, "Etapa: Adicionar Supplier");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateinicial = new Date();

        String data = dateFormat.format(dateinicial);
        // PLM New
        driverWEB.click(supplier);
        driverWEB.click(botaoAddSupplier);
        Thread.sleep(2000);

        driverWEB.click(finalDate);
        //driverWEB.setText(finalDate, data);
        ((SeleniumRobotsTool) driverWEB).getElement(finalDate).sendKeys(data);

        driverWEB.click(initialDate);
        //driverWEB.setText(initialDate, data);
        ((SeleniumRobotsTool) driverWEB).getElement(initialDate).sendKeys(data);

        driverWEB.click(totalQuantity);
        //driverWEB.setText(totalQuantity, "500");
        ((SeleniumRobotsTool) driverWEB).getElement(totalQuantity).sendKeys("500");
        Thread.sleep(2000);

        driverWEB.click(priceInput);
        //driverWEB.setText(priceInput, "5");
        ((SeleniumRobotsTool) driverWEB).getElement(priceInput).sendKeys("5");
        Thread.sleep(4000);
        driverWEB.click(botaoSalvarSupplier);

        driverWEB.click(aprovarSupplier);
        driverWEB.waitObject(aprovarSupplierCombo, 5);
        //driverWEB.setText(aprovarSupplierCombo, "Approve");
        ((SeleniumRobotsTool) driverWEB).getElement(aprovarSupplierCombo).sendKeys("Approve");
        Thread.sleep(4000);
        driverWEB.click(statusText);
        Thread.sleep(2000);
    }

    public void validarSkusCriadosPlmMdmRms() throws Exception {

        addLog(scenario, "Etapa: Validar Sks criados no PLM, MDM e RMS");

        // Id produto PLM
        FilesOperation filesOperation = new FilesOperation();
        String codItem = filesOperation.getProperties("itensParaAprovacao").getProperty("ID");
        driverWEB.openSystem("https://lr-staging1.centricsoftware.com/WebAccess/home.html#URL=" + codItem + "&NR=1&RPURL=&RURL=&RightPane=&Tab=Properties");
        Thread.sleep(4000);

        // Espera dois minutos
        Thread.sleep(180000);
        Thread.sleep(120000);

        // F5 page
        ((SeleniumRobotsTool) driverWEB).getElement("//body").sendKeys(Keys.F5);
        //((SeleniumRobotsTool)driverWEB).refreshPage();
        Thread.sleep(5000);

        // MDM ID
        driverWEB.click(mdmIdText);
        //System.out.println(driverWEB.getText(campoMdmId));

        // Item Pai
        driverWEB.getText(campoItemPai);
        //System.out.println(driverWEB.getText(campoItemPaiText));

        if (driverWEB.getText(campoItemPai).length() != 0) {
            addLog(scenario, "Item Pai: " + driverWEB.getText(campoItemPai));
            if (driverWEB.getText(campoItemPai).length() != 0) {
                addLog(scenario, "MDM ID: " + driverWEB.getText(campoMdmId));
            }

        } else {
            addLog(scenario, "Campo PLM, Item Pai:" + driverWEB.getText(campoItemPai) + " e MDM ID: " + driverWEB.getText(campoMdmId));
        }


    }

}
