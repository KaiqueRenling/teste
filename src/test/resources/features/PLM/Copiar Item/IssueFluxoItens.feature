#language: pt
@IssueFluxoItens @regressao1
Funcionalidade: Copiar Item
  @IssueFluxoItens_0009
  Esquema do Cenario: Copiar Item
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Seleciono view e filtro item para copiar <viewPlm> e <dataIncial>, <dataFinal> <brand>
    E seleciono a view cadastro de item
    E preencho campos obrigatórios issue, criado a partir de um existente, informando <estampado>, <bordado>, <tecidotinjido>, <tecidolavavel>, <fiodiferente>, <udamarca>, <origempais> e <udaorigem>
    E adiciono as cores e clusters variavel <cor1> <cor2> <cor3>
    E adiciono os SKUs para um item criado a partir do existente
    Entao aprovo o item criado a partir do existente issue
    Exemplos:
      | sessao | divisao           | grupo    | subclasse      | viewPlm            | dataIncial   | dataFinal   |         cor1                  |       cor2                   |       cor3                    |            fornecedor                                          | precofornecedor| reservafornecedor    |  estampado | bordado | tecidotinjido | tecidolavavel | fiodiferente  |  udamarca  | origempais | udaorigem   |   brand    |
      | "FW23" | "Masculino Jovem" | "SURF"   | "Camiseta MC"  |"Cadastro de Itens" | "28/03/2023" | "04/04/2023"|     "13-0643 TCX:Yellow Plum" |    "14-0849 TCX:Beach Ball"  |   "14-4815 TCX:Leisure Time"  | "DDX TEXTIL INDUSTRIA E COMERCIO DE MALHAS LTDA - 0001-39"     | "500"          |        "50"          |    "Não"   |  "Não"  |     "Não"     |     "Sim"     |     "Não"     |  "Pegada"  |  "BRASIL"  |  "Nacional" |"BLUE STEEL"|
