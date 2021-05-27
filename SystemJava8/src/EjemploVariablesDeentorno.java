import java.util.Map;

public class EjemploVariablesDeentorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
//        System.out.println("varEnv = " + varEnv);
        
        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

//        String path = System.getenv("PATH");
//        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path = " + path2);

        System.out.println("lista variables ambientales....");
        for(String key : varEnv.keySet()){
            System.out.println(key + " => "+ varEnv.get(key));
        }



    }
}
