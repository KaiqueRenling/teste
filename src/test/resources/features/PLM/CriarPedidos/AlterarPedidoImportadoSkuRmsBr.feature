#language: pt
Funcionalidade: Alterar Pedido Importado Sku Rms Br

  @ID_Plm_Alterar_Pedido_Importado_Sku_RmsBr0023 @regressao1
  @AlterarPedidoImportadoSkuRmsBr

  Esquema do Cenário: Alterar de um Pedido Importado Sku Rms Br
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Alterar pedido importado Sku Rms Br <itemPaiCode>
    Entao Alterei um pedido importado rms br sku

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0013" |