package regex;

public class Bracket_Expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String patt = "[A-Za-z0-9_]{3}at"; 
		
		String str1 = "A8tat";
		
		System.out.println(str1.matches(patt));
		

	}

}
