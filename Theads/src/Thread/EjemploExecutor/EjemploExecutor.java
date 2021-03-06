package Thread.EjemploExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("inicio de la tarea...");
            try {
                System.out.println("nombre del thread "+ Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("finaliza la tarea.");
        };

        executor.submit(tarea);
        executor.shutdown();
        System.out.println("continuando con la ejecucion del metodo main 1");
        executor.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("continuando con la ejecucion del metodo main 2");
    }
}
