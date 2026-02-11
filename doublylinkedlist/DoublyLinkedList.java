
package doublylinkedlist;


public class DoublyLinkedList {

    
    public static void main(String[] args) 
    {
        InsertValue l = new InsertValue();

        
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(40);
        l.insertAtEnd(50);

        
        l.insertAtPosition(30, 3);

        
        l.display();
    }
    
}
