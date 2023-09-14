package PackageCajaFuerte;

public class CajaFuerte {
    private Boolean estaAbierta = Boolean.TRUE;
    private Integer codigoCierre = 1234;

    public Boolean estaLaPuertaAbierta() {
        return estaAbierta;
    }

    protected Integer codigoDeCierre() {
        return codigoCierre;
    }

    public void cerrar(Integer claveCierre) {
        if (claveCierre == codigoCierre) {
            estaAbierta = Boolean.FALSE;
        }
        else {
            System.out.println("Clave Incorrecta.");
        }
    }
}
