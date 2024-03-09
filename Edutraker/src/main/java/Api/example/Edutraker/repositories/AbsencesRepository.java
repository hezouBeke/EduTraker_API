package Api.example.Edutraker.repositories;

import Api.example.Edutraker.entities.Absences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbsencesRepository extends JpaRepository<Absences , Long> {
}
