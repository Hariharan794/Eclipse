package demoAcess;



public class classB extends classA{
	public static void main(String[] args) {
		//with object
		classA ad = new classA();
		ad.empuser();
		ad.empemail();
		ad.number();
		
		
		//without object
		classA a1 = new classA();
		a1.empuser();
		a1.empemail();
		a1.number();
		
	}

}
