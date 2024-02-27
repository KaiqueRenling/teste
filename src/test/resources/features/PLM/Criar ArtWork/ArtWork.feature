#language: pt
@CriarArtWork @regressao1
Funcionalidade: Criar ArtWork

  @ID_Plm_Criar_ArtWork_0010
  Esquema do Cenario: Criar ArtWork
    Dado que logo no PLM
    Quando seleciono a hierarquia para criar um item a partir do existente, utilizando <sessao>, <divisao>, <grupo> e <subclasse>
    Entao crio ArtWork

    Exemplos:
      | sessao | divisao           | grupo  | subclasse     |
      | "FW23" | "Masculino Jovem" | "SURF" | "Camiseta MC" |
