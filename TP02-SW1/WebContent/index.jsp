<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- Dev pelo :
	Giovanni de Freitas Fernandes CB 1640488
 -->

<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
		<title>CRUD de Produtos</title>
		<link rel="stylesheet" href="style.css" />
	</head>
	<body>
		<h2>CRUD de Produtos</h2>
		<a href="Creditos.jsp">Créditos</a>
		<br />
		<h3>Inserir</h3>
		<hr />
		<form action="Insert" method="POST" class="form">
			<section class="row">
				<label for="nome">Nome</label>
				<input type="text" name="nome" id="nome" required/>
			</section>
			<section class="row">
				<label for="unidadeCompra">Unidade Compra</label>
				<input type="number" name="unidadeCompra" id="unidadeCompra" required/>
			</section>
			<section class="row">
				<label for="descricao">Descrição</label>
				<input type="text" name="descricao" id="descricao" required/>
			</section>
			<section class="row">
				<label for="qtdPrevistoMes">Quantidade Prevista no Mês</label>
				<input type="number" name="qtdPrevistoMes" id="qtdPrevistoMes" required/>
			</section>
			<section class="row">
				<label for="precoMaxComprado">Preço Máximo Comprado</label>
				<input type="number" name="precoMaxComprado" id="precoMaxComprado" required/>
			</section>
			<section>
				<input type="submit" name="enviar" value="enviar" id="enviar"/>
			</section>
		</form>
		
		<h3>Visualizar</h3>
		<hr/>
		
		<table class="tableView">
			<tr>
				<th>id</th>
				<th>Nome</th>
				<th>Unidade Compra</th>
				<th>Descrição</th>
				<th>Quantidade Prevista no Mês</th>
				<th>Preço Máximo Comprado</th>
				<th>Opções</th>
			</tr>
			<c:forEach items="${produtos}" var="produto">
				<form action="Edit" method="POST">
					<tr>
						<td><input class="ViewInput" name="identificador"    type="number" value="${produto.id }"readonly /></td>
						<td><input class="ViewInput" name="nome"             type="text"   value="${produto.nome }"/></td>
						<td><input class="ViewInput" name="unidadeCompra"    type="number" value="${produto.unidadeCompra }"/></td>
						<td><input class="ViewInput" name="descricao"        type="text"   value="${produto.descricao }"/></td>
						<td><input class="ViewInput" name="qtdPrevistoMes"   type="number" value="${produto.qtdPrevistoMes }"/></td>
						<td><input class="ViewInput" name="precoMaxComprado" type="number" value="${produto.precoMaxComprado }"/></td>
						<td>
							<button type="submit" name="edit">Editar</button>
							<button type="submit" name="delete" formaction="Delete">Deletar</button>
						</td>
					</tr>
				</form>
			</c:forEach>
		</table>
	</body>
</html>