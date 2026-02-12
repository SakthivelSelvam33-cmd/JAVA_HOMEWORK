/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileshopmanagementsystem;

/**
 *
 * @author SHAKTHI
 */
public class MobileShop 
{
    Node head=null;
    
    void inserthead(int mobileId, String mobilebrand, double price)
    {
        Node n=new Node(mobileId,mobilebrand,price);
        
        if(head==null)
        {
            head=n;
        }
        else
        {
            
            while(head!=null)
            {
                n.next = head;
                head = n;
            }
            head=head.next;
        }
        System.out.println("Latest Launch Mobile Added Successfully");
    }
    
    void inserttail(int mobileId, String mobilebrand, double price)
    {
        Node n1=new Node(mobileId,mobilebrand,price);
        
        if(head==null)
        {
            head=n1;
        }
        
    
        else
        {
            Node temp = head;
            while (temp.next != null) 
            {
                temp = temp.next;
            }
            temp.next = n1;
        }
    
        System.out.println("Regular Stock Mobile Added Successfully");
    }
    void display() {
        if (head == null) {
            System.out.println("No mobiles available in the shop.");
            return;
        }

        Node temp = head;
        System.out.println("Available Mobiles:");
        System.out.println("-----------------------------------");

        while (temp != null) {
            System.out.println("Mobile ID   : " + temp.mobileId);
            System.out.println("Brand Name  : " + temp.mobilebrand);
            System.out.println("Price       : ₹" + temp.price);
            System.out.println("-----------------------------------");
            temp = temp.next;
        }
    }
    
}
