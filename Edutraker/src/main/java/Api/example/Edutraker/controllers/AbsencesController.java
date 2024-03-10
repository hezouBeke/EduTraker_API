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

    @GetMapping("/{absences_id}")
    public Absences getAbsence(@PathVariable Long absences_id) {
        return absencesService.getAbsence(absences_id);
    }

    @GetMapping
    public List<Absences> getAllAbsences() {
        return absencesService.getAllAbsences();
    }

    @PutMapping("/{absences_id}")
    public Absences updateAbsence(@PathVariable Long absences_id, @RequestBody Absences absences) {
        return absencesService.updateAbsence(absences_id, absences);
    }

    @DeleteMapping("/{absences_id}")
    public void deleteAbsence(@PathVariable Long absences_id) {
        absencesService.deleteAbsence(absences_id);
    }
}
