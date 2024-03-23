#language: pt

  Funcionalidade: 11-Editar Prancha

    @cenario_65
    Cenario: 65 - Editar prancha com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar na prancha
      E o usuario clicar no botao do "Editar"
      Quando o usuario preencher o campo nome do editar prancha
      E o usuario clicar no botao "Atualizar"
      Entao o sistema exibe uma mensagem de sucesso: "Prancha atualizada com sucesso."

    @cenario_66
    Cenario: 66 - Editar prancha com nome em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar na prancha
      E o usuario clicar no botao do "Editar"
      Quando o usuario nao preencher o campo nome do editar prancha
      E o usuario clicar no botao "Atualizar"
      Entao o sistema exibe uma mensagem de erro: "Nome não pode ficar em branco"

    @cenario_67
    Cenario: 67 - Editar prancha selecionar outra pagina inicial
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario selecionar a prancha
      E o usuario clicar no botao do "Editar"
      Quando o usuario preencher o campo nome do editar prancha
      E o usuario selecionar outra pagina inicial
      E o usuario clicar no botao "Atualizar"
      Entao o sistema exibe uma mensagem de sucesso: "Prancha atualizada com sucesso."
