package com.example.mr_medicine_springboot.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Medicines {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String expiry;
    @ManyToOne
    @JsonIgnore
    private Mr mr;
    @Override
    public String toString() {
        return "Medicines{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expiry='" + expiry + '\'' +
                '}';
    }
}
