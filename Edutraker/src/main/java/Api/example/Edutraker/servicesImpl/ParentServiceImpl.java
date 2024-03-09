package Api.example.Edutraker.servicesImpl;

import Api.example.Edutraker.entities.Parent;
import Api.example.Edutraker.repositories.ParentRepository;
import Api.example.Edutraker.services.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        if (parentRepository.existsById(id)) {
            parent.setParent_id(id);
            return parentRepository.save(parent);
        } else {
            return null;
        }
    }

    @Override
    public void deleteParent(Long id) {
        parentRepository.deleteById(id);
    }
}
