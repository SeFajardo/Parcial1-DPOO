package logic;

public abstract class Autonomia {
	protected double cilindraje;
	
	public double getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	protected double peso;
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	protected double tamanotanque;
	public double getTamano() {
		return tamanotanque;
	}
	public void setTamanoTanque(double tamano) {
		this.tamanotanque = tamano;
	}

	public abstract double autonomia();
}
