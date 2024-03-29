package Api.example.Edutraker.servicesImpl;

import Api.example.Edutraker.entities.Absences;
import Api.example.Edutraker.repositories.AbsencesRepository;
import Api.example.Edutraker.services.AbsencesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbsencesServiceImpl  implements AbsencesService {
    @Autowired
    private AbsencesRepository absencesRepository;

    @Override
    public Absences createAbsence(Absences absences) {
        return absencesRepository.save(absences);
    }

    @Override
    public Absences getAbsence(Long absences_id) {
        return absencesRepository.findById(absences_id).orElse(null);
    }

    @Override
    public List<Absences> getAllAbsences() {
        return absencesRepository.findAll();
    }

    @Override
    public Absences updateAbsence(Long absences_id, Absences absences) {
        Optional<Absences> existingAbsencesOptional = absencesRepository.findById(absences_id);
        if (existingAbsencesOptional.isPresent()) {
            Absences existingAbsences = existingAbsencesOptional.get();
            existingAbsences.setDateAbsence(absences.getDateAbsence());
            existingAbsences.setMotif(absences.getMotif());
            existingAbsences.setEtudiant(absences.getEtudiant());
            return absencesRepository.save(existingAbsences);
        } else {
            return null;
        }
    }


    @Override
    public void deleteAbsence(Long absences_id) {
        absencesRepository.deleteById(absences_id);
    }

}
