#language: pt
@CriarPedidoImportadoRmsLatamSku @regressao1
Funcionalidade: Criar Pedido Importado Sku

  @ID_Plm_Criar_Pedido_Importado_Rms_Latam_Sku_0041
  Esquema do Cenário: Criação de um Pedido Importado SKU
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Criar pedido importado Rms Latam Sku New <itemPaiCode>
    Entao Criei um pedido importado sku

    Exemplos:
      | sessao | divisao           | grupo  | subclasse     | itemPaiCode         |
      | "FW23" | "Masculino Jovem" | "SURF" | "Camiseta MC" | "GOM_FW23_CMT_0622" |