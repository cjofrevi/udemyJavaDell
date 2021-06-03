package Thread.EjemploExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduledExecutorService {
    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("algunatarea en el main");

        executor.schedule(() ->{

            System.out.println("hola mundo tarea");

            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }, 2000, TimeUnit.MILLISECONDS);

        System.out.println("alguna otra tarea en el main ....");
        executor.shutdown();
    }
}
