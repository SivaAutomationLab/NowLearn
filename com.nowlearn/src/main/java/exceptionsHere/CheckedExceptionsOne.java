package exceptionsHere;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionsOne  {
    public static void main(String[] args) {
       try {
            fileReading();
           throw new IOException("File not found");

       } catch (IOException e) {
            e.printStackTrace();

            //System.out.println(e.toString());
        }
    }

    public static void fileReading() {
        try {
            FileReader file = new FileReader("C:\\Users\\HP\\Desktop\\To rea.txt");
            BufferedReader fileInput = new BufferedReader(file);
            for (int i = 0; i < 3; i++) {
                System.out.println(fileInput.readLine());
            }
            //System.out.println("done");
            fileInput.close();
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
    }


}
