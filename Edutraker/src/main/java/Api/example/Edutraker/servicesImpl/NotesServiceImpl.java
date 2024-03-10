package Api.example.Edutraker.servicesImpl;

import Api.example.Edutraker.entities.Notes;
import Api.example.Edutraker.repositories.NotesRepository;
import Api.example.Edutraker.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class NotesServiceImpl implements NotesService {

    @Autowired
    private NotesRepository notesRepository;

    @Override
    public Notes createNotes(Notes notes) {
        return notesRepository.save(notes);
    }

    @Override
    public Notes getNotes(Long note_id) {
        return notesRepository.findById(note_id).orElse(null);
    }

    @Override
    public List<Notes> getAllNotes() {
        return notesRepository.findAll();
    }


    @Override
    public Notes updateNotes(Long note_id, Notes notes) {
        Optional<Notes> existingNotesOptional = notesRepository.findById(note_id);
        if (existingNotesOptional.isPresent()) {
            Notes existingNotes = existingNotesOptional.get();
            existingNotes.setValeur(notes.getValeur());
            existingNotes.setMatieres(notes.getMatieres());
            existingNotes.setEtudiant(notes.getEtudiant());
            return notesRepository.save(existingNotes);
        } else {
            return null;
        }
    }


    @Override
    public void deleteNotes(Long note_id) {
        notesRepository.deleteById(note_id);
    }
}
