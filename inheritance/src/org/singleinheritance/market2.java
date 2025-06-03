package org.singleinheritance;

public class market2 extends market1 {				// child class
	public void minimarket() {
		System.out.println("buy 1 get 1 free");	
	}
	public static void main(String[] args) {
		market2 m1 = new market2();
		m1.minimarket();
		m1.supermarket();
	}
}
