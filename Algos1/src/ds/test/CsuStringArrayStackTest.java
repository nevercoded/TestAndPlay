package ds.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.CsuStringArrayStack;
import ds.IsuStringStack;

public class CsuStringArrayStackTest {

	public IsuStringStack stack = null;
	
	@Before
	public void setUp() throws Exception {
		stack = new CsuStringArrayStack();
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
	
	@Test
	public void testPop() {
		assertTrue(stack.isEmpty());
		for(int i=0;i<5;i++)
			stack.push("test"+i);
		
		for(int i=0;i<5;i++)
			assertTrue(stack.pop().equals("test"+(4-i)));

		assertTrue(stack.isEmpty());
	}
	

}
