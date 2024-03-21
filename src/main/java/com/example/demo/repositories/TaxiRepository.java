package com.example.demo.repositories;

import com.example.demo.models.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Integer> {
}
