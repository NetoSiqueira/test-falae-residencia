#language: pt

  Funcionalidade: 15-Itens da Pagina

    @cenario_88
    Cenario: 88 - Adicionar item da pagina com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario selecionar a prancha
      E o usuario clicar na pagina
      Quando o usuario clicar  na imagem com um "+"
      E o usuario preencher o campo nome do adicionar item
      E o usuario clicar no botao do "Procurar" em adicionar item
      E o usuario clicar no botao "Adicionar a Pagina" do adicionar item
      Entao o sistema adiciona o item na pagina

    @cenario_89
    Cenario: 89 - Adicionar item da pagina com a inicial do nome
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario selecionar a prancha
      E o usuario clicar na pagina
      Quando o usuario clicar  na imagem com um "+"
      E o usuario preencher o campo nome com a inicial do adicionar item
      E o usuario clicar no botao do "Procurar" em adicionar item
      E o usuario clicar no botao "Adicionar a Pagina" do adicionar item
      Entao o sistema adiciona o item na pagina

    @cenario_90
    Cenario: 90 - Adicionar item da pagina com nome em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario selecionar a prancha
      E o usuario clicar na pagina
      Quando o usuario clicar  na imagem com um "+"
      E o usuario não preencher o campo nome do adicionar item
      E o usuario clicar no botao do "Procurar" em adicionar item
      Entao o sistema exibe a mensagem: "Nenhum item encontrado."

    @cenario_91
    Cenario:  91 - Adicionar item da pagina com caracteres especiais no nome
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario selecionar a prancha
      E o usuario clicar na pagina
      Quando o usuario clicar  na imagem com um "+"
      E o usuario preencher o campo nome com caractere especial
      E o usuario clicar no botao do "Procurar" em adicionar item
      Entao o sistema exibe a mensagem: "Nenhum item encontrado."

    @cenario_92
    Cenario: 92 - Editar item da pagina com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario selecionar a prancha
      E o usuario clicar na pagina
      Quando o usuario clicar no botao "Editar" na imagem do item
      E o usuario preencher o campo nome do editar item
      E o usuario preencher o campo pronuncia do editar item
      E o usuario clicar no botao "Salvar" do item
      Entao sistema exibe salva as mudanças

    @cenario_95
    Cenario:  95 - Remover item da pagina
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario selecionar a prancha
      E o usuario clicar na pagina
      Quando o usuario clicar no botao "Remover" na imagem do item
      Entao sistema exibe salva as mudanças

