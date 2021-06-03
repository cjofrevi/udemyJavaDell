package Thread.EjemploExecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor =(ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        System.out.println("Tamano del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        Callable<String> tarea = () -> {
            System.out.println("inicio de la tarea...");
            try {
                System.out.println("nombre del thread "+ Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("finaliza la tarea.");
            return "resultado de tarea";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("inicio de la tarea 2...");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);

        System.out.println("Tamano del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        executor.shutdown();
        System.out.println("continuando con la ejecucion del metodo main ");

        while(!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3: %s ",
                    resultado.isDone() ? "finalizo" : "en proceso",
                    resultado2.isDone() ? "finalizo" : "en proceso",
                    resultado3.isDone() ? "finalizo" : "en proceso"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }

        System.out.println("obtenemos resultado tarea 1: "+resultado.get() );
        System.out.println("finaliza una tarea: " + resultado.isDone());

        System.out.println("obtenemos resultado tarea 2: "+resultado2.get() );
        System.out.println("finaliza una tarea: " + resultado2.isDone());

        System.out.println("obtenemos resultado tarea 3: "+resultado3.get() );
        System.out.println("finaliza una tarea: " + resultado3.isDone());

    }
}
