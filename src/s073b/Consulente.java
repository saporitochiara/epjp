package s073b;

public class Consulente extends Persona {
	private int tariffa;

	public Consulente(String nome, String cognome, int tariffa) {
		super(nome, cognome);
		this.tariffa = tariffa;
	}

	public int getBill() {
		return tariffa;
	}

	@Override
	public String toString() {
		return "Consulente [tariffa=" + tariffa + "]";
	}

}