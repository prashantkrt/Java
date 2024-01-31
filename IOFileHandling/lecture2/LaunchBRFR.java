package IOFileHandling.lecture2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//BufferReaderFileReader
public class LaunchBRFR {
    public static void main(String[] args) {

        FileReader reader = null;
        BufferedReader br = null;
        String path = "/Users/prashantkumartiwary/Documents/FileHandling";
        try {
            File directory = new File(path);
            File file = new File(directory, "Java3.txt");
            reader = new FileReader(file);
            br = new BufferedReader(reader);

//            int size = (int) file.length();
//            char[] arr = new char[size];
//            br.read(arr);
//            for (char c : arr) {
//                System.out.print(c + " ");
//            }

            String str = br.readLine();
//            System.out.println(str);

            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("Exception occurred w.r.t IO");
        } finally {
            try {
                reader.close();
                br.close();
            } catch (IOException e) {
                System.out.println("Exception occurred w.r.t IO");
                e.printStackTrace();
            }
        }


    }
}
