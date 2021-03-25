package co.com.udem.questions;

import co.com.udem.userinterfaces.MercadoLibreDetalleDelProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DescripcionDetalladaDel implements Question<Boolean> {


    public DescripcionDetalladaDel(){

    }

    public static DescripcionDetalladaDel resultado() {
        return new DescripcionDetalladaDel();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return MercadoLibreDetalleDelProducto.DETALLE_PRODUCTO_RESULTADO.resolveFor(actor).isVisible();
    }
}
