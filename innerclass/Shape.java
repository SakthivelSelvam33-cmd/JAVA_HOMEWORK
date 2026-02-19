
package innerclass;

interface circle
{
    void add();
}
public class Shape 
{
    public static void main(String[] args) {
        circle s1=()->System.out.println("circle");
        s1.add();
    }
    
}
