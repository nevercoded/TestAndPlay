package sort.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sort.CsuData;
import sort.CsuMergeSort;
import sort.IsuSort;

public class CsuMergeSortTest {

	private IsuSort mergeSort = null;
	private CsuData[] data = null;
	
	@Before
	public void setUp() throws Exception {
		mergeSort = new CsuMergeSort();
		data = new CsuData[10];
		
		for(int i=0;i<10;i++){
			data[i] = new CsuData("test"+(9-i),(9-i));
		}
	}

	@Test
	public void testSort() {
		mergeSort.sort(data);
		for(int i=0;i<10;i++){			
			assertTrue(data[i].getAge()==i);
			System.out.println(data[i].getAge());
		}
	}

	
	// 0+9/2 = (0,4),(5,9) = 0+4/2 {(0,2),(3,4)} 14/2 = {(5,7)(8,9)}
	//2/2 = {(0,1)(2,2)} 3+4/2 {(3,3)(4,4)} 5+7/2 = {(5,6)(7,7)} 8+9/2 = {(8,8)(9,9)}
	
}
