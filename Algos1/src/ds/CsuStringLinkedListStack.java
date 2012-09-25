package ds;

public class CsuStringLinkedListStack implements IsuStringStack {

	private Node firstNode = null;
	
	private class Node{
		String item=null;
		Node next=null;
	}
	
	public void push(String item){
		
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
	
	public String pop(){
		if(firstNode==null){
			return null;
		}else{
			Node poppedNode = firstNode;
			firstNode = firstNode.next;
			return poppedNode.item;
		}
	}

	@Override
	public boolean isEmpty() {
		return firstNode==null;
	}
	
}
