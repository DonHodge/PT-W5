package week5;

public class App {
	
	public static void main(String[] args) {
		Logger asterisk = new AsteriskLogger();
		asterisk.log("Hello");
		
		System.out.println();
		
		asterisk.error("Hello");
		
		Logger space = new SpacedLogger();
		space.log("Hello");
		
		System.out.println();
		space.error("Hello");
	}
}