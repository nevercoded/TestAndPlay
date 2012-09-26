package ds;

public class CsuQueueUsingTwoStacks {

	private CsuStack<String> stackOne = new CsuStack<String>();
	private CsuStack<String> stackTwo = new CsuStack<String>();
	
	public void enqueue(String item){		
		// Push to stackOne
		stackOne.push(item);		
	}
	
	public String dequeue(){
		while(!stackOne.isEmpty()){
			stackTwo.push(stackOne.pop());
		}
		String item = stackTwo.pop();
		while(!stackTwo.isEmpty()){
			stackOne.push(stackTwo.pop());
		}
		return item;
	}
	
	public boolean isEmpty(){
		return stackOne.isEmpty();
	}
	
}
