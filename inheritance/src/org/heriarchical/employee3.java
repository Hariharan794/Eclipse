package org.heriarchical;

public class employee3 extends employee1 {			// sub branch2
	public void andhrabank() {
		System.out.println("education loan:7%");
		System.out.println("gold loan:17%");
		System.out.println("home loan:29%");
	}

	public static void main(String[] args) {
		employee3 w1 = new employee3();
		w1.andhrabank();
		w1.reversebank();

	}
}
