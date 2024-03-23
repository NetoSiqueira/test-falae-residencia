#language: pt

  @listar_itens
  Funcionalidade: 8-Listar Itens

    @cenario_53
    Cenario: 53 - Listar itens com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Meus Itens"
      E o usuario preencher o campo filtro
      E o usuario clicar no botao  "Filtrar"
      Entao o sistema vai buscar o nome dos itens que tenha o texto escrito

    @cenario_54
    Cenario:  54 - Listar itens com caracteres especiais
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Meus Itens"
      E o usuario preencher o campo filtro com caracteres especiais
      E o usuario clicar no botao  "Filtrar"
      Entao o sistema vai buscar o nome dos itens que tenha o texto escrito

    @cenario_55
    Cenario: 55 - Listar itens com nome incompleto
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Meus Itens"
      E o usuario preencher o campo filtro com nome incompleto
      E o usuario clicar no botao  "Filtrar"
      Entao o sistema vai buscar o nome dos itens que tenha o texto escrito
