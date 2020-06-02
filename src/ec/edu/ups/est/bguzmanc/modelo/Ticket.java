package ec.edu.ups.est.bguzmanc.modelo;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ticket
 *
 */
@NamedQuery(name = "findByPlaca", query = "SELECT t FROM Ticket t WHERE t.vehiculo.placa = :placa")
@Entity

public class Ticket implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int numero;
	@Temporal(TemporalType.DATE)
	private java.util.Calendar fechaDeIngreso;
	@Temporal(TemporalType.TIME)
	private java.util.Calendar horaDeIngreso;
	@Temporal(TemporalType.DATE)
	private java.util.Calendar fechaDeSalida;
	@Temporal(TemporalType.DATE)
	private java.util.Calendar horaDeSalida;
	@OneToOne
	@JoinColumn
	private Vehiculo vehiculo;

	public Ticket() {
		super();
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the fechaDeIngreso
	 */
	public java.util.Calendar getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	/**
	 * @param fechaDeIngreso the fechaDeIngreso to set
	 */
	public void setFechaDeIngreso(java.util.Calendar fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	/**
	 * @return the horaDeIngreso
	 */
	public java.util.Calendar getHoraDeIngreso() {
		return horaDeIngreso;
	}

	/**
	 * @param horaDeIngreso the horaDeIngreso to set
	 */
	public void setHoraDeIngreso(java.util.Calendar horaDeIngreso) {
		this.horaDeIngreso = horaDeIngreso;
	}

	/**
	 * @return the fechaDeSalida
	 */
	public java.util.Calendar getFechaDeSalida() {
		return fechaDeSalida;
	}

	/**
	 * @param fechaDeSalida the fechaDeSalida to set
	 */
	public void setFechaDeSalida(java.util.Calendar fechaDeSalida) {
		this.fechaDeSalida = fechaDeSalida;
	}

	/**
	 * @return the horaDeSalida
	 */
	public java.util.Calendar getHoraDeSalida() {
		return horaDeSalida;
	}

	/**
	 * @param horaDeSalida the horaDeSalida to set
	 */
	public void setHoraDeSalida(java.util.Calendar horaDeSalida) {
		this.horaDeSalida = horaDeSalida;
	}

	/**
	 * @return the vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * @param vehiculo the vehiculo to set
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", fechaDeIngreso=" + fechaDeIngreso + ", horaDeIngreso=" + horaDeIngreso
				+ ", fechaDeSalida=" + fechaDeSalida + ", horaDeSalida=" + horaDeSalida + ", vehiculo=" + vehiculo
				+ "]";
	}
	
	
   
}
