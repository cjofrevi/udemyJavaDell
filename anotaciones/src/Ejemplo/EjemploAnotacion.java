package Ejemplo;

import Ejemplo.Models.Producto;
import Ejemplo.Procesador.JsonSerializador;


import java.time.LocalDate;


public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setNombre("mesa madera PEQUEÑA forma GARFIELD");
        p.setFecha(LocalDate.now());
        p.setPrecio(1000L);

        System.out.println("json = "+ JsonSerializador.convertirJson(p));
    }

}
