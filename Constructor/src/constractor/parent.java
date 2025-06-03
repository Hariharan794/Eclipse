package constractor;

public class parent  extends chaining{
	public parent() {      //3
		super('h');
		System.out.println("parent non-parameterized constructor");
	}
	public parent(int age) {    //2
		this();
		System.out.println("parent int parameterized constructor");
	}
	public parent(String name) {       //1
		this(24);
		System.out.println("parent string parameterized constructor");
	}
	public static void main(String[] args) {
		parent a1 = new parent("Hariharan");
		
	}

}
