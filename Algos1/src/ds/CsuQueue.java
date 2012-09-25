package ds;

public class CsuQueue<Item> {
	private class Node{
		Item item;
		Node next;
	};
	private Node firstNode = null;
	private Node lastNode = null;
	
	public Item dequeue() {
		// remove item from the queue
		if(firstNode == null)
			return null;
		
		Node newFirstNode = firstNode.next;
		Item item = firstNode.item;
		firstNode.next = null;
		firstNode = newFirstNode;
		return item;
	}

	public void enqueue(Item item) {
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
	
	public boolean isEmpty() {
		return firstNode==null;
	}
}
