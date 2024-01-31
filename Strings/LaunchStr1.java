package Strings;

public class LaunchStr1 {
    public static void main(String[] args) {
        String s1 = "Java";
        System.out.println(s1); //Java
        s1.concat("SpringBoot");
        System.out.println(s1); // Java as S1 still refers to the old string Java

        s1 = s1.concat("SpringBoot");// this creates the new String and s1 starts referring to the new String
        System.out.println(s1);

        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1==str2); // true as they both refers to same string in SCP
        System.out.println(str1.equals(str2)); // true

        String str3 = new String("Java");
        System.out.println(str1==str3); // false as both has diff address
        System.out.println(str1.equals(str3)); // true

        String str4 = new String("Java");
        String str5 = new String("Java");
        System.out.println(str4==str5);//false as both have different address
        System.out.println(str4.equals(str5));//true
    }
}


/*
* 4 ways to compare immutable strings: ->
* == actual string data won't be compared only it compares the reference
* str1.equals(str2) actual data will be compared
* str1.equalsIgnoreCase(str2) data will be compared by ignoring the case sensitivity
* compareTo() string data will be compared character by character lexicographically
* */



/*
* 2 ways to create immutable string.
* String str = "" or String str = new String("")*
* */


/*
* Head -> SCP(duplicates objects are not allowed)
* String str = "Java" (SCP String Constant pool) -> String literal 1 object created
*
* Heap Area (String str = new String("") both in heap area and SCP 2 objects created
* with new keyword new Java object created in heap area as well as one copy created to scp no one is referring to that it is implicitly maintained by JVM in SCP
* here we can create duplicate objects.
*
*
* */