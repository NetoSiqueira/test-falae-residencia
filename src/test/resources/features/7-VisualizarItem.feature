#language: pt

  @visualizar
  Funcionalidade: 7-Visualizar Item

    @cenario_50
    Cenario: 50 - Visualizar item voltar
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Meus Itens"
      E o usuario clicar na imagem
      E o usuario clicar no botao do item "Voltar"
      Entao o sistema deve retornar para pagina "Meus Itens"

    @cenario_51
    Cenario:  51 - Visualizar item apagar
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Meus Itens"
      E o usuario clicar na imagem
      E o usuario clicar no botao do item "Apagar"
      Entao o sistema exibe uma mensagem do item: "Item apagado com sucesso."

    @cenario_52
    Cenario:  52 - Visualizar item imprimir
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Meus Itens"
      E o usuario clicar na imagem
      E o usuario clicar no botao do item "Imprimir"
      Entao o sistema deve criar um pdf com a imagem

