package com.example.demo.controllers;

// Importaciones de clases necesarias
import com.example.demo.models.Taxi;
import com.example.demo.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;

// Controlador REST para manejar las solicitudes relacionadas con los taxis
@RestController
@RequestMapping("/api/taxis")
public class TaxiController {

    private final TaxiService taxiService; // Servicio para manejar los taxis

    // Constructor que recibe el servicio TaxiService mediante inyección de dependencias
    @Autowired
    public TaxiController(TaxiService taxiService) {
        this.taxiService = taxiService;
    }


    // Método para obtener todos los taxis paginados
    @GetMapping
    public Page<Taxi> getAll(@RequestParam(defaultValue = "0") int page, // Número de página
                             @RequestParam(defaultValue = "10") int size) { // Tamaño de la cantidad de registros
        // Llamar al servicio para obtener todos los taxis y devolverlos paginados
        return taxiService.getAll(page, size);
    }
}
