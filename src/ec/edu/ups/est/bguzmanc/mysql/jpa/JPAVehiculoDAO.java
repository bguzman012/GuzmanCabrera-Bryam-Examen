package ec.edu.ups.est.bguzmanc.mysql.jpa;

import ec.edu.ups.est.bguzmanc.DAO.VehiculoDAO;
import ec.edu.ups.est.bguzmanc.modelo.Vehiculo;

public class JPAVehiculoDAO  extends JPAGenericDAO<Vehiculo, String> implements VehiculoDAO {
	
	public JPAVehiculoDAO() {
		super(Vehiculo.class);
		// TODO Auto-generated constructor stub
		
	}
	
	
	
	


}
