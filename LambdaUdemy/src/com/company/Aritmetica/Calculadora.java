package com.company.Aritmetica;

import java.util.function.BiFunction;

public class Calculadora {

    public Double computar(double a, double b, Aritmetica lambda){
        return lambda.operacion(a,b);
    }
    public Double computarConBifunction(double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a, b);
    }
}
