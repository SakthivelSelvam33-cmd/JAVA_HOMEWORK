
package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileHandling4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));

        String longest = "";

        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        sc.close();
        System.out.println("Longest word: " + longest);
    }
}
