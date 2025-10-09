<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alta Cliente</title>
<!-- Bootstrap -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  
  <style>
  .nav-link.active {
    background-color: #0d47a1 !important; 
    font-weight: bold;
  }
</style>
</head>
<body class="bg-body-tertiary">

<div class="d-flex">
  <!-- MENU SIDEBAR -->
  <aside class="d-flex flex-column flex-shrink-0 p-3 text-white bg-primary"
         style="width:240px; min-height:100vh; position:sticky; top:0;">
    <span class="fs-5 fw-semibold mb-3">Menú</span>
    <hr class="border-light">
    <ul class="nav nav-pills flex-column mb-auto">
      <li class="nav-item">
        <a class="nav-link active text-white" href="AltaCliente.jsp">Alta de Cliente</a>
      </li>
      <li class="nav-item">
        <a class="nav-link text-white" href="ServletCliente">Listado de Clientes</a>
      </li>
    </ul>
  </aside>
  
    <%
		// Obtener mensaje en caso de exito/error
		String mensaje = "";
		if (request.getAttribute("mensaje") != null){
			mensaje = (String)request.getAttribute("mensaje");
		}
  %>
  
  <!-- CONTENIDO -->
  <main class="flex-grow-1 p-4">
    <h2 class="mb-4">Formulario de Cliente</h2>

</body>
</html>