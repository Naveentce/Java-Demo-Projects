package service;

public class SampleRestService implements SampleInterface {

	public String executeRequest(String string) {
		return string != null ? "Success" : "Failure";
	}

}
