package s073b;

public class Main {
	public static void main(String[] args) {
		Persona[] persone = new Persona[3];
		persone[0] = new Dipendente("Mario", "Rossi", 2000);
		persone[1] = new Consulente("Marco", "Bianchi", 200);
		persone[2] = new Dipendente("Antonio", "Russo", 1600);

		for (Persona persona : persone) {
			System.out.println(persona);
		}

		for (Persona persona : persone) {
			if (persona instanceof Consulente) {
				Consulente c = (Consulente) persona;
				System.out.println(c.getBill());
			} else if (persona instanceof Dipendente) {
				Dipendente d = (Dipendente) persona;
				System.out.println(d.getSalary());
			}
		}

	}
}
