package FullyAbstraction;

public class Server2 extends Server1 {

	@Override
	void password() {
		System.out.println("13032003");
	}
	public static void main(String[] args) {
		Server2 s = new Server2();
		s.firstname();
		s.password();
		s.lastname();
	
	}

}
