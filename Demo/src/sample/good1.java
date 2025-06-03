package sample;

public class good1 implements good {
	@Override
	public void hari() {
		System.out.println("dfgh");
		
	}

	@Override
	public void haran() {
		System.out.println("tyui");
		
	}
	public static void main(String[] args) {
		good1 as = new good1();
		as.hari();
		as.haran();
	}

}
