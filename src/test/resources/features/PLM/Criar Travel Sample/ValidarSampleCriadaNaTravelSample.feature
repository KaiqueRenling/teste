#language: pt
@ValidarSampleNaTravelSamples @regressao1
Funcionalidade: Validar Sample na Travel Samples

  @ID_Plm_Validar_Sample_Na_Travel_Samples_0065
  Esquema do Cenario: Validar Sample na Travel Samples

    Dado que logo no PLM
    Quando seleciono a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Então Adicionar Sample a Travel Samples

    Exemplos:
      | sessao | divisao           | grupo  | subclasse     |
      | "FW23" | "Masculino Jovem" | "SURF" | "Camiseta MC" |