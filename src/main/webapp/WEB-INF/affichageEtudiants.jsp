<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Affichage des étudiants</title>
        <style>
            table{
                border:1px solid black;
                border-collapse: collapse;
            }
            
            th{
                font-weight: bold;
                background-color: lightgray;
                font-size: 1.5em;
            }
            
            th, td{
                padding:15px;
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <h1>Liste des étudiants</h1>
        <table>
            <tr><th>id</th><th>nom</th><th>moyenne</th><th>photo</th></tr>
            <c:forEach items="${etudiants}" var="etudiant">
                <tr>
                    <td><c:out value="${ etudiant.getId() }" /> </td> 
                    <td><c:out value="${ etudiant.getNom() }" /></td>
                    <td><c:out value="${ etudiant.getMoyenne() }" /></td>
                    <td><img src="<c:out value='${ etudiant.getImage() }'/>" alt="<c:out value='${ etudiant.getNom() }'/>" width="50px" height="50px" /></td>
                </tr>
            </c:forEach>
        </table> 
    </body>
</html>
