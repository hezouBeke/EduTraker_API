package Api.example.Edutraker.services;

import Api.example.Edutraker.entities.Absences;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AbsencesService {
    Absences createAbsence(Absences absences);

    Absences getAbsence(Long id);

    List<Absences> getAllAbsences();

    Absences updateAbsence(Long absences_id, Absences absences);

    void deleteAbsence(Long absences_id);
}
