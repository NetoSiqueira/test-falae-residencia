#language: pt

  @pagina
  Funcionalidade: 13-Pagina

    @cenario_77
    Cenario: 77 - Apagar pagina
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar na prancha indicada
      E o usuario clicar no botao do "Criar Página"
      Quando o usuario preencher o  campo nome da pagina
      E o usuario clicar no botao "Criar"
      E o usuario clicar no botao do "Apagar"
      E o usuario clicar em confirmar
      Entao o sistema exibe uma mensagem de sucesso: "Página apagada com sucesso."