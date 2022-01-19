package com.example.mr_medicine_springboot.Repository;

import com.example.mr_medicine_springboot.Entity.Mr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MrRepository extends JpaRepository<Mr,Integer> {
}
