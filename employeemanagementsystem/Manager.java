
package employeemanagementsystem;


public class Manager extends Employee
{
    String department;
    
    Manager(String name,double salary,String department)
    {
        super(name,salary);
        this.department=department;
    }
    public void displayinfo()
    {
        System.out.println("Department"+"="+department);
        
    }
    
}
