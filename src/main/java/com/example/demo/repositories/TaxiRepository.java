package com.example.demo.repositories;

// Importaciones de clases necesarias
import com.example.demo.models.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Interfaz que define un repositorio para la entidad Taxi
@Repository // Indica que esta interfaz es un repositorio
public interface TaxiRepository extends JpaRepository<Taxi, Integer> {
}
