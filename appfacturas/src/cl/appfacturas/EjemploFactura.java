package cl.appfacturas;

import cl.appfacturas.modelo.Cliente;
import cl.appfacturas.modelo.Factura;
import cl.appfacturas.modelo.ItemFactura;
import cl.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("888-7");
        cliente.setNombre("nino");


        Scanner s = new Scanner(System.in);
        System.out.println("ingrese la descripsion de la factura: ");
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 2; i ++){
            producto = new Producto();
            System.out.print("Ingrese producto n° "+ producto.getCodigo()+": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));
            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);

    }
}
