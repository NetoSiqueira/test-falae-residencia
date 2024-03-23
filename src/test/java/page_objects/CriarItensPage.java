package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class CriarItensPage extends BasePage {

    private final By nomeItem = By.id("item_name");
    private final By pronunciaItem = By.id("item_speech");
    private final By retornoAoCancelarItem = By.cssSelector("li.menu-item.active > a");

    public void escreverNomeItem(String nome){
        waitElementVisible(nomeItem, 2);
        escreve(nomeItem, nome);
    }

    public void escreverPronunciaItem(String pronuncia){
        escreve(pronunciaItem, pronuncia);
    }

    public String retornoCancelarItem(){
        return obterValorPorTexto(retornoAoCancelarItem);
    }

}
