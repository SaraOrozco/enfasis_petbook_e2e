package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.devco.userinterfaces.MercadoLibreDetalleDelProducto.DETALLE_PRODUCTO_RESULTADO;

public class DescripcionDetalladaDel implements Question<Boolean> {


    public DescripcionDetalladaDel(){

    }

    public static DescripcionDetalladaDel resultado() {
        return new DescripcionDetalladaDel();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return DETALLE_PRODUCTO_RESULTADO.resolveFor(actor).isVisible();
    }
}
