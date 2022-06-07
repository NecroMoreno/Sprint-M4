package Entity;

import Interface.IAsesoria;

public class Profesional extends Usuario implements IAsesoria{

	String nombres, apellidos, titulo, fechaIngreso; // se agrega nombre y apellido ya que estos pueden no corresponder
	// exactamente al nombre de usuario

	public Profesional(String nombreUsuario, String fechaNacimiento, String run, String nombres, String apellidos,
			String titulo, String fechaIngreso) {
		super(nombreUsuario, fechaNacimiento, run);
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	public String analizarUsuario() {
		return null;
	}

}
