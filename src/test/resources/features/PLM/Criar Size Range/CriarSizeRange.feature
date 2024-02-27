#language: pt
@CriarSizeRange @regressao1
Funcionalidade: Criar Size Range

  @ID_Plm_Criar_Size_Range_0047
  Esquema do Cenário: Criação de um Size Range
    Dado que logo no PLM
    Quando começo a criação do Size Range <nomeSizeRange>, <description>, <management>
    Entao crio Size Range

    Exemplos:
      | nomeSizeRange | description   | management |
      | "SizeRangee"  | "Size Raange" | "FEMENINO" |

    # Nome do Size Range com no maximo 10 caracteres

