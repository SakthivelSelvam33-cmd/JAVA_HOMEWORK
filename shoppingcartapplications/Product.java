
package shoppingcartapplications;


public class Product 
{
    int productid;
    String productname;
    double price;
    Product next;

    public Product(int productid, String productname, double price) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
        this.next=null;
    }
    
    
    
}
