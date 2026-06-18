package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FoodInformation")
public class FoodController 
{
   @Autowired
   private FoodService service;

   @PostMapping("/InsertData")
   public Food insertFood(@RequestBody Food items)
   {
        return service.addFood(items);
   }

   @GetMapping("/GetData")
   public List<Food> getDetails()
   {
      return service.getAllDetails();
   }
   @PutMapping("/UpdateData")
    public Food updateFood(@RequestBody Food food) {
        return service.UpdateFood(food);
    }
    @DeleteMapping("/DeleteData/{id}")
    public String deleteDatabyId(@PathVariable int id)
    {
       service.deleteById(id);
       return "deleted successfully";
    }






    
}
