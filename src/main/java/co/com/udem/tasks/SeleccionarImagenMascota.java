package co.com.udem.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udem.userinterfaces.PetBookHomePage.PRIMER_ELEMENTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarImagenMascota implements Task {


    public SeleccionarImagenMascota() {

    }

    public static Performable primerElemento() {
        return instrumented(SeleccionarImagenMascota.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRIMER_ELEMENTO)
        );
    }
}
