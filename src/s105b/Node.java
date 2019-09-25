package s105b;

public class Node {
	private int value;
	private Node next; // null

	public Node(int value) {
		this.value = value; // mi creo il costruttore di node
	}

	public int getValue() {
		return value; // definisco metodo che restituisce il valore
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "{" + this.value + "}";
	}
}