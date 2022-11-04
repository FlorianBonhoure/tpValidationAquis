package finalProjet;

public class Etudiant {
    private String id;
    private String nom;
    private double moyenne;

    public Etudiant(String id, String nom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    
    public boolean equals(Etudiant etudiant){
        return this.getId().equals(etudiant.getId());
    }
}
