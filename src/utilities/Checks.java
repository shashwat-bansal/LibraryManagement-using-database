package utilities;

import java.util.regex.Pattern;

public class Checks {
	
	public static boolean IsValidName(String input){
		if(Pattern.matches("(([a-zA-Z].\\s)?([A-Za-z]+)\\s?)+([A-Z]'([A-Za-z]+))?",input))
			return true;
		return false;
		
	}

	public static boolean IsValidDate(String input) {
		if(Pattern.matches("^(0?[1-9]|1[0-2])[\\/](0?[1-9]|[12]\\d|3[01])[\\/](19|20)\\d{2}$",input))
			return true;
		return false;
		
	}

}
