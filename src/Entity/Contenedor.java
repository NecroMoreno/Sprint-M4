package Entity;

import java.util.ArrayList;

import Interface.IAsesoria;

public class Contenedor {

	/*
	 * Cree la clase Contenedor, la cual deber� tener declarado como atributos dos
	 * listas: una lista de instancias de la interface Asesoria, y una lista de
	 * objetos de la clase Capacitacion. En la primera lista pueden ser almacenados
	 * distintos tipos de usuarios. Los m�todos que debe contener esta clase son:
	 * Almacenar cliente: permite agregar un nuevo cliente a la lista de instancias
	 * de la interface Asesoria. Almacenar profesional: permite agregar un nuevo
	 * profesional a la lista de instancias de la interface Asesoria. Almacenar
	 * administrativo: permite agregar un nuevo administrativo a la lista de
	 * instancias de la interface Asesoria. Almacenar capacitaci�n: permite agregar
	 * una nueva capacitaci�n a la lista de instancias de la clase Capacitacion.
	 * Eliminar usuario: permite eliminar un usuario desde la lista de interfaces de
	 * Asesoria, de acuerdo con el RUN del usuario. Listar usuarios: permite
	 * desplegar la lista completa de usuarios, independiente del tipo. En este
	 * m�todo solo se deben desplegar los datos de la clase usuario. Listar usuarios
	 * por tipo: recibe un tipo de usuario (cliente, administrador o profesional), y
	 * retorna los datos respectivos seg�n el tipo de usuario. Listar
	 * capacitaciones: este m�todo despliega las capacitaciones registradas en la
	 * lista respectiva, junto con los datos del cliente al que est� asociada dicha
	 * capacitaci�n.
	 */
	
	private static ArrayList<IAsesoria>asesorias;
	private static ArrayList<Capacitacion> capacitaciones;
	
	public Contenedor() {
		this.asesorias = new ArrayList<IAsesoria>(); 
		this.capacitaciones = new ArrayList<Capacitacion>();
	}

	public static void addAsesorias(IAsesoria todosLosTiposDeIAsesoria) {
		asesorias.add(todosLosTiposDeIAsesoria);
	}
	
	public void agregaCapacitacion(Capacitacion capacitacion) {
		this.capacitaciones.add(capacitacion);
	}
	
	public void imprimeTodo() {
		for(IAsesoria r:asesorias) {
			System.out.println(r.analizarUsuario());
		}
	}
}
