public class Demo {
    public static void main(String[] args) {
       Barco barco = new Barco("carga");

       CargaFactory fabricaCarga= CargaFactory.getInstance();
        barco.agregarCarga(CargaFactory.getInstance().crearCarga("CargaSimple"));
        barco.agregarCarga(CargaFactory.getInstance().crearCarga("CargaSimple2"));
        barco.agregarCarga(CargaFactory.getInstance().crearCarga("contenedor"));

       barco.mostrarCarga();
    }
}
