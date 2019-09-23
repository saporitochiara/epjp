package gioco;

public abstract class Personaggio {

//	nome, clan, pt vita, metodo combatti, stampa pt vita

	protected String nome;
	protected String clan;
	protected int punti_vita;

	public Personaggio(String nome, String clan, int punti_vita) {
		this.nome = nome;
		this.clan = clan;
		this.punti_vita = punti_vita;
	}

	public int getPunti_Vita() {
		return punti_vita;
	}
}
