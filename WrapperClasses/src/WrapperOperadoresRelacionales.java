public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        System.out.println("mismo Objeto "+(num1 == num2));

        num2 = 1000;

        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        System.out.println("mismo Objeto "+(num1 == num2));

        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

    }

}
