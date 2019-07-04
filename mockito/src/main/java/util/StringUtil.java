package util;

public class StringUtil {

	public boolean isStartingWithAlphabet(String password) {
		return Character.isAlphabetic(password.charAt(0));
	}
}


 class StringUtilExt extends StringUtil {
	
	 // semantics....when & Then
	 @Override
	 public boolean isStartingWithAlphabet(String password) {
		 return false;
	 }
}
