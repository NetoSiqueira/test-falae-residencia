package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.CriarPranchaPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CriarPranchaSteps extends BaseSteps {
    private String aleatorio = (new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss")).format(new Date());
    private CriarPranchaPage page = new CriarPranchaPage();

    @Dado("o usuario clicar no botao do {string}")
    public void o_usuario_clicar_no_botao_do(String escolha) {
        screenshot();
        page.criarPrancha(escolha);
    }

    @Quando("o usuario preencher o campo nome da prancha")
    public void o_usuario_preencher_o_campo_nome_da_prancha() {
        page.escreverNomePrancha("teste"+aleatorio);
    }

    @Entao("o sistema exibe uma mensagem de sucesso: {string}")
    public void o_sistema_exibe_uma_mensagem_de_sucesso(String msg) {
        Assert.assertEquals(msg, page.msgSucessoPrancha());
        screenshot();
    }

    @Quando("o usuario nao preencher o campo nome da prancha")
    public void o_usuario_nao_preencher_o_campo_nome_da_prancha() {
        page.escreverNomePrancha("");
    }

    @Quando("o usuario preencher o campo nome da prancha ja em uso")
    public void o_usuario_preencher_o_campo_nome_da_prancha_ja_em_uso() {
       page.escreverNomePrancha("teste");
    }

}
