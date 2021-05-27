package com.company;

@FunctionalInterface
interface Cab{
//    void bookcab(String source, String destination);
    double  bookcab(String source, String destination);
}

public class LambdaTutorial {
    int instanceVar = 10;
    static int dVar = 100;



    public static void main(String[] args) {


        Cab cab = (source,destination) ->{
            int localVar = 50;
            System.out.println(" from " + source + " to " + destination);
            System.out.println("local var is: "+ localVar);
            System.out.println("Static variable is: "+ LambdaTutorial.dVar);
            return 666.6;
        };

        System.out.println(cab.bookcab("casa", "trabajo"));
    }
}
