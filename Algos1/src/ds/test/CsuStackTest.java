package ds.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.CsuStack;

public class CsuStackTest {

	private CsuStack<String> strStack = null;
	private CsuStack<Integer> intStack = null;
	
	@Before
	public void setUp() throws Exception {
		strStack = new CsuStack<String>();
		intStack = new CsuStack<Integer>();
	}

	@Test
	public void testWithString() {
		assertTrue(strStack.isEmpty());
		strStack.push("test1");
		strStack.push("test2");
		assertTrue(strStack.pop().equals("test2"));
		assertTrue(strStack.pop().equals("test1"));
		assertTrue(strStack.isEmpty());		
	}
	

	@Test
	public void testWithInteger() {
		assertTrue(intStack.isEmpty());
		intStack.push(100);
		intStack.push(200);
		assertTrue(intStack.pop().equals(200));
		assertTrue(intStack.pop().equals(100));
		assertTrue(intStack.isEmpty());		
	}

}
