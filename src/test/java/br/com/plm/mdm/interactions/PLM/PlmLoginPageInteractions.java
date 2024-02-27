package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.PlmLoginPage;
import br.com.renner.robots.IRNRobotsTool;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoWeb;


public class PlmLoginPageInteractions extends PlmLoginPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void siteRennerPlm() {
        driverWEB.openSystem("https://lr-staging1.centricsoftware.com/WebAccess/login.html");
    }

    public void login() throws Exception {

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100L)).pollingEvery(Duration.ofSeconds(2L)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("LoginID")));

        System.out.println("Etapa: Login");
        System.out.println(driverWEB.waitObject(campoUsuario, 2));
        esperarElementoWeb(campoUsuario);
        driverWEB.click(campoUsuario);
        driverWEB.setText(campoUsuario, "TESTES_AUTOMATIZADOS");
        driverWEB.click(campoSenha);
        driverWEB.setText(campoSenha, "RennerAutomatizado");
        driverWEB.click(botaoLogin);
    }

}
