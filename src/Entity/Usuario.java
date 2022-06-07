package Entity;

import Interface.IAsesoria;

public class Usuario implements IAsesoria{

	private String nombreUsuario, fechaNacimiento, run; // se define nombre de usuario como un nombre de usuario que es
														// entregado.

	public Usuario(String nombreUsuario, String fechaNacimiento, String run) {
		this.nombreUsuario = nombreUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	public Usuario() {
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	@Override
	public String analizarUsuario() {
		return null;
	}

}
