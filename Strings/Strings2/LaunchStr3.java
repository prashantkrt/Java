package Strings.Strings2;

public class LaunchStr3 {
    public static void main(String[] args) {
        /*
        * compareTo() return type is int
        * */

        /*
        * S1
        * S  a  u   r   a   v
        * 83 97 117 114 97 118
        *
        * S2
        * S  a  u   r   a   v
        * 83 97 117 114 97 118
        * 0   0  0   0  0   0
        * s1.compareTo(s2) = 0;
        * */

         String s1 ="Saurav";
         String s2 ="Saurav";
        int res = s1.compareTo(s2); //s1-s2
        System.out.println(res);

        /*
        * s1.compareTo(s2) ==0 equals
        * s1.compareTo(s2) > 0 s1 is greater
        * s1.compareTo(s2)<0 s2 is greater
        *
        * */


        //example 2

        /*
        * S  A  C  H   I  N
        * 83 65 67  72 73 78
        *
        * S   A   U   R   A   V
        * 83  65  85  82  65  86
        *
        * 0   0   -18  -10  8  -12 will return the first +ve or +ve value lexicographically
        * */

        String  s3 = "SACHIN";
        String  s4 ="SACHIN";
        System.out.println(s3.compareTo(s4));

        String  s5 = "SACHIN";
        String  s6 ="SAURAV";
        System.out.println(s5.compareTo(s6));


        String s7 = "ZXCVBNBNHITYHCXSW";
        String s8 ="ZXCDPOVBBMNK";
        System.out.println(s7.compareTo(s8));
    }
}
