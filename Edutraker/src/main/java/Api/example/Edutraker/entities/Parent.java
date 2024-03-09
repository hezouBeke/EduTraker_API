package Api.example.Edutraker.entities;

import jakarta.persistence.*;
import org.apache.catalina.startup.EngineRuleSet;

@Entity
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parent_id;
    private String nom;
    private  String prenom;
    private String Profession;
    @OneToMany
    @JoinColumn(name = "etud_id")
    private Etudiant etudiant;
    public Parent(){

    }

    public Parent(String nom, String prenom, String profession) {
        this.nom = nom;
        this.prenom = prenom;
        Profession = profession;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getProfession() {
        return Profession;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}
