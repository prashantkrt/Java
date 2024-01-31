package Strings.mutableStrings;

public class LaunchStr2 {
    public static void main(String[] args) {
        StringBuffer st1 = new StringBuffer("Java");
        StringBuffer st2 = new StringBuffer("Java");
        System.out.println(st1==st2);//false

        /*
        * in the String class .equals method is overridden
        * that is why it's giving the and comparing the actual value not address
        * In object class .equals method compares the address of the reference variables       *
        * */

        //in StringBuffer and StringBuilder they have not overridden the .equals method
        //so it compares the reference address not the actual values.
        System.out.println(st1.equals(st2)); //false;


        StringBuilder st3 = new StringBuilder();
        StringBuilder st4 = new StringBuilder();
        System.out.println(st3==st4);
        System.out.println(st3.equals(st4));


        System.out.println(st1.toString().equals(st2.toString()));//true
        System.out.println(st3.toString().equals(st4.toString()));//true

        System.out.println(st1.length());

        System.out.println(st3.capacity());//16
        st3.ensureCapacity(100);
        System.out.println(st3.capacity()); //100
    }
}
