package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.CamposObrigatoriosPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import org.openqa.selenium.WebDriver;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoClicvel;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoWeb;
import static helpers.Utils.addLog;


public class CamposObrigatoriosPageInteractions extends CamposObrigatoriosPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;
    private WebDriver driver;
    private CamposObrigatoriosPage camposObrigatoriosPage;

    public void selecionarPais(String pais) throws Exception {

        esperarElementoWeb(paisOrigem);
        esperarElementoClicvel(paisOrigem);
        driverWEB.click(paisOrigem);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(pais);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarPaisCopia(String pais) throws Exception {

        esperarElementoWeb(paisOrigem);
        esperarElementoClicvel(paisOrigem);
        driverWEB.click(paisOrigem);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(pais);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarFaccao(String udafaccao) throws Exception {

        driverWEB.ScrollToObject(faccaoText);
        driverWEB.click(campofaccao);
        driverWEB.waitObject(Inputfaccao, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(Inputfaccao).sendKeys(udafaccao);
        driverWEB.click(faccaoText);
    }


    public void selecionarTipoProdutoComercial(String tipoProdutoComercial) throws Exception {

        driverWEB.ScrollToObject(tipoProdutoComercialText);

        esperarElementoWeb(campotipoProdutoComercial);
        esperarElementoClicvel(campotipoProdutoComercial);
        driverWEB.click(campotipoProdutoComercial);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(tipoProdutoComercial);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);
        Thread.sleep(2000);

    }

    public void selecionarTipoProdutoFiscal(String tipoProdutoFiscal) throws Exception {

        driverWEB.ScrollToObject(tipoProdutoFiscalText);
        driverWEB.click(campotipoProdutoFiscal);
        Thread.sleep(3000);
        driverWEB.waitObject(InputValor, 3);
        //driverWEB.setText(InputValor, tipoProdutoFiscal);
        ((SeleniumRobotsTool) driverWEB).getElement(InputValor).sendKeys(tipoProdutoFiscal);
        driverWEB.click(tipoProdutoFiscalText);
    }

    public void selecionarMaterialProduto(String materialProduto) throws Exception {

        driverWEB.ScrollToObject(materialProdutoText);
        driverWEB.click(campomaterialProduto);
        driverWEB.waitObject(InputValor, 3);
        //driverWEB.setText(InputValor, materialProduto);
        ((SeleniumRobotsTool) driverWEB).getElement(InputValor).sendKeys(materialProduto);
        driverWEB.click(materialProdutoText);
    }

    public void selecionarEstampaProduto(String estampaProduto) throws Exception {

        driverWEB.ScrollToObject(estampaProdutoText);

        esperarElementoWeb(campoestampaProduto);
        esperarElementoClicvel(campoestampaProduto);
        driverWEB.click(campoestampaProduto);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(estampaProduto);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarDetalheProduto(String detalheProduto) throws Exception {

        driverWEB.ScrollToObject(detalheProdutoText);

        esperarElementoWeb(campodetalheProduto);
        esperarElementoClicvel(campodetalheProduto);
        driverWEB.doubleClick(campodetalheProduto);
        //Thread.sleep(2000);


        esperarElementoWeb(detalheProdutoInput);
        esperarElementoClicvel(detalheProdutoInput);

        ((SeleniumRobotsTool) driverWEB).getElement(detalheProdutoInput).sendKeys(detalheProduto);

        driverWEB.click(detalheProdutoText);
    }

    public void selecionarNcmFornecedor(String ncmFornecedor) throws Exception {

        driverWEB.ScrollToObject(ncmFornecedorText);

        esperarElementoWeb(camponcmFornecedor);
        esperarElementoClicvel(camponcmFornecedor);
        driverWEB.click(camponcmFornecedor);

        esperarElementoWeb(ncmFornecedorInput);
        esperarElementoClicvel(ncmFornecedorInput);
        ((SeleniumRobotsTool) driverWEB).getElement(ncmFornecedorInput).sendKeys(ncmFornecedor);
        driverWEB.click(ncmFornecedorText);
    }

    public void selecionarGolaDecote(String golaDecote) throws Exception {

        driverWEB.ScrollToObject(golaDecoteText);

        esperarElementoWeb(campoGoladecote);
        esperarElementoClicvel(campoGoladecote);
        driverWEB.click(campoGoladecote);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(golaDecote);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);
        Thread.sleep(2000);

    }


    public void selecionarUnitCost(String unitCost) throws Exception {

        driverWEB.ScrollToObject(unitCostText);

        esperarElementoWeb(campounitCost);
        esperarElementoClicvel(campounitCost);
        driverWEB.click(campounitCost);

        esperarElementoWeb(unitCostInput);
        esperarElementoClicvel(unitCostInput);
        ((SeleniumRobotsTool) driverWEB).getElement(unitCostInput).sendKeys(unitCost);
        driverWEB.click(unitCostText);
    }

    public void selecionarPrecoVenda(String precoVenda) throws Exception {

        esperarElementoWeb(campoprecoVenda);
        esperarElementoClicvel(campoprecoVenda);
        driverWEB.click(campoprecoVenda);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(precoVenda);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);
        Thread.sleep(2000);
    }

    public void selecionarPrecoVendaUY(String precoVendaUruguai) throws Exception {

        driverWEB.ScrollToObject(precoVendaUYText);
        esperarElementoWeb(campoprecoVendaUY);
        esperarElementoClicvel(campoprecoVendaUY);
        driverWEB.click(campoprecoVendaUY);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(precoVendaUruguai);

        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarPrecoVendaAR(String precoVendaArgentina) throws Exception {

        driverWEB.ScrollToObject(precoVendaARTexto);
        esperarElementoWeb(precoVendaAR);
        esperarElementoClicvel(precoVendaAR);
        driverWEB.click(precoVendaAR);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(precoVendaArgentina);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarFaixaPreco(String faixaPreco) throws Exception {

        driverWEB.ScrollToObject(faixaPrecoText);
        driverWEB.click(campofaixaPreco);
        driverWEB.waitObject(InputValor, 3);
        //driverWEB.setText(InputValor, faixaPreco);
        ((SeleniumRobotsTool) driverWEB).getElement(InputValor).sendKeys(faixaPreco);
        driverWEB.click(faixaPrecoText);
    }

    public void selecionarOrigemMerc(String origemMercadoria) throws Exception {

        driverWEB.ScrollToObject(origemMercFiscalText);

        esperarElementoWeb(campoorigemMercFiscal);
        esperarElementoClicvel(campoorigemMercFiscal);
        driverWEB.click(campoorigemMercFiscal);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(origemMercadoria);

        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarCategoriaGenerica(String categoriaGenerica) throws Exception {

        driverWEB.ScrollToObject(categoriaGenText);

        esperarElementoWeb(campocategoriaGen);
        esperarElementoClicvel(campocategoriaGen);
        driverWEB.click(campocategoriaGen);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(categoriaGenerica);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);


    }

    public void selecionarPackingMethod(String packingMethod) throws Exception {

        driverWEB.ScrollToObject(packingMethText);

        esperarElementoWeb(campopackingMeth);
        esperarElementoClicvel(campopackingMeth);
        driverWEB.click(campopackingMeth);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(packingMethod);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarGrupoInsumo(String grupoInsumo) throws Exception {

        driverWEB.ScrollToObject(grupoInsumoText);

        esperarElementoWeb(campogrupoInsumo);
        esperarElementoClicvel(campogrupoInsumo);
        driverWEB.click(campogrupoInsumo);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(grupoInsumo);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarPiramideMercadologica(String piramideMercadologica) throws Exception {

        driverWEB.ScrollToObject(piramideMercText);

        esperarElementoWeb(campopiramideMerc);
        esperarElementoClicvel(campopiramideMerc);
        driverWEB.click(campopiramideMerc);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(piramideMercadologica);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarItemFundamental(String itemFundamental) throws Exception {

        driverWEB.ScrollToObject(itemFundText);

        esperarElementoWeb(campoitemFund);
        esperarElementoClicvel(campoitemFund);
        driverWEB.click(campoitemFund);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(itemFundamental);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarFitBottom(String FittBottom) throws Exception {

        driverWEB.ScrollToObject(fitBottomText);

        esperarElementoWeb(campofitBottom);
        esperarElementoClicvel(campofitBottom);
        driverWEB.click(campofitBottom);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(FittBottom);

        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarCadeiaProducao(String cadeiaProducao) throws Exception {

        driverWEB.ScrollToObject(cadeiaProdText);
        driverWEB.click(campocadeiaProd);
        driverWEB.waitObject(InputValor, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(InputValor).sendKeys(cadeiaProducao);
        driverWEB.click(cadeiaProdText);
    }

    public void selecionarValidade(String validade) throws Exception {

        driverWEB.ScrollToObject(validadeText);

        esperarElementoWeb(campoValidade);
        esperarElementoClicvel(campoValidade);
        driverWEB.click(campoValidade);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(validade);

        driverWEB.click(optionSelecionavelCamposdoStyle);



    }

    public void selecionarProdutos(String produtos) throws Exception {

        driverWEB.ScrollToObject(produtosText);

        esperarElementoWeb(campoProdutos);
        esperarElementoClicvel(campoProdutos);
        driverWEB.click(campoProdutos);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(produtos);

        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarValorConversaoILR(String valorConversaoILR) throws Exception {

        driverWEB.ScrollToObject(valorConversaoILRText);

        esperarElementoWeb(campovalorConversaoILR);
        esperarElementoClicvel(campovalorConversaoILR);
        driverWEB.click(campovalorConversaoILR);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(valorConversaoILR);


        driverWEB.click(optionSelecionavelCamposdoStyle);


    }

    public void selecionarLocalizacao(String localizacao) throws Exception {


        driverWEB.ScrollToObject(localizacaoText);

        esperarElementoWeb(campolocalizacao);
        esperarElementoClicvel(campolocalizacao);
        driverWEB.click(campolocalizacao);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(localizacao);


        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarMarca(String marca) throws  Exception{

        driverWEB.ScrollToObject(campoMarcaText);

        esperarElementoWeb(campoMarcaStyle);
        esperarElementoClicvel(campoMarcaStyle);
        driverWEB.click(campoMarcaStyle);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(marca);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }



    public void selecionarLocalizacaoLatam(String localizacaoLatam) throws Exception {

        driverWEB.ScrollToObject(localizacaoLatamText);

        esperarElementoWeb(campolocalizacaoLatam);
        esperarElementoClicvel(campolocalizacaoLatam);
        driverWEB.click(campolocalizacaoLatam);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(localizacaoLatam);

        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarTema(String tema) throws Exception {

        driverWEB.ScrollToObject(temaText);

        esperarElementoWeb(campotema);
        esperarElementoClicvel(campotema);
        driverWEB.click(campotema);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(tema);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarCalendario(String calendario) throws Exception {

        driverWEB.ScrollToObject(calendarioText);

        esperarElementoWeb(campocalendario);
        esperarElementoClicvel(campocalendario);
        driverWEB.click(campocalendario);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(calendario);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarSazonalidade(String sazonalidade) throws Exception {

        driverWEB.ScrollToObject(sazonalidadeText);

        esperarElementoWeb(camposazonalidade);
        esperarElementoClicvel(camposazonalidade);
        driverWEB.click(camposazonalidade);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(sazonalidade);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarOrigem(String origem) throws Exception {

        driverWEB.ScrollToObject(origemText);

        esperarElementoWeb(campoorigem);
        esperarElementoClicvel(campoorigem);
        driverWEB.click(campoorigem);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(origem);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);


    }

    public void selecionarSexo(String sexo) throws Exception {

        driverWEB.ScrollToObject(sexoText);

        esperarElementoWeb(camposexo);
        esperarElementoClicvel(camposexo);
        driverWEB.click(camposexo);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(sexo);

        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarOrigemExistenteVar(String origem) throws Exception {

        driverWEB.ScrollToObject(origemText);

        esperarElementoWeb(campoorigem);
        esperarElementoClicvel(campoorigem);
        driverWEB.click(campoorigem);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(origem);

        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);
    }

    public void selecionarNatureza(String udanatureza) throws Exception {

        driverWEB.ScrollToObject(naturezaText);
        driverWEB.click(camponatureza);
        Thread.sleep(2000);
        driverWEB.waitObject(InputValor, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(InputValor).sendKeys(udanatureza);
        Thread.sleep(1500);
        driverWEB.click(naturezaText);
    }

    public void selecionarCopiaCampoNatureza(String udanatureza) throws Exception {

        driverWEB.ScrollToObject(naturezaText);
        driverWEB.click(camponatureza);
        driverWEB.waitObject(inputCampoNatureza, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoNatureza).sendKeys(udanatureza);
        Thread.sleep(1500);
        driverWEB.click(naturezaText);
    }

    public void selecionarRFID() throws Exception {

        driverWEB.ScrollToObject(rfidText);
        driverWEB.click(campoRFID);
        driverWEB.waitObject(inputRFDI, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputRFDI).sendKeys("N");
        Thread.sleep(1000);
        driverWEB.click(udaRFDIList);
        Thread.sleep(2000);
        driverWEB.click(rfidText);
        Thread.sleep(2000);
    }

    public void selecionarTipoMaterial(String tipoMaterial) throws Exception {

        driverWEB.ScrollToObject(tipoMaterialText);

        esperarElementoWeb(campotipoMaterial);
        esperarElementoClicvel(campotipoMaterial);
        driverWEB.click(campotipoMaterial);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(tipoMaterial);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarTipoMaterialCopy(String tipoMaterial) throws Exception {

        driverWEB.ScrollToObject(tipoMaterialText);

        esperarElementoWeb(campotipoMaterial);
        esperarElementoClicvel(campotipoMaterial);
        driverWEB.click(campotipoMaterial);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(tipoMaterial);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarPadronagem(String padronagem) throws Exception {

        driverWEB.ScrollToObject(padronagemText);

        esperarElementoWeb(campopadronagem);
        esperarElementoClicvel(campopadronagem);
        driverWEB.click(campopadronagem);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(padronagem);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarFast(String fast) throws Exception {

        driverWEB.ScrollToObject(fastText);
        driverWEB.click(campoFast);
        driverWEB.waitObject(InputValor, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(InputValor).sendKeys(fast);
        driverWEB.click(fastText);
    }

    public void selecionarRR(String rr) throws Exception {

        driverWEB.ScrollToObject(rrText);

        esperarElementoWeb(camporr);
        esperarElementoClicvel(camporr);
        driverWEB.click(camporr);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(rr);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarSustentabilidade(String sustentabilidade) throws Exception {

        driverWEB.ScrollToObject(sustentabilidadeText);

        esperarElementoWeb(camposustentabilidade);
        esperarElementoClicvel(camposustentabilidade);
        driverWEB.click(camposustentabilidade);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(sustentabilidade);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);

        driverWEB.click(optionSelecionavelCamposdoStyle);
        Thread.sleep(2000);

    }

    public void selecionarTipoMaterialSustentavel(String tipomatereialsustentavel) throws Exception {

        driverWEB.ScrollToObject(tipoMaterialSustentavelText);

        esperarElementoWeb(campotipoMaterialSustentavel);
        esperarElementoClicvel(campotipoMaterialSustentavel);
        driverWEB.click(campotipoMaterialSustentavel);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(tipomatereialsustentavel);
        Thread.sleep(2000);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarTipoProcessoSustentavel(String tipoprocessosustentavel) throws Exception {

        driverWEB.ScrollToObject(tipoProcessoSustentavelText);

        esperarElementoWeb(campotipoProcessoSustentavel);
        esperarElementoClicvel(campotipoProcessoSustentavel);
        driverWEB.click(campotipoProcessoSustentavel);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        Thread.sleep(2000);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(tipoprocessosustentavel);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarMensagemEtiqueta(String mensagemetiqueta) throws Exception {

        driverWEB.ScrollToObject(mensagemEtiquetaText);

        esperarElementoWeb(campomensagemEtiqueta);
        esperarElementoClicvel(campomensagemEtiqueta);
        driverWEB.doubleClick(campomensagemEtiqueta);

        esperarElementoWeb(EtiquetaCombo);
        esperarElementoClicvel(EtiquetaCombo);
        ((SeleniumRobotsTool) driverWEB).getElement(EtiquetaCombo).sendKeys(mensagemetiqueta);
        driverWEB.click(mensagemEtiquetaText);
    }

    public void selecionarMensagemEtiquetaLatam(String mensagemlatam) throws Exception {

        driverWEB.ScrollToObject(etiquetaLatamText);

        esperarElementoWeb(campomensagemEtiquetaLatam);
        esperarElementoClicvel(campomensagemEtiquetaLatam);
        driverWEB.doubleClick(campomensagemEtiquetaLatam);

        esperarElementoWeb(EtiquetaCombo);
        esperarElementoClicvel(EtiquetaCombo);
        ((SeleniumRobotsTool) driverWEB).getElement(EtiquetaCombo).sendKeys(mensagemlatam);
        driverWEB.click(etiquetaLatamText);


    }

    public void selecionarEstampado(String estampado) throws Exception {

        driverWEB.ScrollToObject(estampadoText);

        esperarElementoWeb(campoestampado);
        esperarElementoClicvel(campoestampado);
        driverWEB.click(campoestampado);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(estampado);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarBordado(String bordado) throws Exception {

        driverWEB.ScrollToObject(possuiBordadoText);

        esperarElementoWeb(campopossuiBordado);
        esperarElementoClicvel(campopossuiBordado);
        driverWEB.click(campopossuiBordado);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(bordado);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarTecidoTinjido(String tecidotinjido) throws Exception {

        driverWEB.ScrollToObject(tecidoTinjidoText);

        esperarElementoWeb(campotecidoTinjido);
        esperarElementoClicvel(campotecidoTinjido);
        driverWEB.click(campotecidoTinjido);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(tecidotinjido);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarTecidoLavavel(String tecidolavavel) throws Exception {

        driverWEB.ScrollToObject(tecidoLavavelText);

        esperarElementoWeb(campotecidoLavavel);
        esperarElementoClicvel(campotecidoLavavel);
        driverWEB.click(campotecidoLavavel);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(tecidolavavel);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarFioDiferente(String fiodiferente) throws Exception {

        driverWEB.ScrollToObject(fioDiferenteText);

        esperarElementoWeb(campofioDiferente);
        esperarElementoClicvel(campofioDiferente);
        driverWEB.click(campofioDiferente);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(fiodiferente);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }


    public void selecionarForro(String forro) throws Exception {

        driverWEB.ScrollToObject(forroText);

        esperarElementoWeb(campoforro);
        esperarElementoClicvel(campoforro);
        driverWEB.click(campoforro);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(forro);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarSizeRange(String sizerange) throws Exception {

        driverWEB.ScrollToObject(sizeRangeText);

        esperarElementoWeb(camposizeRange);
        esperarElementoClicvel(camposizeRange);
        driverWEB.click(camposizeRange);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(sizerange);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);

        Thread.sleep(2000);

    }

    public void selecionarTonsMaquiagem(String maquiagem) throws Exception {
        driverWEB.ScrollToObject(tonsMaquiagemText);

        esperarElementoWeb(campotonsMaquiagem);
        esperarElementoClicvel(campotonsMaquiagem);
        driverWEB.click(campotonsMaquiagem);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(maquiagem);

        driverWEB.click(optionSelecionavelCamposdoStyle);


    }

    public void selecionarComentarioDoItem(String bolsa) throws Exception {

        driverWEB.ScrollToObject(comentarioDoItemText);

        esperarElementoWeb(comentarioDoItem);
        esperarElementoClicvel(comentarioDoItem);
        driverWEB.click(comentarioDoItem);

        esperarElementoWeb(comentarioDoItemInput);
        esperarElementoClicvel(comentarioDoItemInput);

        ((SeleniumRobotsTool) driverWEB).getElement(comentarioDoItemInput).sendKeys(bolsa);

        driverWEB.click(comentarioDoItemText);

    }




    public void selecionarTipoDeTecido(String tipodetecido) throws Exception {

        driverWEB.ScrollToObject(tipoDeTecidoText);

        esperarElementoWeb(tipoDeTecido);
        esperarElementoClicvel(tipoDeTecido);
        driverWEB.click(tipoDeTecido);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(tipodetecido);

        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    //Porcentagem do Material 1
    public void selecionarPorcentagemMaterial1(String porcentagemmaterial1) throws Exception {

        System.out.println("Etapa: Selecionar campos de composição");
        driverWEB.ScrollToObject(porcentagemMaterial1Text);
        driverWEB.click(campoPorcentagemMaterial1);
        Thread.sleep(4000);
        driverWEB.waitObject(inputPorcentagemMaterial1, 30);
        ((SeleniumRobotsTool) driverWEB).getElement(inputPorcentagemMaterial1).sendKeys(porcentagemmaterial1);
        Thread.sleep(3000);
        driverWEB.click(porcentagemMaterial1Text);
    }

    //Porcentagem do Material 2
    public void selecionarPorcentagemMaterial2(String porcentagemmaterial2) throws Exception {

        System.out.println("Etapa: Selecionar campos de composição");
        driverWEB.ScrollToObject(porcentagemMaterial2Text);
        driverWEB.click(campoPorcentagemMaterial2);
        Thread.sleep(4000);
        driverWEB.waitObject(inputPorcentagemMaterial2, 30);
        ((SeleniumRobotsTool) driverWEB).getElement(inputPorcentagemMaterial2).sendKeys(porcentagemmaterial2);
        Thread.sleep(3000);
        driverWEB.click(porcentagemMaterial2Text);
    }

    //Porcentagem do Material 3
    public void selecionarPorcentagemMaterial3(String porcentagemmaterial3) throws Exception {

        System.out.println("Etapa: Selecionar campos de composição");
        driverWEB.ScrollToObject(porccentagemMaterial3Text);
        driverWEB.click(campoPorcentagemMaterial3);
        Thread.sleep(4000);
        driverWEB.waitObject(inputPorcentagemMaterial3, 30);
        ((SeleniumRobotsTool) driverWEB).getElement(inputPorcentagemMaterial3).sendKeys(porcentagemmaterial3);
        Thread.sleep(3000);
        driverWEB.click(porccentagemMaterial3Text);
    }

    //Porcentagem do Material 4
    public void selecionarPorcentagemMaterial4(String porcentagemmaterial4) throws Exception {

        System.out.println("Etapa: Selecionar campos de composição");
        driverWEB.ScrollToObject(porcentagemMaterial4Text);
        driverWEB.click(campoPorcentagemMaterial4);
        Thread.sleep(3000);
        driverWEB.waitObject(inputPorcentagemMaterial4, 15);
        ((SeleniumRobotsTool) driverWEB).getElement(inputPorcentagemMaterial4).sendKeys(porcentagemmaterial4);
        Thread.sleep(3000);
        driverWEB.click(porcentagemMaterial4Text);
    }

    //Porcentagem do Material 5
    public void selecionarPorcentagemMaterial5(String porcentagemmaterial5) throws Exception {

        System.out.println("Etapa: Selecionar campos de composição");
        driverWEB.ScrollToObject(porcentagemMaterial5Text);
        driverWEB.click(campoPorcentagemMaterial5);
        driverWEB.waitObject(inputPorcentagemMaterial5, 4);
        ((SeleniumRobotsTool) driverWEB).getElement(inputPorcentagemMaterial5).sendKeys(porcentagemmaterial5);
        Thread.sleep(3000);
        driverWEB.click(porcentagemMaterial5Text);
    }

    //Porcentagem do Material 6
    public void selecionarPorcentagemMaterial6(String porcentagemmaterial6) throws Exception {

        System.out.println("Etapa: Selecionar campos de composição");
        driverWEB.ScrollToObject(porcentagemMaterial6Text);
        driverWEB.click(campoPorcentagemMaterial6);
        driverWEB.waitObject(inputPorcentagemMaterial6, 4);
        ((SeleniumRobotsTool) driverWEB).getElement(inputPorcentagemMaterial6).sendKeys(porcentagemmaterial6);
        Thread.sleep(3000);
        driverWEB.click(porcentagemMaterial6Text);
    }

    public void selecionarLocalComposicao(String local1) throws Exception {

        System.out.println("Etapa: Selecionar campos de composição");
        driverWEB.ScrollToObject(local1Text);

        esperarElementoWeb(campolocal1);
        esperarElementoClicvel(campolocal1);
        driverWEB.click(campolocal1);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);


        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys("NA");
        driverWEB.click(optionSelecionavelCamposdoStyle);
    }

    public void selecionarLocalComposicao2(String local2) throws Exception {

        System.out.println("Etapa: Selecionar campos de composição");
        driverWEB.ScrollToObject(local2Text);
        driverWEB.click(campolocal2);
        driverWEB.waitObject(inputComposicaoLocal2, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputComposicaoLocal2).sendKeys(local2);
        driverWEB.click(local2Text);
    }

    public void selecionarLocalComposicao3(String local3) throws Exception {

        System.out.println("Etapa: Selecionar campos de composição");
        driverWEB.ScrollToObject(local3Text);
        driverWEB.click(campolocal3);
        driverWEB.waitObject(inputComposicaoLocal3, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputComposicaoLocal3).sendKeys(local3);
        driverWEB.click(local3Text);
    }

    public void selecionarLocalComposicao4(String local4) throws Exception {

        System.out.println("Etapa: Selecionar campos de composição");
        driverWEB.ScrollToObject(local4Text);
        driverWEB.click(campolocal4);
        driverWEB.waitObject(inputComposicaoLocal4, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputComposicaoLocal4).sendKeys(local4);
        driverWEB.click(local4Text);
    }

    public void selecionarCampoComposicao(String campo1) throws Exception {

        //driverWEB.ScrollToObject(campo1Text);

        esperarElementoWeb(campocampo1);
        esperarElementoClicvel(campocampo1);
        driverWEB.click(campocampo1);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);


        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys("Bamboo / Bambu");
        driverWEB.click(optionSelecionavelCamposdoStyle);

    }

    public void selecionarcampoMaterial2(String campomaterial2) throws Exception {

        System.out.println("Etapa: Selecionar campos do Material 1 de composição");
        driverWEB.ScrollToObject(campoMaterial2Text);
        driverWEB.click(campoMaterial2);
        driverWEB.waitObject(inputCampoMaterial2, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoMaterial2).sendKeys(campomaterial2);
        driverWEB.click(campoMaterial2Text);
    }

    public void selecionarcampoMaterial3(String campomaterial3) throws Exception {

        System.out.println("Etapa: Selecionar campos do Material 1 de composição");
        driverWEB.ScrollToObject(campoMaterial3Text);
        driverWEB.click(campoMaterial3);
        driverWEB.waitObject(inputCampoMaterial3, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoMaterial3).sendKeys(campomaterial3);
        driverWEB.click(campoMaterial3Text);
    }

    public void selecionarcampoMaterial4(String campomaterial4) throws Exception {

        System.out.println("Etapa: Selecionar campos do Material 1 de composição");
        driverWEB.ScrollToObject(campoMaterial4Text);
        driverWEB.click(campoMaterial4);
        driverWEB.waitObject(inputCampoMaterial4, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoMaterial4).sendKeys(campomaterial4);
        driverWEB.click(campoMaterial4Text);
    }

    public void selecionarcampoMaterial5(String campomaterial5) throws Exception {

        System.out.println("Etapa: Selecionar campos do Material 1 de composição");
        driverWEB.ScrollToObject(campoMaterial5Text);
        driverWEB.click(campoMaterial5);
        Thread.sleep(4000);
        driverWEB.waitObject(inputCampoMaterial5, 30);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoMaterial5).sendKeys(campomaterial5);
        driverWEB.click(campoMaterial5Text);
    }

    public void selecionarcampoMaterial6(String campomaterial6) throws Exception {

        System.out.println("Etapa: Selecionar campos do Material 1 de composição");
        driverWEB.ScrollToObject(campoMaterial6Text);
        driverWEB.click(campoMaterial6);
        Thread.sleep(4000);
        driverWEB.waitObject(inputCampoMaterial6, 30);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoMaterial6).sendKeys(campomaterial6);
        driverWEB.click(campoMaterial6Text);
    }

    public void selecionarCampoComposicao2(String campo2) throws Exception {

        driverWEB.ScrollToObject(campo2Text);
        driverWEB.click(campocampo2);
        driverWEB.waitObject(inputComposicao2, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputComposicao2).sendKeys(campo2);
        Thread.sleep(5000);
        driverWEB.click(campo2Text);
    }

    public void selecionarCampoComposicao3(String campo3) throws Exception {

        driverWEB.ScrollToObject(campo3Text);
        driverWEB.click(campocampo3);
        driverWEB.waitObject(inputComposicao3, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputComposicao3).sendKeys(campo3);
        Thread.sleep(5000);
        driverWEB.click(campo3Text);
    }

    public void selecionarCampoComposicao4(String campo4) throws Exception {

        driverWEB.ScrollToObject(campo4Text);
        driverWEB.click(campocampo4);
        driverWEB.waitObject(inputComposicao4, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputComposicao4).sendKeys(campo4);
        Thread.sleep(5000);
        driverWEB.click(campo4Text);
    }

    public void selecionarEstampadoExistente(String estampado) throws Exception {

        driverWEB.waitObject(estampadoText, 3);
        driverWEB.ScrollToObject(campoprecoVenda);
        driverWEB.click(campoestampado);
        driverWEB.waitObject(inputCampoObrigatorio, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoObrigatorio).sendKeys("Não");
        driverWEB.click(estampadoText);
    }

    public void selecionarBordadoExistente(String bordado) throws Exception {

        driverWEB.ScrollToObject(possuiBordadoText);
        driverWEB.click(campopossuiBordado);
        driverWEB.waitObject(inputCampoObrigatorio, 3);
        //driverWEB.setText(inputCampoObrigatorio, bordado);
        //driverWEB.setText(inputCampoObrigatorio, "Não");
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoObrigatorio).sendKeys("Não");
        driverWEB.click(possuiBordadoText);
    }

    public void selecionarTecidoTinjidoExistente(String tecidotinjido) throws Exception {

        driverWEB.ScrollToObject(tecidoTinjidoText);
        driverWEB.click(campotecidoTinjido);
        driverWEB.waitObject(inputCampoObrigatorio, 3);
        //driverWEB.setText(inputCampoObrigatorio, tecidotinjido);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoObrigatorio).sendKeys(tecidotinjido);
        driverWEB.click(tecidoTinjidoText);
    }

    public void selecionarTecidoLavavelExistente(String tecidolavavel) throws Exception {

        driverWEB.ScrollToObject(tecidoLavavelText);
        driverWEB.click(campotecidoLavavel);
        driverWEB.waitObject(inputCampoObrigatorio, 3);
        //driverWEB.setText(inputCampoObrigatorio, tecidolavavel);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoObrigatorio).sendKeys(tecidolavavel);
        driverWEB.click(tecidoLavavelText);
    }

    public void selecionarFioDiferenteExistente(String fiodiferente) throws Exception {

        driverWEB.ScrollToObject(fioDiferenteText);
        driverWEB.click(campofioDiferente);
        driverWEB.waitObject(inputCampoObrigatorio, 3);
        //driverWEB.setText(inputCampoObrigatorio, fiodiferente);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoObrigatorio).sendKeys(fiodiferente);
        driverWEB.click(fioDiferenteText);
    }

    public void selecionarCadeiaProdutivaInformacao(String cadeiaprodutivainformacao) throws Exception {

        addLog(scenario, "Etapa: Selecionar campos obrigatórios");

        driverWEB.ScrollToObject(cadeiaProdutivaInformacaoText);

        esperarElementoWeb(campocadeiaProdutivaInformacao);
        esperarElementoClicvel(campocadeiaProdutivaInformacao);
        driverWEB.click(campocadeiaProdutivaInformacao);

        esperarElementoWeb(inputCamposDoStyleProperties);
        esperarElementoClicvel(inputCamposDoStyleProperties);
        esperarElementoWeb(optionSelecionavelCamposdoStyle);
        esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCamposDoStyleProperties).sendKeys(cadeiaprodutivainformacao);

        //esperarElementoWeb(optionSelecionavelCamposdoStyle);
        //esperarElementoClicvel(optionSelecionavelCamposdoStyle);
        driverWEB.click(optionSelecionavelCamposdoStyle);
        Thread.sleep(2000);

    }

    public void selecionarMarcaExistente(String udamarca) throws Exception {

        System.out.println("Etapa: Selecionar campos obrigatórios");
        driverWEB.ScrollToObject(udaMarcaText);
        driverWEB.click(campoudaMarca);
        Thread.sleep(2000);
        driverWEB.waitObject(inputCampoObrigatorio, 3);
        //driverWEB.setText(inputCampoObrigatorio, udamarca);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoObrigatorio).sendKeys(udamarca);
        driverWEB.click(udaMarcaText);
    }

    public void selecionarMarcaExistenteVar(String udamarca) throws Exception {

        System.out.println("Etapa: Selecionar campos obrigatórios");
        driverWEB.ScrollToObject(udaMarcaText);
        driverWEB.click(campoudaMarca);
        Thread.sleep(2000);
        driverWEB.waitObject(inputCampoMarca, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoMarca).sendKeys(udamarca);
        Thread.sleep(1000);
        driverWEB.click(udaMarcaList);
        Thread.sleep(2000);
        driverWEB.click(udaMarcaText);
    }

    public void selecionarMarcaBeleza(String udamarca) throws Exception {

        System.out.println("Etapa: Marca");
        driverWEB.ScrollToObject(udaMarcaText);
        driverWEB.click(campoudaMarca);
        Thread.sleep(2000);
        driverWEB.waitObject(inputCampoMarcaBeleza, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoMarcaBeleza).sendKeys(udamarca);
        //driverWEB.click(udaMarcaList);
        driverWEB.click(udaMarcaText);
    }

    public void selecionarUdaValidade(String udavalidade) throws Exception {
        driverWEB.ScrollToObject(udaValidadeText);
        driverWEB.click(campoUdaValidade);
        driverWEB.waitObject(inputCampoObrigatorio, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoObrigatorio).sendKeys(udavalidade);
        driverWEB.click(udaValidadeText);


    }

    public void selecionarInner(String udainner) throws Exception {

        System.out.println("Etapa: Inner");
        driverWEB.ScrollToObject(udaInnerText);
        driverWEB.click(campoudaInner);
        Thread.sleep(2000);
        driverWEB.waitObject(inputCampoInner, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoInner).sendKeys(udainner);
        driverWEB.click(udaInnerText);
    }

    public void selecionarCase(String udacase) throws Exception {

        System.out.println("Etapa: Case");
        driverWEB.ScrollToObject(udaCaseText);
        driverWEB.click(campoudaCase);
        Thread.sleep(2000);
        driverWEB.waitObject(inputCampoCase, 3);
        ((SeleniumRobotsTool) driverWEB).getElement(inputCampoCase).sendKeys(udacase);
        driverWEB.click(udaCaseText);
    }

}
