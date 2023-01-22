package hw1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	private String regex = "^(0|[1-9]\\d*)([.]\\d+)?";
	private String value;
	
	public RegEx(String value) {
		super();
		this.value = value;
	}
	
	public boolean checkValue (){
		Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(value);
        boolean a = matcher.matches();
        return a;
	}
}
