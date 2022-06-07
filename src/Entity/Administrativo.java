package Entity;

import Interface.IAsesoria;

public class Administrativo extends Usuario implements IAsesoria{

	private String nombres, apellidos, area, experienciaPrevia; // se agrega nombre y apellido ya que estos pueden no
	// corresponder exactamente al nombre de usuario

	public Administrativo(String nombreUsuario, String fechaNacimiento, String run, String nombres, String apellidos,
			String area, String experienciaPrevia) {
		super(nombreUsuario, fechaNacimiento, run);
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

}
