package Strings.Strings2;

public class LaunchStr5 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        // created 2 objects one on heap area where s1 referring too. and one copy on the
        // SCP where no one is referring.
        String s2 = s1.intern();
        // this tells that in SCP what ever object is created by S1 in scp
        // wanted to use object created in SCP
        // s2 refers to "Java" in SCP area

        System.out.println(s1);
        System.out.println(s2);

        String s3 = "Java";

        System.out.println(s2==s3);


        /*
        *
        * mostly it will not be used
        * */
    }
}
