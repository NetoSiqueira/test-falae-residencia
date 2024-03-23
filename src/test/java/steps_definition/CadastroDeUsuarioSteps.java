package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.CadastroDeUsuarioPage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CadastroDeUsuarioSteps  extends BaseSteps {
    private CadastroDeUsuarioPage page = new CadastroDeUsuarioPage();

    private String aleatorio = (new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss")).format(new Date());
    private String email = "teste" + aleatorio+"@teste.com";
    private String emailLogin = "teste" + aleatorio+"@teste.com";



    @Dado("o usuario clicar no link {string}")
    public void o_usuario_clicar_no_link(String string) {
        page.clicarLink(string);
    }

    @Quando("o usuario preencher o campo nome")
    public void o_usuario_preencher_o_campo_nome() {
        page.escreverNome("TesteFalae");
    }

    @Quando("o usuario preencher o campo sobrenome")
    public void o_usuario_preencher_o_campo_sobrenome() {
        page.escreverSobrenome("HP");
    }

    @Quando("o usuario selecionar o idioma {string}")
    public void o_usuario_selecionar_o_idioma(String idioma) {
        page.selecionarIdioma(idioma);
        screenshot();
    }

    @Quando("o usuario preencher o campo email")
    public void o_usuario_preencher_o_campo_email() {
        page.escreverEmail(email);
    }

    @Quando("o usuario preencher o campo confirmar email")
    public void o_usuario_preencher_o_campo_confirmar_email() {
        page.escreverCofirmEmail(email);
    }

    @Quando("o usuario preencher o campo senha")
    public void o_usuario_preencher_o_campo_senha() {
        page.escreverSenha("123456");
    }

    @Quando("o usuario preencher o campo confirmar senha")
    public void o_usuario_preencher_o_campo_confirmar_senha() {
        page.escreverConfirmSenha("123456");
    }

    @Quando("o usuario clicar no botao {string}")
    public void o_usuario_clicar_no_botao(String string) {
        screenshot();
        page.botaoCriar();
    }

    @Então("o sistema exibe uma mensagem: {string}")
    public void o_sistema_exibe_uma_mensagem(String mensagem) {
        Assert.assertEquals(mensagem, page.MensagemDeSucesso());
        screenshot();
    }

    @Quando("o usuario não preencher o campo nome")
    public void o_usuario_não_preencher_o_campo_nome() {
        page.escreverNome("");
    }

    @Então("o sistema exibe uma mensagem de erro: {string}")
    public void o_sistema_exibe_uma_mensagem_de_erro(String msgErro) {
        Assert.assertEquals(msgErro, page.msgErro());
        screenshot();
    }

    @Quando("o usuario não preencher o campo sobrenome")
    public void o_usuario_não_preencher_o_campo_sobrenome() {
       page.escreverSobrenome("");
    }


    @Quando("o usuario não preencher o campo email")
    public void o_usuario_não_preencher_o_campo_email() {
        page.escreverEmail("");
    }
    @Quando("o usuario não preencher o campo confirmar email")
    public void o_usuario_não_preencher_o_campo_confirmar_email() {
       page.escreverCofirmEmail("");
    }

    @Então("o sistema exibe uma mensagem de erro: {string} {string}")
    public void o_sistema_exibe_uma_mensagem_de_erro(String string, String string2) {
        screenshot();
        List<String> retornoMsg = new ArrayList<>();
        retornoMsg.add(string);
        retornoMsg.add(string2);
        Assert.assertEquals(retornoMsg, page.msgsDeErros());
    }

    @Quando("o usuario preencher o campo email com um email invalido")
    public void o_usuario_preencher_o_campo_email_com_um_email_invalido() {
       page.escreverEmail("teste");
    }
    @Quando("o usuario preencher o campo confirmar email com um email invalido")
    public void o_usuario_preencher_o_campo_confirmar_email_com_um_email_invalido() {
       page.escreverCofirmEmail("teste");
    }

    @Quando("o usuario não preencher o campo senha")
    public void o_usuario_não_preencher_o_campo_senha() {
        page.escreverSenha("");
    }
    @Quando("o usuario não preencher o campo confirmar senha")
    public void o_usuario_não_preencher_o_campo_confirmar_senha() {
       page.escreverConfirmSenha("");
    }

    @Quando("o usuario preencher o campo senha com menos de {int} caracteres")
    public void o_usuario_preencher_o_campo_senha_com_menos_de_caracteres(Integer int1) {
       page.escreverSenha("12345");
    }
    @Quando("o usuario preencher o campo confirmar senha com menos de {int} caracteres")
    public void o_usuario_preencher_o_campo_confirmar_senha_com_menos_de_caracteres(Integer int1) {
       page.escreverConfirmSenha("12345");
    }

    @Quando("o usuario preencher o campo senha com {int} mais de caracteres")
    public void o_usuario_preencher_o_campo_senha_com_mais_de_caracteres(Integer int1) {
        page.escreverSenha("1234567");
    }
    @Quando("o usuario preencher o campo confirmar senha com mais de {int} caracteres")
    public void o_usuario_preencher_o_campo_confirmar_senha_com_mais_de_caracteres(Integer int1) {
        page.escreverConfirmSenha("1234567");
    }

    @Quando("o usuario preencher o campo confirmar invalido")
    public void o_usuario_preencher_o_campo_confirmar_invalido() {
        page.escreverConfirmSenha("1234567");
    }

    @Quando("o usuario preencher o campo email ja em uso")
    public void o_usuario_preencher_o_campo_email_ja_em_uso() {
      page.escreverEmail("testesfalae@gmail.com");
    }
    @Quando("o usuario preencher o campo confirmar email ja em uso")
    public void o_usuario_preencher_o_campo_confirmar_email_ja_em_uso() {
       page.escreverCofirmEmail("testesfalae@gmail.com");
    }

    @Quando("o usuario preencher o campo email do login um email não ativo")
    public void o_usuario_preencher_o_campo_email_do_login_um_email_não_ativo() {
        page.clicarLink("Cadastrar");
        page.escreverNome("teste"+aleatorio);
        page.escreverSobrenome("HP");
        page.escreverEmail(emailLogin);
        page.escreverCofirmEmail(emailLogin);
        page.escreverSenha("123456");
        page.escreverConfirmSenha("123456");
        page.botaoCriar();
        page.escreverEmail(emailLogin);
    }
}
