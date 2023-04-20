import java.util.ArrayList;
import java.util.List;

public class CargaContenedor extends Carga{
    private Double pesoContenedor;
    private List<Carga>cargaList;

    public CargaContenedor(String nombre, String descripcion, Double pesoContenedor) {
        super(nombre, descripcion);
        this.pesoContenedor = pesoContenedor;
        cargaList = new ArrayList<>();
    }
    public void agregarCarga (Carga carga){
        cargaList.add(carga);
    }
    @Override
    public Double calcularPeso() {
        Double pesoContenedorTotal=0.0;
        for (Carga carga : cargaList) {
            pesoContenedorTotal += carga.calcularPeso();
        }
        return pesoContenedorTotal + pesoContenedor;
    }


    public Double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(Double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }
}
