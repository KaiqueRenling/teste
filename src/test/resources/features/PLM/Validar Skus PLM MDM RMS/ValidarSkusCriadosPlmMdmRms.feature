#language: pt
@ValidarSkusCriadoPlmMdmRms @regressao1
Funcionalidade: Validar Skus criados Plm Mdm Rms

  @ID_Plm_Validar_Sku_CriadoPlmMdmRms_0053
  Esquema do Cenario: Validar Skus criados Plm Mdm Rms
    Dado que logo no PLM
    Quando que altero role produto beleza no PLM
    E seleciono a hierarquia, utilizando <sessao>, <divisao>, <grupo>, <subclasse>, <tipoReferencia> e <marca>
    E seleciono a view cadastro de item
    E preencho campos obrigatórios, informando <pais> <tipoProdutoComercial> <tipoProdutoFiscal> <materialProduto> <estampaProduto> <detalheProduto> <ncmFornecedor> <unitCost> <precoVenda> <precoVendaUruguai> <precoVendaArgentina> <faixaPreco> <origemMercadoria> <categoriaGenerica> <packingMethod> <grupoInsumo> <piramideMercadologica> <itemFundamental> <cadeiaProducao> <localizacao> <localizacaoLatam> <tema> <calendario> <origem> <natureza> <tipoMaterial> <padronagem> <rr> <sustentabilidade> <tipomaterialsustentavel> <tipoprocessosustentavel> <mensagemetiqueta> <mensagemlatam> <estampado> <bordado> <tecidotinjido> <tecidolavavel> <fiodiferente> <forro> <sazonalidade> <maquiagem> <tipodetecido> <sizerange>
    E adiciono as cores e clusters
    E seleciono o fornecedor, informando <fornecedor> <reservafornecedor> <precofornecedor>
    E seleciono a view cadastro de item
    E preencho campos de composição, informando <local1> e <campo1>
    E adiciono os SKUs
    Entao aprovo o item

    E que logo no MDM e espero dois minutos
    Quando Aprovar Style MDM

    Entao validar skus criados no plm mdm e rms

    Exemplos:
      | sessao | divisao           | grupo  | subclasse   | tipoReferencia | marca        |  pais     | tipoProdutoComercial | tipoProdutoFiscal      | materialProduto | estampaProduto | detalheProduto | ncmFornecedor | unitCost | precoVenda | precoVendaUruguai | precoVendaArgentina | faixaPreco | origemMercadoria                      | categoriaGenerica    | packingMethod | grupoInsumo | piramideMercadologica | itemFundamental | cadeiaProducao      | localizacao | localizacaoLatam | tema       | calendario | origem     | natureza | tipoMaterial | padronagem | rr          | sustentabilidade | tipomaterialsustentavel | tipoprocessosustentavel | mensagemetiqueta | mensagemlatam    | estampado | bordado | tecidotinjido | tecidolavavel | fiodiferente |   forro      | sazonalidade   |    maquiagem     | tipodetecido     |    sizerange                         |         fornecedor			                               | reservafornecedor| precofornecedor |  local1   |       campo1	      |
      | "FW22" | "Masculino Jovem" | "SURF" | "Retilinea" | "Estampa"      | "BLUE STEEL" |  "BRASIL" | "Camiseta"           | "Camiseta manga longa" | "Sherpa"       | "Liso"         | "Teste"         | "33049990"    | "45"     | "104.00"   | "171.80"    	  | "1159.00"           | "P2"       | "Nacional-exceto códigos nº 3 a nº 5" | "(46) Camiseta Masc" | "HANG"        | "128"       | "Core"                | "Colecao"       | "Tecido Plano Leve" | "Solo"      | "The Wall Solo"  | "Sem Tema" | "Carnaval" | "Nacional" | "Normal" | "Algodao"    | "Liso"     | "Supply RR" | "Nao se Aplica"  |          "NA" 		    | 		 "NA"   		  | "Etiqueta BR"    | "Etiqueta Latam" |   "Não"   |  "Não"  |     "Não" 	  |     "Sim" 	  |   "Não" 	 | "Sem forro"  | "Produto Leve" |     "Medio"      | "Malha circular" | "34-50 (Desenv: 40) (PreProd: 36)"   | "DDX TEXTIL INDUSTRIA E COMERCIO DE MALHAS LTDA - 0001-39" |        "500"     |      "500"      | "Frente"  | "Cotton / Algodão"  |

