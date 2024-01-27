package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Foyer;
import com.example.foyer_oussama_bengagi.DAO.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {

  /*  @Query("select b from Bloc b where b.nomBloc = ?1")

    Bloc getByNomBloc(String nomBloc);
    Bloc findByNomBlocAndCapaciteBloc(String nomBloc, int capaciteBloc);
    Bloc findByNomBlocOrCapaciteBloc(String nomBloc, int capaciteBloc);
    Bloc findByNomBlocAndIgnoreCase(String nomBloc);
    Bloc findByCapaciteBlocGreaterThan(int capacite);
    Bloc findByNomBlocContaining(String x);
    Bloc findAllByOrderByNomBlocAsc();
    List<Foyer> findByBloc(Bloc bloc);
    Foyer findByIdFoyerAndBloc(Long idFoyer, Bloc bloc);
    @Modifying
    @Query("update Bloc b set b.nomBloc=?1 where b.capaciteBloc<10")
    void updateBlocJPQL(String nom);
    // Récuperer les blocs qui ont des chambres avec un typeChambre donné
    //Bloc (Child) 1--* Chambre (Parent-FK)

    @Query("select b from Bloc b join Chambre c on c.bloc.id = b.id where c.typeC = ?1")
    List<Bloc> selectBlocsByTypeChambreJPQL(TypeChambre typeChambre);

*/

    @Query("select b from Bloc b where b.nomBloc = ?1")
    Bloc findByNomBloc(String nomBloc);


}
