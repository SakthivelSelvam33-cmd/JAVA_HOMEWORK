
package shapes;


public class Circle extends Shape
{
    
    Circle(double radius)
    {
        super(radius);
        
    }

    @Override
    double calculatearea() 
    {
         return 3.14*value*value;
    }
    
    
}
