package s105b;

public class Main {
	public static void main(String[] args) {
		MyList ml = new MyList(); // crea una lista vuota (stringa)
		System.out.println("Empty list" + ml);

		ml.add(42);
		ml.add(-7);
		System.out.println("List with one node: " + ml);
		System.out.println(ml.getSize());
	}

}
