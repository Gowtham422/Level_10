package regex;

public class Quantifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String patt = "ab(xyz){2,}";
		
		String str1 = "abxyzxyzxyzxyzxyzxyz";
		
		System.out.println(str1.matches(patt));


	}

}
