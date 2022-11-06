package finalProjet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern p = Pattern.compile("^([a-zA-Z]|[ \\t]|['-])+$");
        Matcher m = p.matcher(nom);
        boolean match = m.matches();
        if(match){
            this.nom = nom;
        } 
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        if(moyenne > 20){
            moyenne = 20;
        } else if(moyenne < 0){
            moyenne = 0;
        }
        this.moyenne = moyenne;
    }
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        Pattern p = Pattern.compile("^([a-zA-Z_0-9]|[ \\t]|[\\p{Punct}&&[^\\\\/:*?\"<>|]])+$"); //Tous caractères sauf : \/:*?"<>|
        Matcher m = p.matcher(image);
        boolean match = m.matches();
        if(match){
            if(image.endsWith(".jpg") || image.endsWith(".png") || image.endsWith(".gif")){
               this.image = image; 
            } 
        }  
    }
    
    public boolean equals(Etudiant etudiant){
        return this.id.equals(etudiant.getId());
    }
}
