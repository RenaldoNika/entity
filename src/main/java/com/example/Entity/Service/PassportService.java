package com.example.Entity.Service;


import com.example.Entity.Entity.Passport;
import com.example.Entity.ExceptionHandler.PassportNotFoundException;
import com.example.Entity.Repository.PassaportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

    public Passport findbyId(Long id) {
        return passaportRepository.findById(id)
                .orElseThrow(() -> new PassportNotFoundException("Not found : " + id));
    }
}
