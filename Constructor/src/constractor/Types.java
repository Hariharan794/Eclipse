package constractor;

public class Types {
	public Types() {
		System.out.println("non-parameterized constructor");
	}
	
	public Types(int age) {
		System.out.println("parameterized constructor");
	}
	public static void main(String[] args) {
		Types t3 = new Types();
		Types t4 = new Types(25);
	}

}
