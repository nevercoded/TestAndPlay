package sort;

import java.util.Random;

public class CsuShuffle {
	
	// Shuffle list of objects
	public void shuffle(Object[] list){
		
		for(int i=0;i<list.length;i++){
			Random rand = new Random();
			int random = rand.nextInt(i+1);
			swap(list,i,random);
		}
	}
	
	private void swap(Object[] list, int x, int y){
		Object temp=list[x];
		list[x]=list[y];
		list[y]=temp;
	}

}
