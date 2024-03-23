#language: pt

  @criarPagina
  Funcionalidade: 12-Criar Pagina

    @cenario_68
    Cenario: 68 - Criar pagina com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar na prancha
      E o usuario clicar no botao do "Criar Página"
      Quando o usuario preencher o  campo nome da pagina
      E o usuario preencher o campo colunas
      E o usuario preencher o campo linhas
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de sucesso: "Página criada com sucesso."

    @cenario_69
    Cenario: 69 - Criar pagina com nome em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar na prancha
      E o usuario clicar no botao do "Criar Página"
      Quando o usuario nao preencher o campo nome
      E o usuario preencher o campo colunas
      E o usuario preencher o campo linhas
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de erro: "Nome não pode ficar em branco" "Spreadsheet não é válido"

    @cenario_70
    Cenario: 70 - Criar página com nome já em uso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario selecinar a prancha
      E o usuario clicar no botao do "Criar Página"
      Quando o usuario preencher o campo nome ja em uso
      E o usuario preencher o campo colunas
      E o usuario preencher o campo linhas
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de erro: "Nome já está em uso" "Spreadsheet não é válido"


    @cenario_73
    Cenario: 73 - Criar página com colunas em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar na prancha
      E o usuario clicar no botao do "Criar Página"
      Quando o usuario preencher o  campo nome da pagina
      E o usuario nao preencher o campo colunas
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de erro: "Colunas não pode ficar em branco" "Colunas não é um número" "Spreadsheet não é válido"

    @cenario_74
    Cenario:  74 - Criar página com linhas em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar na prancha
      E o usuario clicar no botao do "Criar Página"
      Quando o usuario preencher o  campo nome da pagina
      E o usuario nao preencher o campo linhas
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de erro: "Linhas não pode ficar em branco" "Linhas não é um número" "Spreadsheet não é válido"

