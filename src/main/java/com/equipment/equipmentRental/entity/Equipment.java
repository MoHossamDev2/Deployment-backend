package com.equipment.equipmentRental.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "equipment")
@Data
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "category_id")
    private int category;


    @Column(name = "rental_price")
    private int rentalPrice;


    @Column(name = "quantity")
    private int quantity;

    @Column(name = "quantity_available")
    private int quantityAvailable;

    @Column(name = "img")
    private String img;
//    public Equipment(){
//
//    }

//    public Equipment(String name, String description, int category, int rentalPrice, int quantity, int quantityAvailable) {
//        this.name = name;
//        this.description = description;
//        this.category = category;
//        this.rentalPrice = rentalPrice;
//        this.quantity = quantity;
//        this.quantityAvailable = quantityAvailable;
//
//    }
}


