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
        CajaFuerte miCaja = new CajaFuerte();
        Boolean valorEsperado = Boolean.TRUE;
        Boolean valorObtenido;

        // Ejecucion
        valorObtenido = miCaja.estaLaPuertaAbierta();

        // Contrastacion
        Assert.assertEquals(valorEsperado, valorObtenido);
    } */

    /* @Test
    public void alCrearUnaCajaFuerteSeCreaConElCodigoDeCierre1234() {
        // Preparacion
        CajaFuerte miCaja = unaCajaFuerte();
        Integer valorEsperado = 1234;
        Integer valorObtenido;
        
        // Ejecucion
        valorObtenido = miCaja.codigoDeCierre();

        // Contrastacion
        Assert.assertEquals(valorEsperado, valorObtenido);
    } */

    /* @Test
    public void alCrearCajaFuerteYCerrarlaConCodigoDeCierreDefaultPermaneceCerrada() {
        // Preparacion
        CajaFuerte miCaja = unaCajaFuerte();
        Boolean valorEsperado = Boolean.FALSE;
        Boolean valorObtenido;
        
        // Ejecucion
        miCaja.cerrarConCodigo(1234);
        valorObtenido = miCaja.estaLaPuertaAbierta();

        // Contrastacion
        Assert.assertEquals(valorEsperado, valorObtenido);
    } */

    /* @Test
    public void alConfigurarUnCodigoDeAperturaEsteQuedaGuardado() {
        // Preparacion
        CajaFuerte miCaja = unaCajaFuerte();
        Integer valorEsperado = 3282;
        Integer valorObtenido;
        
        // Ejecucion
        miCaja.configurarCodigoDeApertura(3282);
        valorObtenido = miCaja.codigoDeApertura();

        // Contrastacion
        Assert.assertEquals(valorEsperado, valorObtenido);
    } */

    @Test
    public void alConfigurarUnCodigoDeCierreEsteQuedaGuardado() {
        // Preparacion
        CajaFuerte miCaja = unaCajaFuerte();
        Integer valorEsperado = 2494;
        Integer valorObtenido;
        
        // Ejecucion
        miCaja.configurarCodigoDeCierre(2494);
        valorObtenido = miCaja.codigoDeCierre();

        // Contrastacion
        Assert.assertEquals(valorEsperado, valorObtenido);
    }
}
