package com.company;

import com.company.Aritmetica.Aritmetica;
import com.company.Aritmetica.Calculadora;

public class EjemploIntefaceFunctional {
    public static void main(String[] args) {

        Aritmetica suma = (a, b) -> a + b ;
        Aritmetica resta = (a, b) -> a - b ;

        Calculadora calc = new Calculadora();

        System.out.println(calc.computar(10, 5, suma));
        System.out.println(calc.computar(10, 5, resta));
        System.out.println(calc.computar(10, 5, (a, b) -> a * b));

        System.out.println(calc.computarConBifunction(10, 5, (a, b) -> a + b));
    }
}
