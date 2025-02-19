package logic;

public class Motocicleta extends Autonomia {
	
	@Override
	public double autonomia() {
		return ((8*Math.pow(10, 4)) / (this.cilindraje+(2*this.peso)))*(this.tamanotanque);
	}

}