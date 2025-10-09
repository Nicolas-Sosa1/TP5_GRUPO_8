package presentacion.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datosImpl.UsuarioDaoImpl;
import entidad.Usuario;


@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public ServletUsuario() {
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Comprobar usuario
				String nombre = request.getParameter("usuario").trim();
				String contrasena = request.getParameter("contrasena").trim();
				
				Usuario usuario = new Usuario();
				usuario.setUsuario(nombre);
				usuario.setContrasena(contrasena);
				
				UsuarioDaoImpl daoUsuario = new UsuarioDaoImpl();
				
				if(daoUsuario.ValidarUsuario(usuario)) {
					request.getSession().setAttribute("nombreUsuario", usuario.getUsuario());
					
					RequestDispatcher rd = request.getRequestDispatcher("AltaCliente.jsp");
		    		rd.forward(request, response);
				}
				else {
					String mensaje = "Error, los datos son incorrectos";
					request.setAttribute("mensaje", mensaje);
					RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		    		rd.forward(request, response);
				}
					
			}
		
	}


