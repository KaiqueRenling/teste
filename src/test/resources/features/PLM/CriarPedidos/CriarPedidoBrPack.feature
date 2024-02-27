#language: pt
@ID_Plm_Criar_Pedido_Nacional_Pack_0033 @regressao1
 Funcionalidade: Criar Pedido Br Pack

@PedidoNacionalPack
 Esquema do Cenário: Criação de um Pedido Br Pack

   Dado que logo no PLM
   Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
   E Criar pedido nacional Pack new <itemPaiCode>
   Entao Criei um pedido nacional pack

  Exemplos:
    | sessao | divisao          | grupo   | subclasse      | itemPaiCode        |
    | "FW23" | "Masculino Jovem"| "SURF"  | "Camiseta MC"  | "BS_FW23_CMT_0140" |
