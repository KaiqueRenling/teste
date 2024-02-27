#language: pt
@Conversao_Pedido_Br_Pack_para_SKU_Aprovado_0054 @regressao1
Funcionalidade: Conversao pedido Br Pack em Sku Aprovado

  @Conversao_Pedido_Br_Pack_para_SKU_Aprovado
  Esquema do Cenário: Conversao pedido Br Pack em Sku Aprovado

    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Conversao pedido Br Pack em Sku Aprovado <itemPaiCode>
    Entao Converti um pedido br pack em sku

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0004" |