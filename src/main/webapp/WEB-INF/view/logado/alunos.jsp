<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="/public/estilo.css" rel="stylesheet" type="text/css">
<title>Consulta Alunos</title>

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
    font-size:18px;
}

input[type=text],[type=password] {
   padding:5px; 
   border:2px solid #ccc; 
   -webkit-border-radius: 5px;
   border-radius: 5px;
}

        /*Definido cor das linhas pares*/
        .alunos tr:nth-child(even) {background: #fff}
         
        /*Definindo cor das Linhas impares*/
        .alunos tr:nth-child(odd) {background: #ddd}
        


</style>
</head>
<body>

<form method="post" action="escolas.jsp">

<br>

<div align="center">

<input type="submit" name="escola" value="Consultar Dados Escolas">

</div>
</form>

<form method="post" action="../logout.jsp">


<div align="left">

<input type="submit" name="fimSessao" value="Sair">

</div>
</form>

<div id="aluno">
		<h1>Dados Alunos</h1>
		
		<form method="post" action="alunos.jsp">
		
                    <input type="text" name="nomeAluno" placeholder = "nome aluno"
                               value="${param.nomeAluno}"/>
                               
                      <input oninput="mascaraData(this)" type="text" name="dataNascimento" placeholder = "nascimento (aaaa-mm-dd)"
                               value="${param.dataNascimento}"/>

                    <input oninput="mascaraCPF(this)" type="text" name="cpf" placeholder = "cpf aluno (000.000.000-00)"
                               value="${param.cpf}"/>
                    
                               
                     <input type="text" name="nomeMae" placeholder = "nome mãe do aluno"
                               value="${param.nomeMae}"/>

                    <input type="submit" name="filtrar" value="Buscar"/>
		</form>


		<br>
		<br>
 		<table class="alunos">
 			<tr>
		    	<th>NOME</th>
				<th>NASCIMENTO</th>
				<th>NIS ALUNO</th>
				<th>SEXO</th>
				<th>EMAIL</th>
				<th>NACIONALIDADE</th>
				<th>CPF</th>
				<th>RG ALUNO</th>
				<th>ORGÃO EXPEDITOR</th>
				<th>UF ORGÃO</th>
				<th>DATA REGISTRO</th>
				<th>CARTEIRA RESERVISTA</th>
				<th>CEP ENDEREÇO</th>
				<th>ENDEREÇO</th>
				<th>NÚMERO</th>
				<th>BAIRRO</th>
				<th>COMPLEMENTO</th>
				<th>CIDADE</th>
				<th>FONE 1</th>
				<th>FONE 2</th>
				<th>ZONA RESIDÊNCIA</th>
				<th>PAI</th>
				<th>RG PAI</th>
				<th>ORGÃO EXPEDITOR PAI</th>
				<th>UF</th>
				<th>DATA REGISTRO</th>
				<th>CPF PAI</th>
				<th>NIS PAI</th>
				<th>MÃE</th>
				<th>RG MÃE</th>
				<th>ORGÃO EXPEDITOR</th>
				<th>UF</th>
				<th>CPF MÃE</th>
				<th>NIS MÃE</th>
		  	</tr>
			
			<c:forEach	var="aluno" items="${alunos}">
					<tr>
							<th>${aluno.NOME}</th>
							<th>${aluno.NASCIMENTO}</th>
							<th>${aluno.NIS_ALUNO}</th>
							<th>${aluno.SEXO}</th>
							<th>${aluno.EMAIL}</th>
							<th>${aluno.NACIONALIDADE}</th>
							<th>${aluno.CPF}</th>
							<th>${aluno.RG_ALUNO}</th>
							<th>${aluno.ORGAO_ESPEDITOR}</th>
							<th>${aluno.UF_ORGAO}</th>
							<th>${aluno.DATA_REGISTRO}</th>
							<th>${aluno.CARTEIRA_RESEVISTA}</th>
							<th>${aluno.CEP_ENDEREÇO}</th>
							<th>${aluno.ENDEREÇO}</th>
							<th>${aluno.NUMERO}</th>
							<th>${aluno.BAIRRO}</th>
							<th>${aluno.COMPLEMENTO}</th>
							<th>${aluno.CIDADE}</th>
							<th>${aluno.FONE_1}</th>
							<th>${aluno.FONE_2}</th>
							<th>${aluno.ZONA_RESIDENCIA}</th>
							<th>${aluno.PAI}</th>
							<th>${aluno.RG_PAI}</th>
							<th>${aluno.ORGAO_ESPEDITOR_PAI}</th>
							<th>${aluno.UF}</th>
							<th>${aluno.DATA_REGISTRO_0}</th>
							<th>${aluno.CPF_PAI}</th>
							<th>${aluno.NIS_PAI}</th>
							<th>${aluno.MAE}</th>
							<th>${aluno.RG_MAE}</th>
							<th>${aluno.ORGÃO_ESPEDITOR}</th>
							<th>${aluno.UF0}</th>
							<th>${aluno.CPF_MAE}</th>
							<th>${aluno.NIS_MAE}</th>
					</tr>
					
			</c:forEach>
		 </table>
	</div>
</body>

<script>

function mascaraCPF(i){
	   
	   var v = i.value;
	   
	   if(isNaN(v[v.length-1])){ // impede entrar outro caractere que não seja número
	      i.value = v.substring(0, v.length-1);
	      return;
	   }
	   
	   i.setAttribute("maxlength", "14");
	   if (v.length == 3 || v.length == 7) i.value += ".";
	   if (v.length == 11) i.value += "-";

	}
	
function mascaraData(i){
	   
	   var v = i.value;
	   
	   if(isNaN(v[v.length-1])){ // impede entrar outro caractere que não seja número
	      i.value = v.substring(0, v.length-1);
	      return;
	   }
	   
	   i.setAttribute("maxlength", "10");
	   if (v.length == 4 || v.length == 7)
		   i.value += "-";

	}
	

	function disableselect(e) {
		return false
	}
	function reEnable() {
		return true
	}
	//if IE4+
	document.onselectstart = new Function("return false")
	//if NS6
	if (window.sidebar) {
		document.onmousedown = disableselect
		document.onclick = reEnable
	}
</script>
</html>