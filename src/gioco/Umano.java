package gioco;

public class Umano extends Personaggio {

	public Umano(String nome, String clan, int pv_umano) {
		super(nome, clan, pv_umano);

	}

	public int esito(int pv_umano, int pv_orco) {

		int x = (int) ((Math.random() + 1) * 6);
		int y = (int) ((Math.random() + 1) * 6);
		int esito = pv_umano * x + pv_orco * y;

		return esito;
	}

}
//bonus attacco