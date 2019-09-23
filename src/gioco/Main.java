package gioco;

public class Main {
	public static void main(String[] args) {
		Personaggio[] personaggi = new Personaggio[2];
		personaggi[0] = new Orco("Max", "Bianchi", 50);
		personaggi[1] = new Umano("Marco", "Neri", 50);
	}
	
	int x = (int) ((Math.random() + 1) * 6);
	int y = (int) ((Math.random() + 1) * 6);
}
