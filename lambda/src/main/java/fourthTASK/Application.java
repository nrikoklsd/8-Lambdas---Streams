package fourthTASK;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    void run() {
        List<String> list = readListString();
        System.out.println(numberUniqueWords(list));
        System.out.println(sortedListUniqueWords(list));
        System.out.println(wordCount(list));
        System.out.println();
    }

    private List<String> readListString() {

        List<String> strings = new ArrayList<>();


        String line;
        Scanner reader= new Scanner(System.in);;// Reading from System.in
        System.out.println("Enter your lines: ");
        while (!(line = reader.nextLine()).isEmpty()) {
            strings.add(line);
        }

        reader.close();
        return strings;
    }


    private long numberUniqueWords(List<String> strings) {


        return strings.stream().distinct().count();



    }
    private Object[] sortedListUniqueWords(List<String> strings){
        return strings.stream().flatMap(s -> Stream.of(s.split(" "))).sorted().toArray();
    }



    private Map<String, Long> wordCount(List<String> strings){
        return strings.stream().flatMap((line) -> Stream.of(line.split(" ")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private Map<String,Long> occurrenceNumber(List<String> strings){
        return strings.stream().flatMap((line) -> Stream.of(line.split(" ")))
                .flatMap((line) -> Stream.of(line.split(" ")))
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }

    public static void main(String[] args) {
        Application application =new Application();
        application.run();
    }
}
