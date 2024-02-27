package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.FornecedorPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoClicvel;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoWeb;
import static helpers.Utils.addLog;


public class FornecedorInteractions extends FornecedorPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void adicionarFornecedor(String fornecedor, String reservafornecedor, String precofornecedor) throws Exception {

        addLog(scenario, "Etapa: Selecionar Fornecedor");

        esperarElementoWeb(abaSourcing);
        esperarElementoClicvel(abaSourcing);
        driverWEB.doubleClick(abaSourcing);

        esperarElementoWeb(designatedSupplier);
        esperarElementoClicvel(designatedSupplier);
        driverWEB.doubleClick(designatedSupplier);

        esperarElementoWeb(inputSupplier);
        esperarElementoClicvel(inputSupplier);
        esperarElementoWeb(inputSupplierVazio);
        //Thread.sleep(4000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputSupplier).sendKeys(fornecedor);


        esperarElementoWeb(inputSupplierOption0);
        esperarElementoClicvel(inputSupplierOption0);
        driverWEB.click(inputSupplierOption0);


        esperarElementoWeb(btnRefreshSupplier);
        esperarElementoClicvel(btnRefreshSupplier);
        driverWEB.click(btnRefreshSupplier);
        Thread.sleep(3000);


        // New Supplier Quote Form
        //driverWEB.waitObject(inputSupplier, 40);
        //Thread.sleep(3000);
        //driverWEB.setText(inputSupplier, fornecedor);
        //((SeleniumRobotsTool)driverWEB).getElement(inputSupplier).sendKeys(fornecedor);
        //Thread.sleep(2000);
        //driverWEB.click("//div[@item='0']/span[contains(text(),'" + fornecedor + "')]");


        esperarElementoWeb(botaoAcaoSupplier);
        esperarElementoClicvel(botaoAcaoSupplier);
        driverWEB.click(botaoAcaoSupplier);


        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateinicial = new Date();
        String data = dateFormat.format(dateinicial);

        esperarElementoWeb(campodatainicial);
        esperarElementoClicvel(campodatainicial);
        driverWEB.click(campodatainicial);
        ((SeleniumRobotsTool) driverWEB).getElement(campodatainicial).sendKeys(data);

        esperarElementoWeb(campodatafinal);
        esperarElementoClicvel(campodatafinal);
        driverWEB.click(campodatafinal);
        ((SeleniumRobotsTool) driverWEB).getElement(campodatafinal).sendKeys(data);

        esperarElementoWeb(campoReserva);
        esperarElementoClicvel(campoReserva);
        driverWEB.click(campoReserva);
        ((SeleniumRobotsTool) driverWEB).getElement(campoReserva).sendKeys(reservafornecedor);

        esperarElementoWeb(campoPreco);
        esperarElementoClicvel(campoPreco);
        driverWEB.click(campoPreco);
        ((SeleniumRobotsTool) driverWEB).getElement(campoPreco).sendKeys(precofornecedor);

        esperarElementoWeb(botaoSalvarSupplier);
        esperarElementoClicvel(botaoSalvarSupplier);
        driverWEB.click(botaoSalvarSupplier);

        esperarElementoWeb(aprovarSupplier);
        esperarElementoClicvel(aprovarSupplier);
        driverWEB.click(aprovarSupplier);
        //

        esperarElementoWeb(inputStatusSupplier);
        esperarElementoClicvel(inputStatusSupplier);
        esperarElementoWeb(StatusSupplierOption0);
        esperarElementoClicvel(StatusSupplierOption0);

        ((SeleniumRobotsTool) driverWEB).getElement(inputStatusSupplier).sendKeys("Approve");

        driverWEB.click(StatusSupplierOption0);



        esperarElementoWeb(sumario);
        esperarElementoClicvel(sumario);
        driverWEB.click(sumario);
        Thread.sleep(2000);
    }

    public void adicionarFornecedorVariavel(String fornecedor, String reservafornecedor, String precofornecedor) throws Exception {

        addLog(scenario, "Etapa: Selecionar Fornecedor");
        driverWEB.waitObject(abaSourcing, 20);
        driverWEB.click(abaSourcing);
        driverWEB.waitObject(designatedSupplierVariavel, 10);
        driverWEB.click(designatedSupplierVariavel);
        Thread.sleep(1000);
        driverWEB.waitObject(designatedSupplierVariavel, 5);

        // New Supplier Quote Form
        driverWEB.waitObject(inputSupplierVariavel, 2);
        //driverWEB.setText(inputSupplierVariavel, fornecedor);
        ((SeleniumRobotsTool) driverWEB).getElement(inputSupplierVariavel).sendKeys(fornecedor);
        Thread.sleep(1000);
        driverWEB.click("//div[@item='0']/span[contains(text(),'" + fornecedor + "')]");
        driverWEB.waitObject(botaoAcaoSupplier, 40);
        driverWEB.click(botaoAcaoSupplier);

        WebDriver driver = ((WebDriver) (driverWEB.getDriver()));
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateinicial = new Date();
        String data = dateFormat.format(dateinicial);

        driverWEB.click(campodatainicial);
        //driverWEB.setText(campodatainicial,data);
        ((SeleniumRobotsTool) driverWEB).getElement(campodatainicial).sendKeys(data);
        driverWEB.click(campodatafinal);
        //driverWEB.setText(campodatafinal,data);
        ((SeleniumRobotsTool) driverWEB).getElement(campodatafinal).sendKeys(data);
        driverWEB.click(campoReserva);
        //driverWEB.setText(campoReserva, reservafornecedor);
        ((SeleniumRobotsTool) driverWEB).getElement(campoReserva).sendKeys(reservafornecedor);
        driverWEB.click(campoPreco);
        //driverWEB.setText(campoPreco,precofornecedor);
        ((SeleniumRobotsTool) driverWEB).getElement(campoPreco).sendKeys(precofornecedor);
        driverWEB.click(botaoSalvarSupplier);
        Thread.sleep(2000);
        addLog(scenario, "Etapa: Aprovar Fornecedor");
        driverWEB.click(aprovarSupplierVar);
        driverWEB.waitObject(aprovarSupplierCombo, 20);
        Thread.sleep(2000);
        //driverWEB.setText(aprovarSupplierComboVar,"Approve");
        ((SeleniumRobotsTool) driverWEB).getElement(aprovarSupplierComboVar).sendKeys("Approve");
        Thread.sleep(2000);
        driverWEB.click(clicAgent);
        driverWEB.click(sumario);
    }

}
