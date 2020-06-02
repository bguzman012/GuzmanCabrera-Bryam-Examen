<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListarTickets</title>

</head>
<body>
	<form
		action="/GuzmanCabrera-Bryam-Examen/ControladorBuscarTicket"
		method="post" style="margin-top: 12px; margin-bottom: 12px;">
		<label for="cars" style="font-size: x-large;">Buscar por:</label> <select
			id="cars" name="opcion">
			<option value="PlacaVehiculo">PlacaVehiculo</option>
			<option value="CedulaCliente">CedulaCliente</option>

		</select> <input type="text" name="parametro" placeholder="Ingrese dato"
			id="login-name" value="" style="margin-top: 6px;"><input
			class="boton" type="submit" name="Ingresar" value="Buscar" /> 
		
		<C:set var="u" value="${requestScope['usuario']}" />



	</form>
	<div class="wrap-table100">
		<div class="table100 ver1">


			<div class="wrap-table100-nextcols js-pscroll">
				<div class="table100-nextcols">
					<table>
						<p>
						  <b>${nn}</b>${u.nombre} ${u.apellido} 		<b>${cc}</b>${u.cedula} 		<b>${crr}</b><a
								href="mailto:${u.correo}">${u.correo}</a>
										</pre>
						</p>

						<thead>
							<tr class="row100 head">
								<th class="cell100 column2">FechaHora</th>
								<th class="cell100 column3">HoraIngreso</th>
								<th class="cell100 column4">FechaSalida</th>
								<th class="cell100 column5">HoraSalida</th>
								<th class="cell100 column6">Cedula</th>
								<th class="cell100 column7">Nombre</th>
								<th class="cell100 column8">Direccion</th>
								<th class="cell100 column9">Telefono</th>
								<th class="cell100 column10">Placa</th>
								<th class="cell100 column11">Marca</th>
								<th class="cell100 column12">Modelo</th>

							</tr>
						</thead>

						<tbody>

							<C:forEach var="tickets" items="${u.telefonos}">

								<tr class="row100 body">

									<td class="cell100 column2"><a
										href="tel:${telefono.numero}">${telefono.numero}</a></td>

									<td class="cell100 column3">${telefono.tipo}</td>
									<td class="cell100 column4">${telefono.operadora}</td>

								</tr>
							</C:forEach>

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>


</body>
</html>