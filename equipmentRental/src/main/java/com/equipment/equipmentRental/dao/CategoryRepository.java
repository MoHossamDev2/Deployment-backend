package com.equipment.equipmentRental.dao;

import com.equipment.equipmentRental.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
