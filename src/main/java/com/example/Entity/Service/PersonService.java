package com.example.Entity.Service;


import com.example.Entity.Entity.Person;
import com.example.Entity.ExceptionHandler.PersonNotFoundException;
import com.example.Entity.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

   @Autowired
   PersonRepository personRepository;



    public Person findByName(String name) {
        return personRepository.findByName(name).orElseThrow(() ->
                new PersonNotFoundException("not found -> " + name));
    }

    public Person save(Person person) {
        Person person1 = personRepository.save(person);
        return person1;
    }

    public Person findById(Long id) {
      return personRepository.findById(id).orElseThrow(()
                -> new PersonNotFoundException("Person not found with ID: " + id));
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }

}
