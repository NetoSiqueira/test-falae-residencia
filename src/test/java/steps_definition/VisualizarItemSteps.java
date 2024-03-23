package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import page_objects.VisualizarItemPage;

public class VisualizarItemSteps extends BaseSteps {

    private VisualizarItemPage page = new VisualizarItemPage();

    @Entao("o sistema exibe uma mensagem do item: {string}")
    public void o_sistema_exibe_uma_mensagem_do_item(String msg) {
        Assert.assertEquals(msg, page.msgSucessoItemApagado());
        screenshot();
    }

    @Entao("o sistema deve criar um pdf com a imagem")
    public void o_sistema_deve_criar_um_pdf_com_a_imagem() {

        screenshot();
    }
}
