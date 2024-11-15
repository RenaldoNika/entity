package com.example.Entity.RestController;


import com.example.Entity.Entity.Person;
import com.example.Entity.ExceptionHandler.PersonNotFoundException;
import com.example.Entity.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/person/save")
    public ResponseEntity<Person>save(@RequestBody Person person){
        personService.create(person);
        return ResponseEntity.ok(person);
    }


    @GetMapping("/person")
    public ResponseEntity<?> getPersonById(@RequestParam Long id) {
        Person person = personService.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Person not found with ID: " + id));
        return ResponseEntity.ok(person.getName());
    }


}
