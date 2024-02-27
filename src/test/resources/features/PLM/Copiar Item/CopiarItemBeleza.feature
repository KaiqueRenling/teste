#language: pt
@CopiarItemBeleza @regressao1
Funcionalidade: Copiar Item Beleza
  @ID_Plm_Copiar_Item_Beleza_0006
  Esquema do Cenario: Copiar Item Beleza
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Seleciono view e filtro item Beleza para copiar <viewPlm> e <dataIncial>, <dataFinal> <brand>
    E seleciono a view cadastro de item beleza
    E preencho campos obrigatórios do beleza, criado a partir de um existente, informando <estampado>, <bordado>, <tecidotinjido>, <tecidolavavel>, <fiodiferente>, <udavalidade>, <udamarca>, <origempais>, <udaorigem> e <udanatureza>
    E adiciono as cores e clusters variavel <cor1> <cor2> <cor3>
    E seleciono um fornecedor <fornecedor> <precofornecedor> <reservafornecedor>
    E adiciono os SKUs para um item criado a partir do existente
    Entao aprovo o item criado a partir do existente
    Exemplos:
      | sessao | divisao           | grupo             | subclasse      | viewPlm            | dataIncial   | dataFinal   |         cor1                  |       cor2                   |       cor3                    |            fornecedor                                          | precofornecedor| reservafornecedor    |  estampado | bordado | tecidotinjido | tecidolavavel | fiodiferente  |udavalidade |  udamarca  | origempais | udaorigem   |   brand          | udanatureza  |
      | "FW22" | "Beleza"          | "R_B_Maquiagem"   | "Batom"        |"Cadastro de Itens" | "01/01/2023" | "30/12/2023"|     "13-0643 TCX:Yellow Plum" |    "14-0849 TCX:Beach Ball"  |   "14-4815 TCX:Leisure Time"  | "DDX TEXTIL INDUSTRIA E COMERCIO DE MALHAS LTDA - 0001-39"     | "500"          |        "50"          |    "Não"   |  "Não"  |     "Não"     |     "Sim"     |     "Não"     | "Não"       |"Pegada"  |  "BRASIL"  |  "Nacional" |"MARCAS TERCEIROS"|  "Royalties" |
