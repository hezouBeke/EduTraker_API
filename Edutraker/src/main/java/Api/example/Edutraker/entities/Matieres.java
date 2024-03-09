package Api.example.Edutraker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Matieres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mat_id;
    private  String nomMat;

  public Matieres(){

  }

    public Matieres(String nomMat) {
        this.nomMat = nomMat;
    }

    public String getNomMat() {
        return nomMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }
}
