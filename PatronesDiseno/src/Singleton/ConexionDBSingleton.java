package Singleton;

public class ConexionDBSingleton {

    private static ConexionDBSingleton instancia;
    private ConexionDBSingleton(){
        System.out.println("conectandose BD...");
    }

    public static ConexionDBSingleton getInstance(){
        if(instancia == null){
            instancia = new ConexionDBSingleton();
        }
        return instancia;
    }
}
