package s066b;

public class Bus extends Veicolo implements Climatizza {
	@Override
	public void setTemperature(int newTemp) {
		System.out.println ("La temperatura dell'autobus è "+newTemp);
	}
}
