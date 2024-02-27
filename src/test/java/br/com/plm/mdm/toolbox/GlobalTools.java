package br.com.plm.mdm.toolbox;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static br.com.plm.mdm.steps.Common.driverWEB;

public class GlobalTools {
    private static final Duration MAX_DURATION = Duration.ofSeconds(30L);
    private static final Duration POOL_DURATION = Duration.ofSeconds(2L);


    public static void scrollAteElementoWeb(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driverWEB;
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }

    public static void scrollAjustado(int numeroDeVezes) {

        for (int i = 0; i < numeroDeVezes; i++) {
            JavascriptExecutor jse = (JavascriptExecutor) driverWEB;
            jse.executeScript("window.scrollBy(0,200)");
        }
    }

    public static void esperarPaginaCarregarCompletamente() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driverWEB;
        long tempoInicio = System.currentTimeMillis();

        while (System.currentTimeMillis() - tempoInicio < MAX_DURATION.toMillis()) {
            // Executando JavaScript para verificar o estado da página
            String estado = (String) jsExecutor.executeScript("return document.readyState");
            System.out.println(estado);
            if (estado.equals("complete")) {
                break;
            }
            try {
                Thread.sleep(POOL_DURATION.toMillis()); // Pausando antes da próxima verificação
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static WebElement esperarElementoWeb(String xpathLocator) {
        Wait<WebDriver> wait = new FluentWait<>(driverWEB).withTimeout(MAX_DURATION).pollingEvery(POOL_DURATION).ignoring(NoSuchElementException.class);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
    }

    public static WebElement esperarElementoClicvel(String xpathLocator) {
        Wait<WebDriver> wait = new FluentWait<>(driverWEB).withTimeout(MAX_DURATION).pollingEvery(POOL_DURATION).ignoring(NoSuchElementException.class);

        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathLocator)));
    }

    public static void esperarElementoInvisivel(By locator) {
        WebDriverWait wait = new WebDriverWait(driverWEB, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }


}
