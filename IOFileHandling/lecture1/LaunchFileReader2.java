package IOFileHandling.lecture1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchFileReader2 {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        String path = "/Users/prashantkumartiwary/Documents/FileHandling";
        try {
            File directory = new File(path);
            File file = new File(directory, "Java2.txt");

            reader = new FileReader(file);
//            System.out.println(file.length());// number of characters length in the file

//            int len = (int) file.length(); // return in long
//            System.out.println(len);

//            char [] arr = new char[len];
//            reader.read(arr);
//
//            for(char c : arr) {
//                System.out.print(c + " ");
//            }

//            System.out.println();
//            int i = reader.read();//74 J ascii

//            System.out.println(i);
//            while (i != -1) { // -1 is message for application that no more data is there
//                char c = (char) reader.read();
//                System.out.print(c+" ");
//                System.out.println(i + " " + (char) i);
//                i = reader.read();
//            }
            char c = (char) reader.read();
            System.out.println(c);
            int size = (int) file.length();
            System.out.println(size);
            char[] cArray = new char[size];

            reader.read(cArray);
            for (char cr : cArray) {
                System.out.print(cr + " ");
            }

        } catch (Exception e) {
            System.out.println("some exception w.r.t to IO");
        } finally {
            reader.close();
        }
    }
}
