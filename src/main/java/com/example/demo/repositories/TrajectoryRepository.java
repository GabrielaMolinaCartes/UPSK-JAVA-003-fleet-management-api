package com.example.demo.repositories;

// Importaciones de clases necesarias
import com.example.demo.models.Trajectory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

// Interfaz que define un repositorio para la entidad Trajectory
@Repository // Indica que esta interfaz es un repositorio
public interface TrajectoryRepository extends JpaRepository<Trajectory, Integer> {
    // Método para buscar las trayectorias de un taxi entre dos fechas, ordenadas por fecha de forma descendente
    Page<Trajectory> findByTaxiIdAndDateBetweenOrderByDateDesc(Integer taxiId, LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);
}
