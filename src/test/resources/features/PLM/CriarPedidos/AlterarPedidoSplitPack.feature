#language: pt
@AlterarPedidoSplitPack @regressao1
Funcionalidade: Alterar Pedido Split Pack

  @ID_Plm_Alterar_Pedido_Split_Pack_0025
  @AlterarPedidoSplitPack

  Esquema do Cenário: Alterar de um Pedido Split Pack
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Alterar Pedido split Pack <itemPaiCode>
    Entao Alterei um pedido split pack

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0013" |