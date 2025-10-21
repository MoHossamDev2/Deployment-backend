package com.equipment.equipmentRental.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Equipment> equipments;


    public Category() {

    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
