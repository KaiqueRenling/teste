#language: pt
@CriarSampleDoItem @regressao1
Funcionalidade: Criar Sample do Item

  @ID_Plm_Criar_Sample_Item_0061
  Esquema do Cenario: Criar Sample do Item
    Dado que logo no PLM
    Quando que altero role produto beleza no PLM
    E seleciono a hierarquia, utilizando <sessao>, <divisao>, <grupo>, <subclasse>, <tipoReferencia> e <marca>
    Entao Crio Sample do item

    Exemplos:
      | sessao | divisao           | grupo  | subclasse     | tipoReferencia | marca        |
      | "FW23" | "Masculino Jovem" | "SURF" | "Camiseta MC" | "Estampa"      | "BLUE STEEL" |