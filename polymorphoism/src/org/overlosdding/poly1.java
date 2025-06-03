package org.overlosdding;


public class poly1 {							// overloading method
	private void company() {              
		System.out.println("emolh");          // argument'sdatatype
	}

	private void company(int regno) {
		System.out.println("Enter you regno:" + regno);
	}

	private void company(byte age) {
		System.out.println("Enter ur Age:" + age);
	}

	private void company(boolean Result , double lattitude) {   // // argument'sdatatype count
		System.out.println("enter a result type:" + Result);
		System.out.println("enter ur address:" + lattitude);
	}

	private void company(char u, double lattitude) {     // argument'sdatatype
		System.out.println("enter ur secertcode:" + 'u');
		System.out.println("enter ur :" + lattitude);
	}

	private void company(double lattitude, char u) {
		System.out.println("enter ur secertcode:" + 'u');
		System.out.println("enter ur no:" + lattitude);
	}
	public static void main(String[] args) {
		poly1 p1=new poly1();
		p1.company();
		p1.company(25);
		p1.company(true, 12.23);
		p1.company('k', 012.23);
//		p1.company(12.23, f);
		p1.company(12);
		
	}

}
