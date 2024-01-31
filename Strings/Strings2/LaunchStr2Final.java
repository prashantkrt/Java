package Strings.Strings2;

public class LaunchStr2Final {
    public static void main(String[] args) {
        final int a = 10; // at a time final variable can hold one value

        String str = "Prashant";
        str = str +"hello"; // now this points to new string but old string object isn't deleted

        final String str1 ="Prashant";
//        str1 = "Hello";// we cannot change the reference variable if it's final;
        /*
        * final and the immutable string;
        * String class is made final in Java in order to make the String objects immutable.
         *
        * */

    }
}
