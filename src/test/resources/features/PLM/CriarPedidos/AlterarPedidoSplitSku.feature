#language: pt
Funcionalidade: Alterar Pedido Split

  @ID_Plm_Alterar_Pedido_Importado_Sku_Split0026 @regressao1
  @AlterarPedidoSkuSplit
  Esquema do Cenário: Alterar de um Pedido Split Sku
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Alterar pedido Split Sku <itemPaiCode>
    Entao Alterei um pedido Split Sku

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0013" |