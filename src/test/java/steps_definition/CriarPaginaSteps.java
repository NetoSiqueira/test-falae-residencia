package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.CadastroDeUsuarioPage;
import page_objects.CriarPaginaPage;
import page_objects.PranchaPage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CriarPaginaSteps extends BaseSteps {
    private String aleatorio = (new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss")).format(new Date());

    private CriarPaginaPage page = new CriarPaginaPage();
    private CadastroDeUsuarioPage pageErro = new CadastroDeUsuarioPage();
    private PranchaPage pranchaPage = new PranchaPage();

    @Quando("o usuario preencher o  campo nome da pagina")
    public void o_usuario_preencher_o_campo_nome_da_pagina() {
       page.escreverPagina("teste"+aleatorio);
    }
    @Quando("o usuario nao preencher o campo nome")
    public void o_usuario_nao_preencher_o_campo_nome() {
        page.escreverPagina(" ");
    }

    @Quando("o usuario preencher o campo colunas")
    public void o_usuario_preencher_o_campo_colunas() {
       page.escreverColunaPagina("2");
    }

    @Quando("o usuario preencher o campo linhas")
    public void o_usuario_preencher_o_campo_linhas() {
       page.escreverLinhaPagina("2");
    }

    @Quando("o usuario preencher o campo nome ja em uso")
    public void o_usuario_preencher_o_campo_nome_ja_em_uso() {
       page.escreverPagina("teste1");
    }
    @Quando("o usuario nao preencher o campo colunas")
    public void o_usuario_nao_preencher_o_campo_colunas() {
       page.escreverColunaPagina(" ");
    }
    @Entao("o sistema exibe uma mensagem de erro: {string} {string} {string}")
    public void o_sistema_exibe_uma_mensagem_de_erro(String string, String string2, String string3) {
        screenshot();
        List<String> retornoMsg = new ArrayList<>();
        retornoMsg.add(string);
        retornoMsg.add(string2);
        retornoMsg.add(string3);
        Assert.assertEquals(retornoMsg, pageErro.msgsDeErrosComTres());
    }

    @Quando("o usuario nao preencher o campo linhas")
    public void o_usuario_nao_preencher_o_campo_linhas() {
        page.escreverLinhaPagina(" ");
    }

    @Dado("o usuario selecinar a prancha")
    public void o_usuario_selecinar_a_prancha() {
      pranchaPage.selecionarPrancha();
    }
}


