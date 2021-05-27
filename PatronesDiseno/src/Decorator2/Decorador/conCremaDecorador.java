package Decorator2.Decorador;

import Decorator2.Configurable;

public class conCremaDecorador extends CafeDecorador{

    public conCremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase()+ 2.5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+", Crema";
    }
}
