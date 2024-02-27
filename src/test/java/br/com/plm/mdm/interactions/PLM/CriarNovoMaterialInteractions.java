package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.CriarNovoMaterialPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static helpers.Utils.addLog;

public class CriarNovoMaterialInteractions extends CriarNovoMaterialPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void criarNovoMaterial() throws Exception {

        System.out.println("Etapa: Material");
        //Material
        driverWEB.waitObject(abaMaterial, 10);
        driverWEB.click(abaMaterial);
        Thread.sleep(2000);

        //Action
        //driverWEB.ScrollToObject(botaoAction);
        System.out.println("Etapa: Novo Material");
        driverWEB.ScrollToObject(botaoActionNewMaterial);
        Thread.sleep(6000);
        //Action New Material
        //driverWEB.click(botaoAction);
        driverWEB.waitObject(botaoActionNewMaterial, 10);
        driverWEB.click(botaoActionNewMaterial);
        Thread.sleep(4000);

        //Material Library: ADAR
        //driverWEB.setText(inputMaterialLibrary,"ADAR");
        //Thread.sleep(1000);

        //Material Type: Fabric
        //driverWEB.setText(inputMaterialTypeFabric, "Fabric");
        ((SeleniumRobotsTool) driverWEB).getElement(inputMaterialTypeFabric).sendKeys("Fabric");
        Thread.sleep(1000);

        //Material: novo
        driverWEB.setText(inputMaterial, "NovoMaterial");
        Thread.sleep(1000);

        //Save
        driverWEB.click(clicMaterialSave);
        Thread.sleep(4000);

        // Clicar no campo Materail All select novo
        System.out.println("Etapa: Seleciona Material Novo");
        driverWEB.waitObject(material, 5);
        Thread.sleep(4000);
        driverWEB.click(material);
        driverWEB.waitObject(valueMaterial, 5);
        Thread.sleep(4000);
        ((SeleniumRobotsTool) driverWEB).getElement(valueMaterial).sendKeys("NovoMaterial");
        driverWEB.waitObject(valueMaterial, 8);
        //driverWEB.sendKeys(valueMaterial, RnKeys.ENTER);
        driverWEB.click(clicItem);
        Thread.sleep(8000);

        // Clic campo Material Text
        driverWEB.waitObject(materialText, 6);
        driverWEB.click(materialText);
        Thread.sleep(3000);

        //Copy Material
        driverWEB.waitObject(clicCopyMaterial, 12);
        driverWEB.click(clicCopyMaterial);
        Thread.sleep(5000);

        // Adicionar Copy
        driverWEB.click("//div[@data-csi-automation='field-Material-Form-Node Name']");
        Thread.sleep(2000);
        driverWEB.setText("//div[@data-csi-automation='field-Material-Form-Node Name']//div//input[@name='Node Name']", "MaterialCopy");
        Thread.sleep(5000);

        //Save Material Copy
        driverWEB.waitObject(clicSaveCopy, 12);
        driverWEB.click(clicSaveCopy);
        Thread.sleep(5000);

        ////////////////////////////// Begin Edit Material criado /////////////////////////////////

        // Edit Material Copiado
        System.out.println("Etapa: Editar Material");
        driverWEB.waitObject(clicEditMaterial, 8);
        driverWEB.click(clicEditMaterial);
        Thread.sleep(3000);

        //driverWEB.setText(inputMaterialEdit, "novo25");
        ((SeleniumRobotsTool) driverWEB).getElement(inputMaterialEdit).sendKeys("EditMaterialNovo25");
        Thread.sleep(3000);

        // Save Material Editado
        driverWEB.click(clicSaveMaterialEdiatado);
        Thread.sleep(3000);
        ////////////////////////////// End Edit Material criado /////////////////////////////////

        //Clicar no material para editar campo Quality
        //driverWEB.click("//div[@class='csi-table-frozen-wrap']//a[@class='browse']");
        driverWEB.click("//div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div[2]/div/div[5]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/a");

        // Clic Campo Quality
        driverWEB.click("//*[@data-csi-act='RNR_MaterialAttributes_MatQuality_string:Child:Attributes:0']");
        Thread.sleep(3000);
        // Input Quality
        driverWEB.setText("//textarea[@data-csi-automation='edit-Material-Properties-RNR_MaterialAttributes_MatQuality_string:Child:Attributes']", "Automatizado Edit Atributo Quality");
        Thread.sleep(4000);
        // Text Quality
        driverWEB.click("//*[@class='csiHeadingCellLabel'  and text()='Quality']");

