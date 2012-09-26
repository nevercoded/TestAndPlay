package ds;

public class CsuMaxMinStack {
	
private Node firstNode = null;
	
	private class Node{
		Integer item=null;
		Node next=null;
		Integer maxSoFar=null;
		Integer minSoFar=null;
	}
	
	public void push(Integer item){
		
		if(firstNode == null){
			firstNode = new Node();
			firstNode.item = item;
			firstNode.next = null;
			// Set max and min to item as its only one element
			firstNode.maxSoFar = item;
			firstNode.minSoFar = item;
		}else{
			Node newNode = new Node();
			newNode.item = item;
			newNode.next = firstNode;
			
			//Create new max and min using the top item in the stack
			if(item > firstNode.maxSoFar)
				newNode.maxSoFar = item;
			else
				newNode.maxSoFar = firstNode.maxSoFar;
			if(item < firstNode.maxSoFar)
				newNode.minSoFar = item;
			else
				newNode.minSoFar = firstNode.minSoFar;
			
			firstNode = newNode;
		}
	}
	
	public Integer getMax(){
		if(firstNode==null)
			return null;
		else
			return firstNode.maxSoFar;
	}
	
	public Integer getMin(){
		if(firstNode==null)
			return null;
		else
			return firstNode.minSoFar;
	}
	
	public Integer pop(){
		if(firstNode==null){
			return null;
		}else{
			Node poppedNode = firstNode;		
			firstNode = firstNode.next;
			return poppedNode.item;
		}
	}

	public boolean isEmpty() {
		return firstNode==null;
	}

}
