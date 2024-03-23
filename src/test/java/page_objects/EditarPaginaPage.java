package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class EditarPaginaPage extends BasePage {
    private final By primeiraPagina = By.linkText("teste5");

    private final By nomePagina = By.id("page_name");


    public void selecionarPagina(){
        waitElementVisible(primeiraPagina, 2);
        clicar(primeiraPagina);

    }


    public void escreverPaginaEditar(String nome){
        waitElementVisible(nomePagina,2);
        escreve(nomePagina,nome);
    }



}
