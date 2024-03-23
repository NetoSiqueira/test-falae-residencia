package page_objects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class EditarItensPage extends BasePage {
    private final By selecionarImagem = By.xpath("//div[@class='items-list-item other']/a");
    private final By cliquedaImagem = By.xpath("//div/a/div/i[@class='fa fa-external-link']");
    private final By nomeItem = By.id("item_name");
    private final By pronuncia = By.id("item_speech");

    public void clicarImagem(){
        waitElementVisible(selecionarImagem,2);
        passarMouse(selecionarImagem);
        clicar(cliquedaImagem);
    }

    public void editarNomeItem(String nome){
        waitElementVisible(nomeItem, 2);
        escreve(nomeItem, nome);
    }

    public void editarPronuncia(String pron){
        escreve(pronuncia, pron);
    }
}
