#language: pt
@CriarSupplierRequestFichaTecnicaAmostra @regressao1
Funcionalidade: Criar supplier request ficha tecnica amostra

  @ID_Plm_Supplier_Request_FichaTecnicaAmostra_0058
  Esquema do Cenario: Criar supplier request ficha tecnica amostra
    Dado que logo no PLM
    Quando seleciono a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Entao Crio Supplier Request Ficha Tecnica Amostra

    Exemplos:
      | sessao | divisao           | grupo  | subclasse     |
      | "FW23" | "Masculino Jovem" | "SURF" | "Camiseta MC" |
