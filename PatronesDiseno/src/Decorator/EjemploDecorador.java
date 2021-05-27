package Decorator;

import Decorator.decorador.MayusculaDecorador;
import Decorator.decorador.ReemplazarEspacioDecorador;
import Decorator.decorador.ReversaDecorador;
import Decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("hola nino el felino!");
//        System.out.println(texto.darFormato());

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        ReemplazarEspacioDecorador reemplzar = new ReemplazarEspacioDecorador(subrayar);


        System.out.println(reemplzar.darFormato());

    }
}
