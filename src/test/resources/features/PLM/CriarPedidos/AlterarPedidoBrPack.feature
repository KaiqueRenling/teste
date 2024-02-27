#language: pt
@ID_Plm_Alterar_Pedido_Nacional_Pack_0020 @regressao1
Funcionalidade: Alterar Pedido Br Pack

  @AlterarPedidoNacionalPack
  Esquema do Cenário: Alterar de um Nacional Pack

    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Alterar pedido nacional Pack <itemPaiCode>
    Entao Alterei um pedido br pack

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0092" |
