import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZonedDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/13 12:45",
                DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm"));
        ZoneId newYork = ZoneId.of("America/New_York");
//        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));
        ZonedDateTime zonaNy = fechaLocal.atZone(newYork);

        System.out.println("zona Horaria de New York "+ zonaNy);

//        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Zona horaria de Madrid "+ zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("detalle viaje a españa ");
        System.out.println("partida NY: "+ f.format(zonaNy));
        System.out.println("llegada Madrid: " + f.format(zonaMadrid));

        Set<String> zonas = ZoneId.getAvailableZoneIds();

//        zonas.forEach(System.out::println);


    }
}
