#language: pt

  @editar_itens
  Funcionalidade: 6-Editar Itens

    @cenario_47
    Cenario: 47 - Editar item com nome em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Meus Itens"
      E o usuario clicar na imagem
      E o usuario clicar no botao do item "Editar"
      Quando o usuario não preencher o campo nome do editar item
      E o usuario preencher o campo pronuncia
      E o usuario incluir uma imagem
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de erro: "Nome não pode ficar em branco"

    @cenario_48
    Cenario: 48 - Editar item com pronuncia em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Meus Itens"
      E o usuario clicar na imagem
      E o usuario clicar no botao do item "Editar"
      Quando o usuario preencher o campo nome do item
      E o usuario não preencher o campo pronuncia
      E o usuario incluir uma imagem
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de erro: "Pronúncia não pode ficar em branco"