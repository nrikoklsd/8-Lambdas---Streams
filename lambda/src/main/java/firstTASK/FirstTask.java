package firstTASK;

import firstTASK.MyFunctionalInterface;

import java.util.stream.IntStream;

public class FirstTask {
    public static void main(String[] args) {
        MyFunctionalInterface maxLambda = (a, b, c) ->  IntStream.of(a,b,c).max().getAsInt();
        MyFunctionalInterface averageLambda = (a, b, c) -> Math.round((float) IntStream.of(a,b,c).average().getAsDouble());
//        Stream<Integer> stream = IntStream.of()
        System.out.println(maxLambda.mymethod(1,2,3));
        System.out.println(averageLambda.mymethod(1,2,3));



    }


}
