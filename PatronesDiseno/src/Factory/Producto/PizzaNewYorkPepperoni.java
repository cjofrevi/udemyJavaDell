package Factory.Producto;

import Factory.PizzaProducto;

import java.util.List;

public class PizzaNewYorkPepperoni extends PizzaProducto {
    public PizzaNewYorkPepperoni() {
        super();
        nombre = "Pizz Pepperoni New york";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("extra pepperoni");
        ingredientes.add("Aceitunas");
    }


    @Override
    public void cocinar() {
        System.out.println("cocinando por 40 min. a 90C");

    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en triangulos.");
    }
}
