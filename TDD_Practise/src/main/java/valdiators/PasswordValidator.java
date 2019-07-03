package valdiators;

public class PasswordValidator {

	private static final String INVALID_FORMAT = "Invalid Password Format";
	private static final String NUMBER_REGEX = ".*\\d+.*";
	private static final int MIN_LENGTH = 8;
	private static final int MAX_LENGTH = 20;

	public Boolean isValid(String password) throws InvalidPasswordFormat {

		if (isEmpty(password) || isInvalidFormat(password))
			throw new InvalidPasswordFormat(INVALID_FORMAT);
		return Boolean.TRUE;

	}

	private boolean isInvalidFormat(String password) {
		return !(isValidLength(password) && isStartingWithAlphabet(password) && isContainingNumber(password)
				&& isContainingNoSpaces(password));
	}

	private boolean isEmpty(String password) {
		return password.isEmpty();
	}

	private boolean isValidLength(String password) {
		return password.length() > MIN_LENGTH && password.length() < MAX_LENGTH;
	}

	private boolean isStartingWithAlphabet(String password) {
		return Character.isAlphabetic(password.charAt(0));
	}

	private boolean isContainingNumber(String password) {
		return password.matches(NUMBER_REGEX);
	}

	private boolean isContainingNoSpaces(String password) {
		return !password.contains(" ");
	}
}
