package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import page_objects.EditarPaginaPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EditarPaginaSteps extends BaseSteps {

    private EditarPaginaPage page = new EditarPaginaPage();

    @Dado("o usuario clicar na pagina")
    public void o_usuario_clicar_na_pagina() {
      page.selecionarPagina();
    }

    @Quando("o usuario preencher o campo nome do editar pagina")
    public void o_usuario_preencher_o_campo_nome_do_editar_pagina() {
        page.escreverPaginaEditar("teste5");
    }

    @Quando("o usuario nao preencher o  campo nome do editar pagina")
    public void o_usuario_nao_preencher_o_campo_nome_do_editar_pagina() {
       page.escreverPaginaEditar(" ");
    }

}
