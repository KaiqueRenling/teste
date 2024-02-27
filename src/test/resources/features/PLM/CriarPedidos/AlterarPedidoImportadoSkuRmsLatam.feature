#language: pt
Funcionalidade: Alterar Pedido Importado Sku Rms Latam

  @ID_Plm_Alterar_Pedido_Importado_Sku_RmsLatam0024 @regressao1
  @AlterarPedidoImportadoSkuRmsLatam

  Esquema do Cenário: Alterar de um Pedido Importado Sku Rms Latam
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Alterar pedido importado Sku Rms Latam <itemPaiCode>
    Entao Alterei um pedido importado rms latam sku

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0013" |