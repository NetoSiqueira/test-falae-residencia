package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Dado;
import page_objects.InicioPage;

public class InicioSteps extends BaseSteps {
    private InicioPage page = new InicioPage();

    @Dado("que o usuario esteja na pagina sobre do site FALAE")
    public void que_o_usuario_esteja_na_pagina_sobre_do_site_falae() throws InterruptedException {
        page.abrirNavegador();
        screenshot();
    }

}
