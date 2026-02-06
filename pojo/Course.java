
package pojo;


public abstract class Course 
{
    protected String coursename;

    public Course(String coursename) {
        this.coursename = coursename;
    }

    

   
    
    abstract void joincourse(Student student);
    
}
