package Api.example.Edutraker.services;

import Api.example.Edutraker.entities.Retard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RetardService {
    Retard createRetard(Retard retard);

    Retard getRetard(Long id);

    List<Retard> getAllRetards();

    Retard updateRetard(Long id, Retard retard);

    void deleteRetard(Long id);
}
