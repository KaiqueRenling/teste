#language: pt
@CriarPedidoAPartirDeUmExistenteImportado @regressao1
Funcionalidade: Criar Pedido a Partir de um Existente Importado

@ID_Plm_Criar_Pedido_Importado_Sku_0031
@CriarPedidoapartirdeUmExistenteLatamSku
Esquema do Cenário: Criação de um Pedido Importado a partir de um pedido existente
Dado que logo no PLM
Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
Quando Crio pedido importado sku a partir de um pedido um existente new <itemPaiCode>
Entao criei pedido importado sku
  Exemplos:
    | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
    | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0013" |


@ID_Plm_Criar_Pedido_Importado_Pack_0032
@CriarPedidoapartirdeUmExistenteLatamPack
Esquema do Cenário: Criação de um Pedido Importado Pack a partir de um pedido do existente
Dado que logo no PLM
Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
Quando Crio pedido importado pack a partir de um pedido um existente <itemPaiCode>
Entao criei pedido importado pack

  Exemplos:
    | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
    | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0013" |