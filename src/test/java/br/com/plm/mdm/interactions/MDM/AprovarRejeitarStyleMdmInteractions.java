package br.com.plm.mdm.interactions.MDM;

import br.com.renner.robots.SeleniumRobotsTool;
import helpers.FilesOperation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import br.com.plm.mdm.pages.MDM.MmdPage;

import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;

public class AprovarRejeitarStyleMdmInteractions extends MmdPage {

    SeleniumRobotsTool driverWEB = seleniumRobotsTool;

    public void aprovarStyleMdm() throws Exception {

        driverWEB.waitObject(caixaEntrada, 10);
        driverWEB.click(caixaEntrada);
        Thread.sleep(1000);

        driverWEB.waitObject(roleRenner, 10);
        driverWEB.click(roleRenner);
        Thread.sleep(4000);
        driverWEB.waitObject(perspectivaRenner, 10);
        driverWEB.click(perspectivaRenner); Thread.sleep(7000);

        driverWEB.waitObject(inboxPerspectivaRenner, 10);
        driverWEB.click(inboxPerspectivaRenner); Thread.sleep(6000);

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));

        // Update Frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ebx-legacy-component' and not(@id='unloadFrame')]")));
        driverWEB.waitObject(filtroPesquisa, 10);
        driverWEB.doubleClick(filtroPesquisa);
        driverWEB.click(filtroPesquisa);
        Thread.sleep(1000);

        // Viewer
        driverWEB.waitObject(views, 10);
        driverWEB.click(views);

        // Viewer Todos os workflows [AllWorkflowsFilter]
        driverWEB.waitObject(viewsTodosWorkflows, 10);
        driverWEB.click(viewsTodosWorkflows);
        Thread.sleep(1000);

        // Select ID-PLM
        Select drpIdPlm = new Select(driver.findElement(By.name("ebx_SimpleSearchFilterNodeSelectorList_FILTER_0")));
        drpIdPlm.selectByVisibleText("ID Produto PLM");
        Thread.sleep(2000);

        // Id produto PLM
        FilesOperation filesOperation = new FilesOperation();
        String codItem=  filesOperation.getProperties("itensParaAprovacao").getProperty("ID");
        //driverWEB.setText(idProdutoPlm, codItem);
        ((SeleniumRobotsTool)driverWEB).getElement(idProdutoPlm).sendKeys(codItem);
        Thread.sleep(4000);

        // Click Aplly
        driverWEB.click(clicApply);
        Thread.sleep(4000);

        // Clicar na ação “Take and start”
        driverWEB.click(actionsTakeandStart);
        Thread.sleep(4000);

        // Update Frame
        //driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='ebx_WorkspaceContent']//div//iframe[@id='ebx_SubSessioniFrame']")));
        //driverWEB.click(selectCheckBoxItemPai);
        //Thread.sleep(4000);
        //driverWEB.click(selectView);
        //Thread.sleep(4000);

        //String descricaoImportacao = ((SeleniumRobotsTool) driverWEB).getText("//textarea[@name='___40_cfvAO__import__ImportDescription']");

        //  Inserir Informações Produto Fiscal
        //if (descricaoImportacao == "") {
            //((SeleniumRobotsTool) driverWEB).setText(tipoProdutoComercial, "Blusa");
            //Informações -> Tipo de Produto Fiscal Selecionar um Item
            //driverWEB.click(selecionarItem);
            // Salvar
            //driverWEB.click(salvarTipoProdutoFiscal);
            //Thread.sleep(4000);

            // Update Frame
            Thread.sleep(2000);
            driver.switchTo().parentFrame().findElements(By.xpath("//div[@class='ebx_WorkspaceContent ebx_WorkspaceContentRelative']//div[@id='ebx_WorkspaceToolbar']"));
            Thread.sleep(2000);
            //Clicar em Aprovar
            driverWEB.click(aprovarStyle);
            Thread.sleep(4000);
            // OK Aprovar Style
            driverWEB.click(aprovarStyleOk);
            Thread.sleep(1000);
       // }else{
            // Update Frame
       //     driver.switchTo().parentFrame().findElements(By.xpath("//div[@class='ebx_WorkspaceContent ebx_WorkspaceContentRelative']//div[@id='ebx_WorkspaceToolbar']"));

            //Clicar em Aprovar
       //     driverWEB.click(aprovarStyle);
       //     Thread.sleep(4000);
            // OK Aprovar Style
       //     driverWEB.click(aprovarStyleOk);
       //     Thread.sleep(1000);
       //}

    }

    public void rejeitarStyleMdm() throws Exception {

        driverWEB.waitObject(caixaEntrada, 10);
        driverWEB.click(caixaEntrada);
        Thread.sleep(1000);

        driverWEB.waitObject(roleRenner, 10);
        driverWEB.click(roleRenner);
        Thread.sleep(4000);
        driverWEB.waitObject(perspectivaRenner, 10);
        driverWEB.click(perspectivaRenner); Thread.sleep(7000);

        driverWEB.waitObject(inboxPerspectivaRenner, 10);
        driverWEB.click(inboxPerspectivaRenner); Thread.sleep(6000);

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));

        // Update Frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ebx-legacy-component' and not(@id='unloadFrame')]")));
        driverWEB.waitObject(filtroPesquisa, 10);
        driverWEB.doubleClick(filtroPesquisa);
        driverWEB.click(filtroPesquisa);
        Thread.sleep(1000);

        // Viewer
        driverWEB.waitObject(views, 10);
        driverWEB.click(views);

        // Viewer Todos os workflows [AllWorkflowsFilter]
        driverWEB.waitObject(viewsTodosWorkflows, 10);
        driverWEB.click(viewsTodosWorkflows);
        Thread.sleep(1000);

        // Select ID-PLM
        Select drpIdPlm = new Select(driver.findElement(By.name("ebx_SimpleSearchFilterNodeSelectorList_FILTER_0")));
        drpIdPlm.selectByVisibleText("ID Produto PLM");
        Thread.sleep(2000);

        // Id produto PLM
        FilesOperation filesOperation = new FilesOperation();
        String codItem=  filesOperation.getProperties("itensParaAprovacao").getProperty("ID");
        //driverWEB.setText(idProdutoPlm, codItem);
        ((SeleniumRobotsTool)driverWEB).getElement(idProdutoPlm).sendKeys(codItem);
        Thread.sleep(4000);

        // Click Aplly
        driverWEB.click(clicApply);
        Thread.sleep(4000);

        // Clicar na ação “Take and start”
        driverWEB.click(actionsTakeandStart);
        Thread.sleep(4000);

        // Update Frame
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ebx_SubSessioniFrame' and not(@id='unloadFrame')]")));
        // Antes de clicar no botão “Rejeitar” deve ser acessado o item pai clicando no “olho” [ver registro]
        // cliar no olho
        driverWEB.click(selectCheckBoxItemPai);
        Thread.sleep(2000);

        // Deve ser selecionada a Aba “Informações da Rejeição”
        //driverWEB.click(informacoesRejeicao);

        // Deve ser clicado no sinal “+” para inserir o motivo da rejeição deste produto
        //driverWEB.click(abaInformacoesdeRejeicao);
        // Deve ser selecionada uma template para justificar a rejeição
        //driverWEB.click(templateInformacoesdeRejeicao);
        // Selecionar um Template
        //driverWEB.click(clicSelecionarTemplate);
        // selecionar template
        //driverWEB.click(selecionarTemplate);

        // Na sequência deve ser clicado no botão “Save” onde são exibidos todos os campos configurados para esta template
        //driverWEB.click(save);

        // Clicar novamente no botão “Save and Close”
        //driverWEB.click(saveClose);

        // Clicar no botão “Rejeitar”
        //driverWEB.click(rejeitarStyle);
        //Thread.sleep(4000);

        //Clicar no botão “OK” do questionamento “Item Rejeitado?”
        //driverWEB.click(rejeitarStyleOk);
        //Thread.sleep(10000);
    }

}

