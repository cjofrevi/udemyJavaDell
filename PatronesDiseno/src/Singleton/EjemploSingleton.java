package Singleton;

public class EjemploSingleton {
    public static void main(String[] args) {
        ConexionDBSingleton con =null;
        for(int i = 0; i < 10; i ++){
            con = ConexionDBSingleton.getInstance();
            System.out.println("con = " + con);
        }
        ConexionDBSingleton con2 = ConexionDBSingleton.getInstance();
        ConexionDBSingleton con3 = ConexionDBSingleton.getInstance();
        boolean b1 = (con == con2) && (con2 == con3);
        System.out.println("b1 = " + b1);
    }

}
