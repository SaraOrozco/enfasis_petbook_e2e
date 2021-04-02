package co.com.udem.stepdefinitions;

import co.com.udem.questions.CantidadDeImagenesFiltro;
import co.com.udem.tasks.FiltrarEnPetBook;
import co.com.udem.tasks.SeleccionarImagenMascota;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltrarPetBookStepDefinitions {


    ///////////////////////////////////////////////////////////////////////////////

    @Cuando("el (.*) filtra por (.*)$")
    public void elVisitanteDeLaPaginaFiltra(String actor,String filtro) {
        theActorCalled(actor).attemptsTo(
                FiltrarEnPetBook.filtro(filtro)
        );
    }

    @Entonces("debe mostrar unicamente fotos de (.*)$")
    public void debeMostrarUnicamenteFotos(String filtro) {
       theActorInTheSpotlight().should(seeThat(
               CantidadDeImagenesFiltro.imagenesFiltradas(filtro)
       ));

       theActorInTheSpotlight().attemptsTo(
               SeleccionarImagenMascota.primerElemento()
       );
    }



}
