package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {

    Bloc findByNomBloc(String nomBloc);
    Bloc getByNomBloc(String nomBloc);
    Bloc findByNomBlocAndCapaciteBloc(String nomBloc, int capaciteBloc);
    Bloc findByNomBlocOrCapaciteBloc(String nomBloc, int capaciteBloc);
    //4- Recherche par nomBloc en ignorant la casse
    Bloc findByNomBlocAndIgnoreCase(String nomBloc);
    //5- Recherche par capaciteBloc supérieure à une valeur donnée
    Bloc findByCapaciteBlocGreaterThan(int capacite);
    //6- Recherche par nomBloc contenant une sous-chaîne
    Bloc findByNomBlocContaining(String x);
    //7- Tri par nomBloc par ordre alphabétique
    Bloc findAllByOrderByNomBlocAsc();
    //9- Recherche du bloc d'un foyer spécifique
    List<Foyer> findByBloc(Bloc bloc);
    //10- Recherche du bloc pour un foyer d'une université donnée
    Foyer findByIdFoyerAndBloc(Long idFoyer, Bloc bloc);




}
