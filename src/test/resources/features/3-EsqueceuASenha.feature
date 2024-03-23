#language: pt

  @esqueceu_senha
  Funcionalidade: 3-Esqueceu a senha

    @cenario_20
    Cenario: 20- Esqueceu a senha com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link  "Entrar"
      E o usuario clicar no link "Esqueceu sua senha?"
      Quando o usuario preencher o campo email do esqueceu a senha
      E o usuario clicar no botao "Enviar"
      Entao o sistema exibe uma mensagem: "Por favor, verifique seu e-mail e siga instruções para alteração de senha."

    @cenario_21
    Cenario: 21 - Esqueceu a senha com email invalido
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link  "Entrar"
      E o usuario clicar no link "Esqueceu sua senha?"
      Quando o usuario preencher o campo email do esqueceu a senha com um email invalido
      E o usuario clicar no botao "Enviar"
      Entao o sistema exibe uma mensagem de erro do email: "email inválido"

    @cenario_22
    Cenario: 22 - Esqueceu a senha com email em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link  "Entrar"
      E o usuario clicar no link "Esqueceu sua senha?"
      Quando o usuario não preencher o campo email do esqueceu a senha
      E o usuario clicar no botao "Enviar"
      Entao o sistema exibe uma mensagem de erro do email: "email inválido"