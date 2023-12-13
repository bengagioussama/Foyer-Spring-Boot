package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Foyer;
import com.example.foyer_oussama_bengagi.DAO.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    Foyer findByNomFoyer(String nom);
    //select * from Foyer where capaciteFoyer > ....

    List<Foyer> findByCapaciteFoyerGreaterThan(int capacite);
    //select * from Foyer where capaciteFoyer < ....
    List<Foyer> findByCapaciteFoyerLessThan(int capacite);
    //select * from Foyer where capaciteFoyer < .... and capaciteFoyer > ....
    List<Foyer> findByCapaciteFoyerBetween(int min,int max);
    //Select f from Foyer f JOIN Universite u On < Condition de jointure where <condition>
    Foyer findByUniversiteNomUniversite(String nom);
    // Afficher la liste des foyers qui commportent des chambres de meme type
    //que le type passé en paramétre
    //Foyer  -- Bloc -- Chambre
    List<Foyer> getByBlocsChambresTypeC(TypeChambre typeChambre);


}
