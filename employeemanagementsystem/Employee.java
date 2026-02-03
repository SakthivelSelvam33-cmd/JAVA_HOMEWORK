
package employeemanagementsystem;


public class Employee 
{
    String name;
    double salary;
    
    Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public void displayinfo()
    {
        System.out.println("EmployeeName"+"="+name);
        System.out.println("EmployeeSalary"+"="+salary);
    }
    }

