public class CargaFactory {
    private static CargaFactory instance;

    private CargaFactory() {
    }

    public static CargaFactory getInstance() {
        if (instance == null) {
            instance = new CargaFactory();
        }
        return instance;
    }

    public Carga crearCarga(String codigo) {
        switch (codigo) {
            case "CargaSimple":
                return new CargaSimple("TV32", "BuenTV", 3.0, false);
            case "CargaSimple2":
                return new CargaSimple("Medicamentos", "cajaDeMedicamentos", 2.0, true);
            case "contenedor":
                CargaContenedor cargacontenedor = new CargaContenedor("Contenedor", "dos cargas simples anteriores y el peso del contenedor", 100.0);
                cargacontenedor.agregarCarga(crearCarga("CargaSimple"));
                cargacontenedor.agregarCarga(crearCarga("CargaSimple2"));
                return cargacontenedor;
        }
        return null;
    }
}

