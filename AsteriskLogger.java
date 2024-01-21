package week5;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
	}

	@Override
	public void error(String str) {
		String newStr = "***ERROR: " + str + "***";
		String asterisk = "";
		for (int i = 0; i < newStr.length(); i++) {
			asterisk = "*" + asterisk;
		}
		System.out.println(asterisk);
		System.out.println(newStr);
		System.out.println(asterisk);
	}

}