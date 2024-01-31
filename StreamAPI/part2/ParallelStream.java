package StreamAPI.part2;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //from 1st jan 1970
        long startSeq = System.currentTimeMillis();
        // single thread
        int sum = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i * 2;
                })
                .reduce(0, (a, b) -> a + b);

        long endSeq = System.currentTimeMillis();
        System.out.println(sum+":"+(endSeq-startSeq)+"ms");


        // do the same thing but by using multiple threads
        // it can be used when operations are independent : -
        long startPara = System.currentTimeMillis();
        int sum2 = list.parallelStream().
                filter(i -> i % 2 == 0)
                .map(i -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i * 2;})
                .reduce(0, (a, b) -> a + b);
        long endPara=System.currentTimeMillis();
        System.out.println(sum2+":"+(endPara-startPara)+"ms");
    }
}
