package co.com.udem.tasks;


import co.com.udem.userinterfaces.PetBookHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.text.MessageFormat;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FiltrarEnPetBook implements Task {
    private final String filtro;

    public FiltrarEnPetBook(String filtro) {
        this.filtro = filtro;
    }

    public static Performable filtro(String filtro) {
        return instrumented(FiltrarEnPetBook.class, filtro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String xPath = "//button[.=\"{0}\"]";
        MessageFormat mf = new MessageFormat(xPath);
        xPath = mf.format(new String[]{this.filtro});
        Target boton = Target.the("Botón de filtro").located(By.xpath(xPath));
        actor.attemptsTo(
                Open.url(PetBookHomePage.PETBOOK_HOME_PAGE),
                Click.on(boton)

        );
    }
}
