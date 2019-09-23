package s073b;

public class Dipendente extends Persona {
	private int salario;

	public Dipendente(String nome, String cognome, int salario) {
		super(nome, cognome);
		this.salario = salario;
	}

	public int getSalary() {
		return salario;
	}

	@Override
	public String toString() {
		return "Dipendente [salario=" + salario + "]";
	}

}
