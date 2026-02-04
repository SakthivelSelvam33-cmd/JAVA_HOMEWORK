
package onlinefoodordersystem;


public class FoodOrder extends Customer implements Order
{
    String FoodItem;
    int price;

    public FoodOrder(String CustomerName,String FoodItem,int price) 
    {
        super(CustomerName);
        this.FoodItem=FoodItem;
        this.price=price;
    }

    @Override
    public void placeorder() 
    {
        System.out.println("Order place successfully");
    }

    @Override
    public void Bill() 
    {
        System.out.println("*******Bill details********");
        System.out.println("Customer Name"+"="+CustomerName);
        System.out.println("Food Item"+"="+FoodItem);
        System.out.println("Price"+"="+price);
        
    }
    
    
}
