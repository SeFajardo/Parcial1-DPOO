package logic;

public class Automovil extends Autonomia {

	@Override
	public double autonomia() {
		return ((15*Math.pow(10, 4)) / (this.cilindraje+this.peso))*(this.tamanotanque);
	}

}
