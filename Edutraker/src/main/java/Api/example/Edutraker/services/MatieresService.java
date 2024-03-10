package Api.example.Edutraker.services;

import Api.example.Edutraker.entities.Matieres;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatieresService {
    Matieres createMatiere(Matieres matieres);

    Matieres getMatiere(Long mat_id);

    List<Matieres> getAllMatieres();

    Matieres updateMatiere(Long mat_id, Matieres matieres);

    void deleteMatiere(Long mat_id);
}
