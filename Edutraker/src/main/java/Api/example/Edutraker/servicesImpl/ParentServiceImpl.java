package Api.example.Edutraker.servicesImpl;

import Api.example.Edutraker.entities.Etudiant;
import Api.example.Edutraker.entities.Parent;
import Api.example.Edutraker.repositories.ParentRepository;
import Api.example.Edutraker.services.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service

public class ParentServiceImpl implements ParentService {

    @Autowired
    private ParentRepository parentRepository;

    @Override
    public Parent createParent(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public Parent getParent(Long parent_id) {
        return parentRepository.findById(parent_id).orElse(null);
    }

    @Override
    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }

    @Override
    public Parent updateParent(Long parent_id, Parent parent) {
        Optional<Parent> existingParentOptional = parentRepository.findById(parent_id);
        if (existingParentOptional.isPresent()) {
            Parent existingParent = existingParentOptional.get();
            existingParent.setNom(parent.getNom());
            existingParent.setPrenom(parent.getPrenom());
            existingParent.setProfession(parent.getProfession());
            existingParent.setEtudiants(parent.getEtudiants());
            return parentRepository.save(existingParent);
        } else {
            return null;
        }

    }
    @Override
    public List<Etudiant> getEtudiantParent(Long parent_id) {
        Optional<Parent> parentOptional = parentRepository.findById(parent_id);
        if (parentOptional.isPresent()) {
            Parent parent = parentOptional.get();
            return parent.getEtudiants();
        } else {

            return Collections.emptyList();
        }
    }


    @Override
    public void deleteParent(Long id) {
        parentRepository.deleteById(id);
    }
}

