package gioco;

public class Orco extends Personaggio {
//bonus difesa

	public Orco(String nome, String clan, int pv_orco) {
		super(nome, clan, pv_orco);
	}

	public int esito(int pv_orco, int pv_avv) {

		int x = (int) ((Math.random() + 1) * 6);
		int y = (int) ((Math.random() + 1) * 6);
		int esito = pv_orco * x + pv_avv * y;

		return esito;
	}

}
