package Ejemplo;

import Ejemplo.Models.Producto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setNombre("mesa madera");
        p.setFecha(LocalDate.now());
        p.setPrecio(1000L);
        Field[] atributos = p.getClass().getDeclaredFields();

        Arrays.stream(atributos)
                .filter(f ->f.isAnnotationPresent(JSONAtributo.class))
                .map(f -> {
                    String nombre = f.getAnnotation(JSONAtributo.class).nombre().equals("")
                            ? f.getName() : f.getAnnotation(JSONAtributo.class).nombre();

                    try {
                        return "\"" + nombre + "\":\"" + f.get(p) + "\"";
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                })
    }

}
