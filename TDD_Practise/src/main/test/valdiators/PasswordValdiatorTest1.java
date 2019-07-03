package valdiators;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValdiatorTest1 {

	@Test
	public void verifyPasswordIsNotEmpty() {
		PasswordValdiator1 passwordValidator1 =  new PasswordValdiator1();
		boolean result = passwordValidator1.verify("Spartans");
		Assert.assertTrue(result);
	}
	
	@Test
	public void verifyPasswordIsEmpty() {
		PasswordValdiator1 passwordValidator1 =  new PasswordValdiator1();
		boolean result = passwordValidator1.verify("");
		Assert.assertFalse(result);
	}
	
	@Test
	public void verifyLength() {
		PasswordValdiator1 passwordValidator1 =  new PasswordValdiator1();
		boolean result = passwordValidator1.verify("1234");
		Assert.assertFalse(result);
	}
	
	@Test
	public void verifyMaxLength() {
		PasswordValdiator1 passwordValidator1 =  new PasswordValdiator1();
		boolean result = passwordValidator1.verify("123455y3453e45e73e43575754747732323jim5ji2mji");
		Assert.assertFalse(result);
	}
	
	@Test
	public void verifyFristCharacterIsAlphabet() {
		PasswordValdiator1 passwordValidator1 =  new PasswordValdiator1();
		boolean result = passwordValidator1.verify("12345678");
		Assert.assertFalse(result);
	}
}
