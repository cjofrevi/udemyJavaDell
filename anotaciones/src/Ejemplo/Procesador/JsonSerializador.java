package Ejemplo.Procesador;

import Ejemplo.Init;
import Ejemplo.JSONAtributo;
import Ejemplo.Procesador.Excepciones.JsonSerializadorException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializador {

    public static void inicializarObjeto(Object object){
        if(Objects.isNull(object)){
            throw new JsonSerializadorException("el objeto a serializar no puede ser nulo");
        }
        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter(m -> m.isAnnotationPresent(Init.class))
                .forEach(m -> {
                    m.setAccessible(true);
                    try {
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializadorException("Error al serializar, no se puede inicializar el objeto"
                        + e.getMessage());
                    }
                });
    }

    public static String convertirJson(Object object) {

        if(Objects.isNull(object)){
            throw new JsonSerializadorException("el objeto a serializar no puede ser nulo");
        }
        inicializarObjeto(object);
        Field[] atributos = object.getClass().getDeclaredFields();
        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JSONAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JSONAtributo.class).nombre().equals("")
                            ? f.getName() : f.getAnnotation(JSONAtributo.class).nombre();

                    try {
                        Object valor = f.get(object);
                        if (f.getAnnotation(JSONAtributo.class).capitalizar() &&
                        valor instanceof String){
                            String newValor = (String) valor;
//                            newValor = newValor.substring(0, 1).toUpperCase() +
//                                    newValor.substring( 1);
                            newValor = Arrays.stream(newValor. split(" "))
                                    .map(palabra -> palabra.substring(0, 1).toUpperCase()
                                    + palabra.substring(1).toLowerCase())
                                    .collect(Collectors.joining(" "));

                            f.set(object, newValor);
                        }
                        return "\"" + nombre + "\":\"" + f.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("error al serializar a jason " + e.getMessage());
                    }
                }).reduce("{", (a, b) -> {
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }

}
