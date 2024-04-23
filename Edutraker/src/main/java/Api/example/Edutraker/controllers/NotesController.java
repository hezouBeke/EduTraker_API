package Api.example.Edutraker.controllers;

import Api.example.Edutraker.entities.Notes;
import Api.example.Edutraker.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("notes")
public class NotesController {
    @Autowired(required = false)
    private NotesService notesService;

    @PostMapping
    public Notes createNotes(@RequestBody Notes notes) {
        return notesService.createNotes(notes);
    }

    @GetMapping("/{note_id}")
    public Notes getNotes(@PathVariable Long note_id) {
        return notesService.getNotes(note_id);
    }

    @GetMapping
    public List<Notes> getAllNotes() {
        return notesService.getAllNotes();
    }

    @PutMapping("/{note_id}")
    public Notes updateNotes(@PathVariable Long note_id, @RequestBody Notes notes) {
        return notesService.updateNotes(note_id, notes);
    }

    @DeleteMapping("/{note_id}")
    public void deleteNotes(@PathVariable Long note_id) {
        notesService.deleteNotes(note_id);
    }
}
