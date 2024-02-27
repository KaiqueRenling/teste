package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.RolePage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;

public class PlmRoleInteractions extends RolePage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;
    public void roleOpp() throws Exception {

       System.out.println("Etapa: Alterar Role");
        WebDriver driver = ((WebDriver)(driverWEB.getDriver()));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("pageFocused")));


        if ((((SeleniumRobotsTool) driverWEB).getElement(By.xpath("//*[contains(text(),'OPP')]")).getText()).length() != 0) {
           String excpectRoleOpp = (((SeleniumRobotsTool) driverWEB).getElement(atualRoleOpp).getText());
           if (excpectRoleOpp.equals("lockOPP")) {
               driverWEB.waitObject(clicRoleOpp, 60);
               System.out.println(driverWEB.waitObject(clicRoleOpp, 60));
               driverWEB.click(clicRoleOpp);
               driverWEB.click(selectRoleProdutoBeleza);
               Thread.sleep(2000);
               driverWEB.waitObject(changeRole, 60);
               Thread.sleep(2000);
               driverWEB.click(changeRole);
               Thread.sleep(2000);
           }
       }

      }
    public void roleProdutoBeleza() throws Exception {

        System.out.println("Etapa: Alterar Role");

        WebDriver driver = ((WebDriver)(driverWEB.getDriver()));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(250L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("dijit__WidgetsInTemplateMixin_1")));

        if ((((SeleniumRobotsTool) driverWEB).getElement(By.xpath("//*[contains(text(),'Produto Beleza')]")).getText().length() != 0)) {
            String excpectRoleProdutoBeleza = (((SeleniumRobotsTool) driverWEB).getElement(atualRoleProdutoBeleza).getText());
            if (excpectRoleProdutoBeleza.equals("lockProduto Beleza")) {
                driverWEB.waitObject(clicRoleProdutoBeleza, 60);
                System.out.println(driverWEB.waitObject(clicRoleProdutoBeleza, 60));
                driverWEB.click(clicRoleProdutoBeleza);
                driverWEB.click(selectRoleOpp);
                Thread.sleep(2000);
                driverWEB.waitObject(changeRole, 60);
                Thread.sleep(2000);
                driverWEB.click(changeRole);
                Thread.sleep(2000);
            }
        }

    }

}

