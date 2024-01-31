package Strings.Strings2;

public class LaunchStr4 {
    public static void main(String[] args) {
        String str = "RajaRamMohanRoy";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        char ch = 'a';
        System.out.println(Character.toLowerCase(ch));

        String str1 = "Apple";
        System.out.println(str1.substring(0,3));
        System.out.println(str1.substring(0));

        System.out.println(str.charAt(2));
        System.out.println(str1.endsWith("e"));//true or false
        System.out.println(str1.startsWith("A"));


        System.out.println(str1.contains("pp"));//true or false
        System.out.println(str1.indexOf("a"));//if there then index or -1


        System.out.println(str1.lastIndexOf("e"));
        System.out.println(str1.length());

        String  a ="AbcaASD";
        String  [] ss = a.split("a");
        char [] c = a.toCharArray();
    }
}
