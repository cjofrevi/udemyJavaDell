package Factory.Ejemplo;

import Factory.PizzaProducto;
import Factory.PizzeriaCaliforniaFactory;
import Factory.PizzeriaNewYorkFactory;
import Factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory cali = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza =cali.ordenarPizza("queso");
        System.out.println(" nino ordena la pizza "+ pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("chibo ordena la pizza "+pizza.getNombre());

        pizza = cali.ordenarPizza("vegetariana");
        System.out.println("chibo ordena la pizza "+pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("nino ordena la pizza " + pizza.getNombre());

        pizza = cali.ordenarPizza("pepperoni");
        System.out.println("gorda ordena la pizza "+pizza.getNombre());
        System.out.println(pizza);
    }
}
