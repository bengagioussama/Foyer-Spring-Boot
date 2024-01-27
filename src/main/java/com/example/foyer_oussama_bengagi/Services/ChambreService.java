package com.example.foyer_oussama_bengagi.Services;
import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import com.example.foyer_oussama_bengagi.DAO.Entities.Chambre;
import com.example.foyer_oussama_bengagi.DAO.Repository.BlocRepository;
import com.example.foyer_oussama_bengagi.DAO.Repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{

ChambreRepository chambreRepository;
BlocRepository blocRepository;


    @Override
    public Chambre addChmabre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> updateAllChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public List<Chambre> findAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findChambreById(long id) {
       return  chambreRepository.findById(id).orElse(Chambre.builder().id(0).numeroChambre(id).build());
    }

    @Override
    public void deleteChambre(Chambre c) {

    }

    @Override
    public void deleteChambreById(long id) {

    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        List <Chambre> chambres =  chambreRepository.findAllById(numChambre);
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);
        while (!chambres.isEmpty()) {
           bloc.getChambres().add(chambres.get(0));
           chambres.remove(chambres.get(0));
        }
        return bloc;

    }
}
