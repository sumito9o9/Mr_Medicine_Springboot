package com.example.mr_medicine_springboot.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Mr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String name;
    private String age;
    private String location;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "mr")
    private List<Medicines> medicines=new ArrayList<>();
    @Override
    public String toString() {
        return "Mr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
