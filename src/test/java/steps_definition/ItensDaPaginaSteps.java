package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.ItensDaPaginaPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ItensDaPaginaSteps extends BaseSteps {

   private ItensDaPaginaPage page = new ItensDaPaginaPage();
   private String aleatorio = (new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss")).format(new Date());

    @Quando("o usuario clicar  na imagem com um {string}")
    public void o_usuario_clicar_na_imagem_com_um(String string) {
        page.clicarAdicionar();
    }
    @Quando("o usuario preencher o campo nome do adicionar item")
    public void o_usuario_preencher_o_campo_nome_do_adicionar_item() {
     page.escreverNomeItem("teste");
     screenshot();
    }
    @Quando("o usuario clicar no botao do {string} em adicionar item")
    public void o_usuario_clicar_no_botao_do_em_adicionar_item(String string) {
       page.clicarProcurarItem();
    }
    @Quando("o usuario clicar no botao {string} do adicionar item")
    public void o_usuario_clicar_no_botao_do_adicionar_item(String string) {
        screenshot();
        page.clicarAdicionarAPagina();
    }

    @Entao("o sistema adiciona o item na pagina")
    public void o_sistema_adiciona_o_item_na_pagina() {
        screenshot();
    }
    @Quando("o usuario preencher o campo nome com a inicial do adicionar item")
    public void o_usuario_preencher_o_campo_nome_com_a_inicial_do_adicionar_item() {
        page.escreverNomeItem("opa");
    }

    @Quando("o usuario não preencher o campo nome do adicionar item")
    public void o_usuario_não_preencher_o_campo_nome_do_adicionar_item() {
        page.escreverNomeItem(" ");
    }
    @Entao("o sistema exibe a mensagem: {string}")
    public void o_sistema_exibe_a_mensagem(String msg) {
        Assert.assertEquals(msg, page.retornarMsgDeItem());
        screenshot();
    }

    @Quando("o usuario preencher o campo nome com caractere especial")
    public void o_usuario_preencher_o_campo_nome_com_caractere_especial() {
       page.escreverNomeItem("#");
    }


    @Quando("o usuario clicar no botao {string} na imagem do item")
    public void o_usuario_clicar_no_botao_na_imagem_do_item(String escolha) {
        screenshot();
       page.clicarImagemItem(escolha);
    }
    @Quando("o usuario preencher o campo nome do editar item")
    public void o_usuario_preencher_o_campo_nome_do_editar_item() {
        page.escreverNomeItem("teste"+aleatorio);
    }
    @Quando("o usuario preencher o campo pronuncia do editar item")
    public void o_usuario_preencher_o_campo_pronuncia_do_editar_item() {
        page.escreverPronuncia("pronuncia"+aleatorio);
    }
    @Entao("sistema exibe salva as mudanças")
    public void sistema_exibe_salva_as_mudanças() {
       screenshot();
    }
    @Quando("o usuario clicar no botao {string} do item")
    public void o_usuario_clicar_no_botao_do_item(String string) {
       page.itemBotao();
    }
}
