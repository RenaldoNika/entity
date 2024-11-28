package com.example.Entity.RestController;


import com.example.Entity.Entity.Person;
import com.example.Entity.Service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class PersonController {


    PersonService personService;


    @Autowired
    public PersonController(PersonService personService){
        this.personService=personService;
    }

    @PostMapping("/person/save")
    public ResponseEntity<Person> save(@Valid @RequestBody Person person) {
        personService.save(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        Person person = personService.findById(id);
        return new ResponseEntity<>(person,HttpStatus.ACCEPTED);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Person> personName(@PathVariable String name) {
        Person person = personService.findByName(name);
        return ResponseEntity.ok(person);

    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<Void> del(@PathVariable Long id) {
        personService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
