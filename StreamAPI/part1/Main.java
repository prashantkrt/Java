package StreamAPI.part1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9);

        Consumer<Integer> obj = new Consumer<>() {
            @Override
            public void accept(Integer integer) {
                if(integer%2==0)
                    System.out.print(integer+" ");
            }
        };

        nums.forEach(obj);

        System.out.println();

        nums.forEach(n-> System.out.println(n));

        int sum = nums.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(c,e)->c+e);

        int sum2 = nums.stream()
                .filter(i->i%2==0)
                .map(i->i*2)
                .mapToInt(i->i)
                .sum();


        System.out.println(sum);
        System.out.println(sum);
    }
}
