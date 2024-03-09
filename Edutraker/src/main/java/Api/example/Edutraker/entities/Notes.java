package Api.example.Edutraker.entities;

import jakarta.persistence.*;
import org.aspectj.util.GenericSignature;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long note_id;
    private  int valeur ;
    @ManyToOne
    @JoinColumn(name = "mat_id")
    private Matieres matieres;
    @ManyToOne
    @JoinColumn(name = "etud_id")
    private Etudiant etudiant;
    public Notes(){

    }

    public Notes(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setMatieres(Matieres matieres) {
        this.matieres = matieres;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Matieres getMatieres() {
        return matieres;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }
}
