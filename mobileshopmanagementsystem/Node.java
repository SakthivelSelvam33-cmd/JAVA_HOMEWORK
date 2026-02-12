/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileshopmanagementsystem;

/**
 *
 * @author SHAKTHI
 */
public class Node 
{
    int mobileId;
    String mobilebrand;
    double price;
    Node next;

    public Node(int mobileId, String mobilebrand, double price) 
    {
        this.mobileId = mobileId;
        this.mobilebrand = mobilebrand;
        this.price = price;
    }
            
    
}
