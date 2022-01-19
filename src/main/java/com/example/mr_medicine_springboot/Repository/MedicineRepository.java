package com.example.mr_medicine_springboot.Repository;

import com.example.mr_medicine_springboot.Entity.Medicines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicines,Integer> {
}
