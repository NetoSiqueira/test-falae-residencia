#language: pt

  @criar_itens
  Funcionalidade: 5-Criar itens

    @cenario_44
    Cenario: 44 - Criar item sem imagem
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Meus Itens"
      E o usuario clicar no botao do item "Criar Item"
      Quando o usuario preencher o campo nome do item
      E o usuario preencher o campo pronuncia
      E o usuario não incluir uma imagem
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de erro: "Image image não pode ficar em branco"

    @cenario_45
    Cenario: 45 - Cria item cancelar
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Meus Itens"
      E o usuario clicar no botao do item "Criar Item"
      E o usuario clicar no botao do item "Cancelar"
      Entao o sistema deve retornar para pagina "Meus Itens"
