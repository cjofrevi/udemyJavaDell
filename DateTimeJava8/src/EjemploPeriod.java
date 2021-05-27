import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2011, 9, 23);
        LocalDate fecha2 = LocalDate.of(2021, 11, 25);
        LocalDate fecha3 = fecha2.withMonth(12);

        Period period = Period.between(fecha1, fecha2);
        Period period2 = Period.between(fecha1, fecha3);

        System.out.println("period = " + period);
        System.out.println("period2 = " + period2);
        System.out.printf("periodo entre %s y %s hay %d años, %d meses y %d dias.",
                fecha1, fecha2, period.getYears(), period.getMonths(), period.getDays());

    }
}
