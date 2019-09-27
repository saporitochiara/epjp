package ex;

public class Mix {

	public static void main(String[] args) {
		int[] first = { 1, 2, 3, 3 };
		int[] second = { 3, 3, 4, 6 };
		System.out.println(mergeSorted(first, second));
	}

	public static int[] mergeSorted(int[] left, int right[]) {
		int a = left.length;
		int b = right.length;
		int[] mergeSorted = new int[a + b];

		int i = 0;
		int j = 0;
		while (i < left.length) {
			if (left[i] > right[j]) {
				mergeSorted[i] = right[j];
				j++;
			}
			mergeSorted[i] = left[i];
			i++;
		}

		return mergeSorted;
	}

	public String stringArray(int[] mergeSorted) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < mergeSorted.length; i++) {
			s.append(mergeSorted[i]);
		}
		return s.toString();
	}

}
