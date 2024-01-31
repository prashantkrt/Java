package ExceptionalHandling.class4_tryWithResources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class LaunchTryWithResources {
    public static void main(String[] args) {
//        FileWriter writer = null;
//        BufferedWriter bw = null;
        String path = "/Users/prashantkumartiwary/Documents/FileHandling";

        /* doesn't need finally block while using try with resources */
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(new File(path), "Java3.txt")));
             BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File(new File(path), "Java3.txt")))) {
//            File directory = new File(path);
//            File file = new File(directory, "Java3.txt");
//            writer = new FileWriter(file);
            bw.write("Java");
            bw.write("\n");
            bw.write('j');
            char[] cArray = {'a', 'p', 'p', 'l', 'e'};
            bw.write(cArray);

            bw2.write("Java");
            bw2.write("\n");
            bw2.write('j');
            char[] cArray1 = {'a', 'p', 'p', 'l', 'e'};
            bw2.write(cArray1);

            bw2.flush();
            bw.flush();//wll remove everything from buffer and everyThing will go into the file in one go


        } catch (Exception e) {
            System.out.println("Exception occurred w.r.t to IO");
        }
    }
}
