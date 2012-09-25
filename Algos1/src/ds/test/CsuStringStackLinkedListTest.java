package ds.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.CsuStringLinkedListStack;
import ds.IsuStringStack;

public class CsuStringStackLinkedListTest {

	public IsuStringStack stack = null;
	
	@Before
	public void setUp() throws Exception {
		stack = new CsuStringLinkedListStack();		
	}

	@Test
	public void testPushAndPop() {
		
		assertTrue(stack.isEmpty());
		stack.push("test1");
		stack.push("test2");
		assertTrue(stack.pop().equals("test2"));
		assertTrue(stack.pop().equals("test1"));
		assertTrue(stack.isEmpty());
	}	
}
