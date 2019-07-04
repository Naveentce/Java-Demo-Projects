package controller;

import javax.inject.Inject;

import service.SampleInterface;

public class SampleRestController {
	
	@Inject
	SampleInterface restService;
	
	public String sampleServiceCall() {
		
		 return restService.executeRequest("Sample input");
		
	}

}
