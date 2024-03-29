package Api.example.Edutraker.servicesImpl;

import Api.example.Edutraker.entities.Etudiant;
import Api.example.Edutraker.repositories.EtudiantRepository;
import Api.example.Edutraker.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EtudiantServiceImpl implements EtudiantService{

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant getEtudiant(Long etud_id) {
        return etudiantRepository.findById(etud_id).orElse(null);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant updateEtudiant(Long etud_id, Etudiant etudiant) {
        Optional<Etudiant> existingEtudiantOptional = etudiantRepository.findById(etud_id);
        if (existingEtudiantOptional.isPresent()) {
            Etudiant existingEtudiant = existingEtudiantOptional.get();
            existingEtudiant.setNom(etudiant.getNom());
            existingEtudiant.setPrenom(etudiant.getPrenom());
            existingEtudiant.setSalle(etudiant.getSalle());
            existingEtudiant.setFiliere(etudiant.getFiliere());
            existingEtudiant.setNotes(etudiant.getNotes());
            existingEtudiant.setRetard(etudiant.getRetard());
            existingEtudiant.setAbsences(etudiant.getAbsences());
            return etudiantRepository.save(existingEtudiant);
        } else {
            return null;
        }
    }


    @Override
    public void deleteEtudiant(Long etud_id) {
        etudiantRepository.deleteById(etud_id);
    }
}
