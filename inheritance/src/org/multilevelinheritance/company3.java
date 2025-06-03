package org.multilevelinheritance;

public class company3 extends company2  {			 //child class
	public void smallmarket() {
		System.out.println("fruits name:APPLE");
		System.out.println("vegtable name:carrot");
	}

	public static void main(String[] args) {
		company3 c3 = new company3();
		c3.smallmarket();
		c3.minimarket();
		c3.supermarket();
	}

}
