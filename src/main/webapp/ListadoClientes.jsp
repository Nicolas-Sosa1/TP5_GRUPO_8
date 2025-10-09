<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="entidad.Cliente" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%
  	// Cargo la lista de clientes
  	ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
  	if(request.getAttribute("listaClientes") != null){
  		listaClientes = (ArrayList<Cliente>)request.getAttribute("listaClientes");
  	}
 %>

</body>
</html>