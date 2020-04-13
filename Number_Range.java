package regex;

public class Number_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String patt = "2[2-3][0-9]|240";
		
		String str1 = "100";
		
		System.out.println(str1.matches(patt));

	}

}
