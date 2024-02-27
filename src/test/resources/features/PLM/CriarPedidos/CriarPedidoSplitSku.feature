#language: pt
@CriarPedidoSplitSku @regressao1
Funcionalidade: Criar Pedido

  @ID_Plm_Criar_Pedido_Split_Sku_0044

  Esquema do Cenário: Criação de um Pedido Split SKU
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Criar Pedido split SKU <itemPaiCode>
    Entao Criei um pedido split sku

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0013" |