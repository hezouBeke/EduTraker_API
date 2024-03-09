package Api.example.Edutraker.services;

import Api.example.Edutraker.entities.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EtudiantService {
    Etudiant createEtudiant(Etudiant etudiant);

    Etudiant getEtudiant(Long id);

    List<Etudiant> getAllEtudiants();

    Etudiant updateEtudiant(Long id, Etudiant etudiant);

    void deleteEtudiant(Long id);
}
