package Api.example.Edutraker.services;

import Api.example.Edutraker.entities.Etudiant;
import Api.example.Edutraker.entities.Parent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ParentService {
    Parent createParent(Parent parent);

    Parent getParent(Long parent_id);

    List<Parent> getAllParents();
    List<Etudiant> getEtudiantParent(Long parent_id);
    Parent updateParent(Long parent_id, Parent parent);
    void deleteParent(Long parent_id);

}
