<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="alunos.AlunoMB"%> --%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/public/estilo.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Página inicial</title>
<!-- <style>
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
}

input[type=text],[type=password] {
   padding:5px; 
   border:2px solid #ccc; 
   -webkit-border-radius: 5px;
   border-radius: 5px;
}

        /*Definido cor das linhas pares*/
        .alunos tr:nth-child(even) {background: #FFF}
         
        /*Definindo cor das Linhas impares*/
        .alunos tr:nth-child(odd) {background: #EEE}
        
        .escolas tr:nth-child(even) {background: #FFF}

        .escolas tr:nth-child(odd) {background: #EEE}




</style> -->
</head>
<body>


<div id="aluno" style="display:none">
		<h1>Dados Alunos</h1>
		
		<form method="post" action="menu.jsp">

                    <input oninput="mascaraCPF(this)" type="text" name="cpf" placeholder = "cpf aluno (000.000.000-00)"
                               value="${param.cpf}"/>
                    
                    <input type="text" name="nomeAluno" placeholder = "nome aluno"
                               value="${param.nomeAluno}"/>
                               
                     <input type="text" name="nomeMae" placeholder = "nome mãe do aluno"
                               value="${param.nomeMae}"/>
                               
                      <input oninput="mascaraData(this)" type="text" name="dataNascimento" placeholder = "nascimento (aaaa-mm-dd)"
                               value="${param.dataNascimento}"/>

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
	
	<div id="escola" style="display:none">
	
	<h1>Dados Escolas</h1>
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

var visibilidadeAluno = false;
var visibilidadeEscola = false;

		
function mostrarAluno() {
			
		if(visibilidadeAluno){
			document.getElementById("aluno").style.display="none";
			visibilidadeAluno=false;
		}
		else{
			document.getElementById("aluno").style.display="table";
			visibilidadeAluno=true;
			document.getElementById("escola").style.display="none";
			visibilidadeEscola=false;
		}		
}

function mostrarEscola() {
	
	if(visibilidadeEscola){
		document.getElementById("escola").style.display="none";
		visibilidadeEscola=false;
	}
	else{
		document.getElementById("escola").style.display="table";
		visibilidadeEscola=true;
		document.getElementById("aluno").style.display="none";
		visibilidadeAluno=false;
	}		
}

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

</script>
</html>