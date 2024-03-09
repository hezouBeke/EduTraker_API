package Api.example.Edutraker.servicesImpl;

import Api.example.Edutraker.entities.Retard;
import Api.example.Edutraker.repositories.RetardRepository;
import Api.example.Edutraker.services.RetardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RetardServiceImpl  implements RetardService {

    @Autowired

    private RetardRepository retardRepository;

    @Override
    public Retard createRetard(Retard retard) {
        return retardRepository.save(retard);
    }

    @Override
    public Retard getRetard(Long id) {
        return retardRepository.findById(id).orElse(null);
    }

    @Override
    public List<Retard> getAllRetards() {
        return retardRepository.findAll();
    }

    @Override
    public Retard updateRetard(Long id, Retard retard) {
        if (retardRepository.existsById(id)) {
            retard.setRet_id(id);
            return retardRepository.save(retard);
        } else {
            return null;
        }
    }

    @Override
    public void deleteRetard(Long id) {
        retardRepository.deleteById(id);
    }
}
