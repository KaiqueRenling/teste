#language: pt
Funcionalidade: Criar Pedido Importado Pack Rms Br

@ID_Plm_Criar_Pedido_Importado_Pack_RmsBr0038 @regressao1
@CriarPedidoImportadoPackRmsBr

Esquema do Cenário: Criação de um Pedido Importado Pack Rms Br
 Dado que logo no PLM
 Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
 Quando Criar pedido importado Pack Rms Br <itemPaiCode>
 Entao Criei um pedido importado pack

 Exemplos:
  | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
  | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0095" |
