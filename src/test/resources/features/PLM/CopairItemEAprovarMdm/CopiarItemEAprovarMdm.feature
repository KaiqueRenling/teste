#language: pt
@CopiarItemAprovarMDM @regressao1
Funcionalidade: Copiar Item no plm e aprovar no mdm
  @ID_Plm_Copiar_Item_Aprovar_Mdm_0003
  Esquema do Cenario: Copiar Item no plm e aprovar no mdm
    Dado que logo no PLM
    Quando que altero role produto beleza no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Seleciono view e filtro item para copiar <viewPlm> e <dataIncial>, <dataFinal> <brand>
    E preencho campos obrigatórios, criado a partir de um existente, informando <estampado>, <bordado>, <tecidotinjido>, <tecidolavavel>, <fiodiferente>, <udamarca>, <origempais>, <udaorigem> e <cor>
    E adiciono as cores e clusters variavel <cor1> <cor2> <cor3>
    E seleciono um fornecedor <fornecedor> <precofornecedor> <reservafornecedor>
    E adiciono os SKUs para um item criado a partir do existente
    Entao aprovo o item criado a partir do existente

    E que logo no MDM e espero dois minutos
    Quando Aprovar Style MDM

    Exemplos:
      | sessao | divisao           | grupo    | subclasse      | viewPlm             | dataIncial   | dataFinal    |         cor1                  |       cor2                    |       cor3                   |            fornecedor                    | precofornecedor| reservafornecedor    |  estampado | bordado | tecidotinjido | tecidolavavel | fiodiferente  |    udamarca   | origempais | udaorigem  |      brand    | cor |
      | "FW22" | "Masculino Jovem" | "SURF"   | "Retilinea"    |"Cadastro de Itens"  | "01/05/2022" | "09/12/2023" |     "13-0643 TCX:Yellow Plum" |    "14-0849 TCX:Beach Ball"   |   "14-4815 TCX:Leisure Time" | "3PL BRASIL LOGISTICA S A - 0001-78"     | "500"          |        "50"          |    "Não"   |  "Não"  |     "Não"     |     "Sim"     |     "Não"     |    "Pegada"   |  "BRASIL"  |  "Nacional" | "BLUE STEEL" | ""  |
