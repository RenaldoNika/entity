package com.example.Entity.Repository;

import com.example.Entity.Entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PassaportRepository extends JpaRepository<Passport,Long> {
}
