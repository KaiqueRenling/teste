#language: pt
@CriarTesteQualidade @regressao1
Funcionalidade: Criar Teste de Qualidade

  @ID_Plm_Criar_Teste_Qualidade_0060
  Esquema do Cenario: Criar Teste de Qualidade
    Dado que logo no PLM
    Quando seleciono a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Entao Crio teste de qualidade

    Exemplos:
      | sessao | divisao          | grupo   | subclasse   |
      | "SS23" | "Feminino Jovem" | "MODAL" | "Retilinea" |
