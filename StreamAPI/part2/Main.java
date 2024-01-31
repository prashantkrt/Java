package StreamAPI.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> s1 = nums.stream().filter(i ->i%2==0);
        s1.forEach(i-> System.out.println(i));
    }
}
