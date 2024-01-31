package enums;
enum Result1{
    PASS, FAIL, NR;
}
public class LaunchEnum3 {
    public static void main(String[] args) {
          int i =14;
          String data = "Java";
          Result1 result = Result1.PASS;
          switch (result)
          {
              case PASS -> System.out.println("Pass the exam");
              case FAIL -> System.out.println("Fail the exam");
              case NR -> System.out.println("No Result");
              default -> System.out.println("Wrong choice");
          }
    }
}

/*
* Group of named constant is called as enum
*
* */
