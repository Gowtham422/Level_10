package regex;

public class Charcter_Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String patt = "\\w{2,6}\\W{2}";
		
		String str1 = "rtTYOY*(";
		
		System.out.println(str1.matches(patt));
		
	}

}
