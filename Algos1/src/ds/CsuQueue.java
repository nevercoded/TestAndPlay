package ds;

import java.util.Iterator;

public class CsuQueue<Item> implements Iterable<Item>{
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

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>{

		private Node current = firstNode;
		
		@Override
		public boolean hasNext() {
			return current!=null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;			
			return item;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
