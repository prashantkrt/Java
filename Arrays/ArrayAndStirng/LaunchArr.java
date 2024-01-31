package Arrays.ArrayAndStirng;

public class LaunchArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double[] arr1 = {1.0, 2.0, 3.0, 4.0};

        //normal loop
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");


        //enhanced for loop
        for (int val : arr)
            System.out.print(val + " ");
        for (double val : arr1)
            System.out.print(val + " ");

        System.out.println("Printing the 2d array");

        int[][] arr2 = {{1, 2}, {3, 4}, {4, 5}};


        for (int[] val : arr2) {
            for (int val2 : val)
                System.out.print(val2+" ");
            System.out.println();
        }

    }
}
