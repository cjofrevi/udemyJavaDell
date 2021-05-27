import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProjectStream {

    public static void main(String[] args) throws IOException {

//        String csvFile = "C:\\Users\\cjofrevi\\Desktop\\produccion-minera-nacional-por-empresa.csv";
        Stream<String> files = Files.lines(Paths.get("C:\\Users\\cjofrevi\\Desktop\\produccion-minera-nacional-por-empresa.csv"), Charset.forName("ISO-8859-1"));
        ArrayList<String> arrayList;
        arrayList = files
//                .map(x -> new ArrayList<String>())
                .skip(1)
                .filter(c -> !c.contains(";;"))
//                .flatMap()
//                .map(string -> new ArrayList<String>().stream())
//                .flatMap(stringStream -> stringStream.map(string -> Arrays.stream(string.split(";").)))
//                .collect(Collectors.toCollection(ArrayList::new));
                .collect(Collectors.toCollection(ArrayList::new));

        

//                .map(x -> x.split(";"))
//                .collect(Collectors.toList());
//                .collect(Collectors.toCollection(ArrayList<String>::new));

//        arrayList.forEach(System.out::println);
//                .
//            files
//                    .skip(1)
//                    .forEach(x ->System.out.println(x));

//        Files.lines(Paths.get(csvFile), Charset.forName("ISO-8859-1"))
//                .skip(1)
//                .forEach(System.out::println);
    }
}
