package com.example.foyer_oussama_bengagi.Services;

import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import com.example.foyer_oussama_bengagi.DAO.Entities.Chambre;

import java.util.List;

public interface IChambreService {

    Bloc addChmabre(Chambre c);
    List<Chambre> addAllChambres(List<Chambre> chambres);

    Bloc updateChambre(Chambre c);
    List<Chambre> updateAllChambres(List<Chambre> chambres);
    List<Chambre> findAllChambres();
    Bloc findChambreById(long id);
    void deleteChambre(Chambre c);
    void deleteChambreById(long id);
}
