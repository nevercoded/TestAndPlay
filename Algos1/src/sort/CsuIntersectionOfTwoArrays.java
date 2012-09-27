package sort;

public class CsuIntersectionOfTwoArrays {
	
	// Find the intersection of two int arrays.
	
	private Integer arr[] = null;
	
	public Integer[] findIntersection(Integer[] a, Integer[] b){
		
		int max = 0;
		if(a.length>b.length)max =a.length; else max=b.length;		
		arr = new Integer[max];
		
		IsuSort sorter = new CsuInsertionSort();
		// Sort both arrays
		sorter.sort(a);
		sorter.sort(b);
		
		//Find intersection.
		int aLen = 0;
		int bLen = 0;
		int arrLen=0;
		while(aLen < a.length && bLen < b.length){
			if(a[aLen] > b[bLen]){
				bLen++;
			}else if(a[aLen]==b[bLen]){
				//both are equal add to arr
				arr[arrLen++] = a[aLen];
				aLen++;
				bLen++;
			}else{
				aLen++;
			}
		}
		
		return arr;
		
	}
	

}
