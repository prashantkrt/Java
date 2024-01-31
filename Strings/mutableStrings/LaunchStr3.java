package Strings.mutableStrings;

public class LaunchStr3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("programming");
        System.out.println("string: " + sb);
        int length = sb.length(); // 11
        int capacity = sb.capacity(); // 16 + 11 = 27
        System.out.println("length: " + length); //11
        System.out.println("capacity: " + capacity);//27
        sb.trimToSize();
        length = sb.length();//11
        capacity = sb.capacity(); //11
        System.out.println("length after trimtosize: " + length);//11
        System.out.println("capacity after trimtosize: " + capacity);//11


        StringBuffer str
                = new StringBuffer("GeeksForGeeks");

        // print string
        System.out.println("String contains = " + str);

        // get substring start from index 5 to index 8
        // using substring() and print results
        System.out.println("SubSequence = "
                + str.substring(5, 8));//for
    }
}
