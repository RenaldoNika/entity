package com.example.Entity.Service;


import com.example.Entity.Entity.Passport;
import com.example.Entity.Repository.PassaportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassportService {


    @Autowired
    PassaportRepository passaportRepository;


    public Passport save(Passport passport) {
        Passport passport1 = passaportRepository.save(passport);
        return passport;
    }

    public void deleteById(Long id) {
        passaportRepository.deleteById(id);
    }

    public Optional<Passport> findbyId(Long id) {
        return passaportRepository.findById(id);
    }
}
