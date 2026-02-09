
package shoppingcartapplications;


public class ShoppingCart 
{
    Product head;
    void addvalue(int productid,String productname,double price)
    {
        Product p=new Product(productid, productname, price);
        
        if(head==null)
        {
            head=p;
            
        }
        
        else
        {
            Product temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=p;
            System.out.println("Product added successfully");
        }
                
    }
    void display()
    {
        Product temp=head;
        if(temp==null)
        {
            System.out.println("List is empty");
        }
        
        System.out.println("**********view cart**********");
            while(temp!=null)
            {
                System.out.println("ProductId"+"="+temp.productid+"");
                System.out.println("ProductName"+"="+temp.productname+"");
                System.out.println("ProductPrice"+"="+temp.price+"--->");
                temp=temp.next;
            }
        
    }
    
}
