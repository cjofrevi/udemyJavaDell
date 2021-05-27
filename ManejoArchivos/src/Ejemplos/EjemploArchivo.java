package Ejemplos;

import Ejemplos.Service.ArchivoServicio;

public class EjemploArchivo {
    public static void main(String[] args) {

        String NombreArchivo = "C:\\Users\\cjofrevi\\Documents\\FileJavaUdemy\\java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo2(NombreArchivo));

    }
}
