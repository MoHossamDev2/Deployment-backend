//package com.equipment.equipmentRental.controller;
//
//import com.equipment.equipmentRental.dao.EquipmentRepository;
//import com.equipment.equipmentRental.entity.Equipment;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//public class EquipmentController {
//
//    private final EquipmentRepository equipmentRepository;
//
//    public EquipmentController(EquipmentRepository equipmentRepository) {
//        this.equipmentRepository = equipmentRepository;
//    }
//    @GetMapping("/api/equipments")
//    public List<Equipment> getEquipments() {
//        return equipmentRepository.findAll();
//    }
//
//
////    @GetMapping("/equipments")
////    public String showEquipments(Model model) {
////        List<Equipment> equipments = equipmentRepository.findAll();
////        model.addAttribute("equipments", equipments);
////        return "equipments"; // اسم ملف الـ HTML في resources/templates
////    }
//}
