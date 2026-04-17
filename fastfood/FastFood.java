
package fastfood;


public class FastFood {

    
    public static void main(String[] args) 
    {
         Pizza pizza1 = new PlainPizza();

        Pizza pizza2 = new Cheese(new PlainPizza());

        Pizza pizza3 = new Mushroom(new Cheese(new PlainPizza()));

        Pizza pizza4 = new Olive(new Mushroom(new Cheese(new PlainPizza())));

        display(pizza1);
        display(pizza2);
        display(pizza3);
        display(pizza4);
    }

    public static void display(Pizza pizza) 
    {
        System.out.println("Description : " + pizza.getDescription());
        System.out.println("Cost        : " + pizza.getCost());
        System.out.println();
    }

    
    
}
