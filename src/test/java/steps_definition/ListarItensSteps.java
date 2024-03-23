package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import page_objects.ListarItensPage;

public class ListarItensSteps extends BaseSteps {
    private ListarItensPage page = new ListarItensPage();
    private String teste;

    @Dado("o usuario preencher o campo filtro")
    public void o_usuario_preencher_o_campo_filtro() {
      teste = page.escreverTextoFiltro("teste");
       screenshot();
    }

    @Dado("o usuario clicar no botao  {string}")
    public void o_usuario_clicar_no_botao(String string) {
        page.clicarBotaoFiltar();
    }

    @Entao("o sistema vai buscar o nome dos itens que tenha o texto escrito")
    public void o_sistema_vai_buscar_o_nome_dos_itens_que_tenha_o_texto_escrito() {
        Assert.assertEquals("Nome: "+teste, page.retornaTexto());
        screenshot();
    }

    @Dado("o usuario preencher o campo filtro com caracteres especiais")
    public void o_usuario_preencher_o_campo_filtro_com_caracteres_especiais() {
      teste = page.escreverTextoFiltro("%");
       screenshot();
    }

    @Dado("o usuario preencher o campo filtro com nome incompleto")
    public void o_usuario_preencher_o_campo_filtro_com_nome_incompleto() {
        teste = page.escreverTextoFiltro("tes");
        screenshot();
    }
}
