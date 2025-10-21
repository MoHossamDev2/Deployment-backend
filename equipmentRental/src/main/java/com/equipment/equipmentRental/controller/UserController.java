package com.equipment.equipmentRental.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000") // React port
public class UserController {

    private static final String UPLOAD_DIR = "uploads/";

    @PostMapping("/upload")
    public ResponseEntity<String> uploadProfileImage(@RequestParam("file") MultipartFile file) {
        try {
            Path uploadPath = Paths.get(UPLOAD_DIR);

            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
            Path filePath = uploadPath.resolve(fileName);

            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            // رابط الصورة النهائي
            String imageUrl = "http://localhost:8080/" + UPLOAD_DIR + fileName;
            return ResponseEntity.ok(imageUrl);

        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(" sorry is failed ");
        }
    }
}
