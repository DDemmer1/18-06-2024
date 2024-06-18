package de.demmer.dennis;

public class RecTest {

	// 10 + 9 + 8 + 7 + ...
	public int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}

	// 10 + sum(9)
	// 10 + 9 + sum(8)
	// 10 + 9 + 8 + sum(7) ... + 0
	// ...

}
