package co.com.udem.tasks;

import co.com.udem.userinterfaces.MercadoLibreHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.udem.userinterfaces.MercadoLibreResultadosPage.RESULTADOS_BUSQUEDA;
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
                Open.url(MercadoLibreHomePage.MERCADO_LIBRE_HOME_PAGE),
                Enter.theValue(producto).into(MercadoLibreHomePage.CAMPO_BUSQUEDA).thenHit(ENTER),
                WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible())
        );
    }
}
