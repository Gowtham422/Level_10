package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str1 = "Your total cost is $2400997.999009 after $000.90009 sale discount and $12.09 coupon1 discount and $01.010 coupon2 discount";
		
		String patt = "\\${1}\\d{1,}\\.\\d{1,}";
		
		Pattern p = Pattern.compile(patt);
		
		Matcher m = p.matcher(str1);
		
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
