package Api.example.Edutraker.repositories;

import Api.example.Edutraker.entities.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository  extends JpaRepository<Notes , Long> {
}
