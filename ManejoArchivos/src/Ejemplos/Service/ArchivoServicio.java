package Ejemplos.Service;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {

            buffer.append("Hola nino el felino\n")
                    .append("superbuenooooo\n")
                    .append("chao ninoooo\n");
//            buffer.close();
            System.out.println("se ha creado un archivo con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try(PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))) {

            buffer.println("Hola nino el felino");
            buffer.println("superbuenooooo");
            buffer.println("chao ninoooo");
//            buffer.close();
            System.out.println("se ha creado un archivo con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo));) {

            String linea;
            while( ((linea = reader.readLine()) != null)){
                sb.append(linea).append("\n");
            }
//            reader.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try(Scanner scanner = new Scanner(archivo);) {

            scanner.useDelimiter("\n");
            while(scanner.hasNext()){
                sb.append(scanner.next()).append("\n");
            }
//            scanner.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
