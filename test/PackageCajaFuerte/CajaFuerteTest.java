package PackageCajaFuerte;

import org.junit.Assert;
import org.junit.Test;

public class CajaFuerteTest {

    private CajaFuerte unaCajaFuerte() {
        return new CajaFuerte();
    }

    @Test
    public void pruebaJunit() {}

    /* @Test
    public void alCrearUnaCajaFuerteLaPuertaEstaAbierta() {
        // Preparacion
        CajaFuerte caja1 = new CajaFuerte();
        Boolean valorEsperado = Boolean.TRUE;
        Boolean valorObtenido;

        // Ejecucion
        valorObtenido = caja1.estaLaPuertaAbierta();

        // Contrastacion
        Assert.assertEquals(valorEsperado, valorObtenido);
    } */

    /* @Test
    public void alCrearUnaCajaFuerteSeCreaConElCodigoDeCierre1234() {
        // Preparacion
        CajaFuerte caja2 = unaCajaFuerte();
        Integer valorEsperado = 1234;
        Integer valorObtenido;
        
        // Ejecucion
        valorObtenido = caja2.codigoDeCierre();

        // Contrastacion
        Assert.assertEquals(valorEsperado, valorObtenido);
    } */

    @Test
    public void alCerrarCajaFuerteRecienCreadaEIngresarCodigoDeCierre1234PermaneceCerrada() {
        // Preparacion
        CajaFuerte caja3 = unaCajaFuerte();
        Boolean valorEsperado = Boolean.TRUE;
        Boolean valorObtenido;

        // Ejecucion
        caja3.cerrar(1234);
        valorObtenido = caja3.estaLaPuertaAbierta();

        // Contrastacion
        Assert.assertEquals(valorEsperado, valorObtenido);
    }
}
