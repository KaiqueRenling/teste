#language: pt
@CriarSizes @regressao1
Funcionalidade: Criar Size

  @ID_Plm_Criar_Size_0048
  Esquema do Cenário: Criação de um Sizes
    Dado que logo no PLM
    Quando começo a criação do Sizes <namesize>, <sortorder>
    Entao crio o Size

    Exemplos:
      | namesize   | sortorder |
      | "NameSize" | "220"     |

