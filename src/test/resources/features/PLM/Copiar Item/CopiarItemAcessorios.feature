#language: pt
@CopiarItemAcessorios @regressao1
Funcionalidade: Copiar Item Acessorios
  @ID_Plm_Copiar_Item_Acessorios_0005
  Esquema do Cenario: Copiar Item Acessorios
    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Seleciono view e filtro item acessorio para copiar <viewPlm> e <dataIncial>, <dataFinal> <brand>
    E seleciono a view cadastro de item
    E preencho campos obrigatórios, criado a partir de um existente, informando <estampado>, <bordado>, <tecidotinjido>, <tecidolavavel>, <fiodiferente>, <udamarca>, <origempais>, <udaorigem> e <cor>
    E adiciono as cores e clusters
    E seleciono o fornecedor, informando <fornecedor> <reservafornecedor> <precofornecedor>
    E seleciono a view cadastro de item
    E preencho campos de composição, informando <local1> e <campo1>
    E preencho o campo Tipo de Processo sustentável<tipoprocessosustentavel>
    E adiciono os SKUs para um item criado a partir do existente
    Entao aprovo o item criado a partir do existente
    Exemplos:
      | sessao | divisao      | grupo      | subclasse         | viewPlm             | dataIncial   | dataFinal    | cor1                      | cor2                     | cor3                       | fornecedor                                                 | precofornecedor | reservafornecedor | estampado | bordado | tecidotinjido | tecidolavavel | fiodiferente | udamarca | origempais | udaorigem  | brand         | cor |tipoprocessosustentavel|local1  |campo1|
      | "FW24" | "Acessórios" | "BO/CI/CA" | "Bolsa Coleção"   | "Cadastro de Itens" | "01/01/2024" | "27/02/2024" | "13-0643 TCX:Yellow Plum" | "14-0849 TCX:Beach Ball" | "14-4815 TCX:Leisure Time" | "DDX TEXTIL INDUSTRIA E COMERCIO DE MALHAS LTDA - 0001-39" | "500"           | "50"              | "Não"     | "Não"   | "Não"         | "Sim"         | "Não"        | "Pegada" | "BRASIL"   | "Nacional" | "ACCESSORIES" | ""  |"NA"                   |"NA"    |"Polyester / Poliéster" |
