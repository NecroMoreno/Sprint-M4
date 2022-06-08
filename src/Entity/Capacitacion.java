package Entity;

public class Capacitacion {

	private String identificador, rutCliente,dia, hora, lugar;
	private int duracion, cantidadAsistentes;
	private Cliente cliente;

	public Capacitacion(String identificador, String dia, String hora, String lugar, int duracion,
			int cantidadAsistentes, Cliente cliente) {
		this.identificador = identificador;
		this.rutCliente = cliente.getRut(); //ver si debo cambiar esto o no 
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public Capacitacion() {

	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public String mostrarDetalle() {
		
		return  "La capacitaci�n ser� en " + lugar + " a las " + hora + " del d�a " + dia + ", y durar� " + duracion + " minutos."; 
		
	}
	
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + ", cliente=" + cliente + "]";
	}
	
	

}
