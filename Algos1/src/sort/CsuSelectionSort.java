package sort;

public class CsuSelectionSort implements IsuSort{

	@Override
	public void sort(Comparable[] list) {
		
		for(int i=0;i<list.length;i++){
			int min = i;
			for(int j=i+1;j<list.length;j++){
				if(list[j].compareTo(list[min])<0){
					min = j;					
				}
			}
			swap(list,min,i);
		}
		
	}
	
	private void swap(Comparable[] a, int x,int y){
		Comparable swap = a[x];
		a[x] = a[y];
		a[y] = swap;
	}

}
