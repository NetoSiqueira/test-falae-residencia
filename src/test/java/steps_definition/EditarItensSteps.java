package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import page_objects.EditarItensPage;

public class EditarItensSteps  extends BaseSteps {
    private EditarItensPage page = new EditarItensPage();

    @Dado("o usuario clicar na imagem")
    public void o_usuario_clicar_na_imagem() {
      page.clicarImagem();
    }
    @Quando("o usuario não preencher o campo nome do editar item")
    public void o_usuario_não_preencher_o_campo_nome_do_editar_item() {
       page.editarNomeItem("");
    }
    @Quando("o usuario incluir uma imagem")
    public void o_usuario_incluir_uma_imagem() {

    }

    @Quando("o usuario não preencher o campo pronuncia")
    public void o_usuario_não_preencher_o_campo_pronuncia() {
      page.editarPronuncia("");
    }
}
