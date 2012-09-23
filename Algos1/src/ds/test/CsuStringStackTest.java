package ds.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.CsuStringStack;
import ds.IsuStringStack;

public class CsuStringStackTest {

	public IsuStringStack stack = null;
	
	@Before
	public void setUp() throws Exception {
		stack = new CsuStringStack();		
	}

	@Test
	public void testPushAndPop() {
		
		assert(stack.isEmpty());
		stack.push("test1");
		stack.push("test2");
		assert(stack.pop().equals("test2"));
		assert(stack.pop().equals("test1"));
		assert(stack.pop().isEmpty());
		assertFalse(stack.isEmpty());
	}	
}
