package modelo;

import java.util.Objects;

public class Aeropuerto {

	private int idAeropuerto;
	private String codAeropuerto;
	private String aeropuerto;
	
	public Aeropuerto(int idAeropuerto, String codAeropuerto, String aeropuerto) throws Exception {
		super();
		this.idAeropuerto = idAeropuerto;
		this.setCodAeropuerto(codAeropuerto);
		this.aeropuerto = aeropuerto;
	}

	public int getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(int idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public String getCodAeropuerto() {
		return codAeropuerto;
	}

	public void setCodAeropuerto(String codAeropuerto) throws Exception {
		
		if(codAeropuerto.length() != 3) throw new Exception("Error: La longitud el codigo es incorrecta!");
		int index = 0;
		boolean sonSoloLetras = true;
		while(index < codAeropuerto.length() && sonSoloLetras) {
			if(!Character.isLetter(codAeropuerto.charAt(index))){
				sonSoloLetras = false;
			}
			index++;
		}
		
		if(!sonSoloLetras) throw new Exception("Error: El codigo no contiene 3 letras!");
		this.codAeropuerto = codAeropuerto;
	}

	public String getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(String aeropuerto) {
		
		this.aeropuerto = aeropuerto;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aeropuerto other = (Aeropuerto) obj;
		return Objects.equals(aeropuerto, other.aeropuerto) && Objects.equals(codAeropuerto, other.codAeropuerto)
				&& idAeropuerto == other.idAeropuerto;
	}

	@Override
	public String toString() {
		return "Aeropuerto [idAeropuerto=" + idAeropuerto + ", codAeropuerto=" + codAeropuerto + ", aeropuerto="
				+ aeropuerto + "]\n";
	}
	
	
	
}
