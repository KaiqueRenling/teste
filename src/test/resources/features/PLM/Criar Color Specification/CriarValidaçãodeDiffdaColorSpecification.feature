#language: pt
@Plm_Criar_Validacao_Diff_ColorSpecification_0012 @regressao1

Funcionalidade: Plm Criar Validacao Diff ColorSpecification

  @Plm_Criar_Validacao_Diff_ColorSpecification
  Esquema do Cenário: Plm Criar Validacao Diff ColorSpecification

    Dado que logo no PLM
    Quando selecionar a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    E Crio validacao diff color specification <itemPaiCode> <estampado> <bordado> <tecidotinjido> <tecidolavavel> <fiodiferente> <udamarca> <origempais> <udaorigem> <brand>
    E selecionar a view cadastro de item
    E preencho campos obrigatórios, criado a partir de um existente, informando <estampado>, <bordado>, <tecidotinjido>, <tecidolavavel>, <fiodiferente>, <udamarca>, <origempais>, <udaorigem> e <cor>
    E adiciono a cor criada diff color specidfication <cor>
    E adiciono os SKUs para um item criado a partir do existente
    Entao aprovo o item criado a partir do existente

    E que logo no MDM e espero dois minutos
    Quando Aprovar Style MDM

    Exemplos:
      | sessao | divisao          | grupo    | subclasse | itemPaiCode         |   estampado | bordado | tecidotinjido | tecidolavavel | fiodiferente  |  udamarca  | origempais | udaorigem   |   brand    |              cor          |
      | "FW23" | "Feminino Jovem" | "MODAL"  | "Casaco"  | "BSM_FW23_CCO_0004" |   "Não"     |  "Não"  |     "Não"     |     "Sim"     |     "Não"     |  "Pegada"  |  "BRASIL"  |  "Nacional" |"BLUE STEEL"|  "Test Cor Roxo Automacao"|