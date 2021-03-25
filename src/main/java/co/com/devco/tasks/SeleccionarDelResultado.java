package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.devco.userinterfaces.MercadoLibreResultadosPage.PRIMER_RESULTADO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDelResultado implements Task {


    public SeleccionarDelResultado() {

    }

    public static Performable primerElemento() {
        return instrumented(SeleccionarDelResultado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRIMER_RESULTADO)
        );
    }
}
