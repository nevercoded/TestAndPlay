package ds.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.CsuMaxMinStackWithTwoStacks;

public class CsuMaxMinStackWithTwoStacksTest {

	private CsuMaxMinStackWithTwoStacks stack = null;
	
	@Before
	public void setUp() throws Exception {
		stack = new CsuMaxMinStackWithTwoStacks();		
	}

	@Test
	public void test() {
		stack.push(100);
		assertTrue(stack.getMax().equals(100));
		stack.push(200);
		assertTrue(stack.getMax().equals(200));
		stack.push(100);
		assertTrue(stack.getMax().equals(200));
		stack.pop();
		assertTrue(stack.getMax().equals(200));
		
	}

}
