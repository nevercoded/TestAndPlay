package ds.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.CsuMaxMinStack;

public class CsuMaxMinStackTest {

	private CsuMaxMinStack intStack = new CsuMaxMinStack(); 
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(intStack.isEmpty());
		intStack.push(100);
		assertTrue(intStack.getMax().equals(100));
		assertTrue(intStack.getMin().equals(100));
		intStack.push(200);
		assertTrue(intStack.getMax().equals(200));
		assertTrue(intStack.getMin().equals(100));
		
		assertTrue(intStack.pop().equals(200));
		assertTrue(intStack.pop().equals(100));
		assertTrue(intStack.isEmpty());		
	}

}
