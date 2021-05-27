package Factory.Producto;

import Factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza California Vegetariana";
        masa = "masa delgada light";
        salsa = "Salsa BBQ light";
        ingredientes.add("queso Mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("cebolla");
        ingredientes.add("berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 180C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}
