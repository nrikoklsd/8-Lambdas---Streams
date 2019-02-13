package thirdTASK;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    static int[] firstGenerator(){

        return IntStream.generate(()-> new Random().nextInt()).limit(100).toArray();
    }
    static int[] secondGenerator(){

        return new Random().ints(50,70).limit(10).toArray();
    }

    public static void main(String[] args) {
        int[] first = Main.firstGenerator();
        int[] second = Main.secondGenerator();


        System.out.println(Arrays.stream(first).max().getAsInt());
        System.out.println(Arrays.stream(first).min().getAsInt());
        System.out.println(Arrays.stream(first).average().getAsDouble());
        System.out.println(Arrays.stream(first).sum());
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);

        Integer sum = numbers.stream()
                .reduce(10, (left, right) -> left + right);

        System.out.println(sum);

    }
}
