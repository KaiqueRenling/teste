#language: pt
@Criaritem @regressao1
Funcionalidade: Criar item

  @ID_Plm_Criar_Item_0013
  Esquema do Cenario: Criar item
    Dado que logo no PLM
    Quando que altero role produto beleza no PLM
    E seleciono a hierarquia, utilizando <sessao>, <divisao>, <grupo>, <subclasse>, <tipoReferencia> e <marca>
    E seleciono a view cadastro de item
    E preencho campos obrigatórios, informando <cadeiaProdutiva> <pais> <tipoProdutoComercial> <materialProduto> <estampaProduto> <detalheProduto> <ncmFornecedor> <unitCost> <precoVenda> <precoVendaUruguai> <precoVendaArgentina> <faixaPreco> <origemMercadoria> <categoriaGenerica> <packingMethod> <grupoInsumo> <piramideMercadologica> <itemFundamental> <cadeiaProducao> <localizacao> <localizacaoLatam> <tema> <calendario> <origem> <natureza> <tipoMaterial> <padronagem> <rr> <sustentabilidade> <tipomaterialsustentavel> <tipoprocessosustentavel> <mensagemetiqueta> <mensagemlatam> <estampado> <bordado> <tecidotinjido> <tecidolavavel> <fiodiferente> <forro> <sazonalidade> <maquiagem> <tipodetecido> <sizerange>
    E adiciono as cores e clusters
    E seleciono o fornecedor, informando <fornecedor> <reservafornecedor> <precofornecedor>
    E seleciono a view cadastro de item
    E preencho campos de composição, informando <local1> e <campo1>
    E preencho o campo Tipo de Processo sustentável<tipoprocessosustentavel>
    E adiciono os SKUs
    Entao aprovo o item

    Exemplos:
      | sessao | divisao           | grupo   | subclasse     | tipoReferencia | marca        | cadeiaProdutiva    |pais     | tipoProdutoComercial | tipoProdutoFiscal      | materialProduto | estampaProduto | detalheProduto | ncmFornecedor | unitCost | precoVenda | precoVendaUruguai | precoVendaArgentina | faixaPreco | origemMercadoria                      | categoriaGenerica    | packingMethod | grupoInsumo | piramideMercadologica     | itemFundamental     | cadeiaProducao              | localizacao | localizacaoLatam | tema       | calendario | origem     | natureza    | tipoMaterial | padronagem | rr          | sustentabilidade | tipomaterialsustentavel | tipoprocessosustentavel | mensagemetiqueta | mensagemlatam    | estampado | bordado | tecidotinjido | tecidolavavel | fiodiferente | forro       | sazonalidade   | maquiagem | tipodetecido     | sizerange                          | fornecedor                                                 | reservafornecedor | precofornecedor | local1   | campo1  |
      | "FW24" | "Masculino Jovem" | "JOVEM" | "Camiseta MC" | "Style"        | "BLUE STEEL" | "Malha Circular"   |"brasil" | "Camiseta"           | "Camiseta manga longa" | "Sherpa"        | "Liso"         | "Teste"        | "33049990"    | "45"     | "1279.90"  | "12790.00"        | "21790.00"          | "P2"       | "Nacional-exceto códigos nº 3 a nº 5" | "(46) Camiseta Masc" | "HANG"        | "128"       | "Core"                    | "Colecao"           | "Tecido Plano Leve"         | "Solo"      | "Piso"           | "Sem Tema" | "Carnaval" | "Nacional" | "Royalties" | "Termico"    | "Liso"     | "Supply RR" | "Nao se Aplica"  | "Nao se Aplica"         | "NA"                    | "Etiqueta BR"    | "Etiqueta Latam" | "Não"     | "Não"   | "Não"         | "Sim"         | "Não"        | "Sem forro" | "Produto Leve" | "Medio"   | "Malha circular" | "34-50 (Desenv: 40) (PreProd: 36)" | "DDX TEXTIL INDUSTRIA E COMERCIO DE MALHAS LTDA - 0001-39" | "500"             | "500"           | "Frente" | "NA"     |
