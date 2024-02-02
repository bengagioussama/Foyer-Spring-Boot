package com.example.foyer_oussama_bengagi.Services;


import com.example.foyer_oussama_bengagi.DAO.Entities.Reservation;
import com.example.foyer_oussama_bengagi.DAO.Repository.ChambreRepository;
import com.example.foyer_oussama_bengagi.DAO.Repository.EtudiantRepository;
import com.example.foyer_oussama_bengagi.DAO.Repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{

    ReservationRepository reservationRepository;
    ChambreRepository chambreRepository;
    EtudiantRepository etudiantRepository;


    Reservation ajouterReservationEtAssignerAChambreEtAEtudiant(Long numChambre, String cin) {


        return null;
    }

}
