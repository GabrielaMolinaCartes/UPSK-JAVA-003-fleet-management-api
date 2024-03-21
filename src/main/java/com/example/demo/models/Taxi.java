package com.example.demo.models;

// Importaciones de clases necesarias
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Clase que representa un taxi en el sistema
@Entity // Indica que esta clase es una entidad que se puede almacenar en una base de datos
@Table(name = "taxis") // Especifica el nombre de la tabla en la base de datos
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Ignora propiedades específicas al serializar a JSON
public class Taxi {
    @Id // Indica que este atributo es la clave primaria de la entidad
    private Integer id; // ID único del taxi
    private String plate; // Patente del taxi

    // Constructor por defecto necesario para que JPA funcione correctamente
    public Taxi() {
        this.plate = "";
    } // Inicializa la patente como una cadena vacía

    // Métodos getter y setter para acceder y modificar el ID del taxi
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Métodos getter y setter para acceder y modificar la patente del taxi
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Taxi{" +
                "id=" + id +
                ", plate='" + plate + '\'' +
                '}';
    }
}
