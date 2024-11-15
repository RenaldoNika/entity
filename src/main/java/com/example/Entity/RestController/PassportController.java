package com.example.Entity.RestController;


import com.example.Entity.Entity.Passport;
import com.example.Entity.ExceptionHandler.PassportNotFoundException;
import com.example.Entity.Repository.PassaportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PassportController {


    @Autowired
    PassaportRepository passaportRepository;


    @PostMapping("/pass/save")
    public ResponseEntity<Passport> save(@RequestBody Passport passport) {
        Passport passport1 = passaportRepository.save(passport);
        return ResponseEntity.ok(passport1);
    }


    @GetMapping("/pass/{id}")
    public ResponseEntity<Passport> findbyId(@PathVariable Long id) {
        Passport passport = passaportRepository.findById(id)
                .orElseThrow(() -> new PassportNotFoundException(id + " Not Found"));
        return ResponseEntity.ok(passport);
    }


}
