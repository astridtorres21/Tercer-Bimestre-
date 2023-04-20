import java.util.ArrayList;
import java.util.List;

public class Barco {
    private String nombre;
    private List<Carga> cargaList;

    public Barco(String nombre) {
        this.nombre = nombre;
        cargaList = new ArrayList<>();
    }
    public void agregarCarga (Carga carga){cargaList.add(carga); }
    public void quitarCarga(Carga carga){cargaList.remove(carga); }

    public void mostrarCarga(){
        for (Carga carga    : cargaList) {
            System.out.println(carga);
        }
    }
}
