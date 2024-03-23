package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class VisualizarItemPage extends BasePage {

    private final By MsgSucessoApagarItem = By.id("notice");
    private final By visualizacaoPdf = By.id("sizer");

    public String msgSucessoItemApagado(){
        return obterValorPorTexto(MsgSucessoApagarItem);
    }

//    public boolean verificarOPdf(){
//        waitElementVisible(visualizacaoPdf, 2);
//        return obterValorExistente(obterValorPorTexto(visualizacaoPdf));
//    }

}
