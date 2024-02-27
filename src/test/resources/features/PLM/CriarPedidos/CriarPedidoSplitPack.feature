#language: pt
@CriarPedido @regressao1
Funcionalidade: Criar Pedido Split Pack

  @ID_Plm_Criar_Pedido_Split_Pack_0043
  @PedidoSplitPack
  Esquema do Cenário: Criação de um Pedido Split Pack
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Crio Pedido split Pack <itemPaiCode>
    Entao Criei um pedido split pack

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0013" |