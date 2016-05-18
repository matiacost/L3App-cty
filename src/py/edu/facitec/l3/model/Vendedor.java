package py.edu.facitec.l3.model;

import java.util.Date;

public class Vendedor {

	private int codigo;
	private String nombre;
	private String apellido;
	private boolean estado;
	private Date fechaRegistro;
	
	public Vendedor() {
		codigo = 0;
		nombre = "";
		apellido = "";
		estado = false;
		fechaRegistro = new Date();
	}

	public Vendedor(int codigo, String nombre, String apellido, boolean estado, Date fechaRegistro) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estado = estado;
		this.fechaRegistro = fechaRegistro;
	}

	public int getCodigo() {
		return codigo;
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

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
}
