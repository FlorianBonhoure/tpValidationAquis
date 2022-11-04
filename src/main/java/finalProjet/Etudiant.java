package finalProjet;

public class Etudiant {
    private String id;
    private String nom;
    private double moyenne;
    private String image;

    public Etudiant(String id, String nom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
    }
    
    public Etudiant(String id, String nom, double moyenne, String image) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
        this.image = image;
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
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public boolean equals(Etudiant etudiant){
        return this.id.equals(etudiant.getId());
    }
}
