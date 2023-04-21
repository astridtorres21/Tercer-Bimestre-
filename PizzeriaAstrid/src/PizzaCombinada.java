import java.util.List;
import java.util.ArrayList;

public class PizzaCombinada implements Pizza {
    private String nombre,descipcion;
    private List<Pizza> combinaciones;

    public PizzaCombinada(String nombre, String descipcion) {
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.combinaciones = new ArrayList<>();
    }
    public void agregarPizza(Pizza pizza){
        this.combinaciones.add(pizza);
    }

    @Override
    public Double costo() {
       double costoTotal = 0;
       for(Pizza pizza:combinaciones){
           if(pizza.costo() > costoTotal){
               costoTotal = pizza.costo();
           }
       }return costoTotal;
    }

    @Override
    public String toString() {
        return "PizzaCombinada{" +
                "nombre='" + nombre + '\'' +
                ", descipcion='" + descipcion + '\'' +
                ", costo=" + costo() +
                '}';
    }
}
