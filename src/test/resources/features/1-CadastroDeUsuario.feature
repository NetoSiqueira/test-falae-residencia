#language: pt

Funcionalidade: 1-Cadastro de usuario

  @cenario_1
  Cenario: 01 - Cadastro de usuário com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario preencher o campo email
      E o usuario preencher o campo confirmar email
      E o usuario preencher o campo senha
      E o usuario preencher o campo confirmar senha
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem: "Por favor, verifique seu e-mail para ativar sua conta."

  @cenario_2
  Cenario:02 - Cadastro de usuário com nome em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario não preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario preencher o campo email
      E o usuario preencher o campo confirmar email
      E o usuario preencher o campo senha
      E o usuario preencher o campo confirmar senha
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem de erro: "Nome não pode ficar em branco"

  @cenario_3
  Cenario: : 03 - Cadastro de usuário com sobrenome em branco;
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario não preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario preencher o campo email
      E o usuario preencher o campo confirmar email
      E o usuario preencher o campo senha
      E o usuario preencher o campo confirmar senha
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem de erro: "Sobrenome não pode ficar em branco"

  @cenario_5
  Cenario: 05 - Cadastro de usuário indicando outro idioma
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "English"
      E o usuario preencher o campo email
      E o usuario preencher o campo confirmar email
      E o usuario preencher o campo senha
      E o usuario preencher o campo confirmar senha
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem: "Por favor, verifique seu e-mail para ativar sua conta."

  @cenario_6
  Cenario:  06 - Cadastro de usuário com email e confirmar email em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario não preencher o campo email
      E o usuario não preencher o campo confirmar email
      E o usuario preencher o campo senha
      E o usuario preencher o campo confirmar senha
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem de erro: "Email não pode ficar em branco" "Email não é válido"

  @cenario_7
  Cenario: 07 - Cadastro de usuário com email e confirmar email invalido
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario preencher o campo email com um email invalido
      E o usuario preencher o campo confirmar email com um email invalido
      E o usuario preencher o campo senha
      E o usuario preencher o campo confirmar senha
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem de erro: "Email não é válido"

  @cenario_8
  Cenario: 08 - Cadastro de usuário  com email e confirmar email não estando iguais
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario preencher o campo email
      E o usuario preencher o campo confirmar email com um email invalido
      E o usuario preencher o campo senha
      E o usuario preencher o campo confirmar senha
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem de erro: "Confirmar email não é igual a Email"

  @cenario_9
  Cenario: 09 - Cadastro de usuário senha e confirmar senha em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario preencher o campo email
      E o usuario preencher o campo confirmar email
      E o usuario não preencher o campo senha
      E o usuario não preencher o campo confirmar senha
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem de erro: "Senha não pode ficar em branco" "Senha é muito curto (mínimo: 6 caracteres)"

  @cenario_10
  Cenario: 10 - Cadastro de usuário senha e confirmar senha com menos de 6 caracteres
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario preencher o campo email
      E o usuario preencher o campo confirmar email
      E o usuario preencher o campo senha com menos de 6 caracteres
      E o usuario preencher o campo confirmar senha com menos de 6 caracteres
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem de erro: "Senha é muito curto (mínimo: 6 caracteres)"

  @cenario_11
  Cenario: 11 - Cadastro de usuário senha e confirmar senha com mais de 6 caracteres
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario preencher o campo email
      E o usuario preencher o campo confirmar email
      E o usuario preencher o campo senha com 6 mais de caracteres
      E o usuario preencher o campo confirmar senha com mais de 6 caracteres
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem: "Por favor, verifique seu e-mail para ativar sua conta."

  @cenario_12
  Cenario: 12 - Cadastro de usuário senha e confirmar não estando iguais
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario preencher o campo email
      E o usuario preencher o campo confirmar email
      E o usuario preencher o campo senha
      E o usuario preencher o campo confirmar invalido
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem de erro: "Confirmar senha não é igual a Senha"

  @cenario_13
  Cenario: 13 - Cadastro de usuário com email já em uso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario clicar no link "Cadastrar"
      Quando o usuario preencher o campo nome
      E o usuario preencher o campo sobrenome
      E o usuario selecionar o idioma "Português"
      E o usuario preencher o campo email ja em uso
      E o usuario preencher o campo confirmar email ja em uso
      E o usuario preencher o campo senha
      E o usuario preencher o campo confirmar senha
      E o usuario clicar no botao "Criar"
      Então o sistema exibe uma mensagem de erro: "Email já está em uso"


