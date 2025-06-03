package intro;

public class Executeclass extends Baseclass {
	public static void main(String[] args) {
		Executeclass e = new Executeclass();
		e.openedgebrowseer();
		e.launchurl("https://www.facebook.com/login.php/");
		e.gettitle();
		e.getcurrenturl();
		
		
	}

}
