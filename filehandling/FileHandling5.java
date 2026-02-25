
package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;


public class FileHandling5 
{
    public static void main(String[] args) throws IOException {
         BufferedWriter bw = new BufferedWriter(new FileWriter("date.txt"));

        LocalDate today = LocalDate.now();
        bw.write("Today's Date: " + today);

        bw.close();

        System.out.println("Date written to file successfully.");
    }
    
}
