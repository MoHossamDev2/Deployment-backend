package com.equipment.equipmentRental.dao;


import com.equipment.equipmentRental.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {

    Checkout findByUserEmailAndEquipmentId(String userEmail, Long equipmentId);

    List<Checkout> findEquipmentByUserEmail(String userEmail);

//    @Modifying
//    @Query("delete from Checkout where bookId in :book_id")
//    void deleteAllByBookId(@Param("book_id") Long bookId);
}
