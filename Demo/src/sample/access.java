package sample;

public class access {
	private void userid() {
		System.out.println("userid:hari@!23");
	}
	public void username() {
		System.out.println("username:ashok");
	}
	protected void email() {
		System.out.println("ashoh@3002");
	}
	 void phoneno() {
		 System.out.println("6529529855");
	}
	 public static void main(String[] args) {
		access as = new access();
		as.userid();
		as.username();
		as.email();
		as.phoneno();
	}

}
