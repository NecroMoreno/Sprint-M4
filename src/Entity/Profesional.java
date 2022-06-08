package Entity;

import Interface.IAsesoria;

public class Profesional extends Usuario implements IAsesoria{

	String titulo, fechaIngreso; // se agrega nombre y apellido ya que estos pueden no corresponder
	// exactamente al nombre de usuario
	
	public Profesional(String nombreUsuario, String nombres, String apellidos, String fechaNacimiento, String run,
			String titulo, String fechaIngreso) {
		super(nombreUsuario, nombres, apellidos, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
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
		String expresion = super.analizarUsuario() + "\nProfesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
		return expresion;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + ", toString()=" + super.toString()
				+ "]";
	}

}
