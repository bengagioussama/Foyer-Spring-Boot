package com.example.foyer_oussama_bengagi.Services;


import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import com.example.foyer_oussama_bengagi.DAO.Entities.Chambre;
import com.example.foyer_oussama_bengagi.DAO.Repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{

ChambreRepository chambreRepository;


    @Override
    public Bloc addChmabre(Chambre c) {
        return null;
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> chambres) {
        return null;
    }

    @Override
    public Bloc updateChambre(Chambre c) {
        return null;
    }

    @Override
    public List<Chambre> updateAllChambres(List<Chambre> chambres) {
        return null;
    }

    @Override
    public List<Chambre> findAllChambres() {
        return null;
    }

    @Override
    public Bloc findChambreById(long id) {
        return null;
    }

    @Override
    public void deleteChambre(Chambre c) {

    }

    @Override
    public void deleteChambreById(long id) {

    }
}
