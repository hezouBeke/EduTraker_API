package Api.example.Edutraker.services;

import Api.example.Edutraker.entities.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EtudiantService {
    Etudiant createEtudiant(Etudiant etudiant);

    Etudiant getEtudiant(Long etud_id);

    List<Etudiant> getAllEtudiants();

    Etudiant updateEtudiant(Long etud_id, Etudiant etudiant);

    void deleteEtudiant(Long etud_id);
}
