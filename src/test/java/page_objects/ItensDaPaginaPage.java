package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class ItensDaPaginaPage extends BasePage {
    private final By adicionarItem = By.xpath("//button[@class='items-list-item add-button']");
    private final By nomeItem = By.id("item_name");
    private final By procurarItem = By.cssSelector("#search-items > div.actions > button");
    private final By adicionarAPagina = By.xpath("//input[@value='Adicionar a página']");
    private final By msgErroItem = By.xpath("//p[@class='no-items-found']");
    private final By mouseItem = By.xpath("//div[@class='items-list-item-menu']");
    private final By editarItem = By.xpath("//div[@class='items-list-item-menu']/nav/a[@class='edit']");
    private final By removerItem = By.xpath("//div[@class='items-list-item-menu']/nav/a[@class='remove']");
    private final By pronunciaItem = By.id("item_speech");
    private final By botaoItem = By.cssSelector("div.actions > button");



    public void clicarAdicionar(){
        waitElementVisible(adicionarItem, 2);
        clicar(adicionarItem);
    }

    public void escreverNomeItem(String nome){
        waitElementVisible(nomeItem,2);
        escreve(nomeItem, nome);
    }
    public void escreverPronuncia(String pronuncia){
        escreve(pronunciaItem, pronuncia);
    }

    public void clicarProcurarItem(){
        waitElementVisible(procurarItem,2);
        clicar(procurarItem);
    }

    public void clicarAdicionarAPagina(){
        waitElementVisible(adicionarAPagina,4);
        clicar(adicionarAPagina);
    }


    public String retornarMsgDeItem(){
        waitElementVisible(msgErroItem,2);
        return obterValorPorTexto(msgErroItem);
    }
    public void clicarImagemItem(String escolha){
        waitElementVisible(mouseItem,2);
        passarMouse(mouseItem);
        if (escolha.equals("Editar")){
            clicar(editarItem);
            clicarAlerta();
        }else {
            clicar(removerItem);
            clicarAlerta();
        }
    }

    public void itemBotao(){
        clicar(botaoItem);
    }

}
