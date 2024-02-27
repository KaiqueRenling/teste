#language: pt
@CriarPedidoComSample @regressao1
Funcionalidade: Criar Pedido com Sample

  @ID_Plm_Criar_Pedido_Nacional_Pack_Com_Amostra_0035
  @CriarPedidoBrPackComAmostra
  Esquema do Cenário: Criação de um Pedido BR Pack com Amostra
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando criar pedido BR Pack com Amostra <itemPaiCode>
    Entao criei um pedido br pack com amostra


    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0091" |

  @ID_Plm_Criar_Pedido_Nacional_Sku_Com_Amostra_0036
  @CriarPedidoBrSkuComAmostra
  Esquema do Cenário: Criação de um Pedido BR SKU com Amostra
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando crio pedido BR SKU com Amostra <itemPaiCode>
    Entao criei um pedido br sku com amostra

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0004" |