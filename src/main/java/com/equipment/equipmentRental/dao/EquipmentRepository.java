package com.equipment.equipmentRental.dao;

import com.equipment.equipmentRental.entity.Category;
import com.equipment.equipmentRental.entity.Equipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface EquipmentRepository extends JpaRepository<Equipment,Long> {
    Page<Equipment> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

    Page<Equipment> findByCategory(@RequestParam("category") int category, Pageable pageable);
}
