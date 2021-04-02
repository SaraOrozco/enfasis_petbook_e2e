package co.com.udem.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;

public class CantidadDeImagenesFiltro implements Question<Boolean> {
    private final String filtro;

    public CantidadDeImagenesFiltro(String filtro){
        this.filtro = filtro;
    }

    public static CantidadDeImagenesFiltro imagenesFiltradas(String filtro) {
        return new CantidadDeImagenesFiltro(filtro);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = Serenity.getDriver();
        List<WebElement> imagenes = driver.findElements(By.tagName("li"));

        HashMap<String,Integer> valoresImagenes = new HashMap<String, Integer>();
        valoresImagenes.put("perro",3);
        valoresImagenes.put("gato",2);
        valoresImagenes.put("all",5);
        
        System.out.println("filtro "+this.filtro +": " +(valoresImagenes.get(this.filtro)== imagenes.size()));
        return (valoresImagenes.get(this.filtro).equals(imagenes.size()));

    }
}
