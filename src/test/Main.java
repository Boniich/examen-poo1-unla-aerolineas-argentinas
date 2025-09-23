package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.AerolineasArgentinas;

//Parcial 2024
//Realizado 23-9-2025
//Tiempo utilizado: 1:09
//Dificultades: Validacion de codigo del aeropuerto (aunque no fue una dificultad como tal)
//Nota estimada: 9-10


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AerolineasArgentinas sistema = new AerolineasArgentinas();
		
		
		try {
			System.out.println("Test 1-1");
			sistema.agregarAeropuerto("CRD", "COMODORO RIVADAVIA");
			sistema.agregarAeropuerto("BUE", "BUENOS AIRES");
			sistema.agregarAeropuerto("COR", "CORDOBA");
			sistema.agregarAeropuerto("BRC", "BARILOCHE");
			System.out.println(sistema.getListaAeropuertos());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			System.out.println("Test 1-2");
			sistema.agregarAeropuerto("3JUJ", "JUJUY");
			System.out.println(sistema.getListaAeropuertos());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Test 2");
		System.out.println(sistema.traerAeropuerto("BUE"));
		
		
		System.out.println("Test 3");
		sistema.agregarPasajero("Ruina", "Oscar", 11111111, false);
		sistema.agregarPasajero("Scordamaglia", "Ezequiel", 2222222, true);
		sistema.agregarPasajero("Siciliano", "Gustavo", 3333333, true);
		sistema.agregarPasajero("Vranic", "Alejadra", 4444444, false);
		sistema.agregarPasajero("Bonino", "Ezequiel", 5555555, true);
		System.out.println(sistema.getListaPasajeros());
		
		System.out.println("Test 4");
		System.out.println(sistema.traerPasajero(3333333));
		
		
		try {
			System.out.println("Test 5-1");
			sistema.agregarVuelo(
					LocalDate.of(2024, 9, 28), 
					LocalTime.of(10, 30), 
					LocalTime.of(12, 30),
					sistema.traerAeropuerto("BUE"),
					sistema.traerAeropuerto("COR"));
			
			sistema.agregarVuelo(
					LocalDate.of(2024, 9, 29), 
					LocalTime.of(18, 00), 
					LocalTime.of(20, 00),
					sistema.traerAeropuerto("COR"),
					sistema.traerAeropuerto("BUE"));
			
			sistema.agregarVuelo(
					LocalDate.of(2024, 9, 30), 
					LocalTime.of(6, 00), 
					LocalTime.of(8, 00),
					sistema.traerAeropuerto("BUE"),
					sistema.traerAeropuerto("BRC"));
			
			System.out.println(sistema.getListaVuelos());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Test 5-2");
			sistema.agregarVuelo(
					LocalDate.of(2024, 10, 3), 
					LocalTime.of(7, 00), 
					LocalTime.of(9, 00),
					sistema.traerAeropuerto("COR"),
					sistema.traerAeropuerto("COR"));
			
			System.out.println(sistema.getListaVuelos());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Test 6");
		System.out.println(sistema.traerVuelo(2));
		
		System.out.println("Test 7");
		System.out.println(sistema.traerVuelo(2).calcularTiempoVuelo());
		
		System.out.println("Test 8");
		sistema.traerVuelo(2).agregar(sistema.traerPasajero(3333333));
		sistema.traerVuelo(2).agregar(sistema.traerPasajero(4444444));
		System.out.println(sistema.traerVuelo(2));
		
		
		System.out.println("Test 9");
		System.out.println(sistema.traerVuelo(
				LocalDate.of(2024, 9, 29), 
				sistema.traerAeropuerto("COR")));
	}

}
