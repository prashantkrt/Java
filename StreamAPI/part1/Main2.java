package StreamAPI.part1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main2 {
    // can't change the stream , Stream is immutable
    // can't reuse the stream
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = nums.stream();
        Stream<Integer> stream2 = nums.stream();

//      System.out.println(stream.count());

        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();
        stream2.forEach(i -> System.out.print(i + " "));

        Stream<Integer> stream3 = nums.stream();

        Predicate<Integer> predicate = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0)
                    return true;
                else return false;
            }
        };

        Predicate<Integer> ob = (i) -> {
            return i % 2 == 0;
        };
        Predicate<Integer> obj = (Integer i) -> i % 2 == 0;
        Predicate<Integer> o = (i) -> i % 2 == 0;
        Predicate<Integer> oo = i -> i % 2 == 0;

        Stream<Integer> s = stream3.filter(i -> i % 2 == 0);

        System.out.println();
        s.forEach(i -> System.out.print(i + " "));

        Stream<Integer> s1 = nums.stream();

        Function<Integer, Integer> func = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };

        Stream<Integer> s2 = s1.map(i -> i * 2);
        //takes perform and returns it / changes the value


        Stream<Integer> ss = nums.stream().filter(i -> i % 2 == 0).map(i -> i * 2);

        nums.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .forEach(i -> System.out.print(i));


        BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        //reduce(0,bo); returns single value
        int sum = nums.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .reduce(0, (c, e) -> c + e);

        int sum2 = nums.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .reduce(0, Integer::sum);


        System.out.println();
        System.out.println(sum);
    }
}
