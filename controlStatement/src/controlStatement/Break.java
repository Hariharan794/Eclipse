package controlStatement;



public class Break {
public static void main(String[] args) {
		
		String day = "sat";
		
		switch (day) {
		case "Mon":
			System.out.println("monday");
			break;
		case "tue":
			System.out.println("tuesday");
			break;
		case "wed":
			System.out.println("wednesday");
			break;
		case "thurs":
			System.out.println("thursday");
			break;
		case "fri":
			System.out.println("friday");
			break;
		case "sat":
			System.out.println("saturday");
			break;


		default:
//			System.out.println("unknown value");
			break;
		}
	}

}
