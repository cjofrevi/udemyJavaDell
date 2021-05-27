package Factory.Producto;


import Factory.PizzaProducto;
import Factory.PizzeriaZonaAbstractFactory;

import java.util.List;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "pizza vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("espinacas");
        ingredientes.add("Berenjenas");

    }

    @Override
    public void cocinar() {
        System.out.println("cocinando por 25 min. a 150 C. ");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en rebanadas cuadradas..");
    }
}
