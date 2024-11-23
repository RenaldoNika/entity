package com.example.Entity.RestController;


import com.example.Entity.Entity.Passport;
import com.example.Entity.Entity.Person;
import com.example.Entity.Service.PassportService;
import com.example.Entity.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class PersonPassportController {

    @Autowired
    PassportService passportService;
    @Autowired
    PersonService personService;


    @PostMapping("/link")
    public ResponseEntity<String> save(@RequestParam long idPerson, @RequestParam long idPassport) {

        Person person = personService.findById(idPerson);
        Passport passport = passportService.findbyId(idPassport);

        List<Person> personList = new ArrayList<>();
        personList.add(person);

        person.setPassport(passport);

        personService.save(person);
        return ResponseEntity.ok("Done");
    }
}
