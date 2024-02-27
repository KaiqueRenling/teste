#language: pt
Funcionalidade: Alterar Pedido Importado Sku Rms Br

  @ID_Plm_Alterar_Pedido_Sku_Br0021 @regressao1
  @AlterarPedidoSkuBr

  Esquema do Cenário: Alterar de um Pedido Sku Br
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Alterar pedido Sku Br <itemPaiCode>
    Entao Alterei um pedido br sku

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0004" |