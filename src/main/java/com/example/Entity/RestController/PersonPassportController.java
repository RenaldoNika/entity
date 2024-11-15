package com.example.Entity.RestController;


import com.example.Entity.Entity.Passport;
import com.example.Entity.Entity.Person;
import com.example.Entity.ExceptionHandler.PassportNotFoundException;
import com.example.Entity.ExceptionHandler.PersonNotFoundException;
import com.example.Entity.Service.PassportService;
import com.example.Entity.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonPassportController {

    @Autowired
    PassportService passportService;
    @Autowired
    PersonService personService;


    @PostMapping("/link")
    public ResponseEntity<String>save(@RequestParam long idPerson,@RequestParam long idPassport){
        Person person= personService.findById(idPassport)
                .orElseThrow(()->new PersonNotFoundException(idPerson+" not found"));
        Passport passport=passportService.findbyId(idPassport)
                .orElseThrow(()->new PassportNotFoundException(idPassport+" not found"));
        person.setPassport(passport);
        passport.setPerson(person);
        personService.create(person);
        passportService.save(passport);
        return ResponseEntity.ok("Done");
    }
}
