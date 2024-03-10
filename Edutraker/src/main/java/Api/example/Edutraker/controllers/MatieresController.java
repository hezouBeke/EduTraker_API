package Api.example.Edutraker.controllers;

import Api.example.Edutraker.entities.Matieres;
import Api.example.Edutraker.services.MatieresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("matieres")

public class MatieresController {
    @Autowired
    private MatieresService matieresService;

    @PostMapping
    public Matieres createMatiere(@RequestBody Matieres matieres) {
        return matieresService.createMatiere(matieres);
    }

    @GetMapping("/{id}")
    public Matieres getMatiere(@PathVariable Long mat_id) {
        return matieresService.getMatiere(mat_id);
    }

    @GetMapping
    public List<Matieres> getAllMatieres() {
        return matieresService.getAllMatieres();
    }

    @PutMapping("/{mat_id}")
    public Matieres updateMatiere(@PathVariable Long mat_id, @RequestBody Matieres matieres) {
        return matieresService.updateMatiere(mat_id, matieres);
    }

    @DeleteMapping("/{id}")
    public void deleteMatiere(@PathVariable Long mat_id) {
        matieresService.deleteMatiere(mat_id);
    }
}
