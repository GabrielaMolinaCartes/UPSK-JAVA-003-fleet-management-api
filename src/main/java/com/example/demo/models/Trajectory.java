package com.example.demo.models;

// Importaciones de clases necesarias
import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

// Clase que representa una trayectoria de un taxi
@Entity // Indica que esta clase es una entidad que se puede almacenar en una base de datos
@Table(name = "trajectories") // Especifica el nombre de la tabla en la base de datos
public class Trajectory {
    @Id // Indica que este atributo es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del valor de la clave primaria
    private Integer id; // ID único de la trayectoria

    @ManyToOne(fetch = FetchType.LAZY) // Relación many-to-one con la clase Taxi, carga perezosa
    @JoinColumn(name = "taxi_id") // Nombre de la columna que representa la clave externa a la tabla taxis
    private Taxi taxi; // Taxi al que pertenece la trayectoria
    private LocalDateTime date; // Fecha y hora de la trayectoria
    private Double latitude; // Latitud de la ubicación
    private Double longitude; // Longitud de la ubicación

    // Constructor vacío requerido por JPA
    public Trajectory() {
    }

    // Constructor que inicializa todos los atributos de la trayectoria
    public Trajectory(Taxi taxi, LocalDateTime date, Double latitude, Double longitude) {
        this.taxi = taxi;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Métodos getter y setter para acceder y modificar el ID de la trayectoria
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Métodos getter y setter para acceder y modificar el taxi de la trayectoria
    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    // Métodos getter y setter para acceder y modificar la fecha y hora de la trayectoria
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    // Métodos getter y setter para acceder y modificar la latitud de la ubicación
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    // Métodos getter y setter para acceder y modificar la longitud de la ubicación
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Trajectory{" +
                "id=" + id +
                ", taxi=" + taxi +
                ", date=" + date +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
