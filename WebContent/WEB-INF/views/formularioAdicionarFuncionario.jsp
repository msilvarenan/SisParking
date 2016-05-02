<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="true"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="sisparkingTag" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value='CSS/EstiloPrincipal.css' />" rel="stylesheet" type="text/css" />
<meta charset="ISO-8859-1">
<title>SISparking - Estacionamentos</title>
</head>
<body>
<sisparkingTag:cabecalho logado="true" />
<form action="IncluirFuncionario" id="cadastroFunc" method="post">
	<table border="0" width="100%" height="100px">
		<tr>
			<td width="20%"></td>
			<td width="60%">
				
					<table border="1" width="100%" height="100px">
						<tr><td class="subTitulo" colspan="2">Cadastro de funcionário</td></tr>
						<tr>
							<td class="literalDado"width="50%">Nome funcionário:</td>
							<td class="literalCampo"><input type="text" name="nome" id="nome" value=""/></td>
						</tr>
						<tr>
							<td class="literalDado">CPF:</td>
							<td class="literalCampo"><input type="text" name="cpf" id="cpf" value=""/></td>
						</tr>
						<tr>
							<td class="literalDado">Salário:</td>
							<td class="literalCampo"><input type="text" name="salario" id="salario" value=""/></td>
						</tr>
						<tr>
							<td class="literalDado">Data de admissão:</td>
							<td class="literalCampo"><input type="text" name="dataAdmissao" value=""/></td>
						</tr>
						<tr>
							<td class="literalDado">Usuário:</td>
							<td class="literalCampo"><input type="text" name="usuario" id="usuario" value=""/></td>
						</tr>
						<tr>
							<td class="literalDado">Senha:</td>
							<td class="literalCampo"><input type="password" name="senha" id="senha" value=""/></td>
						</tr>
						<tr>
							<td class="literalDado">Confirme sua senha:</td>
							<td class="literalCampo"><input type="password" id="confirmaSenha" value=""/></td>
						</tr>
						<tr>
							<td class="literalDado"></td>
							<td class="literalCampo"><input type="button" value="Cadastrar" onclick="javascript: incluirFuncionario();"/></td>
						</tr>
					</table>		
				</td>
			<td width="20%"></td>
		</tr>
	</table>
	<script type="text/javascript">
	function incluirFuncionario(){
		if(document.getElementById('nome').value == ''){
			alert("Informe o nome corretamente.");
			return;
		}else if(document.getElementById('cpf').value == ''){
			alert("Informe o cpf corretamente.");
			return;
		}else if(document.getElementById('salario').value == ''){
			alert("Informe o salário corretamente.");
			return;
		}else if(document.getElementById('dataAdmissao').value == ''){
			alert("Informe a data de admissão corretamente.");
			return;
		}else if(document.getElementById('usuario').value == ''){
			alert("Informe o usuário corretamente.");
			return;
		}else if(document.getElementById('senha').value == ''){
			alert("Informe a senha corretamente.");
			return;
		}else if(document.getElementById('senha').value != document.getElementById('confirmaSenha').value){
			alert("senhas diferentes.");
			return;
		}
		document.getElementById('cadastroFunc').submit();
	}
	</script>
</form>
</body>
</html>