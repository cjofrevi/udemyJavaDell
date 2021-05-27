public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean promBoolean = num1 > num2;
        Boolean objBoolean = Boolean.valueOf(promBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("promBoolean = "+promBoolean);
        System.out.println("objBoolean = "+objBoolean);
        System.out.println("objBoolean2 = "+objBoolean2);

        System.out.println("Comparando dos objetos boolean: "+(promBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean: "+(objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean: "+(objBoolean2 == objBoolean3));

        boolean promBoolean2 = objBoolean2.booleanValue();
        System.out.println("promBoolean2 = " + promBoolean2);






    }
}
