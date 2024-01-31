package IOFileHandling.lecture1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFileWriter {
    public static void main(String[] args) {
        String path = "/Users/prashantkumartiwary/Documents/FileHandling";
        FileWriter writer = null;
        try {
            File directory = new File(path);
            File file = new File(directory, "java2.txt");
            writer = new FileWriter(file); // opening
            writer.write("Java ");
            writer.write("\n");//line break
            writer.write(65);

            char [] aArray = {'j','a','v','a'};
            writer.write("\n");
            writer.write(aArray);

            System.out.println("Check java2.txt file in documents");

        } catch (Exception e) {
            System.out.println("Some exception occurred w.r.t IO");
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("Some exception occurred w.r.t IO");
                e.printStackTrace();
            }
        }

    }
}
