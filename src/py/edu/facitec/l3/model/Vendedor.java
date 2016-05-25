package py.edu.facitec.l3.model;

import java.util.Date;

public class Vendedor {

	private int codigo;
	private String nombre;
	private String apellido;
	private boolean estado;
	private java.sql.Date fechaRegistro;
	private int cedula;
	
	public Vendedor() {
		codigo = 0;
		nombre = "";
		apellido = "";
		estado = false;
		fechaRegistro = new java.sql.Date(0, 0, 0);
		cedula = 0;
	}

	public Vendedor(int codigo, String nombre, String apellido, boolean estado, java.sql.Date fechaRegistro, int cedula) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estado = estado;
		this.fechaRegistro = fechaRegistro;
		this.cedula = cedula;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(java.sql.Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
}
