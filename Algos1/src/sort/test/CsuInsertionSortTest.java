package sort.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sort.CsuData;
import sort.CsuInsertionSort;
import sort.IsuSort;

public class CsuInsertionSortTest {

	private IsuSort insertionSort = null;
	private CsuData[] data = null;
	
	
	@Before
	public void setUp() throws Exception {
		insertionSort = new CsuInsertionSort();
		data = new CsuData[10];
		
		for(int i=0;i<10;i++){
			data[i] = new CsuData("test"+(9-i),(9-i));
		}
	}

	@Test
	public void testSort() {
		insertionSort.sort(data);
		for(int i=0;i<10;i++){
			assertTrue(data[i].getAge()==i);
		}
	}

}
