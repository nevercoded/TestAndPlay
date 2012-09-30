package sort;

public class CsuMergeSort implements IsuSort{

	@Override
	public void sort(Comparable[] list) {		
		int low = 0;
		int high = list.length-1;
		sort(list,low,high);		
	}
	
	
	private static void sort(Comparable[] list,int low,int high){		
		if(high>low){
			
			int mid = high - ((high-low)/2);
			//System.out.println("("+low+ ","+mid + ","+high+")");
			sort(list,low,mid-1);
			sort(list,mid,high);
			merge(list,low,mid,high);
		}		

	}
	
	private static void merge(Comparable[] list,int low,int mid, int high){
		System.out.println("("+low+ ","+mid + ","+high+")");
		Comparable[] aux = new Comparable[high+1];
		// Copy the data 
		for(int i=0;i<high+1;i++){
			aux[i] = list[i];
		}		
		
		int index1= low;
		int index2= mid;
		
		for(int i=low;i<=high;i++){
			if(index1>mid){
				list[i] = aux[index2++];
				continue;
			}
			if(index2>high){
				list[i] = aux[index1++];
				continue;
			}
			if(aux[index1].compareTo(aux[index2])<0){				
				list[i] = aux[index1++];
			}else{
				list[i] = aux[index2++];
			}
		}
			
	}

}
