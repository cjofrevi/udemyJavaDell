package Ejemplos.Service;

import java.io.*;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            escritor.append("Hola nino el felino\n")
                    .append("superbuenooooo\n")
                    .append("chao ninoooo\n");
            escritor.close();
            System.out.println("se ha creado un archivo con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
