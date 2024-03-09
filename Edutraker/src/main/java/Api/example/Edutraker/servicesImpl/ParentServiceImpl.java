package Api.example.Edutraker.servicesImpl;

import Api.example.Edutraker.entities.Etudiant;
import Api.example.Edutraker.entities.Parent;
import Api.example.Edutraker.repositories.ParentRepository;
import Api.example.Edutraker.services.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Parent getParent(Long id) {
        return parentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }

    @Override
    public Parent updateParent(Long id, Parent parent) {
        Optional<Parent> existingParentOptional = parentRepository.findById(id);
        if (existingParentOptional.isPresent()) {
            Parent existingParent = existingParentOptional.get();
            existingParent.setNom(parent.getNom());
            existingParent.setPrenom(parent.getPrenom());
            existingParent.setProfession(parent.getProfession());
            existingParent.setEtudiant(parent.getEtudiant());
            return parentRepository.save(existingParent);
        } else {
            return null;
        }

    }
    @Override
    public Etudiant getEtudiantParent(Long parentId) {
        Optional<Parent> parentOptional = parentRepository.findById(parentId);
        if (parentOptional.isPresent()) {
            Parent parent = parentOptional.get();
            return parent.getEtudiant();
        } else {
            return null;
        }
    }

    @Override
    public void deleteParent(Long id) {
        parentRepository.deleteById(id);
    }
}

