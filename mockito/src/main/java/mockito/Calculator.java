package mockito;

import javax.inject.Inject;

public class Calculator {
	
	
	  @Inject private MathLoader mathLoader;
	 

	public long add(long firstNumber, long secondNumber) {
		return mathLoader.getSum(firstNumber, secondNumber);
	}


	public long subtract(long firstNumber, long secondNumber) {
		return firstNumber - secondNumber;
	}

}
