package Api.example.Edutraker.entities;
import java.util.Date;
import jakarta.persistence.*;


@Entity
public class Absences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long absences_id;
    private Date dateAbsence;
    private  String motif;
    @ManyToOne
    @JoinColumn(name = "etud_id" )
    private Etudiant etudiant;

    public Absences() {

    }

    public Date getDateAbsence() {
        return dateAbsence;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public String getMotif() {
        return motif;
    }

    public void setDateAbsence(Date dateAbsence) {
        this.dateAbsence = dateAbsence;
    }

    public void setMotif(String motif) {
        this.motif = motif;

    }

    public void setAbsences_id(Long absences_id) {
        this.absences_id = absences_id;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}
