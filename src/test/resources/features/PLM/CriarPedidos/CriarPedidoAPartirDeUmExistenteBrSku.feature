#language: pt
@CriarPedidoAPartirDeUmExistenteBrSku @regressao1
Funcionalidade: Criar Pedido a Partir de um Existente Nacional

  @ID_Plm_Criar_Pedido_Nacional_Sku_0030
  @CriarPedidoapartirdeUmExistenteBrSku
  Esquema do Cenário: Criação de um Pedido Nacional SKU a partir de um pedido existente
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Quando Crio pedido nacional sku a partir de um pedido um existente <itemPaiCode>
    Entao crio pedido nacional sku

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0004" |


