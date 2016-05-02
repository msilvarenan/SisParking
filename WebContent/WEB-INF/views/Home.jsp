<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="true"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="sisParkingTag" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value='CSS/EstiloPrincipal.css' />" rel="stylesheet" type="text/css" />
<meta charset="ISO-8859-1">
<title>SISparking - Estacionamentos</title>
</head>
<body>
	<sisParkingTag:cabecalho logado="true" />
	<form action="login" id="login" method="post">
		<table border="0" width="100%" height="40px" cellspadding="0" cellspacing="0" style="margin-bottom:5px; margin-top:5px">
			<tr><td class="subTitulo" colspan="2">&nbsp;Seu cadastro</td></tr>						
		</table>
		<table border="0" width="100%" cellspadding="0" cellspacing="0">
			<tr>
				<td class="CabecalhoTabelaE" height="30px">Nome</td>
				<td class="CabecalhoTabelaE">CPF</td>
				<td class="CabecalhoTabelaE">Data de admissão</td>
				<td class="CabecalhoTabelaE">Usuário</td>
				<td class="CabecalhoTabelaE">Senha</td>
				<td class="CabecalhoTabelaDE">Alterar</td>
			</tr>
			<tr>
				<td class="<c:if test="${FuncionarioLogado.id  % 2 == 0}">LinhaICE</c:if><c:if test="${FuncionarioLogado.id  % 2 != 0}">LinhaPCE</c:if>" height="30px">
					${FuncionarioLogado.nome}
				</td>
				<td class="<c:if test="${FuncionarioLogado.id  % 2 == 0}">LinhaICE</c:if><c:if test="${FuncionarioLogado.id  % 2 != 0}">LinhaPCE</c:if>">
					${FuncionarioLogado.cpf }
				</td>
				<td class="<c:if test="${FuncionarioLogado.id  % 2 == 0}">LinhaICE</c:if><c:if test="${FuncionarioLogado.id  % 2 != 0}">LinhaPCE</c:if>">
					<fmt:formatDate value="${FuncionarioLogado.dataAdmissao.time }" pattern="dd/MM/yyyy" />
				</td>
				<td class="<c:if test="${FuncionarioLogado.id  % 2 == 0}">LinhaICE</c:if><c:if test="${FuncionarioLogado.id  % 2 != 0}">LinhaPCE</c:if>">
					${FuncionarioLogado.usuario }
				</td>
				<td class="<c:if test="${FuncionarioLogado.id  % 2 == 0}">LinhaICE</c:if><c:if test="${FuncionarioLogado.id  % 2 != 0}">LinhaPCE</c:if>">
					${FuncionarioLogado.senha }
				</td>
				<td class="<c:if test="${FuncionarioLogado.id  % 2 == 0}">LinhaICD</c:if><c:if test="${FuncionarioLogado.id  % 2 != 0}">LinhaPCD</c:if>">
					<a href="ExcluirFuncionario"><img src="imagens/edit-icon.png" width="30px" height="30px"/></a>
				</td>
			</tr>
		</table>		
	</form>
	</br>
	<table border="0" width="100%" height="40px" cellspadding="0" cellspacing="0" style="margin-bottom:5px">
		<tr><td class="subTitulo" colspan="2">&nbsp;Funcionários cadastrados</td></tr>						
	</table>
	<table border="0" width="100%"  cellspadding="0" cellspacing="0">
		<tr>
			<td class="CabecalhoTabelaE" height="30px">Funcionário</td>
			<td class="CabecalhoTabelaE">CPF</td>
			<td class="CabecalhoTabelaE">Data de admissão</td>
			<td class="CabecalhoTabelaE">Usuário</td>
			<td class="CabecalhoTabelaDE">Excluir</td>
		</tr>
		<c:forEach items="${funcionarios}" var="funcionarios">
		<tr>
			<td class="<c:if test="${funcionarios.id  % 2 == 0}">LinhaICE</c:if><c:if test="${funcionarios.id  % 2 != 0}">LinhaPCE</c:if>" height="30px" >
				${funcionarios.nome}
			</td>
			<td class="<c:if test="${funcionarios.id  % 2 == 0}">LinhaICE</c:if><c:if test="${funcionarios.id  % 2 != 0}">LinhaPCE</c:if>">
				${funcionarios.cpf }
			</td>
			<td class="<c:if test="${funcionarios.id  % 2 == 0}">LinhaICE</c:if><c:if test="${funcionarios.id  % 2 != 0}">LinhaPCE</c:if>">
				<fmt:formatDate value="${funcionarios.dataAdmissao.time }" pattern="dd/MM/yyyy" />
			</td>
			<td class="<c:if test="${funcionarios.id  % 2 == 0}">LinhaICE</c:if><c:if test="${funcionarios.id  % 2 != 0}">LinhaPCE</c:if>">
				${funcionarios.usuario }
			</td>
			<td class="<c:if test="${funcionarios.id  % 2 == 0}">LinhaICD</c:if><c:if test="${funcionarios.id  % 2 != 0}">LinhaPCD</c:if>">
				<a href="ExcluirFuncionario"><img src="imagens/Excluir2.png" width="30px" height="30px"/></a>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5" style="text-align:right"><a href="FormularioAdicionarFuncionario" class="link">Adicionar um novo Funcionário</a></td>
		</tr>
	</table>
</body>
</html>