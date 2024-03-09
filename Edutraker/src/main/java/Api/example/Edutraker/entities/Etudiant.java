package Api.example.Edutraker.entities;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Not;

import java.util.List;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long etud_id ;
    private  String nom ;
    private  String prenom;
    private String salle;
    private  String filiere;


    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;

    @OneToMany(mappedBy = "etudiant")
    private List<Notes> notes;

    @OneToMany(mappedBy = "etudiant")
    private List<Retard> retard;


    @OneToMany(mappedBy = "etudiant")
    private List<Absences> absences;

    public Etudiant() {

    }

    public Etudiant(String nom, String prenom, String salle, String filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.salle = salle;
        this.filiere = filiere;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSalle() {
        return salle;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public List<Retard> getRetard() {
        return retard;
    }

    public List<Absences> getAbsences() {
        return absences;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }

    public void setRetard(List<Retard> retard) {
        this.retard = retard;
    }

    public void setAbsences(List<Absences> absences) {
        this.absences = absences;
    }


}
