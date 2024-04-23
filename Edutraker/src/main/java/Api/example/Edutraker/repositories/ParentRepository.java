package Api.example.Edutraker.repositories;

import Api.example.Edutraker.entities.Etudiant;
import Api.example.Edutraker.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ParentRepository  extends JpaRepository <Parent , Long> {

        @Query("SELECT p.etudiants FROM Parent p WHERE p.parent_id = :parent_id")
        List<Etudiant> findEtudiantsByParentId(@Param("parent_id") Long parentId);
    }
    
