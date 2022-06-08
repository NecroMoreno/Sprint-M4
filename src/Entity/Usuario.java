package Entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import Interface.IAsesoria;

public class Usuario implements IAsesoria{

	private String nombreUsuario, nombres, apellidos, fechaNacimiento, run; // se define nombre de usuario como un nombre de usuario que es
														// entregado.
	
	public Usuario(String nombreUsuario, String nombres,
			String apellidos, String fechaNacimiento, String run) {
		this.nombreUsuario = nombreUsuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
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

	public String mostrarEdad() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimientoLocal = LocalDate.parse(fechaNacimiento, formatter);
		Period edadPeriod = Period.between(fechaNacimientoLocal, LocalDate.now());
		int edad = edadPeriod.getYears();
		String mensaje = String.valueOf(edad);
		
		mensaje = "El usuario tiene " + mensaje + " años";
		return mensaje;
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run
				+ "]";
	}

	@Override
	public String analizarUsuario() {
		String mensaje = "Usuario [nombreUsuario=" + nombreUsuario + ", run=" + run + "]";
		return mensaje;
	}
	
}
