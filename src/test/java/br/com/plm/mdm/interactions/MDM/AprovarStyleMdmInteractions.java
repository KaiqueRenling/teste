package br.com.plm.mdm.interactions.MDM;

import br.com.renner.robots.IRNRobotsTool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import br.com.plm.mdm.pages.MDM.MmdPage;

import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;

public class AprovarStyleMdmInteractions extends MmdPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void aprovarStyleMdm() throws Exception {

        driverWEB.waitObject(caixaEntrada, 10);
        driverWEB.click(caixaEntrada);
        Thread.sleep(1000);

        driverWEB.waitObject(roleRenner, 10);
        driverWEB.click(roleRenner);
        Thread.sleep(4000);
        driverWEB.waitObject(perspectivaRenner, 10);
        driverWEB.click(perspectivaRenner);
        Thread.sleep(1000);

        driverWEB.waitObject(inboxPerspectivaRenner, 10);
        driverWEB.click(inboxPerspectivaRenner);
        Thread.sleep(1000);

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));

        // Update Frame
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ebx-legacy-component' and not(@id='unloadFrame')]")));
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

        // Copy no PLM BS_FW22_CMT_0116 ou BS_FW22_CMT_0119
        // C44036600


        // Id produto PLM
        driverWEB.setText(idProdutoPlm, "C44043013");
        Thread.sleep(4000);

        // Click Aplly
        driverWEB.click(clicApply);
        Thread.sleep(4000);

        // Actions
        driverWEB.click(actionsTakeandStart);
        Thread.sleep(4000);

        // Update Frame
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ebx_SubSessioniFrame' and not(@id='unloadFrame')]")));

        // Aprovar
        driverWEB.click(aprovarStyle);
        Thread.sleep(4000);
        // OK Aprovar Style
        driverWEB.click(aprovarStyleOk);
        Thread.sleep(15000);

        // Perspectiva Renner
        // Viewer
        //driverWEB.waitObject(views, 10);
        //driverWEB.click(views);

        // Viewer - Todos os WorkFlows - Ativos
        //driverWEB.waitObject(viewsTodosWorkflowsAtivos, 10);
        //driverWEB.click(viewsTodosWorkflowsAtivos);
        //Thread.sleep(1000);

        // Respeita tempo de 1 minuto
        Thread.sleep(60000);

        // Fluxo de Trabalho Ativo
        driverWEB.waitObject(inboxFluxoTrabalhoAtivos, 5);
        driverWEB.click(inboxFluxoTrabalhoAtivos);

        // Update Frame
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ebx-legacy-component' and not(@id='unloadFrame')]")));
        driverWEB.waitObject(filtroPesquisa, 10);
        driverWEB.doubleClick(filtroPesquisa);
        driverWEB.click(filtroPesquisa);
        Thread.sleep(1000);

        // Search - ID PLM
        Select dropIdPlm = new Select(driver.findElement(By.name("ebx_SimpleSearchFilterNodeSelectorList_FILTER_0")));
        dropIdPlm.selectByVisibleText("ID Produto PLM");
        Thread.sleep(2000);
        driverWEB.setText(idProdutoPlm, "C44043013");
        Thread.sleep(4000);
        // Click Aplly
        driverWEB.click(clicApply);
        Thread.sleep(4000);

        // Viewer
        //driverWEB.waitObject(views, 10);
        //driverWEB.click(views);

        // Viewer - Todos os WorkFlows - Completados
        //driverWEB.waitObject(viewsTodosWorkflowsCompletados, 10);
        //driverWEB.click(viewsTodosWorkflowsCompletados);
        //Thread.sleep(1000);

        // Perspectiva Renner
        // Fluxo de Trabalho Concluidos
        //driverWEB.waitObject(inboxFluxoTrabalhoConcluidos, 10);
        //driverWEB.click(inboxFluxoTrabalhoConcluidos);

        // Update Frame
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ebx-legacy-component' and not(@id='unloadFrame')]")));
        //driverWEB.waitObject(filtroPesquisa, 10);
        //driverWEB.doubleClick(filtroPesquisa);
        //driverWEB.click(filtroPesquisa);
        //Thread.sleep(1000);

        // Search - ID PLM
        //Select droppIdPlm = new Select(driver.findElement(By.name("ebx_SimpleSearchFilterNodeSelectorList_FILTER_0")));
        //droppIdPlm.selectByVisibleText("ID Produto PLM");
        //Thread.sleep(2000);
        //driverWEB.setTextWithoutClear(idProdutoPlm, "C44043013");
        //Thread.sleep(4000);
        // Click Aplly
        //driverWEB.click(clicApply);
        //Thread.sleep(4000);

        // Clicar na flexa e ver fluxo concluido
        //driverWEB.click(clicViewWorkflow);
        //Thread.sleep(2000);

        // Steps = complete
        //driverWEB.getText("//*[@class='ebx_wpihTimeLinePast']").equals("complete");
        // Style aprovado com sucesso
        Thread.sleep(50000);
    }

}
