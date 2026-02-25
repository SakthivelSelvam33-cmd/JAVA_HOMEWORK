
package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;







public class FileHandlingMain {

    
    public static void main(String[] args) throws Exception
    {
        File f1=new File("D:\\numbers.txt");
        if(f1.createNewFile())
        {
            System.out.println("File created");
        }
        else
        {
            System.out.println("File already created");
        }
        File f3=new File("D:\\input.txt");
        if(f3.createNewFile())
        {
            System.out.println("File created");
        }
        else
        {
            System.out.println("File already created");
        }
        File f4=new File("D:\\output.txt");
        if(f4.createNewFile())
        {
            System.out.println("File created");
        }
        else
        {
            System.out.println("File already created");
        }
       
        
       
            
        }
        
        
    }
    
        
       
        
        