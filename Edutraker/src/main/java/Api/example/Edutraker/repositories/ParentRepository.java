package Api.example.Edutraker.repositories;

import Api.example.Edutraker.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository  extends JpaRepository <Parent , Long> {
}
