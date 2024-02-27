#language: pt
@Criaritembeleza @regressao1
Funcionalidade: Criar item beleza

  @ID_Plm_Criar_Item_Beleza_0015
  Esquema do Cenario: Criar item beleza
    Dado que logo no PLM
    Quando que altero role opp no PLM
    E seleciono a hierarquia, utilizando <sessao>, <divisao>, <grupo>, <subclasse>, <tipoReferencia> e <marca>
    E seleciono a view cadastro de item beleza
    E preencho campos obrigatórios beleza, informando <pais> <tipoProdutoComercial> <tipoProdutoFiscal> <detalheProduto> <ncmFornecedor> <unitCost> <precoVenda> <precoVendaUruguai> <precoVendaArgentina> <faixaPreco> <origemMercadoria> <categoriaGenerica> <packingMethod> <grupoInsumo> <piramideMercadologica> <itemFundamental> <localizacao> <localizacaoLatam> <campoMarca> <tema> <calendario> <sazonalidade> <origem> <sexo> <tipoMaterial> <padronagem> <sustentabilidade> <tipomaterialsustentavel> <tipoprocessosustentavel> <mensagemetiqueta> <mensagemlatam> <estampado> <bordado> <tecidotinjido> <tecidolavavel> <fiodiferente> <cadeiaProducao> <forro> <validade> <produtos> <sizerange>
    E adiciono as cores e clusters
    E seleciono o fornecedor, informando <fornecedor> <reservafornecedor> <precofornecedor>
    E seleciono a view cadastro de item beleza
    E preencho campos de composição beleza, informando <local1> e <campo1>
    E preencho o campo Tipo de Processo sustentável<tipoprocessosustentavel>
    E adiciono os SKUs
    Entao aprovo o item

    Exemplos:
      | sessao           | divisao  | grupo           | subclasse | tipoReferencia | marca              | pais     | tipoProdutoComercial | tipoProdutoFiscal | detalheProduto              | ncmFornecedor | unitCost      | precoVenda  | precoVendaUruguai  | precoVendaArgentina | faixaPreco | origemMercadoria               | categoriaGenerica  | packingMethod | grupoInsumo | piramideMercadologica | itemFundamental  | cadeiaProducao | localizacao | localizacaoLatam |campoMarca  | tema       | calendario | origem      | sexo       |tipoMaterial| padronagem           | sustentabilidade | tipomaterialsustentavel | tipoprocessosustentavel  | mensagemetiqueta | mensagemlatam | estampado | bordado | tecidotinjido  | tecidolavavel | fiodiferente | sazonalidade     |forro      |validade|produtos                      |sizerange       | fornecedor                                                 | reservafornecedor | precofornecedor | local1 | campo1  |
      | "Basics/Básicos" | "Beleza" | "R_B_Maquiagem" | "Batom"   | "Style"        | "MARCAS TERCEIROS" | "brasil" | "Batom"              | "Batom"           | "Lipbalm Colorgel Shiseido" | "33041000"    | "65.1600"     | "159.90"    | "1590.00"          | "1590.00"           | "P5"       | "Importação-Importação direta" | "(390) 3"          | "FLAT"        | "639"       | "Essential"           | "Colecao"        | "."            | "Solo"      | "Piso"           | "Shiseido" |"Sem Tema"  | "Carnaval" | "Nacional"  | "Feminino" | "Aluminio" |"Sem Padronagem"      | "Nao se Aplica"  | "Nao se Aplica"         | "NA"                     | "."              | "."           | "Não"     | "Não"   | "Não"          | "Não"         | "Não"        | "Todas Estações" |"Sem forro"| "Sim"  | "Conjunto Pincel Maquiagem"  |"2G"           | "DDX TEXTIL INDUSTRIA E COMERCIO DE MALHAS LTDA - 0001-39" | "500"             | "500"           | "NA"   | "NA/NA" |
