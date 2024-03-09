package Api.example.Edutraker.controllers;

import Api.example.Edutraker.entities.Absences;
import Api.example.Edutraker.services.AbsencesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("absences")
public class AbsencesController {
    private AbsencesService absencesService;

    @PostMapping
    public Absences createAbsence(@RequestBody Absences absences) {
        return absencesService.createAbsence(absences);
    }

    @GetMapping("/{id}")
    public Absences getAbsence(@PathVariable Long id) {
        return absencesService.getAbsence(id);
    }

    @GetMapping
    public List<Absences> getAllAbsences() {
        return absencesService.getAllAbsences();
    }

    @PutMapping("/{id}")
    public Absences updateAbsence(@PathVariable Long id, @RequestBody Absences absences) {
        return absencesService.updateAbsence(id, absences);
    }

    @DeleteMapping("/{id}")
    public void deleteAbsence(@PathVariable Long id) {
        absencesService.deleteAbsence(id);
    }
}
