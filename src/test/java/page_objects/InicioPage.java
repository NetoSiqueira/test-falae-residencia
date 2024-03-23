package page_objects;

import base.BasePage;

public class InicioPage extends BasePage {
    private String urlDev ="http://localhost:3000/about";
    private String urlProd = "https://www.falaeapp.org/about";
    private String urlAWS = "http://34.203.52.95/login";

    public void abrirNavegador(){
        getDriver().get(urlAWS);
    }


}
