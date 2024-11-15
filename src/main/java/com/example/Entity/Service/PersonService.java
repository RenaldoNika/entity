package com.example.Entity.Service;


import com.example.Entity.Entity.Person;
import com.example.Entity.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {


    @Autowired
    PersonRepository personRepository;


    public Person save(Person person) {
        Person person1 = personRepository.save(person);
        return person1;
    }

    public Optional<Person> findById(Long id) {
        Optional<Person> person = personRepository.findById(id);
        return person;
    }

    public void deleteById(Long id){
        personRepository.deleteById(id);
    }

}
