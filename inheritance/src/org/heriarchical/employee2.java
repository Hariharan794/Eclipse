package org.heriarchical;

public class employee2 extends employee1 {         // sub branch1
	public void axisbank() {
		System.out.println("interset:15%");
		System.out.println("loan:20%");
	}

	public static void main(String[] args) {
		employee2 e1 = new employee2();
		e1.axisbank();
		e1.reversebank();
	}
}
