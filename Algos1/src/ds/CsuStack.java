package ds;

// Generic stack implementation.
public class CsuStack<Item> {
	
	private Node firstNode = null;
	
	private class Node{
		Item item=null;
		Node next=null;
	}
	
	public void push(Item item){
		
		if(firstNode == null){
			firstNode = new Node();
			firstNode.item = item;
			firstNode.next = null;
		}else{
			Node newNode = new Node();
			newNode.item = item;
			newNode.next = firstNode;
			firstNode = newNode;			
		}
	}
	
	public Item pop(){
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
