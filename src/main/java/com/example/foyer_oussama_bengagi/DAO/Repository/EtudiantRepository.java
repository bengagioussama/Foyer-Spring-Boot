package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

  /*  @Query("select e from Etudiant e where e.cin = ?1")
    Etudiant findByCin(long cin);
    @Query("select e from Etudiant e where e.nomEt like ?1")
    List<Etudiant> findByNomEtLike(String nom);
    @Query("select e from Etudiant e where e.nomEt like concat('%', ?1, '%')")
    List<Etudiant> findByNomEtContains(String nom);
    @Query("select e from Etudiant e where e.nomEt like concat('%', ?1, '%')")
    List<Etudiant> findByNomEtContaining(String nom);
    Etudiant findByNomPrenom(String nom, String prenom);
    @Query("select e from Etudiant e where e.cin = ?1")
    Etudiant findByCin(String cin);
    @Query("select e from Etudiant e where e.dateNaissance > ?1")
    List<Etudiant> findByDateNaissanceAfter(LocalDate date);
    @Query("select e from Etudiant e where e.ecole = ?1")
    List<Etudiant> findByEcole(String ecole);
    List<Etudiant> findByIdReservation(long idReservation);
    List<Etudiant> findByReservationsAnnee(int annee);
    List<Etudiant> findByEcoleNomAndDateNaissanceAfter(String ecole, Date date);
    List<Etudiant> findByReservationsAnneeOrderByDateNaissanceAsc(int annee); */


}
