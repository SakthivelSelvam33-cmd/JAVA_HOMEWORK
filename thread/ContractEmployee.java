
package thread;


public class ContractEmployee extends Employee implements Runnable
{
    
    public ContractEmployee(double salary) {
        super(salary);
    }
    public void contractEmployee()
    {
        System.out.print(" "+"Contract employee salary is"+salary);
        
    }

    @Override
    public void run() 
    {
        System.out.println("Contract Employee Salary Calculated");
    }
    
    
}
