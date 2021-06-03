package Thread.EjemploTimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareaTimer {
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("tarea realizada en: "+ new Date() +
                        " nombre Thread "+ Thread.currentThread().getName());
                System.out.println("finaliza la tarea");
                timer.cancel();

            }
        }, 5000);

        System.out.println("agendammos en 5 min mas");
    }
}
