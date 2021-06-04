package cl.cjofrevi.app.jardin;

import cl.cjofrevi.app.hogar.*;
import static cl.cjofrevi.app.hogar.Persona.*;



public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("chibo");
        System.out.println(p.getNombre());
//        Gato g = new Gato();
        Perro perro = new Perro();

        perro.nombre = "perroberto";
        perro.raza = "quiltro";

        String jugando = perro.jugar(p);
        System.out.println(jugando);

        String saludo = saludar();

        System.out.println("saludo = " + saludo);

        String generom = GENERO_MASCULINO;
        System.out.println("generom = " + generom);

    }




}
