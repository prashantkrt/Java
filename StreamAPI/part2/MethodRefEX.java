package StreamAPI.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefEX {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin", "Shweta", "John", "Doe");

        // all the names but in upper case
        List<String> uNames = new ArrayList<>();

        names.forEach(i -> uNames.add(i.toUpperCase()));

        System.out.println(names);
        System.out.println(uNames);

        List<String> myNames = names.stream().map(i -> i.toUpperCase()).toList();

        List<String> myNamesOldWay = names.stream()
                .map(i -> i.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(names);
        System.out.println(uNames);


        //functional programming
        //Java 8 supports functional programming because it supports functional style
        List<String> myName= names.stream()
                .map(String::toUpperCase) //functional style
                //method reference
                .toList();

    }
}
