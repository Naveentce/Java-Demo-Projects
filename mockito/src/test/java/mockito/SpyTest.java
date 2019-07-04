package mockito;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class SpyTest {
	
	@Spy
	//@Mock
	DummyTestClass listSpy = new DummyTestClass(5);
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSpyReturnResults() throws Exception{
		listSpy.add();
		
		Mockito.verify(listSpy).add();
		org.junit.Assert.assertEquals(6, listSpy.getCount());
		
		
	}

}

	class DummyTestClass {
		
		int count;
		
		public DummyTestClass(int count) {
			super();
			this.count = count;
		}

		public void add() {
			count++;
			System.out.println("Called");
		}
		
		public int getCount() {
			return count;
		}
	}
