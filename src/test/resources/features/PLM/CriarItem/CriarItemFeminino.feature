#language: pt
@Criaritemfeminino @regressao1
Funcionalidade: Criar item feminino

  @ID_Plm_Criar_Item_Feminino_0016
  Esquema do Cenario: Criar item feminino
    Dado que logo no PLM
    Quando que altero role produto beleza no PLM
    E seleciono a hierarquia, utilizando <sessao>, <divisao>, <grupo>, <subclasse>, <tipoReferencia> e <marca>
    E seleciono a view cadastro de item
    E preencho campos obrigatórios feminino, informando <cadeiaProdutiva> <pais> <tipoProdutoComercial> <tipoProdutoFiscal> <materialProduto> <estampaProduto> <detalheProduto> <ncmFornecedor> <unitCost> <precoVenda> <precoVendaUruguai> <precoVendaArgentina> <faixaPreco> <origemMercadoria> <categoriaGenerica> <packingMethod> <grupoInsumo> <piramideMercadologica> <itemFundamental> <cadeiaProducao> <localizacao> <localizacaoLatam> <tema> <calendario> <origem> <natureza> <tipoMaterial> <padronagem> <rr> <sustentabilidade> <tipomaterialsustentavel> <tipoprocessosustentavel> <mensagemetiqueta> <mensagemlatam> <estampado> <bordado> <tecidotinjido> <tecidolavavel> <fiodiferente> <forro> <sazonalidade> <maquiagem> <tipodetecido> <sizerange>
    E adiciono as cores e clusters
    E seleciono o fornecedor, informando <fornecedor> <reservafornecedor> <precofornecedor>
    E seleciono a view cadastro de item
    E preencho campos de composição feminino, informando <local1> e <campo1>
    E preencho o campo Tipo de Processo sustentável<tipoprocessosustentavel>
    E adiciono os SKUs
    Entao aprovo o item

    Exemplos:
      | sessao | divisao           | grupo    | subclasse   | tipoReferencia | marca      |cadeiaProdutiva   | pais     | tipoProdutoComercial | tipoProdutoFiscal | materialProduto | estampaProduto | detalheProduto                                    | ncmFornecedor | unitCost      | precoVenda | precoVendaUruguai | precoVendaArgentina | faixaPreco   | origemMercadoria                      | categoriaGenerica                | packingMethod | grupoInsumo | piramideMercadologica | itemFundamental  | cadeiaProducao      | localizacao | localizacaoLatam | tema                      | calendario          | origem     | natureza | tipoMaterial | padronagem  | rr          | sustentabilidade | tipomaterialsustentavel | tipoprocessosustentavel | mensagemetiqueta | mensagemlatam | estampado | bordado | tecidotinjido | tecidolavavel | fiodiferente | forro       | sazonalidade   | maquiagem | tipodetecido     | sizerange            | fornecedor                                                 | reservafornecedor | precofornecedor | local1 | campo1             |
      | "FW24" | "Feminino Adulto" | "CASUAL" | "Retilinea" | "Style"        | "MARFINNO" |"Malha Retilínea" | "BRASIL" | "Blusa manga longa"  | "Saia"            | "Algodao"       | "Liso"         | "retilínea rendada BOUDOIR FOLK PAREDE MAR"       | "61061000"    | "54.0000"     | "139.90"   | "1390.00"         | "16390.00"          | "Automatico" | "Nacional-exceto códigos nº 3 a nº 5" | "(21) Blusa Malha Retilinea Fem" | "FLAT"        | "119"       | "Fashion"             | "Colecao"        | "Malha Retilínea"   | "Parede"    | "Pared"          | "Boudoir Folk"            | "1 Entrada Inverno" | "Nacional" | "Normal" | "Renda"      | "Liso"      | "Supply RR" | "Nao se Aplica"  | "Nao se Aplica"         | "NA"                    | "PP a GG"        | "PP a GG"     | "Não"     | "Não"   | "Sim"         | "Não"         | "Não"        | "Sem forro" | "Produto Leve" | "Medio"   | "Malha circular" | "P-GG (Desenv: M)"   | "DDX TEXTIL INDUSTRIA E COMERCIO DE MALHAS LTDA - 0001-39" | "500"             | "500"           | "NA"   | "cotton / algodão" |
