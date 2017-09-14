<%-- 
    Document   : pesquisaCurso
    Created on : 29/11/2012, 17:00:02
    Author     : Marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa de Cursos</title>
    </head>
    <body>
        <h1>Pesquisa de Cursos</h1>
        <table border=1>
            <tr>
                <th>Código Curso</th>
                <th>Nome Curso</th>
                <th colspan=2>Ação</th>
            </tr>
            <c:forEach items="${cursos}" var="curso">
                <tr>
                    <td><c:out value="${curso.codCurso}" /></td>
                    <td><c:out value="${curso.nome}" /></td>
                    <td><a href="ManterCursoController?acao=prepararEditar&codCurso=<c:out value="${curso.codCurso}"/>">Editar</a></td>
                    <td><a href="ManterCursoController?acao=prepararExcluir&codCurso=<c:out value="${curso.codCurso}"/>">Excluir</a></td>
                </tr>
            </c:forEach>
        </table>
        <form action="ManterCursoController?acao=prepararIncluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir">
        </form>
    </body>
</html>
