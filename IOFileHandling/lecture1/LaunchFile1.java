package IOFileHandling.lecture1;

import java.io.File;

public class LaunchFile1 {
    public static void main(String[] args) {
        try {
            File file1 = new File("/Users/prashantkumartiwary/Documents/FileHandling/java.txt");
            file1.createNewFile();
        } catch (Exception e) {
            System.out.println("some exception occurred");
            e.printStackTrace();
        }
    }
}
