package s066b;

public class Auto extends Veicolo implements Climatizza {
	@Override
	public void setTemperature(int newTemp) {
		System.out.println ("La temperatura dell'auto � "+newTemp);
	}

}
