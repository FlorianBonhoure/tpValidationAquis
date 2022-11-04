<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Affichage des étudiants</title>
    </head>
    <body>
        <h1>Liste des étudiants</h1>
        <ol style="list-style-type:decimal;">
            <c:forEach items="${etudiants}" var="etudiant">
                <li>
                    nom <c:out value="${ etudiant.getNom() }" /> id <c:out value="${ etudiant.getId() }" /> <c:out value="${ etudiant.getMoyenne() }" />
                </li>
            </c:forEach>
        </ol>    
    </body>
</html>
