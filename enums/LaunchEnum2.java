package enums;
// behind the scene class of same nae created extending the Enum internal class.

/*
class Result extends Enum{
}
 */
enum Result {
    PASS, FAIL, NR;
    //public static final Result Pass = new Result
    //public static final Result FAIL = new Result
    //public static final Result NR = new Result

    double grades;
    // 3 times will execute since three constant are there
    Result(){
        System.out.println("Constructor Invoked");
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }
}

public class LaunchEnum2 {
    public static void main(String[] args) {

        System.out.println(Result.PASS.getGrades()); //0.0
        System.out.println(Result.FAIL.getGrades()); //0.0

        Result.PASS.setGrades(23.5);
        System.out.println(Result.PASS.getGrades());//23.5

        Result.FAIL.setGrades(10);
        System.out.println(Result.FAIL.getGrades());//10.0
    }
}
