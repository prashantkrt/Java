package IOFileHandling.lecture1;

import java.io.File;
import java.io.IOException;

public class LaunchFile2 {
    public static void main(String[] args) {
        String path = "/Users/prashantkumartiwary/Documents/FileHandling/java.txt";//file
        String path2 = "/Users/prashantkumartiwary/Documents/FileHandling/Java";//folder
        String path3 = "/Users/prashantkumartiwary/Documents/FileHandling";
        try {
            File file = new File(path);
            file.createNewFile();

            System.out.println(file.exists());//true
            System.out.println(file.isFile());//true
            System.out.println(file.isDirectory()); //false

            System.out.println(file.getAbsolutePath());///Users/prashantkumartiwary/Documents/FileHandling/java.txt
            System.out.println(file.getName());//java.txt

            File directory = new File(path2);
            directory.mkdir();//will create new directory

            System.out.println(directory.exists());//true
            System.out.println(directory.isFile());//false
            System.out.println(directory.isDirectory()); //true

            File file3 = new File(path3);
            String[] ar = file3.list(); // list of files / folders in that directory
            for (String a : ar) {
                System.out.println(a);
            }

        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}
