package br.com.plm.mdm.steps.PLM;

import br.com.plm.mdm.interactions.PLM.CamposObrigatoriosPageInteractions;
import br.com.plm.mdm.steps.Common;
import br.com.renner.report.RennerTest;
import br.com.renner.robots.IRNRobotsTool;
import helpers.Utils;
import io.cucumber.java.pt.E;
import org.junit.Assert;

import java.io.IOException;

import static helpers.Utils.tirarPrint;

public class CamposObrigatorios extends CamposObrigatoriosPageInteractions {

    private final RennerTest test;
    Utils utils;

    IRNRobotsTool driverWEB = Common.seleniumRobotsTool;

    public CamposObrigatorios(Common common) throws IOException {
        test = Common.test;
        utils = new Utils(driverWEB, Common.directoryName);
    }

    @E("preencho campos obrigatórios beleza, informando {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void informarCamposObrigatoriosBeleza(String pais, String tipoProdutoComercial, String tipoProdutoFiscal, String detalheProduto, String ncmFornecedor, String unitCost, String precoVenda, String precoVendaUruguai, String precoVendaArgentina, String faixaPreco, String origemMercadoria, String categoriaGenerica, String packingMethod, String grupoInsumo, String piramideMercadologica, String itemFundamental, String localizacao, String localizacaoLatam, String campoMarca, String tema, String calendario, String sazonalidade, String origem, String sexo, String tipoMaterial, String padronagem, String sustentabilidade, String tipomaterialsustentavel, String tipoprocessosustentavel, String mensagemetiqueta, String mensagemlatam, String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String cadeiaProduto, String forro, String validade, String produtos, String sizerange) throws Exception {

        try {
            test.createTestStep("Campos Obrigatórios", "Informar campos obrigatórios de um item beleza");
            String estampaProduto = "Liso";
            selecionarCadeiaProdutivaInformacao("NA");
            Thread.sleep(1000);
            selecionarPais(pais);
            Thread.sleep(1000);
            selecionarTipoProdutoComercial(tipoProdutoComercial);
            Thread.sleep(1000);
            //selecionarTipoProdutoFiscal(tipoProdutoFiscal);
            //Thread.sleep(1000);
            selecionarDetalheProduto(detalheProduto);
            Thread.sleep(1000);
            selecionarNcmFornecedor(ncmFornecedor);
            Thread.sleep(1000);
            selecionarUnitCost(unitCost);
            Thread.sleep(1000);
            selecionarPrecoVenda(precoVenda);
            Thread.sleep(1000);
            //selecionarPrecoVendaUY(precoVendaUruguai);
            //Thread.sleep(1000);
            selecionarPrecoVendaAR(precoVendaArgentina);
            Thread.sleep(1000);
            //selecionarFaixaPreco(faixaPreco);
            //selecionarOrigemMerc(origemMercadoria);
            selecionarCategoriaGenerica(categoriaGenerica);
            selecionarPackingMethod(packingMethod);
            selecionarGrupoInsumo(grupoInsumo);
            selecionarPiramideMercadologica(piramideMercadologica);
            selecionarItemFundamental(itemFundamental);
            Thread.sleep(1000);
            selecionarLocalizacao(localizacao);
            Thread.sleep(1000);
            //selecionarLocalizacaoLatam(localizacaoLatam);
            //Thread.sleep(1000);
            //selecionarMarcaBeleza("Pegada");
            //Thread.sleep(1000);
            selecionarMarca(campoMarca);
            Thread.sleep(2000);
            selecionarTema(tema);
            Thread.sleep(1000);
            selecionarCalendario(calendario);
            selecionarSazonalidade(sazonalidade);
            //selecionarOrigem(origem);
            selecionarSexo(sexo);
            Thread.sleep(1000);
            selecionarTipoMaterial(tipoMaterial);
            Thread.sleep(1000);
            selecionarPadronagem(padronagem);
            Thread.sleep(1000);
            //selecionarFast("Normal");
            selecionarTipoProcessoSustentavel(tipoprocessosustentavel);
            Thread.sleep(1000);
            selecionarTipoMaterialSustentavel(tipomaterialsustentavel);
            Thread.sleep(1000);
            selecionarSustentabilidade(sustentabilidade);
            selecionarMensagemEtiqueta(mensagemetiqueta);
            selecionarMensagemEtiquetaLatam(mensagemlatam);
            selecionarEstampado(estampado);
            selecionarBordado(bordado);
            selecionarTecidoTinjido(tecidotinjido);
            selecionarTecidoLavavel(tecidolavavel);
            selecionarFioDiferente(fiodiferente);
            Thread.sleep(1000);
            //selecionarCadeiaProducao(cadeiaProduto);
            //Thread.sleep(1000);
            selecionarForro(forro);
            selecionarValidade(validade);
            selecionarProdutos(produtos);
            selecionarValorConversaoILR("NA");
            selecionarSizeRange(sizerange);
            Thread.sleep(1000);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_obrigatorio", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos de composição, informando {string} e {string}")
    public void informarCamposComposicao(String local1, String campo1) throws Exception {
        try {
            test.createTestStep("Campo composição", "Informar campo de composição de um item");
            Thread.sleep(4000);
            selecionarLocalComposicao(local1);
            selecionarCampoComposicao(campo1);
            Thread.sleep(3000);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_composicao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos de composição feminino, informando {string} e {string}")
    public void informarCamposComposicaoFeminino(String local1, String campo1) throws Exception {
        try {
            test.createTestStep("Campo composição", "Informar campo de composição de um item");
            Thread.sleep(5000);
            // Material 1
            selecionarLocalComposicao(local1);
            selecionarCampoComposicao(campo1);
            // Porcentagem do Material 1
            //selecionarPorcentagemMaterial1("40");

            // Material 2 = Bamboo / Bambu
            //selecionarcampoMaterial2("Bamboo / Bambu");
            // Porcentagem do Material 2
            //selecionarPorcentagemMaterial2("10");
            //Thread.sleep(3000);

            // Material 3
            //selecionarcampoMaterial3("Crystal / Cristal");
            // Porcentagem do Material 3
            //selecionarPorcentagemMaterial3("10");
            //Thread.sleep(3000);

            // Material 4
            //selecionarcampoMaterial4("Acetate / Acetato");
            // Porcentagem do Material 4
            //selecionarPorcentagemMaterial4("3");
            //Thread.sleep(3000);

            // Material 5
            //selecionarcampoMaterial5("Brass / Latão");
            // Porcentagem do Material 5
            //selecionarPorcentagemMaterial5("20.2");
            //Thread.sleep(3000);

            // Material 6
            //selecionarcampoMaterial6("Acetate / Acetato");
            // Porcentagem do Material 6
            //selecionarPorcentagemMaterial6("16.8");
            //Thread.sleep(5000);
            //selecionarLocalComposicao2("Bottom");
            //selecionarCampoComposicao2("Acetate / Acetato");
            //Thread.sleep(5000);
            //selecionarLocalComposicao3("Cabedal");
            //selecionarCampoComposicao3("Cotton / Algodão");
            //Thread.sleep(5000);
            //selecionarLocalComposicao4("Bojo");
            //selecionarCampoComposicao4("Cupro / Cupro");
            //Thread.sleep(5000);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_composicao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos de composição infantil, informando {string} e {string}")
    public void informarCamposComposicaoInfantil(String local1, String campo1) throws Exception {
        try {
            test.createTestStep("Campo composição", "Informar campo de composição de um item");
            Thread.sleep(5000);
            selecionarLocalComposicao(local1);
            Thread.sleep(1000);
            selecionarCampoComposicao(campo1);
            Thread.sleep(4000);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_composicao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos de composição acessorios, informando {string}, {string}")
    public void informarCamposComposicaoAcessorios(String local1, String campo1) throws Exception {
        try {
            test.createTestStep("Campo composição", "Informar campo de composição de um item");
            Thread.sleep(5000);
            selecionarLocalComposicao(local1);
            selecionarCampoComposicao(campo1);
            Thread.sleep(5000);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_composicao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }




    }

    @E("preencho campos de composição beleza, informando {string} e {string}")
    public void informarCamposComposicaobeleza(String local1, String campo1) throws Exception {
        try {
            test.createTestStep("Campo composição", "Informar campo de composição de um item");
            Thread.sleep(5000);
            selecionarLocalComposicao(local1);
            selecionarCampoComposicao(campo1);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_composicao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos obrigatórios, criado a partir de um existente, informando {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} e {string}")
    public void informarCamposObrigatoriosItemApartirDeExistente(String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String udamarca, String origempais, String udaorigem, String udanatureza) throws Exception {

        try {
            String tipoprocessosustentavel = "NA";
            String tipomatereialsustentavel = "Nao se Aplica";
            String sustentabilidade = "Nao se Aplica";
            //String tipoMaterial = "Jeans";
            Thread.sleep(2000);
            String golaDecote = "Alta";
            //String ncm = "61091000";

            test.createTestStep("Campos obrigatórios para copiar item", "Informar campos obrigatórios de um item");
            Thread.sleep(2000);
            selecionarPaisCopia(origempais);
            //selecionarOrigemExistenteVar(udaorigem);
            Thread.sleep(1000);
            selecionarGolaDecote(golaDecote);

            selecionarTipoProcessoSustentavel(tipoprocessosustentavel);
            Thread.sleep(1000);
            selecionarTipoMaterialSustentavel(tipomatereialsustentavel);
            Thread.sleep(1000);
            selecionarSustentabilidade(sustentabilidade);
            Thread.sleep(1000);

            selecionarEstampado(estampado);
            selecionarBordado(bordado);
            selecionarTecidoTinjido(tecidotinjido);
            selecionarTecidoLavavel(tecidolavavel);
            selecionarFioDiferente(fiodiferente);
            Thread.sleep(2000);


        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_composicao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos obrigatórios issue, criado a partir de um existente, informando {string}, {string}, {string}, {string}, {string}, {string}, {string} e {string}")
    public void informarCamposObrigatoriosItemIssueApartirDeExistente(String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String udamarca, String origempais, String udaorigem) throws Exception {

        try {
            String tipoprocessosustentavel = "NA";
            String tipomatereialsustentavel = "NA";
            String sustentabilidade = "Nao se Aplica";
            String golaDecote = "Alta";
            String ncm = "61161000";
            test.createTestStep("Campos obrigatórios para copiar item", "Informar campos obrigatórios de um item");
            //selecionarRFID();
            Thread.sleep(2000);
            selecionarCase("15");
            selecionarInner("20");
            Thread.sleep(1000);
            selecionarTipoProcessoSustentavel(tipoprocessosustentavel);
            Thread.sleep(1000);
            selecionarTipoMaterialSustentavel(tipomatereialsustentavel);
            Thread.sleep(1000);
            selecionarSustentabilidade(sustentabilidade);
            selecionarEstampadoExistente(estampado);
            selecionarBordadoExistente(bordado);
            selecionarTecidoTinjidoExistente(tecidotinjido);
            Thread.sleep(1000);
            selecionarTecidoLavavelExistente(tecidolavavel);
            Thread.sleep(1000);
            selecionarFioDiferenteExistente(fiodiferente);
            Thread.sleep(1000);
            //selecionarCadeiaProdutivaInformacao("Jeans");Thread.sleep(1000);
            selecionarNcmFornecedor(ncm);
            selecionarGolaDecote(golaDecote);
            Thread.sleep(1000);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_composicao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos obrigatórios, informando {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void informarCamposObrigatorios(String cadeiaProdutiva, String pais, String tipoProdutoComercial, String materialProduto, String estampaProduto, String detalheProduto, String ncmFornecedor, String unitCost, String precoVenda, String precoVendaUruguai, String precoVendaArgentina, String faixaPreco, String origemMercadoria, String categoriaGenerica, String packingMethod, String grupoInsumo, String piramideMercadologica, String itemFundamental, String cadeiaProduto, String localizacao, String localizacaoLatam, String tema, String calendario, String origem, String natureza, String tipoMaterial, String padronagem, String rr, String sustentabilidade, String tipomaterialsustentavel, String tipoprocessosustentavel, String mensagemetiqueta, String mensagemlatam, String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String forro, String sazonalidade, String maquiagem, String tipodetecido, String sizerange) throws Exception {

        try {
            Thread.sleep(5000);
            String golaDecote = "Alta";
            test.createTestStep("Campos Obrigatórios", "Informar campos obrigatórios de um item");
            //UDA - Cadeia Produtiva Informação
            selecionarCadeiaProdutivaInformacao(cadeiaProdutiva);
            Thread.sleep(1000);
            selecionarPais(pais);
            Thread.sleep(1000);
            selecionarTipoProdutoComercial(tipoProdutoComercial);
            Thread.sleep(1000);
            //selecionarTipoProdutoFiscal(tipoProdutoFiscal);
            //Thread.sleep(1000);
            //selecionarMaterialProduto(materialProduto);
            //Thread.sleep(1000);
            selecionarEstampaProduto(estampaProduto);
            Thread.sleep(1000);
            selecionarDetalheProduto(detalheProduto);
            Thread.sleep(1000);
            selecionarNcmFornecedor(ncmFornecedor);
            selecionarUnitCost(unitCost);
            Thread.sleep(1000);
            selecionarPrecoVenda(precoVenda);
            //selecionarPrecoVendaUY(precoVendaUruguai);
            //Thread.sleep(1000);
            selecionarPrecoVendaAR(precoVendaArgentina);
            Thread.sleep(1000);
            //selecionarFaixaPreco(faixaPreco);
            //selecionarOrigemMerc(origemMercadoria);
            selecionarCategoriaGenerica(categoriaGenerica);
            selecionarPackingMethod(packingMethod);
            selecionarGrupoInsumo(grupoInsumo);
            selecionarPiramideMercadologica(piramideMercadologica);
            selecionarItemFundamental(itemFundamental);
            Thread.sleep(1000);
            selecionarLocalizacao(localizacao);
            Thread.sleep(1000);
            //selecionarLocalizacaoLatam(localizacaoLatam);
            //Thread.sleep(1000);
            selecionarTema(tema);
            Thread.sleep(1000);
            selecionarCalendario(calendario);
            selecionarSazonalidade(sazonalidade);
            selecionarOrigem(origem);
            selecionarTipoMaterial(tipoMaterial);
            Thread.sleep(1000);
            selecionarPadronagem(padronagem);
            Thread.sleep(1000);
            selecionarRR(rr);
            selecionarTipoProcessoSustentavel(tipoprocessosustentavel);
            Thread.sleep(1000);
            selecionarTipoMaterialSustentavel(tipomaterialsustentavel);
            Thread.sleep(1000);
            selecionarSustentabilidade(sustentabilidade);
            Thread.sleep(1000);
            selecionarMensagemEtiqueta(mensagemetiqueta);
            selecionarMensagemEtiquetaLatam(mensagemlatam);
            selecionarEstampado(estampado);
            selecionarBordado(bordado);
            selecionarTecidoTinjido(tecidotinjido);
            selecionarTecidoLavavel(tecidolavavel);
            selecionarFioDiferente(fiodiferente);
            //selecionarTonsMaquiagem(maquiagem);
            //selecionarTipoDeTecido(tipodetecido);
            selecionarGolaDecote(golaDecote);
            Thread.sleep(1000);
            //selecionarFaccao("Facção");
            //Thread.sleep(1000);
            //selecionarCadeiaProducao(cadeiaProduto);
            //Thread.sleep(1000);
            selecionarForro(forro);
            selecionarSizeRange(sizerange);
            Thread.sleep(1000);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_obrigatorio", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos obrigatórios acessorios, informando {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void informarCamposObrigatoriosAcessorios(String pais, String tipoProdutoComercial, String tipoProdutoFiscal, String materialProduto, String estampaProduto, String detalheProduto, String ncmFornecedor, String unitCost, String precoVenda, String precoVendaUruguai, String precoVendaArgentina, String faixaPreco, String origemMercadoria, String categoriaGenerica, String packingMethod, String grupoInsumo, String piramideMercadologica, String itemFundamental, String cadeiaProdutiva, String localizacao, String localizacaoLatam, String campoMarca, String tema, String calendario, String origem, String natureza, String tipoMaterial, String padronagem, String rr, String sustentabilidade, String tipomaterialsustentavel, String tipoprocessosustentavel, String mensagemetiqueta, String mensagemlatam, String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String forro, String sazonalidade, String maquiagem, String tipodetecido, String sizerange, String comentarioDoItem) throws Exception {

        try {
            String golaDecote = "Alta";
            test.createTestStep("Campos Obrigatórios", "Informar campos obrigatórios de um item");
            Thread.sleep(1000);
            selecionarCadeiaProdutivaInformacao(cadeiaProdutiva);
            Thread.sleep(1000);
            selecionarPais(pais);
            Thread.sleep(1000);
            selecionarTipoProdutoComercial(tipoProdutoComercial);
            Thread.sleep(1000);
            //selecionarTipoProdutoFiscal(tipoProdutoFiscal);
            //Thread.sleep(1000);
            //selecionarMaterialProduto(materialProduto);
            //Thread.sleep(1000);
            selecionarEstampaProduto(estampaProduto);
            Thread.sleep(1000);
            selecionarDetalheProduto(detalheProduto);
            Thread.sleep(1000);
            selecionarNcmFornecedor(ncmFornecedor);
            selecionarUnitCost(unitCost);
            Thread.sleep(1000);
            selecionarPrecoVenda(precoVenda);
            //selecionarPrecoVendaUY(precoVendaUruguai);
            //Thread.sleep(1000);
            selecionarPrecoVendaAR(precoVendaArgentina);
            Thread.sleep(1000);
            //selecionarFaixaPreco(faixaPreco);
            //selecionarOrigemMerc(origemMercadoria);
            selecionarCategoriaGenerica(categoriaGenerica);
            selecionarPackingMethod(packingMethod);
            selecionarGrupoInsumo(grupoInsumo);
            selecionarPiramideMercadologica(piramideMercadologica);
            selecionarItemFundamental(itemFundamental);
            Thread.sleep(1000);
            selecionarLocalizacao(localizacao);
            Thread.sleep(1000);
            //selecionarLocalizacaoLatam(localizacaoLatam);
            //Thread.sleep(1000);
            selecionarMarca(campoMarca);
            Thread.sleep(2000);
            //selecionarMarcaBeleza("Pegada");
            //Thread.sleep(1000);
            selecionarTema(tema);
            Thread.sleep(1000);
            selecionarCalendario(calendario);
            selecionarSazonalidade(sazonalidade);
            selecionarOrigem(origem);
            //selecionarNatureza(natureza);
            selecionarTipoMaterial(tipoMaterial);
            Thread.sleep(1000);
            selecionarPadronagem(padronagem);
            Thread.sleep(1000);
            selecionarRR(rr);
            selecionarTipoProcessoSustentavel(tipoprocessosustentavel);
            Thread.sleep(1000);
            selecionarTipoMaterialSustentavel(tipomaterialsustentavel);
            Thread.sleep(1000);
            selecionarSustentabilidade(sustentabilidade);
            selecionarMensagemEtiqueta(mensagemetiqueta);
            selecionarMensagemEtiquetaLatam(mensagemlatam);
            selecionarEstampado(estampado);
            selecionarBordado(bordado);
            selecionarTecidoTinjido(tecidotinjido);
            selecionarTecidoLavavel(tecidolavavel);
            selecionarFioDiferente(fiodiferente);
            //selecionarTonsMaquiagem(maquiagem);
            selecionarTipoDeTecido(tipodetecido);
            selecionarGolaDecote(golaDecote);
            Thread.sleep(1000);
            //selecionarCadeiaProducao(cadeiaProduto);
            //Thread.sleep(1000);
            selecionarForro(forro);
            selecionarSizeRange(sizerange);
            Thread.sleep(1000);
            selecionarComentarioDoItem(comentarioDoItem);
            Thread.sleep(1000);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_obrigatorio", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos obrigatórios infantil, informando {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void informarCamposObrigatoriosInfantil(String pais, String tipoProdutoComercial, String materialProduto, String estampaProduto, String detalheProduto, String ncmFornecedor, String unitCost, String precoVenda, String precoVendaArgentina, String faixaPreco, String origemMercadoria, String categoriaGenerica, String packingMethod, String grupoInsumo, String piramideMercadologica, String itemFundamental, String cadeiaProduto, String FittBottom, String localizacao, String localizacaoLatam, String tema, String calendario, String origem, String natureza, String tipoMaterial, String padronagem, String rr, String sustentabilidade, String tipomaterialsustentavel, String tipoprocessosustentavel, String mensagemetiqueta, String mensagemlatam, String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String forro, String sazonalidade, String maquiagem, String tipodetecido, String sizerange) throws Exception {

        try {
            String golaDecote = "Alta";
            test.createTestStep("Campos Obrigatórios", "Informar campos obrigatórios de um item");
            //UDA - Cadeia Produtiva
            selecionarCadeiaProdutivaInformacao("Tecido Plano");
            Thread.sleep(1000);
            selecionarPais(pais);
            Thread.sleep(1000);
            selecionarTipoProdutoComercial(tipoProdutoComercial);
            Thread.sleep(1000);
            //selecionarMaterialProduto(materialProduto);
            //Thread.sleep(1000);
            selecionarEstampaProduto(estampaProduto);
            Thread.sleep(1000);
            selecionarDetalheProduto(detalheProduto);
            Thread.sleep(1000);
            selecionarNcmFornecedor(ncmFornecedor);
            selecionarUnitCost(unitCost);
            Thread.sleep(1000);
            selecionarPrecoVenda(precoVenda);
            Thread.sleep(1000);
            selecionarPrecoVendaAR(precoVendaArgentina);
            Thread.sleep(1000);
            //selecionarFaixaPreco(faixaPreco);
            //selecionarOrigemMerc(origemMercadoria);
            selecionarCategoriaGenerica(categoriaGenerica);
            selecionarPackingMethod(packingMethod);
            selecionarGrupoInsumo(grupoInsumo);
            selecionarPiramideMercadologica(piramideMercadologica);
            selecionarItemFundamental(itemFundamental);
            Thread.sleep(1000);
            selecionarFitBottom(FittBottom);
            Thread.sleep(1000);
            selecionarLocalizacao(localizacao);
            Thread.sleep(1000);
            //selecionarLocalizacaoLatam(localizacaoLatam);
            //Thread.sleep(1000);
            selecionarTema(tema);
            Thread.sleep(1000);
            selecionarCalendario(calendario);
            selecionarSazonalidade(sazonalidade);
            //selecionarOrigem(origem);
            selecionarSexo("Feminino");
            //selecionarNatureza(natureza);
            selecionarTipoMaterial(tipoMaterial);
            Thread.sleep(1000);
            selecionarPadronagem(padronagem);
            Thread.sleep(1000);
            selecionarRR(rr);
            selecionarTipoProcessoSustentavel(tipoprocessosustentavel);
            Thread.sleep(1000);
            selecionarTipoMaterialSustentavel(tipomaterialsustentavel);
            Thread.sleep(1000);
            selecionarSustentabilidade(sustentabilidade);
            selecionarMensagemEtiqueta(mensagemetiqueta);
            selecionarMensagemEtiquetaLatam(mensagemlatam);
            selecionarEstampado(estampado);
            selecionarBordado(bordado);
            selecionarTecidoTinjido(tecidotinjido);
            selecionarTecidoLavavel(tecidolavavel);
            selecionarFioDiferente(fiodiferente);
            //selecionarTonsMaquiagem(maquiagem);
            //selecionarTipoDeTecido(tipodetecido);
            selecionarGolaDecote(golaDecote);
            Thread.sleep(1000);
            //selecionarCadeiaProducao(cadeiaProduto);
            //Thread.sleep(1000);
            selecionarForro(forro);
            selecionarSizeRange(sizerange);
            Thread.sleep(1000);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_obrigatorio", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos obrigatórios feminino, informando {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void informarCamposObrigatoriosFeminino(String cadeiaProdutiva, String pais, String tipoProdutoComercial, String tipoProdutoFiscal, String materialProduto, String estampaProduto, String detalheProduto, String ncmFornecedor, String unitCost, String precoVenda, String precoVendaUruguai, String precoVendaArgentina, String faixaPreco, String origemMercadoria, String categoriaGenerica, String packingMethod, String grupoInsumo, String piramideMercadologica, String itemFundamental, String cadeiaProduto, String localizacao, String localizacaoLatam, String tema, String calendario, String origem, String natureza, String tipoMaterial, String padronagem, String rr, String sustentabilidade, String tipomaterialsustentavel, String tipoprocessosustentavel, String mensagemetiqueta, String mensagemlatam, String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String forro, String sazonalidade, String maquiagem, String tipodetecido, String sizerange) throws Exception {

        try {
            String golaDecote = "Alta";
            test.createTestStep("Campos Obrigatórios", "Informar campos obrigatórios de um item");
            Thread.sleep(1000);
            //UDA - Cadeia Produtiva
            selecionarCadeiaProdutivaInformacao(cadeiaProdutiva);
            Thread.sleep(1000);
            selecionarPais(pais);
            Thread.sleep(1000);
            selecionarTipoProdutoComercial(tipoProdutoComercial);
            Thread.sleep(1000);
            //selecionarTipoProdutoFiscal(tipoProdutoFiscal);
            //Thread.sleep(1000);
            //selecionarMaterialProduto(materialProduto);
            //Thread.sleep(1000);
            selecionarEstampaProduto(estampaProduto);
            Thread.sleep(1000);
            selecionarDetalheProduto(detalheProduto);
            Thread.sleep(1000);
            selecionarNcmFornecedor(ncmFornecedor);
            selecionarUnitCost(unitCost);
            Thread.sleep(1000);
            selecionarPrecoVenda(precoVenda);
            //selecionarPrecoVendaUY(precoVendaUruguai);
            //Thread.sleep(1000);
            selecionarPrecoVendaAR(precoVendaArgentina);
            Thread.sleep(1000);
            //selecionarFaixaPreco(faixaPreco);
            //selecionarOrigemMerc(origemMercadoria);
            selecionarCategoriaGenerica(categoriaGenerica);
            selecionarPackingMethod(packingMethod);
            selecionarGrupoInsumo(grupoInsumo);
            selecionarPiramideMercadologica(piramideMercadologica);
            selecionarItemFundamental(itemFundamental);
            Thread.sleep(1000);
            selecionarLocalizacao(localizacao);
            Thread.sleep(1000);
            //selecionarLocalizacaoLatam(localizacaoLatam);
            //Thread.sleep(1000);
            selecionarTema(tema);
            Thread.sleep(1000);
            selecionarCalendario(calendario);
            selecionarSazonalidade(sazonalidade);
            //selecionarOrigem(origem);
            //selecionarSexo("Feminino");
            //selecionarNatureza(natureza);
            selecionarTipoMaterial(tipoMaterial);
            Thread.sleep(1000);
            selecionarPadronagem(padronagem);
            Thread.sleep(1000);
            //selecionarFast("Normal");
            selecionarRR(rr);
            selecionarTipoProcessoSustentavel(tipoprocessosustentavel);
            Thread.sleep(1000);
            selecionarTipoMaterialSustentavel(tipomaterialsustentavel);
            Thread.sleep(1000);
            selecionarSustentabilidade(sustentabilidade);
            selecionarMensagemEtiqueta(mensagemetiqueta);
            selecionarMensagemEtiquetaLatam(mensagemlatam);
            selecionarEstampado(estampado);
            selecionarBordado(bordado);
            selecionarTecidoTinjido(tecidotinjido);
            selecionarTecidoLavavel(tecidolavavel);
            selecionarFioDiferente(fiodiferente);
            //selecionarTonsMaquiagem(maquiagem);
            selecionarTipoDeTecido(tipodetecido);
            selecionarGolaDecote(golaDecote);
            Thread.sleep(1000);
            //selecionarCadeiaProducao(cadeiaProduto);
            //Thread.sleep(1000);
            selecionarForro(forro);
            selecionarSizeRange(sizerange);
            Thread.sleep(1000);
            Utils.tirarPrint(Common.scenario);
        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_obrigatorio", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }


    @E("preencho campos obrigatórios, criado a partir de um existente, informando {string}, {string}, {string}, {string}, {string} e {string}")
    public void preenchoCamposObrigatóriosCriadoAPartirDeUmExistenteInformandoEstampadoBordadoTecidotinjidoTecidolavavelFiodiferenteEUdamarca(String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String udaorigem, String udamarcaa) throws IOException {
        try {
            String ncm = "61161000";
            test.createTestStep("Campos Obrigatórios", "Informar campos obrigatórios de um item");
            selecionarNcmFornecedor(ncm);
            selecionarRFID();
            selecionarEstampadoExistente(estampado);
            selecionarBordadoExistente(bordado);
            selecionarTecidoTinjidoExistente(tecidotinjido);
            selecionarTecidoLavavelExistente(tecidolavavel);
            selecionarFioDiferenteExistente(fiodiferente);
            selecionarOrigemExistenteVar(udaorigem);
            selecionarMarcaExistenteVar(udamarcaa);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_obrigatorio", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencher os campos obrigatórios do item, criando a partir de um item existente, informando  {string}, {string}, {string}, {string}, {string} e {string}")
    public void preenchoOsCamposObrigatórios(String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String udaorigem, String udamarcaa) throws IOException {
        try {
            String ncm = "61161000";
            test.createTestStep("Campos Obrigatórios", "Informar campos obrigatórios de um item");
            selecionarNcmFornecedor(ncm);
            selecionarRFID();
            selecionarEstampadoExistente(estampado);
            selecionarBordadoExistente(bordado);
            selecionarTecidoTinjidoExistente(tecidotinjido);
            selecionarTecidoLavavelExistente(tecidolavavel);
            selecionarFioDiferenteExistente(fiodiferente);
            selecionarOrigemExistenteVar(udaorigem);
            selecionarMarcaExistenteVar(udamarcaa);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_obrigatorio", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }

    }

    @E("preencho campos obrigatórios view feminino, criado a partir de um existente, informando {string}, {string}, {string}, {string}, {string}, {string}, {string} e {string}")
    public void informarCamposObrigatoriosViewFemininoItemApartirDeExistente(String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String udamarca, String origempais, String udanatureza) throws Exception {

        try {
            String tipoprocessosustentavel = "NA";
            String tipomatereialsustentavel = "Nao se Aplica";
            String sustentabilidade = "Nao se Aplica";
            String tipoMaterial = "Sarja";
            Thread.sleep(2000);
            String golaDecote = "Alta";
            String ncm = "61091000";

            test.createTestStep("Campos obrigatórios para copiar item", "Informar campos obrigatórios de um item");
            Thread.sleep(2000);
            selecionarPaisCopia(origempais);
            //selecionarOrigemExistenteVar(udaorigem);
            Thread.sleep(1000);
            selecionarGolaDecote(golaDecote);
            selecionarTipoProcessoSustentavel(tipoprocessosustentavel);
            Thread.sleep(1000);
            selecionarTipoMaterialSustentavel(tipomatereialsustentavel);
            Thread.sleep(1000);
            selecionarSustentabilidade(sustentabilidade);
            Thread.sleep(1000);

            selecionarEstampado(estampado);
            selecionarBordado(bordado);
            selecionarTecidoTinjido(tecidotinjido);
            selecionarTecidoLavavel(tecidolavavel);
            selecionarFioDiferente(fiodiferente);
            //selecionarCadeiaProdutivaInformacao("Jeans");
            Thread.sleep(2000);




        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_composicao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos obrigatórios view infantil, criado a partir de um existente, informando {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} e {string}")
    public void informarCamposObrigatoriosInfantilItemApartirDeExistente(String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String udamarca, String origempais, String udaorigem, String udanatureza) throws Exception {

        try {
            String tipoprocessosustentavel = "NA";
            String tipomatereialsustentavel = "Nao se Aplica";
            String sustentabilidade = "Nao se Aplica";
            //String tipoMaterial = "Jeans";
            Thread.sleep(2000);
            String golaDecote = "Alta";
            //String ncm = "61061000";
            test.createTestStep("Campos obrigatórios para copiar item", "Informar campos obrigatórios de um item");
            Thread.sleep(2000);
            selecionarPaisCopia(origempais);
            //selecionarOrigemExistenteVar(udaorigem);
            Thread.sleep(1000);
            selecionarGolaDecote(golaDecote);

            selecionarTipoProcessoSustentavel(tipoprocessosustentavel);
            Thread.sleep(1000);
            selecionarTipoMaterialSustentavel(tipomatereialsustentavel);
            Thread.sleep(1000);
            selecionarSustentabilidade(sustentabilidade);
            Thread.sleep(1000);
            selecionarEstampado(estampado);
            selecionarBordado(bordado);
            selecionarTecidoTinjido(tecidotinjido);
            selecionarTecidoLavavel(tecidolavavel);
            selecionarFioDiferente(fiodiferente);
            //selecionarCadeiaProdutivaInformacao("Jeans");
            Thread.sleep(2000);
            //selecionarNcmFornecedor(ncm);
            //Thread.sleep(2000);
            //Thread.sleep(2000);


        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_composicao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }

    @E("preencho campos obrigatórios do beleza, criado a partir de um existente, informando {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} e {string}")
    public void informarCamposObrigatoriosDoBelezaItemApartirDeExistente(String estampado, String bordado, String tecidotinjido, String tecidolavavel, String fiodiferente, String udavalidade, String udamarca, String origempais, String udaorigem, String udanatureza) throws Exception {

        try {
            String tipoprocessosustentavel = "NA";
            String tipomatereialsustentavel = "NA";
            String sustentabilidade = "Nao se Aplica";
            String tipoMaterial = "Outros";
            Thread.sleep(2000);
            //String golaDecote = "Alta";
            String ncm = "33041000";
            test.createTestStep("Campos obrigatórios para copiar item", "Informar campos obrigatórios de um item");
            Thread.sleep(4000);
            selecionarPaisCopia(origempais);
            selecionarOrigemExistenteVar(udaorigem);
            Thread.sleep(1000);
            //selecionarMarcaExistenteVar(udamarca);
            //selecionarRFID();
            selecionarTipoMaterialCopy(tipoMaterial);
            Thread.sleep(1000);
            selecionarTipoProcessoSustentavel(tipoprocessosustentavel);
            Thread.sleep(1000);
            selecionarTipoMaterialSustentavel(tipomatereialsustentavel);
            Thread.sleep(1000);
            selecionarSustentabilidade(sustentabilidade);
            Thread.sleep(1000);
            selecionarEstampadoExistente(estampado);
            selecionarBordadoExistente(bordado);
            //selecionarCopiaCampoNatureza(udanatureza);
            selecionarTecidoTinjidoExistente(tecidotinjido);
            selecionarTecidoLavavelExistente(tecidolavavel);
            selecionarFioDiferenteExistente(fiodiferente);
            selecionarUdaValidade(udavalidade);
            Thread.sleep(2000);
            //selecionarCadeiaProdutivaInformacao("Jeans");
            Thread.sleep(2000);
            selecionarNcmFornecedor(ncm);
            Thread.sleep(2000);
            //selecionarGolaDecote(golaDecote);
            //Thread.sleep(2000);

        } catch (Exception ex) {
            utils.TakeScreenShot("Falha_campo_composicao", test);
            test.fail("FALHA: " + ex);
            Assert.fail(ex.getMessage());
        }
    }


    @E("preencho o campo Tipo de Processo sustentável{string}")
    public void preenchoOCampoTipoprocessosustentavel(String tipoprocessosustentavel) throws Exception{
        selecionarTipoProcessoSustentavel(tipoprocessosustentavel);

    }


}
