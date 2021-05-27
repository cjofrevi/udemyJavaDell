package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)  throws IOException {

        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println("*");

        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.print(x));
        System.out.println("*");

        System.out.println(
                IntStream
                .range(1, 5)
                .sum()
        );
        System.out.println("*");

        Stream.of("nino", "gorda", "chibo", "gatoberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("*");

        String[] names = {"nino", "gorda", "chibo", "gatoberto", "mikisito", "impostor", "michan", "feoberto"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("m"))
                .sorted()
                .forEach(System.out::println);
        System.out.println("*");

        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
        System.out.println("*");

//        String[] namesArray = {"nino", "gorda", "chibo", "gatoberto", "mikisito", "impostor", "michan", "feoberto"};
        List<String> namesList = Arrays.asList(names);

        namesList
                .stream()
                .map(String::toUpperCase)
                .filter(x -> x.startsWith("M"))
                .forEach(System.out::println);
        System.out.println("*");

        Stream<String> bands = Files.lines(Paths.get("C:\\Users\\cjofrevi\\IdeaProjects\\JavaStream\\src\\com\\company\\bands.txt"));
        bands
            .sorted()
            .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();
        System.out.println("*");

        List<String> bands2 = Files.lines(Paths.get("C:\\Users\\cjofrevi\\IdeaProjects\\JavaStream\\src\\com\\company\\bands.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());
        bands2.forEach(x ->System.out.println(x));
        System.out.println("*");

        Stream<String> rows1 = Files.lines(Paths.get("C:\\Users\\cjofrevi\\IdeaProjects\\JavaStream\\src\\com\\company\\data.txt"));
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows. ");
        rows1.close();
        System.out.println("*");

        Stream<String> rows2 = Files.lines(Paths.get("C:\\Users\\cjofrevi\\IdeaProjects\\JavaStream\\src\\com\\company\\data.txt"));
         rows2
                .map(x -> x.split(","))
                 .filter(x -> x.length ==3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] +" " + x[1] + " "+x[2]));
            rows2.close();
        rows1.close();
        System.out.println("*");

        Stream<String> rows3 = Files.lines(Paths.get("C:\\Users\\cjofrevi\\IdeaProjects\\JavaStream\\src\\com\\company\\data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
            .map(x -> x.split(","))
            .filter(x -> x.length ==3)
            .filter(x -> Integer.parseInt(x[1]) > 15)
            .collect(Collectors.toMap(
                    x -> x[0],
                    x -> Integer.parseInt(x[1])));
        rows3.close();
        for(String key : map.keySet()){
            System.out.println(key + " "+ map.get(key));
        }
        System.out.println("*");

        double total = Stream.of(7.3, 1.5, 4.8)
            .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total =" + total);
        System.out.println("*");

        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);


    }

}
