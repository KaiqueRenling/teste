#language: pt
Funcionalidade: Alterar Pedido Importado Pack Rms Br

  @ID_Plm_Alterar_Pedido_Importado_Pack_RmsBr0022 @regressao1
  @AlterarPedidoImportadoPackRmsBr
  Esquema do Cenário: Alterar de um Pedido Importado Pack Rms Br
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Alterar pedido importado Pack Rms Latam <itemPaiCode>
    Entao Alterei um pedido importado rms br pack

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0013" |