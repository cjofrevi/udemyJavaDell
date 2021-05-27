package Decorator.decorador;

import Decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador{

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
//        System.out.println("mayuscula");
        return texto.darFormato().toUpperCase();

    }
}
