#language: pt
@CriarColorSpecification
Funcionalidade: Criar Color Specification

  @ID_Plm_Criar_Color_Specification_0011
  Esquema do Cenário: Criação de um Color Specification
    Dado que logo no PLM
    Quando começo a criação do Color Specification <diffid>, <diffdesc>, <family>
    Entao crio Color Specification

    Exemplos:
      | diffid     | diffdesc                  | family |
      | "CORAZULA" | "Test Cor Azul Automacao" | "Azul" |



