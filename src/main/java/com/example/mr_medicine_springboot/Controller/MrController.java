package com.example.mr_medicine_springboot.Controller;

import com.example.mr_medicine_springboot.Entity.Mr;
import com.example.mr_medicine_springboot.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Mr Controler

@RestController
@RequestMapping("/mr")
public class MrController {


    @Autowired
    public Services services;

    // Controller to add mr

    @PostMapping("/add")
    public String AddMr(@RequestBody Mr mr){
      return services.addMr(mr);

    }
// controller to view mr

    @GetMapping("/view")
    public String ViewMr(){
        return services.ViewMr();
    }

// controller to update mr

    @PutMapping("/update/{id}")
    public String UpdateMr(@PathVariable("id") Integer id){
     return services.mrUpdate(id);
    }

// controller to delete mr
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
       return services.mrDelete(id);
    }
}