        // Excluir material editado
        //System.out.println("Etapa: Excluir Material");
        //driverWEB.waitObject(clicDeleteMaterialEditado, 4);
        //driverWEB.click(clicDeleteMaterialEditado);
        //Thread.sleep(3000);
        //driverWEB.click(clicDeleteMaterial);

        Thread.sleep(16000);

    }

    public void criarNovoMaterialNew() throws Exception {

        Thread.sleep(4000);
        addLog(scenario, "Etapa: Hierarquia Material");
        //Material
        driverWEB.waitObject(abaMaterial, 10);
        driverWEB.click(abaMaterial);
        Thread.sleep(2000);

        //Action
        //driverWEB.ScrollToObject(botaoAction);
        System.out.println("Etapa: Novo Material");
        driverWEB.ScrollToObject(botaoActionNewMaterial);
        Thread.sleep(12000);
        //Action New Material
        //driverWEB.click(botaoAction);
        driverWEB.waitObject(botaoActionNewMaterial, 10);
        driverWEB.click(botaoActionNewMaterial);
        Thread.sleep(4000);

        //Material Library: ADAR
        //driverWEB.setText(inputMaterialLibrary,"ADAR");
        //Thread.sleep(1000);

        //Material Type: Fabric
        //driverWEB.setText(inputMaterialTypeFabric, "Fabric");
        ((SeleniumRobotsTool) driverWEB).getElement(inputMaterialTypeFabric).sendKeys("Fabric");
        Thread.sleep(1000);

        //Material: novo
        //driverWEB.setText(inputMaterial, "novoo");
        ((SeleniumRobotsTool) driverWEB).getElement(inputMaterial).sendKeys("novoo");
        Thread.sleep(1000);

        //Save
        driverWEB.click(clicMaterialSave);
        Thread.sleep(4000);

        // Clicar no campo Materail All select novo
        addLog(scenario, "Etapa: Seleciona Material Novo");
        driverWEB.waitObject(material, 5);
        Thread.sleep(4000);
        driverWEB.click(material);
        driverWEB.waitObject(valueMaterial, 5);
        Thread.sleep(4000);
        //driverWEB.setText(valueMaterial, "novoo");
        ((SeleniumRobotsTool) driverWEB).getElement(valueMaterial).sendKeys("novoo");
        driverWEB.waitObject(valueMaterial, 8);
        //driverWEB.sendKeys(valueMaterial, RnKeys.ENTER);
        driverWEB.click(clicItem);
        Thread.sleep(8000);

        // Clic campo Material Text
        driverWEB.waitObject(materialText, 6);
        driverWEB.click(materialText);
        Thread.sleep(3000);

        //Copy Material
        driverWEB.waitObject(clicCopyMaterial, 12);
        driverWEB.click(clicCopyMaterial);
        Thread.sleep(10000);

        //Save Material Copy
        driverWEB.click(clicSaveCopy);
        Thread.sleep(1000);

        ////////////////////////////// Begin Edit Material criado /////////////////////////////////

        // Edit Material Copiado
        addLog(scenario, "Etapa: Editar Material");
        driverWEB.waitObject(clicEditMaterial, 8);
        driverWEB.click(clicEditMaterial);

        //Material: novo3
        //driverWEB.setText(inputMaterialEdit, "novo25");
        ((SeleniumRobotsTool) driverWEB).getElement(inputMaterialEdit).sendKeys("novo25");
        Thread.sleep(1000);

        // Save Material Editado
        driverWEB.click(clicSaveMaterialEdiatado);
        Thread.sleep(1000);
        ////////////////////////////// End Edit Material criado /////////////////////////////////

        // Excluir material editado
        addLog(scenario, "Etapa: Excluir Material");
        driverWEB.waitObject(clicDeleteMaterialEditado, 4);
        driverWEB.click(clicDeleteMaterialEditado);
        Thread.sleep(3000);
        driverWEB.click(clicDeleteMaterial);

        Thread.sleep(16000);
    }

    public void criarNovaReserva() throws Exception {

        Thread.sleep(4000);
        //Material
        addLog(scenario, "Etapa: Criar Reserva");
        driverWEB.waitObject(abaMaterial, 10);
        driverWEB.click(abaMaterial);
        Thread.sleep(2000);

        // Clicar no campo Materail All select novo
        addLog(scenario, "Etapa: Seleciona Material Novo");
        driverWEB.waitObject(material, 5);
        Thread.sleep(4000);
        driverWEB.click(material);
        driverWEB.waitObject(valueMaterial, 5);
        Thread.sleep(4000);
        //driverWEB.setText(valueMaterial, "novoo");
        ((SeleniumRobotsTool) driverWEB).getElement(valueMaterial).sendKeys("novoo");
        driverWEB.waitObject(valueMaterial, 10);
        //driverWEB.sendKeys(valueMaterial, RnKeys.ENTER);
        driverWEB.click(clicItem);
        Thread.sleep(3000);

        // Clic campo Material Text
        driverWEB.waitObject(materialText, 6);
        driverWEB.click(materialText);
        Thread.sleep(3000);

        // Acess link novo produto
        driverWEB.click(linkNovoProduto);
        Thread.sleep(3000);

        //Done
        //Driver.findElement(By.xpath(//a[@href ='/docs/configuration']")).click();
        //WebDriver driverlink = ((WebDriver)(driverWEB.getDriver()));
        //driverlink.findElement(By.xpath("//*[@data-csi-act='Node Name::0']")).click();
        //driverlink.navigate().refresh();

        // Sourcing
        driverWEB.click(tabSourcing);
        Thread.sleep(3000);

        // Viewer Reserva
        addLog(scenario, "Etapa: Seleciona Viewer Reserva");
        Thread.sleep(4000);
        driverWEB.click(viewReserva);
        Thread.sleep(3000);
        //driverWEB.setText(selectViewReserva, "Reserva");
        ((SeleniumRobotsTool) driverWEB).getElement(selectViewReserva).sendKeys("Reserva");
        Thread.sleep(3000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);

        // Actions New Supplier Quote
        driverWEB.waitObject(btnAction, 4);
        driverWEB.click(btnAction);

        // New Supplier Quote
        //driverWEB.click(btnActionNewMaterial);
        Thread.sleep(3000);

        // New Supplier Quote
        driverWEB.click(campoFornecedorFoco);
        Thread.sleep(1000);

        //Input Supplier: -ORTA JOIA MODA
        driverWEB.waitObject(supplier, 3);
        Thread.sleep(2000);
        driverWEB.click(supplier);
        driverWEB.waitObject(inputSupplier, 3);
        Thread.sleep(2000);
        //driverWEB.setText(inputSupplier, "-ORTA JOIA MODA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputSupplier).sendKeys("-ORTA JOIA MODA");
        driverWEB.click("//*[@item='1']");
        Thread.sleep(3000);

        //Colors / Sizes
        //driverWEB.setText(inputColorsSizes,"");
        ((SeleniumRobotsTool) driverWEB).getElement(inputColorsSizes).sendKeys("");
        Thread.sleep(1000);

        //Inicial Date
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateinicial = new Date();
        String data = dateFormat.format(dateinicial);

        //Date Inicial
        Thread.sleep(1000);
        //driverWEB.setText(inputDateInicial, data);
        ((SeleniumRobotsTool) driverWEB).getElement(inputDateInicial).sendKeys(data);
        Thread.sleep(1000);

        //Final Date
        Thread.sleep(1000);
        //driverWEB.setText(inputDateFinal, data);
        ((SeleniumRobotsTool) driverWEB).getElement(inputDateFinal).sendKeys(data);
        Thread.sleep(1000);


        //Total Quanty Reserva
        addLog(scenario, "Etapa: Total Quanty Reserva");
        //driverWEB.setText(inputTotalQty, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputTotalQty).sendKeys("2");
        Thread.sleep(3000);

        //Price
        //driverWEB.setText(inputPrice, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputPrice).sendKeys("2");
        Thread.sleep(3000);

        //Save
        driverWEB.click(btnSaveSupplier);
        Thread.sleep(3000);

        // Status Approved
        driverWEB.click(aprovarSupplier);
        Thread.sleep(2000);

        //driverWEB.setTextWithoutClear(aprovarSupplierCombo, "Approve");
        Thread.sleep(2000);

        // Clic campo Material Text
        driverWEB.click(clicStatusText);
        Thread.sleep(3000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);

        // Editar Status Reopen
        addLog(scenario, "Etapa: Editar Status Reopen");
        driverWEB.waitObject(editarSupplier, 5);
        driverWEB.click(editarSupplier);
        Thread.sleep(2000);

        driverWEB.waitObject(editarSupplierCombo, 5);
        //driverWEB.setText(editarSupplierCombo, "Reopen");
        ((SeleniumRobotsTool) driverWEB).getElement(editarSupplierCombo).sendKeys("Reopen");
        Thread.sleep(2000);

        // Clic campo Material Text
        driverWEB.click(clicStatusText);
        Thread.sleep(3000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);

        // Editar Final Date
        driverWEB.click(dataFinalEdit);
        driverWEB.waitObject(dataFinalEdit, 5);
        Thread.sleep(1000);
        //driverWEB.setText(inputDateFinalEdit, "30/12/2022");
        ((SeleniumRobotsTool) driverWEB).getElement(inputDateFinalEdit).sendKeys("30/12/2023");
        Thread.sleep(3000);

        // Clic Final Date Text
        driverWEB.click(clicFinalDateText);
        Thread.sleep(3000);

        // Status Approved
        driverWEB.click(aprovarSupplier);
        Thread.sleep(2000);
        //driverWEB.setTextWithoutClear(aprovarSupplierCombo, "Approve");
        Thread.sleep(2000);

        // Clic campo Material Text
        driverWEB.click(clicStatusText);
        Thread.sleep(2000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);

        //Copiar Reserva:
        addLog(scenario, "Etapa: Copiar Reserva");
        driverWEB.click(copySupplierAprovado);
        Thread.sleep(3000);
        //Salvar
        driverWEB.click(btnSaveSupplierAprovado);
        Thread.sleep(3000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);

        //Deletar Supplier
        addLog(scenario, "Etapa: Deletar Supplier");
        driverWEB.click(deletarSupplier);
        Thread.sleep(3000);

        //Deletar
        driverWEB.click(btnDeletarSupplier);
        Thread.sleep(3000);

        Thread.sleep(16000);

    }

    public void criarNovaReservaNew() throws Exception {

        Thread.sleep(4000);
        //Material
        addLog(scenario, "Etapa: Criar Reserva, Material");
        driverWEB.waitObject(abaMaterial, 10);
        driverWEB.click(abaMaterial);
        Thread.sleep(2000);

        // Clicar no campo Materail All select novo
        System.out.println("Etapa: Seleciona Material Novo");
        driverWEB.waitObject(material, 5);
        Thread.sleep(4000);
        driverWEB.click(material);
        driverWEB.waitObject(valueMaterial, 12);
        Thread.sleep(4000);
        //driverWEB.setText(valueMaterial, "novoo");
        ((SeleniumRobotsTool) driverWEB).getElement(valueMaterial).sendKeys("novoo");
        driverWEB.waitObject(valueMaterial, 6);
        //driverWEB.sendKeys(valueMaterial, RnKeys.ENTER);
        driverWEB.click(clicItem);
        Thread.sleep(6000);

        // Clic campo Material Text
        driverWEB.waitObject(materialText, 6);
        driverWEB.click(materialText);
        Thread.sleep(3000);

        // Acess link novo produto
        driverWEB.click(clicLinkNovoProduto);
        Thread.sleep(3000);

        // Sourcing
        driverWEB.click(tabSourcing);
        Thread.sleep(3000);

        // Viewer Reserva
        //addLog(scenario,"Etapa: Seleciona Viewer Reserva");
        ///Thread.sleep(4000);
        //driverWEB.click(viewReserva);
        //Thread.sleep(3000);
        //driverWEB.setText(selectViewReserva, "Reserva");
        //((SeleniumRobotsTool)driverWEB).getElement(selectViewReserva).sendKeys("Reserva");
        //driverWEB.click(clicItemNovaReserva);
        //Thread.sleep(8000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(9000);

        // Actions New Supplier Quote
        driverWEB.waitObject(btnAction, 4);
        Thread.sleep(2000);
        driverWEB.ScrollToObject(btnAction);
        Thread.sleep(2000);
        driverWEB.click(btnAction);
        Thread.sleep(2000);

        // New Supplier Quote
        //driverWEB.click(btnActionNewMaterial);
        //Thread.sleep(1000);

        // New Supplier Quote
        //driverWEB.click(campoFornecedorFoco);
        //Thread.sleep(1000);

        //Input Supplier: -ORTA JOIA MODA
        driverWEB.waitObject(supplier, 3);
        Thread.sleep(2000);
        driverWEB.click(supplier);
        driverWEB.waitObject(inputSupplier, 20);
        Thread.sleep(2000);
        //driverWEB.setText(inputSupplier, "-ORTA JOIA MODA");
        ((SeleniumRobotsTool) driverWEB).getElement(inputSupplier).sendKeys("-ORTA JOIA MODA");
        Thread.sleep(3000);
        //driverWEB.sendKeys(inputSupplier, RnKeys.ENTER);
        driverWEB.click(selectItemSupplier);
        //driverWEB.click("//*[@item='1']");
        Thread.sleep(3000);

        //Colors / Sizes
        //driverWEB.setText(inputColorsSizes,"");
        ((SeleniumRobotsTool) driverWEB).getElement(inputColorsSizes).sendKeys("");
        Thread.sleep(1000);

        //Inicial Date
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateinicial = new Date();
        String data = dateFormat.format(dateinicial);

        //Date Inicial
        Thread.sleep(1000);
        //driverWEB.setText(inputDateInicial, data);
        ((SeleniumRobotsTool) driverWEB).getElement(inputDateInicial).sendKeys(data);
        Thread.sleep(1000);

        //Final Date
        Thread.sleep(1000);
        //driverWEB.setText(inputDateFinal, data);
        ((SeleniumRobotsTool) driverWEB).getElement(inputDateFinal).sendKeys(data);
        Thread.sleep(1000);

        //Total Quanty Reserva
        addLog(scenario, "Etapa: Total Quanty Reserva");
        //driverWEB.setText(inputTotalQty, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputTotalQty).sendKeys("2");
        Thread.sleep(3000);

        //Price
        //driverWEB.setText(inputPrice, "2");
        ((SeleniumRobotsTool) driverWEB).getElement(inputPrice).sendKeys("2");
        Thread.sleep(3000);

        //Save
        driverWEB.click(btnSaveSupplier);
        Thread.sleep(3000);

        // Status Approved
        addLog(scenario, "Etapa: Editar Status Reopen");
        driverWEB.click(aprovarSupplier);
        Thread.sleep(2000);
        driverWEB.waitObject(aprovarSupplier, 6);
        driverWEB.click("//div[@item='3']");
        //driverWEB.setTextWithoutClear(aprovarSupplierCombo, "Approve");
        Thread.sleep(2000);

        // Clic campo Material Text
        driverWEB.click(clicStatusText);
        Thread.sleep(3000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);

        // Editar Status Reopen
        //driverWEB.ScrollToObject(editarSupplier);
        driverWEB.waitObject(editarSupplier, 5);
        driverWEB.click(editarSupplier);
        Thread.sleep(2000);
        driverWEB.waitObject(editarSupplierCombo, 10);
        driverWEB.click("//div[@item='2']");
        //driverWEB.setTextWithoutClear(editarSupplierCombo, "Reopen");
        Thread.sleep(2000);

        // Clic campo Material Text
        driverWEB.click(clicStatusText);
        Thread.sleep(3000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);

        // Editar Final Date
        driverWEB.click(dataFinalEdit);
        driverWEB.waitObject(dataFinalEdit, 5);
        Thread.sleep(2000);
        //driverWEB.setText(inputDateFinalEdit, "30/12/2022");
        //((SeleniumRobotsTool)driverWEB).getElement(inputDateFinalEdit).sendKeys("30/12/2024");
        Thread.sleep(4000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);

        // Clic Final Date Text
        driverWEB.click(clicFinalDateText);
        Thread.sleep(2000);

        // Status Approved
        driverWEB.click(aprovarSupplier);
        Thread.sleep(2000);
        driverWEB.waitObject(aprovarSupplier, 4);
        driverWEB.click("//div[@item='3']");
        //driverWEB.setTextWithoutClear(aprovarSupplierCombo, "Approve");
        Thread.sleep(2000);

        // Clic campo Material Text
        driverWEB.click(clicStatusText);
        Thread.sleep(2000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);

        //Copiar Reserva:
        addLog(scenario, "Etapa: Copiar Reserva");
        driverWEB.click(copySupplierAprovado);
        Thread.sleep(3000);
        //Salvar
        driverWEB.click(btnSaveSupplierAprovado);
        Thread.sleep(3000);

        // Botao Refresh
        driverWEB.click(btnRefresh);
        Thread.sleep(3000);

        //Deletar Supplier
        addLog(scenario, "Etapa: Deletar Supplier");
        Thread.sleep(2000);
        driverWEB.click(clicStatus);
        Thread.sleep(3000);
        driverWEB.ScrollToObject(deletarSupplier);
        driverWEB.click(deletarSupplier);
        Thread.sleep(3000);

        //Deletar
        driverWEB.click(btnDeletarSupplier);
        Thread.sleep(16000);
    }
}
