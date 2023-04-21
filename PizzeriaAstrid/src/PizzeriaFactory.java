import java.util.List;
import java.util.ArrayList;

public class PizzeriaFactory {
    private static PizzeriaFactory instance;
    public static final String PIZZA_SIMPLE = "PS";
    public static final String PIZZA_COMBINADA = "PC";

    
    private PizzeriaFactory() {
    }

    public static PizzeriaFactory getInstance() {
        if (instance == null){
            instance = new PizzeriaFactory();
        }
        return instance;
    }

    public Pizza pizzaFactory(String code, String nombre, String descipcion){
        switch (code){
            case PIZZA_SIMPLE:
                return new PizzaSimple(nombre,descipcion);
            case PIZZA_COMBINADA:
                return new PizzaCombinada(nombre,descipcion);
        }
        return null;
    }
    
    
    
}
