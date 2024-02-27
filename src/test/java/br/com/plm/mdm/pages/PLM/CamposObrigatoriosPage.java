package br.com.plm.mdm.pages.PLM;


import helpers.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CamposObrigatoriosPage {

    private WebDriver driver;
    private Waits waits;


    public WebElement tituloAncora(){
        return waits.visibilityOfElement(By.xpath("//*[@class='csiHeadingCellLabel' and contains(text(), 'Integration Status')]"));
    }

    public String tituloAncora = "//*[@class='csiHeadingCellLabel' and contains(text(), 'Integration Status')]";
    public String InputValor = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]";

    public String inputCampoTipoDeProdutoComercial = "//div[@class='MuiFormControl-root MuiFormControl-fullWidth MuiTextField-root InlineTextFieldtextFieldClass css-1dsd6ko']//input[@id='csi-automation-inline-singleselect']";

    public String inputTipoDeProdutoComercialOption0 = "//li[@id='csi-automation-inline-singleselect-option-0']";
    public String inputUdaSustentavel = "//body/div/div/div[1]/div/div/div/div[3]/input[1][@class='dijitReset dijitInputInner']";
    public String inputUdaTipoMaterial = "//body/div/div/div[1]/div/div/div/div[3]/input[1][@class='dijitReset dijitInputInner']";

    public String inputUdaPais = "//body/div/div/div[1]/div/div/div/div[3]/input[1][@class='dijitReset dijitInputInner']";

    public String inputUDAPais = "//div[@class='MuiFormControl-root MuiFormControl-fullWidth MuiTextField-root InlineTextFieldtextFieldClass css-1dsd6ko']//input[@id='csi-automation-inline-singleselect']";

    public String inputUDAPaisOption0 = "//li[@id='csi-automation-inline-singleselect-option-0']";
    public String inputRFDI = "//div[@data-csi-automation='edit-Style-Properties-RNR_UDA_Styleatt_Etiquetarfid_enum:Child:Attributes']/div/input[@role='textbox']";
    public String inputSizeRange = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]";
    public String paisOrigemText = "//*[@class='csiHeadingCellLabel' and text()='Country Origin']";
    public String paisOrigem = "//*[@data-csi-act='RNR_INT_Styleatt_countryorigin1_ref:Child:Attributes:0']";
    public String tipoProdutoComercialText = "//*[@class='csiHeadingCellLabel' and text()='Tipo de Produto Comercial']";
    public String campotipoProdutoComercial = "//*[@data-csi-act='RNR_UPL_Styleatt_Tipodeprodutocomercial_enum:Child:Attributes:0']";
    public String tipoProdutoFiscalText = "//*[@class='csiHeadingCellLabel' and text()='Tipo de Produto Fiscal']" ;
    public String campotipoProdutoFiscal = "//*[@data-csi-act='RNR_UPL_Styleatt_Tipodeprodutofiscal_enum:Child:Attributes:0']";
    public String materialProdutoText = "//*[@class='csiHeadingCellLabel' and text()='Material do Produto']";
    public String campomaterialProduto = "//*[@data-csi-act='RNR_UPL_Styleatt_Materialdoproduto_enum:Child:Attributes:0']";
    public String estampaProdutoText = "//*[@class='csiHeadingCellLabel' and text()='Estampa do Produto']";
    public String campoestampaProduto = "//*[@data-csi-act='RNR_UPL_Styleatt_Estampadoproduto_enum:Child:Attributes:0']" ;

    public String inputCamposDoStyleProperties = "//div[@class='MuiFormControl-root MuiFormControl-fullWidth MuiTextField-root InlineTextFieldtextFieldClass css-1dsd6ko']//input[@id='csi-automation-inline-singleselect']";

    public String optionSelecionavelCamposdoStyle = "//li[@id='csi-automation-inline-singleselect-option-0']";

    public String campoMaterial1ValorBamboo = "//li[@id='csi-automation-inline-singleselect-option-1']";

    public String campoMarcaText = "//div[normalize-space()='UDA - Marca']";

    public String campoMarcaStyle = "//td[@data-csi-act='RNR_UDA_Styleatt_Marca_enum:Child:Attributes:0']";


    public String campoLocal1ValorNA = "//li[@id='csi-automation-inline-singleselect-option-1']";
    public String detalheProdutoText = "//*[@class='csiHeadingCellLabel' and text()='Detalhes do Produto']";
    public String campodetalheProduto = "//*[@data-csi-act='RNR_UPL_Styleatt_Detalhesdoproduto_string:Child:Attributes:0']";
    public String detalheProdutoInput= "//div[@class='dijitPopup dijitTooltipDialogPopup']//textarea[@data-csi-automation='edit-Style-Properties-RNR_UPL_Styleatt_Detalhesdoproduto_string:Child:Attributes']";
    //public String detalheProdutoInput= "";
    public String ncmFornecedorText = "//*[@class='csiHeadingCellLabel' and text()='NCM do Fornecedor']";
    public String camponcmFornecedor = "//*[@data-csi-act='RNR_UPL_Styleatt_Ncmdofornecedor_String:Child:Attributes:0']";
    public String ncmFornecedorInput= "//textarea[@data-dojo-attach-point='focusNode,containerNode,textbox']";
    public String golaDecoteText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Gola Decote']";
    public String campoGoladecote = "//*[@data-csi-act='RNR_UDA_Styleatt_Goladecote_enum:Child:Attributes:0']";
    public String golaDecoteInput = "//div[@data-csi-automation='edit-Style-Properties-RNR_UDA_Styleatt_Goladecote_enum:Child:Attributes']/div/input[@role='textbox']";
    public String unitCostText = "//*[@class='csiHeadingCellLabel' and text()='Unit Cost']";
    public String campounitCost = "//*[@data-csi-act='RNR_INT_Styleatt_unitcost_string:Child:Attributes:0']";
    public String unitCostInput= "//input[@value='0.0000']";
    public String precoVendaText = "//*[@class='csiHeadingCellLabel' and text()='Preço de Venda']";
    public String campoprecoVenda = "//*[@data-csi-act='RNR_UPL_Styleatt_Precodevenda_enum:Child:Attributes:0']";
    public String precoVendaUYText = "//*[@class='csiHeadingCellLabel' and text()='Preço de Venda UY']";
    public String campoprecoVendaUY = "//*[@data-csi-act='RNR_UPL_Styleatt_Precodevendauy_enum:Child:Attributes:0']" ;
    public String precoVendaARTexto = "//*[@class='csiHeadingCellLabel' and text()='Preço de Venda ARG']";
    public String precoVendaAR ="//*[@data-csi-act='RNR_UPL_Styleatt_PrecodevendaArg_enum:Child:Attributes:0']" ;
    public String faixaPrecoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Faixa de Preço']";
    public String campofaixaPreco = "//*[@data-csi-act='RNR_UDA_Styleatt_Faixadepreco_enum:Child:Attributes:0']";
    public String origemMercFiscalText = "//*[@class='csiHeadingCellLabel' and text()='Origem da Mercadoria Fiscal']";
    public String campoorigemMercFiscal = "//*[@data-csi-act='RNR_UPL_Styleatt_Origemdamercadoriafiscal_Enum:Child:Attributes:0']";
    public String categoriaGenText = "//*[@class='csiHeadingCellLabel' and text()='Categoria Genérica']";
    public String campocategoriaGen = "//*[@data-csi-act='RNR_UPL_Styleatt_Categoriagenerica_enum:Child:Attributes:0']";
    public String packingMethText = "//*[@class='csiHeadingCellLabel' and text()='Packing Method']";
    public String campopackingMeth = "//*[@data-csi-act='RNR_UPL_Styleatt_Packingmethod_enum:Child:Attributes:0']";
    public String grupoInsumoText = "//*[@class='csiHeadingCellLabel' and text()='Grupo de Insumos']";
    public String campogrupoInsumo = "//*[@data-csi-act='RNR_CFA_12_Styleatt_Grupodeinsumos_enum:Child:Attributes:0']";
    public String piramideMercText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Pirâmide Mercadológica']";
    public String campopiramideMerc = "//*[@data-csi-act='RNR_UDA_Styleatt_Piramidemercadologica_enum:Child:Attributes:0']";
    public String itemFundText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Itens Fundamentais']";
    public String campoitemFund = "//*[@data-csi-act='RNR_UDA_Styleatt_Itensfundamentais_enum:Child:Attributes:0']";
    public String cadeiaProdText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Cadeia Produtiva Informação']";
    public String campocadeiaProd = "//*[@data-csi-act='RNR_UDA_Styleatt_Cadeiaprodutivainformacao_enum:Child:Attributes:0']";

    public String btnrefreshStyleProperties = "//span[@data-csi-automation='plugin-Style-Properties-refresh']//span[@class='dijitReset dijitInline dijitIcon csiActionIcon material-icons csi-toolbar-btn-icon-refresh']";

    public String fitBottomText = "//div[normalize-space()='UDA - Fit Bottom']";

    public String campofitBottom = "//td[@data-csi-heading='RNR_UDA_Styleatt_Fitbottom_enum:Child:Attributes:0']";
    public String localizacaoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Localização']";
    public String campolocalizacao = "//*[@data-csi-act='RNR_UDA_Styleatt_Localizacao_enum:Child:Attributes:0']";
    public String validadeText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Validade']";
    public String campoValidade = "//*[@data-csi-act='RNR_UDA_StyleAttributes_Validade_enum:Child:Attributes:0']";
    public String produtosText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Produtos']";
    public String campoProdutos = "//*[@data-csi-heading='RNR_UDA_Styleatt_Produtos_enum:Child:Attributes:0']";
    public String valorConversaoILRText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Valor Conversão ILR']";
    public String campovalorConversaoILR = "//*[@data-csi-heading='RNR_UDA_Styleatt_ValorconversaoILR_enum:Child:Attributes:0']";
    public String localizacaoLatamText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Localização Latam']";
    public String campolocalizacaoLatam = "//*[@data-csi-act='RNR_UDA_Styleatt_Localizacaolatam_enum:Child:Attributes:0']";
    public String temaText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tema']";
    public String campotema = "//*[@data-csi-act='RNR_UDA_Styleatt_Tema_enum:Child:Attributes:0']";
    public String calendarioText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Calendário']";
    public String campocalendario = "//*[@data-csi-act='RNR_UDA_Styleatt_Calendario_enum:Child:Attributes:0']";
    public String origemText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Origem']";
    public String campoorigem = "//*[@data-csi-act='RNR_UDA_Styleatt_Origem_enum:Child:Attributes:0']";
    public String sexoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Sexo']";
    public String camposexo = "//*[@data-csi-act='RNR_UDA_Styleatt_Sexo_enum:Child:Attributes:0']";
    public String inputCampoOrigem = "//body/div/div/div[1]/div/div/div/div[3]/input[1][@class='dijitReset dijitInputInner']";
    public String naturezaText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Natureza']";
    public String rfidText = "//*[contains(text(),'UDA - Etiqueta RFID')]";
    public String udaRFDIList = "//div[@item='0' and @role='option']//span";
    public String inputCampoNatureza = "//body/div/div/div[1]/div/div/div/div[3]/input[1][@class='dijitReset dijitInputInner']";
    public String camponatureza = "//*[@data-csi-act='RNR_UDA_Styleatt_Natureza_enum:Child:Attributes:0']";
    public String campoRFID = "//*[@data-csi-act='RNR_UDA_Styleatt_Etiquetarfid_enum:Child:Attributes:0']";
    public String tipoMaterialText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tipo de Material']";
    public String campotipoMaterial = "//*[@data-csi-act='RNR_UDA_Styleatt_Tipodematerial_enum:Child:Attributes:0']";
    public String padronagemText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Padronagem']";
    public String campopadronagem =  "//*[@data-csi-act='RNR_UDA_Styleatt_Padronagem_enum:Child:Attributes:0']";
    public String fastText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Fast']";
    public String campoFast =  "//*[@data-csi-act='RNR_UDA_Styleatt_Fast_enum:Child:Attributes:0']";
    public String rrText = "//*[@class='csiHeadingCellLabel' and text()='UDA - RR']";
    public String camporr = "//*[@data-csi-act='RNR_UDA_Styleatt_RR_enum:Child:Attributes:0']";
    public String sustentabilidadeText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Sustentabilidade 501']";
    public String camposustentabilidade = "//*[@data-csi-act='RNR_UDA_Styleatt_Sustentabilidade501_enum:Child:Attributes:0']";
   public String tipoMaterialSustentavelText = "//*[@class='csiHeadingCellLabel' and text()='UDA Tipo de Característica de Material Sustentável']";
    public String campotipoMaterialSustentavel = "//*[@data-csi-act='RNR_UDA_Styleatt_Tipodematerialsustentavel_enum:Child:Attributes:0']";
    public String tipoProcessoSustentavelText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tipo de Processo Sustentável']";
    public String campotipoProcessoSustentavel = "//*[@data-csi-act='RNR_UDA_Styleatt_Tipodeprocessosustentavel_enum:Child:Attributes:0']";
    public String mensagemEtiquetaText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Mensagem da Etiqueta']";
    public String campomensagemEtiqueta = "//*[@data-csi-act='RNR_UDAFF_3_Styleatt_Mensagemdaetiqueta1_string:Child:Attributes:0']";
    public String EtiquetaCombo = "//textarea[@data-dojo-attach-point='focusNode,containerNode,textbox']";
    public String etiquetaLatamText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Etiqueta Latam']";
    public String campomensagemEtiquetaLatam = "//*[@data-csi-act='RNR_UDAFF_602_Styleatt_Etiquetalatam_string:Child:Attributes:0']";
    public String etiquetaLatamCombo = "//textarea[@data-dojo-attach-point='focusNode,containerNode,textbox']";
    public String estampadoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Estampado']";
    public String campoestampado = "//*[@data-csi-act='RNR_UDA_Styleatt_Estampado_enum:Child:Attributes:0']";
    public String possuiBordadoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Possui Bordado']";
    public String campopossuiBordado = "//*[@data-csi-act='RNR_UDA_Styleatt_PossuiBordado_enum:Child:Attributes:0']";
    public String tecidoTinjidoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tecido Tingido']";
    public String campotecidoTinjido = "//*[@data-csi-act='RNR_UDA_Styleatt_TecidoTinjido_enum:Child:Attributes:0']";
    public String tecidoLavavelText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tecido com Lavagem Jeans Tiedi e Branqueado']";
    public String campotecidoLavavel = "//*[@data-csi-act='RNR_UDA_Styleatt_Tecidocomlavagemjeanstiediebranqueado_enum:Child:Attributes:0']";
    public String fioDiferenteText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Fio com Diferentes Cores']";
    public String campofioDiferente = "//*[@data-csi-act='RNR_UDA_Styleatt_Fiocomdiferentescores_enum:Child:Attributes:0']";

    public String cadeiaProdutivaInformacaoText = "//*[contains(text(),'UDA - Cadeia Produtiva Informação')]";

    public String campocadeiaProdutivaInformacao = "//*[@data-csi-act='RNR_UDA_Styleatt_Cadeiaprodutivainformacao_enum:Child:Attributes:0']";

    public String inputCampocadeiaProdutivaInformacao2 = "//div[@data-csi-automation='edit-Style-Properties-RNR_UDA_Styleatt_Cadeiaprodutivainformacao_enum:Child:Attributes']/div/input[@role='textbox']";
    public String inputCampocadeiaProdutivaInformacao = "//div[@class='MuiFormControl-root MuiFormControl-fullWidth MuiTextField-root InlineTextFieldtextFieldClass css-1dsd6ko']//input[@id='csi-automation-inline-singleselect']";

    public String InputCadeiaProdutivaInformacaoOption0 = "//li[@id='csi-automation-inline-singleselect-option-0']";


    public String udaValidadeText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Validade']";
    public String campoUdaValidade = "//*[@data-csi-act='RNR_UDA_StyleAttributes_Validade_enum:Child:Attributes:0']";
    public String inputcampoUdaValidade = "//div[@data-csi-automation='edit-Style-Properties-RNR_UDA_StyleAttributes_Validade_enum:Child:Attributes']//input[@role='textbox']";

    public String forroText = "//*[@class='csiHeadingCellLabel' and text()='Forro']";
    public String campoforro = "//*[@data-csi-act='RNR_UPL_Styleatt_Forro_enum:Child:Attributes:0']";
    public String sazonalidadeText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Sazonalidade']";
    public String camposazonalidade = "//*[@data-csi-act='RNR_UDA_Styleatt_Sazonalidade_enum:Child:Attributes:0']";
    public String sizeRangeText = "//*[@class='csiHeadingCellLabel' and text()='Size Range']";
    public String camposizeRange = "//*[@data-csi-act='ActualSizeRange:Child:Attributes:0']";
    public String tonsMaquiagemText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tons de Maquiagem']";
    public String campotonsMaquiagem = "//*[@data-csi-act='RNR_UDA_Styleatt_TonsdeMaquiagem_enum:Child:Attributes:0']";
    public String tipoDeTecidoText = "//*[@class='csiHeadingCellLabel' and text()='Tipo de Tecido']";
    public String tipoDeTecido = "//*[@data-csi-act='RNR_UPL_Styleatt_tipodetecido_enum:Child:Attributes:0']";

    public String comentarioDoItemText = "//div[normalize-space()='Comentário do Item']";

    public String comentarioDoItem = "//td[@data-csi-act='RNR_UPL_Styleatt_Comentariodoitem_string:Child:Attributes:0']";

    public String comentarioDoItemInput = "//div[@class='dijitTooltipContents dijitTooltipFocusNode']//textarea[@data-csi-automation='edit-Style-Properties-RNR_UPL_Styleatt_Comentariodoitem_string:Child:Attributes']";
    public String porcentagemMaterial1Text = "//*[contains(text(),'Material 1')]";
    public String campoPorcentagemMaterial1 = "//*[@data-csi-act='RNR_StyleAtt_Perc1_double:Child:Attributes:0']";
    public String inputPorcentagemMaterial1 = "//div[@data-csi-automation='edit-Style-Properties-RNR_StyleAtt_Perc1_double:Child:Attributes']/div[2]/div[1]/input";
    public String porcentagemMaterial2Text = "//*[contains(text(),'Porcentagem do Material 2')]";
    public String campoPorcentagemMaterial2 = "//*[@data-csi-act='RNR_StyleAtt_Perc2_double:Child:Attributes:0']";
    public String inputPorcentagemMaterial2 = "//div[@data-csi-automation='edit-Style-Properties-RNR_StyleAtt_Perc2_double:Child:Attributes']/div[2]/div[1]/input";
    public String campoMaterial2Text = "//*[contains(text(),'Material 2')]";
    public String campoMaterial2 = "//*[@data-csi-act='RNR_StyleAtt_Compo2_ref:Child:Attributes:0']";
    public String inputCampoMaterial2 = "//div[@data-csi-automation='edit-Style-Properties-RNR_StyleAtt_Compo2_ref:Child:Attributes']/div[3]/input[@role='textbox']";
    public String porccentagemMaterial3Text = "//*[contains(text(),'Porcentagem do Material 3')]";
    public String campoMaterial3 = "//*[@data-csi-act='RNR_StyleAtt_Compo3_ref:Child:Attributes:0']";
    public String inputPorcentagemMaterial3 = "//div[@data-csi-automation='edit-Style-Properties-RNR_StyleAtt_Perc3_double:Child:Attributes']/div[2]/div[1]/input";
    public String campoMaterial3Text = "//*[contains(text(),'Material 3')]";
    public String campoPorcentagemMaterial3 = "//*[@data-csi-act='RNR_StyleAtt_Perc3_double:Child:Attributes:0']";
    public String inputCampoMaterial3 = "//div[@data-csi-automation='edit-Style-Properties-RNR_StyleAtt_Compo3_ref:Child:Attributes']/div[3]/input[@role='textbox']";
    public String porcentagemMaterial4Text = "//*[contains(text(),'Porcentagem do Material 4')]";
    public String campoPorcentagemMaterial4 = "//*[@data-csi-act='RNR_StyleAtt_Perc4_double:Child:Attributes:0']";
    public String inputPorcentagemMaterial4 = "//div[@data-csi-automation='edit-Style-Properties-RNR_StyleAtt_Perc4_double:Child:Attributes']/div[2]/div[1]/input";
    public String campoMaterial4Text = "//*[contains(text(),'Material 4')]";
    public String campoMaterial4 = "//*[@data-csi-act='RNR_StyleAtt_Compo4_ref:Child:Attributes:0']";
    public String inputCampoMaterial4 = "//div[@data-csi-automation='edit-Style-Properties-RNR_StyleAtt_Compo4_ref:Child:Attributes']/div[3]/input[@role='textbox']";
    public String porcentagemMaterial5Text = "//*[contains(text(),'Porcentagem do Material 5')]";
    public String campoPorcentagemMaterial5 = "//*[@data-csi-act='RNR_StyleAtt_Perc5_double:Child:Attributes:0']";
    public String inputPorcentagemMaterial5 = "//div[@data-csi-automation='edit-Style-Properties-RNR_StyleAtt_Perc5_double:Child:Attributes']/div[2]/div[1]/input";

    public String campoMaterial5Text = "//*[contains(text(),'Material 5')]";
    public String campoMaterial5 = "//*[@data-csi-act='RNR_StyleAtt_Compo5_ref:Child:Attributes:0']";
    public String inputCampoMaterial5 = "//div[@role='presentation']//div//div//div//input[@role='textbox']";

    public String porcentagemMaterial6Text = "//*[contains(text(),'Porcentagem  do Material 6')]";
    public String campoPorcentagemMaterial6 = "//*[@data-csi-act='RNR_StyleAtt_Perc100_double:Child:Attributes:0']";
    public String inputPorcentagemMaterial6 = "//div[@data-csi-automation='edit-Style-Properties-RNR_StyleAtt_Perc100_double:Child:Attributes']/div[2]/div[1]/input";

    public String campoMaterial6Text = "//tr[@class='csiHeadingCell csiHeadingCellEditable odd']//th//div[contains(text(),'Material 6') ]";
    public String campoMaterial6 = "//*[@data-csi-act='RNR_StyleAtt_Compo100_ref:Child:Attributes:0']";
    public String inputCampoMaterial6 = "//div[@data-csi-automation='edit-Style-Properties-RNR_StyleAtt_Compo100_ref:Child:Attributes']/div[3]/input[@role='textbox']";

    public String udaMarcaText = "//*[contains(text(),'UDA - Marca')]";

    public String udaMarcaList = "//div[@item='0' and @role='option']//span";
    public String campoudaMarca = "//*[@data-csi-act='RNR_UDA_Styleatt_Marca_enum:Child:Attributes:0']";
    public String inputCampoMarca = "//div[@data-csi-automation='edit-Style-Properties-RNR_UDA_Styleatt_Marca_enum:Child:Attributes']//div[3]//input[1]";
    public String inputCampoMarcaBeleza = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]";

    private String campoObrigatorio = "//*[@class='csiHeadingCellLabel' and contains(text(), 'CAMPO_OBRIGATORIO')]";
     public String inputComposicao = "//div[@class='dijitTooltipContainer']/div/div[@data-dojo-attach-point='containerNode']/div/div[@class='dijitReset dijitInputField dijitInputContainer']//input[@role='textbox']";
    public String inputComposicao2 = "//div[@class='dijitTooltipContainer']/div/div[@data-dojo-attach-point='containerNode']/div/div[@class='dijitReset dijitInputField dijitInputContainer']//input[@role='textbox']";
    public String inputComposicao3 = "//div[@class='dijitTooltipContainer']/div/div[@data-dojo-attach-point='containerNode']/div/div[@class='dijitReset dijitInputField dijitInputContainer']//input[@role='textbox']";
    public String inputComposicao4 = "//div[@class='dijitTooltipContainer']/div/div[@data-dojo-attach-point='containerNode']/div/div[@class='dijitReset dijitInputField dijitInputContainer']//input[@role='textbox']";

    public String inputComposicaoLocal = "//input[@title='undefined']";
    public String local1Text = "//*[contains(text(),'Local 1')]";
    public String campolocal1 = "//*[@data-csi-act='RNR_StyleAtt_Local1_enum:Child:Attributes:0']";

    public String inputComposicaoLocal2 = "//input[@title='undefined']";
    public String local2Text = "//*[contains(text(),'Local 2')]";
    public String campolocal2 = "//*[@data-csi-act='RNR_StyleAtt_Local2_enum:Child:Attributes:0']";

    public String inputComposicaoLocal3 = "//input[@title='undefined']";
    public String local3Text = "//*[contains(text(),'Local 3')]";
    public String campolocal3 = "//*[@data-csi-act='RNR_StyleAtt_Local3_enum:Child:Attributes:0']";

    public String inputComposicaoLocal4 = "//input[@title='undefined']";
    public String local4Text = "//*[contains(text(),'Local 4')]";
    public String campolocal4 = "//*[@data-csi-act='RNR_StyleAtt_Local4_enum:Child:Attributes:0']";

    public String campo1Text = "(//div[contains(text(),'Material 1')])[1]";
    public String campocampo1 = "//*[@data-csi-act='RNR_StyleAtt_Compo1_ref:Child:Attributes:0']";

    public String campo2Text = "(//div[contains(text(),'Material 7')])[1]";
    public String campocampo2 = "//*[@data-csi-act='RNR_StyleAtt_Compo6_ref:Child:Attributes:0']";

    public String campo3Text = "(//div[contains(text(),'Material 13')])[1]";
    public String campocampo3 = "//*[@data-csi-act='RNR_StyleAtt_Compo11_ref:Child:Attributes:0']";

    public String campo4Text = "(//div[contains(text(),'Material 19')])[1]";
    public String campocampo4 = "//*[@data-csi-heading='RNR_StyleAtt_Compo16_ref:Child:Attributes:0']";

    public String ancoraComposicao = "//*[@class='csi-view-title' and contains(text(), 'Composition 1')]";
    public String inputCampoObrigatorio = "//body/div/div/div[1]/div/div/div/div[3]/input[1][@class='dijitReset dijitInputInner']";

    // Inner
    public String udaInnerText = "//*[contains(text(),'Inner')]";
    public String campoudaInner = "//*[@data-csi-act='RNR_UPL_Styleatt_Tamanhoinner_string:Child:Attributes:0']";
    public String inputCampoInner = "//textarea[@data-dojo-attach-point='focusNode,containerNode,textbox']";

    // Case
    public String  udaCaseText = "//*[contains(text(),'Case')]";
    public String  campoudaCase = "//*[@data-csi-act='RNR_UPL_Styleatt_Tamanhocase_string:Child:Attributes:0']";
    public String  inputCampoCase = "//textarea[@data-dojo-attach-point='focusNode,containerNode,textbox']";

   // Facção
   public String faccaoText = "//*[@class='csiHeadingCellLabel' and text()='Facção']";
   public String campofaccao = "//*[@data-csi-act='RNR_CFA_23_Styleatt_Faccao_string:Child:Attributes:0']";
   public String Inputfaccao = "//textarea[@data-dojo-attach-point='focusNode,containerNode,textbox']";

}
