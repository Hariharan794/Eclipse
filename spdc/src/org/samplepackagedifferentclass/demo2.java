package org.samplepackagedifferentclass;

public class demo2 {
	private void teacher() {
		System.out.println("all subject are you clear!");
	}
	private void sir() {
		System.out.println("yeah i'm clear!");
	}
public static void main(String[] args) {
	demo2 rm = new demo2();
	rm.teacher();
	rm.sir();
	
	demo1 rm1 = new demo1();
	rm1.headmaster();
	
	
}

}
