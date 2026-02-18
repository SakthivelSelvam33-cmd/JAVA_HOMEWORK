
package thread;


public class PermanentEmployee extends Employee implements Runnable
{
    
    public PermanentEmployee(double salary) {
        super(salary);
    }
    
    public void employeeSalary()
    {
        System.out.println("Permanent Employee salary is "+salary);
    }

    @Override
    public void run() 
    {
        System.out.print("Permanent Employee Salary Calculated");
    }
    
    
}
