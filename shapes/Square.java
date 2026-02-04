
package shapes;


public class Square extends Shape {

    public Square(double side) {
        super(side);
    }

    @Override
    double calculatearea() 
    {
        return value*value;
    }
    
}
