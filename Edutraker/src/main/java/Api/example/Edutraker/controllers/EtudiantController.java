package Api.example.Edutraker.controllers;

import Api.example.Edutraker.entities.Etudiant;
import Api.example.Edutraker.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired(required = false)
    private EtudiantService etudiantService;

    @PostMapping
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }

    @GetMapping("/{etud_id}")
    public Etudiant getEtudiant(@PathVariable Long etud_id) {
        return etudiantService.getEtudiant(etud_id);
    }

    @GetMapping
    public List<Etudiant> getalletudiants() {
        return etudiantService.getAllEtudiants();
    }

    @PutMapping("/{etud_id}")
    public Etudiant updateEtudiant(@PathVariable Long etud_id, @RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etud_id, etudiant);
    }

    @DeleteMapping("/{etud_id}")
    public void deleteEtudiant(@PathVariable Long etud_id) {
        etudiantService.deleteEtudiant(etud_id);
    }

}

