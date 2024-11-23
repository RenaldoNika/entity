package com.example.Entity.RestController;


import com.example.Entity.Entity.Passport;
import com.example.Entity.ExceptionHandler.PassportNotFoundException;
import com.example.Entity.Service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PassportController {

    @Autowired
    PassportService passportService;

    @PostMapping("/pass/save")
    public ResponseEntity<Passport> save(@RequestBody Passport passport) {
        Passport passport1 = passportService.save(passport);
        return ResponseEntity.ok(passport1);
    }

    @DeleteMapping("/delPass/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        passportService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/pass/{id}")
    public ResponseEntity<Passport> findbyId(@PathVariable Long id) {
        Passport passport = passportService.findbyId(id);
        return ResponseEntity.ok(passport);
    }

}
