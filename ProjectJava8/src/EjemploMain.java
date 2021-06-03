import java.util.ArrayList;
import java.util.Scanner;

public class EjemploMain {

    public static void main(String[] args) {

        ArrayList<String> listWord = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        listWord.add(input);


        while (!input.equals(" ")) {
            input = reader.nextLine();
            listWord.add(input);
        }

        listWord.forEach(u -> System.out.println(u));

    }
}
