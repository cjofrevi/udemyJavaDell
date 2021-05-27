import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println("Hora: "+ ahora.getHour());
        System.out.println("minutos : "+ ahora.getMinute());
        System.out.println("segundos: " + ahora.getSecond());

        LocalTime seiscontreinte = LocalTime.of(6, 30, 59);
        System.out.println(seiscontreinte);
        seiscontreinte = LocalTime.parse("06:30");

        System.out.println(seiscontreinte);
        LocalTime seiscontreinteuno = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println("seiscontreinteuno = " + seiscontreinteuno);
        boolean esAnterior = LocalTime.of(6, 30, 59).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String ahoraFormateado = ahora.format(df);
        System.out.println("ahoraFormateado = " + ahoraFormateado);
        
        ahoraFormateado =df.format(ahora);
        System.out.println("ahoraFormateado = " + ahoraFormateado);

        LocalTime min = LocalTime.MIN;
        LocalTime max = LocalTime.MAX;
        System.out.println("min : "+min);
        System.out.println("max : "+max);
    }
}
