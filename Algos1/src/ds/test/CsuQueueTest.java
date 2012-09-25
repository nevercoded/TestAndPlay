package ds.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ds.CsuQueue;

public class CsuQueueTest {

	private CsuQueue<String> strQ = null;
	private CsuQueue<Integer> intQ = null;
	@Before
	public void setUp() throws Exception {
		strQ = new CsuQueue<String>();
		intQ = new CsuQueue<Integer>();
	}

	@Test
	public void testWithString() {
		assertTrue(strQ.isEmpty());
		strQ.enqueue("test1");
		strQ.enqueue("test2");
		assertTrue(strQ.dequeue().equals("test1"));
		assertTrue(strQ.dequeue().equals("test2"));
		assertTrue(strQ.isEmpty());
	}
	
	@Test
	public void testWithInteger() {
		assertTrue(intQ.isEmpty());
		intQ.enqueue(100);
		intQ.enqueue(200);
		assertTrue(intQ.dequeue().equals(100));
		assertTrue(intQ.dequeue().equals(200));
		assertTrue(intQ.isEmpty());
	}

}
