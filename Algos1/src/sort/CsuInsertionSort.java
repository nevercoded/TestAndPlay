package sort;

public class CsuInsertionSort implements IsuSort{

	@Override
	public void sort(Comparable[] list) {
	
		for(int i=0;i<list.length;i++){
			Comparable item = list[i];
			for(int k=i;k>0;k--){
				if(list[k].compareTo(list[k-1])<0){
					swap(list,k,k-1);
				}
			}
		}		
	}
	
	private void swap(Comparable[] a, int x,int y){
		Comparable swap = a[x];
		a[x] = a[y];
		a[y] = swap;
	}

}
