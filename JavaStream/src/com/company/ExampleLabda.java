package com.company;

import java.util.Arrays;
import java.util.List;

public class ExampleLabda {

    public static void main(String[] args) {

        Game football = () ->
                System.out.println("I'm playing fusball");
        Series series = (type) ->
                System.out.println("ir's a "+ type+ " series.");
        football.play();
        series.play("ninooo");

        List<String> players = Arrays.asList("nino", "gordo", "chivo", "gatoberto", "lulito");

        players
                .stream()
                .filter(player ->
                    player.equals("nino"))
                .forEach(player -> System.out.println("yes, is nino here"));
    }

    interface Game{
       void play();
    }

    interface Series{
        void play(String type);
    }
}
