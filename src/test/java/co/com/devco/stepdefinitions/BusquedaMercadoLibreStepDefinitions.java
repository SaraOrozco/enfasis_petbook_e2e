package co.com.devco.stepdefinitions;

import co.com.devco.questions.DescripcionDetalladaDel;
import co.com.devco.tasks.BuscarEnMercadoLibre;
import co.com.devco.tasks.SeleccionarDelResultado;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.MercadoLibreResultadosPage.PRIMER_RESULTADO;
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
