package sort.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sort.CsuData;
import sort.CsuSelectionSort;
import sort.IsuSort;

public class CsuSelectionSortTest {

	private IsuSort selectionSort = null;
	private CsuData[] data = null;
	
	@Before
	public void setUp() throws Exception {
		selectionSort = new CsuSelectionSort();
		data = new CsuData[10];
		
		for(int i=0;i<10;i++){
			data[i] = new CsuData("test"+(9-i),(9-i));
		}
	}

	@Test
	public void testSort() {
		selectionSort.sort(data);
		for(int i=0;i<10;i++){
			assertTrue(data[i].getAge()==i);
		}
	}

}
