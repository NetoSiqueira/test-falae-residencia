package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class CriarPranchaPage extends BasePage {
    private final By botaoCriarPrancha = By.xpath("//a[@class='button-box']/i[@class='fa fa-plus-circle']");
    private final By botaoExportarPrancha = By.xpath("//a[@class='button-box']/i[@class='fa fa-upload']");
    private final By botaoEditarPrancha = By.xpath("//a[@class='button-box']/i[@class='fa fa-edit']");
    private final By botaoCriaPagina = By.xpath("//a[@class='button-box']/i[@class='fa fa-plus-circle']");
    private final By botaoApagarPagina = By.xpath("//a[@class='button-box destroy']/i[@class='fa fa-trash-o']");

    private final By nomePrancha = By.id("spreadsheet_name");

    private final By MsgSucessPrancha = By.id("notice");

    public void criarPrancha(String escolha){
        if (escolha.equals("Criar Prancha"))
            clicar(botaoCriarPrancha);
        else if (escolha.equals("Editar")) {
            waitElementVisible(botaoEditarPrancha, 2);
            clicar(botaoEditarPrancha);
        }
        else if(escolha.equals("Criar Página")){
            waitElementVisible(botaoCriaPagina, 2);
            clicar(botaoCriaPagina);
        } else if(escolha.equals("Apagar")){
            waitElementVisible(botaoApagarPagina, 2);
            clicar(botaoApagarPagina);

        } else{
            waitElementVisible(botaoExportarPrancha, 2);
            clicar(botaoExportarPrancha);
        }
    }

    public void escreverNomePrancha(String nome){
        waitElementVisible(nomePrancha, 2);
        escreve(nomePrancha, nome);
    }

    public String msgSucessoPrancha(){
        return obterValorPorTexto(MsgSucessPrancha);
    }

}
