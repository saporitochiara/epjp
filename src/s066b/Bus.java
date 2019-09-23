package s066b;

public class Bus extends Veicolo implements Conditioning {
	@Override
	public void setTemperature(int newTemp) {
		System.out.println("La temperatura dell'autobus è " + newTemp);
	}
}
