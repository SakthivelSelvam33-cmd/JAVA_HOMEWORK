
package innerclass;


public class ShoppingCartSystem 
{
    String cartOwnerName;
    Item item; 

    class Item 
    {

        private String itemName;
        private int quantity;
        private double[] priceHistory;
        private double latestPrice;

        void addItem(String name, int qty, int priceUpdates) 
        {
            this.itemName = name;
            this.quantity = qty;
            priceHistory = new double[priceUpdates]; 
        }

        // Add price history
        void addPriceHistory(Scanner sc)
        {
            if (priceHistory == null) 
            {
                System.out.println("Please add item first!");
                return;
            }

            System.out.println("Enter Prices:");
            for (int i = 0; i < priceHistory.length; i++) 
            {
                priceHistory[i] = sc.nextDouble();
            }

            latestPrice = priceHistory[priceHistory.length - 1];
        }

        double calculateTotal() 
        {
            return latestPrice * quantity;
        }

        void displayDetails() 
        {

            System.out.println("Cart Owner: " + cartOwnerName);
            System.out.println("Item Name: " + itemName);
            System.out.println("Quantity: " + quantity);

            System.out.print("Price History: ");
            for (double p : priceHistory) {
                System.out.print(p + " ");
            }

            System.out.println("Latest Price: " + latestPrice);
            System.out.println("Total Bill: " + calculateTotal());
        }
    }
}

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        ShoppingCart.Item item = cart.new Item();

        int choice;

        do {
            System.out.println("===== SHOPPING CART MENU =====");
            System.out.println("1. Add Item");
            System.out.println("2. Update Price History");
            System.out.println("3. Calculate Total Bill");
            System.out.println("4. Display Cart Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Cart Owner Name: ");
                    cart.cartOwnerName = sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Number of Price Updates: ");
                    int updates = sc.nextInt();

                    item.addItem(name, qty, updates);
                    break;

                case 2:
                    item.addPriceHistory(sc);
                    break;

                case 3:
                    double total = item.calculateTotal();
                    System.out.println("Total Bill: " + total);
                    break;

                case 4:
                    item.displayDetails();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

    }
}
    

