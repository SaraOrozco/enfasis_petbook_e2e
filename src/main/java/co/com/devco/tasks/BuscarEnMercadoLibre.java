package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.devco.userinterfaces.MercadoLibreHomePage.MERCADO_LIBRE_HOME_PAGE;
import static co.com.devco.userinterfaces.MercadoLibreResultadosPage.RESULTADOS_BUSQUEDA;
import static co.com.devco.userinterfaces.MercadoLibreHomePage.CAMPO_BUSQUEDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.openqa.selenium.Keys.ENTER;

public class BuscarEnMercadoLibre implements Task {
    private String producto;

    public BuscarEnMercadoLibre(String producto) {
        this.producto = producto;
    }

    public static Performable elProducto(String producto) {
        return instrumented(BuscarEnMercadoLibre.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(MERCADO_LIBRE_HOME_PAGE),
                Enter.theValue(producto).into(CAMPO_BUSQUEDA).thenHit(ENTER),
                WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible())
        );
    }
}
