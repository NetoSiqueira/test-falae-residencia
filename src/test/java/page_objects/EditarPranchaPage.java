package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class EditarPranchaPage extends BasePage {

    private final By campoNome = By.cssSelector("#spreadsheet_name");
    private final By campoPaginaInicial = By.cssSelector("#spreadsheet_initial_page");
    private final By segundaOpcaoDaPaginaInicial = By.xpath("//*[@id=\"spreadsheet_initial_page\"]/option[2]");


    public void escreverNomeDaPrancha(String nomeEditado){
        waitElementVisible(campoNome, 2);
        escreve(campoNome, nomeEditado);
    }

    public void selecionarOutraPaginaInicial(){
        waitElementVisible(campoPaginaInicial,2);
        selecionarCombo(campoPaginaInicial, "teste1");
    }
}
