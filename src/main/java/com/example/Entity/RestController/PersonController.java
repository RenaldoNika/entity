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
        personService.save(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        Person person = personService.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Person not found with ID: " + id));
        return ResponseEntity.ok(person);
    }


}
