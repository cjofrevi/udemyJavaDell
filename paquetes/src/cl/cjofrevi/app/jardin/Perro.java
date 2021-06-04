package cl.cjofrevi.app.jardin;

import cl.cjofrevi.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

}
