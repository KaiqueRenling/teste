#language: pt
@Criaritemacessorios @regressao1
Funcionalidade: Criar item acessorios

  @ID_Plm_Criar_Item_Acessorios_0014
  Esquema do Cenario: Criar item acessorios
    Dado que logo no PLM
    Quando que altero role produto beleza no PLM
    E seleciono a hierarquia, utilizando <sessao>, <divisao>, <grupo>, <subclasse>, <tipoReferencia> e <marca>
    E seleciono a view cadastro de item
    E preencho campos obrigatórios acessorios, informando <pais> <tipoProdutoComercial> <tipoProdutoFiscal> <materialProduto> <estampaProduto> <detalheProduto> <ncmFornecedor> <unitCost> <precoVenda> <precoVendaUruguai> <precoVendaArgentina> <faixaPreco> <origemMercadoria> <categoriaGenerica> <packingMethod> <grupoInsumo> <piramideMercadologica> <itemFundamental> <cadeiaProducao> <localizacao> <localizacaoLatam> <campoMarca> <tema> <calendario> <origem> <natureza> <tipoMaterial> <padronagem> <rr> <sustentabilidade> <tipomaterialsustentavel> <tipoprocessosustentavel> <mensagemetiqueta> <mensagemlatam> <estampado> <bordado> <tecidotinjido> <tecidolavavel> <fiodiferente> <forro> <sazonalidade> <maquiagem> <tipodetecido> <sizerange> <comentarioDoItem>
    E adiciono as cores e clusters
    E seleciono o fornecedor, informando <fornecedor> <reservafornecedor> <precofornecedor>
    E seleciono a view cadastro de item
    E preencho campos de composição acessorios, informando <local1>, <campo1>
    E preencho o campo Tipo de Processo sustentável<tipoprocessosustentavel>
    E adiciono os SKUs
    Entao aprovo o item

    Exemplos:
      | sessao | divisao      | grupo      | subclasse         | tipoReferencia | marca              | pais     | tipoProdutoComercial | tipoProdutoFiscal | materialProduto | estampaProduto | detalheProduto                                                        | ncmFornecedor | unitCost | precoVenda  | precoVendaUruguai   | precoVendaArgentina | faixaPreco | origemMercadoria                      | categoriaGenerica   | packingMethod | grupoInsumo | piramideMercadologica | itemFundamental | cadeiaProducao        | localizacao | localizacaoLatam | campoMarca|tema       | calendario | origem     | natureza | tipoMaterial                       | padronagem | rr              | sustentabilidade       | tipomaterialsustentavel | tipoprocessosustentavel    | mensagemetiqueta | mensagemlatam    | estampado | bordado | tecidotinjido | tecidolavavel | fiodiferente |comentarioDoItem| forro       | sazonalidade       | maquiagem | tipodetecido    | sizerange | fornecedor                                                 | reservafornecedor | precofornecedor | local1 | campo1                  |
      | "FW24" | "Acessórios" | "BO/CI/CA" | "Bolsa Coleção"   | "Style"        | "MARCAS TERCEIROS" | "China"  | "Bolsa"              | "Bolsa"           | "Algodao"       | "Liso"         | "preta transversal com zíper com pedraria FAST DISRUPTIVA"            | "42022210"    | "3.4000" | "119.90"    | "1190.00"           | "3190.00"           | "P5"       | "Importação-Importação direta"        | "(240) Bolsa Media" | "FLAT"        | "382"       | "Core"                | "Colecao"       | "NA"                  | "Parede"    | "Pared"          | "Satinato"|"Sem Tema" | "Carnaval" | "Importado"| "Normal" | "Tecido(Exclusivo Acessorios)"     | "Liso"     | "Supply Normal" | "Nao se Aplica"        | "Nao se Aplica"         | "NA"                       | "Etiqueta BR"    | "Etiqueta Latam" | "Não"     | "Não"   | "Não"         | "Sim"         | "Não"        |"bolsa"         | "Sem forro" | "Todas Estações"   | "Medio"   | ""              | "UNICO"   | "WENZHOU YUELE IMPORT AND EXPORT CO.,LTD - 0001-01"        | "500"             | "500"           | "NA"   | "Polyester / Poliéster" |
