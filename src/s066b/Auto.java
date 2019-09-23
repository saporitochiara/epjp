package s066b;

public class Auto extends Veicolo implements Conditioning {
	@Override
	public void setTemperature(int newTemp) {
		System.out.println ("La temperatura dell'auto è "+newTemp);
	}
	public void climatizza (boolean on) {
		
	}

}
