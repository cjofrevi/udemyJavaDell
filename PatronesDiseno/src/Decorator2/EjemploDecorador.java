package Decorator2;

import Decorator2.Decorador.conChocolateDecorador;
import Decorator2.Decorador.conCremaDecorador;
import Decorator2.Decorador.conLecheDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {

        Configurable cafe = new Cafe("cafe mocka", 10);
        conCremaDecorador conCrema = new conCremaDecorador(cafe);
        conLecheDecorador conLeche = new conLecheDecorador(conCrema);
        conChocolateDecorador conChocolate = new conChocolateDecorador(conLeche);

        System.out.println("el precio del cafe mocka es "+conChocolate.getPrecioBase());
        System.out.println("Los ingredientes: "+ conChocolate.getIngredientes());

        Configurable capuchino = new Cafe("Cafe Capuchino", 4);
        conCrema = new conCremaDecorador(capuchino);
        conLeche = new conLecheDecorador(conCrema);
        System.out.println("El precio del cafe capuchino: "+ conLeche.getPrecioBase());
        System.out.println("Los ingredientes: "+conLeche.getIngredientes());
    }
}
