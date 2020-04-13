package regex;

public class RegEx_Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt = "www\\.(dezlearn|dez)\\.(com|us)";
		String str1 = "www.dez.com";
		
		System.out.println(str1.matches(patt));

	}

}
