package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadosPage extends BasePage
{
    private By txtResultado	= By.id("result-stats");

    public ResultadosPage(WebDriver _browser)
    {
        super(_browser);
    }

    public String verResultadoPesquisa()
    {
        waitElementVisible(txtResultado, 5);
        String texto = browser.findElement(txtResultado).getText();
        String[] vetorTexto = texto.split(" ");
        return vetorTexto[0];
    }
}
