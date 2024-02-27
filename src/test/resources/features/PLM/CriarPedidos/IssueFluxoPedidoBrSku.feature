#language: pt
@ID_Plm_Issue_Pedido_Br_Sku_0046 @regressao1
Funcionalidade: Issue Pedido Br Sku

  @IssuePedidoBrSku
  Esquema do Cenário: Issue Criação de um Pedido Br SKU

    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Criar Issue pedido Br SKU <itemPaiCode>
    Entao Criei uma issue de um pedido br sku

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0004" |