package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Quando;
import page_objects.EditarPranchaPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EditarPranchaSteps extends BaseSteps {

    private String aleatorio = (new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss")).format(new Date());
    private EditarPranchaPage page = new EditarPranchaPage();

    @Quando("o usuario preencher o campo nome do editar prancha")
    public void o_usuario_preencher_o_campo_nome_do_editar_prancha() {
        page.escreverNomeDaPrancha("nomeEditado"+aleatorio);
    }

    @Quando("o usuario nao preencher o campo nome do editar prancha")
    public void o_usuario_nao_preencher_o_campo_nome_do_editar_prancha() {
        page.escreverNomeDaPrancha("");
    }
    @Quando("o usuario selecionar outra pagina inicial")
    public void o_usuario_selecionar_outra_pagina_inicial() {
         page.selecionarOutraPaginaInicial();
    }
}
