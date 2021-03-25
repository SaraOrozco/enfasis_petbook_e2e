package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MercadoLibreHomePage {
	public static final String MERCADO_LIBRE_HOME_PAGE = "https://www.mercadolibre.com.co/";
	public static final Target CAMPO_BUSQUEDA = Target.the("Campo de busqueda principal").located(By.xpath("//form[@role='search']/input"));
}
