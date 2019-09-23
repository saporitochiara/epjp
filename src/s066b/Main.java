package s066b;

public class Main {
	public static void main(String[] args) {
		Veicolo[] veicoli = new Veicolo[3];
		veicoli[0] = new Auto();
		veicoli[1] = new Moto();
		veicoli[2] = new Bus();

		boolean rightDirection = true;
		for (Veicolo veicolo : veicoli) {
			if (veicolo instanceof Moto) {
				Moto moto = (Moto) veicolo;
				moto.sterza(rightDirection, 20);
			} else {
				veicolo.sterza(rightDirection);
				rightDirection = !rightDirection;
			}

			Conditioning[] conditionings = new Conditioning[2];
			conditionings[0] = new Auto();
			conditionings[1] = new Bus();

			for (Conditioning conditioning : conditionings) {
				if (conditioning instanceof Auto) {
					System.out.println("This is a car -> ");
					Auto auto = (Auto) conditioning;
					auto.sterza(true);
				} else {
					System.out.println("This is not a car");
				}
			}

			// (1) sterza solo l'auto in climatizzazione
		}
	}
}