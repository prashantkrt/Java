package Strings;

public class LaunchStr3 {
    public static void main(String[] args) {
        /*
         *  Two ways to concat String
         * str1.concat(str2);  or str1+str2;
         */

        String str1="Telusko";
        // they Java team have overridden the toString method as str1 is reference variable
        System.out.println(str1);

        // ** where ever with the strings anything on reference variable, inbuilt methods and  new keyword used things' memory will be allocated in heap
        //.concat uses new keyword so it created 2 objects 1 on heap and second copy on scp
        str1.concat(" Java"); // create new String in SCP but the str1 will refer to Telusko only not the new String
        System.out.println(str1);
    }
}
