package Api.example.Edutraker.services;

import Api.example.Edutraker.entities.Retard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RetardService {
    Retard createRetard(Retard retard);

    Retard getRetard(Long ret_id);

    List<Retard> getAllRetards();

    Retard updateRetard(Long ret_id, Retard retard);

    void deleteRetard(Long ret_id);
}
