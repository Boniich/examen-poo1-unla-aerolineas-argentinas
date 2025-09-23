package modelo;

import java.util.Objects;

public class Pasajero {
	
	private int idPasajero;
	private String apellido;
	private String nombre;
	private int dni;
	private boolean viajeroFrecuente;
	
	public Pasajero(int idPasajero, String apellido, String nombre, int dni, boolean viajeroFrecuente) {
		super();
		this.idPasajero = idPasajero;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.viajeroFrecuente = viajeroFrecuente;
	}

	public int getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(int idPasajero) {
		this.idPasajero = idPasajero;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public boolean isViajeroFrecuente() {
		return viajeroFrecuente;
	}

	public void setViajeroFrecuente(boolean viajeroFrecuente) {
		this.viajeroFrecuente = viajeroFrecuente;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasajero other = (Pasajero) obj;
		return Objects.equals(apellido, other.apellido) && dni == other.dni && idPasajero == other.idPasajero
				&& Objects.equals(nombre, other.nombre) && viajeroFrecuente == other.viajeroFrecuente;
	}

	@Override
	public String toString() {
		return "Pasajero [idPasajero=" + idPasajero + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ ", viajeroFrecuente=" + viajeroFrecuente + "]\n";
	}
	
	
	
	
}
