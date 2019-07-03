package valdiators;

public class PasswordValdiator1 {

	public boolean verify(String password) {
		if(!password.isEmpty()) {
			int passwordLength = password.length();
			if(passwordLength >= 8 && passwordLength <=15)
				
				if(password.matches("^[A-Z]"))
									return false;
			else
				return false;
		}
		return false;
	}

}
