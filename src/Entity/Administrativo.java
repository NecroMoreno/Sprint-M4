package Entity;

import Interface.IAsesoria;

public class Administrativo extends Usuario implements IAsesoria{

	private String area, experienciaPrevia; // se agrega nombre y apellido ya que estos pueden no
	// corresponder exactamente al nombre de usuario

	public Administrativo(String nombreUsuario, String nombres, String apellidos, String fechaNacimiento, String run,
			String area, String experienciaPrevia) {
		super(nombreUsuario, nombres, apellidos, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
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

	@Override
	public String analizarUsuario() {
		return null;
	}

}
