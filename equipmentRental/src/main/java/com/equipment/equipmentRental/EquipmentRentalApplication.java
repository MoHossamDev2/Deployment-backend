package com.equipment.equipmentRental;

import com.equipment.equipmentRental.dao.CategoryRepository;
import com.equipment.equipmentRental.dao.EquipmentRepository;
import com.equipment.equipmentRental.entity.Category;
import com.equipment.equipmentRental.entity.Equipment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class EquipmentRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquipmentRentalApplication.class, args);
	}


//    @Bean
//    public CommandLineRunner commandLineRunner(EquipmentRepository equipmentRepository,CategoryRepository categoryRepository) {
//
//        return runner -> {
//
//            // createCourseAndReviews(appDAO);
////            creteCategory(categoryRepository);
//
//            creteEquipment(equipmentRepository,categoryRepository);
//        };
//    }
//
//    public void creteCategory(CategoryRepository categoryRepository){
//        Category category1=new Category("Mobile22","very Good");
//        System.out.println( categoryRepository.save(category1));
//
//    }
//    public void creteEquipment(EquipmentRepository equipmentRepository,CategoryRepository categoryRepository){
//        Optional<Category> category1 = categoryRepository.findById(2L);
//        if (category1.isPresent()) {
//            Equipment equipment1 = new Equipment("test1", "very good", category1.get(), 100, 12, 12);
//            Equipment equipment2 = new Equipment("test2", "very good", category1.get(), 100, 12, 12);
//            equipmentRepository.save(equipment1);
//            equipmentRepository.save(equipment2);
//
//        }
//        else System.out.println("not found category");
//    }

}
