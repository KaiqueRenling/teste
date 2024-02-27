#language: pt
@Conversao_Pedido_Br_Sku_para_Pack_Aprovado_0055 @regressao1
Funcionalidade: Conversao pedido Br Sku para Pack Aprovado

  @Conversao_Pedido_Br_SKU_para_PACK_Aprovado
  Esquema do Cenário: Conversao pedido Br Sku para Pack Aprovado

    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Conversao pedido Br Sku em Pack Aprovado <itemPaiCode>
    Entao Converti um pedido br sku em pack

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0004" |