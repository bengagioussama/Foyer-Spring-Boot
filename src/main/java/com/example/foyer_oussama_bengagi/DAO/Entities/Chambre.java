package com.example.foyer_oussama_bengagi.DAO.Entities;

import jakarta.persistence.*;


@Entity
@Table(name="Chambre")
public class Chambre {
    @Id
    @Column(name = "idChmabre")
    private long id;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

}
