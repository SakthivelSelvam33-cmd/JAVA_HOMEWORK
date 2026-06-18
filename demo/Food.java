package com.example.demo;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Food 
{//name,price,category,availability
    @Id
    private int id;
    private String name;
    private double price;
    private String category;
    private int availability;
    public Food() {
    }
    public Food(int id, String name, double price, String category, int availability) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.availability = availability;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getAvailability() {
        return availability;
    }
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    
    

    
}
