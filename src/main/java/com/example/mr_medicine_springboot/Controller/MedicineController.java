package com.example.mr_medicine_springboot.Controller;

import com.example.mr_medicine_springboot.Entity.Medicines;
import com.example.mr_medicine_springboot.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// medicine controller
@RestController
@RequestMapping("/medicine")
public class MedicineController {

@Autowired
public Services services;

//controller to add medicine

@PostMapping("/add/{id}")
public String addMedicine(@RequestBody Medicines medicines, @PathVariable("id") Integer id){
   return services.madicineadd(id,medicines);
}

// controller to view all medicine

@GetMapping("/view")
 public String ViewMedicine(){
  return services.medicineView();
 }

// controller to update medicine

 @PutMapping("/update/{id}")
 public String UpdateMedicine(@PathVariable("id") Integer id){
 return services.medicineUpdate(id);
 }

 // controller to delete medicine

 @GetMapping("/delete/{id}")
 public String DeleteMedicine(@PathVariable("id") Integer id){
   return services.medicineDelete(id);
 }

}
