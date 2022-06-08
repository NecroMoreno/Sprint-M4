package Entity;

import java.util.ArrayList;

import Interface.IAsesoria;

public class Cliente extends Usuario implements IAsesoria {

	private String rut, telefono, afp, direccion, comuna;
	private int edad, sistemaSalud;

	private ArrayList<Accidente> accidentes;
	private ArrayList<VisitaTerreno> visitasTerreno;

	public Cliente(String nombreUsuario, String fechaNacimiento, String run, String nombres, String apellidos,
			String rut, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
		super(nombreUsuario, nombres, apellidos, fechaNacimiento, run);
		this.rut = rut;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.accidentes = new ArrayList<Accidente>();
		this.visitasTerreno = new ArrayList<VisitaTerreno>();
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

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
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

	public void agregaAccidente(Accidente accidente) {
		this.accidentes.add(accidente);
	}

	public void agregaVisitaTerreno(VisitaTerreno visitaTerreno) {
		this.visitasTerreno.add(visitaTerreno);
	}

	public String obtenerNombre() {
		String nombreCompleto = super.getNombres() + " " + super.getApellidos();
		return nombreCompleto;

	}

	public String obtenerSistemaSalud() {

		String sistemaSaludToString = "";

		switch (sistemaSalud) {

		case 1:
			sistemaSaludToString = "Fonasa";
			break;
		case 2:
			sistemaSaludToString = "Isapre";

		}
		return sistemaSaludToString;
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [rut=" + rut + ", telefono=" + telefono + ", afp=" + afp + ", sistemaSalud="
				+ sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + ", accidentes="
				+ accidentes + ", visitasTerreno=" + visitasTerreno + "]";
	}

	@Override
	public String analizarUsuario() {
		String expresion = super.analizarUsuario() + "\n[Direccion: " + direccion + "]" + "\n[Comuna: " + comuna + "]";
		return expresion;
	}

}
