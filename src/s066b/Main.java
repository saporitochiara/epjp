package s066b;

public class Main {
	public static void main(String[] args) {
		Veicolo[] veicoli = new Veicolo[3];
		veicoli[0] = new Auto();
		veicoli[1] = new Moto();
		veicoli[2] = new Bus();

		for (Veicolo veicolo : veicoli) {
			veicolo.sterza();
		}

		Climatizza[] climatizzazione = new Climatizza[2];
		climatizzazione[0] = new Auto();
		climatizzazione[1] = new Bus();
		int temperature = 20;

		for (Climatizza climatizza : climatizzazione) {
			climatizza.setTemperature(temperature);
			temperature += 1;
		}
	}
}
