package Strings;

public class LaunchStr2 {
    public static void main(String[] args) {
        String str1 = "Telusko";
        String str2 = "Telusko";

        String str3 = new String("Telusko");
        String str4 = new String("Telusko");

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str3 == str4);//false

        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str3));//true
        System.out.println(str3.equals(str4));//true

        String str = new String("alien");
        String strr = new String("Alien");

        System.out.println(str.equalsIgnoreCase(strr));//true
    }
}
