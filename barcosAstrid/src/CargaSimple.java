public class CargaSimple extends Carga{
    private Double pesoCarga;
    private Boolean refrigeracion;

    public CargaSimple(String nombre, String descripcion, Double pesoCarga, Boolean refrigeracion) {
        super(nombre, descripcion);
        this.pesoCarga = pesoCarga;
        this.refrigeracion = refrigeracion;
    }

    @Override
    public Double calcularPeso() {
        if (refrigeracion == true){
            return pesoCarga        + 2.0;
        } else {
            return pesoCarga;
        }
    }
}
