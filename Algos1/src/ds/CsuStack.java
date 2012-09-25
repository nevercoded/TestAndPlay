package ds;

import java.util.Iterator;

// Generic stack implementation.
public class CsuStack<Item> implements Iterable<Item> {
	
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
			// Not implementing it as it is usually risky
		}
		
	}

}
