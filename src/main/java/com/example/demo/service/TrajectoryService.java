package com.example.demo.service;

// Importaciones de clases necesarias
import com.example.demo.models.Trajectory;
import com.example.demo.repositories.TrajectoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

// Clase que representa un servicio para manejar las trayectorias de los taxis
@Service
public class TrajectoryService {
    private final TrajectoryRepository trajectoryRepository; // Repositorio para acceder a los datos de las trayectorias

    // Constructor que recibe el repositorio TrajectoryRepository mediante inyección de dependencias
    @Autowired
    public TrajectoryService(TrajectoryRepository trajectoryRepository){
        this.trajectoryRepository = trajectoryRepository;
    }

    // Método para obtener las trayectorias de un taxi en un día específico, paginadas
    public Page<Trajectory> getTrajectory(Integer taxiId, LocalDateTime startDate, int pageNumber, int quantitySize){
        // Calcular la fecha y hora de finalización del día
        LocalDateTime endDateTime = startDate.plusDays(1).minusSeconds(1); // Obtener el final del día
        // Crear objeto para paginación
        Pageable page = PageRequest.of(pageNumber, quantitySize);
        // Llamar al repositorio para buscar las trayectorias por ID de taxi y fecha, ordenadas por fecha de forma descendente
        return trajectoryRepository.findByTaxiIdAndDateBetweenOrderByDateDesc(taxiId, startDate, endDateTime, page);
        //return trajectoryRepository.findByTaxiIdAndDateGreaterThanEqualAndDateBeforeOrderByDateDesc(taxiId, startDate, endDate, page);
    }

}
