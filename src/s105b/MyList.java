package s105b;

public class MyList {
	private Node head;
	private int count;

	public void add(int value) {
		Node node = new Node(value); // nodo che ha dentro il mio valore e come next, null

		if (head == null) {
			head = node;
			return;
		}

		Node cur = head; // mi creo variabili locali, so già che non è null
		Node next = cur.getNext(); // next del nodo corrente, potrebbe essere null
		while (next != null) {
			cur = next; // fino a che next non è null assegna alla variabile locale il next
		}
		cur.setNext(node);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder("[");

		Node cur = head;
		while (cur != null) {
			s.append(cur);
			cur = cur.getNext();
			count++;
		}
		s.append("]");

		return s.toString();
	}

	public int getSize() {
		return count;
	}
}
