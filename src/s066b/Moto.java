package s066b;

public class Moto extends Veicolo {
	public void sterza(boolean right, int angle) {
		System.out.println("Steering " + (right ? "right" : "left"));
	}
}
