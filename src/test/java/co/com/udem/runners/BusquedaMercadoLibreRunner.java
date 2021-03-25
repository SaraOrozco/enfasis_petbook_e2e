package co.com.udem.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/mercado_libre_busquedas.feature",
		glue = {"co.com.udem.stepdefinitions"},
		snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BusquedaMercadoLibreRunner {

}
