package Strings.mutableStrings;

public class LaunchStr1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java");
        System.out.println(str);
        System.out.println(str.capacity()); //16 + 4

        System.out.println("**********************");

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        System.out.println(sb.capacity());//16 + 4 //default + length


        StringBuffer s1 = new StringBuffer(); // 16 by default
        s1.append("Java");//we can append any type of data
        System.out.println(s1.capacity());
        s1.append("hero jgg bjg hjgjgg master of the universe the boss");
        System.out.println(s1.capacity()); // 55
        System.out.println(s1);
        System.out.println(s1.capacity()); //55


        StringBuilder s2 = new StringBuilder(); //16
        s1.append("Java");
        System.out.println(s1.capacity());//16 as 16-4 =12 <=16
        s2.append("hero jgg bjg hjgjgg master of the universe the boss");
        System.out.println(s2.capacity()); // 55
        System.out.println(s2);
        System.out.println(s2.capacity()); //55
    }
}
