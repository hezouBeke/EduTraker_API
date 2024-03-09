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
    public Matieres getMatiere(@PathVariable Long id) {
        return matieresService.getMatiere(id);
    }

    @GetMapping
    public List<Matieres> getAllMatieres() {
        return matieresService.getAllMatieres();
    }

    @PutMapping("/{id}")
    public Matieres updateMatiere(@PathVariable Long id, @RequestBody Matieres matieres) {
        return matieresService.updateMatiere(id, matieres);
    }

    @DeleteMapping("/{id}")
    public void deleteMatiere(@PathVariable Long id) {
        matieresService.deleteMatiere(id);
    }
}
