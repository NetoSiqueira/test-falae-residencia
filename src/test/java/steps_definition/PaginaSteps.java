package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import page_objects.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PaginaSteps extends BaseSteps {

    private PranchaPage pagePrancha = new PranchaPage();
    private PaginaPage page = new PaginaPage();



    @Dado("o usuario clicar na prancha indicada")
    public void o_usuario_clicar_na_prancha_indicada() {
        pagePrancha.selecionaSegPrancha();
    }

    @Quando("o usuario clicar em confirmar")
    public void o_usuario_clicar_em_confirmar() {
        page.clicarApagar();
    }

}
