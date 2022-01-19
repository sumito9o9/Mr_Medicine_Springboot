package com.example.mr_medicine_springboot.service;

import com.example.mr_medicine_springboot.Entity.Medicines;
import com.example.mr_medicine_springboot.Entity.Mr;
import com.example.mr_medicine_springboot.Repository.MedicineRepository;
import com.example.mr_medicine_springboot.Repository.MrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class Services {

@Autowired
    public MedicineRepository medicineRepository;
@Autowired
    public MrRepository mrRepository;

// method to add mr
public String addMr(@RequestBody Mr mr){
    Mr save = this.mrRepository.save(mr);
    return save.toString();
}

// method to view all mr
public String ViewMr(){
    List<Mr> all = this.mrRepository.findAll();
    return all.toString();

}
// method to update mr
 public String  mrUpdate(@PathVariable("id") Integer id){
     Optional<Mr> byId = this.mrRepository.findById(id);
     Mr mr1 = byId.get();
     Mr save = this.mrRepository.save(mr1);
     return save.toString();
 }

 // method to delete mr
    public String mrDelete(Integer id){
        Optional<Mr> byId = this.mrRepository.findById(id);
        Mr mr = byId.get();
        this.mrRepository.delete(mr);
        return mr.toString()+"   deleted";
    }



    // methoda for medicines

  // method to add medicine

    public String madicineadd(Integer id, Medicines medicines){
        Optional<Mr> byId = this.mrRepository.findById(id);
        Mr mr = byId.get();
        medicines.setMr(mr);
        Medicines save = this.medicineRepository.save(medicines);
        return save.toString();

    }

    // method to view medicine
    public String medicineView(){
        List<Medicines> all = this.medicineRepository.findAll();
        return all.toString();
    }

// method to update medicines

    public String medicineUpdate(Integer id){
        Optional<Medicines> byId = this.medicineRepository.findById(id);
        Medicines medicines = byId.get();
        Medicines save = this.medicineRepository.save(medicines);
        return save.toString();

    }
     public String medicineDelete(Integer id){
         Optional<Medicines> byId = this.medicineRepository.findById(id);
         Medicines medicines = byId.get();
         this.medicineRepository.delete(medicines);
         return medicines.toString() + "Deleted";
     }

}
