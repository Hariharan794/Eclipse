package demoAcess;


public class classA {
	private void empname() {
		System.out.println("enter a employee name:hari");

	}

	public void empuser() {
		System.out.println("enter a employee user:hari123");

	}

	protected void empemail() {
		System.out.println("enter a employee mail:hari@1234");

	}

	void number() {
		System.out.println("enter a employee no:15425222222");

	}

	public static void main(String[] args) {
		classA as = new classA();
		as.empname();
		as.empuser();
		as.empemail();
		as.number();
	}


}
