#language: pt
@CriarSupplierRequestAnaliseModelagem @regressao1
Funcionalidade: Criar supplier request

  @ID_Plm_Supplier_Request_Analise_Modelagem_0049
  Esquema do Cenario: Criar supplier request
    Dado que logo no PLM
    Quando seleciono a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Entao Crio Supplier Request Ficha Analise de Modelagem

    Exemplos:
      | sessao | divisao           | grupo  | subclasse     |
      | "FW23" | "Masculino Jovem" | "SURF" | "Camiseta MC" |
