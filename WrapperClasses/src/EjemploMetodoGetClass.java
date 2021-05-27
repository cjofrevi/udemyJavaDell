import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String text = "nino el felino";
        Class strClass = text.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackage() = " + strClass.getPackage());
        System.out.println("strClass = " + strClass);

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo = "+ metodo.getName());
        }
        System.out.println("******************");
        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = "+intClass.getName());
        System.out.println("intClass = "+intClass.getSimpleName());
        System.out.println("intClass = "+intClass.getSuperclass());
        System.out.println("intClass = "+intClass.getSuperclass().getSuperclass());


    }
}
