package sort.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sort.CsuIntersectionOfTwoArrays;

public class CsuIntersectionOfTwoArraysTest {

	private Integer[] arr1 = null;
	private Integer[] arr2 = null;
	
	@Before
	public void setUp() throws Exception {
		arr1 = new Integer[10];
		
		for(int i=0;i<arr1.length;i++){
			arr1[i] = i;
		}
		
		arr2 = new Integer[10];
		for(int i=0;i<arr2.length;i++){
			arr2[i] = i;
			if(i==4 || i==6)
				arr2[i] = 100;
			
		}
	}

	@Test
	public void testFindIntersection() {
		CsuIntersectionOfTwoArrays inter = new CsuIntersectionOfTwoArrays();
		Integer[] arr3 = inter.findIntersection(arr1, arr2);
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr3[i]);
		}
		
	}

}
