import modelo.Cliente;

import modelo.Producto;
import repositorio.*;
import repositorio.Lista.ClienteListRepositorio;
import repositorio.Lista.ProductoListRepositorio;


import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

//        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
//        repo.crear(new Cliente("Jano", "Pérez"));
//        repo.crear(new Cliente("Bea", "González"));
//        repo.crear(new Cliente("Luci", "Martínez"));
//        repo.crear(new Cliente("Andrés", "Guzmán"));
//
//        List<Cliente> clientes = repo.listar();
//        clientes.forEach(System.out::println);
//        System.out.println("===== paginable =====");
//        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1, 4);
//        paginable.forEach(System.out::println);
//
//        System.out.println("===== ordenar =====");
//        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo)
//                                              .listar("apellido", Direccion.ASC);
//        for(Cliente c: clientesOrdenAsc){
//            System.out.println(c);
//        }
//
//        System.out.println("===== editar =====");
//        Cliente beaActualizar = new Cliente("Bea", "Mena");
//        beaActualizar.setId(2);
//        repo.editar(beaActualizar);
//        Cliente bea = repo.porId(2);
//        System.out.println(bea);
//        System.out.println(" ============= ");
//        ((OrdenableRepositorio)repo)
//                .listar("nombre", Direccion.ASC).forEach(System.out::println);
//        System.out.println("===== eliminar ======");
//        //repo.eliminar(2);
//        repo.listar().forEach(System.out::println);

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("mesa", 15.2));
        repo.crear(new Producto("silla", 60));
        repo.crear(new Producto("lampara", 100));
        repo.crear(new Producto("water", 800));

        List<Producto> producto = repo.listar();
        producto.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Producto> paginable = ((PaginableRepositorio)repo).listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Producto>productoOrdenAsc = repo.listar("descripcion", Direccion.ASC);
        for(Producto c: productoOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Producto lamparaActualizar = new Producto("lampára", 52.3654);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);
        Producto lampara = repo.porId(3);
        System.out.println(lampara);
        System.out.println(" ============= ");

        repo.listar("precio", Direccion.ASC).forEach(System.out::println);
        System.out.println("===== eliminar ======");
        //repo.eliminar(2);
        repo.listar().forEach(System.out::println);


    }
}
