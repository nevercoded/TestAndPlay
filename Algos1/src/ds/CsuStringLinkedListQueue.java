package ds;

public class CsuStringLinkedListQueue implements IsuStringQueue {

	private class Node{
		String item;
		Node next;
	};
	private Node firstNode = null;
	private Node lastNode = null;
	
	@Override
	public String dequeue() {
		// remove item from the queue
		if(firstNode == null)
			return null;
		
		Node newFirstNode = firstNode.next;
		String item = firstNode.item;
		firstNode.next = null;
		firstNode = newFirstNode;
		return item;
	}

	@Override
	public void enqueue(String item) {
		if(lastNode == null){
			// should be firstNode
			firstNode = new Node();
			firstNode.item = item;
			firstNode.next = null;
			lastNode = firstNode;			
		}else{
			// Add to the last Node
			Node newNode = new Node();
			newNode.item = item;
			newNode.next = null;
			lastNode.next = newNode;
			lastNode = newNode;
		}

	}

	@Override
	public boolean isEmpty() {
		return firstNode==null;
	}

}
