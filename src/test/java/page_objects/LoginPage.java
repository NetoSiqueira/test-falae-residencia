package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By msgDeErro = By.cssSelector("div.flash.alert");
    private final By msgDeAtivacao = By.cssSelector("div.flash.warning");

    public boolean welcome(String welcome){
        return obterValorExistente(welcome);
    }

    public String msgDeErroLogin(){
        return obterValorPorTexto(msgDeErro);
    }

    public String msgDeAtivacaoLogin(){
        return obterValorPorTexto(msgDeAtivacao);
    }
}
