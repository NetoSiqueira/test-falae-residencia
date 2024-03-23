package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.CadastroDeUsuarioPage;
import page_objects.CriarItensPage;
import page_objects.LoginPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CriarItensSteps extends BaseSteps {
    private CadastroDeUsuarioPage page = new CadastroDeUsuarioPage();
    private LoginPage loginPage = new LoginPage();
    private CriarItensPage criarItensPage = new CriarItensPage();
    private String aleatorio = (new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss")).format(new Date());

    @Dado("o usuario está logado no sistema")
    public void o_usuario_está_logado_no_sistema() {
       // page.clicarLink("Entrar");
        page.escreverEmail("testesfalae@gmail.com");
        page.escreverSenha("123456");
        page.botaoCriar();
        Assert.assertTrue(loginPage.welcome("Bem-vindo"));
        screenshot();
    }


    @Dado("o usuario clicar no botao do item {string}")
    public void o_usuario_clicar_no_botao_do_item(String item) {
        page.clicarLink(item);
    }
    @Quando("o usuario preencher o campo nome do item")
    public void o_usuario_preencher_o_campo_nome_do_item() {
        criarItensPage.escreverNomeItem("teste"+aleatorio);
    }

    @Quando("o usuario preencher o campo pronuncia")
    public void o_usuario_preencher_o_campo_pronuncia() {
       criarItensPage.escreverPronunciaItem("teste"+aleatorio);
    }
    @Quando("o usuario não incluir uma imagem")
    public void o_usuario_não_incluir_uma_imagem() {
        screenshot();
    }

    @Entao("o sistema deve retornar para pagina {string}")
    public void o_sistema_deve_retornar_para_pagina(String retorno) {
        Assert.assertEquals(retorno, criarItensPage.retornoCancelarItem());
        screenshot();
    }
}
