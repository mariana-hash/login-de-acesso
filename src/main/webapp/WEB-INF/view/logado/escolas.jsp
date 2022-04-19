<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="/public/estilo.css" rel="stylesheet" type="text/css">
<title>Consulta Escolas</title>

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

        
        .escolas tr:nth-child(even) {background: #fff}

        .escolas tr:nth-child(odd) {background: #ddd}




</style>
</head>
<body>

<form method="post" action="alunos.jsp">

<br>

<div align="center">

<input type="submit" name="aluno" value="Consultar Dados Alunos">

</div>
</form>

<form method="post" action="../logout.jsp">


<div align="left">

<input type="submit" name="fimSessao" value="Sair">

</div>
</form>

	<div id="escola">
	
	<h1>Dados Escolas</h1>
	
			<form method="post" action="escolas.jsp">

                    <input type="text" name="dsEscola" placeholder = "dsEscola"
                               value="${param.dsEscola}"/>
                    
                    <input type="text" name="diretor" placeholder = "nome diretor"
                               value="${param.diretor}"/>
                               
                     <input type="text" name="coordenador" placeholder = "nome coordenador"
                               value="${param.coordenador}"/>
                               
                    <input type="text" name="organizacao" placeholder = "organização escola"
                               value="${param.organizacao}"/>
                               
                    <input type="text" name="dependenciaAdm" placeholder = "dependência administrativa"
                               value="${param.dependenciaAdm}"/>


                    <input type="submit" name="filtrar" value="Buscar"/>
		</form>
	<div>
	<br>
	<br>
	<table class="escolas">
	<tr>
		    	<th>CÓDIGO ESCOLA</th>
				<th>dsEscola</th>
				<th>dsEscolaReduzida</th>
				<th>CEP</th>
				<th>ENDEREÇO</th>
				<th>NÚMERO</th>
				<th>BAIRRO</th>
				<th>COMPLEMENTO</th>
				<th>ZONA RESIDENCIAL</th>
				<th>TELEFONE 1</th>
				<th>TELEFONE 2</th>
				<th>EMAIL</th>
				<th>ORGANIZAÇÃO ESCOLA</th>
				<th>DEPENDÊNCIA ADMINISTRATIVA</th>
				<th>TURNOS OFERECIDOS</th>
				<th>CNPJ</th>
				<th>ATO CONSTITUCIONAL</th>
				<th>LIVROFOLHA</th>
				<th>REGIMENTO MEC</th>
				<th>dtregmec</th>
				<th>ENTIDADE MANTENEDORA</th>
				<th>CPF DIRETOR</th>
				<th>DIRETOR ATUAL</th>
				<th>DIRETOR ATUAL TRATAMENTO</th>
				<th>MATRÍCULA PORTARIA DIRETORIA</th>
				<th>EMAIL DIRETOR</th>
				<th>COORDENADOR ATUAL</th>
				<th>COORDENADOR ATUAL TRATAMENTO</th>
				<th>MATRICULA PORTARIA COORDENAÇÃO</th>
				<th>SECREATRIA ATUAL</th>
				<th>SECREATRIA ATUAL TRATAMENTO</th>
				<th>MATRICULA PORTARIA SECRETARIA</th>
				<th>GESTOR ATUAL</th>
				<th>GESTOR ATUAL TRATAMENTO</th>
				<th>MATRICULA PORTARIA GESTOR</th>
	</tr>
		  		
	  		<c:forEach	var="escola" items="${escolas}">
	  		
		  		<tr>
		  		
	  				<th>${escola.cdEscola}</th>
					<th>${escola.dsEscola}</th>
					<th>${escola.dsEscolaReduzida}</th>
					<th>${escola.cepOrg}</th>
					<th>${escola.endOrg}</th>
					<th>${escola.numEndereco}</th>
					<th>${escola.baiOrg}</th>
					<th>${escola.complementoEndereco}</th>
					<th>${escola.zonaResidencia}</th>
					<th>${escola.tel1Org}</th>
					<th>${escola.tel2Org}</th>
					<th>${escola.email}</th>
					<th>${escola.organizacao_Escola}</th>
					<th>${escola.dependencia_Adm}</th>
					<th>${escola.turnos_Oferecido}</th>
					<th>${escola.cnpj}</th>
					<th>${escola.atoconst}</th>
					<th>${escola.livrofolha}</th>
					<th>${escola.regmec}</th>
					<th>${escola.dtregmec}</th>
					<th>${escola.entidademantenedora}</th>
					<th>${escola.cpf_diretor}</th>
					<th>${escola.diretorAtual}</th>
					<th>${escola.diretorAtualTratamento}</th>
					<th>${escola.matricula_PortariaDiret}</th>
					<th>${escola.EMAILDIRETOR}</th>
					<th>${escola.coordenadorAtual}</th>
					<th>${escola.coordenadorAtualTratamento}</th>
					<th>${escola.matricula_PortariaCoord}</th>
					<th>${escola.secretariaAtual}</th>
					<th>${escola.secretariaAtualTratamento}</th>
					<th>${escola.matricula_PortariaSecret}</th>
					<th>${escola.gestorAtual}</th>
					<th>${escola.gestorAtualTratamento}</th>
					<th>${escola.matricula_PortariaGestor}</th>
		  				  		
		  		</tr>

				
			</c:forEach>
	</table>
	</div>
	
	</div>
 
</body>

<script>

function mascaraCNPJ(i){
	   
	   var v = i.value;
	   
	   if(isNaN(v[v.length-1])){ // impede entrar outro caractere que não seja número
	      i.value = v.substring(0, v.length-1);
	      return;
	   }
	   
	   i.setAttribute("maxlength", "18");
	   if (v.length == 2 || v.length == 6) i.value += ".";
	   if (v.length == 10) i.value += "/";
	   if (v.length == 15) i.value += "-";

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