
package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandling3 
{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim().replaceAll("\\s+", " ");
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Extra spaces removed.");
    }
    
}
