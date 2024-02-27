#language: pt
Funcionalidade: Criar Pedido Importado Pack Rms Latam

  @ID_Plm_Criar_Pedido_Importado_Pack_RmsLatam0039 @regressao1
  @CriarPedidoImportadoPackRmsLatam

  Esquema do Cenário: Criação de um Pedido Importado Pack Rms Latam
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Criar pedido importado Pack Rms Latam <itemPaiCode>
    Entao Criei um pedido importado pack

    Exemplos:
      | sessao | divisao          | grupo    | subclasse   | itemPaiCode         |
      | "FW23" | "Feminino Adulto"| "CASUAL" | "Retilinea" | "LCF_FW23_RET_0089" |