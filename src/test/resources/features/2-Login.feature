#language: pt

  @login
  Funcionalidade: 2-Login

    @cenario_14
    Cenario: 14 - Login com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link  "Entrar"
      Quando o usuario preencher o campo email do login
      E o usuario preencher o campo senha do login
      E o usuario clicar no botao "Entrar"
      Então o sistema direciona o usuario logado para pagina inicial

    @cenario_15
    Cenario: 15 - Login com email em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link  "Entrar"
      Quando o usuario não preencher o campo email
      E o usuario preencher o campo senha do login
      E o usuario clicar no botao "Entrar"
      Então o sistema exibe uma mensagem no login: "Email e/ou senha inválidos."

    @cenario_16
    Cenario: 16 - Login com email invalido
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link  "Entrar"
      Quando o usuario preencher o campo email com um email invalido
      E o usuario preencher o campo senha do login
      E o usuario clicar no botao "Entrar"
      Então o sistema exibe uma mensagem no login: "Email e/ou senha inválidos."

    @cenario_17
    Cenario: 17 - Login com senha em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link  "Entrar"
      Quando o usuario preencher o campo email do login
      E o usuario não preencher o campo senha
      E o usuario clicar no botao "Entrar"
      Então o sistema exibe uma mensagem no login: "Email e/ou senha inválidos."

    @cenario_18
    Cenario: 18 - Login com senha invalida
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link  "Entrar"
      Quando o usuario preencher o campo email do login
      E o usuario preencher o campo senha com uma senha invalida
      E o usuario clicar no botao "Entrar"
      Então o sistema exibe uma mensagem no login: "Email e/ou senha inválidos."

    @cenario_19
    Cenario: 19 - Login com conta não ativa
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link  "Entrar"
      Quando o usuario preencher o campo email do login um email não ativo
      E o usuario preencher o campo senha do login
      E o usuario clicar no botao "Entrar"
      Então o sistema exibe uma mensagem de ativacao no login: "Conta não foi ativada. Procure link de ativação em seu e-mail."

