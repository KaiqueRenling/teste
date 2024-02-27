package br.com.plm.mdm.pages.PLM;
public class ItemPage {

    public String welcome = "//*[@class='csi-homepage-welcome']";
    public String abaEstilo = "//*[@id='dijit_layout_TabContainer_0_tablist_dijit_layout_ContentPane_2']";

    public String sessao ="//*[@class='browse' and contains(text(), 'sessao')]";
    public String getSessao(String sel_sessao) {    return sessao.replace("sessao", sel_sessao);
    }
    public String divisao ="//*[@class='browse' and text()='divisao']";
    public String getDivisao(String sel_divisao){   return divisao.replace("divisao", sel_divisao);
    }
    public String grupo ="//*[@class='browse' and text()='grupo']";
    public String getGrupo(String sel_grupo){       return grupo.replace("grupo", sel_grupo);
    }
    public String subclasse ="//*[@class='browse' and text()='subclasse']";
    public String getSubclasse(String sel_subclasse){       return subclasse.replace("subclasse", sel_subclasse);
    }

    //Criar novo estilo
    public  String botaoAcao = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'Actions...')]";
    public  String botaoNovoEstilo = "//*[@class='dijitReset dijitMenuItemLabel' and contains(text(), 'New Style...')]";
    public  String tipoReferencia = "//*[@id='uniqName_25_0']";

    // Viewer Casatro de item
    public String viewerCadastroItem="//input[@aria-autocomplete='both']";

    // Templates
    public String templates = "(//input[@role='textbox'])[8]";

    // Brand
    public String brand = "(//input[@role='textbox'])[14]";

    //New PLM campo marca
    public  String campomarca =  "(//input[@role='textbox'])[13]";
    public  String botaoSalvar = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save & Go']";

    //Informações do item - Propriedades
    public String faixatamanho ="//*[@class='csiHeadingCellLabel' and text()='Faixa de tamanho']";
    public String tamanho ="//*[@browse' and text()='PP-GG (BASE M)']";
    public String gettamanho(String sel_tamanho){       return tamanho.replace("tamanho", sel_tamanho);
    }

    // Campos obrigatórios
    public String tituloAncora = "//*[@class='csiHeadingCellLabel' and contains(text(), 'Integration Status')]";
    public String InputValor = "//div/div[1]/div/div/div/div[3]/input[1]";

    public String paisOrigemText = "//*[@class='csiHeadingCellLabel' and text()='Country Origin']";
    public String paisOrigem = "//*[@data-csi-act='RNR_INT_Styleatt_countryorigin1_ref:Child:Attributes:0']";

    public String tipoProdutoComercialText = "//*[@class='csiHeadingCellLabel' and text()='Tipo de Produto Comercial']";
    public String tipoProdutoComercial = "//*[@data-csi-act='RNR_UPL_Styleatt_Tipodeprodutocomercial_enum:Child:Attributes:0']";

    public String tipoProdutoFiscalText = "//*[@class='csiHeadingCellLabel' and text()='Tipo de Produto Fiscal']" ;
    public String tipoProdutoFiscal = "//*[@data-csi-act='RNR_UPL_Styleatt_Tipodeprodutofiscal_enum:Child:Attributes:0']";

    public String materialProdutoText = "//*[@class='csiHeadingCellLabel' and text()='Material Do Produto']";
    public String materialProduto = "//*[@data-csi-act='RNR_UPL_Styleatt_Materialdoproduto_enum:Child:Attributes:0']";

    public String estampaProdutoText = "//*[@class='csiHeadingCellLabel' and text()='Estampa Do Produto']";
    public String estampaProduto = "//*[@data-csi-act='RNR_UPL_Styleatt_Estampadoproduto_enum:Child:Attributes:0']" ;

    public String detalheProdutoText = "//*[@class='csiHeadingCellLabel' and text()='Detalhes do Produto']";
    public String detalheProduto = "//*[@data-csi-act='RNR_UPL_Styleatt_Detalhesdoproduto_string:Child:Attributes:0']";
    public String detalheProdutoInput= "//*[@data-csi-automation='edit-Style-Properties-RNR_UPL_Styleatt_Detalhesdoproduto_string:Child:Attributes']";

    public String ncmFornecedorText = "//*[@class='csiHeadingCellLabel' and text()='NCM do Fornecedor']";
    public String ncmFornecedor = "//*[@data-csi-act='RNR_UPL_Styleatt_Ncmdofornecedor_String:Child:Attributes:0']";
    public String ncmFornecedorInput= "//*[@id='dijit_form_Textarea_1']";

    public String unitCostText = "//*[@class='csiHeadingCellLabel' and text()='Unit Cost']";
    public String unitCost = "//*[@data-csi-act='RNR_INT_Styleatt_unitcost_string:Child:Attributes:0']";
    public String unitCostInput= "/html/body/div[8]/div/div[1]/div/div/div/div[2]/input";

    public String precoVendaText = "//*[@class='csiHeadingCellLabel' and text()='Preço de Venda']";
    public String precoVenda = "//*[@data-csi-act='RNR_UPL_Styleatt_Precodevenda_enum:Child:Attributes:0']";

    public String precoVendaUYText = "//*[@class='csiHeadingCellLabel' and text()='Preço de Venda UY']";
    public String precoVendaUY = "//*[@data-csi-act='RNR_UPL_Styleatt_Precodevendauy_enum:Child:Attributes:0']" ;

    public String precoVendaARTexto = "//*[@class='csiHeadingCellLabel' and text()='Preço de Venda ARG']";
    public String precoVendaAR ="//*[@data-csi-act='RNR_UPL_Styleatt_PrecodevendaArg_enum:Child:Attributes:0']" ;

    public String faixaPrecoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Faixa de Preço']";
    public String faixaPreco = "//*[@data-csi-act='RNR_UDA_Styleatt_Faixadepreco_enum:Child:Attributes:0']";

    public String origemMercFiscalText = "//*[@class='csiHeadingCellLabel' and text()='Origem da Mercadoria Fiscal']";
    public String origemMercFiscal = "//*[@data-csi-act='RNR_UPL_Styleatt_Origemdamercadoriafiscal_Enum:Child:Attributes:0']";

    public String categoriaGenText = "//*[@class='csiHeadingCellLabel' and text()='Categoria Generica']";
    public String categoriaGen = "//*[@data-csi-act='RNR_UPL_Styleatt_Categoriagenerica_enum:Child:Attributes:0']";

    public String packingMethText = "//*[@class='csiHeadingCellLabel' and text()='Packing Method']";
    public String packingMeth = "//*[@data-csi-act='RNR_UPL_Styleatt_Packingmethod_enum:Child:Attributes:0']";

    public String grupoInsumoText = "//*[@class='csiHeadingCellLabel' and text()='Grupo de Insumos']";
    public String grupoInsumo = "//*[@data-csi-act='RNR_CFA_12_Styleatt_Grupodeinsumos_enum:Child:Attributes:0']";

    public String piramideMercText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Pirâmide Mercadológica']";
    public String piramideMerc = "//*[@data-csi-act='RNR_UDA_Styleatt_Piramidemercadologica_enum:Child:Attributes:0']";

    public String itemEspanholText = "//*[@class='csiHeadingCellLabel' and text()='Composição do Item em Espanhol']";
    public String itemEspanhol = "//*[@data-csi-act='RNR_CFA_27_Styleatt_Composicaodoitemespanhol_string:Child:Attributes:0']";

    public String itemFundText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Itens Fundamentais']";
    public String itemFund = "//*[@data-csi-act='RNR_UDA_Styleatt_Itensfundamentais_enum:Child:Attributes:0']";

    public String cadeiaProdText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Cadeia Produtiva Informação']";
    public String cadeiaProd = "//*[@data-csi-act='RNR_UDA_Styleatt_Cadeiaprodutivainformacao_enum:Child:Attributes:0']";

    public String localizacaoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Localização']";
    public String localizacao = "//*[@data-csi-act='RNR_UDA_Styleatt_Localizacao_enum:Child:Attributes:0']";

    public String localizacaoLatamText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Localização Latam']";
    public String localizacaoLatam = "//*[@data-csi-act='RNR_UDA_Styleatt_Localizacaolatam_enum:Child:Attributes:0']";

    public String temaText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tema']";
    public String tema = "//*[@data-csi-act='RNR_UDA_Styleatt_Tema_enum:Child:Attributes:0']";

    public String calendarioText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Calendário']";
    public String calendario = "//*[@data-csi-act='RNR_UDA_Styleatt_Calendario_enum:Child:Attributes:0']";

    public String origemText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Origem']";
    public String origem = "//*[@data-csi-act='RNR_UDA_Styleatt_Origem_enum:Child:Attributes:0']";

    public String naturezaText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Natureza']";
    public String natureza = "//*[@data-csi-act='RNR_UDA_Styleatt_Natureza_enum:Child:Attributes:0']";

    public String tipoMaterialText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tipo de Material']";
    public String tipoMaterial = "//*[@data-csi-act='RNR_UDA_Styleatt_Tipodematerial_enum:Child:Attributes:0']";

    public String padronagemText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Padronagem']";
    public String padronagem =  "//*[@data-csi-act='RNR_UDA_Styleatt_Padronagem_enum:Child:Attributes:0']";

    public String rrText = "//*[@class='csiHeadingCellLabel' and text()='UDA - RR']";
    public String rr = "//*[@data-csi-act='RNR_UDA_Styleatt_RR_enum:Child:Attributes:0']";

    public String sustentabilidadeText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Sustentabilidade 501']";
    public String sustentabilidade = "//*[@data-csi-act='RNR_UDA_Styleatt_Sustentabilidade501_enum:Child:Attributes:0']";
    public String sustentabilidadeCombo = "/html/body/div[8]/div/div[1]/div/div/div/div[3]/input[1]";

    public String tipoMaterialSustentavelText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tipo de Material Sustentável']";
    public String tipoMaterialSustentavel = "//*[@data-csi-act='RNR_UDA_Styleatt_Tipodematerialsustentavel_enum:Child:Attributes:0']";

    public String tipoProcessoSustentavelText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tipo de Processo Sustentável']";
    public String tipoProcessoSustentavel = "//*[@data-csi-act='RNR_UDA_Styleatt_Tipodeprocessosustentavel_enum:Child:Attributes:0']";

    public String mensagemEtiquetaText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Mensagem da Etiqueta']";
    public String mensagemEtiqueta = "//*[@data-csi-act='RNR_UDAFF_3_Styleatt_Mensagemdaetiqueta1_string:Child:Attributes:0']";
    public String EtiquetaCombo = "//*[@id='dijit_form_Textarea_2']";

    public String etiquetaLatamText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Etiqueta Latam']";
    public String mensagemEtiquetaLatam = "//*[@data-csi-act='RNR_UDAFF_602_Styleatt_Etiquetalatam_string:Child:Attributes:0']";
    public String etiquetaLatamCombo = "//*[@id='dijit_form_Textarea_3']";

    public String estampadoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Estampado']";
    public String estampado = "//*[@data-csi-act='RNR_UDA_Styleatt_Estampado_enum:Child:Attributes:0']";

    public String possuiBordadoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Possui Bordado']";
    public String possuiBordado = "//*[@data-csi-act='RNR_UDA_Styleatt_PossuiBordado_enum:Child:Attributes:0']";

    public String tecidoTinjidoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tecido Tinjido']";
    public String tecidoTinjido = "//*[@data-csi-act='RNR_UDA_Styleatt_TecidoTinjido_enum:Child:Attributes:0']";

    public String tecidoLavavelText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tecido com lavagem jeans tiedi e branqueado']";
    public String tecidoLavavel = "//*[@data-csi-act='RNR_UDA_Styleatt_Tecidocomlavagemjeanstiediebranqueado_enum:Child:Attributes:0']";

    public String fioDiferenteText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Fio com diferentes cores']";
    public String fioDiferente = "//*[@data-csi-act='RNR_UDA_Styleatt_Fiocomdiferentescores_enum:Child:Attributes:0']";

    public String forroText = "//*[@class='csiHeadingCellLabel' and text()='Forro']";
    public String forro = "//*[@data-csi-act='RNR_UPL_Styleatt_Forro_enum:Child:Attributes:0']";

    public String sazonalidadeText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Sazonalidae']";
    public String sazonalidade = "//*[@data-csi-act='RNR_UDA_Styleatt_Sazonalidade_enum:Child:Attributes:0']";

    public String sizeRangeText = "//*[@class='csiHeadingCellLabel' and text()='Size Range']";
    public String sizeRange = "//*[@data-csi-act='ActualSizeRange:Child:Attributes:0']";

    public String composicaoItemText = "//*[@class='csiHeadingCellLabel' and text()='Composição do Item']";
    public String composicaoItem = "//*[@id='dijit_form_Textarea_2']";

    //Aba Colorways
    public String botaoAcaoColorways = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'Actions...')]";
    public String tituloancoraColoways = "//*[@id='uniqName_1_3_title']";
    public String corEspecifica = "//*[@class='attrString firstColumn' ]";
    public String getCorEspecifica(String sel_cor){       return corEspecifica.replace("Color Specification:", sel_cor);
    }
    public String botaoSalvarColorways = "//*[@id='dijit_form_Button_55_label']";
    public String botaoSalvarCores = "//*[@class='dijitReset dijitInline dijitButtonText' and contains(text(), 'Save')]";

    public String clusterSul = "//*[@data-csi-act='RNR_ColorwayAttributes_ClusterSUL_enum:Child:Attributes:0']";
    public String clusterSulCombo = "//div/div[1]/div/div/div/div[3]/input[1]";

    //Aba Cores
    public String abacor ="//*[@id='dijit_layout_TabContainer_9_tablist_dijit_layout_ContentPane_110']";
    public String botaoAcaocor = "//*[@id='dijit_form_DropDownButton_54_label']";
    public String abaColorways = "//*[@id='dijit_layout_TabContainer_11_tablist_dijit_layout_ContentPane_139']";

    //Aba SKUs
    public String abaSku = "//*[@id='dijit_layout_TabContainer_11_tablist_dijit_layout_ContentPane_145']";
    public String botaoAcaoSku = "//*[@data-csi-automation='actions-Style-ProductSKU-root']";
    public String botaoSalvarSku = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    //Aba Sourcing
    public String abaSourcing = "//*[@id='dijit_layout_TabContainer_10_tablist_dijit_layout_ContentPane_129']";
    public String designatedSupplier ="//*[@data-csi-heading='DesignatedProductSource::0']";
    public String inputSupplier = "//div/div[1]/div/div/div/div[3]/input[1]";
    public String sumario = "//*[@class='csi-view-title csi-view-title-StyleSourcing-SupplierItems' and text()='Supplier Quotes']";
    public String botaoAcaoSupplier = "//*[@data-csi-automation='actions-StyleSourcing-SupplierItems-root']";
    public String botaoNewSupplier = "//*[@class='dijitReset dijitMenuItemLabel' and contains(text(), 'New Supplier Quote...')]";
    public String botaoSalvarSupplier = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";
    public String aprovarSupplier = "//*[@class='attrEnum attrEnumRevision.State stateDraft iconEditable']";
    public String aprovarSupplierCombo = "/html/body/div[19]/div/div[1]/div/div/div/div[3]/input[1]";

    //aprovação de item
    public String abaStyle = "//*[@widgetid='dijit_layout_TabContainer_10_tablist_dijit_layout_ContentPane_127']";
    public String abaPropriedades = "//*[@widgetid='dijit_layout_TabContainer_11_tablist_dijit_layout_ContentPane_138']";
    public String botaoRefresh = "//*[@widgetid='uniqName_4_455']";
    public String botaoView = "//*[@class='dijit dijitReset dijitInline dijitLeft dijitTextBox dijitComboBox dijitValidationTextBox']";
    public String inputView = "/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[1]/div/div/div[1]/div[1]/div/span[2]/div/div[3]/input[1]";

    public String inputComposicao = "//div/div[1]/div/div/div/div[3]/input[@class='dijitReset dijitInputInner']";

    public String local1Text = "//*[@class='csiHeadingCellLabel' and text()='Local 1']";
    public String local1 = "//*[@data-csi-act='RNR_StyleAtt_Local1_enum:Child:Attributes:0']";

    public String campo1Text = "//*[@class='csiHeadingCellLabel' and text()='Compo 1']";
    public String campo1 = "//*[@data-csi-act='RNR_StyleAtt_Compo1_ref:Child:Attributes:0']";

    public String ancoraComposicao = "//*[@class='csi-view-title' and contains(text(), 'Composition 1')]";
    public String botaoAprovarItem = "//*[@data-csi-act='RNR_Integration_Status_string:Child:Attributes:0']";
    //Como tratar a seleção de cor
    public String cor ="//*[@id='uniqName_49_124']";

    private String campoObrigatorio = "//*[@class='csiHeadingCellLabel' and contains(text(), 'CAMPO_OBRIGATORIO')]";
    private String campoObrigatorioTexto = "//*[@data-csi-act='RNR_INT_Styleatt_countryorigin1_ref:Child:Attributes:0']";

    public String getCampoObrigatorio(String qualCampo) {
        return campoObrigatorio.replace("CAMPO_OBRIGATORIO", qualCampo);
    }

    public String getCampoObrigatorioTexto(String qualCampo) {
        return campoObrigatorio.replace("CAMPO_OBRIGATORIO", qualCampo);
    }

    //item aprovado - fw20 - fem adult - casual - retilinea
    public String tituloAncora2 = "//*[@class='csi-view-title csi-view-title-Collection-Collection' and text()='Subclass']";
    public String botaoFiltrarStatus = "//*[@aria-labelledby='dijit_form_DropDownButton_27']";
    public String opcaoSucesso = "//div/div[1]/div/div/div/div[3]/input[1][@data-csi-automation='values-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";

    // Select Integration Status Sucess
    public String integrationStatusText="//*[@class='csi-table-header-content' and text()='Integration Status']";
    public String campoIntegrationStatusAll = "//span[@data-csi-automation='filter-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']//span[@role='button']";
    // Sucesso
    public String integrationStatusInputItem = "//*[@item='4']";

    public String clicIntegrationStatus = "//span[@data-csi-automation='filter-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";
    public String textIntegrationStatus = "//*[@class='csi-table-header-content' and text()='Integration Status']";
    public String clicCode = "//span[@class='csi-table-header-content' and text()='Code']";

    //public String integrationStatusInput="//div[@data-csi-automation='values-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']//div//input[@data-csi-automation='values-Collection-Styles-RNR_Integration_Status_string:Child:Attributes']";
    public String integrationStatusInput = "(//input[@role='textbox'])[8]";
    public String botaoRefreshh = "//*[@data-csi-automation='plugin-Collection-Styles-refresh']";

    // campo marca PLM
    public String campoMarcaText="//*[@data-csi-automation='field-Style-CopyForm-RNR_Style_MarcaPropia_enum' and @data-dojo-attach-point='_popupStateNode']";

    // selecionar item copiado
    public String selecionarItemCopiado="//tr[contains(@class,'csiSelected')]//td[contains(@class,'attrString')]//a[contains(@class,'browse')]";
    // btn Copy
    public String botaoCopy = "(//span[contains(@title,'Copy')][normalize-space()='content_copy'])[1]";

    // Select Code
    public String codeText = "//*[@class='csi-table-header-content' and text()='Code']";

    // Copy
    public String botaoClonarItem = "/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div[5]/div/div[1]/table/tbody[2]/tr[1]/td[6]/div/span[2]";
    public String botaoProximo = "//*[@class='dijitReset dijitInline dijitButtonText' and text()='Next']";
    public String botaoFinalizar = "//span[@class='dijitReset dijitInline dijitButtonText' and text()='Finish']";
    public String botaoSave = "//span[@class='dijitReset dijitInline dijitButtonText' and text()='Save']";

    public String campoItemCopiado = "//div/div[1]/table/tbody[2]/tr[2]/td[4]/a[@class='browse']";
    public String inputCampoObrigatorio = "//body/div/div/div[1]/div/div/div/div[3]/input[1][@class='dijitReset dijitInputInner']";
    public String botaoRefreshItemExistente = "//*[@data-csi-automation='plugin-Style-Properties-refresh']";
    public String abaSkuExistente = "//*[@widgetid='dijit_layout_TabContainer_12_tablist_dijit_layout_ContentPane_148']";
    public String abaPropriedadesExistente = "//*[@id='dijit_layout_TabContainer_12_tablist']/div[4]/div/div[1]";
    public String campoSubmeter = "//*[@data-csi-act='RNR_Integration_Status_string:Child:Attributes:0']";
    public String inputCampoSubmeter = "//div[11]/div/div[1]/div/div/div/div[3]/input[1]";

    // UDA Estampado
    public String udaEstampadoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Estampado']";
    public String campoEstampado = "//*[@data-csi-act='RNR_UDA_Styleatt_Estampado_enum:Child:Attributes:0']";
    public String InputValorCopy = "//input[@id='uniqName_19_16'] ";

    // UDA Possui Bordado
    public String udaPossuiBoradoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Possui Bordado']";
    public String campoPossuiBordado = "//*[@data-csi-act='RNR_UDA_Styleatt_PossuiBordado_enum:Child:Attributes:0']";

    // UDA Tecido Tinjido
    public String udaTecidoTinjidoText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tecido Tinjido']";
    public String campoTecidoTinjido = "//*[@data-csi-act='RNR_UDA_Styleatt_TecidoTinjido_enum:Child:Attributes:0']";

    // UDA Tecido com Lavagem Jeans
    public String udaLagemJeansText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Tecido com Lavagem Jeans Tiedi e Branqueado']";
    public String campoTecidoLavagemJeans = "//*[@data-csi-act='RNR_UDA_Styleatt_Tecidocomlavagemjeanstiediebranqueado_enum:Child:Attributes:0']";

    // UDA Fios com Diferentes Cores
    public String udaFiosDiferentesCoresText = "//*[@class='csiHeadingCellLabel' and text()='UDA - Fio com Diferentes Cores']";
    public String campoFiosDiferentesCores = "//*[@data-csi-act='RNR_UDA_Styleatt_Fiocomdiferentescores_enum:Child:Attributes:0']";

    public String infoPlmId = "//td[@data-csi-heading='RNR_StyleAttributes_URLStyle_string:Child:Attributes:0']";

}
