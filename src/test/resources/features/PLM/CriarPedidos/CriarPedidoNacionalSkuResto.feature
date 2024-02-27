#language: pt
@ID_PlmCriarPedidoNacionalSkuResto0042 @regressao1
Funcionalidade: Criar Pedido

  @PedidoNacionalSkuResto
  Esquema do Cenário: Criação de um Pedido Nacional SKU

    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Criar pedido nacional SKU Resto <itemPaiCode>
    Entao Criei um pedido nacional sku

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0092" |