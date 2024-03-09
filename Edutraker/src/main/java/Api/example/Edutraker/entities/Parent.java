package Api.example.Edutraker.entities;

import jakarta.persistence.*;
import org.apache.catalina.startup.EngineRuleSet;

import java.util.List;

@Entity
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parent_id;
    private String nom;
    private  String prenom;
    private String Profession;
    @OneToMany(mappedBy = "parent")
    private List<Etudiant> etudiants;

    public Parent(){

    }


    public Parent(String nom, String prenom, String profession, List<Etudiant> etudiants) {
        this.nom = nom;
        this.prenom = prenom;
        Profession = profession;
        this.etudiants = etudiants;
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

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
