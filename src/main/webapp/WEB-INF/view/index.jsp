<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Autenticação de Usuário</title>
        <link href="../css/layout.css"
        rel="stylesheet" type="text/css"/>
<style>
input[type=submit],[type=button] {
    padding:5px 15px; 
    background:#ccc; 
    border:0 none;
    cursor:pointer;
    -webkit-border-radius: 5px;
    border-radius: 5px; 
}

input[type=text],[type=password] {
   padding:5px; 
   border:2px solid #ccc; 
   -webkit-border-radius: 5px;
   border-radius: 5px;
}

</style>
        
        
    </head>
    <body>
        <h1 align="center">Autenticação de Usuário</h1>
        <c:if test="${mensagens.existeErros}">
            <div id="erro" align="center">
                <ul>
                    <c:forEach var="erro" items="${mensagens.erros}">
                        <li> ${erro} </li>
                        </c:forEach>
                </ul>
            </div>
        </c:if>
        <form method="post" action="index.jsp">
            <table align="center">
                <tr>
                    <th>Login: </th>
                    <td><input type="text" name="login"
                               value="${param.login}"/></td>
                </tr>
                <tr>
                    <th>Senha: </th>
                    <td><input type="password" name="senha" /></td>
                    <td colspan="2" align="center">
                        <input type="submit" name="bOK" value="Entrar"/>
                    </td>
                    
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" name="novo" value="Cadastrar"/>
                    </td>
                </tr>
                <tr>
					<td colspan="2" align="center">
                        <input type="submit" name="senhaqual" value="Redefinir senha"/>
                    </td>
                </tr>
            </table>
        </form>
        
        
    </body>
</html>