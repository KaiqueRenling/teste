#language: pt
@ID_Plm_Criar_Pedido_Nacional_Pack_0029 @regressao1
Funcionalidade: CriacaoDePedidoApartirDeUmExistenteNacionalPack

  Cenário: Criação de um Pedido Br Pack a partir de um pedido existente
  @CriarPedidoapartirdeUmExistenteBrPack @regressao1
  Esquema do Cenário: Criação de um Nacional Pack
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Criar pedido nacional pack a partir de um pedido um existente <itemPaiCode>
    Entao fecho navegador

    Exemplos:
      | sessao | divisao          | grupo   | subclasse      | itemPaiCode        |
      | "FW23" | "Masculino Jovem"| "SURF"  | "Camiseta MC"  | "BS_FW23_CMT_0140" |

