package Thread.Ejemplos;

import Thread.Ejemplos.Runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de Pascua")).start();
        new Thread(new ViajeTarea("china")).start();
        new Thread(new ViajeTarea("waterloo")).start();
        new Thread(new ViajeTarea("transilvania")).start();
    }
}
