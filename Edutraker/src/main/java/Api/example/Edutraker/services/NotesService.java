package Api.example.Edutraker.services;

import Api.example.Edutraker.entities.Notes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotesService {

    Notes createNotes(Notes notes);

    Notes getNotes(Long note_id);

    List<Notes> getAllNotes();

    Notes updateNotes(Long note_id, Notes notes);

    void deleteNotes(Long note_id);
}
