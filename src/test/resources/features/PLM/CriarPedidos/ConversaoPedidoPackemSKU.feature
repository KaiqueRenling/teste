#language: pt
@Conversao_Pedido_Br_Pack_para_SKU_0027 @regressao1
Funcionalidade: Conversao pedido Br Pack em Sku

  @Conversao_Pedido_Br_Pack_para_SKU
  Esquema do Cenário: Conversao pedido Br Pack em Sku

    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Conversao pedido Br Pack em Sku <itemPaiCode>
    Entao Converti um pedido br pack em sku

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0004" |