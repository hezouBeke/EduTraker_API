package Api.example.Edutraker.services;

import Api.example.Edutraker.entities.Etudiant;
import Api.example.Edutraker.entities.Parent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ParentService {
    Parent createParent(Parent parent);

    Parent getParent(Long id);

    List<Parent> getAllParents();
    Etudiant getEtudiantParent(Long parentId);
    Parent updateParent(Long id, Parent parent);
    void deleteParent(Long id);

}
