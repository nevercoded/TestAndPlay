package ds.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.CsuStringLinkedListQueue;
import ds.IsuStringQueue;

public class CsuStringLinkedListQueueTest {

	IsuStringQueue queue = null;
	
	@Before
	public void setUp() throws Exception {
		queue = new CsuStringLinkedListQueue();
	}

	@Test
	public void testDequeueAndEnqueue() {
		
		assertTrue(queue.isEmpty());
		queue.enqueue("test1");
		queue.enqueue("test2");
		assertTrue(queue.dequeue().equals("test1"));
		assertTrue(queue.dequeue().equals("test2"));
		assertTrue(queue.isEmpty());
		
	}

}
