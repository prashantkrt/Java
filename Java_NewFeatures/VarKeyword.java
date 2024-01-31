package Java_NewFeatures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//var can have any data type
// var can be used only for the local variables not for instance variables
public class VarKeyword {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStream);
        String str = bufferedReader.readLine();
        int num = Integer.parseInt(bufferedReader.readLine());
        MyWelcomeScreenImageForTheHomePage obj = new MyWelcomeScreenImageForTheHomePage();

        ArrayList<Integer> list = new ArrayList<>();

//        InputStreamReader ins = null;
//        BufferedReader bf = null;
//        MyWelcomeScreenImageForTheHomePage welcome = null;

        var ins = new InputStreamReader(System.in);
        var bf = new BufferedReader(ins);
        var welcome = new MyWelcomeScreenImageForTheHomePage();

        var bff = new BufferedReader(new InputStreamReader(System.in));
    }
}

class MyWelcomeScreenImageForTheHomePage {

}

