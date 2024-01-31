package Arrays.ArrayAndStirng;
class Telusko
{

}
class Alien{

}
public class LaunchArrObj3 {
    public static void main(String[] args) {

        Object [] obj = new Object[3];
        obj[0]=new Telusko();
        obj[1]=new Alien();

        int[] arr = {2, 5, 3, 4, 6, 1};


        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }
}
