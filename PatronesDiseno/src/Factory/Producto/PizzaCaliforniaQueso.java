package Factory.Producto;

import Factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California queso";
        masa = "Masa a la Piedra delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra queso Mozzarella");
        ingredientes.add("cebolla");
        ingredientes.add("quezo Azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 35 min a 100C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");
    }
}
