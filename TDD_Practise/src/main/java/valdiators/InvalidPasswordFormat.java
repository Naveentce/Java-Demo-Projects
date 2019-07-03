package valdiators;

class InvalidPasswordFormat extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public InvalidPasswordFormat(String message) {
		super(message);
	}
	
}