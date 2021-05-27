import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime fechatiempo = LocalDateTime.now();
        System.out.println("fechatiempo = " + fechatiempo);
        
        fechatiempo = LocalDateTime.of(2020, Month.DECEMBER, 24, 20, 45, 59);
        System.out.println("fechatiempo = " + fechatiempo);

        fechatiempo = LocalDateTime.parse("2021-05-25T13:04:32.100");
        System.out.println("fechatiempo = " + fechatiempo);

        LocalDateTime fechatiempo2 =fechatiempo.plusDays(1).plusDays(3);
        System.out.println("fechatiempo2 = " + fechatiempo2);
        System.out.println("fechatiempo2 = " + fechatiempo2.minusHours(5));

        Month mes = fechatiempo.getMonth();
        System.out.println("mes = " + mes);

        int dia = fechatiempo.getDayOfMonth();
        System.out.println("dia = " + dia);
        
        int year = fechatiempo.getYear();
        System.out.println("year = " + year);

        String Formato1 = fechatiempo.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Formato1 = " + Formato1);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        String Formato2 = fechatiempo.format(df);
        System.out.println("Formato2 = " + Formato2);
    }
}
