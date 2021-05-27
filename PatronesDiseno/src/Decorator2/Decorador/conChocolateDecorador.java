package Decorator2.Decorador;

import Decorator2.Configurable;

public class conChocolateDecorador extends CafeDecorador{

    public conChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() +", Chocolate.";
    }
}
