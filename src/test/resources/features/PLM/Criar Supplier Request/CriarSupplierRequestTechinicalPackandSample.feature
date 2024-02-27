#language: pt
@CriarSupplierRequestTechinicalPackandSample @regressao1
Funcionalidade: Criar Supplier Request, Techinical Pack and Sample

  @ID_Plm_Supplier_Request_TechinicalPackandSample_0059
  Esquema do Cenario: Criar Supplier Request, Techinical Pack and Sample
    Dado que logo no PLM
    Quando seleciono a hierarquia do produto, utilizando <sessao>, <divisao>, <grupo>, <subclasse>
    Entao Crio Supplier Request Techinical Pack and Sample

    Exemplos:
      | sessao | divisao           | grupo  | subclasse     |
      | "FW23" | "Masculino Jovem" | "SURF" | "Camiseta MC" |
