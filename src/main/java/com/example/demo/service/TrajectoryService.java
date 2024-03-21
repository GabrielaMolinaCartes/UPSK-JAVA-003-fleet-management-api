package com.example.demo.service;

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

@Service
public class TrajectoryService {
    private final TrajectoryRepository trajectoryRepository;

    @Autowired
    public TrajectoryService(TrajectoryRepository trajectoryRepository){
        this.trajectoryRepository = trajectoryRepository;
    }

    public Page<Trajectory> getTrajectory(Integer taxiId, LocalDateTime startDate, int pageNumber, int quantitySize){
        LocalDateTime endDateTime = startDate.plusDays(1).minusSeconds(1); // Obtener el final del día
        Pageable page = PageRequest.of(pageNumber, quantitySize);
        return trajectoryRepository.findByTaxiIdAndDateBetweenOrderByDateDesc(taxiId, startDate, endDateTime, page);
        //return trajectoryRepository.findByTaxiIdAndDateGreaterThanEqualAndDateBeforeOrderByDateDesc(taxiId, startDate, endDate, page);
    }

}
