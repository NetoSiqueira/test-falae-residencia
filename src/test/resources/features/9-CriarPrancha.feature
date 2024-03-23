#language: pt

  @criar_prancha
  Funcionalidade: 9-Criar Prancha

    @cenario_56
    Cenario: 56 - Criar prancha com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar no botao do "Criar Prancha"
      Quando o usuario preencher o campo nome da prancha
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de sucesso: "Prancha criada com sucesso."

    @cenario_57
    Cenario: 57 - Criar prancha com nome em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar no botao do "Criar Prancha"
      Quando o usuario nao preencher o campo nome da prancha
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de erro: "Nome não pode ficar em branco"

    @cenario_58
    Cenario: 58 - Criar prancha com nome ja em uso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar no botao do "Criar Prancha"
      Quando o usuario preencher o campo nome da prancha ja em uso
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de erro: "Nome já está em uso"
