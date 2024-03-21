package com.example.demo.controllers;

// Importaciones de clases necesarias
import com.example.demo.models.Trajectory;
import com.example.demo.service.TrajectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Controlador REST para manejar solicitudes relacionadas con trayectorias de taxis
@RestController
@RequestMapping("/trajectories")
public class TrajectoryController {
    private final TrajectoryService trajectoryService;// Servicio para manejar las trayectorias

    @Autowired
    public TrajectoryController(TrajectoryService trajectoryService){
        this.trajectoryService = trajectoryService;
    }

    @GetMapping("/by-taxi")
    public Page<Trajectory>getTrajectory(
            @RequestParam Integer taxiId,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int quantitySize) {
        LocalDateTime startDateTime = startDate.atStartOfDay(); // Convertir LocalDate a LocalDateTime
        LocalDateTime endDateTime = startDateTime.plusDays(1).minusSeconds(1); // Obtener el final del día

        return trajectoryService.getTrajectory(taxiId, startDateTime, pageNumber, quantitySize);
    }

}
