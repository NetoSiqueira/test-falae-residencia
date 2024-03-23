package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import page_objects.CadastroDeUsuarioPage;
import page_objects.CriarPranchaPage;
import page_objects.PranchaPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PranchaSteps extends BaseSteps {

    private PranchaPage page = new PranchaPage();
    private CriarPranchaPage criarPage = new CriarPranchaPage();
    private CadastroDeUsuarioPage cadastroDeUsuarioPage = new CadastroDeUsuarioPage();
    private String aleatorio = (new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss")).format(new Date());

    @Quando("o usuario clicar na prancha")
    public void o_usuario_clicar_na_prancha() {
        criarPage.criarPrancha("Criar Prancha");
        criarPage.escreverNomePrancha("teste"+aleatorio);
        cadastroDeUsuarioPage.botaoCriar();
    }

    @Dado("o usuario selecionar a prancha")
    public void o_usuario_selecionar_a_prancha() {
        page.selecionarPrancha();
    }
    @Quando("o ususario confirmar a exclusao")
    public void o_ususario_confirmar_a_exclusao() {
     page.confirmarApagar();
     screenshot();
    }

    @Quando("o usuario clicar no botao {string} da prancha")
    public void o_usuario_clicar_no_botao_da_prancha(String botao) {
        page.selecionarApagarPrancha(botao);
    }


    @Quando("o ususario clicar no botao  {string}")
    public void oUsusarioClicarNoBotao(String string) {
      page.clicarbotaoExporta();
    }
    @Entao("o sistema envia um arquivo para pagina de download do computador do usuario")
    public void oSistemaEnviaUmArquivoParaPaginaDeDownloadDoComputadorDoUsuario() {
        System.out.println(page.retornarPranchaBaixada());
    }
}


