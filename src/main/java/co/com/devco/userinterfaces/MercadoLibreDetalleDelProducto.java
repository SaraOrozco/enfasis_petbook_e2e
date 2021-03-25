package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MercadoLibreDetalleDelProducto {
    public static final Target DETALLE_PRODUCTO_RESULTADO = Target.the("detalle del producto de los resultados").located(By.xpath("//h2[text()='Descripción']"));
}
