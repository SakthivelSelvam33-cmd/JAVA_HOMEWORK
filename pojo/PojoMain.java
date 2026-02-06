
package pojo;

import java.util.Scanner;


public class PojoMain {

    
    public static void main(String[] args) 
    {
        //Scanner sc=new Scanner(System.in);
        //String coursename=sc.nextLine();
        Student s=new Student(1,"sakthi");
        JavaClass c=new JavaClass("java");
        s.setName("Ravi");
        s.setId(8992);
        c.joincourse(s);
        
    }
    
}
