
package finalProjet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/affichage-etudiants")
public class AffichageEtudiants extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       ArrayList<Etudiant> etudiants = GestionEtudiant.getListeEtudiants();
       Etudiant e1 = new Etudiant("1","Etudiant1",12.0);
       Etudiant e2 = new Etudiant("2","Etudiant2",14.0);
       Etudiant e3 = new Etudiant("3","Etudiant3",9.0);
       Etudiant e4 = new Etudiant("4","Etudiant4",15.0);
       Etudiant e5 = new Etudiant("5","Etudiant1",8.0);
       etudiants.add(e1);
       etudiants.add(e2);
       etudiants.add(e3);
       etudiants.add(e4);
       etudiants.add(e5);
       
       request.setAttribute("etudiant",e1);
       request.setAttribute("etudiants", etudiants);
       request.getRequestDispatcher("WEB-INF/affichageEtudiants.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
