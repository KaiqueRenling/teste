#language: pt
@Criariteminfantil @regressao1
Funcionalidade: Criar item infantil

  @ID_Plm_Criar_Item_Infantil_0017
  Esquema do Cenario: Criar item infantil
    Dado que logo no PLM
    Quando que altero role produto beleza no PLM
    E seleciono a hierarquia, utilizando <sessao>, <divisao>, <grupo>, <subclasse>, <tipoReferencia> e <marca>
    E seleciono a view cadastro de item
    E preencho campos obrigatórios infantil, informando <pais> <tipoProdutoComercial> <materialProduto> <estampaProduto> <detalheProduto> <ncmFornecedor> <unitCost> <precoVenda> <precoVendaArgentina> <faixaPreco> <origemMercadoria> <categoriaGenerica> <packingMethod> <grupoInsumo> <piramideMercadologica> <itemFundamental> <cadeiaProducao> <FittBottom> <localizacao> <localizacaoLatam> <tema> <calendario> <origem> <natureza> <tipoMaterial> <padronagem> <rr> <sustentabilidade> <tipomaterialsustentavel> <tipoprocessosustentavel> <mensagemetiqueta> <mensagemlatam> <estampado> <bordado> <tecidotinjido> <tecidolavavel> <fiodiferente> <forro> <sazonalidade> <maquiagem> <tipodetecido> <sizerange>
    E adiciono as cores e clusters
    E seleciono o fornecedor, informando <fornecedor> <reservafornecedor> <precofornecedor>
    E seleciono a view cadastro de item
    E preencho campos de composição infantil, informando <local1> e <campo1>
    E preencho o campo Tipo de Processo sustentável<tipoprocessosustentavel>
    E adiciono os SKUs
    Entao aprovo o item

    Exemplos:
      | sessao | divisao           | grupo        | subclasse       | tipoReferencia | marca     | pais     | tipoProdutoComercial |   materialProduto   | estampaProduto | detalheProduto         | ncmFornecedor | unitCost      | precoVenda | precoVendaArgentina | faixaPreco | origemMercadoria                      | categoriaGenerica | packingMethod | grupoInsumo | piramideMercadologica | itemFundamental  | cadeiaProducao      |FittBottom     |localizacao | localizacaoLatam | tema       | calendario | origem     | natureza | tipoMaterial | padronagem | rr              | sustentabilidade | tipomaterialsustentavel | tipoprocessosustentavel | mensagemetiqueta | mensagemlatam    | estampado | bordado | tecidotinjido | tecidolavavel | fiodiferente | forro       | sazonalidade   | maquiagem | tipodetecido     | sizerange                | fornecedor                                                 | reservafornecedor | precofornecedor | local1 | campo1             |
      | "FW24" | "Infantil Menina" | "MNAS(4-10)" | "Bermuda Plano" | "Style"        | "Fuzarka" | "brasil" | "Short"              |         "Linho"     | "Liso"         | "FIT RUNNER COM PAETE" | "62046200"    | "48.5000"     | "119.90"   | "11790.00"          | "P5"       | "Nacional-exceto códigos nº 3 a nº 5" | "(107) Short Inf" | "FLAT"        | "711"       | "Fashion"             | "Basico Sazonal" | "Tecido Plano Leve" | "Cintura Alta"|"Parede"    | "Pared"          | "Sem Tema" | "Carnaval" | "Nacional" | "Normal" | "Veludo"     | "Liso"     | "Supply Normal" | "Nao se Aplica"  | "Nao se Aplica"         | "NA"                    | "FUZARKA 5 A 14" | "FUZARKA 5 A 14" | "Não"     | "Não"   | "Não"         | "Sim"         | "Não"        | "Sem forro" | "Produto Leve" | "Medio"   | "Malha circular" | "5 - 13/14 (BASE 11-12)" | "DDX TEXTIL INDUSTRIA E COMERCIO DE MALHAS LTDA - 0001-39" | "500"             | "500"           | "NA"   | "Cotton / Algodão" |
