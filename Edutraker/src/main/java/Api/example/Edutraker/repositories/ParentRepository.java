package Api.example.Edutraker.repositories;

import Api.example.Edutraker.entities.Etudiant;
import Api.example.Edutraker.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ParentRepository  extends JpaRepository <Parent , Long> {
    @Query("SELECT p.etudiant FROM Parent p WHERE p.parent_id = :parentId")
    Etudiant findEtudiantByParentId(@Param("parentId") Long parentId);
}
