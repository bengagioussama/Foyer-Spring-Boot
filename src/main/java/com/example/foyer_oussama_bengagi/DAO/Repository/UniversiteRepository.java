package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    //1- Afficher la liste des universités qui ont des étudiants dont leurs
    // noms contiennet la chaine de caractère en paramètre et leurs dates de
    // naissance entre deux dates passées en paramètre

    List<Universite> findByNomEtudiantContains(String x, LocalDate date1, LocalDate date2);

}
