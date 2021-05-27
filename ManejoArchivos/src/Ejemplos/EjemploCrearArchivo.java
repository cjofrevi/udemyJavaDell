package Ejemplos;

import Ejemplos.Service.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String NombreArchivo = "C:\\Users\\cjofrevi\\Documents\\FileJavaUdemy\\java.txt";

        ArchivoServicio servicio = new ArchivoServicio();
        servicio.crearArchivo(NombreArchivo);
    }
}
