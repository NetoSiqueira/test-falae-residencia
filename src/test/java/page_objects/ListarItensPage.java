package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class ListarItensPage extends BasePage {

    private final By textoFiltro = By.id("name");
    private final By botaoFiltro = By.id("item-search-results");

    private final By botaoFiltar = By.xpath("//button[@class='button-box']");

    public String escreverTextoFiltro(String texto){
        waitElementVisible(textoFiltro, 2);
        escreve(textoFiltro, texto);
        return texto;
    }

    public void clicarBotaoFiltar(){
        clicar(botaoFiltar);
    }

    public String retornaTexto(){

        return posicaoTexto(obterValorPorTexto(botaoFiltro),"\n",1) ;
    }
}
