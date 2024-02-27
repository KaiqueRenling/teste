#language: pt
@CriarPedidoImportadoRmsBrSku @regressao1
Funcionalidade: Criar Pedido Importado Sku

@ID_Plm_Criar_Pedido_Importado_Rms_Br_Sku_0040
Esquema do Cenário: Criação de um Pedido Importado SKU BR
Dado que logo no PLM
Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
Quando Criar pedido importado Rms Br Sku New <itemPaiCode>
Entao Criei um pedido importado sku

Exemplos:
  | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
  | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0095" |