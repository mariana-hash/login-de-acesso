<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
<style>
/* table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
} */

input[type=submit],[type=button] {
    padding:5px 15px; 
    background:#ccc; 
    border:0 none;
    cursor:pointer;
    -webkit-border-radius: 5px;
    border-radius: 5px; 
    font-size:20px;
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


<br>
<br>
<br>
<form method="post" action="../logout.jsp">


<div align="left">

<input type="submit" name="fimSessao" value="Sair">

</div>
</form>
<form method="post" action="logado.jsp">


<div align="center">


<input type="submit" name="aluno" value="Dados Alunos">


</div>
<br>
<br>
</form>

<form method="post" action="logado.jsp">


<div align="center">


<input type="submit" name="escola" value="Dados Escolas">


</div>
</form>


</body>
</html>