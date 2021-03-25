package co.com.udem.stepdefinitions;

import co.com.udem.questions.DescripcionDetalladaDel;
import co.com.udem.tasks.BuscarEnMercadoLibre;
import co.com.udem.tasks.SeleccionarDelResultado;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BusquedaMercadoLibreStepDefinitions {

    @Cuando("el (.*) busca una (.*)$")
    public void CompradorBusca(String nombreActor, String producto) {
        theActorCalled(nombreActor).attemptsTo(
                BuscarEnMercadoLibre.elProducto(producto)
        );


    }

    @Entonces("debe encontrar al menos un producto y podra ver su descripcion detallada")
    public void debeEncontrarAlMenosUnProductoYPodraVerSuDescripcionDetallada() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarDelResultado.primerElemento()
        );
        theActorInTheSpotlight().should(seeThat(
                DescripcionDetalladaDel.resultado()));
    }




}
