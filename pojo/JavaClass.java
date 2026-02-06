
package pojo;


public class JavaClass extends Course
{

    public JavaClass(String coursename) {
        super(coursename);
    }

   

    

    @Override
    void joincourse(Student student) 
    {
        
        System.out.println("StudentName"+"="+student.getName());
        System.out.println("StudentId"+"="+student.getId());
        System.out.println("Student CourseName"+"="+coursename);
        
    }
    
    
}
