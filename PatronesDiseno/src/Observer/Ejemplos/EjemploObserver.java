package Observer.Ejemplos;

import Observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver((observable, obj) -> {
            System.out.println("John: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Nino: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Gatoberto: " + observable);
        });

        google.modificaPrecio(2000);
    }
}
