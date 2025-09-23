package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vuelo {
	
	private int idVuelo;
	private LocalDate fecha;
	private LocalTime horaSalida;
	private LocalTime horaLlegada;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;
	private List<Pasajero> listaPasajeros;
	
	public Vuelo(int idVuelo, LocalDate fecha, LocalTime horaSalida, LocalTime horaLlegada, Aeropuerto aeropuertoSalida,
			Aeropuerto aeropuertoLlegada) {
		super();
		this.idVuelo = idVuelo;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.aeropuertoSalida = aeropuertoSalida;
		this.aeropuertoLlegada = aeropuertoLlegada;
		this.listaPasajeros = new ArrayList<Pasajero>();
	}
	
	
	public boolean agregar(Pasajero pasajero) {
		return this.listaPasajeros.add(pasajero);
	}
	
	
	public int calcularTiempoVuelo() {
		
		return 60*(horaLlegada.getHour()-horaSalida.getHour())
				+(horaLlegada.getMinute()-horaSalida.getMinute());
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}

	public LocalTime getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(LocalTime horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Aeropuerto getAeropuertoSalida() {
		return aeropuertoSalida;
	}

	public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
		this.aeropuertoSalida = aeropuertoSalida;
	}

	public Aeropuerto getAeropuertoLlegada() {
		return aeropuertoLlegada;
	}

	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
		this.aeropuertoLlegada = aeropuertoLlegada;
	}

	public List<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}

	public void setListaPasajeros(List<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return Objects.equals(aeropuertoLlegada, other.aeropuertoLlegada)
				&& Objects.equals(aeropuertoSalida, other.aeropuertoSalida) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(horaLlegada, other.horaLlegada) && Objects.equals(horaSalida, other.horaSalida)
				&& idVuelo == other.idVuelo && Objects.equals(listaPasajeros, other.listaPasajeros);
	}

	@Override
	public String toString() {
		return "Vuelo \n[idVuelo=" + idVuelo + ", fecha=" + fecha + ", horaSalida=" + horaSalida + ", horaLlegada="
				+ horaLlegada + ", aeropuertoSalida=" + aeropuertoSalida + ", aeropuertoLlegada=" + aeropuertoLlegada
				+ ", listaPasajeros=" + listaPasajeros + "]\n";
	}
	
	
	
	
}
