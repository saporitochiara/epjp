package s040;

public class exercise {
	public static void main(String[] args) {
		boolean[] flags = { true, false, false };
		System.out.println("Initial values");
		for (boolean f : flags) {
			System.out.println(f);
		}
		System.out.println("Primo cambio");
		for (int i = 0; i < flags.length; i++) {
			if (flags[i] == false) {
				flags[i] = true;
			}
			System.out.println(flags[i]);
		}
		System.out.println("Secondo cambio");
		for (boolean f : flags) {
			if (f == true) {
				f = false;
			}
			System.out.println(f);
		}
		for (int i = 0; i < flags.length; i++) {
			System.out.println(flags[i]);
		}
	}
}
