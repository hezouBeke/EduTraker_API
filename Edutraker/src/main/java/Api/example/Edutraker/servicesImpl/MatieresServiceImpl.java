package Api.example.Edutraker.servicesImpl;

import Api.example.Edutraker.entities.Matieres;
import Api.example.Edutraker.repositories.MatieresRepository;
import Api.example.Edutraker.services.MatieresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatieresServiceImpl implements MatieresService {
    @Autowired
    private MatieresRepository matieresRepository;

    @Override
    public Matieres createMatiere(Matieres matieres) {
        return matieresRepository.save(matieres);
    }

    @Override
    public Matieres getMatiere(Long id) {
        return matieresRepository.findById(id).orElse(null);
    }

    @Override
    public List<Matieres> getAllMatieres() {
        List<Matieres> matieresList = matieresRepository.findAll();
        if (matieresList.isEmpty()) {
            matieresList.add(new Matieres("Aucune matière enregistrée"));
        }
        return matieresList;
    }

    @Override
    public Matieres updateMatiere(Long id, Matieres matieres) {
        Optional<Matieres> existingMatieresOptional = matieresRepository.findById(id);
        if (existingMatieresOptional.isPresent()) {
            Matieres existingMatieres = existingMatieresOptional.get();
            existingMatieres.setNomMat(matieres.getNomMat());
            return matieresRepository.save(existingMatieres);
        } else {
            return null;
        }
    }


    @Override
    public void deleteMatiere(Long id) {
        matieresRepository.deleteById(id);
    }
}
