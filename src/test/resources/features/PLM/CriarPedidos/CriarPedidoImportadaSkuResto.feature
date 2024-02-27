#language: pt
@CriarPedidoImportadoSkuResto @regressao1
Funcionalidade: Criar Pedido Importado Sku Resto

  @ID_Plm_Criar_Pedido_Importado_Sku_Resto_0037
  Esquema do Cenário: Criação de um Pedido Importado SKU Resto
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Criar pedido importado Sku Resto <itemPaiCode>
    Entao Criei um pedido importado sku

    Exemplos:
      | sessao | divisao           | grupo  | subclasse     | itemPaiCode         |
      | "FW23" | "Masculino Jovem" | "SURF" | "Camiseta MC" | "GOM_FW23_CMT_0622" |