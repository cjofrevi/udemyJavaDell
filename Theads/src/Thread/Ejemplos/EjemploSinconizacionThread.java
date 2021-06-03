package Thread.Ejemplos;

import Thread.Ejemplos.Runnable.ImprimirFrases;

public class EjemploSinconizacionThread {

    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("hola", "que tal")).start();
        new Thread(new ImprimirFrases("Quien eres", "tu?")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirFrases("nino el ", "felino"));
        h3.start();

    }

    public synchronized static void imprimirFrases(String frase1, String frase2) throws InterruptedException {
        System.out.print(frase1);
        Thread.sleep(500);
        System.out.println(frase2);
    }
}
