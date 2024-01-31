package Arrays.ArrayAndStirng;

import java.util.Arrays;

public class LaunchArrObj2 {
    public static void main(String[] args) {
        //this comes from the object class
        int[] arr = new int[4];//some class is there for which we created object
        System.out.println(arr.getClass().getName()); // [I is for internal purpose not for developers



        int[][] arr2 = new int[2][3];
        System.out.println(arr2.getClass().getName());//[[I is for internal purpose not for developers


        int[] ar = {2, 4, 1, 8, 0};

        // Arrays is the utility class of array
        Arrays.sort(arr);
        for (int sorted : arr)
            System.out.print(sorted + " ");
    }
}
