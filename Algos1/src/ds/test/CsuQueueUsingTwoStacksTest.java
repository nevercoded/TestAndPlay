package ds.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.CsuQueueUsingTwoStacks;

public class CsuQueueUsingTwoStacksTest {

	private CsuQueueUsingTwoStacks queue = null;
	
	@Before
	public void setUp() throws Exception {
		queue = new CsuQueueUsingTwoStacks();
	}

	@Test
	public void test() {
		
		assertTrue(queue.isEmpty());
		queue.enqueue("test1");
		queue.enqueue("test2");
		assertTrue(queue.dequeue().equals("test1"));
		assertTrue(queue.dequeue().equals("test2"));
		assertTrue(queue.isEmpty());
		
	}

}
