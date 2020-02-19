package serviceImpl;

import com.luis.converter.ClienteConverter;
import com.luis.dao.Cliente;
import com.luis.dto.ClienteDTO;
import com.luis.service.IClienteServiceDao;
import com.luis.util.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class IClienteServiceImpl implements IClienteServiceDao {

	@Override
	public boolean registar(Cliente cliente) {
		boolean registrar = false;
		Statement stm = null;
		Connection con = null;
		String sql = "INSERT INTO cliente values (NULL,'" + cliente.getCedula() + "','" + cliente.getNombre() + "','"
				+ cliente.getApellido() + "')";
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();

		} catch (Exception e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<ClienteDTO> getClientes() {
		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM CLIENTE ORDER BY ID";

		List<ClienteDTO> listaClienteDTO = new ArrayList<ClienteDTO>();
        ClienteConverter converter = new ClienteConverter();
		try {

			co = Conexion.conectar();
			stm = co.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Cliente c = new Cliente();
				c.setId(rs.getInt(1));
				c.setCedula(rs.getInt(2));
				c.setNombre(rs.getString(3));
				c.setApellido(rs.getString(4));
				listaClienteDTO.add(converter.fromEntity(c));
			}
			stm.close();
			rs.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}
		return listaClienteDTO;
	}

	@Override
	public boolean eliminar(Cliente cliente) {
		boolean flag = false;
		Connection connect = null;
		Statement stm = null;

		String sql = "DELETE FROM CLIENTE WHERE ID=" + cliente.getId();
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			flag = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método eliminar");
			e.printStackTrace();
		}

		return flag;
	}

	@Override
	public boolean update(Cliente cliente) {
		boolean flag = false;

		Connection co = null;
		Statement stm = null;

		String sql = "UPDATE CLIENTE SET cedula='" + cliente.getCedula() + "', nombre='" + cliente.getNombre()
				+ "', apellido='" + cliente.getApellido() + "'" + " WHERE ID=" + cliente.getId();
		try {

			co = Conexion.conectar();
			stm = co.createStatement();
			stm.execute(sql);
			flag = true;

			stm.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: Clase ClienteDaoImple");
			e.printStackTrace();
		}

		return flag;
	}
}
