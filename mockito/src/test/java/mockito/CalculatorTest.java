package mockito;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
	
	@InjectMocks
	private Calculator calculator;
	
	private MathLoader mathLoader = mock(MathLoader.class);

	@Test
	//@Ignore
	public void add2Numbers() {
		Mockito.when(mathLoader.getSum(Mockito.anyLong(), Mockito.anyLong())).thenReturn(5l);
		//Mockito.when(mathLoader.getSum(Mockito.anyLong(), Mockito.anyLong())).thenCallRealMethod();
		Assert.assertEquals(5, calculator.add(2,3));
	}
	
	@Test
	//@Ignore
	public void subtract2Numbers() {
		//Mockito.when(mathLoader.getSum(Mockito.anyLong(), Mockito.anyLong())).thenCallRealMethod();
		Assert.assertEquals(2, calculator.subtract(5,3));
	}
}
