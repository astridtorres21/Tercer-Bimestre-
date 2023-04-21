import java.util.List;
import java.util.ArrayList;

public class Pizzeria {
    private String nombre;
    private List<Pizza> pizzas;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        this.pizzas.add(pizza);
    }

    public List<String> mostrarPizzas(){
        List<String> resultado = new ArrayList<>();
        for (Pizza pizza:pizzas) {
            resultado.add(pizza.toString());
        }
    return resultado;
    }


}
