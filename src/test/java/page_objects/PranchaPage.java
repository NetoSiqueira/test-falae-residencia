package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class PranchaPage extends BasePage {

    private final By primeiraPrancha = By.cssSelector("div.list > ul > li:nth-child(1) > a");
    private final By segundaPrancha = By.cssSelector("div.list > ul > li:nth-child(2) > a");
    private final By nomePrancha = By.cssSelector("div > div.view > div > p:nth-child(6)");

    private final By botaoExportar = By.cssSelector("div.actions > button");


    public void selecionarPrancha(){
        clicar(primeiraPrancha);
    }
    public void selecionaSegPrancha(){
        clicar(segundaPrancha);
    }

    public void confirmarApagar(){
        clicarAlerta();
    }

    public void selecionarApagarPrancha(String texto){
        waitElementVisible(By.linkText(texto),2);
        clicar(By.linkText(texto));
    }


    public String retornarPranchaBaixada(){
        return retornarArquivo(posicaoTexto(obterValorPorTexto(nomePrancha)," ", 1),"prancha");
    }

    public void clicarbotaoExporta(){
        waitElementVisible(botaoExportar, 2);
        clicar(botaoExportar);
    }
}
