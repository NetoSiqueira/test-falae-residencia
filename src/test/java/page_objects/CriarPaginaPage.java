package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class CriarPaginaPage extends BasePage {

    private final By nomePagina = By.id("page_name");
    private final By colunaPagina = By.id("page_columns");

    private final By linhaPagina = By.id("page_rows");


    public void escreverPagina(String nome){
        waitElementVisible(nomePagina, 2);
        escreve(nomePagina, nome);
    }

    public void escreverColunaPagina(String coluna){
        escreve(colunaPagina, coluna);
    }

    public void escreverLinhaPagina(String linha){
        escreve(linhaPagina, linha);
    }

}
