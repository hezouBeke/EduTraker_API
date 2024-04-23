package Api.example.Edutraker.entities;

import jakarta.persistence.*;

import javax.sql.DataSource;
import java.util.Date;

@Entity
public class Retard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ret_id;
    private Date dateRetard;
    private String motif;
    @ManyToOne
    @JoinColumn(name = "etud_id")
    private Etudiant etudiant;

    public Retard() {
    }

    public Date getDateRetard() {
        return dateRetard;
    }

    public String getMotif() {
        return motif;
    }

    public void setDateRetard(Date dateRetard) {
        this.dateRetard = dateRetard;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
}
