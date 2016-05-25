package py.edu.facitec.l3.dao;

import java.sql.SQLException;

import py.edu.facitec.l3.model.Vendedor;
import py.edu.facitec.l3.util.ConexionManager;

public class VendedorDao {

	public static void guardarVendedor(Vendedor vendedor){
		
		String sql = "INSERT INTO tb_vendedor(nombres, apellidos, cedula, estado, fecha_registro) VALUES ('"+vendedor.getNombre()+"',"
				+ " '"+vendedor.getApellido()+"',"
						+ " "+vendedor.getCedula()+","
								+ ""+vendedor.isEstado()+", "
										+ "'"+vendedor.getFechaRegistro()+"', )";
		
		System.out.println(sql);
		
		ConexionManager.abrirConexion();
		
		try {
			ConexionManager.stm.executeUpdate(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		ConexionManager.cerrarConexion();
		
	}
}
