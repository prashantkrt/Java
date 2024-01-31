package StreamAPI.part2;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prashant","Kumar","Tiwary");

        //find the length of the name which has w in it
        //Optional is a class to get rid of null pointer exception
        Optional<String> name = names.stream().filter(i->i.contains("w")).findFirst();
        System.out.println(name);//Optional[Tiwary]
        System.out.println(name.get().length());

        //what is we don't have name which has "w"
        System.out.println(name.orElse("").length());


        //better
        String n = names.stream().filter(i->i.contains("w")).findFirst().orElse("");
    }
}
