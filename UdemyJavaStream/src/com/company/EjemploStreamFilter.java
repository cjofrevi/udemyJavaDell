package com.company;

import com.company.Modelo.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilter {

    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Nino Felino", "Chibo Lito", "Gordo Lechon", "Gatoberto Muerto", "Esteban Dido", "Gatoberto vivo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
//                .peek(u -> System.out.println(u.getNombre()))
                .filter(u -> u.getNombre().equals("Gatobertorr"))
                .peek(u -> System.out.println(u.getApellido()));


//        nombres.forEach(System.out::println);
        Optional<Usuario> usuario = nombres.findFirst();
//        System.out.println(usuario.orElse(new Usuario("algo", "ritmo")).getNombre());
//        System.out.println(usuario.orElseGet(() -> new Usuario("algo", "ritmo")).getNombre());
//        System.out.println(usuario.orElseThrow());
//        System.out.println(usuario.orElse(null));
//        System.out.println(usuario.get());
        if(usuario.isPresent()){
            System.out.println(usuario.get().getNombre());
        }else{
            System.out.println("no se encontro");
        }
    }
}
