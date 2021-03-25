package co.com.udem.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MercadoLibreResultadosPage {
    public static final Target RESULTADOS_BUSQUEDA = Target.the("resultados de busqueda").located(By.xpath("//main[@id='root-app']//ol[@class='ui-search-layout ui-search-layout--stack']"));
    public static final Target PRIMER_RESULTADO = Target.the("Primer resultado de busqueda").located(By.xpath("//main[@id='root-app']//ol[@class='ui-search-layout ui-search-layout--stack']/li[1]//a[1]"));
}
