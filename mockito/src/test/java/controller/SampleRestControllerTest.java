package controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import service.SampleRestService;

@RunWith(MockitoJUnitRunner.class)
public class SampleRestControllerTest {
	
	@InjectMocks
	public SampleRestController sampleController;
	
	@Mock
	public SampleRestService restService;

	@Test
	public void testSampleServiceCall() throws Exception {
		
		Mockito.when(restService.executeRequest(Mockito.anyString())).thenReturn("test");
		String result = sampleController.sampleServiceCall();
		
	}

}
