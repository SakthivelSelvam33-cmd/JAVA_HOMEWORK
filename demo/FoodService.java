package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FoodService 
{
    @Autowired
    private FoodRepository repo;

    public Food addFood(Food items)
    {
        return repo.save(items);
    }

    public List<Food> getAllDetails()
    {
        return repo.findAll();
    }

    public Food UpdateFood(Food items)
    {
        Food food=repo.findById(items.getId()).orElse(null);
        if(food !=null)
        {
            food.setName(items.getName());
            food.setPrice(items.getPrice());
            food.setAvailability(items.getAvailability());

            return repo.save(food);
        }
        return null;

    }

    public String deleteById(int id)
    {
        repo.deleteById(id);
        return "data deleted successfully";
    }



    
}
