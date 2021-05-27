public class WrapperInteger {

    public static void main(String[] args) {
        int intPrimitivo = 456987;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);


        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 =  intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorString = "456987";
        Integer valor = Integer.valueOf(valorString);
        System.out.println("valor = " + valor);

        Short shortObject = 32767;
        Short shortObject2 = intObjeto.shortValue();
        System.out.println("shortObject2 = " + shortObject2);

        Byte byteObjecto = intObjeto.byteValue();
        System.out.println("byteObjecto = " + byteObjecto);
        
        Long longObject = intObjeto.longValue();
        System.out.println("longObject = " + longObject);
    }




}
