package IOFileHandling.lecture2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//BufferWriterFileWriter
//fasten write
public class LaunchBWFW {
    public static void main(String[] args) {

        FileWriter writer = null;
        BufferedWriter bw = null;
        String path = "/Users/prashantkumartiwary/Documents/FileHandling";
        try {
            File directory = new File(path);
            File file = new File(directory, "Java3.txt");
            writer = new FileWriter(file);
//            writer.write("Java");
//            writer.write("\n");
//            writer.write((int) 65);
//            writer.write('j');
//
//            char[] cArray = {'a', 'p', 'p', 'l', 'e'};
//            writer.write(cArray);
            // for enhancement purpose we are using BW
            // number of hard-disks hit will reduce
            // increases the performance
            bw = new BufferedWriter(writer);
            bw.write(65);
            char[] cArray = {'a', 'p', 'p', 'l', 'e'};
            bw.write(cArray);

            bw.flush();//wll remove everything from buffer and everyThing will go into the file in one go

        } catch (Exception e) {
            System.out.println("Exception occurred w.r.t to IO");
        } finally {
            try {
                writer.close();
                bw.close();
            } catch (IOException e) {
                System.out.println("Exception occurred w.r.t to IO");
                e.printStackTrace();
            }
        }
    }
}
