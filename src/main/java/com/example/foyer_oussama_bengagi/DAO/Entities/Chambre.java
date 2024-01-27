package com.example.foyer_oussama_bengagi.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Chambre")
public class Chambre {
    @Id
    @Column(name = "idChmabre")
    private long id;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    @JoinColumn(name = "bloc_id_bloc")


    public Bloc getBloc() {
        return bloc;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }

    @ManyToOne
    Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}
