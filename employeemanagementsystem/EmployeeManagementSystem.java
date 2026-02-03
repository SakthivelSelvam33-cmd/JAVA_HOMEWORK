
package employeemanagementsystem;


public class EmployeeManagementSystem{

    
    public static void main(String[] args) 
    {
        System.out.println("**********Employee Management*********");
        Employee e1=new Employee("Sakthi",20000);
                e1.displayinfo();
                System.out.println();
                Manager m1=new Manager("Sakthi",20000, "cs");
        m1.displayinfo();
                
        
    }
    
}
