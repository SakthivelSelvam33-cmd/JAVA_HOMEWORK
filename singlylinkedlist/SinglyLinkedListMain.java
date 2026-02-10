
package singlylinkedlist;


public class SinglyLinkedListMain {

   
    public static void main(String[] args) 
    {
        InsertionDeletion id = new InsertionDeletion();
        id.insertion(25);
        id.insertion(35);
        id.insertion(42);
        id.insertion(6);
        id.insertion(64);
        id.insertion(72);
   
        id.display();
        id.deletion(6);
        id.display();
    }
    
}
