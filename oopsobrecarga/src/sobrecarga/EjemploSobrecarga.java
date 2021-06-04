package sobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        System.out.println("sumar int : " + cal.sumar(5, 7));
        System.out.println("sumar flat: "+ cal.sumar(5F, 10.0F));
        System.out.println("sumar float y int: "+ cal.sumar(10f, 5));
        System.out.println("sumar int y float : "+ cal.sumar(5,10f ));
        System.out.println("sumar double : "+ cal.sumar(5.3,10.5 ));
        System.out.println("sumar string: "+ cal.sumar("5", "6"));
        System.out.println("sumar trres int: "+ cal.sumar(5, 8, 10));
        System.out.println("sumar cuatro int: "+ cal.sumar(5, 8, 10, 7, 8, 10));
        System.out.println("sumar float + n int: " +cal.sumar(4f, 5,78,78,95,4));
        System.out.println("sumar tres doubles: "+ cal.sumar(3.0, 8.4, 8.6, 4.7));

        System.out.println("sumar long: " + cal.sumar(10L, 5L));
    }
}
