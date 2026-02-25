
package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandling2 
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            bw.write(line.toUpperCase());
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Content converted to uppercase.");
    }
    }
    

