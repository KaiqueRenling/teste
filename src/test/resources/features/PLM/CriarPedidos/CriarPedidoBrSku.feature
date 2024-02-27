#language: pt
@ID_Plm_Criar_Pedido_Nacional_Sku_0034 @regressao1
Funcionalidade: Criar Pedido

@PedidoNacionalSku
 Esquema do Cenário: Criar um Pedido BR SKU

  Dado que logo no PLM
  Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
  Quando Criar pedido nacional SKU New <itemPaiCode>
  Entao Criei um pedido nacional sku

  Exemplos:
    | sessao | divisao          | grupo   | subclasse      | itemPaiCode        |
    | "FW23" | "Masculino Jovem"| "SURF"  | "Camiseta MC"  | "BS_FW23_CMT_0140" |