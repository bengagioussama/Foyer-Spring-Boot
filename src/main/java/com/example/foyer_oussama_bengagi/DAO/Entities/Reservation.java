package com.example.foyer_oussama_bengagi.DAO.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="Reservation")
public class Reservation {
    @Id
    @Column(name = "idReservation")
    private String id;
    private LocalDate anneeUniversitaire;
    private boolean estValide;
}
