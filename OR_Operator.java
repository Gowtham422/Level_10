package regex;

public class OR_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String patt = "a(b|c|d|xyz|123)";
		
		String str1 = "a123";
		
		System.out.println(str1.matches(patt));


	}

}
