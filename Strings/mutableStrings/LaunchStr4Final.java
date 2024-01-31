package Strings.mutableStrings;

public class LaunchStr4Final {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb);

        // reassignment is not allowed for final reference variable
        // sb=new StringBuffer("Telusko");

        //but we can change the string
         sb.append("Java Cpp"); // it still refers to the same object for won't giver error

        /*
         * Final
         * If you declare a field or variable final, it means,
         * that you cannot change the object reference stored in it.
         * It will always point to the same object.
         * While you cannot substitute the stored reference with another one,
         * you can modify the referenced object.
         *
         * Immutable
         * In simple terms, immutability means unchanging over time or unable to be changed.
         * In Java, we know that String objects are immutable means we can't change anything to the existing String objects.
         *
         *
         * */


    }
}
