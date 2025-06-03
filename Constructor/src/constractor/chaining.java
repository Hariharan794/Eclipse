package constractor;

public class chaining {
	public chaining() {    //6        //7
		System.out.println("non-parameterized constructor");
	}
	public chaining(int age) {     //5    //6
		this();
		System.out.println("int parameterized constructor");
	}
	public chaining(String name) {    //1    
		this(2547854l);
		System.out.println("string parameterized constructor");
	}
	public chaining(double billNo ) {
		System.out.println("double parameterized constructor");
	}
	public chaining(long phno) {     //2     
		this('g');
		System.out.println("long parameterized constructor");
	}
	public chaining(char secercode) {    //3    //4
		this(true);
		System.out.println("char parameterized constructor");
	}
	public chaining(boolean result) {   //4     //5
		
		this(45);
		System.out.println("boolean parameterized constructor");
	}
	public static void main(String[] args) {
		chaining d1 = new chaining("hari");
		
	}

}
