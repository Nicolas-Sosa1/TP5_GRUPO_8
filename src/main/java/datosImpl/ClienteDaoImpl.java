package datosImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import datos.ClienteDao;
import entidad.Cliente;

public class ClienteDaoImpl implements ClienteDao {
	
	// Datos conexion
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "sistema_clientes";
	
	// Metodos
	
	// Listar
	@Override
	public ArrayList<Cliente> ObtenerClientes(){
		
		// IMPORTANTE
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		//
		
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		Connection cn = null;
			
		try {
			cn = DriverManager.getConnection(host+dbName, user, pass);
			Statement st = cn.createStatement();
			String query = "SELECT * FROM clientes";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setIdCliente(rs.getInt("id_cliente"));
				cliente.setDni(rs.getString("dni"));
				cliente.setCuil(rs.getString("cuil"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				cliente.setSexo(rs.getString("sexo"));
				cliente.setFechaNacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
			    cliente.setDireccion(rs.getString("direccion"));
			    cliente.setNacionalidad(rs.getString("nacionalidad"));
			    cliente.setLocalidad(rs.getString("localidad"));
			    cliente.setProvincia(rs.getString("provincia"));
			    cliente.setCorreoElectronico(rs.getString("correo_electronico"));
			    cliente.setTelefono(rs.getString("telefono"));
			    
			    listaClientes.add(cliente);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			return listaClientes;
		
	}
	
}