package IOFileHandling.lecture2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//PrintWriter
public class LaunchPW {
    public static void main(String[] args) throws FileNotFoundException {
        File directory = new File("/Users/prashantkumartiwary/Documents/FileHandling");
        File file = new File(directory, "Coding.txt");

        PrintWriter print = new PrintWriter(file);

        print.println(true);
        print.println(14);
        print.println(34.33);
        print.println("Java");
        print.println('c');

        print.close();
    }
}
