package com.training.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsEqual;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TeamNameFinderTest {
	
	TeamNameFinder testObj ;
	
	@Before
	public void setUp() {
		testObj = new TeamNameFinder();
		System.out.println("Running my test case");
	}
	
	
	@Test
	public void verifySpartansTeam() {
		String result = testObj.findTeamName("Naresh");
		assertEquals(result, "Spartans");
	}
	
	@Test
	public void verifyNotFromSpartansTeam() {
		String result = testObj.findTeamName("Naveen");
		assertEquals(result, "Panthers");
	}
	
	@Test(expected = Exception.class)
	@Ignore
	public void verifyException() throws Exception {
		testObj.throwExceptionsForMe();
	}
	
	@After
	public void dummy() {
		System.out.println("Test compelted");
	}

}
