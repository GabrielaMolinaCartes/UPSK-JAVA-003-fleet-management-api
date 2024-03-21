package com.example.demo.service;

// Importaciones de clases necesarias
import com.example.demo.models.Taxi;
import com.example.demo.repositories.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

// Clase que representa un servicio para manejar los taxis
@Service
public class TaxiService {
    private final TaxiRepository taxiRepository; // Repositorio para acceder a los datos de los taxis

    // Constructor que recibe el repositorio TaxiRepository mediante inyección de dependencias
    @Autowired
    public TaxiService(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }

    // Método para obtener todos los taxis paginados
    public Page<Taxi> getAll(int page, int size){
        Pageable pageNumber = PageRequest.of(page, size); // Crear objeto para paginación
        return taxiRepository.findAll(pageNumber);// Llamar al repositorio para obtener todos los taxis y devolverlos paginados
    }

    // Método para guardar un taxi en la base de datos
    public Taxi saveTaxi(Taxi taxi){
        return taxiRepository.save(taxi); // Llamar al repositorio para guardar el taxi y devolverlo
    }
}
