package finalProjet;

import java.util.ArrayList;

public class GestionEtudiant {
    private static ArrayList<Etudiant> listeEtudiants = new ArrayList<Etudiant>();
    
    public static ArrayList<Etudiant> getListeEtudiants(){
        init();
        return listeEtudiants;
    }
    
    public static void init(){
       listeEtudiants.add(new Etudiant("1","Titeuf",12.0,"images/titeuf.jpg"));
       listeEtudiants.add(new Etudiant("2","Etudiant2",14.0));
       listeEtudiants.add(new Etudiant("3","Etudiant3",9.0));
       listeEtudiants.add(new Etudiant("4","Etudiant4",15.0));
       listeEtudiants.add(new Etudiant("5","Ducobu",8.0,"images/ducobu.jpg"));
    }
}
