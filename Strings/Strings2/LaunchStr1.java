package Strings.Strings2;

public class LaunchStr1 {
    public static void main(String[] args) {
        /*
         *  Two ways to concat
         *  i) +
         *  ii) .concat()
         *
         * */

        // + operator is responsible to create memory with respect to the reference variable and direct literal
        // agar direct literal is there then scp
        // age reference variable + anything then heap area

        String str1 = "Java";
        String str2 = str1.concat(" Telusko"); // we can only join two String only
        String str3 = str1+str2+" Prashant"; // with + we can concat many string objects
        String str4 = null;
//        String str5 = str1.concat(str4);
//        System.out.println(str5); // exception null pointer exception
        //using concat we cannot add null value using .concat method.

        String str6 = str1 +str4;
        System.out.println(str6);


//        String str7 = str1.concat(100);// error  cannot added any value other than string
        String str7 = str1 + 100;
        System.out.println(str7); // no error
        //anything added to the string object considered as string only.


    }
}
