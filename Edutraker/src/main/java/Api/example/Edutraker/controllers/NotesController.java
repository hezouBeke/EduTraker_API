package Api.example.Edutraker.controllers;

import Api.example.Edutraker.entities.Notes;
import Api.example.Edutraker.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("notes")
public class NotesController {
    @Autowired
    private NotesService notesService;

    @PostMapping
    public Notes createNotes(@RequestBody Notes notes) {
        return notesService.createNotes(notes);
    }

    @GetMapping("/{id}")
    public Notes getNotes(@PathVariable Long id) {
        return notesService.getNotes(id);
    }

    @GetMapping
    public List<Notes> getAllNotes() {
        return notesService.getAllNotes();
    }

    @PutMapping("/{id}")
    public Notes updateNotes(@PathVariable Long id, @RequestBody Notes notes) {
        return notesService.updateNotes(id, notes);
    }

    @DeleteMapping("/{id}")
    public void deleteNotes(@PathVariable Long id) {
        notesService.deleteNotes(id);
    }
}
