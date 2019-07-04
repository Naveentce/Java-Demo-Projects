package valdiators;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import util.StringUtil;
import validators.PasswordValidator;

@RunWith(MockitoJUnitRunner.class)
public class PasswordValidatorTest {

	@InjectMocks
	private PasswordValidator passwordChecker;
	
	@Mock
	private StringUtil util;

	/*Acceptance Criteria
	
	1. Your password should be minimum of length 8 and maximum of 20
	2. It should start with alphabet
	3. Should contain atleast one number
	4. Should contain atleast one special character (@,&,$,!)
	5. No spaces
	6. If invalid, throw custom exception*/
	
	@Test
	public void passwordIsNotEmptyReturnTrue() throws Exception {
		Boolean result = passwordChecker.isValid("mypassword123");
		Mockito.when(util.isStartingWithAlphabet(Mockito.anyString())).thenReturn(true);
		Assert.assertEquals(true, result);
	}
	
	@Test(expected =Exception.class)
	public void passwordIsEmptyThrowException() throws Exception {
		passwordChecker.isValid("");
	}
	
	@Test(expected =Exception.class)
	public void passwordWithInsufficientLengthThrowException() throws Exception {
		passwordChecker.isValid("min");
	}
	
	@Test(expected =Exception.class)
	public void passwordWithSurplusLengthThrowException() throws Exception {
		passwordChecker.isValid("maxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}
	
	@Test(expected =Exception.class)
	public void passwordStartsWithNonalphabetThrowException() throws Exception {
		passwordChecker.isValid("123456789AA");
	}
	
	@Test
	public void passwordStartsWithAlphabetReturnTrue() throws Exception {
		Boolean result = passwordChecker.isValid("A23456789AA");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void passwordContainsAtleastOneNumberReturnTrue() throws Exception {
		Mockito.when(util.isStartingWithAlphabet(Mockito.anyString())).thenReturn(true);
		Boolean result = passwordChecker.isValid("A2BCDEFGAA");
		Assert.assertEquals(true, result);
	}
	
	@Test(expected =Exception.class)
	public void passwordContainsNoNumberThrowException() throws Exception {
		passwordChecker.isValid("ABBBCDEFGAA");
	}
	
	@Test(expected =Exception.class)
	public void passwordContainsSpacesThrowException() throws Exception {
		passwordChecker.isValid("ABB 3BCDEFGAA");
	}
}
