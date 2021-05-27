package generics;

import modelo.Cliente;
import modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {

    public static void main(String[] args) {
        List<Cliente> clientes= new ArrayList<>();
        clientes.add(new Cliente("andres", "guzman"));

//        Cliente andresa = clientes.get(0);
//        Cliente andresb = clientes.iterator().next();
        Cliente[] arrayCliente = {new Cliente("nino", "felino"),  new Cliente("chibo", "gordo")};
        Integer[] numbers ={1, 5, 8, 7, 8};
        List<Cliente> listCliente = fromArrayToList(arrayCliente);
        List<Integer> listNumber = fromArrayToList(numbers);

//        listCliente.forEach(System.out::println);
//        listNumber.forEach(System.out::println);

        List<String> nombre = fromArrayToList(new String[]{"nino", "chibo", "miki", "gorda"},numbers );
        nombre.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(new ClientePremium[]
                {new ClientePremium("impos", "tor")});

        imprimirclientes(clientes);
        imprimirclientes(listCliente);
        imprimirclientes(clientesPremiumList);

        System.out.println("max of 1 , 9 y 4: "+maximo(1, 9, 4));
        System.out.println("max of 3.5 , 9.0 y 8.99: "+maximo(3.5, 9.0 , 8.99));
        System.out.println("max of nino , miki  y chibo: "+maximo("nino", "miki", " chibo"));
    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
//    public static  List<Cliente> fromArrayToList(Cliente[] c){
//        return Arrays.asList(c);
//    }
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for(G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirclientes(List<? extends Cliente> cliente){
        cliente.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max)> 0){
            max = c;
        }
        return max;
    }
}
