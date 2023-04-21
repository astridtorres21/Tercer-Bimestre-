import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Pizzeria pizzeriaLoca = new Pizzeria("Pizza Loca");
        Pizza pizzaMuzza = PizzeriaFactory.getInstance().pizzaFactory(PizzeriaFactory.PIZZA_SIMPLE, "Muzzarella", "Pizza de Muzzarella");
        Pizza pizzaMargarita = PizzeriaFactory.getInstance().pizzaFactory(PizzeriaFactory.PIZZA_SIMPLE, "Margarita Especial", "Pizza Margarita Especial");
        Pizza pizzaAnana = PizzeriaFactory.getInstance().pizzaFactory(PizzeriaFactory.PIZZA_SIMPLE, "Anana", "Pizza de Anana");
        Pizza pizzaLoca = PizzeriaFactory.getInstance().pizzaFactory(PizzeriaFactory.PIZZA_COMBINADA, "Combinada Loca", "Pizza mitad pizzaMargarita y mitad Anana");

        ((PizzaSimple)pizzaMuzza).setCostoBase(700);
        ((PizzaSimple)pizzaMuzza).setEsEspecial(false);
        ((PizzaSimple)pizzaMargarita).setCostoBase(850);
        ((PizzaSimple)pizzaMargarita).setEsEspecial(true);
        ((PizzaSimple)pizzaAnana).setCostoBase(950);

        ((PizzaCombinada)pizzaLoca).agregarPizza(pizzaMargarita);
        ((PizzaCombinada)pizzaLoca).agregarPizza(pizzaAnana);

        pizzeriaLoca.agregarPizza(pizzaMuzza);
        pizzeriaLoca.agregarPizza(pizzaMargarita);
        pizzeriaLoca.agregarPizza(pizzaAnana);
        pizzeriaLoca.agregarPizza(pizzaLoca);


        for (String descipcionPizza: pizzeriaLoca.mostrarPizzas()) {
            System.out.println(descipcionPizza.toString());
        }
    }
}