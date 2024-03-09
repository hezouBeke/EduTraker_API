package Api.example.Edutraker.repositories;

import Api.example.Edutraker.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant , Long> {
}
