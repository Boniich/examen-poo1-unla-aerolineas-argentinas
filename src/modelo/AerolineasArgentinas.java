package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AerolineasArgentinas {
	
	private List<Aeropuerto> listaAeropuertos;
	private List<Pasajero> listaPasajeros;
	private List<Vuelo> listaVuelos;
	
	public AerolineasArgentinas() {
		this.listaAeropuertos = new ArrayList<Aeropuerto>();
		this.listaPasajeros = new ArrayList<Pasajero>();
		this.listaVuelos = new ArrayList<Vuelo>();
	}
	
	public Aeropuerto traerAeropuerto(String codAeroString) {
		Aeropuerto aeropuertoEncontrado = null;
		int index = 0;
		boolean encontrado = false;
		while(index < listaAeropuertos.size() && !encontrado) {
			if(listaAeropuertos.get(index).getCodAeropuerto().equalsIgnoreCase(codAeroString)) {
				aeropuertoEncontrado = listaAeropuertos.get(index);
				encontrado = true;
			}
			index++;
		}
		return aeropuertoEncontrado;
	}
	
	public Pasajero traerPasajero(int dni) {
		Pasajero pasajeroEncontrado = null;
		int index = 0;
		boolean encontrado = false;
		while(index < listaPasajeros.size() && !encontrado) {
			if(listaPasajeros.get(index).getDni() == dni) {
				pasajeroEncontrado = listaPasajeros.get(index);
				encontrado = true;
			}
			index++;
		}
		return pasajeroEncontrado;
	}
	
	public Vuelo traerVuelo(int idVuelo) {
		Vuelo vueloEncontrado = null;
		int index = 0;
		boolean encontrado = false;
		while(index < listaVuelos.size() && !encontrado) {
			if(listaVuelos.get(index).getIdVuelo()== idVuelo) {
				vueloEncontrado = listaVuelos.get(index);
				encontrado = true;
			}
			index++;
		}
		return vueloEncontrado;
	}
	
	public List<Vuelo> traerVuelo(LocalDate fecha, Aeropuerto aeropuertoSalida){
		List<Vuelo> vuelos = new ArrayList<Vuelo>();
		
		for(Vuelo v : listaVuelos) {
			if(v.getFecha().equals(fecha) && v.getAeropuertoSalida().equals(aeropuertoSalida)) {
				vuelos.add(v);
			}
		}
		return vuelos;
	}
	
	
	//Caso de uso 1
	public boolean agregarAeropuerto(String codAeropuerto, String aeropuerto) throws Exception {
		int id = 1;
		if(!listaAeropuertos.isEmpty()) id = listaAeropuertos.get(listaAeropuertos.size()-1).getIdAeropuerto()+1;
		return listaAeropuertos.add(new Aeropuerto(id, codAeropuerto, aeropuerto));
	}
	
	public boolean agregarPasajero(String apellido, String nombres, int dni, boolean viajeroFrecuente) {
		int id = 1;
		if(!listaPasajeros.isEmpty()) id = listaPasajeros.get(listaPasajeros.size()-1).getIdPasajero()+1;
		return listaPasajeros.add(new Pasajero(id, apellido, nombres, dni, viajeroFrecuente));
	}
	
	
	public boolean agregarVuelo(LocalDate fecha, LocalTime horaSalida, LocalTime horaLlegada,
			Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) throws Exception {
		if(aeropuertoSalida.equals(aeropuertoLlegada)) throw new Exception("Error: El aueropuero de salida y llegada es el mismo");
		
		int id = 1;
		if(!listaVuelos.isEmpty()) id = listaVuelos.get(listaVuelos.size()-1).getIdVuelo()+1;
		return listaVuelos.add(new Vuelo(id, fecha, horaSalida, horaLlegada, aeropuertoSalida,aeropuertoLlegada));
	}
	
	
	
	public List<Aeropuerto> getListaAeropuertos() {
		return listaAeropuertos;
	}

	public void setListaAeropuertos(List<Aeropuerto> listaAeropuertos) {
		this.listaAeropuertos = listaAeropuertos;
	}

	public List<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}

	public void setListaPasajeros(List<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}

	public List<Vuelo> getListaVuelos() {
		return listaVuelos;
	}

	public void setListaVuelos(List<Vuelo> listaVuelos) {
		this.listaVuelos = listaVuelos;
	}
	
	
}
