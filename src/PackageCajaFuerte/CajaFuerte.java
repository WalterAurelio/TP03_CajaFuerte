package PackageCajaFuerte;

// import java.util.Scanner;

public class CajaFuerte {
    private Boolean estaAbierta = Boolean.TRUE;
    private Integer codigoCierre = 1234;
    private Integer codigoApertura;
    private Integer contadorCierre = 1;
    private Integer contadorApertura = 1;

    public Boolean estaLaPuertaAbierta() {
        return estaAbierta;
    }

    protected Integer codigoDeCierre() {
        return codigoCierre;
    }

    protected Integer codigoDeApertura() {
        return codigoApertura;
    }

    public void cerrarConCodigo(Integer unaClave) {
        if (unaClave.equals(codigoCierre)) {
            this.estaAbierta = Boolean.FALSE;
            contadorCierre = 0;
        }
    }

    public void abrirConCodigo(Integer unaClave) {
        if (unaClave.equals(codigoApertura)) {
            this.estaAbierta = Boolean.TRUE;
            contadorApertura = 0;
        }
    }

    public void configurarCodigoDeApertura(Integer unaClave) {
        this.codigoApertura = unaClave;
    }

    public void configurarCodigoDeCierre(Integer unaClave) {
        this.codigoCierre = unaClave;
    }

    /* public void solicitarNuevoCodigoApertura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una nueva contraseña: ");
        codigoApertura = scanner.nextInt();
    } */

    /* public void cerrar2(Integer unaClave) {
        if (contadorCierre == 1) {
            cerrarConCodigo(1234);
        }
        else {
            cerrarConCodigo(unaClave);
        }
    } */
}
