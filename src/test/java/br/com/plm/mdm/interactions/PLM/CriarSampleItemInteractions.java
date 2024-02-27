package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.SamplePage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;

import java.text.SimpleDateFormat;
import java.util.Date;

import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;

public class CriarSampleItemInteractions extends SamplePage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    private void viewerRenner(String vRenner) throws Exception {
        Thread.sleep(3000);
        driverWEB.click(viwerRenner);
        Thread.sleep(3000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputSelectViewer).sendKeys("");
        ((SeleniumRobotsTool) driverWEB).getElement(inputSelectViewer).sendKeys(vRenner);
        Thread.sleep(1000);
        driverWEB.click("//*[@item='2']");
        Thread.sleep(3000);
    }

    public void criarSampledoItem_() throws Exception {


        Thread.sleep(2000);
        driverWEB.click(clicCampoSamples);

        Thread.sleep(5000);
        viewerRenner("Renner");
        Thread.sleep(3000);

        //clic New Sample
        driverWEB.click(clicNewSample);
        Thread.sleep(2000);

        // Supplier
        driverWEB.click(campoSupplier);
        Thread.sleep(2000);
        driverWEB.setText(inputCampoSupplier, "DDX TEXTIL INDUSTRIA E COMERCIO DE MALHAS LTDA - 0001-39");
        Thread.sleep(1000);
        driverWEB.click(primeiroItem);
        Thread.sleep(2000);

        driverWEB.click(clicDate);

        // Semple Type
        driverWEB.click(clicSampleType);
        Thread.sleep(2000);
        driverWEB.setText(inputSampleType, "Development");

        // Sample Rewies
        //driverWEB.click(clicSampleRewies);Thread.sleep(2000);
        //driverWEB.setText(inputSampleRewies,"1º Sample");

        // Alternate Size Range
        driverWEB.click(clicAlternateSizeRange);
        Thread.sleep(2000);
        driverWEB.setText(inputAlternateSizeRange, "0,2G");
        Thread.sleep(2000);
        driverWEB.click("//*[contains(text(),'Alternate Size Range')]");
        Thread.sleep(2000);

        // Date
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);

        driverWEB.click(clicDate);
        Thread.sleep(2000);
        driverWEB.setText(inputDate, data);
        Thread.sleep(4000);

        // Save
        driverWEB.click(save);
        Thread.sleep(2000);

        // Edit
        driverWEB.click(editSample);
        Thread.sleep(2000);
        // Semple Type
        driverWEB.click(clicSampleType);
        Thread.sleep(2000);
        driverWEB.setText(inputSampleTypeEdit, "Fitting");
        Thread.sleep(2000);

        // save
        driverWEB.click(save);
        Thread.sleep(2000);

        // Delete
        //driverWEB.click(delete);Thread.sleep(2000);
        //driverWEB.click(confirmaDelete);Thread.sleep(2000);

    }

}
