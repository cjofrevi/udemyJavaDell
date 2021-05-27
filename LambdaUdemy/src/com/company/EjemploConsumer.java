package com.company;

import com.company.Models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.*;

public class EjemploConsumer {

    public static void main(String[] args) {

        Consumer<Date> consumer = fecha -> {System.out.println(fecha);
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        } ;

        consumer.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + ", tiene "+ edad+ " años");


        consumidorBi.accept("nino", 10);

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("nino");

        List<String> nombres = Arrays.asList("nino", "gordo", "chino", "feo");
        nombres.forEach(consumer2);

        Supplier<Usuario> crearUsuario = Usuario::new;
        Usuario usuario = crearUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario, "gatito");
        System.out.println("nombre de usuario: "+ usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola pirinola";

        System.out.println(proveedor.get());

//        Formatter formatter = new Formatter();
//        formatter.format("%07X", 1 );

        // Print the output
//        System.out.println("UpperCase Hexadecimal"
//                + " using %X: "
//                + formatter);

//        System.out.println(Long.toString(100, 36));
    }


    public static class EjemploPredicate {

        public static void main(String[] args) {
            Predicate<Integer> test = num -> num > 10;

            Boolean r = test.test(9);
            System.out.println("r= "+r);

            Predicate<String> t2 = role -> role.equals("CHIBO");
            System.out.println(t2.test("CHIBO"));

            BiPredicate<String, String> t3 = String::equals;
            System.out.println(t3.test("bebe", "nino"));

            BiPredicate<Integer, Integer> t4 =(i, j) -> i > j;
            boolean r2 = t4.test(5,10);
            System.out.println(r2);

            Usuario a = new Usuario();
            Usuario b = new Usuario();

            a.setNombre("gatoberto");
            b.setNombre("gatoberto");
            BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
            System.out.println(t5.test(a, b));

        }
    }
}
