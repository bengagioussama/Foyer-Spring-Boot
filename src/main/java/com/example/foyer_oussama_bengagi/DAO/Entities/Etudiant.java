package com.example.foyer_oussama_bengagi.DAO.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Etudiant")

public class Etudiant {

    @Id
    @Column(name = "idEtudiant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private LocalDate dateNaissance;

}
