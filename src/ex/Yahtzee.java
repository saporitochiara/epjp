package ex;

import java.util.TreeSet;

enum Numbers {
	ONE, TWO, THREE, FOUR, FIVE, SIX, PICCOLA_SCALA, GRANDE_SCALA, TRIS
}

public class Yahtzee {

	public int yaht(int[] comb, Numbers combination) {
		int punt = 0;
		if (combination == Numbers.ONE) {
			for (int i = 0; i < comb.length; i++) {
				if (comb[i] == 1) {
					punt++;
				}
			}
		}
		if (combination == Numbers.TWO) {
			for (int i = 0; i < comb.length; i++) {
				if (comb[i] == 2) {
					punt++;
				}
			}
		}
		if (combination == Numbers.THREE) {
			for (int i = 0; i < comb.length; i++) {
				if (comb[i] == 3) {
					punt++;
				}
			}
		}
		if (combination == Numbers.FOUR) {
			for (int i = 0; i < comb.length; i++) {
				if (comb[i] == 4) {
					punt++;
				}
			}
		}
		if (combination == Numbers.FIVE) {
			for (int i = 0; i < comb.length; i++) {
				if (comb[i] == 5) {
					punt++;
				}
			}
		}
		if (combination == Numbers.SIX) {
			for (int i = 0; i < comb.length; i++) {
				if (comb[i] == 6) {
					punt++;
				}
			}
		}
		if (combination == Numbers.PICCOLA_SCALA) {
			TreeSet<Integer> tsp = new TreeSet<>();
			for (int i = 0; i < comb.length; i++) {
				int a = comb[i];
				tsp.add(a);
			}
			if (tsp.size() == 4) {
				if (tsp.last() - tsp.first() == 3) {
					punt += 30;
				}
				if (tsp.size() == 5) {
					if (tsp.last() - tsp.first() == 4) {
						punt += 30;
					} else if (tsp.last() - tsp.first() == 5 && tsp.last() == 6) {
						punt += 30;
					}
				}
				if (combination == Numbers.GRANDE_SCALA) {
					TreeSet<Integer> tsg = new TreeSet<>();
					for (int i = 0; i < comb.length; i++) {
						int a = comb[i];
						tsg.add(a);
					}
					if (tsg.size() == 5) {
						if (tsp.last() - tsp.first() == 4) {
							punt += 40;
						}
					}
				}
				if (combination == Numbers.TRIS) {
					for (int i = 0; i < comb.length; i++) {
					}
				}
			}

		}
		return punt;
	}
}