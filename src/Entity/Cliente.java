package Entity;

import java.util.ArrayList;

import Interface.IAsesoria;

public class Cliente extends Usuario implements IAsesoria{

	private String nombres, apellidos, rut, telefono, afp, sistemaSalud, direccion, comuna;
	private int edad;
	private ArrayList<Capacitacion> capacitaciones;
	private ArrayList<Accidente> accidentes;
	private ArrayList<VisitaTerreno> visitasTerreno;

	public Cliente(String nombreUsuario, String fechaNacimiento, String run, String nombres, String apellidos,
			String rut, String telefono, String afp, String sistemaSalud, String direccion, String comuna, int edad) {
		super(nombreUsuario, fechaNacimiento, run);
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.capacitaciones = new ArrayList<Capacitacion>();
		this.accidentes = new ArrayList<Accidente>();
		this.visitasTerreno = new ArrayList<VisitaTerreno>();
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

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void agregaCapacitacion(Capacitacion capacitacion) {
		this.capacitaciones.add(capacitacion);
	}

	public void agregaAccidente(Accidente accidente) {
		this.accidentes.add(accidente);
	}

	public void agregaVisitaTerreno(VisitaTerreno visitaTerreno) {
		this.visitasTerreno.add(visitaTerreno);
	}

}
