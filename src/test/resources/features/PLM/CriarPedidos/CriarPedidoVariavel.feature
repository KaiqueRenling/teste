#language: pt
@CriarPedidoNacionalSku @regressao1
Funcionalidade: Criar Pedido

  @ID_Plm_Criar_Pedido_0045
  Esquema do Cenário: Criação de um Pedido

    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Seleciono viewPlm, filtro o item e crio o pedido <viewPlm> e <pack> <viewRennerPO> <anocor1> <semanaComercialcor1> <anocor2> <semanaComercialcor2> <anocor3> <semanaComercialcor3> <wareHouseStor> <poModel> <quantidadesPorTamanhoPP> <quantidadesPorTamanhoP> <quantidadesPorTamanhoM> <quantidadesPorTamanhoG> <quantidadesPorTamanhoGG> <OrderCase> <packQuantity> <itemPaiCode> <naoValidarOtb>
    Entao Criei um pedido

    Exemplos:
      | sessao | divisao           | grupo    | subclasse   |  viewPlm           |   viewRennerPO       | itemPaiCode     | pack    |  anocor1   | semanaComercialcor1 |   anocor2   | semanaComercialcor2 |   anocor3  | semanaComercialcor3 | wareHouseStor                            | poModel      | naoValidarOtb | quantidadesPorTamanhoPP  | quantidadesPorTamanhoP | quantidadesPorTamanhoM | quantidadesPorTamanhoG| quantidadesPorTamanhoGG |  OrderCase   | packQuantity|
      | "FW22" | "Masculino Jovem" | "SURF"   | "Retilinea" |"Cadastro de Itens" |"Renner PO Nacional"  | "FW22_STMP_8426"| "sim"   |  "2023"    | "45"                |  "2023"     | "46"                |  "2023"    | "47"                |"CDD CENTRO DE DISTRIBUICAO SAO JOSE 324" | "RMS BR"     |      "sim"    | "2"                      | "2"                    | "2"                    | "2"                   |  "2"                    |   "2"        |   "2"       |


